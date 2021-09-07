/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srtx.util;

/**
 *
 * @author saulobt
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class Format {

    static SimpleDateFormat dfFormato;
    static Date dData1;
    static Date dData2;
    static String sResultado;

    public final static String DiferencaEntreDatas(String Data1, String Data2) {

        dfFormato = new SimpleDateFormat("yyyy/MM/dd");
        try {
            dData1 = dfFormato.parse(Data1);
            dData2 = dfFormato.parse(Data2);
            sResultado = "" + (dData2.getTime() - dData1.getTime()) / 86400000L;
            return sResultado;
        } catch (Exception err) {
            System.out.println(err);
            return sResultado;
        }
    }

    public final static String AredondaNumero(double Number) {
        return String.format("%.2f", Number);
    }

    public final static String Format(String Valor, String Formato) {
        NumberFormat formato = new DecimalFormat(Formato);
        return formato.format(Long.parseLong(Valor));
    }
    
    public static String FormatNumber(double number){
        double prestacao = 265132.0;
        DecimalFormat df = new DecimalFormat("0.000###");
        String dx = df.format(number);
        //System.out.println(dx);
        return dx;
    }
    
    public static String FormatNumber2(double number){
        double prestacao = 265132.0;
        DecimalFormat df = new DecimalFormat("00.00##");
        String dx = df.format(number);
        //System.out.println(dx);
        return dx;
    }
    public static String FormatNumber3(double number){
        double prestacao = 265132.0;
        DecimalFormat df = new DecimalFormat("0.00##");
        String dx = df.format(number);
        //System.out.println(dx);
        return dx;
    }
    public static double FormatNumber4(double number){
        double prestacao = 265132.0;
        DecimalFormat df = new DecimalFormat("0.00##");
        String dx = df.format(number);
        //System.out.println(dx);
        return Double.parseDouble(dx);
    }
    
    public static String FormatNumberSemZero(double number){
        double prestacao = 265132.0;
        DecimalFormat df = new DecimalFormat("0.###");
        String dx = df.format(number);
        //System.out.println(dx);
        return dx;
    }

    /**
     * <h2>Metodo statico FormatText</h2>
     * Metodo para Formatação de String
     * <br> Este metodo consiste em passar para ele uma String e um Valor inteiro, se a quantidade de caracteres for menor do que o valor passado no parametro ele retorna a string original completando com espaços em branco. Ex:
     * <br><br><ul><li>System.out.println(Format.FormatText("Saulo Barbosa Tupinamba", 50));</li></ul>
     * <br>Resultado: Saulo Barbosa Tupinambá___________________________acresenta espaço no final!
     * <br><br><ul><li>System.out.println(Format.FormatText("Saulo Barbosa Tupinamba", 15));</li></ul>
     * <br>Resultado: Saulo Barbosa T
     * @author Saulo Barbosa Tupinambá
     * @author HDI - HelpDesk Informática
     *
     * @version: 1.0.0.1 7/11/2009 11:12:15
     *
     */
    public static final String FormatText(String sString, int iTamanhoString) {

        String sStringFaltante = "";
        String sResultado = "";

        int iTamanhoStringOriginal = sString.length();
        System.out.println(iTamanhoStringOriginal);
        int iTamanhoFaltante = 0;

        if (iTamanhoStringOriginal < iTamanhoString) {
            iTamanhoFaltante = iTamanhoString - iTamanhoStringOriginal;
            System.out.println(iTamanhoFaltante);
            for (int x = 0; x < iTamanhoFaltante; x++) {
                sStringFaltante += " ";
            }
            sResultado = sString + sStringFaltante;

        } else {
            sResultado = sString.substring(0, iTamanhoString);
        }

        return sResultado;
    }
    /**  
     * Locale Brasileiro  
     */
    private static final Locale BRAZIL = new Locale("pt", "BR");
    /**  
     * Sï¿½mbolos especificos do Real Brasileiro  
     */
    private static final DecimalFormatSymbols REAL = new DecimalFormatSymbols(BRAZIL);
    /**  
     * Mascara de dinheiro para Real Brasileiro  
     */
    public static final DecimalFormat DINHEIRO_REAL = new DecimalFormat("###,###,##0.00", REAL);

    public static String mascaraDinheiro(String valor, DecimalFormat moeda) {
        return moeda.format(Double.parseDouble(valor));
    }

    /**  
     * Remove os 0 [zeros] a esquerda do inicio de um codigo ean pois a C5 no banco 
     * salva os codigos como campo inteiro e nao varchar ou texto. 
     */
    public static String formatEAN(String ean) {
        String caracter = ean.substring(0, 1);
        //System.out.println("caracter:" + caracter);
        if (caracter.equals("0")) {
            caracter = ean.substring(1, ean.length());
            try {
                Long cod = new Long(caracter);
                caracter = cod.toString();
            } catch (NumberFormatException e) {
            }
        } else {
            caracter = ean;
        }

        //System.out.println("caracterdepois:" + caracter);
        return caracter;
    }
    
    public static String convetSize(long size){
        ConvertSize conv = new ConvertSize();
        String r = conv.converter(size);
        return r;
    }

    private static class ConvertSize {
        //private String[] array = {"B", "KB", "MB", "GB", "TB"};
        public String converter(long valor) {
            int potencia = 0;
            int proxima = 0;
            boolean cond1;
            boolean cond2;
            proxima = potencia + 1;
            cond1 = (Math.pow(2, potencia * 10) <= valor);
            cond2 = (valor < Math.pow(2, proxima * 10));
            potencia++;
            while (!(cond1 && cond2)) {
                proxima = potencia + 1;
                cond1 = (Math.pow(2, potencia * 10) <= valor);
                cond2 = (valor < Math.pow(2, proxima * 10));
                potencia++;
            }
            potencia--;
            //return (valor / Math.pow(2, potencia * 10) + " " + array[potencia]);
            String[] powerOfByte= {"B","KB","MB","GB","TB"}; 
            DecimalFormat myFormatter = new DecimalFormat("0");  
            return myFormatter.format(valor/Math.pow(2,potencia*10))+" "+powerOfByte[potencia];  
        }
    }
}

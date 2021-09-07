/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srtx.util;

/**
 *
 * @author saulobt
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class FormataTexto extends PlainDocument {

    private int iMaxLength = 0;
    private char tipo;
    Pattern texto;

    /**
     * <h2>Formata Texto em JTextFild</h2>
     * <br> passar um desses parametros para formatar o campo, Ex:
     * <br><br><ul><li>A = TUDO</li>
     * <br> <li>B - SOMENTE LETRAS E NÚMEROS EM MAIÚSCULO</li>
     * <br> <li>C - somente letras e números em minúsculo</li>
     * <br> <li>D - SOMENTE NÚMEROS</li></ul>
     * <br> <li>E - SOMENTE LETRAS MAIÚSCULO</li></ul>
     * <br> <li>F - SOMENTE LETRAS minúsculo</li></ul>
     *
     * @author Saulo Barbosa Tupinambá
     * @fonte: guj.com.br
     * @version: 1.0.0.1 18/09/2011 20:41:52
     *
     */
    public FormataTexto(int maxlen, char tp) {
        super();
        iMaxLength = maxlen;
        tipo = tp;
    }

    public String formatar(String entrada, Integer valor) {
        // 1 - somente letras e números  
        // 2 - somente numeros  
        // 3 - somente letras  

        if (valor == 1) {
            texto = Pattern.compile("[0-9a-z ]", Pattern.CASE_INSENSITIVE);
        } else if (valor == 2) {
            texto = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
        } else if (valor == 3) {
            texto = Pattern.compile("[a-z ]", Pattern.CASE_INSENSITIVE);
        } else if (valor == 4) {
            texto = Pattern.compile("[0-9.]", Pattern.CASE_INSENSITIVE);
        } else if (valor == 5) {
            texto = Pattern.compile("[0-9a-z ;]", Pattern.CASE_INSENSITIVE);
        } else if (valor == 6) {
            texto = Pattern.compile("[0-9a-z áàÁÀãéÃÉâêÂÊíôÍÔóúÓÚçÕÇ-]", Pattern.CASE_INSENSITIVE);
        } 

        Matcher encaixe = texto.matcher(entrada);
        StringBuffer saida = new StringBuffer();
        while (encaixe.find()) {
            saida.append(encaixe.group());
        }
        return saida.toString();
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }

        boolean ok = true;

        if (iMaxLength <= 0) {// aceitara qualquer no. de caracteres  
            super.insertString(offset, str, attr);
            return;
        }

        // A = TUDO  
        // B - SOMENTE LETRAS E NÚMEROS EM MAIÚSCULO  
        // C - somente letras e números em minúsculo  
        // D - SOMENTE NÚMEROS  
        // E - SOMENTE LETRAS MAIÚSCULO  
        // F - SOMENTE LETRAS minúsculo
        // G - SOMENTE NÚMEROS FORMATO 1.256.125
        // H - SOMENTE LETRAS E NÚMEROS EM MAIÚSCULO + ;
        // I - SOMENTE LETRAS E NÚMEROS EM MAIÚSCULO + Palavras Acentuadas
        // I - TUDO SOMENTE EM MAIÚSCULO + Palavras Acentuadas
        switch (tipo) {
            case 'B':
                str = formatar(str.toUpperCase(), 1);
                break;
            case 'C':
                str = formatar(str.toLowerCase(), 1);
                break;
            case 'D':
                str = formatar(str, 2);
                break;
            case 'E':
                str = formatar(str.toUpperCase(), 3);
                break;
            case 'F':
                str = formatar(str.toLowerCase(), 3);
                break;
            case 'G':
                str = formatar(str, 4);
                break;
            case 'H':
                str = formatar(str.toUpperCase(), 5);
                break;
            case 'I':
                str = formatar(str, 6);
                break;
            case 'J':
                str = str.toUpperCase();
                break;
        }

        int ilen = (getLength() + str.length());

        if (ilen <= iMaxLength) // se o comprimento final for menor...  
        {
            super.insertString(offset, str, attr); // aceita str  
        } else {
            if (getLength() == iMaxLength) {
                return; // nada a fazer  
            }
            String newStr = str.substring(0, (iMaxLength - getLength()));

            super.insertString(offset, newStr, attr);
        }
    }
}

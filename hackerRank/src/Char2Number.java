
/**
 * @author Kelvin
 * Retornar a posição da letra no alfabeto
 * Ignorar pontuações
 * Utilizando alfabeto sem caracteres especiais
 */
public class Char2Number {

    // Complete the encodeString function below.
    public String encodeString(String S) {
        String str = S.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (Character c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                int ch = c.hashCode() - 96;
                sb.append(ch).append(" ");
            }
        }
//        System.out.print(sb.toString());
        return sb.toString().trim();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String S = "The sunset sets at twelve o' clock.";
//        System.out.println(encodeString(S));
    }

}

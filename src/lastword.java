public class lastword {
    public static void main(String[] args) {
        String s = "   i am your baby   ";
        s = s.trim(); //Remover espaços do começo e fim
        String[] words = s.split(" "); //separa as palavras
        String last = words[words.length - 2];
        System.out.println(last.length());

        for (String p : words) {
            System.out.println(p);
        }
    }
}
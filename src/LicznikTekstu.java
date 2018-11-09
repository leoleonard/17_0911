public class LicznikTekstu {
    public static String[] licz(String tekst) {

        String tekst1 = tekst.trim();

        while (tekst1.contains("  ")) {
            tekst1 = tekst1.replace("  ", " ");
        }

        System.out.println("tekst po zmianach" + tekst1);
        int liczbaSlow = tekst1.length() - (tekst1.replace(" ", "")).length() + 1;
        int liczbaZnakow = tekst1.length();
        int liczbaZnakowBezSpacji = (tekst1.replace(" ", "")).length();
        boolean czyPal = czyPalindrom(tekst);



        String[] tabela = {String.valueOf(liczbaSlow), String.valueOf(liczbaZnakow), String.valueOf(liczbaZnakowBezSpacji), String.valueOf(czyPal)};
        return tabela;
    }



    private static boolean czyPalindrom(String tekst) {
        int check = 0;
        for (int i = 0; i < tekst.length() - 1; i++) {
            if (!tekst.substring(i, i + 1).equals(tekst.substring(tekst.length() - i - 1, tekst.length() - i))) {
                return false;
            }
        }
        return true;
    }
}

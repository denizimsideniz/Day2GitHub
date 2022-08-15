public class Day2GitGitHub {
    /*
    1-) git init ---> Local repo olusturmak icin yani .git ileklasorumuzun icindeki dosyalari
        ilisilendirmek icin kullanilir.

    2-) git add . ---> Working space'den (yani yerel) dosyalarimi staging area'ya (yani commitlemek icin beklenen yer)
        gonderir.

    3-) git status ---> Working space'deki ve staging area'daki durumu gosterir.

    4-) git commit -m "mesaj" ---> Staging are'dan commit stora'a dosyalarimi gondermek icin kullanilir
        (commit yani version yani surum olusturmus olurum)

    5-) git push ---> Uzak repo'ya (yani remota - GitHub) gondermek icin kullandigimiz code.
        Yalniz git push komutunu direk kullanmak istersek 1 kez ;
                git remote add origin -adress-
                git push -u origin master
        Not: Yukaridaki iki komutu tek seferde kullandiktan sonra ikinci commit'lerim icin sadece git push kullaniriz.
     */
    public static void main(String[] args) {
        System.out.println("GitHub'i da ogrendim");
    }
}

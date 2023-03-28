public class Main {
    public static void main(String[] args) {
         //Üç sayıyı karşılaştırma
        int a=10,b=15,c=5;
        if((a<b)&&(a<c)){
            System.out.println("A en küçüktür");
        }
        if ((b<a)&&(b<c)){
            System.out.println("B en küçüktür");
        }
        else {
            System.out.println("C en küçüktür");
        }
    }
}

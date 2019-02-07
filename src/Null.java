public class Null {

    static String str = null;

    public static void main(String[] args){
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("ヌルポが発生しました");
            System.out.println(e.getMessage());
        }

    }

}

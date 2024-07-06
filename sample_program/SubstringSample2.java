public class SubstringSample2 {
    public static void main(String[] args) {
        String str = "壱２34伍６７89０";
        System.out.println("文字列の3文字目から7文字目を取り出す -> "+str.substring(2,7));
        System.out.println("文字列の3文字目から3も自分を取り出す -> "+ str.substring(2, 2+3));
    }
}

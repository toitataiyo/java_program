public class SubstringSample3 {
    public static void main(String[] args) {
        String str = "壱２34伍６７89０";
        System.out.println("文字列の6文字目から最後までを取り出す -> "
                           +str.substring(6-1));
        System.out.println("文字列の後ろ3も自分を取り出す -> "
                            + str.substring(str.length()-3));
    }
}

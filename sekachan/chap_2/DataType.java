public class DataType {
    public static void main(String[] args) {
        int month = 12;
        int day = 29;
        float weight = 63.0f;
        double height = 168.5;
        char bloodType = 'A';

        String name = "戸板";

        System.out.println("こんにちは!"+name+"です。");
        System.out.println("身長は"+height+"cm, 体重は"+weight+"kg, ");
        System.out.println("誕生日は"+month+"月"+day+"日、");
        System.out.println("血液型は"+bloodType+"型です。");
        System.out.println("チャンネル登録や拡散よろしくお願いします!");
    }
}

/*
データ型 : データの種類
基本データ型 : 整数、小数、文字、真偽値
参照型 ; 文字列、配列

整数 ; byte(8), short(16), int(32), long(64)
小数 ; float(32), double(64)
文字 ; char(16)
真偽値 ; boolean

参照型 (文字列 ; String)
String name = "戸板"
データ自体はメモリ上の別の場所に置かれて
そのアドレスの値(参照値)が変数に入る
 */
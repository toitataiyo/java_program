public class Cast {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        double rate = 0.08;
        int amount;

        amount = (int)(price*(1+rate));
        System.out.println("税込金額; "+amount+"円");
    }    
}

/*基本データ型の型変換
数値同士の演算や代入をするときに、データ型の変換が
自動で行われる : 表現できる値の幅が小 → 大
キャストで明示する : 表現できる値の幅が大 → 小
小
byte
short
int
long
float
double
大

int i;
double d;
d = i;
i = (int)d; ←大から小なのでキャストが必要
*/
public class Branch1 {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        double rate = 0.10;
        int discount, amount;

        if(price>=3000){
            discount = 300;
        } else {
            discount = 0;
        }

        amount = (int)((price-discount)*(1+rate));
        System.out.println("値引き金額 ; "+discount+"円");
        System.out.println("税込金額 : "+amount+"円");
    }
}

/* 
構造化プログラミング
下の三つの構造を組み合わせてプログラムを書くこと
プログラムがわかりやすくなる
1. 順次進行
2. 分岐
3. 繰り返し

if文
if(条件式){
    処理1
} else{
    処理2
}

どちらかの処理しか実行されない
else以降は省略可能
処理が一つの時は{}を省略可能

else-if文
if(条件式){
    処理1
} else if(条件式2){
    処理2
} else ...

switch文
switch文の式はbyte, short, int, charのみ
式の値によって処理の開始位置が決まる
breakは{}を抜ける
switch(式){
    case 値1:  ←これコロン!!!
    処理1
    break;
    case 値2:
    処理2
    break;
    default:
    処理3
}
*/
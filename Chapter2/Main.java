public class Main {
  public static void main(String[] args){
    int a;
    int b;
    a = 20;
    b = a + 5;
    System.out.println(a);
    System.out.println(b);
  }
}

/*
a,b,5...operand(被演算子)
+,=...operator(演算子)
literal(リテラル)...具体的な値
0x...16進数
0...8進数
0b...2進数
任意の位置に_を入れられる
*/

/*
エスケープシーケンス
¥"..."
¥'...'
¥¥...¥
¥n...改行
*/

//エスケープシーケンスを使用しないとエラーになる例
public class Main {
  public static void main(String[] args){
    System.out.println("私の好きな記号は二重引用符（"）です");
  }
}

//エスケープシーケンスを使用した場合
public class Main {
  public static void main(String[] args){
    System.out.println("私の好きな記号は二重引用符（¥"）です");
  }
}

/*
式の評価(evaluation)
結合規則...演算子ごとに決められた方向
・算術演算子
＋,-,*,/,%...左から右
・文字列結合演算子
+...左から右
・代入演算子（代入は基本的に最後）
=,+=,-=,*=,/=,%=,+=...右から左
・インクリメント/デクリメント演算子(優先順位最高)
++,--...左から右
*/

public class Main {
  public static void main(String[] args){
    int a;
    a = 100;
    a++; //aの内容が１増える
    System.out.println(a);
  }
}

//++,--を他の演算子を一緒に使うとエラーの原因になる
public class Main {
  public static void main(String[] args){
    int a = 10;
    int b = 10;
    System.out.println(++a + 50);
    System.out.println(b++ + 50);
  }
}
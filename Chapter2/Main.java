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


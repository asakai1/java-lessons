// コード0-1
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

// コード0-2~5
public class Main {
  public static void main(String[] args) {
    System.out.println("すがわら");
    System.out.println("31歳です");
    System.out.println("お酒が好きです");
    System.out.println("31 + 31の計算をします");
    System.out.println(31 + 31);
    System.out.println(35 - 10);
    System.out.println(-5 * 2);
    System.out.println(6 * 6 * 3.14);
    System.out.println("こたえは" + 64);
  }
}

// コード0-6
public class Main {
  public static void main(String[] args) {
    System.out.println("すがわら");
    System.out.println("31歳です");
    System.out.println("お酒が好きです");
    System.out.println("31 + 31の計算をします");
    System.out.println(31 + 31);
    int x;
    x = 6;
    System.out.println(x * x * 3.14);
  }
}

// 図1-14
public class Main{
  public static void main(String[] args){
    int version;
    version = 1 + 5;
    System.out.println("日記ソフト");
    System.out.println("ver" + version);
    System.out.println("まだ開発中です");
    System.out.println("終了します");
  }
}

// コード1-2
public class Main {
  public static void main(String[] args){
    int age; /* intは整数 */
    age = 30;
    System.out.println(age);
  }
}

/*
整数
byte とても小さな整数 ex.byte glasses;
short 小さな整数 ex.short age;
int 普通の整数 ex.int salary;
long 大きな整数 ex.long worldPeople;

小数
float 少し曖昧でも良い小数 ex.float weight;
double 普通の小数 ex.double pi; 円周率

真偽値
boolean trueかfalse ex.boolean isError;

文字
char １つの文字 ex.char initial;

文字列
String 文字の並び ex.String name;
*/

public class Main {
  public static void main(String[] args){
    byte glasses;
    glasses = 2;
    System.out.println(glasses);
  }
}

public class Main {
  public static void main(String[] args){
    short age;
    age = 18;
    System.out.println(age);
  }
}

public class Main {
  public static void main(String[] args){
    int salary;
    salary = 152000;
    System.out.println(salary);
  }
}

public class Main {
  public static void main(String[] args){
    long worldPeople;
    worldPeople = 6900000000L;
    System.out.println(worldPeople);
  }
}

/*
浮動小数点型(floating point type)
float weight; weight = 67.5F;
double height; height = 171.2;
※真に厳密な計算ができない
誤差が許されない計算には使わない

浮動小数点...
数字を「仮数×基数^指数」で表現する
「仮数」と「基数」のみを記憶させ、計算して元の数字を復元している
*/

/*
二者択一
boolean
trueとfalse
boolean isError; isError = true;
...エラーである
boolean result; result = false;
...結果は失敗
*/

/*
文字列型
char zodiac; zodiac = '辰'; 引用符
String name; name = "すがわら"; 二重引用符
*/

//変数の宣言と値の代入を同時に行う...変数bの初期化
public class Main {
  public static void main(String[] args){
    int age = 20;
    System.out.println("私の年齢は" + age);
    age = 31;
    System.out.println("・・・いや、本当の年齢は" + age);
  }
}
//31を代入することで上書きされて、20は消滅する

//書き換えてはいけない変数の値を上書きしてしまう例
public class Main {
  public static void main(String[] args){
    double pi = 3.14;
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
    System.out.println("パイの半径を倍にします");
    pi = 10;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie *pi);
  }
}

//変数の上書きを阻止する...final付きで宣言された変数は定数(constant variable)と呼ばれる
public class Main {
  public static void main(String[] args){
    final double PI = 3.14; //一般的に定数名には全て大文字を使用
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
    System.out.println("パイの半径を倍にします");
    PI = 10;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie *pi);
  }
}

//1.5練習問題1-2
public class Main {
  public static void main(String[] args){
    int a = 3;
    int b = 5;
    int c = a * b;
    System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c ) ;
  }
}

//1.5練習問題1-3
boolean isError = true;
char name = '駆';
float pi = 3.14F; //floatの場合、末尾に「F」をお付ける
long population = 314159265853979L;
String text = "ミナトの攻撃！敵に１５ポイントのダメージを与えた。";

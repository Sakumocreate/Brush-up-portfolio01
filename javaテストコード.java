/*
レビューして頂いた内容を元に勉強と修正、爆破機能の追加を行いました。
*/

class main{
public static void main (String[] args){

System.out.print("イートイン料金を自動で計算するよ！");

int value = 100; //ここに購入金額を挿入
double tax =1.08; //ここで税率を記載
double buy = value * tax; //代金×税率

System.out.println ("あなたの購入金額は"+buy+"円です");

if(buy >=500) {
System.out.println("お買い上げ、ありがとうございまーす！");} //一定金額以上ならありがとうございました！
else{System.out.println("店が干上がっちまうよ！出直して来な！！");} //一定金額以下なら詰ってくれます。 
if (Math.random() < 0.1) System.out.println("怒りに飲まれ財布が爆発した！"); //10%の確立で財布が爆発します。
 }
}

/*
薬師川さんから「同時にサイコロを振り、同数で爆破」というシステムを教えて頂いたのですが、
自分なりに考えた結果、<0.1で爆破と処理を短くすることでシンプルさやレスポンス速度が上昇するのでは?と考え導入してみました。
まだまだ設計思想については学びの途中ですが、こうした“レビュー→実装→再設計”というプロセスを通じて、より理解を深めていければと思っております。
改めて、レビューと新しい知見を教えて頂きありがとうございました！
*/

/*
progateで学習出来た範囲と自身で勉強した部分を組み合わせて作成しております。
ミスがあったらすみません。
*/

class main{
  public static void main(String[] args) {

    System.out.print("イートイン料金を自動で計算するよ！");
    
    int kounyukingaku = 500; //ここに購入金額を挿入
    
    Double zeiritu =1.08; //ここで税率を記載
    Double daikin = kounyukingaku * zeiritu　//代金×税率
    
System.out.println ("あなたの購入金額は"+daikin+"円です");

    if(daikin >=500) {
      System.out.println("お買い上げ、ありがとうございまーす！");　//一定金額以下ならありがとうございました！
    }else{ System.out.println("予算オーバーだ！出直して来な！！"); //一定金額以上なら詰ってくれます。
         }
  } 
/*
それと、支払い後一定確立で財布が爆発するコードを入れたかったのですが、
まだわからなかったので入れれていません。悔しいです
*/

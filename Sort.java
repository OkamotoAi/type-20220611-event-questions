import java.util.Arrays;
import java.util.stream.IntStream;

class Main {

  public static void main(String[] args) {
    // ランダムに並べられた重複のない整数の配列
    var array = new int[] { 5, 4, 6, 2, 1, 9, 8, 3, 7, 10 };
    // ソート実行
    var sortedArray = new Main().sort(array);
    // 結果出力
    Arrays.stream(sortedArray).forEach(System.out::println);
  }

  private int[] sort(int[] array) {
    // 要素が一つの場合はソートの必要がないので、そのまま返却
    if (array.length == 1) {
      return array;
    }

    // 配列の先頭を基準値とする
    var pivot = array[0];

    // ここから記述

    //pivot以上，未満の値を格納
    int front = -1;
    int back = -1;
    
    //捜査用
    int f = 1;
    int b = array.length-1;
    int tmp;
    
    //ぶつかるまで
    while(f+1 != b){
      if(array[f] >= pivot){
        //基準以上のとき
        front = array[f];
      }else{
        f++;
      }
      
      if(array[b] < pivot){
        //基準未満のとき
        back = array[b];
      }else{
        b--;
      }
      
      //両方見つかった時
      if(front != -1 && back != -1){
        System.out.printf("%d %d\n", f,b);
        //f,bの入れ替え
        tmp = array[f];
        array[f] = array[b];
        array[b] = tmp;
        
        front = -1;
        back = -1;
        
      }
    }
    
    return array;
    // ここまで記述

  }
}
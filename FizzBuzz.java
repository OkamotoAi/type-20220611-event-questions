class Main {

  public static void main(String args[]) {
    for (int i = 1; i <= 100; i++) {
      String str = "";

      // ここから記述
      if(i % 3 == 0) str += "Fizz";
      if(i % 5 == 0) str += "Buzz";
      if(str.isEmpty()) str = String.valueOf(i);


      // ここまで記述

      System.out.println(str);
    }
  }
}
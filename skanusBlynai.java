public class skanusBlynai {
      public static void main(String args[]) {
        int blynai = Integer.parseInt(args[0]);
        someCalculations(blynai); 
      }

      public static void someCalculations(int blyn){
          blyn = blyn + 1;
          long[][] arr = new long[blyn][blyn];
          for (int i=0; i<blyn;i++) {
            for (int j = 0; j<blyn; j++) {
                if (i == 0) {
                    arr[i][j] = 0;
                    continue;
                }
                if (j == 0) {
                    arr[i][j] = 1;
                    continue;
                }
                if (j >= i) {
                    arr[i][j] = 0;
                    continue;
                }
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
          }
          
          for (int i=0; i<blyn;i++) {
            long variantai = 0;
            System.out.println("blynai: " + i);
            for (int j = 0; j<blyn; j++) {
                System.out.print(arr[i][j] + "  ");
                variantai = variantai + arr[i][j];
            }
            System.out.println("");
            System.out.println("Variantai: " + variantai);
          }
      }
}
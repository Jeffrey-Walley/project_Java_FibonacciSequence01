public class Main {
    public static void main(String[] args) {

                int nterms = 10;
                int[] fibo = new int[nterms];

                for (int index=0; index < fibo.length; index++) {
                    if(index==0) {
                        fibo[index] = 0;
                    } else if(index==1) {
                        fibo[index] = 1;
                    } else {
                        fibo[index] = fibo[index-1] + fibo[index-2];
                    }
                }

//print fibonacci series
                for(int n:fibo)
                    System.out.print(n+"  ");

            }

        }

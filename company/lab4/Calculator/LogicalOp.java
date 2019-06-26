package lab4.Calculator;

public class LogicalOp {


    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) { // folosim for cand stim de cate ori vrem sa iteram.
            System.out.println(i);
        }

    }

    public void printToHundredWhile(int number){
        while (number <= 100);
        System.out.println(number);
        number++;
    }


    public void printToHundredDoWhile(int number){
        do { // se executa cel putin o data,spre deosebire de while-do.
            System.out.println(number);
            number++;
        } while(number <= 100);
    }



    public void printSumAndAverage(){
        int sum = 0;
        for ( int i = 1; i <= 100; i++ ){
            System.out.println(i);
        }
        System.out.println(sum);
        System.out.println("Average is : " + (sum/100f));
    }





    public void printStars() {

        int i, j;
        for (i = 0; i <= 6; i++) {
            for (j = 1; j <= 7 - i; j++) System.out.print("*");
            System.out.println("");
        }

     }


        public void printEvenNumbers() {

            int limit = 100;

            System.out.println("Printing Even numbers between 1 and " + limit);

            for(int i=1; i <= limit; i++){

                if( i % 2 == 0){
                    System.out.print(i + " ");
                }
            }
        }

    public void printOddNumbers() {
        System.out.println("The Odd Numbers are:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    }







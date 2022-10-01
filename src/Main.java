import java.util.Scanner;

class task_1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1, b = 1, brush = 2, temp;
        while(brush !=n){
            temp = a;
            a = b;
            b = a + temp;
            brush++;

        }
        System.out.println(b);
    }
}

class task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int rabbits = 11, wolves = 2, dead_rabbits = 0, difference_of_rabbits = 0, added__woloves = 0;
        while(month > 0){
            if (month % 2 == 0) {
                System.out.println("Месяц Четный");
                if (dead_rabbits > 70){
                difference_of_rabbits = dead_rabbits - (dead_rabbits / 70) * 70 ;
            }
                rabbits -= 10;
                dead_rabbits = dead_rabbits + wolves * 10 + difference_of_rabbits;
                added__woloves = dead_rabbits / 70;
                wolves = wolves + added__woloves;
                System.out.println("Кролики : " + rabbits);
                System.out.println("Волки : " + wolves);
                System.out.println("Мёртые Кролики : " + dead_rabbits);
                System.out.println("---------------");
                --month;
            }
            else{
                rabbits *=3;
                System.out.println("Месяц нечетный");
                System.out.println("Кролики : " + rabbits);
                System.out.println("Волки : " + wolves);
                System.out.println("Мёртые Кролики : " + dead_rabbits);
                System.out.println("---------------");
                --month;
            }
        }
        System.out.println("Кролики : " + rabbits);
        System.out.println("Волки : " + wolves);
    }
}

class task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 10 == 0) System.out.println(n + " " + "TORT" + "OV");
        else if (n % 100> 10 && n % 100 < 20) System.out.println(n + " " + "TORT" + "OV");
        else if (n % 10 < 5) System.out.println(n + " " + "TORT" + (n % 10 > 1? "A" :""));
        else System.out.println(n + " " + "TORT" + "OV");

    }
}
class task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int smallest = n % 10;
        n /= 10;
        while(n > 0){
            int lastdigit = n % 10;
            if(lastdigit < smallest && lastdigit !=0){
                smallest = lastdigit;
            }
            n /=10;
        }
        System.out.println(smallest);
        }
    }
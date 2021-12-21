import java.util.Scanner;

public class test_complex {
    public static void main (String[] args){
        double Re, Im;
        Scanner in= new Scanner(System.in);
        System.out.println("Введите Re для перовго комплексного числа:");
        System.out.println("Введите Im для первого комплексного числа:");
        Re=in.nextDouble();
        Im=in.nextDouble();
        complex a=new complex(Re, Im);

        System.out.println("Введите Re для вторго комплексного числа:");
        System.out.println("Введите Im для вторго комплексного числа:");
        Re=in.nextDouble();
        Im=in.nextDouble();
        complex b=new complex(Re, Im);

        double absA=a.abs();
        System.out.println("Модуль первого комплексного числа="+absA);
        double absB=b.abs();
        System.out.println("Модуль второго комплексного числа="+absB);

        double argA=a.arg();
        System.out.println("Аргумент первого комплексного числа="+argA);
        double argB=b.arg();
        System.out.println("Аргумент второго комплексного числа="+argB);

        complex c=complex.sum(a, b);
        System.out.println("Сумма комплексных чисел: Re="+c.Re +" Im="+c.Im);

        complex d=complex.sub(a, b);
        System.out.println("Разность комплексных чисел: Re="+d.Re +" Im="+d.Im);

    }
}
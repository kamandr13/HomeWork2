public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1: Присвоение значений переменным");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();
        System.out.println("Задача 2: Увеличение переменных на 4");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();
        System.out.println("Задача 3: Уменьшение значений переменных");
        dog = dog - 3.5;
        cat = cat - 1.6 ;
        paper = paper - 7639;
        System.out.println("dog (-3.5) = " + dog);
        System.out.println("cat (-1.6) = " + cat);
        System.out.println("paper (-7639) = " + paper);
        System.out.println();
        System.out.println("Задача 4: Издевательство над другом");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend * 2;
        System.out.println("friend (x2) = " + friend);
        friend = friend / 7;
        System.out.println("friend (/2) = " + friend);
        System.out.println();
        System.out.println("Задача 5: Издевательство над лягушкой");
        var frog = 3.5; //присвоение
        System.out.println("frog = " + frog);
        frog = frog * 10; //умножение
        System.out.println("frog (*10) = " + frog);
        frog = frog / 3.5; //деление
        System.out.println("frog (/3.5) = " + frog);
        frog = frog + 4; //сложение
        System.out.println("frog (+4) = " + frog);
        System.out.println();
        System.out.println("Задача 6: Взвешивание боксеров");
        var boxerWeight1 = 78.2; //масса первого боксера
        System.out.println("Масса первого боксера " + boxerWeight1 + " кг");
        var boxerWeight2 = 82.7; //масса второго боксера
        System.out.println("Масса второго боксера " + boxerWeight2 + " кг");
        //var totalWeight = boxerWeight1 + boxerWeight2; //общая масса боксеров
        System.out.println("Общая масса боксеров " + (boxerWeight1 + boxerWeight2) + " кг");
        /* var diffWeight = boxerWeight1 - boxerWeight2; //разница масс боксеров */
        System.out.println("Разница масс боксеров " + Math.abs(boxerWeight1 - boxerWeight2) + " кг");
        System.out.println();
        System.out.println("Задача 7: Остаток от деления");
        System.out.println("Остаток от деления масс боксеров " + (boxerWeight2 % boxerWeight1) + " кг");
        System.out.println();
        System.out.println("Задача 8: Человекочасы");
        var allHours = 640; //всего часов работы
        var workerHours = 8; //сколько часов посвящает работе один сотрудник
        var workers = allHours / workerHours; //количество сотрудников
        System.out.println("Всего работников в компании " + workers + " человек");
        workers = workers + 94; //работников стало больше
        System.out.println("Если в компании работает " + workers + ", то всего " + (workerHours * workers) + " часов работы может быть поделено между сотрудниками");
    }
}
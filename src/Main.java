//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача1");
        //«Если возраст человека равен …, то (вывести в зависимости от результата)
        // он совершеннолетний / он не достиг совершеннолетия, нужно немного подождать».
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }

        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }


        System.out.println("Задача2");
        //«На улице … градусов, (вывести в зависимости от результата)
        // нужно надеть шапку / можно идти без шапки».
        //«На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
        //«Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.

        int airTemp = 7;
        if (airTemp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }

        System.out.println("Задача3");

        //«Если скорость …, то (вывести в зависимости от результата)
        // придется заплатить штраф / можно ездить спокойно».
        int carSpeed = 70;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + " км/ч , то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + carSpeed + " км/ч , то можно ездить спокойно.");
        }

        System.out.println("Задача4");
        //«Если возраст человека равен …,
        // то ему нужно ходить … (в зависимости от возраста дописать нужное)».
        int personAge = 25;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + " , то ему нужно ходить в сад.");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + " , то ему нужно ходить в школу.");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + " , то ему нужно ходить в университет.");
        } else if (personAge >24) {
            System.out.println("Если возраст человека равен " + personAge + " , то ему нужно работать.");
        }
        System.out.println("Задача5");
        //Если возраст ребенка равен …, то ему … (в зависимости от возраста дописать нужное:
        // нельзя кататься на аттракционе, можно кататься на аттракционе в сопровождении /
        // без сопровождения взрослого)
        int ageOfChild = 6;
        if (ageOfChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + " , то ему нельзя кататься на аттракционе.");
        } else if (ageOfChild >=5 && ageOfChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + " , то ему можно кататься на аттракционе в сопровождении взрослых.");
        } else if (ageOfChild >=14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + " , то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задача6");
        //всего 102 60 сидячих
        int passenger = 30;
        if (passenger <= 60) {
            System.out.println("В вагоне есть сидячее место.");
        } else if (ageOfChild >60 && ageOfChild <= 102) {
            System.out.println("В вагоне есть стоячее место");
        } else if (ageOfChild >102) {
            System.out.println("В вагоне нет мест");
        }
        System.out.println("Задача7");
        int one = 1;
        int two = 20;
        int three = 30;
        if (one >= two && one >=three) {
            System.out.println("Максимальное число в переменной one равно " + one);
        } else if (two >= three) {
            System.out.println("Максимальное число в переменной two равно " + two);
        } else {
            System.out.println("Максимальное число в переменной three равно " + three);
        }
    }
}
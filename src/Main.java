// Домашняя работа 9, Строки.
// Кузьмин Сергей
// Java-разработчик IND 36.0
//
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1\n");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName;
        fullName = lastName + " " + firstName + " " + middleName + ".";
        System.out.printf("Ф. И. О. сотрудника —  " + fullName + "\n");
        System.out.println("\nЗадача 2\n");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "
                + fullName.toUpperCase());
        System.out.println("\nЗадача 3\n");
        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middleName + ".";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.printf("Данные Ф. И. О. сотрудника — " + fullNameTrue + "\n");

    }
}
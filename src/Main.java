public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        //task 1
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println(fullName);
        //task 2
//        fullName = fullName.replace("i", "I");
//        fullName = fullName.replace("v", "V");
//        fullName = fullName.replace("a", "A");
//        fullName = fullName.replace("n", "N");
//        fullName = fullName.replace("o", "O");
//        fullName = fullName.replace("c", "C");
//        fullName = fullName.replace("h", "H");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //task 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
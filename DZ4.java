package HomeWork4;

public class DZ4 {

    // поля
    String name; //ФИО
    String position; //должность
    String phone_number; //телефон
    int salary; //зарплата
    int age; //возраст

    // конструктор
    public DZ4 (String name, String position, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    // метод
    @Override
    public String toString(){
        return String.format("ФИО: %s \nДолжность: %s \nНомер телефона: %s \nЗарплата: %d \t Возраст: %d \n",
                name, position, phone_number, salary, age);}

    // вывод в консоль
    public void print(){
        System.out.println(this);
    }

    public static void main(String[] args)  {

        DZ4 [] persArray = new DZ4[5];
        persArray[0] = new DZ4("Морозов Игорь Петрович", "Генеральный директор", "+7-123-456-78-90", 256000, 55);
        persArray[1] = new DZ4("Кроликов Иван Афанасьевич", "Директор по персоналу", "+7-987-555-22-77", 128000, 42);
        persArray[2] = new DZ4("Медведев Дмитрий Анатольевич", "Охранник", "+7-987-123-44-66", 27000, 31);
        persArray[3] = new DZ4("Сучкова Эльмира Альбертовна", "Офис менеджер", "+7-987-625-67-89", 36000, 22);
        persArray[4] = new DZ4("Швабрикова Зинаида Павловна", "Уборщица", "+7-987-444-56-78", 13000, 50);

        // если в i поле age > 40, то у него вызывается метод print()
        for(int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();

    }
}

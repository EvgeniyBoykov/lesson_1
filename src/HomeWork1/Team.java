package HomeWork1;

public class Team {
    private String name;
    private String sex;
    private int age;
    public Team (String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String toString() {
        return "Имя участника команды " + name + "," + " пол " + sex + "," + " возраст " + age;
    }
    }

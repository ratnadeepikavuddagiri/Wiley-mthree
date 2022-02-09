class Person {
    String name;
    String city;
    String hobby;

    Person(String name, String city, String hobby) {
        this.name = name;
        this.city = city;
        this.hobby = hobby;
    }

    void printDetails() {
        System.out.println("Name : " + name + "\n" + "City : " + city + "\n" + "Hobby : " + hobby);
    }
}

class PersonalDetails {
    public static void main(String[] args) {
        String name = "Deepika";
        String city = "Tanuku";
        String hobby = "Drawing";
        Person person = new Person(name, city, hobby);
        person.printDetails();
    }

}

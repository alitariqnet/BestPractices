package Java;

record Person(String name, int age){
    public static void main(String[] args) {
        Person p = new Person("Ali", 20);

        System.out.println(p.toString());
    }

    // Compact constructor
    Person {
    }
    // Cannot write canonical constructor when a compact constructor is present

    // Getters
    @Override
    public int age() {
        return age;
    }

    @Override
    public String name() {
        return name;
    }

    // Cannot have setters because all fields are final

}

public record Person(String firstname, String Lastname, int age, Address address) {
    public Person(String firstname, String Lastname, int age, Address address) {
        this.firstname = firstname;
        this.Lastname = Lastname;
        this.age = Math.max(age, 0);
        this.address = address;
    }
}

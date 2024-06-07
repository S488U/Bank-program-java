package mypackage;

public class Bank {
    private float balance;
    private String name, gender, occupation, country, state;
    private int age;

    public float balance() {
        return balance;
    }

    public float withdraw(float amt) {
        balance -= amt;
        return balance;
    }

    public float deposit(float amt) {
        balance += amt;
        return balance;
    }

    public String profile() {
        return "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nOccupation: " + occupation + "\nCountry: " + country + "\nState: " + state + "\n\nBalance: " + balance();
    }

    public String updateProfile(String name, int age, String gender, String occupation, String country, String state) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.country = country;
        this.state = state;

        return "Name: " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender + "\nOccupation: " + this.occupation + "\nCountry: " + this.country + "\nState: " + this.state;
    }
}

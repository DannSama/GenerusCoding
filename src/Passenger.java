class Passenger {
    private String name;
    private int age;
    private String phoneNumber;
    private String ticketNumber;

    public Passenger() {
    }

    public Passenger(String name, int age, String phoneNumber, String ticketNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.ticketNumber = ticketNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}


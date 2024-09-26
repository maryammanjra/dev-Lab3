public class BuddyInfo {

    private String name;
    private String address;
    private String phone;

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public BuddyInfo() {
        this.name = "Friend";
        this.address = "Carleton University";
        this.phone = "123456789";
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo myBuddy = new BuddyInfo("Homer", "Simpson Avenue", "123456789");
        System.out.println("Hello " + myBuddy.getName());
    }

}

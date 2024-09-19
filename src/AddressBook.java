import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook(){
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        myBuddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        myBuddies.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}

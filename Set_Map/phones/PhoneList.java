import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class PhoneList {
    private HashMap<String, ArrayList<Phone>> phoneList;

    public PhoneList() {
        setPhoneList(new HashMap<String, ArrayList<Phone>>());
    }

    public void addPhone(String name, Phone phone) {
        ArrayList<Phone> phoneSet = this.phoneList.get(name);

        if (phoneSet == null) {
            this.phoneList.put(name, new ArrayList<Phone>(List.of(phone)));
        } else {
            phoneSet.add(phone);
        }
    }

    public ArrayList<Phone> isFind(String name) {
        return this.phoneList.get(name);
    }

    public HashMap<String, ArrayList<Phone>> getPhoneList() {
        return this.phoneList;
    }

    public void setPhoneList(HashMap<String, ArrayList<Phone>> phoneList) {
        this.phoneList = phoneList;
    }
}
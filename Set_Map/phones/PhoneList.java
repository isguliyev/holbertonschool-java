import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneList {
    private Map<String, List<Phone>> phoneList;

    public PhoneList() {
        setPhoneList(new HashMap<String, List<Phone>>());
    }

    public void addPhone(String name, Phone phone) {
        List<Phone> phoneSet = this.phoneList.get(name);

        if (phoneSet == null) {
            this.phoneList.put(name, new ArrayList<Phone>(List.of(phone)));
        } else {
            phoneSet.add(phone);
        }
    }

    public List<Phone> isFind(String name) {
        return this.phoneList.get(name);
    }

    public Map<String, List<Phone>> getPhoneList() {
        return this.phoneList;
    }

    public void setPhoneList(Map<String, List<Phone>> phoneList) {
        this.phoneList = phoneList;
    }
}
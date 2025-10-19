import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;

public class PhoneList {
    private Map<String, Set<Phone>> phoneList;

    public PhoneList() {
        setPhoneList(new HashMap<String, Set<Phone>>());
    }

    public void addPhone(String name, Phone phone) throws RuntimeException {
        Set<Phone> phoneSet = this.phoneList.get(name);

        for (Set<Phone> set : this.phoneList.values()) {
            if (set.contains(phone) && phoneSet == set) {
                throw new RuntimeException("Phone already exists for this person");
            }

            if (set.contains(phone)) {
                throw new RuntimeException("Phone already belongs to another person");
            }
        }

        if (phoneSet == null) {
            this.phoneList.put(name, new HashSet<Phone>(List.of(phone)));
        } else {
            phoneSet.add(phone);
        }
    }

    public Set<Phone> isFind(String name) {
        return this.phoneList.get(name);
    }

    public Map<String, Set<Phone>> getPhoneList() {
        return this.phoneList;
    }

    public void setPhoneList(Map<String, Set<Phone>> phoneList) {
        this.phoneList = phoneList;
    }
}
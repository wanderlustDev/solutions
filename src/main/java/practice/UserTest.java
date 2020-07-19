package practice;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.util.HashMap;
import java.util.HashSet;

public class UserTest extends UserTestParent {
    String name;

    public static void main(String[] args) {
        UserTestOther other1 = new UserTestOther("joy");
        UserTestOther other2 = new UserTestOther("joyjoy");

        UserTest userTest = mapper(other1);
        UserTest userTest1 = mapper(other2);

        HashSet hashSet = new HashSet();
        hashSet.add(userTest);
        hashSet.add(userTest1);
        System.out.println(hashSet.size());

        HashMap<UserTestOther, UserTest> hashMap = new HashMap();
        hashMap.put(new UserTestOther("a"), userTest);
        hashMap.put(new UserTestOther("b"), userTest1);
        hashMap.put(new UserTestOther("a"), userTest1);
        System.out.println(hashMap.get(new UserTestOther("a")));
    }

    public static UserTest mapper(UserTestOther other) {
        UserTest userTest = new UserTest();
        userTest.setName(other.getName() + "h");
        return userTest;

//        ObjectMapper mapper = new ObjectMapper();
//        return mapper.convertValue(other, UserTest.class);
    }
}

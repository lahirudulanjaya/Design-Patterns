package builder;

import java.util.*;

public class UserDTO {
    private String name;

    private String age;

    private String address;

    public String getName() {
        Integer integer = new Integer(10);
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static class UserDTOBuilder {

        private String name;

        private String age;

        private String address;

        public UserDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserDTOBuilder withAge(String age) {
            this.age = age;
            return this;
        }


        public UserDTOBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public UserDTO build() {
            UserDTO userDTO = new UserDTO();
            userDTO.address = this.address;
            userDTO.age = this.age;
            userDTO.name = this.name;
            return userDTO;
        }

    }


}

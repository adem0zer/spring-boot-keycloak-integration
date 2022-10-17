//package com.adem.model;
//
//import lombok.*;
//import org.hibernate.Hibernate;
//
//import javax.persistence.*;
//import java.io.Serial;
//import java.io.Serializable;
//import java.util.Objects;
//
//@Entity
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//public class User extends BaseEntity {
//
//    @Id
//    @Basic
//    @Column(name = "user_id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Integer id;
//
//    @Basic
//    @Column(name = "name")
//    String name;
//    @Basic
//    @Column(name = "last_name")
//    String lastName;
//
//    @Basic
//    @Column(name = "email")
//    String email;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return id.equals(user.id) && name.equals(user.name) && lastName.equals(user.lastName) && email.equals(user.email);
//    }
//
//    @Override
//    public int hashCode() {
//        final int PRIME = 59;
//        int result = 1;
//        result = result * PRIME + (Objects.isNull(getId()) ? 43 : getId().hashCode());
//        result = result * PRIME + (Objects.isNull(getName()) ? 43 : getName().hashCode());
//        result = result * PRIME + (Objects.isNull(getLastName()) ? 43 : getLastName().hashCode());
//        result = result * PRIME + (Objects.isNull(getEmail()) ? 43 : getEmail().hashCode());
//        return result;
//    }
//}

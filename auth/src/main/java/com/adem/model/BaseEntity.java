//package com.adem.model;
//
//import lombok.*;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.EntityListeners;
//import javax.persistence.MappedSuperclass;
//import java.io.Serial;
//import java.io.Serializable;
//import java.util.Date;
//import java.util.Objects;
//
//@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
//@Getter
//@Setter
//@ToString
//public class BaseEntity implements Serializable {
//    @Serial
//    private static final long serialVersionUID = -1595219347140773651L;
//
//    @CreatedDate
//    @Basic
//    @Column(name = "created_date")
//    private Date createdDate;
//
//    @LastModifiedDate
//    @Basic
//    @Column(name = "updated_date")
//    private Date updatedDate;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        BaseEntity baseEntity = (BaseEntity) o;
//        return createdDate.equals(baseEntity.createdDate) && updatedDate.equals(baseEntity.updatedDate);
//    }
//
//    @Override
//    public int hashCode() {
//        final int PRIME = 59;
//        int result = 1;
//        result = result * PRIME + (Objects.isNull(getCreatedDate()) ? 43 : getCreatedDate().hashCode());
//        result = result * PRIME + (Objects.isNull(getUpdatedDate()) ? 43 : getUpdatedDate().hashCode());
//        return result;
//    }
//}

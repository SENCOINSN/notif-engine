package com.adam.sn.models;
import com.adam.sn.enums.NotificationType;
import com.adam.sn.models.commons.Auditable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tb_notification")
@Getter
@Setter
public class Notification extends Auditable<String> {
    private String content;
    @Column(name = "date_publication")
    private Date plan_date_publish;
    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;

    public Notification() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Notification{" +
                "content='" + content + '\'' +
                ", plan_date_publish=" + plan_date_publish +
                ", notificationType=" + notificationType +
                '}';
    }
}

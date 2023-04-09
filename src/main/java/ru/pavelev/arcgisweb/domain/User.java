package ru.pavelev.arcgisweb.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="usr",schema = "navigatordb")
@Getter
@Setter
@NoArgsConstructor
@Data
public class User {
    @Id
    private  String id;
    private String name;
    private String userpic;
    private String email;
    private String gender;
    private String locale;
    private LocalDateTime lastVisit;

}
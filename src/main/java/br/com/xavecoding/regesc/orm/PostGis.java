package br.com.xavecoding.regesc.orm;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Proximidade")
public class PostGis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private int longitdeA;
    @Column(nullable = false, unique = true)
    private int longitdeB;
    @Column(nullable = false, unique = true)
    private int latitudeA;
    @Column(nullable = false, unique = true)
    private int latitudeB;
    @Column(columnDefinition = "GENERATED AS (LATITUDEA + gitLATITUDEB) VIRTUAL", updatable = false, insertable = false)
    private LocalDate distancia;
}





//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;

//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "professores")
//public class Professor {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(nullable = false)
//    private String nome;
//    @Column(nullable = false, unique = true)
//    private String prontuario;
//}

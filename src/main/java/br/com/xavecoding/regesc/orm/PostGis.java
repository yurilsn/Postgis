package br.com.xavecoding.regesc.orm;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Proximidade")
public class PostGis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true)
    private Integer longitdeA;
    @Column(nullable = false, unique = true)
    private Integer longitdeB;
    @Column(nullable = false, unique = true)
    private Integer latitudeA;
    @Column(nullable = false, unique = true)
    private Integer latitudeB;
    @Column(columnDefinition = "integer GENERATED ALWAYS AS (latitudeB + latitudeA) STORED", updatable = false, insertable = false)
    private Integer distancia;
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

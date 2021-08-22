package br.com.mpcommerce.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sales")
@Getter @Setter
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user_id;
}

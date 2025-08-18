package com.example.springmvc.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @OneToMany(mappedBy = "invoice")
    private Set<InvoiceDetail> details;

    public Invoice() {
    }
    public Invoice(User user, LocalDate orderDate) {
        this.user = user;
        this.orderDate = orderDate;
    }
    public int getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Set<InvoiceDetail> getDetails() {
        return details;
    }

    public void setDetails(Set<InvoiceDetail> details) {
        this.details = details;
    }

    public void setId(int id) {
        this.id = id;

    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {}
}

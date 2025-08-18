package com.example.springmvc.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class InvoiceDetailKey implements Serializable {

    private int invoiceId;
    private int productId;

    public InvoiceDetailKey() {}
    public InvoiceDetailKey(int invoiceId, int productId) {
        this.invoiceId = invoiceId;
        this.productId = productId;
    }
    public int getInvoiceId() {
        return invoiceId;
    }
    public void setInvoiceId(int invoiceId) {}

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvoiceDetailKey)) return false;
        InvoiceDetailKey that = (InvoiceDetailKey) o;
        return invoiceId == that.invoiceId && productId == that.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceId, productId);
    }
}

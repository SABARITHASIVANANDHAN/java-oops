package section3;

public class Product {
    private long id;
    private String productName;
    private String supplierName;

    public Product() {

    }

    public Product(long id, String productName, String supplierName) {
        super();
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((productName == null) ? 0 : productName.hashCode());
        result = prime * result + ((supplierName == null) ? 0 : supplierName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (id != other.id)
            return false;
        if (productName == null) {
            if (other.productName != null)
                return false;
        } else if (!productName.equals(other.productName))
            return false;
        if (supplierName == null) {
            if (other.supplierName != null)
                return false;
        } else if (!supplierName.equals(other.supplierName))
            return false;
        return true;
    }

    public void display(Long id2, String productname, String supplierName) {
        System.out.println("Product Id is" + getId());
        System.out.println("Product Name is" + getProductName() + "\n");
        System.out.println("Supplier Name is" + getSupplierName());
    }

}

package database;
// Generated Feb 5, 2018 1:12:41 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Products generated by hbm2java
 */
public class Products  implements java.io.Serializable {


     private Integer id;
     private Categories categories;
     private String name;
     private double price;
     private int quantity;
     private String description;
     private byte visible;
     private String image;
     private Set wishlists = new HashSet(0);
     private Set ordersHasProductses = new HashSet(0);
     private Set userses = new HashSet(0);

    public Products() {
    }

	
    public Products(Categories categories, String name, double price, int quantity, String description, byte visible, String image) {
        this.categories = categories;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.visible = visible;
        this.image = image;
    }
    public Products(Categories categories, String name, double price, int quantity, String description, byte visible, String image, Set wishlists, Set ordersHasProductses, Set userses) {
       this.categories = categories;
       this.name = name;
       this.price = price;
       this.quantity = quantity;
       this.description = description;
       this.visible = visible;
       this.image = image;
       this.wishlists = wishlists;
       this.ordersHasProductses = ordersHasProductses;
       this.userses = userses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Categories getCategories() {
        return this.categories;
    }
    
    public void setCategories(Categories categories) {
        this.categories = categories;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public byte getVisible() {
        return this.visible;
    }
    
    public void setVisible(byte visible) {
        this.visible = visible;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public Set getWishlists() {
        return this.wishlists;
    }
    
    public void setWishlists(Set wishlists) {
        this.wishlists = wishlists;
    }
    public Set getOrdersHasProductses() {
        return this.ordersHasProductses;
    }
    
    public void setOrdersHasProductses(Set ordersHasProductses) {
        this.ordersHasProductses = ordersHasProductses;
    }
    public Set getUserses() {
        return this.userses;
    }
    
    public void setUserses(Set userses) {
        this.userses = userses;
    }




}



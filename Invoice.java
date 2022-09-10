// this is a program to imitate the invoice of a store which has instances like item code , name , quantity,
// price per item

// a class called invoice is created
class Invoice{
    String itemCode , name;
    int quantity;
    double pricePerItem;
 
    Invoice(String ic , String n , int q , double ppi){
        itemCode = ic;
        name = n;
        quantity = q;
        pricePerItem = ppi;
    }

    void setItemCode(String newCode){
        itemCode = newCode;
    }
    // a method called setItemCode is created , it is used to set a new item code
    void setName(String newName){
        name = newName;
    }
    // a method called setName is created , it is used to set a new name
    void setQuantity(int newQuantity){
        if(newQuantity < 0){
            quantity = 0;
        }
        else{
            quantity = newQuantity;
        }
    }
        // a method called setQuantity is created , it is used to set a new no of quantity

    void setPricePerItem(double newPrice){
        if (newPrice<0){
            pricePerItem = 0.0;
        }
        else{
            pricePerItem = newPrice;
        }
    }
        // a method called setPricePerItem is created , it is used to set a new price for item

    String getItemCode(){
        return itemCode;
    }
        // a method called getItemCode is created , it returns itemcode

    String getName(){
        return name;
    }
            // a method called getName is created , it returns name

    int getQuantity(){
        return quantity;
    }
            // a method called getQuantity is created , it returns qunatity

    double getPricePerItem(){
        return pricePerItem;
    }
            // a method called getPricePerItem is created , it returns price per item

    double getInvoiceAmount(){
        return quantity*pricePerItem;
    }
    // this method return the total amount from the given quantity and price per item

 
}
class Main{
    public static void main(String[] args) {
        // creating a new Invoice object
        Invoice ob = new Invoice("1234","pen",20,3.75);
        // saving the total 
        double total = ob.getInvoiceAmount();
        System.out.println("total price = "+total);
        ob.setItemCode("1942321");
        ob.setName("water bottle");
        ob.setPricePerItem(99);
        ob.setQuantity(21);
        total = ob.getInvoiceAmount();
        System.out.println("item :"+ob.getName()+"code : "+ob.getItemCode()+" quantity : "
                                                +ob.getQuantity()+" Price(per item) : "+ob.getPricePerItem()+" Total price : "+ob.getInvoiceAmount());
    
}

}
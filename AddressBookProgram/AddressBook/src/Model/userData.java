
package Model;


public class userData {
    
    public String Imagespath= "D:\\AddressBookProgram\\";
    
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String mobile;
    private String tel;
    private String address;
    
 
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

   
    public String getFname() {
        return fname;
    }

    
    public void setFname(String fname) {
        this.fname = fname;
    }

    
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

 
    public String getTel() {
        return tel;
    }

    
    public void setTel(String tel) {
        this.tel = tel;
    }

  
    public String getAddress() {
        return address;
    }

  
    public void setAddress(String address) {
        this.address = address;
    }

   
    public String getMobile() {
        return mobile;
    }

  
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    
    
    
}
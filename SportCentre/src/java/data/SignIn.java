/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 60192
 */
public class SignIn {
    private String email;
    private String password;
    private String Name;
    private String ic;
    private int phoneNum;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
        
        
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	
	

        
	public SignIn(){

	}

	public void finalize() throws Throwable {

	}

	public void accessSignInScreen(){

	}

	public void dispSigned(){

	}

	public void userNotFound(){

	}

	public void wrongLogin(){

	}
}

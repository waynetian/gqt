package com.gqt.model;  

import java.util.Date;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
import javax.persistence.GeneratedValue;


@Entity  
@Table(name = "t_user_info")  
public class User implements java.io.Serializable  
{ 
    @Id @GeneratedValue private long id;
    private String userId;  
    private String nickName;  
    private String email;
    private String password;
    private String authToken;


    
    /**
     * Get nickName.
     *
     * @return nickName as String.
     */
    public String getNickName()
    {
        return nickName;
    }
    
    /**
     * Set nickName.
     *
     * @param nickName the value to set.
     */
    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }
    
    /**
     * Get userId.
     *
     * @return userId as String.
     */
    public String getUserId()
    {
        return userId;
    }
    
    /**
     * Set userId.
     *
     * @param userId the value to set.
     */
    public void setUserId(String userId)
    {
        this.userId = userId;
    }
    
    /**
     * Get email.
     *
     * @return email as String.
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Set email.
     *
     * @param email the value to set.
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * Get password.
     *
     * @return password as String.
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * Set password.
     *
     * @param password the value to set.
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    /**
     * Get authToken.
     *
     * @return authToken as String.
     */
    public String getAuthToken()
    {
        return authToken;
    }
    
    /**
     * Set authToken.
     *
     * @param authToken the value to set.
     */
    public void setAuthToken(String authToken)
    {
        this.authToken = authToken;
    }
 
 /**
  * Get id.
  *
  * @return id as long.
  */
 public long getId()
 {
     return id;
 }
 
 /**
  * Set id.
  *
  * @param id the value to set.
  */
 public void setId(long id)
 {
     this.id = id;
 }
}  

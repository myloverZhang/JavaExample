//package springboot.model;
//
//import org.springframework.boot.autoconfigure.web.ResourceProperties;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.io.Serializable;
//import java.util.Arrays;
//import java.util.Collection;
//
///**
// * Created by CTWLPC on 2017/8/11.
// */
//@Entity
//public class PlayerInfo implements Serializable,UserDetails{
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private String userName;
//    private String fullName;
//    private String password;
//
//    public PlayerInfo() {
//    }
//
//    public PlayerInfo(String userName, String fullName, String password) {
//        this.userName = userName;
//        this.fullName = fullName;
//        this.password = password;
//    }
//
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public String getUsername() {
//        return userName;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Arrays.asList(new SimpleGrantedAuthority("PLAYER"));
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "PlayerInfo{" +
//                ", userName='" + userName + '\'' +
//                ", fullName='" + fullName + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
//}

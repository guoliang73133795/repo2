import java.util.Date;

/**
 * <p>Title:User</p>
 * <p>Description:TODO</p>
 *
 * @author 郭亮
 * @date 2020/1/28 10:11
 */
public class User {
    private int id;
    private String username;
    private String sex;
    private Date birthday;
    private String address;

    public User() {
    }

    public User(int id, String username, String sex, Date birthday, String address) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username='" + username + '\'' + ", sex='" + sex + '\'' + ", birthday=" + birthday + ", address='" + address + '\'' + '}';
    }
}

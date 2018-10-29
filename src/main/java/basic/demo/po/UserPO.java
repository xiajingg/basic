package basic.demo.po;

/**
 *  model 标准的分为很多种这里首先介绍一种关联数据库的叫PO
 *
 *  这个类名是 UserPO(首字母大写, 词组每个单词首字母大写, 最后PO全部大写, 比如UserInfoPO)
 *  这个类说明 在数据库里有一张 user表, 由四个字段 id name password 和 email
 *
 *  最后方法要生成 get和set (有快捷键, 如果不知道 就把后面这句贴到百度 : idea自动生成get set 方法的快捷键)
 *
 *  看完后去看 dao文件夹.
 */
public class UserPO {

    private String id;
    private String name;
    private String password;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

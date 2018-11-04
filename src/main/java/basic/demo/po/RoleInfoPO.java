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
public class RoleInfoPO {

    private String id;
    private String roleName;
    private String roleCode;
    private String createBy;
    private String createDate;
    private String modifiedBy;
    private String modifiedDate;
    private String sortno;
    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getSortno() {
        return sortno;
    }

    public void setSortno(String sortno) {
        this.sortno = sortno;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

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
public class QuestionPO {

    private String id;
    private String qid;
    private String title;
    private String text;
    private String qtime;
    private String rid;
    private String rcontent;
    private String rtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getQtime() {
        return qtime;
    }

    public void setQtime(String qtime) {
        this.qtime = qtime;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }

    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime;
    }
}

package practice.Extend;

public abstract class GroupMembersInfo {
    private String name;
    private int remainMoney;

    public GroupMembersInfo() {
    }

    public GroupMembersInfo(String name, int remainMoney) {
        this.name = name;
        this.remainMoney = remainMoney;
    }

    public void show() {
        System.out.println(name + "的余额为" + remainMoney);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(int remainMoney) {
        this.remainMoney = remainMoney;
    }
}

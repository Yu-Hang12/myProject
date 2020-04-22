package practice.Extend;

import java.util.ArrayList;

public class GroupOwner extends GroupMembersInfo {

    public GroupOwner() {
    }

    public GroupOwner(String name, int remainMoney) {
        super(name, remainMoney);
    }

    public ArrayList<Integer> Money(int money, int counter) {
        ArrayList<Integer> redPacket = new ArrayList<Integer>();

        if (money > super.getRemainMoney()) {
            System.out.println("钱包余额不足");
        } else {
            int avg = money / counter;
            int mod = money % counter;
            for (int i = 0; i < counter - 1; i++) {
                redPacket.add(avg);
            }
            //把余下的零头放到最后一个红包
            redPacket.add(avg + mod);

            System.out.println("群主发了：" + redPacket.size() + "个红包，快来抢啊！！！");
            super.setRemainMoney(super.getRemainMoney() - money);
        }
        return redPacket;
    }


}

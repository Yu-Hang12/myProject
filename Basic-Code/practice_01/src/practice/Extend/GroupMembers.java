package practice.Extend;

import java.util.ArrayList;
import java.util.Random;

public class GroupMembers extends GroupMembersInfo {

    public GroupMembers() {
    }

    public GroupMembers(String name, int remainMoney) {
        super(name, remainMoney);
    }

    public void receiveMoney(ArrayList<Integer> redPackets) {
        int number;

        if (0 == redPackets.size()) {
            System.out.println("群主骗人！！！退群");
        } else {
            //随机生成抢第几个红包
            Random ran = new Random();
            int temp = ran.nextInt(redPackets.size());

            //获取红包金额,删除被抢的红包
            number = redPackets.remove(temp);

            //红包放入余额中
            System.out.println(super.getName() + "抢到了" + number + "元！");
            super.setRemainMoney(super.getRemainMoney() + number);
        }
    }
}

package practice.Extend;

import java.util.ArrayList;

public class MainRedPackets {

    public static void main(String[] args) {
        GroupOwner owner = new GroupOwner("Liming",500);
        GroupMembers mem1 = new GroupMembers("HanMeimei",100);
        GroupMembers mem2 = new GroupMembers("迪丽热巴",300);
        GroupMembers mem3 = new GroupMembers("古力娜扎",200);

        owner.show();
        mem1.show();
        mem2.show();
        mem3.show();
        System.out.println("============================");

        ArrayList<Integer> redPackets = owner.Money(500,3);
        mem1.receiveMoney(redPackets);
        mem2.receiveMoney(redPackets);
        mem3.receiveMoney(redPackets);
        owner.show();
        mem1.show();
        mem2.show();
        mem3.show();

    }
}

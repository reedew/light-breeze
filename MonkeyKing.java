package mk;

/*
 * 15只猴子围成圈标记为1~15，从1开始循环报数1~7，数到7的淘汰，最后一只没淘汰的为猴王，问是第几只？
 */
public class MonkeyKing {
    public static void main(String[] args) {
        // 标记猴子状态
        boolean[] b = new boolean[15];
        for (int i = 0; i < b.length; i++) {
            b[i] = true;
        }
        // 猴子索引
        int index = 0;
        // 剩余猴子个数
        int monkeyLeft = 15;
        // 报数
        int num = 0;

        while (monkeyLeft > 1) {// 等于1时出循环
            if (b[index]) {// 没被淘汰
                num++;
                if (num == 7) {
                    monkeyLeft--;// 淘汰
                    b[index] = false;
                    num = 0;
                }
            }
            index++;// 后面接着报数
            if (index == 15) {
                index = 0;
            }
        }

        // 遍历找出为true的猴子即为猴王
        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                System.out.println("猴王是第" + (i + 1) + "只");
            }
        }
    }
}


package com.javaLearning.variable;

public class variable_demo2
{
    static void main(String[] args) {
        //    对方：长手        我方：叉子
        //    攻击：220        攻击：210
        //    防御：85         防御：80
        //    血量：1012.5     血量：1223.3
        //    技能加成：1.3    技能加成：1.2

        //    技能造成伤害的公式：攻击力*技能加成- 对方防御力
        //    普攻造成伤害的公式：攻击力- 对方防御力
        //    计算：
        //    我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
        //    我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
        //    规则：经常发生改变的数据，用变量记录

        //我方数值
        double myAttack = 210;
        double myDefense = 80;
        double myHealth = 1223.3;
        double mySkillAdd = 1.2;

        //对方数值
        double enemyAttack = 220;
        double enemyDefense = 85;
        double enemyHealth = 1012.5;
        double enemySkillAdd = 1.3;

        //我方第一次普通普通攻击
        double myNormalAttack = myAttack - enemyDefense;
        enemyHealth = enemyHealth - myNormalAttack;
        System.out.println("我方第一次普通普通攻击，造成伤害：" + myNormalAttack);
        System.out.println("对方还剩余血量：" + enemyHealth);

        //我方第一次技能攻击
        double mySkillAttack = myAttack * mySkillAdd - enemyDefense;
        enemyHealth = enemyHealth - mySkillAttack;
        System.out.println("我方第一次技能攻击，造成伤害：" + mySkillAttack);
        System.out.println("对方还剩余血量：" + enemyHealth);
    }
}

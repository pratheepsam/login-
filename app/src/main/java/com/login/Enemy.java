package com.login;

/**
 * Created by sysadmin on 22/7/17.
 */

public class Enemy {

    private String name ;
    private String hp;
    private String damage_low_range;
    private String damage_high_range;
    private String gold_low_range;
    private String gold_high_range;
    private String xp_low_range;
    private String xp_high_range;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getDamage_low_range() {
        return damage_low_range;
    }

    public void setDamage_low_range(String damage_low_range) {
        this.damage_low_range = damage_low_range;
    }

    public String getDamage_high_range() {
        return damage_high_range;
    }

    public void setDamage_high_range(String damage_high_range) {
        this.damage_high_range = damage_high_range;
    }

    public String getGold_low_range() {
        return gold_low_range;
    }

    public void setGold_low_range(String gold_low_range) {
        this.gold_low_range = gold_low_range;
    }

    public String getGold_high_range() {
        return gold_high_range;
    }

    public void setGold_high_range(String gold_high_range) {
        this.gold_high_range = gold_high_range;
    }

    public String getXp_low_range() {
        return xp_low_range;
    }

    public void setXp_low_range(String xp_low_range) {
        this.xp_low_range = xp_low_range;
    }

    public String getXp_high_range() {
        return xp_high_range;
    }

    public void setXp_high_range(String xp_high_range) {
        this.xp_high_range = xp_high_range;
    }
}

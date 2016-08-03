package com.example.user.ormlite2.Database;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by user on 03.08.16.
 */
@DatabaseTable(tableName = "setting")
public class Setting {

    @DatabaseField(generatedId = true)
    private int Id;


    @DatabaseField(canBeNull = false, dataType = DataType.STRING, unique = true)
    private String Name;

    @DatabaseField(canBeNull = false, dataType = DataType.INTEGER, defaultValue = "0")
    private int Val;

    public Setting() {
    }

    public Setting(String name, int val) {
        Name = name;
        Val = val;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Val=" + Val +
                '}';
    }

    public int getVal() {
        return Val;
    }
}
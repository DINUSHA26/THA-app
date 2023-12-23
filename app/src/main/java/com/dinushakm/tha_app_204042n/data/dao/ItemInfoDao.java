package com.dinushakm.tha_app_204042n.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import com.dinushakm.tha_app_204042n.data.entity.ItemInfo;

@Dao
public interface ItemInfoDao {
    @Insert
    void addItem(ItemInfo itemInfo);

    @Query("Select * from Item_Infor")
    LiveData<List<ItemInfo>> getAllItems();

    @Update
    void updateItem(ItemInfo itemInfo);

    @Delete
    void delete(ItemInfo itemInfo);

}

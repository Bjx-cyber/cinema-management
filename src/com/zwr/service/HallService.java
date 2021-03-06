package com.zwr.service;

import java.util.List;

import com.zwr.entity.Hall;

public interface HallService {
	public int addHall(Hall hall);
	public boolean delHall(int hId);
	public boolean updateHall(Hall hall);
	public List<Hall> queryAllHall();
	public Hall queryHallById(int hId);
	public List<Hall> queryAllHallcId(int cId);
}

package com.zwr.service.impl;

import java.util.List;

import com.zwr.dao.TicketDao;
import com.zwr.dao.impl.TicketDaoImpl;
import com.zwr.entity.Ticket;
import com.zwr.service.TicketService;

public class TicketServiceImpl implements TicketService {
   private TicketDao ticketDao;
   public TicketServiceImpl() {
	   ticketDao=new TicketDaoImpl();
   }
	@Override
	public boolean addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketDao.addTicket(ticket);
	}

	@Override
	public boolean delTicket(int tId) {
		// TODO Auto-generated method stub
		return ticketDao.delTicket(tId);
	}

	@Override
	public List<Ticket> queryAllTicket() {
		// TODO Auto-generated method stub
		return ticketDao.queryAllTicket();
	}
	@Override
	public List<Ticket> queryAllTicketsId(int sId) {
		// TODO Auto-generated method stub
		return ticketDao.queryAllTicketsId(sId);
	}
	@Override
	public List<Ticket> queryAllTicketuId(int uId) {
		// TODO Auto-generated method stub
		return ticketDao.queryAllTicketuId(uId);
	}

}

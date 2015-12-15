package com.panda.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panda.mapper.BorrowMapper;
import com.panda.model.Borrow;
import com.panda.model.BorrowWithBookName;
import com.panda.service.BorrowService;

@Service("BorrowService")
public class BorrowServiceImpl implements BorrowService{

	@Autowired
	private BorrowMapper borrowMapper;

	public int insertSelective(Borrow borrow) {
		return borrowMapper.insertSelective(borrow);
	}

	@Override
	public List<BorrowWithBookName> getAllBorrow() {
		return borrowMapper.getAllBorrow();
	}

	@Override
	public List<BorrowWithBookName> getAllBorrowByBookName(String tag) {
		return borrowMapper.getAllBorrowByBookName(tag);
	}
}

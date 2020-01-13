package com.colin.service.impl;

import com.colin.bean.Book;
import com.colin.bean.Guest;
import com.colin.bean.User;
import com.colin.mapper.YiBiaoPanMapper;
import com.colin.service.YiBiaoPanService;
import com.colin.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class YiBiaoPanServiceImpl implements YiBiaoPanService
{
    @Autowired
    YiBiaoPanMapper yiBiaoPanMapper;
    @Override
    public int selectBookCount(int id)
    {
        return yiBiaoPanMapper.selectBookCount(id);
    }

    @Override
    public int selectGuestCount(int id)
    {
        return yiBiaoPanMapper.selectGuestCount(id);
    }

    @Override
    public int selectFileCount(int id)
    {
        return yiBiaoPanMapper.selectFileCount(id);
    }

    @Override
    public int selectFriendLinkCount(int id)
    {
        return yiBiaoPanMapper.selectFriendLinkCount(id);
    }

    @Override
    public List<Book> selectBook(int id)
    {
        return yiBiaoPanMapper.selectBook(id);
    }

    @Override
    public List<Guest> selectGuest(int id)
    {
        return yiBiaoPanMapper.selectGuest(id);
    }

    @Override
    public List<Guest> selectGuestUserName(List<Guest> list) throws ParseException
    {
        List<Guest> list1 = new ArrayList<>();
        for (Guest param : list) {
            Date time = DateUtil.parseTime2(param.getGuestCreateTime());
            String date = new SimpleDateFormat("yyyy年MM月dd日").format(time);
            param.setGuestCreateTime(date);
            User user = yiBiaoPanMapper.selectGuestUserName(param.getUserId());
            param.setUser(user);
            list1.add(param);
        }
        return list1;
    }

    @Override
    public void insertGuest(String createTime, String guest, int userId, int targetId)
    {
        yiBiaoPanMapper.insertGuest(createTime, guest, userId, targetId);
    }
}

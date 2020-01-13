package com.colin.service.impl;

import com.colin.bean.FriendLink;
import com.colin.mapper.FriendLinkMapper;
import com.colin.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FriendLinkServiceImpl implements FriendLinkService
{
    @Autowired
    FriendLinkMapper friendLinkMapper;
    @Override
    public void insertFriendLink(FriendLink friendLink)
    {
        friendLinkMapper.insertFriendLink(friendLink);
    }

    @Override
    public List<FriendLink> selectFriendLink(int id)
    {
        return friendLinkMapper.selectFriendLink(id);
    }

    @Override
    public FriendLink selectFriendLink2(int id)
    {
        return friendLinkMapper.selectFriendLink2(id);
    }

    @Override
    public void updateFriendLink(FriendLink friendLink)
    {
        friendLinkMapper.updateFriendLink(friendLink);
    }

    @Override
    public void deleteFriendLink(Integer id)
    {
        friendLinkMapper.deleteFriendLink(id);
    }
}

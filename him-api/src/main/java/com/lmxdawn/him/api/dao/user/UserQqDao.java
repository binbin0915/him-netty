package com.lmxdawn.him.api.dao.user;

import com.lmxdawn.him.common.entity.user.UserQq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserQqDao {

    /**
     * 根据Uid查询
     * @param openId
     * @return
     */
    UserQq findByOpenId(String openId);

    /**
     * 插入
     * @param userQq
     * @return
     */
    boolean insertUserQq(UserQq userQq);

    /**
     * 删除
     * @param uid
     * @return
     */
    boolean deleteByUid(Long uid);

}

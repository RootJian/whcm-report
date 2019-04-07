package com.whcm.report.mapper;

import com.whcm.report.domain.WxUser;
import java.util.List;	

/**
 * 小程序用户 数据层
 * 
 * @author dong.chao
 * @date 2019-04-07
 */
public interface WxUserMapper 
{
	/**
     * 查询小程序用户信息
     * 
     * @param wxUserId 小程序用户ID
     * @return 小程序用户信息
     */
	public WxUser selectWxUserById(Integer wxUserId);
	
	/**
     * 查询小程序用户列表
     * 
     * @param wxUser 小程序用户信息
     * @return 小程序用户集合
     */
	public List<WxUser> selectWxUserList(WxUser wxUser);
	
	/**
     * 新增小程序用户
     * 
     * @param wxUser 小程序用户信息
     * @return 结果
     */
	public int insertWxUser(WxUser wxUser);
	
	/**
     * 修改小程序用户
     * 
     * @param wxUser 小程序用户信息
     * @return 结果
     */
	public int updateWxUser(WxUser wxUser);
	
	/**
     * 删除小程序用户
     * 
     * @param wxUserId 小程序用户ID
     * @return 结果
     */
	public int deleteWxUserById(Integer wxUserId);
	
	/**
     * 批量删除小程序用户
     * 
     * @param wxUserIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteWxUserByIds(String[] wxUserIds);
	
}
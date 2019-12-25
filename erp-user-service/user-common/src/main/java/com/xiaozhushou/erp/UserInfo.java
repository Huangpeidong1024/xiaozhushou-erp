package com.xiaozhushou.erp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 用户基本信息
 * @ProjectName: xiaozhushou-erp
 * @Package: com.xiaozhushou.erp
 * @Author: HuangPeiDong
 * @CreateDate: 2019/12/25 10:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private String userCode;
    private String userName;

    public static UserInfo invalid() {
        return new UserInfo("", "");
    }
}

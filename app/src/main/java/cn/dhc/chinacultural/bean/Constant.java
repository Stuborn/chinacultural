package cn.dhc.chinacultural.bean;

/**
 * 常量
 * Created by zbw on 2018/4/19 15:35.
 */

public class Constant {
	public static final String IP = "http://192.168.0.5";

	public static final String HTTPSURL = IP + ":8080/zcm/";
	/**
	 * 登录
	 */
	public static final String URL_LOGIN = HTTPSURL + "zcmlogin/validate?userId=zanboshuai&password=E10ADC3949BA59ABBE56E057F20F883E";
	/**
	 * 获得栏目列表
	 */
	public static final String URL_GETCOLUMNLIST = "http://192.168.0.37:8086/zcm/zcm/nrfb/app/getAppCategory";

}

package cn.dhc.chinacultural.bean;

/**
 * 常量
 * Created by zbw on 2018/4/19 15:35.
 */

public class Constant {
//	public static final String IP = "http://192.168.0.28";
//
//	public static final String HTTPSURL = IP + ":8086/zcm/";
	public static final String IP = "http://172.10.103.41";

	public static final String HTTPSURL = IP + ":8080/zcm/";
	/**
	 * 登录
	 */
	public static final String URL_LOGIN = HTTPSURL + "zcmlogin/validate?userId=zanboshuai&password=E10ADC3949BA59ABBE56E057F20F883E";
	/**
	 * 获得栏目列表
	 */
	public static final String URL_GETCOLUMNLIST = HTTPSURL +"zcm/nrfb/app/getAppCategory";
	/**
	 * 获得文章列表
	 */
	public static final String URL_GETARTICLELIST = HTTPSURL +"zcm/nrfb/app/getAppArticleList/1/2018-04-25%2019:17:34/";

}

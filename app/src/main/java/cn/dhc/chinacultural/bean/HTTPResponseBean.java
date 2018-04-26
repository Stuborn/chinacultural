package cn.dhc.chinacultural.bean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

import cn.dhc.chinacultural.utils.LogUtils;

/**
 * 网络请求返回类
 * Created by kevin on 2017/1/12.
 */

public class HTTPResponseBean {
//    {"retCode":"fail","retMsg":"请求参数有误","retSign":""}

	@Override
	public String toString() {
		return "HTTPResponseBean{" +
				"success='" + success + '\'' +
				", statusCode='" + statusCode + '\'' +
				", message='" + message + '\'' +
				", token='" + token + '\'' +
				", iframeDown='" + iframeDown + '\'' +
				", data=" + data +
				'}';
	}

	/**
	 * 请求成功状态
	 */
	@SerializedName("success")
	public String success;
	/**
	 * 返回信息值
	 */
	@SerializedName("statusCode")
	public String statusCode;
	/**
	 * 请求返回的信息
	 */
	@SerializedName("message")
	public String message;
	/**
	 * 请求返回的token
	 */
	@SerializedName("token")
	public String token;
	/**  */
	@SerializedName("iframeDown")
	public String iframeDown;
	/**
	 * 请求返回的数据内容
	 */
	@SerializedName("data")
	public Object data;

	/**
	 * 获取返回结果实体类
	 *
	 * @param mClass
	 * @return
	 */
	public Object getPesponseBean(Class mClass) {
		LogUtils.e("getPesponseBean=====", data.toString());
		Gson g = new GsonBuilder().serializeNulls().create();

		return g.fromJson(data.toString(), mClass);
	}

	/**
	 * 获取返回结果实体类(解list使用)
	 *
	 * @param type
	 * @return
	 */
	public Object getPesponseBean(Type type) {
		LogUtils.e("getPesponseBean=====", data.toString());
		Gson g = new GsonBuilder().serializeNulls().create();
		return g.fromJson(data.toString(), type);
	}

}

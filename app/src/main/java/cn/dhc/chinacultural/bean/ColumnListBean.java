package cn.dhc.chinacultural.bean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.List;

import cn.dhc.chinacultural.utils.LogUtils;

/**
 * 栏目列表Bean
 * Created by zbw on 2018/4/26 20:06.
 */

public class ColumnListBean {

	@Override
	public String toString() {
		return "ColumnListBean{" +
				"success=" + success +
				", statusCode=" + statusCode +
				", message='" + message + '\'' +
				", token=" + token +
				", iframeDown=" + iframeDown +
				", data=" + data +
				'}';
	}

	/**
	 * success : true
	 * statusCode : 200
	 * message :
	 * token : null
	 * iframeDown : false
	 * data : {"categorydata":[{"ID_":"1","NAME_":"一级栏目1","ORDERS_":1,"LEVEL_":1,"ICON_":null,"PID_":null,"TYPE_":1,"DESCRIPTION_":"描述1","ALIAS_":null,"NAVIGATION_ID_":1,"STATUS_":1,"CRT_USER_":"admin","CRT_TIME_":1523289600000,"UPD_USER_":null,"UPD_TIME_":null,"DEL_USER_":null,"DEL_TIME_":null},{"ID_":"2","NAME_":"一级栏目2","ORDERS_":2,"LEVEL_":1,"ICON_":null,"PID_":null,"TYPE_":1,"DESCRIPTION_":"描述2","ALIAS_":null,"NAVIGATION_ID_":1,"STATUS_":1,"CRT_USER_":"admin","CRT_TIME_":1523289600000,"UPD_USER_":null,"UPD_TIME_":null,"DEL_USER_":null,"DEL_TIME_":null},{"ID_":"3","NAME_":"一级栏目3","ORDERS_":3,"LEVEL_":1,"ICON_":null,"PID_":null,"TYPE_":1,"DESCRIPTION_":"描述3","ALIAS_":null,"NAVIGATION_ID_":1,"STATUS_":1,"CRT_USER_":"admin","CRT_TIME_":1523289600000,"UPD_USER_":null,"UPD_TIME_":null,"DEL_USER_":null,"DEL_TIME_":null},{"ID_":"11","NAME_":"二级栏目1-1","ORDERS_":1,"LEVEL_":2,"ICON_":null,"PID_":1,"TYPE_":1,"DESCRIPTION_":null,"ALIAS_":null,"NAVIGATION_ID_":1,"STATUS_":1,"CRT_USER_":"admin","CRT_TIME_":1523289600000,"UPD_USER_":null,"UPD_TIME_":null,"DEL_USER_":null,"DEL_TIME_":null},{"ID_":"12","NAME_":"二级栏目1-2","ORDERS_":3,"LEVEL_":2,"ICON_":null,"PID_":1,"TYPE_":1,"DESCRIPTION_":null,"ALIAS_":null,"NAVIGATION_ID_":1,"STATUS_":1,"CRT_USER_":"admin","CRT_TIME_":1523289600000,"UPD_USER_":null,"UPD_TIME_":null,"DEL_USER_":null,"DEL_TIME_":null},{"ID_":"13","NAME_":"二级栏目1-3","ORDERS_":3,"LEVEL_":2,"ICON_":null,"PID_":1,"TYPE_":1,"DESCRIPTION_":null,"ALIAS_":null,"NAVIGATION_ID_":1,"STATUS_":1,"CRT_USER_":"admin","CRT_TIME_":1523289600000,"UPD_USER_":null,"UPD_TIME_":null,"DEL_USER_":null,"DEL_TIME_":null},{"ID_":"14","NAME_":"二级栏目1-4","ORDERS_":4,"LEVEL_":2,"ICON_":null,"PID_":1,"TYPE_":1,"DESCRIPTION_":null,"ALIAS_":null,"NAVIGATION_ID_":1,"STATUS_":1,"CRT_USER_":"admin","CRT_TIME_":1523289600000,"UPD_USER_":null,"UPD_TIME_":null,"DEL_USER_":null,"DEL_TIME_":null},{"ID_":"21","NAME_":"二级栏目2-1","ORDERS_":1,"LEVEL_":2,"ICON_":null,"PID_":2,"TYPE_":1,"DESCRIPTION_":null,"ALIAS_":null,"NAVIGATION_ID_":1,"STATUS_":1,"CRT_USER_":"admin","CRT_TIME_":1523289600000,"UPD_USER_":null,"UPD_TIME_":null,"DEL_USER_":null,"DEL_TIME_":null},{"ID_":"22","NAME_":"二级栏目2-2","ORDERS_":3,"LEVEL_":2,"ICON_":null,"PID_":2,"TYPE_":1,"DESCRIPTION_":null,"ALIAS_":null,"NAVIGATION_ID_":1,"STATUS_":1,"CRT_USER_":"admin","CRT_TIME_":1523289600000,"UPD_USER_":null,"UPD_TIME_":null,"DEL_USER_":null,"DEL_TIME_":null},{"ID_":"31","NAME_":"二级栏目3-1","ORDERS_":1,"LEVEL_":2,"ICON_":null,"PID_":3,"TYPE_":1,"DESCRIPTION_":null,"ALIAS_":null,"NAVIGATION_ID_":1,"STATUS_":1,"CRT_USER_":"admin","CRT_TIME_":1523289600000,"UPD_USER_":null,"UPD_TIME_":null,"DEL_USER_":null,"DEL_TIME_":null},{"ID_":"121","NAME_":"三级栏目1-2-1","ORDERS_":1,"LEVEL_":3,"ICON_":null,"PID_":12,"TYPE_":1,"DESCRIPTION_":null,"ALIAS_":null,"NAVIGATION_ID_":1,"STATUS_":1,"CRT_USER_":"admin","CRT_TIME_":1523289600000,"UPD_USER_":null,"UPD_TIME_":null,"DEL_USER_":null,"DEL_TIME_":null}]}
	 */

	private boolean success;
	private int statusCode;
	private String message;
	private Object token;
	private boolean iframeDown;
	private DataBean data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getToken() {
		return token;
	}

	public void setToken(Object token) {
		this.token = token;
	}

	public boolean isIframeDown() {
		return iframeDown;
	}

	public void setIframeDown(boolean iframeDown) {
		this.iframeDown = iframeDown;
	}

	public DataBean getData() {
		return data;
	}

	public void setData(DataBean data) {
		this.data = data;
	}

	public static class DataBean {
		@Override
		public String toString() {
			return "DataBean{" +
					"categorydata=" + categorydata +
					'}';
		}

		private List<CategorydataBean> categorydata;

		public List<CategorydataBean> getCategorydata() {
			return categorydata;
		}

		public void setCategorydata(List<CategorydataBean> categorydata) {
			this.categorydata = categorydata;
		}

		/**
		 * 获取返回结果实体类(解list使用)
		 *
		 * @param type
		 * @return
		 */
		public Object getPesponseBean(Type type) {
			LogUtils.e("getPesponseBean=====", categorydata.toString());
			Gson g = new GsonBuilder().serializeNulls().create();
			return g.fromJson(categorydata.toString(), type);
		}

		public static class CategorydataBean {


			@Override
			public String toString() {
				return "CategorydataBean{" +
						"ID_='" + ID_ + '\'' +
						", NAME_='" + NAME_ + '\'' +
						", ORDERS_=" + ORDERS_ +
						", LEVEL_=" + LEVEL_ +
						", ICON_=" + ICON_ +
						", PID_=" + PID_ +
						", TYPE_=" + TYPE_ +
						", DESCRIPTION_='" + DESCRIPTION_ + '\'' +
						", ALIAS_=" + ALIAS_ +
						", NAVIGATION_ID_=" + NAVIGATION_ID_ +
						", STATUS_=" + STATUS_ +
						", CRT_USER_='" + CRT_USER_ + '\'' +
						", CRT_TIME_=" + CRT_TIME_ +
						", UPD_USER_=" + UPD_USER_ +
						", UPD_TIME_=" + UPD_TIME_ +
						", DEL_USER_=" + DEL_USER_ +
						", DEL_TIME_=" + DEL_TIME_ +
						'}';
			}

			/**
			 * ID_ : 1
			 * NAME_ : 一级栏目1
			 * ORDERS_ : 1
			 * LEVEL_ : 1
			 * ICON_ : null
			 * PID_ : null
			 * TYPE_ : 1
			 * DESCRIPTION_ : 描述1
			 * ALIAS_ : null
			 * NAVIGATION_ID_ : 1
			 * STATUS_ : 1
			 * CRT_USER_ : admin
			 * CRT_TIME_ : 1523289600000
			 * UPD_USER_ : null
			 * UPD_TIME_ : null
			 * DEL_USER_ : null
			 * DEL_TIME_ : null
			 */

			private String ID_;
			private String NAME_;
			private int ORDERS_;
			private int LEVEL_;
			private Object ICON_;
			private Object PID_;
			private int TYPE_;
			private String DESCRIPTION_;
			private Object ALIAS_;
			private int NAVIGATION_ID_;
			private int STATUS_;
			private String CRT_USER_;
			private long CRT_TIME_;
			private Object UPD_USER_;
			private Object UPD_TIME_;
			private Object DEL_USER_;
			private Object DEL_TIME_;

			public String getID_() {
				return ID_;
			}

			public void setID_(String ID_) {
				this.ID_ = ID_;
			}

			public String getNAME_() {
				return NAME_;
			}

			public void setNAME_(String NAME_) {
				this.NAME_ = NAME_;
			}

			public int getORDERS_() {
				return ORDERS_;
			}

			public void setORDERS_(int ORDERS_) {
				this.ORDERS_ = ORDERS_;
			}

			public int getLEVEL_() {
				return LEVEL_;
			}

			public void setLEVEL_(int LEVEL_) {
				this.LEVEL_ = LEVEL_;
			}

			public Object getICON_() {
				return ICON_;
			}

			public void setICON_(Object ICON_) {
				this.ICON_ = ICON_;
			}

			public Object getPID_() {
				return PID_;
			}

			public void setPID_(Object PID_) {
				this.PID_ = PID_;
			}

			public int getTYPE_() {
				return TYPE_;
			}

			public void setTYPE_(int TYPE_) {
				this.TYPE_ = TYPE_;
			}

			public String getDESCRIPTION_() {
				return DESCRIPTION_;
			}

			public void setDESCRIPTION_(String DESCRIPTION_) {
				this.DESCRIPTION_ = DESCRIPTION_;
			}

			public Object getALIAS_() {
				return ALIAS_;
			}

			public void setALIAS_(Object ALIAS_) {
				this.ALIAS_ = ALIAS_;
			}

			public int getNAVIGATION_ID_() {
				return NAVIGATION_ID_;
			}

			public void setNAVIGATION_ID_(int NAVIGATION_ID_) {
				this.NAVIGATION_ID_ = NAVIGATION_ID_;
			}

			public int getSTATUS_() {
				return STATUS_;
			}

			public void setSTATUS_(int STATUS_) {
				this.STATUS_ = STATUS_;
			}

			public String getCRT_USER_() {
				return CRT_USER_;
			}

			public void setCRT_USER_(String CRT_USER_) {
				this.CRT_USER_ = CRT_USER_;
			}

			public long getCRT_TIME_() {
				return CRT_TIME_;
			}

			public void setCRT_TIME_(long CRT_TIME_) {
				this.CRT_TIME_ = CRT_TIME_;
			}

			public Object getUPD_USER_() {
				return UPD_USER_;
			}

			public void setUPD_USER_(Object UPD_USER_) {
				this.UPD_USER_ = UPD_USER_;
			}

			public Object getUPD_TIME_() {
				return UPD_TIME_;
			}

			public void setUPD_TIME_(Object UPD_TIME_) {
				this.UPD_TIME_ = UPD_TIME_;
			}

			public Object getDEL_USER_() {
				return DEL_USER_;
			}

			public void setDEL_USER_(Object DEL_USER_) {
				this.DEL_USER_ = DEL_USER_;
			}

			public Object getDEL_TIME_() {
				return DEL_TIME_;
			}

			public void setDEL_TIME_(Object DEL_TIME_) {
				this.DEL_TIME_ = DEL_TIME_;
			}
		}
	}
}

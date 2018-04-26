package cn.dhc.chinacultural.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2018/4/26.
 */

public class LanMuYiBean {

    /**
     * success : true
     * statusCode : 200
     * message : 读取成功
     * token : -999
     * total : 10
     * rows : [{"id":"lzg_10","title":"title10","source":null,"warehousedTime":null,"allowcomments":null,"categoryId":"1","categoryName":"一级栏目1","articelFrom":"","publishTime":"2018-04-24 19:17:34","thumbnail":null,"templateId":"3","original":"1","h5URL":null,"postNum":null},{"id":"lzg_9","title":"title9","source":null,"warehousedTime":null,"allowcomments":null,"categoryId":"1","categoryName":"一级栏目1","articelFrom":"","publishTime":"2018-04-23 19:17:34","thumbnail":null,"templateId":"3","original":"1","h5URL":null,"postNum":null},{"id":"lzg_8","title":"title8","source":null,"warehousedTime":null,"allowcomments":null,"categoryId":"1","categoryName":"一级栏目1","articelFrom":"","publishTime":"2018-04-22 19:17:34","thumbnail":null,"templateId":"2","original":"1","h5URL":null,"postNum":null},{"id":"lzg_7","title":"title7","source":null,"warehousedTime":null,"allowcomments":null,"categoryId":"1","categoryName":"一级栏目1","articelFrom":"","publishTime":"2018-04-21 19:17:34","thumbnail":null,"templateId":"2","original":"1","h5URL":null,"postNum":null},{"id":"lzg_6","title":"title6","source":null,"warehousedTime":null,"allowcomments":null,"categoryId":"1","categoryName":"一级栏目1","articelFrom":"","publishTime":"2018-04-20 19:17:34","thumbnail":null,"templateId":"1","original":"1","h5URL":null,"postNum":null},{"id":"lzg_5","title":"title5","source":null,"warehousedTime":null,"allowcomments":null,"categoryId":"1","categoryName":"一级栏目1","articelFrom":"","publishTime":"2018-04-19 19:17:34","thumbnail":null,"templateId":"1","original":"1","h5URL":null,"postNum":null},{"id":"lzg_4","title":"title4","source":null,"warehousedTime":null,"allowcomments":null,"categoryId":"1","categoryName":"一级栏目1","articelFrom":"","publishTime":"2018-04-18 19:17:34","thumbnail":null,"templateId":"1","original":"1","h5URL":null,"postNum":null},{"id":"lzg_3","title":"title3","source":null,"warehousedTime":null,"allowcomments":null,"categoryId":"1","categoryName":"一级栏目1","articelFrom":"","publishTime":"2018-04-17 19:17:34","thumbnail":null,"templateId":"0","original":"1","h5URL":null,"postNum":null},{"id":"lzg_2","title":"title2","source":null,"warehousedTime":null,"allowcomments":null,"categoryId":"1","categoryName":"一级栏目1","articelFrom":"","publishTime":"2018-04-16 19:17:34","thumbnail":null,"templateId":"0","original":"1","h5URL":null,"postNum":null},{"id":"lzg_1","title":"title1","source":null,"warehousedTime":null,"allowcomments":null,"categoryId":"1","categoryName":"一级栏目1","articelFrom":"","publishTime":"2018-04-15 19:17:34","thumbnail":null,"templateId":"0","original":"1","h5URL":null,"postNum":null}]
     * records : []
     * sqlinfo : {"sql":" SELECT A.TITLE_,'' ARTICLEFROM_,TO_CHAR(B.PUBLISH_TIME_,'YYYY-MM-DD HH24:MI:SS') PUBLISH_TIME_,'' PIC,C.TEMPLATE_ID_,A.ID_,D.ID_ CATEGORY_ID_,D.NAME_,A.SOURCE_ FROM PRODUCT_ARTICLE A,PRODUCT_CATEGORY B,PRODUCT_TEMPLATE C,APP_CATEGORY D WHERE A.ID_ = B.ARTICLE_ID_ AND B.ID_ = C.ARTICLE_CATEGORY_ID_ AND B.CATEGORY_ID_ = D.ID_ AND D.ID_ = ? AND B.PUBLISH_TIME_ <= TO_DATE(?,'YYYY-MM-DD HH24:MI:SS') ","sqlPaged":"SELECT * FROM( SELECT ROWNUM ROWNUM_, A.* FROM ( SELECT A.TITLE_,'' ARTICLEFROM_,TO_CHAR(B.PUBLISH_TIME_,'YYYY-MM-DD HH24:MI:SS') PUBLISH_TIME_,'' PIC,C.TEMPLATE_ID_,A.ID_,D.ID_ CATEGORY_ID_,D.NAME_,A.SOURCE_ FROM PRODUCT_ARTICLE A,PRODUCT_CATEGORY B,PRODUCT_TEMPLATE C,APP_CATEGORY D WHERE A.ID_ = B.ARTICLE_ID_ AND B.ID_ = C.ARTICLE_CATEGORY_ID_ AND B.CATEGORY_ID_ = D.ID_ AND D.ID_ = ? AND B.PUBLISH_TIME_ <= TO_DATE(?,'YYYY-MM-DD HH24:MI:SS') ) A WHERE ROWNUM <= 10 ) WHERE ROWNUM_ >= 1 ","args":["1","2018-04-25 19:17:34"],"page":1,"pageRows":10,"totalPage":1,"begin":1,"end":10}
     */

    private boolean success;
    private int statusCode;
    private String message;
    private String token;
    private int total;
    private SqlinfoBean sqlinfo;
    private List<RowsBean> rows;
    private List<?> records;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public SqlinfoBean getSqlinfo() {
        return sqlinfo;
    }

    public void setSqlinfo(SqlinfoBean sqlinfo) {
        this.sqlinfo = sqlinfo;
    }

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public List<?> getRecords() {
        return records;
    }

    public void setRecords(List<?> records) {
        this.records = records;
    }

    public static class SqlinfoBean {
        /**
         * sql :  SELECT A.TITLE_,'' ARTICLEFROM_,TO_CHAR(B.PUBLISH_TIME_,'YYYY-MM-DD HH24:MI:SS') PUBLISH_TIME_,'' PIC,C.TEMPLATE_ID_,A.ID_,D.ID_ CATEGORY_ID_,D.NAME_,A.SOURCE_ FROM PRODUCT_ARTICLE A,PRODUCT_CATEGORY B,PRODUCT_TEMPLATE C,APP_CATEGORY D WHERE A.ID_ = B.ARTICLE_ID_ AND B.ID_ = C.ARTICLE_CATEGORY_ID_ AND B.CATEGORY_ID_ = D.ID_ AND D.ID_ = ? AND B.PUBLISH_TIME_ <= TO_DATE(?,'YYYY-MM-DD HH24:MI:SS')
         * sqlPaged : SELECT * FROM( SELECT ROWNUM ROWNUM_, A.* FROM ( SELECT A.TITLE_,'' ARTICLEFROM_,TO_CHAR(B.PUBLISH_TIME_,'YYYY-MM-DD HH24:MI:SS') PUBLISH_TIME_,'' PIC,C.TEMPLATE_ID_,A.ID_,D.ID_ CATEGORY_ID_,D.NAME_,A.SOURCE_ FROM PRODUCT_ARTICLE A,PRODUCT_CATEGORY B,PRODUCT_TEMPLATE C,APP_CATEGORY D WHERE A.ID_ = B.ARTICLE_ID_ AND B.ID_ = C.ARTICLE_CATEGORY_ID_ AND B.CATEGORY_ID_ = D.ID_ AND D.ID_ = ? AND B.PUBLISH_TIME_ <= TO_DATE(?,'YYYY-MM-DD HH24:MI:SS') ) A WHERE ROWNUM <= 10 ) WHERE ROWNUM_ >= 1
         * args : ["1","2018-04-25 19:17:34"]
         * page : 1
         * pageRows : 10
         * totalPage : 1
         * begin : 1
         * end : 10
         */

        private String sql;
        private String sqlPaged;
        private int page;
        private int pageRows;
        private int totalPage;
        private int begin;
        private int end;
        private List<String> args;

        public String getSql() {
            return sql;
        }

        public void setSql(String sql) {
            this.sql = sql;
        }

        public String getSqlPaged() {
            return sqlPaged;
        }

        public void setSqlPaged(String sqlPaged) {
            this.sqlPaged = sqlPaged;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPageRows() {
            return pageRows;
        }

        public void setPageRows(int pageRows) {
            this.pageRows = pageRows;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getBegin() {
            return begin;
        }

        public void setBegin(int begin) {
            this.begin = begin;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public List<String> getArgs() {
            return args;
        }

        public void setArgs(List<String> args) {
            this.args = args;
        }
    }

    public static class RowsBean {
        /**
         * id : lzg_10
         * title : title10
         * source : null
         * warehousedTime : null
         * allowcomments : null
         * categoryId : 1
         * categoryName : 一级栏目1
         * articelFrom :
         * publishTime : 2018-04-24 19:17:34
         * thumbnail : null
         * templateId : 3
         * original : 1
         * h5URL : null
         * postNum : null
         */

        private String id;
        private String title;
        private Object source;
        private Object warehousedTime;
        private Object allowcomments;
        private String categoryId;
        private String categoryName;
        private String articelFrom;
        private String publishTime;
        private Object thumbnail;
        private String templateId;
        private String original;
        private Object h5URL;
        private Object postNum;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Object getSource() {
            return source;
        }

        public void setSource(Object source) {
            this.source = source;
        }

        public Object getWarehousedTime() {
            return warehousedTime;
        }

        public void setWarehousedTime(Object warehousedTime) {
            this.warehousedTime = warehousedTime;
        }

        public Object getAllowcomments() {
            return allowcomments;
        }

        public void setAllowcomments(Object allowcomments) {
            this.allowcomments = allowcomments;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public String getArticelFrom() {
            return articelFrom;
        }

        public void setArticelFrom(String articelFrom) {
            this.articelFrom = articelFrom;
        }

        public String getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(String publishTime) {
            this.publishTime = publishTime;
        }

        public Object getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(Object thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getTemplateId() {
            return templateId;
        }

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public String getOriginal() {
            return original;
        }

        public void setOriginal(String original) {
            this.original = original;
        }

        public Object getH5URL() {
            return h5URL;
        }

        public void setH5URL(Object h5URL) {
            this.h5URL = h5URL;
        }

        public Object getPostNum() {
            return postNum;
        }

        public void setPostNum(Object postNum) {
            this.postNum = postNum;
        }
    }
}

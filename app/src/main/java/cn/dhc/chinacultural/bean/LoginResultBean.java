package cn.dhc.chinacultural.bean;

import java.util.List;

/**
 * Created by longzeqiu on 2018/4/26.
 */

public class LoginResultBean {

    /**
     * success : true
     * statusCode : 200
     * message :
     * token : null
     * iframeDown : false
     * data : {"sessionId":"C1CE79161C1E56BF0373AD1D86B53997","token":"493CFA45E4BD381BBDC31583735A9108EA4AD9B54503F96D1E741C5013D3DEDA","userId":"zanboshuai","userName":"昝博帅","password":"","verifyCode":"","isVerifyCode":"","telephone":"","mobile":"","mail":"","loginIp":"192.168.0.47","loginMac":"","depId":"1","depName":"系统维护","loginType":"LOGIN","loginDate":"2018-04-26 15:40:55","requestURI":"","themes":"","currentSys":"","role":{"A":[{"id":"58","name":"系统维护"}]},"businessId":null,"business":{"A":[{"id":"zcm-nrsc","text":"内容生产","url":"/zcm/nrsc"},{"id":"zcm-xgk","text":"选稿库","url":"/zcm/xgk"},{"id":"zcm-nrbj","text":"内容编辑","children":[{"id":"zcm-nrbj-db","text":"待编","url":"/zcm/nrbj/db"},{"id":"zcm-nrbj-ds","text":"待审","url":"/zcm/nrbj/ds"},{"id":"zcm-nrbj-ys","text":"已审","url":"/zcm/nrbj/ys"},{"id":"zcm-nrbj-bbh","text":"被驳回","url":"/zcm/nrbj/bbh"},{"id":"zcm-nrbj-gjrz","text":"稿件日志","url":"/zcm/nrbj/gjrz"}]},{"id":"zcm-nrsh","text":"内容审核","url":"/zcm/nrsh"},{"id":"zcm-nrfb","text":"内容发布","children":[{"id":"zcm-nrfb-app","text":"APP","url":"/zcm/nrfb/app"},{"id":"zcm-nrfb-wb","text":"微博","url":"/zcm/nrfb/wb"},{"id":"zcm-nrfb-wx","text":"微信","url":"/zcm/nrfb/wx"}]},{"id":"zcm-zb","text":"直播","url":"/zcm/zb"},{"id":"zcm-sck","text":"素材库","children":[{"id":"zcm-sck-wzgl","text":"文章管理","url":"/zcm/sck/wzgl"},{"id":"zcm-sck-tpgl","text":"图片管理","url":"/zcm/sck/tpgl"},{"id":"zcm-sck-ypgl","text":"音频管理","url":"/zcm/sck/ypgl"},{"id":"zcm-sck-spgl","text":"视频管理","url":"/zcm/sck/spgl"}]},{"id":"zcm-cpk","text":"成品库","children":[{"id":"zcm-cpk-szbgl","text":"数字报管理","url":"/zcm/cpk/szbgl"},{"id":"zcm-cpk-gjgl","text":"稿件管理","url":"/zcm/cpk/gjgl"}]},{"id":"zcm-lsk","text":"历史库","url":"/zcm/lsk"},{"id":"zcm-lmgl","text":"栏目管理","url":"/zcm/lmgl"},{"id":"zcm-dhgl","text":"导航管理","url":"/zcm/dhgl"},{"id":"zcm-tjnr","text":"推荐内容","url":"/zcm/tjnr"},{"id":"zcm-ztgl","text":"专题管理","url":"/zcm/ztgl"},{"id":"zcm-ygk","text":"云稿库","children":[{"id":"zcm-ygk-gxlb","text":"共享列表","url":"/zcm/ygk/gxlb"},{"id":"zcm-ygk-wdgx","text":"我的共享","url":"/zcm/ygk/wdgx"}]},{"id":"zcm-tj","text":"统计","children":[{"id":"zcm-tj-bjph","text":"编辑排行","url":"/zcm/tj/bjph"},{"id":"zcm-tj-rdph","text":"热度排行","url":"/zcm/tj/rdph"}]}]}}
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
        /**
         * sessionId : C1CE79161C1E56BF0373AD1D86B53997
         * token : 493CFA45E4BD381BBDC31583735A9108EA4AD9B54503F96D1E741C5013D3DEDA
         * userId : zanboshuai
         * userName : 昝博帅
         * password :
         * verifyCode :
         * isVerifyCode :
         * telephone :
         * mobile :
         * mail :
         * loginIp : 192.168.0.47
         * loginMac :
         * depId : 1
         * depName : 系统维护
         * loginType : LOGIN
         * loginDate : 2018-04-26 15:40:55
         * requestURI :
         * themes :
         * currentSys :
         * role : {"A":[{"id":"58","name":"系统维护"}]}
         * businessId : null
         * business : {"A":[{"id":"zcm-nrsc","text":"内容生产","url":"/zcm/nrsc"},{"id":"zcm-xgk","text":"选稿库","url":"/zcm/xgk"},{"id":"zcm-nrbj","text":"内容编辑","children":[{"id":"zcm-nrbj-db","text":"待编","url":"/zcm/nrbj/db"},{"id":"zcm-nrbj-ds","text":"待审","url":"/zcm/nrbj/ds"},{"id":"zcm-nrbj-ys","text":"已审","url":"/zcm/nrbj/ys"},{"id":"zcm-nrbj-bbh","text":"被驳回","url":"/zcm/nrbj/bbh"},{"id":"zcm-nrbj-gjrz","text":"稿件日志","url":"/zcm/nrbj/gjrz"}]},{"id":"zcm-nrsh","text":"内容审核","url":"/zcm/nrsh"},{"id":"zcm-nrfb","text":"内容发布","children":[{"id":"zcm-nrfb-app","text":"APP","url":"/zcm/nrfb/app"},{"id":"zcm-nrfb-wb","text":"微博","url":"/zcm/nrfb/wb"},{"id":"zcm-nrfb-wx","text":"微信","url":"/zcm/nrfb/wx"}]},{"id":"zcm-zb","text":"直播","url":"/zcm/zb"},{"id":"zcm-sck","text":"素材库","children":[{"id":"zcm-sck-wzgl","text":"文章管理","url":"/zcm/sck/wzgl"},{"id":"zcm-sck-tpgl","text":"图片管理","url":"/zcm/sck/tpgl"},{"id":"zcm-sck-ypgl","text":"音频管理","url":"/zcm/sck/ypgl"},{"id":"zcm-sck-spgl","text":"视频管理","url":"/zcm/sck/spgl"}]},{"id":"zcm-cpk","text":"成品库","children":[{"id":"zcm-cpk-szbgl","text":"数字报管理","url":"/zcm/cpk/szbgl"},{"id":"zcm-cpk-gjgl","text":"稿件管理","url":"/zcm/cpk/gjgl"}]},{"id":"zcm-lsk","text":"历史库","url":"/zcm/lsk"},{"id":"zcm-lmgl","text":"栏目管理","url":"/zcm/lmgl"},{"id":"zcm-dhgl","text":"导航管理","url":"/zcm/dhgl"},{"id":"zcm-tjnr","text":"推荐内容","url":"/zcm/tjnr"},{"id":"zcm-ztgl","text":"专题管理","url":"/zcm/ztgl"},{"id":"zcm-ygk","text":"云稿库","children":[{"id":"zcm-ygk-gxlb","text":"共享列表","url":"/zcm/ygk/gxlb"},{"id":"zcm-ygk-wdgx","text":"我的共享","url":"/zcm/ygk/wdgx"}]},{"id":"zcm-tj","text":"统计","children":[{"id":"zcm-tj-bjph","text":"编辑排行","url":"/zcm/tj/bjph"},{"id":"zcm-tj-rdph","text":"热度排行","url":"/zcm/tj/rdph"}]}]}
         */

        private String sessionId;
        private String token;
        private String userId;
        private String userName;
        private String password;
        private String verifyCode;
        private String isVerifyCode;
        private String telephone;
        private String mobile;
        private String mail;
        private String loginIp;
        private String loginMac;
        private String depId;
        private String depName;
        private String loginType;
        private String loginDate;
        private String requestURI;
        private String themes;
        private String currentSys;
        private RoleBean role;
        private Object businessId;
        private BusinessBean business;

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getVerifyCode() {
            return verifyCode;
        }

        public void setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
        }

        public String getIsVerifyCode() {
            return isVerifyCode;
        }

        public void setIsVerifyCode(String isVerifyCode) {
            this.isVerifyCode = isVerifyCode;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getLoginIp() {
            return loginIp;
        }

        public void setLoginIp(String loginIp) {
            this.loginIp = loginIp;
        }

        public String getLoginMac() {
            return loginMac;
        }

        public void setLoginMac(String loginMac) {
            this.loginMac = loginMac;
        }

        public String getDepId() {
            return depId;
        }

        public void setDepId(String depId) {
            this.depId = depId;
        }

        public String getDepName() {
            return depName;
        }

        public void setDepName(String depName) {
            this.depName = depName;
        }

        public String getLoginType() {
            return loginType;
        }

        public void setLoginType(String loginType) {
            this.loginType = loginType;
        }

        public String getLoginDate() {
            return loginDate;
        }

        public void setLoginDate(String loginDate) {
            this.loginDate = loginDate;
        }

        public String getRequestURI() {
            return requestURI;
        }

        public void setRequestURI(String requestURI) {
            this.requestURI = requestURI;
        }

        public String getThemes() {
            return themes;
        }

        public void setThemes(String themes) {
            this.themes = themes;
        }

        public String getCurrentSys() {
            return currentSys;
        }

        public void setCurrentSys(String currentSys) {
            this.currentSys = currentSys;
        }

        public RoleBean getRole() {
            return role;
        }

        public void setRole(RoleBean role) {
            this.role = role;
        }

        public Object getBusinessId() {
            return businessId;
        }

        public void setBusinessId(Object businessId) {
            this.businessId = businessId;
        }

        public BusinessBean getBusiness() {
            return business;
        }

        public void setBusiness(BusinessBean business) {
            this.business = business;
        }

        public static class RoleBean {
            private List<ABean> A;

            public List<ABean> getA() {
                return A;
            }

            public void setA(List<ABean> A) {
                this.A = A;
            }

            public static class ABean {
                /**
                 * id : 58
                 * name : 系统维护
                 */

                private String id;
                private String name;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class BusinessBean {
            private List<ABeanX> A;

            public List<ABeanX> getA() {
                return A;
            }

            public void setA(List<ABeanX> A) {
                this.A = A;
            }

            public static class ABeanX {
                /**
                 * id : zcm-nrsc
                 * text : 内容生产
                 * url : /zcm/nrsc
                 * children : [{"id":"zcm-nrbj-db","text":"待编","url":"/zcm/nrbj/db"},{"id":"zcm-nrbj-ds","text":"待审","url":"/zcm/nrbj/ds"},{"id":"zcm-nrbj-ys","text":"已审","url":"/zcm/nrbj/ys"},{"id":"zcm-nrbj-bbh","text":"被驳回","url":"/zcm/nrbj/bbh"},{"id":"zcm-nrbj-gjrz","text":"稿件日志","url":"/zcm/nrbj/gjrz"}]
                 */

                private String id;
                private String text;
                private String url;
                private List<ChildrenBean> children;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public List<ChildrenBean> getChildren() {
                    return children;
                }

                public void setChildren(List<ChildrenBean> children) {
                    this.children = children;
                }

                public static class ChildrenBean {
                    /**
                     * id : zcm-nrbj-db
                     * text : 待编
                     * url : /zcm/nrbj/db
                     */

                    private String id;
                    private String text;
                    private String url;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }
            }
        }
    }
}

package com.rain.code.Model;

import com.google.gson.annotations.SerializedName;

/**
 * 按邮编地址
 */

public class AddressModel {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"count":"5","error_code":"000","provinceid":"15","page_max":1,"cityid":"167","city":"南京","content":{"1":{"zip":"211106","addr":"江苏省南京市江宁区 开发区将军大道"},"2":{"zip":"211111","addr":"江苏省南京市江宁区 秣陵镇将军大道"},"3":{"zip":"211151","addr":"江苏省南京市江宁区 陶吴镇将军大道"},"4":{"zip":"211153","addr":"江苏省南京市江宁区 东善桥镇将军大道"},"5":{"zip":"211102","addr":"江苏省南京市江宁区 殷巷镇将军大道"}},"ret_code":"0","address":"将军大道","page":1,"province":"江苏","error_description":"查询成功","district":"江宁","districtid":"380"}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * count : 5
         * error_code : 000
         * provinceid : 15
         * page_max : 1
         * cityid : 167
         * city : 南京
         * content : {"1":{"zip":"211106","addr":"江苏省南京市江宁区 开发区将军大道"},"2":{"zip":"211111","addr":"江苏省南京市江宁区 秣陵镇将军大道"},"3":{"zip":"211151","addr":"江苏省南京市江宁区 陶吴镇将军大道"},"4":{"zip":"211153","addr":"江苏省南京市江宁区 东善桥镇将军大道"},"5":{"zip":"211102","addr":"江苏省南京市江宁区 殷巷镇将军大道"}}
         * ret_code : 0
         * address : 将军大道
         * page : 1
         * province : 江苏
         * error_description : 查询成功
         * district : 江宁
         * districtid : 380
         */

        private String count;
        private String error_code;
        private String provinceid;
        private int page_max;
        private String cityid;
        private String city;
        private ContentBean content;
        private String ret_code;
        private String address;
        private int page;
        private String province;
        private String error_description;
        private String district;
        private String districtid;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getError_code() {
            return error_code;
        }

        public void setError_code(String error_code) {
            this.error_code = error_code;
        }

        public String getProvinceid() {
            return provinceid;
        }

        public void setProvinceid(String provinceid) {
            this.provinceid = provinceid;
        }

        public int getPage_max() {
            return page_max;
        }

        public void setPage_max(int page_max) {
            this.page_max = page_max;
        }

        public String getCityid() {
            return cityid;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public ContentBean getContent() {
            return content;
        }

        public void setContent(ContentBean content) {
            this.content = content;
        }

        public String getRet_code() {
            return ret_code;
        }

        public void setRet_code(String ret_code) {
            this.ret_code = ret_code;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getError_description() {
            return error_description;
        }

        public void setError_description(String error_description) {
            this.error_description = error_description;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getDistrictid() {
            return districtid;
        }

        public void setDistrictid(String districtid) {
            this.districtid = districtid;
        }

        public static class ContentBean {
            /**
             * 1 : {"zip":"211106","addr":"江苏省南京市江宁区 开发区将军大道"}
             * 2 : {"zip":"211111","addr":"江苏省南京市江宁区 秣陵镇将军大道"}
             * 3 : {"zip":"211151","addr":"江苏省南京市江宁区 陶吴镇将军大道"}
             * 4 : {"zip":"211153","addr":"江苏省南京市江宁区 东善桥镇将军大道"}
             * 5 : {"zip":"211102","addr":"江苏省南京市江宁区 殷巷镇将军大道"}
             */

            @SerializedName("1")
            private _$1Bean _$1;
            @SerializedName("2")
            private _$2Bean _$2;
            @SerializedName("3")
            private _$3Bean _$3;
            @SerializedName("4")
            private _$4Bean _$4;
            @SerializedName("5")
            private _$5Bean _$5;

            public _$1Bean get_$1() {
                return _$1;
            }

            public void set_$1(_$1Bean _$1) {
                this._$1 = _$1;
            }

            public _$2Bean get_$2() {
                return _$2;
            }

            public void set_$2(_$2Bean _$2) {
                this._$2 = _$2;
            }

            public _$3Bean get_$3() {
                return _$3;
            }

            public void set_$3(_$3Bean _$3) {
                this._$3 = _$3;
            }

            public _$4Bean get_$4() {
                return _$4;
            }

            public void set_$4(_$4Bean _$4) {
                this._$4 = _$4;
            }

            public _$5Bean get_$5() {
                return _$5;
            }

            public void set_$5(_$5Bean _$5) {
                this._$5 = _$5;
            }

            public static class _$1Bean {
                /**
                 * zip : 211106
                 * addr : 江苏省南京市江宁区 开发区将军大道
                 */

                private String zip;
                private String addr;

                public String getZip() {
                    return zip;
                }

                public void setZip(String zip) {
                    this.zip = zip;
                }

                public String getAddr() {
                    return addr;
                }

                public void setAddr(String addr) {
                    this.addr = addr;
                }
            }

            public static class _$2Bean {
                /**
                 * zip : 211111
                 * addr : 江苏省南京市江宁区 秣陵镇将军大道
                 */

                private String zip;
                private String addr;

                public String getZip() {
                    return zip;
                }

                public void setZip(String zip) {
                    this.zip = zip;
                }

                public String getAddr() {
                    return addr;
                }

                public void setAddr(String addr) {
                    this.addr = addr;
                }
            }

            public static class _$3Bean {
                /**
                 * zip : 211151
                 * addr : 江苏省南京市江宁区 陶吴镇将军大道
                 */

                private String zip;
                private String addr;

                public String getZip() {
                    return zip;
                }

                public void setZip(String zip) {
                    this.zip = zip;
                }

                public String getAddr() {
                    return addr;
                }

                public void setAddr(String addr) {
                    this.addr = addr;
                }
            }

            public static class _$4Bean {
                /**
                 * zip : 211153
                 * addr : 江苏省南京市江宁区 东善桥镇将军大道
                 */

                private String zip;
                private String addr;

                public String getZip() {
                    return zip;
                }

                public void setZip(String zip) {
                    this.zip = zip;
                }

                public String getAddr() {
                    return addr;
                }

                public void setAddr(String addr) {
                    this.addr = addr;
                }
            }

            public static class _$5Bean {
                /**
                 * zip : 211102
                 * addr : 江苏省南京市江宁区 殷巷镇将军大道
                 */

                private String zip;
                private String addr;

                public String getZip() {
                    return zip;
                }

                public void setZip(String zip) {
                    this.zip = zip;
                }

                public String getAddr() {
                    return addr;
                }

                public void setAddr(String addr) {
                    this.addr = addr;
                }
            }
        }
    }
}

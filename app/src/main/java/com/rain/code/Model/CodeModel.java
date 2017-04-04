package com.rain.code.Model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Administrator on 2017/4/2.
 */

public class CodeModel {


    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"content":{"1":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇青云巷"},"2":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇"},"3":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇桃园路"},"4":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇芙阁路"},"5":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇同夏路"},"6":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇天泰路"},"7":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇竹山路"},"8":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇实小东村"},"9":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇昌宁路"},"10":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇天印大道"}},"ret_code":"0","count":"90","page":"2","error_code":"000","page_max":9,"error_description":"查询成功"}
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
         * content : {"1":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇青云巷"},"2":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇"},"3":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇桃园路"},"4":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇芙阁路"},"5":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇同夏路"},"6":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇天泰路"},"7":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇竹山路"},"8":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇实小东村"},"9":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇昌宁路"},"10":{"zip":"211100","addr":"江苏省南京市江宁区 东山镇天印大道"}}
         * ret_code : 0
         * count : 90
         * page : 2
         * error_code : 000
         * page_max : 9
         * error_description : 查询成功
         */

        private ContentBean content;
        private String ret_code;
        private String count;
        private String page;
        private String error_code;
        private int page_max;
        private String error_description;

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

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public String getError_code() {
            return error_code;
        }

        public void setError_code(String error_code) {
            this.error_code = error_code;
        }

        public int getPage_max() {
            return page_max;
        }

        public void setPage_max(int page_max) {
            this.page_max = page_max;
        }

        public String getError_description() {
            return error_description;
        }

        public void setError_description(String error_description) {
            this.error_description = error_description;
        }

        public static class ContentBean implements List<ShowapiResBodyBean> {
            /**
             * 1 : {"zip":"211100","addr":"江苏省南京市江宁区 东山镇青云巷"}
             * 2 : {"zip":"211100","addr":"江苏省南京市江宁区 东山镇"}
             * 3 : {"zip":"211100","addr":"江苏省南京市江宁区 东山镇桃园路"}
             * 4 : {"zip":"211100","addr":"江苏省南京市江宁区 东山镇芙阁路"}
             * 5 : {"zip":"211100","addr":"江苏省南京市江宁区 东山镇同夏路"}
             * 6 : {"zip":"211100","addr":"江苏省南京市江宁区 东山镇天泰路"}
             * 7 : {"zip":"211100","addr":"江苏省南京市江宁区 东山镇竹山路"}
             * 8 : {"zip":"211100","addr":"江苏省南京市江宁区 东山镇实小东村"}
             * 9 : {"zip":"211100","addr":"江苏省南京市江宁区 东山镇昌宁路"}
             * 10 : {"zip":"211100","addr":"江苏省南京市江宁区 东山镇天印大道"}
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
            @SerializedName("6")
            private _$6Bean _$6;
            @SerializedName("7")
            private _$7Bean _$7;
            @SerializedName("8")
            private _$8Bean _$8;
            @SerializedName("9")
            private _$9Bean _$9;
            @SerializedName("10")
            private _$10Bean _$10;

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

            public _$6Bean get_$6() {
                return _$6;
            }

            public void set_$6(_$6Bean _$6) {
                this._$6 = _$6;
            }

            public _$7Bean get_$7() {
                return _$7;
            }

            public void set_$7(_$7Bean _$7) {
                this._$7 = _$7;
            }

            public _$8Bean get_$8() {
                return _$8;
            }

            public void set_$8(_$8Bean _$8) {
                this._$8 = _$8;
            }

            public _$9Bean get_$9() {
                return _$9;
            }

            public void set_$9(_$9Bean _$9) {
                this._$9 = _$9;
            }

            public _$10Bean get_$10() {
                return _$10;
            }

            public void set_$10(_$10Bean _$10) {
                this._$10 = _$10;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NonNull
            @Override
            public Iterator<ShowapiResBodyBean> iterator() {
                return null;
            }

            @NonNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NonNull
            @Override
            public <T> T[] toArray(@NonNull T[] a) {
                return null;
            }

            @Override
            public boolean add(ShowapiResBodyBean showapiResBodyBean) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(@NonNull Collection<? extends ShowapiResBodyBean> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, @NonNull Collection<? extends ShowapiResBodyBean> c) {
                return false;
            }

            @Override
            public boolean removeAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public ShowapiResBodyBean get(int index) {
                return null;
            }

            @Override
            public ShowapiResBodyBean set(int index, ShowapiResBodyBean element) {
                return null;
            }

            @Override
            public void add(int index, ShowapiResBodyBean element) {

            }

            @Override
            public ShowapiResBodyBean remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<ShowapiResBodyBean> listIterator() {
                return null;
            }

            @NonNull
            @Override
            public ListIterator<ShowapiResBodyBean> listIterator(int index) {
                return null;
            }

            @NonNull
            @Override
            public List<ShowapiResBodyBean> subList(int fromIndex, int toIndex) {
                return null;
            }

            public static class _$1Bean implements List<ContentBean> {
                /**
                 * zip : 211100
                 * addr : 江苏省南京市江宁区 东山镇青云巷
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

                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @NonNull
                @Override
                public Iterator<ContentBean> iterator() {
                    return null;
                }

                @NonNull
                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @NonNull
                @Override
                public <T> T[] toArray(@NonNull T[] a) {
                    return null;
                }

                @Override
                public boolean add(ContentBean showapiResBodyBeen) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(@NonNull Collection<?> c) {
                    return false;
                }

                @Override
                public boolean addAll(@NonNull Collection<? extends ContentBean> c) {
                    return false;
                }

                @Override
                public boolean addAll(int index, @NonNull Collection<? extends ContentBean> c) {
                    return false;
                }

                @Override
                public boolean removeAll(@NonNull Collection<?> c) {
                    return false;
                }

                @Override
                public boolean retainAll(@NonNull Collection<?> c) {
                    return false;
                }

                @Override
                public void clear() {

                }

                @Override
                public ContentBean get(int index) {
                    return null;
                }

                @Override
                public ContentBean set(int index, ContentBean element) {
                    return null;
                }

                @Override
                public void add(int index, ContentBean element) {

                }

                @Override
                public ContentBean remove(int index) {
                    return null;
                }

                @Override
                public int indexOf(Object o) {
                    return 0;
                }

                @Override
                public int lastIndexOf(Object o) {
                    return 0;
                }

                @Override
                public ListIterator<ContentBean> listIterator() {
                    return null;
                }

                @NonNull
                @Override
                public ListIterator<ContentBean> listIterator(int index) {
                    return null;
                }

                @NonNull
                @Override
                public List<ContentBean> subList(int fromIndex, int toIndex) {
                    return null;
                }
            }

            public static class _$2Bean {
                /**
                 * zip : 211100
                 * addr : 江苏省南京市江宁区 东山镇
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
                 * zip : 211100
                 * addr : 江苏省南京市江宁区 东山镇桃园路
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
                 * zip : 211100
                 * addr : 江苏省南京市江宁区 东山镇芙阁路
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
                 * zip : 211100
                 * addr : 江苏省南京市江宁区 东山镇同夏路
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

            public static class _$6Bean {
                /**
                 * zip : 211100
                 * addr : 江苏省南京市江宁区 东山镇天泰路
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

            public static class _$7Bean {
                /**
                 * zip : 211100
                 * addr : 江苏省南京市江宁区 东山镇竹山路
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

            public static class _$8Bean {
                /**
                 * zip : 211100
                 * addr : 江苏省南京市江宁区 东山镇实小东村
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

            public static class _$9Bean {
                /**
                 * zip : 211100
                 * addr : 江苏省南京市江宁区 东山镇昌宁路
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

            public static class _$10Bean {
                /**
                 * zip : 211100
                 * addr : 江苏省南京市江宁区 东山镇天印大道
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

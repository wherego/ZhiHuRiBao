package com.qianjia.zhihuribao.bean;

import java.util.List;

/**
 * Created by Jiansion on 2017/3/21.
 * type : 1
 */

public class DetailTypeOne {

    /**
     * title : 是不是发现自己除了久石让，其他的日本配乐师都不认识…
     * recommenders : [{"avatar":"http://pic4.zhimg.com/9d9e1f217_m.jpg"}]
     * share_url : http://daily.zhihu.com/story/7249394
     * js : []
     * theme : {"thumbnail":"http://pic3.zhimg.com/00eba01080138a5ac861d581a64ff9bd.jpg","id":3,"name":"电影日报"}
     * ga_prefix : 100820
     * images : ["http://pic4.zhimg.com/d57c509391f2d2b9e50bdf6696f9b01f.jpg"]
     * type : 1
     * id : 7249394
     * css : ["http://news-at.zhihu.com/css/news_qa.auto.css?v=4b3e3"]
     */

    private String title;
    private String share_url;
    private ThemeBean theme;
    private String ga_prefix;
    private int type;
    private int id;
    private List<RecommendersBean> recommenders;
    private List<?> js;
    private List<String> images;
    private List<String> css;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public ThemeBean getTheme() {
        return theme;
    }

    public void setTheme(ThemeBean theme) {
        this.theme = theme;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<RecommendersBean> getRecommenders() {
        return recommenders;
    }

    public void setRecommenders(List<RecommendersBean> recommenders) {
        this.recommenders = recommenders;
    }

    public List<?> getJs() {
        return js;
    }

    public void setJs(List<?> js) {
        this.js = js;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getCss() {
        return css;
    }

    public void setCss(List<String> css) {
        this.css = css;
    }

    public static class ThemeBean {
        /**
         * thumbnail : http://pic3.zhimg.com/00eba01080138a5ac861d581a64ff9bd.jpg
         * id : 3
         * name : 电影日报
         */

        private String thumbnail;
        private int id;
        private String name;

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class RecommendersBean {
        /**
         * avatar : http://pic4.zhimg.com/9d9e1f217_m.jpg
         */

        private String avatar;

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }
}
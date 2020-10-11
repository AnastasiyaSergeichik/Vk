package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private String text;
    private int fromId;
    private String copyright;
    private String postType;
    private int canPinEntry;
    private int canDeleteEntry;
    private int isPinnedEntry;
    private int markAdvert;
    private boolean isFavorite;
    private CommentsInfo commentsInfo;
    private ViewsInfo viewsInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFromId() {
        return fromId;
    }


    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public String getCopyright() {
        return copyright;
    }


    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getPostType() {
        return postType;
    }


    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getCanPinEntry() {
        return canPinEntry;
    }


    public void setCanPinEntry(int canPinEntry) {
        this.canPinEntry = canPinEntry;
    }


    public int getCanDeleteEntry() {
        return canDeleteEntry;
    }


    public void setCanDeleteEntry(int canDeleteEntry) {
        this.canDeleteEntry = canDeleteEntry;
    }

    public int getIsPinnedEntry() {
        return isPinnedEntry;
    }


    public void setIsPinnedEntry(int isPinnedEntry) {
        this.isPinnedEntry = isPinnedEntry;
    }


    public int getMarkAdvert() {
        return markAdvert;
    }


    public void setMarkAdvert(int markAdvert) {
        this.markAdvert = markAdvert;
    }

    public boolean isFavorite() {
        return isFavorite;
    }


    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }


    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }


    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public LikesInfo getLikeInfo() {
        return likesInfo;
    }


    public void setLikeInfo(LikesInfo likeInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostInfo getRepostInfo() {
        return repostInfo;
    }


    public void setRepostInfo(RepostInfo repostInfo) {
        this.repostInfo = repostInfo;
    }

}

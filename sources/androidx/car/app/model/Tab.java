package androidx.car.app.model;

import defpackage.acr;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Tab {
    private static final String EMPTY_TAB_CONTENT_ID = "EMPTY_TAB_CONTENT_ID";
    private final String mContentId;
    private final CarIcon mIcon;
    private final TabStyle mStyle;
    private final CarText mTitle;

    Tab(acr acrVar) {
        CarText carText = acrVar.a;
        this.mTitle = null;
        CarIcon carIcon = acrVar.b;
        this.mIcon = null;
        TabStyle tabStyle = acrVar.d;
        this.mStyle = null;
        String str = acrVar.c;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tab) {
            Tab tab = (Tab) obj;
            if (Objects.equals(this.mTitle, tab.mTitle) && Objects.equals(this.mContentId, tab.mContentId) && Objects.equals(this.mIcon, tab.mIcon) && Objects.equals(this.mStyle, tab.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public String getContentId() {
        String str = this.mContentId;
        str.getClass();
        return str;
    }

    public CarIcon getIcon() {
        CarIcon carIcon = this.mIcon;
        carIcon.getClass();
        return carIcon;
    }

    public TabStyle getStyle() {
        return this.mStyle;
    }

    public CarText getTitle() {
        CarText carText = this.mTitle;
        carText.getClass();
        return carText;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mContentId, this.mIcon, this.mStyle);
    }

    public String toString() {
        return "Tab { title: " + CarText.toShortString(this.mTitle) + ", contentId: " + this.mContentId + ", icon: " + this.mIcon + ", style: " + this.mStyle + " }";
    }

    private Tab() {
        this.mTitle = null;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
        this.mIcon = null;
        this.mStyle = null;
    }
}

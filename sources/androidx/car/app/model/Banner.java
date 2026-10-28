package androidx.car.app.model;

import defpackage.aaa;
import defpackage.abc;
import defpackage.abn;
import defpackage.yf;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Banner implements abc {
    public static final int IMAGE_TYPE_LARGE = 3;
    public static final int IMAGE_TYPE_MEDIUM = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    private static final int MAX_TRAILING_ELEMENTS = 2;
    private final List mBelowActions;
    private final BannerElement mLeadingElement;
    private final abn mOnClickDelegate;
    private final BannerStyle mStyle;
    private final CarText mSubtitle;
    private final CarText mTitle;
    private final List mTrailingElements;

    Banner(aaa aaaVar) {
        CarText carText = aaaVar.a;
        this.mTitle = null;
        CarText carText2 = aaaVar.b;
        this.mSubtitle = null;
        abn abnVar = aaaVar.c;
        this.mOnClickDelegate = null;
        BannerStyle bannerStyle = aaaVar.d;
        this.mStyle = null;
        BannerElement bannerElement = aaaVar.e;
        this.mLeadingElement = null;
        List list = aaaVar.f;
        this.mTrailingElements = DesugarCollections.unmodifiableList(null);
        List list2 = aaaVar.g;
        this.mBelowActions = DesugarCollections.unmodifiableList(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Banner) {
            Banner banner = (Banner) obj;
            if (Objects.equals(this.mTitle, banner.mTitle) && Objects.equals(this.mSubtitle, banner.mSubtitle)) {
                if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(banner.mOnClickDelegate == null)) && Objects.equals(this.mStyle, banner.mStyle) && Objects.equals(this.mLeadingElement, banner.mLeadingElement) && Objects.equals(this.mTrailingElements, banner.mTrailingElements) && Objects.equals(this.mBelowActions, banner.mBelowActions)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List getBelowActions() {
        return this.mBelowActions;
    }

    public BannerElement getLeadingElement() {
        return this.mLeadingElement;
    }

    public abn getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public BannerStyle getStyle() {
        return this.mStyle;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public List getTrailingElements() {
        return this.mTrailingElements;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSubtitle, Boolean.valueOf(this.mOnClickDelegate == null), this.mStyle, this.mLeadingElement, this.mTrailingElements, this.mBelowActions);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Banner { title: ");
        sb.append(CarText.toShortString(this.mTitle));
        sb.append(", subtitle: ");
        sb.append(CarText.toShortString(this.mSubtitle));
        sb.append(", has click listener: ");
        sb.append(this.mOnClickDelegate != null);
        sb.append(", style: ");
        sb.append(this.mStyle);
        sb.append(", leading element: ");
        sb.append(this.mLeadingElement);
        sb.append(", trailing elements: ");
        sb.append(this.mTrailingElements);
        sb.append(", below actions: ");
        sb.append(this.mBelowActions);
        sb.append(" }");
        return sb.toString();
    }

    private Banner() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mOnClickDelegate = null;
        this.mStyle = null;
        this.mLeadingElement = null;
        this.mTrailingElements = Collections.EMPTY_LIST;
        this.mBelowActions = Collections.EMPTY_LIST;
    }
}

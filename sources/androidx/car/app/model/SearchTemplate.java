package androidx.car.app.model;

import defpackage.acg;
import defpackage.ack;
import defpackage.acz;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class SearchTemplate implements acz {
    private final ActionStrip mActionStrip;
    private final Action mHeaderAction;
    private final String mInitialSearchText;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final acg mSearchCallbackDelegate;
    private final String mSearchHint;
    private final boolean mShowKeyboardByDefault;

    SearchTemplate(ack ackVar) {
        String str = ackVar.b;
        this.mInitialSearchText = null;
        String str2 = ackVar.c;
        this.mSearchHint = null;
        boolean z = ackVar.d;
        this.mIsLoading = false;
        ItemList itemList = ackVar.e;
        this.mItemList = null;
        acg acgVar = ackVar.a;
        this.mSearchCallbackDelegate = null;
        boolean z2 = ackVar.f;
        this.mShowKeyboardByDefault = false;
        Action action = ackVar.g;
        this.mHeaderAction = null;
        ActionStrip actionStrip = ackVar.h;
        this.mActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchTemplate) {
            SearchTemplate searchTemplate = (SearchTemplate) obj;
            if (this.mIsLoading == searchTemplate.mIsLoading && Objects.equals(this.mInitialSearchText, searchTemplate.mInitialSearchText) && Objects.equals(this.mSearchHint, searchTemplate.mSearchHint) && Objects.equals(this.mItemList, searchTemplate.mItemList) && Objects.equals(this.mHeaderAction, searchTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, searchTemplate.mActionStrip) && this.mShowKeyboardByDefault == searchTemplate.mShowKeyboardByDefault) {
                return true;
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public String getInitialSearchText() {
        return this.mInitialSearchText;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public acg getSearchCallbackDelegate() {
        acg acgVar = this.mSearchCallbackDelegate;
        acgVar.getClass();
        return acgVar;
    }

    public String getSearchHint() {
        return this.mSearchHint;
    }

    public int hashCode() {
        return Objects.hash(this.mInitialSearchText, Boolean.valueOf(this.mIsLoading), this.mSearchHint, this.mItemList, Boolean.valueOf(this.mShowKeyboardByDefault), this.mHeaderAction, this.mActionStrip);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        return "SearchTemplate";
    }

    private SearchTemplate() {
        this.mInitialSearchText = null;
        this.mSearchHint = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mSearchCallbackDelegate = null;
        this.mShowKeyboardByDefault = true;
    }
}

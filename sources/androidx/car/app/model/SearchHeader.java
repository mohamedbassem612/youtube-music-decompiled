package androidx.car.app.model;

import defpackage.aad;
import defpackage.acg;
import defpackage.acj;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class SearchHeader {
    private final List mEndHeaderActions;
    private final String mInitialSearchText;
    private final acg mSearchCallbackDelegate;
    private final String mSearchHint;
    private final boolean mShowKeyboardByDefault;
    private final Action mStartHeaderAction;

    SearchHeader(acj acjVar) {
        acg acgVar = acjVar.a;
        this.mSearchCallbackDelegate = null;
        String str = acjVar.b;
        this.mInitialSearchText = null;
        String str2 = acjVar.c;
        this.mSearchHint = null;
        boolean z = acjVar.d;
        this.mShowKeyboardByDefault = false;
        Action action = acjVar.e;
        this.mStartHeaderAction = null;
        List list = acjVar.f;
        this.mEndHeaderActions = aad.b(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchHeader) {
            SearchHeader searchHeader = (SearchHeader) obj;
            if (this.mShowKeyboardByDefault == searchHeader.mShowKeyboardByDefault && Objects.equals(this.mInitialSearchText, searchHeader.mInitialSearchText) && Objects.equals(this.mSearchHint, searchHeader.mSearchHint) && Objects.equals(this.mStartHeaderAction, searchHeader.mStartHeaderAction) && Objects.equals(this.mEndHeaderActions, searchHeader.mEndHeaderActions)) {
                return true;
            }
        }
        return false;
    }

    public List getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public String getInitialSearchText() {
        return this.mInitialSearchText;
    }

    public acg getSearchCallbackDelegate() {
        acg acgVar = this.mSearchCallbackDelegate;
        acgVar.getClass();
        return acgVar;
    }

    public String getSearchHint() {
        return this.mSearchHint;
    }

    public Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    public int hashCode() {
        return Objects.hash(this.mInitialSearchText, this.mSearchHint, Boolean.valueOf(this.mShowKeyboardByDefault), this.mStartHeaderAction, this.mEndHeaderActions);
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        return "SearchHeader";
    }

    private SearchHeader() {
        this.mSearchCallbackDelegate = null;
        this.mInitialSearchText = null;
        this.mSearchHint = null;
        this.mShowKeyboardByDefault = true;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = Collections.EMPTY_LIST;
    }
}

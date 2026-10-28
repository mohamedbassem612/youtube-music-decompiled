package androidx.car.app.model;

import defpackage.aad;
import defpackage.acs;
import defpackage.acx;
import defpackage.acz;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class TabTemplate implements acz {
    private final String mActiveTabContentId;
    private final Action mEndAction;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final TabStyle mStyle;
    private final acs mTabCallbackDelegate;
    private final TabContents mTabContents;
    private final List mTabs;

    TabTemplate(acx acxVar) {
        boolean z = acxVar.b;
        this.mIsLoading = false;
        Action action = acxVar.c;
        this.mHeaderAction = null;
        List list = acxVar.d;
        this.mTabs = aad.b(null);
        TabContents tabContents = acxVar.f;
        this.mTabContents = null;
        acs acsVar = acxVar.a;
        this.mTabCallbackDelegate = null;
        String str = acxVar.g;
        this.mActiveTabContentId = null;
        TabStyle tabStyle = acxVar.h;
        this.mStyle = null;
        Action action2 = acxVar.e;
        this.mEndAction = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabTemplate) {
            TabTemplate tabTemplate = (TabTemplate) obj;
            if (this.mIsLoading == tabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && Objects.equals(this.mTabs, tabTemplate.mTabs) && Objects.equals(this.mTabContents, tabTemplate.mTabContents) && Objects.equals(this.mActiveTabContentId, tabTemplate.mActiveTabContentId) && Objects.equals(this.mStyle, tabTemplate.mStyle) && Objects.equals(this.mEndAction, tabTemplate.mEndAction)) {
                return true;
            }
        }
        return false;
    }

    public String getActiveTabContentId() {
        String str = this.mActiveTabContentId;
        str.getClass();
        return str;
    }

    public Action getEndAction() {
        return this.mEndAction;
    }

    public Action getHeaderAction() {
        Action action = this.mHeaderAction;
        action.getClass();
        return action;
    }

    public TabStyle getStyle() {
        return this.mStyle;
    }

    public acs getTabCallbackDelegate() {
        acs acsVar = this.mTabCallbackDelegate;
        acsVar.getClass();
        return acsVar;
    }

    public TabContents getTabContents() {
        TabContents tabContents = this.mTabContents;
        tabContents.getClass();
        return tabContents;
    }

    public List getTabs() {
        return aad.a(this.mTabs);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTabs, this.mTabContents, this.mActiveTabContentId, this.mStyle, this.mEndAction);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "TabTemplate";
    }

    private TabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = Collections.EMPTY_LIST;
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
        this.mStyle = null;
        this.mEndAction = null;
    }
}

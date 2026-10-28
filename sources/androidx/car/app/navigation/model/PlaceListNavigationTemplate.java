package androidx.car.app.navigation.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import defpackage.abq;
import defpackage.acz;
import defpackage.aeb;
import defpackage.aee;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
@Deprecated
public final class PlaceListNavigationTemplate implements acz {
    private final ActionStrip mActionStrip;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final ActionStrip mMapActionStrip;
    private final abq mOnContentRefreshDelegate;
    private final aeb mPanModeDelegate;

    @Deprecated
    private final CarText mTitle;

    PlaceListNavigationTemplate(aee aeeVar) {
        CarText carText = aeeVar.a;
        this.mTitle = null;
        boolean z = aeeVar.b;
        this.mIsLoading = false;
        ItemList itemList = aeeVar.c;
        this.mItemList = null;
        Header header = aeeVar.d;
        this.mHeader = null;
        Action action = aeeVar.e;
        this.mHeaderAction = null;
        ActionStrip actionStrip = aeeVar.f;
        this.mActionStrip = null;
        ActionStrip actionStrip2 = aeeVar.g;
        this.mMapActionStrip = null;
        aeb aebVar = aeeVar.h;
        this.mPanModeDelegate = null;
        abq abqVar = aeeVar.i;
        this.mOnContentRefreshDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceListNavigationTemplate) {
            PlaceListNavigationTemplate placeListNavigationTemplate = (PlaceListNavigationTemplate) obj;
            if (this.mIsLoading == placeListNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, placeListNavigationTemplate.mTitle) && Objects.equals(this.mItemList, placeListNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, placeListNavigationTemplate.mMapActionStrip)) {
                if (Objects.equals(Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(placeListNavigationTemplate.mPanModeDelegate == null))) {
                    if (Objects.equals(Boolean.valueOf(this.mOnContentRefreshDelegate == null), Boolean.valueOf(placeListNavigationTemplate.mOnContentRefreshDelegate == null)) && Objects.equals(this.mHeader, placeListNavigationTemplate.mHeader)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public abq getOnContentRefreshDelegate() {
        return this.mOnContentRefreshDelegate;
    }

    public aeb getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Boolean.valueOf(this.mIsLoading), this.mItemList, this.mHeaderAction, this.mActionStrip, this.mMapActionStrip, Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(this.mOnContentRefreshDelegate == null), this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "PlaceListNavigationTemplate";
    }

    private PlaceListNavigationTemplate() {
        this.mTitle = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeader = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeDelegate = null;
        this.mOnContentRefreshDelegate = null;
    }
}

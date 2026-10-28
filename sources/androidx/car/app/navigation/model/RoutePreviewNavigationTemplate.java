package androidx.car.app.navigation.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import defpackage.acz;
import defpackage.aeb;
import defpackage.aef;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
@Deprecated
public final class RoutePreviewNavigationTemplate implements acz {
    private final ActionStrip mActionStrip;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final ActionStrip mMapActionStrip;
    private final Action mNavigateAction;
    private final aeb mPanModeDelegate;

    @Deprecated
    private final CarText mTitle;

    RoutePreviewNavigationTemplate(aef aefVar) {
        CarText carText = aefVar.a;
        this.mTitle = null;
        boolean z = aefVar.b;
        this.mIsLoading = false;
        Action action = aefVar.c;
        this.mNavigateAction = null;
        ItemList itemList = aefVar.d;
        this.mItemList = null;
        Header header = aefVar.e;
        this.mHeader = null;
        Action action2 = aefVar.f;
        this.mHeaderAction = null;
        ActionStrip actionStrip = aefVar.g;
        this.mActionStrip = null;
        ActionStrip actionStrip2 = aefVar.h;
        this.mMapActionStrip = null;
        aeb aebVar = aefVar.i;
        this.mPanModeDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoutePreviewNavigationTemplate) {
            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
            if (this.mIsLoading == routePreviewNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, routePreviewNavigationTemplate.mTitle) && Objects.equals(this.mNavigateAction, routePreviewNavigationTemplate.mNavigateAction) && Objects.equals(this.mItemList, routePreviewNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, routePreviewNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, routePreviewNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, routePreviewNavigationTemplate.mMapActionStrip)) {
                if (Objects.equals(Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(routePreviewNavigationTemplate.mPanModeDelegate == null)) && Objects.equals(this.mHeader, routePreviewNavigationTemplate.mHeader)) {
                    return true;
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

    public Action getNavigateAction() {
        return this.mNavigateAction;
    }

    public aeb getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Boolean.valueOf(this.mIsLoading), this.mNavigateAction, this.mItemList, this.mHeaderAction, this.mActionStrip, this.mMapActionStrip, Boolean.valueOf(this.mPanModeDelegate == null), this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "RoutePreviewNavigationTemplate";
    }

    private RoutePreviewNavigationTemplate() {
        this.mTitle = null;
        this.mIsLoading = false;
        this.mNavigateAction = null;
        this.mItemList = null;
        this.mHeader = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeDelegate = null;
    }
}

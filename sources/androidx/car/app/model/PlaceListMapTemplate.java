package androidx.car.app.model;

import defpackage.abq;
import defpackage.aca;
import defpackage.acz;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class PlaceListMapTemplate implements acz {
    private final ActionStrip mActionStrip;
    private final Place mAnchor;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final abq mOnContentRefreshDelegate;
    private final boolean mShowCurrentLocation;
    private final CarText mTitle;

    PlaceListMapTemplate(aca acaVar) {
        boolean z = acaVar.a;
        this.mShowCurrentLocation = false;
        boolean z2 = acaVar.b;
        this.mIsLoading = false;
        CarText carText = acaVar.c;
        this.mTitle = null;
        ItemList itemList = acaVar.d;
        this.mItemList = null;
        Action action = acaVar.e;
        this.mHeaderAction = null;
        ActionStrip actionStrip = acaVar.f;
        this.mActionStrip = null;
        Place place = acaVar.g;
        this.mAnchor = null;
        abq abqVar = acaVar.h;
        this.mOnContentRefreshDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceListMapTemplate) {
            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
            if (this.mShowCurrentLocation == placeListMapTemplate.mShowCurrentLocation && this.mIsLoading == placeListMapTemplate.mIsLoading && Objects.equals(this.mTitle, placeListMapTemplate.mTitle) && Objects.equals(this.mItemList, placeListMapTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListMapTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListMapTemplate.mActionStrip) && Objects.equals(this.mAnchor, placeListMapTemplate.mAnchor)) {
                if (Objects.equals(Boolean.valueOf(this.mOnContentRefreshDelegate == null), Boolean.valueOf(placeListMapTemplate.mOnContentRefreshDelegate == null))) {
                    return true;
                }
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Place getAnchor() {
        return this.mAnchor;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public abq getOnContentRefreshDelegate() {
        return this.mOnContentRefreshDelegate;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mShowCurrentLocation), Boolean.valueOf(this.mIsLoading), this.mTitle, this.mItemList, this.mHeaderAction, this.mActionStrip, this.mAnchor, Boolean.valueOf(this.mOnContentRefreshDelegate == null));
    }

    public boolean isCurrentLocationEnabled() {
        return this.mShowCurrentLocation;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "PlaceListMapTemplate";
    }

    private PlaceListMapTemplate() {
        this.mShowCurrentLocation = false;
        this.mIsLoading = false;
        this.mTitle = null;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mAnchor = null;
        this.mOnContentRefreshDelegate = null;
    }
}

package androidx.car.app.model;

import defpackage.aad;
import defpackage.aaw;
import defpackage.aax;
import defpackage.acz;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class GridTemplate implements acz {
    public static final int ITEM_IMAGE_SHAPE_CIRCLE = 2;
    public static final int ITEM_IMAGE_SHAPE_UNSET = 1;
    public static final int ITEM_SIZE_LARGE = 4;
    public static final int ITEM_SIZE_MEDIUM = 2;
    public static final int ITEM_SIZE_SMALL = 1;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final List mActions;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final int mItemImageShape;
    private final int mItemSize;
    private final ItemList mSingleList;

    @Deprecated
    private final CarText mTitle;

    GridTemplate(aaw aawVar) {
        boolean z = aawVar.a;
        this.mIsLoading = false;
        CarText carText = aawVar.c;
        this.mTitle = null;
        Action action = aawVar.d;
        this.mHeaderAction = null;
        ItemList itemList = aawVar.b;
        this.mSingleList = null;
        ActionStrip actionStrip = aawVar.e;
        this.mActionStrip = null;
        List list = aawVar.f;
        this.mActions = aad.b(null);
        int i = aawVar.g;
        this.mItemSize = 0;
        int i2 = aawVar.h;
        this.mItemImageShape = 0;
        Header header = aawVar.i;
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GridTemplate) {
            GridTemplate gridTemplate = (GridTemplate) obj;
            if (this.mIsLoading == gridTemplate.mIsLoading && Objects.equals(this.mTitle, gridTemplate.mTitle) && Objects.equals(this.mHeaderAction, gridTemplate.mHeaderAction) && Objects.equals(this.mSingleList, gridTemplate.mSingleList) && Objects.equals(this.mActionStrip, gridTemplate.mActionStrip) && Objects.equals(this.mActions, gridTemplate.mActions) && this.mItemSize == gridTemplate.mItemSize && this.mItemImageShape == gridTemplate.mItemImageShape && Objects.equals(this.mHeader, gridTemplate.mHeader)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        aax aaxVar = new aax();
        CarText carText = this.mTitle;
        if (carText != null) {
            aaxVar.d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            aaxVar.c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                aaxVar.b((Action) it.next());
            }
        }
        return aaxVar.a();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public int getItemImageShape() {
        return this.mItemImageShape;
    }

    public int getItemSize() {
        return this.mItemSize;
    }

    public ItemList getSingleList() {
        return this.mSingleList;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mActionStrip, Integer.valueOf(this.mItemSize), Integer.valueOf(this.mItemImageShape), this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "GridTemplate";
    }

    private GridTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        this.mActionStrip = null;
        this.mActions = Collections.EMPTY_LIST;
        this.mItemSize = 1;
        this.mItemImageShape = 1;
        this.mHeader = null;
    }
}

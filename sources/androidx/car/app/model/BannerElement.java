package androidx.car.app.model;

import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class BannerElement {
    public static final int TYPE_ACTION = 1;
    public static final int TYPE_IMAGE = 2;
    private final Action mAction;
    private final CarIcon mImage;
    private final int mImageType;
    private final int mType;

    private BannerElement() {
        this.mType = 1;
        this.mImageType = 1;
        this.mAction = null;
        this.mImage = null;
    }

    public static BannerElement createForAction(Action action) {
        action.getClass();
        return new BannerElement(1, action, null);
    }

    public static BannerElement createForImageType(CarIcon carIcon, int i) {
        carIcon.getClass();
        return new BannerElement(2, i, null, carIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BannerElement) {
            BannerElement bannerElement = (BannerElement) obj;
            if (this.mType == bannerElement.mType && this.mImageType == bannerElement.mImageType && Objects.equals(this.mAction, bannerElement.mAction) && Objects.equals(this.mImage, bannerElement.mImage)) {
                return true;
            }
        }
        return false;
    }

    public Action getAction() {
        return this.mAction;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public int getImageType() {
        return this.mImageType;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), Integer.valueOf(this.mImageType), this.mAction, this.mImage);
    }

    public String toString() {
        return "BannerElement { type: " + this.mType + ", imageType: " + this.mImageType + ", action: " + this.mAction + ", image: " + this.mImage + " }";
    }

    private BannerElement(int i, int i2, Action action, CarIcon carIcon) {
        this.mType = i;
        this.mImageType = i2;
        this.mAction = action;
        this.mImage = carIcon;
    }

    private BannerElement(int i, Action action, CarIcon carIcon) {
        this.mType = i;
        this.mImageType = 1;
        this.mAction = action;
        this.mImage = carIcon;
    }
}

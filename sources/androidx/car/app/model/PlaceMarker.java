package androidx.car.app.model;

import defpackage.acb;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class PlaceMarker {
    private static final int MAX_LABEL_LENGTH = 3;
    public static final int TYPE_ICON = 0;
    public static final int TYPE_IMAGE = 1;
    private final CarColor mColor;
    private final CarIcon mIcon;
    private final int mIconType;
    private final CarText mLabel;

    PlaceMarker(acb acbVar) {
        Object obj = acbVar.b;
        this.mIcon = null;
        int i = acbVar.a;
        this.mIconType = 0;
        Object obj2 = acbVar.c;
        this.mLabel = null;
        Object obj3 = acbVar.d;
        this.mColor = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceMarker) {
            PlaceMarker placeMarker = (PlaceMarker) obj;
            if (Objects.equals(this.mIcon, placeMarker.mIcon) && Objects.equals(this.mLabel, placeMarker.mLabel) && Objects.equals(this.mColor, placeMarker.mColor) && this.mIconType == placeMarker.mIconType) {
                return true;
            }
        }
        return false;
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getIconType() {
        return this.mIconType;
    }

    public CarText getLabel() {
        return this.mLabel;
    }

    public int hashCode() {
        return Objects.hash(this.mIcon, this.mLabel, this.mColor, Integer.valueOf(this.mIconType));
    }

    public String toString() {
        String shortString;
        StringBuilder sb = new StringBuilder("[");
        CarIcon carIcon = this.mIcon;
        if (carIcon != null) {
            shortString = carIcon.toString();
        } else {
            CarText carText = this.mLabel;
            shortString = carText != null ? CarText.toShortString(carText) : super.toString();
        }
        sb.append(shortString);
        sb.append(']');
        return sb.toString();
    }

    private PlaceMarker() {
        this.mIcon = null;
        this.mIconType = 0;
        this.mLabel = null;
        this.mColor = null;
    }
}

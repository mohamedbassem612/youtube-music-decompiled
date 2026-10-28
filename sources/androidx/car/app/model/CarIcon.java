package androidx.car.app.model;

import androidx.core.graphics.drawable.IconCompat;
import defpackage.aae;
import defpackage.aaf;
import defpackage.aag;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CarIcon {
    public static final int TYPE_ALERT = 4;
    public static final int TYPE_APP_ICON = 5;
    public static final int TYPE_BACK = 3;
    public static final int TYPE_COMPOSE_MESSAGE = 8;
    public static final int TYPE_CUSTOM = 1;
    public static final int TYPE_ERROR = 6;
    public static final int TYPE_MEDIA_PLAYBACK = 9;
    public static final int TYPE_PAN = 7;
    private static final int TYPE_RESOURCE = 2;
    private static final int TYPE_URI = 4;
    private final IconCompat mIcon;
    private final CarIconStyle mStyle;

    @Deprecated
    private final CarColor mTint;
    private final int mType;
    public static final CarIcon APP_ICON = forStandardType(5);
    public static final CarIcon BACK = forStandardType(3);
    public static final CarIcon ALERT = forStandardType(4);
    public static final CarIcon ERROR = forStandardType(6);
    public static final CarIcon PAN = forStandardType(7);
    public static final CarIcon COMPOSE_MESSAGE = forStandardType(8);
    public static final CarIcon MEDIA_PLAYBACK = forStandardType(9);

    public CarIcon(IconCompat iconCompat, CarColor carColor, int i) {
        this.mType = i;
        this.mIcon = iconCompat;
        this.mTint = carColor;
        aag aagVar = null;
        if (carColor == null) {
            this.mStyle = null;
            return;
        }
        aaf aafVar = new aaf(CarIconStyle.TINTED);
        aafVar.a(carColor);
        this.mStyle = new CarIconStyle(aafVar, aagVar);
    }

    public static CarIcon createOriginalIcon(IconCompat iconCompat) {
        return new CarIcon(new aae(iconCompat, CarIconStyle.ORIGINAL));
    }

    public static CarIcon createTintedIcon(IconCompat iconCompat, CarColor carColor) {
        iconCompat.getClass();
        carColor.getClass();
        aaf aafVar = new aaf(CarIconStyle.TINTED);
        aafVar.a(carColor);
        return new CarIcon(new aae(iconCompat, new CarIconStyle(aafVar, (aag) null)));
    }

    private static CarIcon forStandardType(int i) {
        return new CarIcon(null, CarColor.DEFAULT, i);
    }

    private boolean iconCompatEquals(IconCompat iconCompat) {
        int iB;
        IconCompat iconCompat2 = this.mIcon;
        if (iconCompat2 == null) {
            if (iconCompat == null) {
                return true;
            }
        } else if (iconCompat != null && (iB = iconCompat2.b()) == iconCompat.b()) {
            if (iB != 2) {
                if (iB == 4) {
                    return Objects.equals(this.mIcon.c(), iconCompat.c());
                }
                return true;
            }
            if (Objects.equals(this.mIcon.i(), iconCompat.i()) && this.mIcon.a() == iconCompat.a()) {
                return true;
            }
        }
        return false;
    }

    private Object iconCompatHash() {
        IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            return null;
        }
        int iB = iconCompat.b();
        if (iB != 2) {
            return iB == 4 ? this.mIcon.c() : Integer.valueOf(iB);
        }
        return this.mIcon.i() + this.mIcon.a();
    }

    private static String typeToString(int i) {
        switch (i) {
            case 1:
                return "CUSTOM";
            case 2:
            default:
                return "<unknown>";
            case 3:
                return "BACK";
            case 4:
                return "ALERT";
            case 5:
                return "APP";
            case 6:
                return "ERROR";
            case 7:
                return "PAN";
            case 8:
                return "COMPOSE_MESSAGE";
            case 9:
                return "MEDIA_PLAYBACK";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarIcon) {
            CarIcon carIcon = (CarIcon) obj;
            if (this.mType == carIcon.mType && Objects.equals(this.mTint, carIcon.mTint) && iconCompatEquals(carIcon.mIcon) && Objects.equals(this.mStyle, carIcon.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public CarIconStyle getStyle() {
        CarIconStyle carIconStyle = this.mStyle;
        if (carIconStyle != null) {
            return carIconStyle;
        }
        aag aagVar = null;
        if (this.mTint == null) {
            return null;
        }
        aaf aafVar = new aaf(CarIconStyle.TINTED);
        aafVar.a(this.mTint);
        return new CarIconStyle(aafVar, aagVar);
    }

    @Deprecated
    public CarColor getTint() {
        CarIconStyle carIconStyle = this.mStyle;
        return carIconStyle == null ? this.mTint : carIconStyle.getTint();
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), this.mTint, iconCompatHash(), this.mStyle);
    }

    public String toString() {
        return "[type: " + typeToString(this.mType) + ", tint: " + this.mTint + ", style: " + this.mStyle + ']';
    }

    public CarIcon(aae aaeVar) {
        int i = aaeVar.a;
        this.mType = 1;
        this.mIcon = (IconCompat) aaeVar.b;
        CarIconStyle carIconStyle = (CarIconStyle) aaeVar.c;
        this.mStyle = carIconStyle;
        this.mTint = carIconStyle != null ? carIconStyle.getTint() : null;
    }

    public static CarIcon createTintedIcon(IconCompat iconCompat) {
        return new CarIcon(new aae(iconCompat, CarIconStyle.TINTED));
    }

    private CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
        this.mStyle = null;
    }
}

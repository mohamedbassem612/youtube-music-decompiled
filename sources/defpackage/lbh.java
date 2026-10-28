package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lbh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        String strT = null;
        long jL = 0;
        long jL2 = 0;
        long jL3 = 0;
        long jL4 = 0;
        long jL5 = 0;
        long jL6 = 0;
        long jL7 = 0;
        long jL8 = 0;
        boolean zAb = false;
        int I = 0;
        boolean zAb2 = false;
        boolean zAb3 = false;
        int I2 = 0;
        int I3 = 0;
        boolean zAb4 = false;
        String strT2 = "";
        String strT3 = strT2;
        String strT4 = strT3;
        String strT5 = strT4;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        String strT9 = null;
        Boolean boolP = null;
        ArrayList arrayListW = null;
        String strT10 = null;
        String strT11 = null;
        int I4 = 100;
        boolean zAb5 = true;
        boolean zAb6 = true;
        long jL9 = -2147483648L;
        long jL10 = 0;
        long jL11 = 0;
        String strT12 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            String str = strT12;
            switch ((char) i) {
                case 2:
                    strT12 = ksy.T(parcel, i);
                    continue;
                case 3:
                    strT12 = str;
                    strT6 = ksy.T(parcel, i);
                    continue;
                case 4:
                    strT12 = str;
                    strT7 = ksy.T(parcel, i);
                    continue;
                case 5:
                    strT12 = str;
                    strT = ksy.T(parcel, i);
                    continue;
                case 6:
                    jL10 = ksy.L(parcel, i);
                    break;
                case 7:
                    jL11 = ksy.L(parcel, i);
                    break;
                case '\b':
                    strT12 = str;
                    strT8 = ksy.T(parcel, i);
                    continue;
                case '\t':
                    strT12 = str;
                    zAb5 = ksy.ab(parcel, i);
                    continue;
                case '\n':
                    strT12 = str;
                    zAb = ksy.ab(parcel, i);
                    continue;
                case 11:
                    jL9 = ksy.L(parcel, i);
                    break;
                case '\f':
                    strT12 = str;
                    strT9 = ksy.T(parcel, i);
                    continue;
                case '\r':
                case 17:
                case 19:
                case 20:
                case 24:
                case '!':
                default:
                    ksy.aa(parcel, i);
                    break;
                case 14:
                    jL = ksy.L(parcel, i);
                    break;
                case 15:
                    strT12 = str;
                    I = ksy.I(parcel, i);
                    continue;
                case 16:
                    strT12 = str;
                    zAb6 = ksy.ab(parcel, i);
                    continue;
                case 18:
                    strT12 = str;
                    zAb2 = ksy.ab(parcel, i);
                    continue;
                case 21:
                    strT12 = str;
                    boolP = ksy.P(parcel, i);
                    continue;
                case 22:
                    jL2 = ksy.L(parcel, i);
                    break;
                case 23:
                    strT12 = str;
                    arrayListW = ksy.W(parcel, i);
                    continue;
                case 25:
                    strT12 = str;
                    strT2 = ksy.T(parcel, i);
                    continue;
                case 26:
                    strT12 = str;
                    strT3 = ksy.T(parcel, i);
                    continue;
                case 27:
                    strT12 = str;
                    strT10 = ksy.T(parcel, i);
                    continue;
                case 28:
                    strT12 = str;
                    zAb3 = ksy.ab(parcel, i);
                    continue;
                case 29:
                    jL3 = ksy.L(parcel, i);
                    break;
                case 30:
                    strT12 = str;
                    I4 = ksy.I(parcel, i);
                    continue;
                case 31:
                    strT12 = str;
                    strT4 = ksy.T(parcel, i);
                    continue;
                case ' ':
                    strT12 = str;
                    I2 = ksy.I(parcel, i);
                    continue;
                case '\"':
                    jL4 = ksy.L(parcel, i);
                    break;
                case '#':
                    strT12 = str;
                    strT11 = ksy.T(parcel, i);
                    continue;
                case '$':
                    strT12 = str;
                    strT5 = ksy.T(parcel, i);
                    continue;
                case '%':
                    jL5 = ksy.L(parcel, i);
                    break;
                case '&':
                    strT12 = str;
                    I3 = ksy.I(parcel, i);
                    continue;
                case '\'':
                    jL6 = ksy.L(parcel, i);
                    break;
                case '(':
                    jL7 = ksy.L(parcel, i);
                    break;
                case ')':
                    strT12 = str;
                    zAb4 = ksy.ab(parcel, i);
                    continue;
                case '*':
                    jL8 = ksy.L(parcel, i);
                    break;
            }
            strT12 = str;
        }
        ksy.Y(parcel, iK);
        return new lbg(strT12, strT6, strT7, strT, jL10, jL11, strT8, zAb5, zAb, jL9, strT9, jL, I, zAb6, zAb2, boolP, jL2, arrayListW, strT2, strT3, strT10, zAb3, jL3, I4, strT4, I2, jL4, strT11, strT5, jL5, I3, jL6, jL7, zAb4, jL8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new lbg[i];
    }
}

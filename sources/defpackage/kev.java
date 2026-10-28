package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kev implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        ArrayList arrayListW = null;
        int I = 0;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        int I6 = 0;
        int I7 = 0;
        int I8 = 0;
        int I9 = 0;
        int I10 = 0;
        int I11 = 0;
        int I12 = 0;
        int I13 = 0;
        int I14 = 0;
        int I15 = 0;
        int I16 = 0;
        int I17 = 0;
        int I18 = 0;
        int I19 = 0;
        int I20 = 0;
        int I21 = 0;
        int I22 = 0;
        int I23 = 0;
        int I24 = 0;
        int I25 = 0;
        int I26 = 0;
        int I27 = 0;
        boolean zAb = false;
        boolean zAb2 = false;
        String strT = null;
        IBinder iBinderN = null;
        long jL = 0;
        int[] iArrAd = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            ArrayList arrayList = arrayListW;
            switch ((char) i) {
                case 2:
                    arrayListW = ksy.W(parcel, i);
                    continue;
                case 3:
                    arrayListW = arrayList;
                    iArrAd = ksy.ad(parcel, i);
                    continue;
                case 4:
                    jL = ksy.L(parcel, i);
                    break;
                case 5:
                    arrayListW = arrayList;
                    strT = ksy.T(parcel, i);
                    continue;
                case 6:
                    arrayListW = arrayList;
                    I = ksy.I(parcel, i);
                    continue;
                case 7:
                    arrayListW = arrayList;
                    I2 = ksy.I(parcel, i);
                    continue;
                case '\b':
                    arrayListW = arrayList;
                    I3 = ksy.I(parcel, i);
                    continue;
                case '\t':
                    arrayListW = arrayList;
                    I4 = ksy.I(parcel, i);
                    continue;
                case '\n':
                    arrayListW = arrayList;
                    I5 = ksy.I(parcel, i);
                    continue;
                case 11:
                    arrayListW = arrayList;
                    I6 = ksy.I(parcel, i);
                    continue;
                case '\f':
                    arrayListW = arrayList;
                    I7 = ksy.I(parcel, i);
                    continue;
                case '\r':
                    arrayListW = arrayList;
                    I8 = ksy.I(parcel, i);
                    continue;
                case 14:
                    arrayListW = arrayList;
                    I9 = ksy.I(parcel, i);
                    continue;
                case 15:
                    arrayListW = arrayList;
                    I10 = ksy.I(parcel, i);
                    continue;
                case 16:
                    arrayListW = arrayList;
                    I11 = ksy.I(parcel, i);
                    continue;
                case 17:
                    arrayListW = arrayList;
                    I12 = ksy.I(parcel, i);
                    continue;
                case 18:
                    arrayListW = arrayList;
                    I13 = ksy.I(parcel, i);
                    continue;
                case 19:
                    arrayListW = arrayList;
                    I14 = ksy.I(parcel, i);
                    continue;
                case 20:
                    arrayListW = arrayList;
                    I15 = ksy.I(parcel, i);
                    continue;
                case 21:
                    arrayListW = arrayList;
                    I16 = ksy.I(parcel, i);
                    continue;
                case 22:
                    arrayListW = arrayList;
                    I17 = ksy.I(parcel, i);
                    continue;
                case 23:
                    arrayListW = arrayList;
                    I18 = ksy.I(parcel, i);
                    continue;
                case 24:
                    arrayListW = arrayList;
                    I19 = ksy.I(parcel, i);
                    continue;
                case 25:
                    arrayListW = arrayList;
                    I20 = ksy.I(parcel, i);
                    continue;
                case 26:
                    arrayListW = arrayList;
                    I21 = ksy.I(parcel, i);
                    continue;
                case 27:
                    arrayListW = arrayList;
                    I22 = ksy.I(parcel, i);
                    continue;
                case 28:
                    arrayListW = arrayList;
                    I23 = ksy.I(parcel, i);
                    continue;
                case 29:
                    arrayListW = arrayList;
                    I24 = ksy.I(parcel, i);
                    continue;
                case 30:
                    arrayListW = arrayList;
                    I25 = ksy.I(parcel, i);
                    continue;
                case 31:
                    arrayListW = arrayList;
                    I26 = ksy.I(parcel, i);
                    continue;
                case ' ':
                    arrayListW = arrayList;
                    I27 = ksy.I(parcel, i);
                    continue;
                case '!':
                    arrayListW = arrayList;
                    iBinderN = ksy.N(parcel, i);
                    continue;
                case '\"':
                    arrayListW = arrayList;
                    zAb = ksy.ab(parcel, i);
                    continue;
                case '#':
                    arrayListW = arrayList;
                    zAb2 = ksy.ab(parcel, i);
                    continue;
                default:
                    ksy.aa(parcel, i);
                    break;
            }
            arrayListW = arrayList;
        }
        ksy.Y(parcel, iK);
        return new keu(arrayListW, iArrAd, jL, strT, I, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22, I23, I24, I25, I26, I27, iBinderN, zAb, zAb2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new keu[i];
    }
}

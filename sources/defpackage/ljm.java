package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljm implements Parcelable.Creator {
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
        long jL9 = 0;
        int I = 0;
        int I2 = 0;
        boolean zAb = false;
        int I3 = 0;
        String strT2 = null;
        String strT3 = null;
        ljo[] ljoVarArr = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        ArrayList arrayListU = null;
        String strT8 = null;
        String strT9 = null;
        ljv ljvVar = null;
        lje ljeVar = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            String str = strT2;
            char c = (char) i;
            switch (c) {
                case 1:
                    strT2 = ksy.T(parcel, i);
                    continue;
                case 2:
                    strT2 = str;
                    strT3 = ksy.T(parcel, i);
                    continue;
                case 3:
                    strT2 = str;
                    strT = ksy.T(parcel, i);
                    continue;
                case 4:
                    jL = ksy.L(parcel, i);
                    break;
                case 5:
                    jL2 = ksy.L(parcel, i);
                    break;
                case 6:
                    strT2 = str;
                    ljoVarArr = (ljo[]) ksy.af(parcel, i, ljo.CREATOR);
                    continue;
                case 7:
                    strT2 = str;
                    I = ksy.I(parcel, i);
                    continue;
                case '\b':
                    strT2 = str;
                    strT4 = ksy.T(parcel, i);
                    continue;
                case '\t':
                    strT2 = str;
                    strT5 = ksy.T(parcel, i);
                    continue;
                case '\n':
                    strT2 = str;
                    strT6 = ksy.T(parcel, i);
                    continue;
                case 11:
                    strT2 = str;
                    strT7 = ksy.T(parcel, i);
                    continue;
                case '\f':
                    strT2 = str;
                    I2 = ksy.I(parcel, i);
                    continue;
                case '\r':
                    strT2 = str;
                    arrayListU = ksy.U(parcel, i);
                    continue;
                default:
                    switch (c) {
                        case 20:
                            jL3 = ksy.L(parcel, i);
                            break;
                        case 21:
                            jL4 = ksy.L(parcel, i);
                            break;
                        case 22:
                            jL5 = ksy.L(parcel, i);
                            break;
                        case 23:
                            strT2 = str;
                            strT8 = ksy.T(parcel, i);
                            continue;
                        case 24:
                            strT2 = str;
                            strT9 = ksy.T(parcel, i);
                            continue;
                        case 25:
                            strT2 = str;
                            zAb = ksy.ab(parcel, i);
                            continue;
                        case 26:
                            strT2 = str;
                            ljvVar = (ljv) ksy.O(parcel, i, ljv.CREATOR);
                            continue;
                        case 27:
                            strT2 = str;
                            ljeVar = (lje) ksy.O(parcel, i, lje.CREATOR);
                            continue;
                        case 28:
                            strT2 = str;
                            I3 = ksy.I(parcel, i);
                            continue;
                        case 29:
                            jL6 = ksy.L(parcel, i);
                            break;
                        case 30:
                            jL7 = ksy.L(parcel, i);
                            break;
                        case 31:
                            jL8 = ksy.L(parcel, i);
                            break;
                        case ' ':
                            jL9 = ksy.L(parcel, i);
                            break;
                        default:
                            ksy.aa(parcel, i);
                            break;
                    }
                    break;
            }
            strT2 = str;
        }
        ksy.Y(parcel, iK);
        return new ljl(strT2, strT3, strT, jL, jL2, ljoVarArr, I, strT4, strT5, strT6, strT7, I2, arrayListU, jL3, jL4, jL5, strT8, strT9, zAb, ljvVar, ljeVar, I3, jL6, jL7, jL8, jL9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ljl[i];
    }
}

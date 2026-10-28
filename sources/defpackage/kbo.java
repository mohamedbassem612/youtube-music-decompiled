package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        kap kapVar = null;
        keh kehVar = null;
        ArrayList arrayListW = null;
        kbl kblVar = null;
        kbm kbmVar = null;
        Boolean boolP = null;
        boolean zAb = false;
        boolean zAb2 = false;
        boolean zAb3 = false;
        boolean zAb4 = false;
        boolean zAb5 = false;
        boolean zAb6 = false;
        boolean zAb7 = false;
        boolean zAb8 = false;
        boolean zAb9 = false;
        double dG = 0.0d;
        String strT = null;
        ArrayList arrayListW2 = null;
        boolean zAb10 = false;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            String str = strT;
            switch ((char) i) {
                case 2:
                    strT = ksy.T(parcel, i);
                    continue;
                case 3:
                    strT = str;
                    arrayListW2 = ksy.W(parcel, i);
                    continue;
                case 4:
                    strT = str;
                    zAb10 = ksy.ab(parcel, i);
                    continue;
                case 5:
                    strT = str;
                    kapVar = (kap) ksy.O(parcel, i, kap.CREATOR);
                    continue;
                case 6:
                    strT = str;
                    zAb = ksy.ab(parcel, i);
                    continue;
                case 7:
                    strT = str;
                    kehVar = (keh) ksy.O(parcel, i, keh.CREATOR);
                    continue;
                case '\b':
                    strT = str;
                    zAb2 = ksy.ab(parcel, i);
                    continue;
                case '\t':
                    dG = ksy.G(parcel, i);
                    break;
                case '\n':
                    strT = str;
                    zAb3 = ksy.ab(parcel, i);
                    continue;
                case 11:
                    strT = str;
                    zAb4 = ksy.ab(parcel, i);
                    continue;
                case '\f':
                    strT = str;
                    zAb5 = ksy.ab(parcel, i);
                    continue;
                case '\r':
                    strT = str;
                    arrayListW = ksy.W(parcel, i);
                    continue;
                case 14:
                    strT = str;
                    zAb6 = ksy.ab(parcel, i);
                    continue;
                case 15:
                    ksy.I(parcel, i);
                    break;
                case 16:
                    strT = str;
                    zAb7 = ksy.ab(parcel, i);
                    continue;
                case 17:
                    strT = str;
                    kblVar = (kbl) ksy.O(parcel, i, kbl.CREATOR);
                    continue;
                case 18:
                    strT = str;
                    kbmVar = (kbm) ksy.O(parcel, i, kbm.CREATOR);
                    continue;
                case 19:
                    strT = str;
                    zAb8 = ksy.ab(parcel, i);
                    continue;
                case 20:
                    strT = str;
                    zAb9 = ksy.ab(parcel, i);
                    continue;
                case 21:
                    strT = str;
                    boolP = ksy.P(parcel, i);
                    continue;
                default:
                    ksy.aa(parcel, i);
                    break;
            }
            strT = str;
        }
        ksy.Y(parcel, iK);
        return new kbn(strT, arrayListW2, zAb10, kapVar, zAb, kehVar, zAb2, dG, zAb3, zAb4, zAb5, arrayListW, zAb6, zAb7, kblVar, kbmVar, zAb8, zAb9, boolP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new kbn[i];
    }
}

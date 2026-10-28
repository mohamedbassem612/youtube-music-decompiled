package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lre implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String strT = null;
        ArrayList arrayListX = arrayList;
        ArrayList arrayListX2 = arrayList2;
        ArrayList arrayListX3 = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        String strT9 = null;
        lst lstVar = null;
        String strT10 = null;
        String strT11 = null;
        lsq lsqVar = null;
        int I = 0;
        boolean zAb = false;
        String strT12 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            String str = strT2;
            switch ((char) i) {
                case 2:
                    strT2 = ksy.T(parcel, i);
                    continue;
                case 3:
                    strT3 = ksy.T(parcel, i);
                    break;
                case 4:
                    strT4 = ksy.T(parcel, i);
                    break;
                case 5:
                    strT5 = ksy.T(parcel, i);
                    break;
                case 6:
                    strT6 = ksy.T(parcel, i);
                    break;
                case 7:
                    strT = ksy.T(parcel, i);
                    break;
                case '\b':
                    strT12 = ksy.T(parcel, i);
                    break;
                case '\t':
                    strT7 = ksy.T(parcel, i);
                    break;
                case '\n':
                    strT8 = ksy.T(parcel, i);
                    break;
                case 11:
                    strT9 = ksy.T(parcel, i);
                    break;
                case '\f':
                    I = ksy.I(parcel, i);
                    break;
                case '\r':
                    arrayListX = ksy.X(parcel, i, lsv.CREATOR);
                    break;
                case 14:
                    lstVar = (lst) ksy.O(parcel, i, lst.CREATOR);
                    break;
                case 15:
                    arrayListX2 = ksy.X(parcel, i, LatLng.CREATOR);
                    break;
                case 16:
                    strT10 = ksy.T(parcel, i);
                    break;
                case 17:
                    strT11 = ksy.T(parcel, i);
                    break;
                case 18:
                    arrayListX3 = ksy.X(parcel, i, lsp.CREATOR);
                    break;
                case 19:
                    zAb = ksy.ab(parcel, i);
                    break;
                case 20:
                    arrayList4 = ksy.X(parcel, i, lsu.CREATOR);
                    break;
                case 21:
                    arrayList5 = ksy.X(parcel, i, lss.CREATOR);
                    break;
                case 22:
                    arrayList6 = ksy.X(parcel, i, lsu.CREATOR);
                    break;
                case 23:
                    lsqVar = (lsq) ksy.O(parcel, i, lsq.CREATOR);
                    break;
                default:
                    ksy.aa(parcel, i);
                    break;
            }
            strT2 = str;
        }
        ksy.Y(parcel, iK);
        return new lrd(strT2, strT3, strT4, strT5, strT6, strT, strT12, strT7, strT8, strT9, I, arrayListX, lstVar, arrayListX2, strT10, strT11, arrayListX3, zAb, arrayList4, arrayList5, arrayList6, lsqVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new lrd[i];
    }
}

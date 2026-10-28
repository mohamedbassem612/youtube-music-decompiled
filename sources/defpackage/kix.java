package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kix implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        int[] iArrAd = null;
        String[] strArrAg = null;
        int[] iArrAd2 = null;
        byte[][] bArrAh = null;
        lle[] lleVarArr = null;
        kjv kjvVar = null;
        String[] strArrAg2 = null;
        kjp kjpVar = null;
        kjg kjgVar = null;
        byte[] bArrAc = null;
        Long lS = null;
        int I = 0;
        boolean zAb = true;
        kjw kjwVar = null;
        byte[] bArrAc2 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            kjw kjwVar2 = kjwVar;
            switch ((char) i) {
                case 2:
                    kjwVar = (kjw) ksy.O(parcel, i, kjw.CREATOR);
                    continue;
                case 3:
                    bArrAc2 = ksy.ac(parcel, i);
                    break;
                case 4:
                    iArrAd = ksy.ad(parcel, i);
                    break;
                case 5:
                    strArrAg = ksy.ag(parcel, i);
                    break;
                case 6:
                    iArrAd2 = ksy.ad(parcel, i);
                    break;
                case 7:
                    bArrAh = ksy.ah(parcel, i);
                    break;
                case '\b':
                    zAb = ksy.ab(parcel, i);
                    break;
                case '\t':
                    lleVarArr = (lle[]) ksy.af(parcel, i, lle.CREATOR);
                    break;
                case '\n':
                default:
                    ksy.aa(parcel, i);
                    break;
                case 11:
                    kjvVar = (kjv) ksy.O(parcel, i, kjv.CREATOR);
                    break;
                case '\f':
                    strArrAg2 = ksy.ag(parcel, i);
                    break;
                case '\r':
                    I = ksy.I(parcel, i);
                    break;
                case 14:
                    kjpVar = (kjp) ksy.O(parcel, i, kjp.CREATOR);
                    break;
                case 15:
                    kjgVar = (kjg) ksy.O(parcel, i, kjg.CREATOR);
                    break;
                case 16:
                    bArrAc = ksy.ac(parcel, i);
                    break;
                case 17:
                    lS = ksy.S(parcel, i);
                    break;
            }
            kjwVar = kjwVar2;
        }
        ksy.Y(parcel, iK);
        return new kiw(kjwVar, bArrAc2, iArrAd, strArrAg, iArrAd2, bArrAh, zAb, lleVarArr, kjvVar, strArrAg2, I, kjpVar, kjgVar, bArrAc, lS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new kiw[i];
    }
}

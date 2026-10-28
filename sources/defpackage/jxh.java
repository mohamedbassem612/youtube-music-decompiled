package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        int I = 0;
        int I2 = 0;
        boolean zAb = false;
        String strT = null;
        int[] iArrAd = null;
        byte[] bArrAc = null;
        Bundle[] bundleArr = null;
        Bundle[] bundleArr2 = null;
        Bundle[] bundleArr3 = null;
        int[] iArrAd2 = null;
        String[] strArrAg = null;
        byte[] bArrAc2 = null;
        double[] dArrCreateDoubleArray = null;
        Bundle bundleM = null;
        long[] jArrAe = null;
        long[] jArrAe2 = null;
        Bundle[] bundleArr4 = null;
        int[] iArrAd3 = null;
        byte[] bArrAc3 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strT = ksy.T(parcel, i);
                    break;
                case 2:
                    iArrAd = ksy.ad(parcel, i);
                    break;
                case 3:
                    bArrAc = ksy.ac(parcel, i);
                    break;
                case 4:
                    bundleArr = (Bundle[]) ksy.af(parcel, i, Bundle.CREATOR);
                    break;
                case 5:
                    bundleArr2 = (Bundle[]) ksy.af(parcel, i, Bundle.CREATOR);
                    break;
                case 6:
                    bundleArr3 = (Bundle[]) ksy.af(parcel, i, Bundle.CREATOR);
                    break;
                case 7:
                    I = ksy.I(parcel, i);
                    break;
                case '\b':
                    iArrAd2 = ksy.ad(parcel, i);
                    break;
                case '\t':
                    strArrAg = ksy.ag(parcel, i);
                    break;
                case '\n':
                    bArrAc2 = ksy.ac(parcel, i);
                    break;
                case 11:
                    int iJ = ksy.J(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iJ != 0) {
                        dArrCreateDoubleArray = parcel.createDoubleArray();
                        parcel.setDataPosition(iDataPosition + iJ);
                    } else {
                        dArrCreateDoubleArray = null;
                    }
                    break;
                case '\f':
                    bundleM = ksy.M(parcel, i);
                    break;
                case '\r':
                    I2 = ksy.I(parcel, i);
                    break;
                case 14:
                    jArrAe = ksy.ae(parcel, i);
                    break;
                case 15:
                    jArrAe2 = ksy.ae(parcel, i);
                    break;
                case 16:
                    bundleArr4 = (Bundle[]) ksy.af(parcel, i, Bundle.CREATOR);
                    break;
                case 17:
                    iArrAd3 = ksy.ad(parcel, i);
                    break;
                case 18:
                    bArrAc3 = ksy.ac(parcel, i);
                    break;
                case 19:
                    zAb = ksy.ab(parcel, i);
                    break;
                default:
                    ksy.aa(parcel, i);
                    break;
            }
        }
        ksy.Y(parcel, iK);
        return new jxg(strT, iArrAd, bArrAc, bundleArr, bundleArr2, bundleArr3, I, iArrAd2, strArrAg, bArrAc2, dArrCreateDoubleArray, bundleM, I2, jArrAe, jArrAe2, bundleArr4, iArrAd3, bArrAc3, zAb);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new jxg[i];
    }
}

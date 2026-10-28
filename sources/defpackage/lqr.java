package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        String strT = null;
        double dG = 0.0d;
        int I = 0;
        int I2 = 0;
        boolean zAb = false;
        String strT2 = null;
        Point[] pointArr = null;
        lqj lqjVar = null;
        lqm lqmVar = null;
        lqn lqnVar = null;
        lqp lqpVar = null;
        lqo lqoVar = null;
        lqk lqkVar = null;
        lqg lqgVar = null;
        lqh lqhVar = null;
        lqi lqiVar = null;
        byte[] bArrAc = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            int i2 = I;
            switch ((char) i) {
                case 2:
                    I = ksy.I(parcel, i);
                    continue;
                case 3:
                    I = i2;
                    strT2 = ksy.T(parcel, i);
                    continue;
                case 4:
                    I = i2;
                    strT = ksy.T(parcel, i);
                    continue;
                case 5:
                    I = i2;
                    I2 = ksy.I(parcel, i);
                    continue;
                case 6:
                    I = i2;
                    pointArr = (Point[]) ksy.af(parcel, i, Point.CREATOR);
                    continue;
                case 7:
                    I = i2;
                    lqjVar = (lqj) ksy.O(parcel, i, lqj.CREATOR);
                    continue;
                case '\b':
                    I = i2;
                    lqmVar = (lqm) ksy.O(parcel, i, lqm.CREATOR);
                    continue;
                case '\t':
                    I = i2;
                    lqnVar = (lqn) ksy.O(parcel, i, lqn.CREATOR);
                    continue;
                case '\n':
                    I = i2;
                    lqpVar = (lqp) ksy.O(parcel, i, lqp.CREATOR);
                    continue;
                case 11:
                    I = i2;
                    lqoVar = (lqo) ksy.O(parcel, i, lqo.CREATOR);
                    continue;
                case '\f':
                    I = i2;
                    lqkVar = (lqk) ksy.O(parcel, i, lqk.CREATOR);
                    continue;
                case '\r':
                    I = i2;
                    lqgVar = (lqg) ksy.O(parcel, i, lqg.CREATOR);
                    continue;
                case 14:
                    I = i2;
                    lqhVar = (lqh) ksy.O(parcel, i, lqh.CREATOR);
                    continue;
                case 15:
                    I = i2;
                    lqiVar = (lqi) ksy.O(parcel, i, lqi.CREATOR);
                    continue;
                case 16:
                    I = i2;
                    bArrAc = ksy.ac(parcel, i);
                    continue;
                case 17:
                    I = i2;
                    zAb = ksy.ab(parcel, i);
                    continue;
                case 18:
                    dG = ksy.G(parcel, i);
                    break;
                default:
                    ksy.aa(parcel, i);
                    break;
            }
            I = i2;
        }
        ksy.Y(parcel, iK);
        return new lqq(I, strT2, strT, I2, pointArr, lqjVar, lqmVar, lqnVar, lqpVar, lqoVar, lqkVar, lqgVar, lqhVar, lqiVar, bArrAc, zAb, dG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new lqq[i];
    }
}

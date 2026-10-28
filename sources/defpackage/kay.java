package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kay implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        long[] jArrAe = null;
        String strT = null;
        ArrayList arrayListX = null;
        jzs jzsVar = null;
        kbb kbbVar = null;
        kar karVar = null;
        kau kauVar = null;
        int I = 0;
        int I2 = 0;
        boolean zAb = false;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        boolean zAb2 = false;
        double dG = 0.0d;
        long jL = 0;
        long jL2 = 0;
        MediaInfo mediaInfo = null;
        int I6 = 0;
        double dG2 = 0.0d;
        long jL3 = 0;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            MediaInfo mediaInfo2 = mediaInfo;
            switch ((char) i) {
                case 2:
                    mediaInfo = (MediaInfo) ksy.O(parcel, i, MediaInfo.CREATOR);
                    continue;
                case 3:
                    jL3 = ksy.L(parcel, i);
                    break;
                case 4:
                    mediaInfo = mediaInfo2;
                    I6 = ksy.I(parcel, i);
                    continue;
                case 5:
                    dG2 = ksy.G(parcel, i);
                    break;
                case 6:
                    mediaInfo = mediaInfo2;
                    I = ksy.I(parcel, i);
                    continue;
                case 7:
                    mediaInfo = mediaInfo2;
                    I2 = ksy.I(parcel, i);
                    continue;
                case '\b':
                    jL = ksy.L(parcel, i);
                    break;
                case '\t':
                    jL2 = ksy.L(parcel, i);
                    break;
                case '\n':
                    dG = ksy.G(parcel, i);
                    break;
                case 11:
                    mediaInfo = mediaInfo2;
                    zAb = ksy.ab(parcel, i);
                    continue;
                case '\f':
                    mediaInfo = mediaInfo2;
                    jArrAe = ksy.ae(parcel, i);
                    continue;
                case '\r':
                    mediaInfo = mediaInfo2;
                    I3 = ksy.I(parcel, i);
                    continue;
                case 14:
                    mediaInfo = mediaInfo2;
                    I4 = ksy.I(parcel, i);
                    continue;
                case 15:
                    mediaInfo = mediaInfo2;
                    strT = ksy.T(parcel, i);
                    continue;
                case 16:
                    mediaInfo = mediaInfo2;
                    I5 = ksy.I(parcel, i);
                    continue;
                case 17:
                    mediaInfo = mediaInfo2;
                    arrayListX = ksy.X(parcel, i, kav.CREATOR);
                    continue;
                case 18:
                    mediaInfo = mediaInfo2;
                    zAb2 = ksy.ab(parcel, i);
                    continue;
                case 19:
                    mediaInfo = mediaInfo2;
                    jzsVar = (jzs) ksy.O(parcel, i, jzs.CREATOR);
                    continue;
                case 20:
                    mediaInfo = mediaInfo2;
                    kbbVar = (kbb) ksy.O(parcel, i, kbb.CREATOR);
                    continue;
                case 21:
                    mediaInfo = mediaInfo2;
                    karVar = (kar) ksy.O(parcel, i, kar.CREATOR);
                    continue;
                case 22:
                    mediaInfo = mediaInfo2;
                    kauVar = (kau) ksy.O(parcel, i, kau.CREATOR);
                    continue;
                default:
                    ksy.aa(parcel, i);
                    break;
            }
            mediaInfo = mediaInfo2;
        }
        ksy.Y(parcel, iK);
        return new kax(mediaInfo, jL3, I6, dG2, I, I2, jL, jL2, dG, zAb, jArrAe, I3, I4, strT, I5, arrayListX, zAb2, jzsVar, kbbVar, karVar, kauVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new kax[i];
    }
}

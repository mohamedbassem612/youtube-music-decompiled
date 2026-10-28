package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        kas kasVar = null;
        ArrayList arrayListX = null;
        kaz kazVar = null;
        String strT = null;
        ArrayList arrayListX2 = null;
        ArrayList arrayListX3 = null;
        String strT2 = null;
        kba kbaVar = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        long jL = 0;
        long jL2 = 0;
        int I = 0;
        String strT7 = null;
        String strT8 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            String str = strT7;
            switch ((char) i) {
                case 2:
                    strT7 = ksy.T(parcel, i);
                    continue;
                case 3:
                    strT7 = str;
                    I = ksy.I(parcel, i);
                    continue;
                case 4:
                    strT7 = str;
                    strT8 = ksy.T(parcel, i);
                    continue;
                case 5:
                    strT7 = str;
                    kasVar = (kas) ksy.O(parcel, i, kas.CREATOR);
                    continue;
                case 6:
                    jL = ksy.L(parcel, i);
                    break;
                case 7:
                    strT7 = str;
                    arrayListX = ksy.X(parcel, i, MediaTrack.CREATOR);
                    continue;
                case '\b':
                    strT7 = str;
                    kazVar = (kaz) ksy.O(parcel, i, kaz.CREATOR);
                    continue;
                case '\t':
                    strT7 = str;
                    strT = ksy.T(parcel, i);
                    continue;
                case '\n':
                    strT7 = str;
                    arrayListX2 = ksy.X(parcel, i, jzr.CREATOR);
                    continue;
                case 11:
                    strT7 = str;
                    arrayListX3 = ksy.X(parcel, i, jzq.CREATOR);
                    continue;
                case '\f':
                    strT7 = str;
                    strT2 = ksy.T(parcel, i);
                    continue;
                case '\r':
                    strT7 = str;
                    kbaVar = (kba) ksy.O(parcel, i, kba.CREATOR);
                    continue;
                case 14:
                    jL2 = ksy.L(parcel, i);
                    break;
                case 15:
                    strT7 = str;
                    strT3 = ksy.T(parcel, i);
                    continue;
                case 16:
                    strT7 = str;
                    strT4 = ksy.T(parcel, i);
                    continue;
                case 17:
                    strT7 = str;
                    strT5 = ksy.T(parcel, i);
                    continue;
                case 18:
                    strT7 = str;
                    strT6 = ksy.T(parcel, i);
                    continue;
                default:
                    ksy.aa(parcel, i);
                    break;
            }
            strT7 = str;
        }
        ksy.Y(parcel, iK);
        return new MediaInfo(strT7, I, strT8, kasVar, jL, arrayListX, kazVar, strT, arrayListX2, arrayListX3, strT2, kbaVar, jL2, strT3, strT4, strT5, strT6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaInfo[i];
    }
}

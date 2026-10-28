package defpackage;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        ArrayList arrayListX = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        byte[] bArrAc = null;
        String strT7 = null;
        khd khdVar = null;
        Integer numR = null;
        Boolean boolP = null;
        Network network = null;
        int I = 0;
        int I2 = 0;
        int I3 = 0;
        boolean zAb = false;
        int I4 = -1;
        String strT8 = null;
        String strT9 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            String str = strT8;
            switch ((char) i) {
                case 2:
                    strT8 = ksy.T(parcel, i);
                    continue;
                case 3:
                    strT9 = ksy.T(parcel, i);
                    break;
                case 4:
                    strT = ksy.T(parcel, i);
                    break;
                case 5:
                    strT2 = ksy.T(parcel, i);
                    break;
                case 6:
                    strT3 = ksy.T(parcel, i);
                    break;
                case 7:
                    I = ksy.I(parcel, i);
                    break;
                case '\b':
                    arrayListX = ksy.X(parcel, i, kpo.CREATOR);
                    break;
                case '\t':
                    I2 = ksy.I(parcel, i);
                    break;
                case '\n':
                    I4 = ksy.I(parcel, i);
                    break;
                case 11:
                    strT4 = ksy.T(parcel, i);
                    break;
                case '\f':
                    strT5 = ksy.T(parcel, i);
                    break;
                case '\r':
                    I3 = ksy.I(parcel, i);
                    break;
                case 14:
                    strT6 = ksy.T(parcel, i);
                    break;
                case 15:
                    bArrAc = ksy.ac(parcel, i);
                    break;
                case 16:
                    strT7 = ksy.T(parcel, i);
                    break;
                case 17:
                    zAb = ksy.ab(parcel, i);
                    break;
                case 18:
                    khdVar = (khd) ksy.O(parcel, i, khd.CREATOR);
                    break;
                case 19:
                    numR = ksy.R(parcel, i);
                    break;
                case 20:
                    boolP = ksy.P(parcel, i);
                    break;
                case 21:
                    network = (Network) ksy.O(parcel, i, Network.CREATOR);
                    break;
                default:
                    ksy.aa(parcel, i);
                    break;
            }
            strT8 = str;
        }
        ksy.Y(parcel, iK);
        return new CastDevice(strT8, strT9, strT, strT2, strT3, I, arrayListX, I2, I4, strT4, strT5, I3, strT6, bArrAc, strT7, zAb, khdVar, numR, boolP, network);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }
}

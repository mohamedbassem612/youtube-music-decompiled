package defpackage;

import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.model.Alert;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.chromium.base.IDeviceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ahpw implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public ahpw(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        auko aukoVar;
        Object ahpvVar;
        aukn auknVar;
        Uri uri = null;
        Bundle bundleM = null;
        String strT = null;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                long jL = 0;
                String strT2 = null;
                Bundle bundleM2 = null;
                Uri uri2 = null;
                int I = 0;
                String strT3 = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            strT2 = ksy.T(parcel, i);
                            break;
                        case 2:
                            strT3 = ksy.T(parcel, i);
                            break;
                        case 3:
                            I = ksy.I(parcel, i);
                            break;
                        case 4:
                            jL = ksy.L(parcel, i);
                            break;
                        case 5:
                            bundleM2 = ksy.M(parcel, i);
                            break;
                        case 6:
                            uri2 = (Uri) ksy.O(parcel, i, Uri.CREATOR);
                            break;
                        default:
                            ksy.aa(parcel, i);
                            break;
                    }
                }
                ksy.Y(parcel, iK);
                ahpvVar = new ahpv(strT2, strT3, I, jL, bundleM2, uri2);
                break;
            case 1:
                return new afko(parcel);
            case 2:
                int iK2 = ksy.K(parcel);
                Uri uri3 = null;
                ArrayList arrayListX = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        uri = (Uri) ksy.O(parcel, i2, Uri.CREATOR);
                    } else if (c == 2) {
                        uri3 = (Uri) ksy.O(parcel, i2, Uri.CREATOR);
                    } else if (c != 3) {
                        ksy.aa(parcel, i2);
                    } else {
                        arrayListX = ksy.X(parcel, i2, ahqe.CREATOR);
                    }
                }
                ksy.Y(parcel, iK2);
                return new ahqf(uri, uri3, arrayListX);
            case 3:
                int iK3 = ksy.K(parcel);
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 2) {
                        ksy.aa(parcel, i3);
                    } else {
                        strT = ksy.T(parcel, i3);
                    }
                }
                ksy.Y(parcel, iK3);
                return new ahqe(strT);
            case 4:
                int iK4 = ksy.K(parcel);
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 2) {
                        ksy.aa(parcel, i4);
                    } else {
                        bundleM = ksy.M(parcel, i4);
                    }
                }
                ksy.Y(parcel, iK4);
                return new ahth(bundleM);
            case 5:
                return new aukj(parcel);
            case 6:
                return new aukk(parcel);
            case 7:
                return new aukl(parcel);
            case 8:
                synchronized (auko.k) {
                    ArrayDeque arrayDeque = auko.j;
                    aukoVar = arrayDeque.isEmpty() ? new auko() : (auko) arrayDeque.remove();
                    break;
                }
                aukoVar.b(parcel);
                ahpvVar = aukoVar;
                break;
            case 9:
                synchronized (aukn.b) {
                    ArrayDeque arrayDeque2 = aukn.a;
                    auknVar = arrayDeque2.isEmpty() ? new aukn() : (aukn) arrayDeque2.remove();
                    break;
                }
                auknVar.b(parcel);
                ahpvVar = auknVar;
                break;
            case 10:
                return new aukp(parcel);
            case 11:
                return new aukq(parcel);
            case 12:
                return new aukr(parcel);
            case 13:
                return new auks(parcel);
            case 14:
                return new aukt(parcel);
            case 15:
                return new aukv(parcel);
            case 16:
                return new aukw(parcel);
            default:
                IDeviceInfo iDeviceInfo = new IDeviceInfo();
                int iDataPosition = parcel.dataPosition();
                int i5 = parcel.readInt();
                try {
                    if (i5 < 4) {
                        throw new BadParcelableException("Parcelable too small");
                    }
                    if (parcel.dataPosition() - iDataPosition < i5) {
                        iDeviceInfo.a = parcel.readString();
                        if (parcel.dataPosition() - iDataPosition < i5) {
                            iDeviceInfo.b = parcel.readInt() != 0;
                            if (parcel.dataPosition() - iDataPosition < i5) {
                                iDeviceInfo.c = parcel.readInt() != 0;
                                if (parcel.dataPosition() - iDataPosition < i5) {
                                    iDeviceInfo.d = parcel.readInt() != 0;
                                    if (parcel.dataPosition() - iDataPosition < i5) {
                                        iDeviceInfo.e = parcel.readInt() != 0;
                                        if (parcel.dataPosition() - iDataPosition < i5) {
                                            iDeviceInfo.f = parcel.readInt();
                                            if (parcel.dataPosition() - iDataPosition < i5) {
                                                iDeviceInfo.g = parcel.readInt() != 0;
                                                if (parcel.dataPosition() - iDataPosition < i5) {
                                                    iDeviceInfo.h = parcel.readInt() != 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (iDataPosition <= Alert.DURATION_SHOW_INDEFINITELY - i5) {
                        parcel.setDataPosition(iDataPosition + i5);
                        return iDeviceInfo;
                    }
                    throw new BadParcelableException("Overflow in the size of parcelable");
                } catch (Throwable th) {
                    if (iDataPosition <= Alert.DURATION_SHOW_INDEFINITELY - i5) {
                        parcel.setDataPosition(iDataPosition + i5);
                        throw th;
                    }
                }
        }
        return ahpvVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new ahpv[i];
            case 1:
                return new afko[i];
            case 2:
                return new ahqf[i];
            case 3:
                return new ahqe[i];
            case 4:
                return new ahth[i];
            case 5:
                return new aukj[i];
            case 6:
                return new aukk[i];
            case 7:
                return new aukl[i];
            case 8:
                return new auko[i];
            case 9:
                return new aukn[i];
            case 10:
                return new aukp[i];
            case 11:
                return new aukq[i];
            case 12:
                return new aukr[i];
            case 13:
                return new auks[i];
            case 14:
                return new aukt[i];
            case 15:
                return new aukv[i];
            case 16:
                return new aukw[i];
            default:
                return new IDeviceInfo[i];
        }
    }
}

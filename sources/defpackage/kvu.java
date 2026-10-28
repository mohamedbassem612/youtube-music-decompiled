package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvu implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public kvu(int i) {
        this.$cid = i;
    }

    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object lkuVar;
        int I = 0;
        int I2 = 0;
        int I3 = 0;
        boolean zAb = false;
        int I4 = 0;
        String strT = null;
        Status status = null;
        Status status2 = null;
        Status status3 = null;
        Status status4 = null;
        byte[] bArrAc = null;
        Status status5 = null;
        String strT2 = null;
        byte[] bArrAc2 = null;
        ArrayList arrayListX = null;
        String strT3 = null;
        byte[] bArrAc3 = null;
        byte[] bArrAc4 = null;
        llg[] llgVarArr = null;
        Uri uri = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri2 = null;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                int I5 = 0;
                boolean zAb2 = false;
                String strT4 = null;
                String[] strArrAg = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        strT = ksy.T(parcel, i);
                    } else if (c == 3) {
                        strArrAg = ksy.ag(parcel, i);
                    } else if (c == 4) {
                        I5 = ksy.I(parcel, i);
                    } else if (c == 5) {
                        zAb2 = ksy.ab(parcel, i);
                    } else if (c != 6) {
                        ksy.aa(parcel, i);
                    } else {
                        strT4 = ksy.T(parcel, i);
                    }
                }
                ksy.Y(parcel, iK);
                return new kvt(strT, strT4, strArrAg, I5, zAb2);
            case 1:
                int iK2 = ksy.K(parcel);
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        uri2 = (Uri) ksy.O(parcel, i2, Uri.CREATOR);
                    } else if (c2 != 2) {
                        ksy.aa(parcel, i2);
                    } else {
                        I = ksy.I(parcel, i2);
                    }
                }
                ksy.Y(parcel, iK2);
                return new lks(uri2, I);
            case 2:
                int iK3 = ksy.K(parcel);
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        ksy.aa(parcel, i3);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) ksy.O(parcel, i3, ParcelFileDescriptor.CREATOR);
                    }
                }
                ksy.Y(parcel, iK3);
                return new lkt(parcelFileDescriptor);
            case 3:
                int iK4 = ksy.K(parcel);
                Uri uri3 = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        uri = (Uri) ksy.O(parcel, i4, Uri.CREATOR);
                    } else if (c3 != 2) {
                        ksy.aa(parcel, i4);
                    } else {
                        uri3 = (Uri) ksy.O(parcel, i4, Uri.CREATOR);
                    }
                }
                ksy.Y(parcel, iK4);
                lkuVar = new lku(uri, uri3);
                break;
            case 4:
                int iK5 = ksy.K(parcel);
                String[] strArrAg2 = null;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 2) {
                        I4 = ksy.I(parcel, i5);
                    } else if (c4 == 3) {
                        llgVarArr = (llg[]) ksy.af(parcel, i5, llg.CREATOR);
                    } else if (c4 != 4) {
                        ksy.aa(parcel, i5);
                    } else {
                        strArrAg2 = ksy.ag(parcel, i5);
                    }
                }
                ksy.Y(parcel, iK5);
                lkuVar = new lkz(I4, llgVarArr, strArrAg2);
                break;
            case 5:
                int iK6 = ksy.K(parcel);
                boolean zAb3 = false;
                String strT5 = null;
                lkz[] lkzVarArr = null;
                byte[] bArrAc5 = null;
                long jL = 0;
                String strT6 = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            strT6 = ksy.T(parcel, i6);
                            break;
                        case 3:
                            strT5 = ksy.T(parcel, i6);
                            break;
                        case 4:
                            lkzVarArr = (lkz[]) ksy.af(parcel, i6, lkz.CREATOR);
                            break;
                        case 5:
                            zAb3 = ksy.ab(parcel, i6);
                            break;
                        case 6:
                            bArrAc5 = ksy.ac(parcel, i6);
                            break;
                        case 7:
                            jL = ksy.L(parcel, i6);
                            break;
                        default:
                            ksy.aa(parcel, i6);
                            break;
                    }
                }
                ksy.Y(parcel, iK6);
                return new lla(strT6, strT5, lkzVarArr, zAb3, bArrAc5, jL);
            case 6:
                int iK7 = ksy.K(parcel);
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 2) {
                        ksy.aa(parcel, i7);
                    } else {
                        bArrAc4 = ksy.ac(parcel, i7);
                    }
                }
                ksy.Y(parcel, iK7);
                return new llb(bArrAc4);
            case 7:
                int iK8 = ksy.K(parcel);
                double dG = 0.0d;
                boolean zAb4 = false;
                int I6 = 0;
                int I7 = 0;
                int I8 = 0;
                String strT7 = null;
                long jL2 = 0;
                String strT8 = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 2:
                            strT8 = ksy.T(parcel, i8);
                            break;
                        case 3:
                            jL2 = ksy.L(parcel, i8);
                            break;
                        case 4:
                            zAb4 = ksy.ab(parcel, i8);
                            break;
                        case 5:
                            dG = ksy.G(parcel, i8);
                            break;
                        case 6:
                            strT7 = ksy.T(parcel, i8);
                            break;
                        case 7:
                            bArrAc3 = ksy.ac(parcel, i8);
                            break;
                        case '\b':
                            I6 = ksy.I(parcel, i8);
                            break;
                        case '\t':
                            I7 = ksy.I(parcel, i8);
                            break;
                        case '\n':
                            I8 = ksy.I(parcel, i8);
                            break;
                        default:
                            ksy.aa(parcel, i8);
                            break;
                    }
                }
                ksy.Y(parcel, iK8);
                return new llg(strT8, jL2, zAb4, dG, strT7, bArrAc3, I6, I7, I8);
            case 8:
                int iK9 = ksy.K(parcel);
                String strT9 = null;
                llg llgVar = null;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 2) {
                        strT3 = ksy.T(parcel, i9);
                    } else if (c5 == 3) {
                        strT9 = ksy.T(parcel, i9);
                    } else if (c5 == 4) {
                        llgVar = (llg) ksy.O(parcel, i9, llg.CREATOR);
                    } else if (c5 != 5) {
                        ksy.aa(parcel, i9);
                    } else {
                        zAb = ksy.ab(parcel, i9);
                    }
                }
                ksy.Y(parcel, iK9);
                lkuVar = new llh(strT3, strT9, llgVar, zAb);
                break;
            case 9:
                int iK10 = ksy.K(parcel);
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 2) {
                        ksy.aa(parcel, i10);
                    } else {
                        arrayListX = ksy.X(parcel, i10, llh.CREATOR);
                    }
                }
                ksy.Y(parcel, iK10);
                return new lli(arrayListX);
            case 10:
                int iK11 = ksy.K(parcel);
                int I9 = 0;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        I3 = ksy.I(parcel, i11);
                    } else if (c6 != 2) {
                        ksy.aa(parcel, i11);
                    } else {
                        I9 = ksy.I(parcel, i11);
                    }
                }
                ksy.Y(parcel, iK11);
                lkuVar = new llj(I3, I9);
                break;
            case 11:
                int iK12 = ksy.K(parcel);
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        ksy.aa(parcel, i12);
                    } else {
                        bArrAc2 = ksy.ac(parcel, i12);
                    }
                }
                ksy.Y(parcel, iK12);
                return new lmh(bArrAc2);
            case 12:
                int iK13 = ksy.K(parcel);
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        ksy.aa(parcel, i13);
                    } else {
                        strT2 = ksy.T(parcel, i13);
                    }
                }
                ksy.Y(parcel, iK13);
                return new lmn(strT2);
            case 13:
                return new lmo(parcel);
            case 14:
                int iK14 = ksy.K(parcel);
                ArrayList arrayListX2 = null;
                Bundle bundleM = null;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        status5 = (Status) ksy.O(parcel, i14, Status.CREATOR);
                    } else if (c7 == 2) {
                        arrayListX2 = ksy.X(parcel, i14, lnl.CREATOR);
                    } else if (c7 != 3) {
                        ksy.aa(parcel, i14);
                    } else {
                        bundleM = ksy.M(parcel, i14);
                    }
                }
                ksy.Y(parcel, iK14);
                lkuVar = new lnk(status5, arrayListX2, bundleM);
                break;
            case 15:
                int iK15 = ksy.K(parcel);
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        I2 = ksy.I(parcel, i15);
                    } else if (c8 != 5) {
                        ksy.aa(parcel, i15);
                    } else {
                        bArrAc = ksy.ac(parcel, i15);
                    }
                }
                ksy.Y(parcel, iK15);
                return new lnl(I2, bArrAc);
            case 16:
                int iK16 = ksy.K(parcel);
                jwz jwzVar = null;
                Bundle bundleM2 = null;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    char c9 = (char) i16;
                    if (c9 == 1) {
                        status4 = (Status) ksy.O(parcel, i16, Status.CREATOR);
                    } else if (c9 == 2) {
                        jwzVar = (jwz) ksy.O(parcel, i16, jwz.CREATOR);
                    } else if (c9 != 3) {
                        ksy.aa(parcel, i16);
                    } else {
                        bundleM2 = ksy.M(parcel, i16);
                    }
                }
                ksy.Y(parcel, iK16);
                lkuVar = new lnm(status4, jwzVar, bundleM2);
                break;
            case 17:
                int iK17 = ksy.K(parcel);
                jxa jxaVar = null;
                Bundle bundleM3 = null;
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 1) {
                        status3 = (Status) ksy.O(parcel, i17, Status.CREATOR);
                    } else if (c10 == 2) {
                        jxaVar = (jxa) ksy.O(parcel, i17, jxa.CREATOR);
                    } else if (c10 != 3) {
                        ksy.aa(parcel, i17);
                    } else {
                        bundleM3 = ksy.M(parcel, i17);
                    }
                }
                ksy.Y(parcel, iK17);
                lkuVar = new lnn(status3, jxaVar, bundleM3);
                break;
            case 18:
                int iK18 = ksy.K(parcel);
                jxg jxgVar = null;
                Bundle bundleM4 = null;
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 1) {
                        status2 = (Status) ksy.O(parcel, i18, Status.CREATOR);
                    } else if (c11 == 2) {
                        jxgVar = (jxg) ksy.O(parcel, i18, jxg.CREATOR);
                    } else if (c11 != 3) {
                        ksy.aa(parcel, i18);
                    } else {
                        bundleM4 = ksy.M(parcel, i18);
                    }
                }
                ksy.Y(parcel, iK18);
                lkuVar = new lno(status2, jxgVar, bundleM4);
                break;
            case 19:
                int iK19 = ksy.K(parcel);
                int I10 = 0;
                int I11 = 0;
                String strT10 = null;
                String strT11 = null;
                String[] strArrAg3 = null;
                jxb jxbVar = null;
                Bundle bundleM5 = null;
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strT10 = ksy.T(parcel, i19);
                            break;
                        case 2:
                            strT11 = ksy.T(parcel, i19);
                            break;
                        case 3:
                            strArrAg3 = ksy.ag(parcel, i19);
                            break;
                        case 4:
                            I10 = ksy.I(parcel, i19);
                            break;
                        case 5:
                            I11 = ksy.I(parcel, i19);
                            break;
                        case 6:
                            jxbVar = (jxb) ksy.O(parcel, i19, jxb.CREATOR);
                            break;
                        case 7:
                            bundleM5 = ksy.M(parcel, i19);
                            break;
                        default:
                            ksy.aa(parcel, i19);
                            break;
                    }
                }
                ksy.Y(parcel, iK19);
                return new lnp(strT10, strT11, strArrAg3, I10, I11, jxbVar, bundleM5);
            default:
                int iK20 = ksy.K(parcel);
                jxg jxgVar2 = null;
                Bundle bundleM6 = null;
                while (parcel.dataPosition() < iK20) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        status = (Status) ksy.O(parcel, i20, Status.CREATOR);
                    } else if (c12 == 2) {
                        jxgVar2 = (jxg) ksy.O(parcel, i20, jxg.CREATOR);
                    } else if (c12 != 3) {
                        ksy.aa(parcel, i20);
                    } else {
                        bundleM6 = ksy.M(parcel, i20);
                    }
                }
                ksy.Y(parcel, iK20);
                lkuVar = new lnq(status, jxgVar2, bundleM6);
                break;
        }
        return lkuVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new kvt[i];
            case 1:
                return new lks[i];
            case 2:
                return new lkt[i];
            case 3:
                return new lku[i];
            case 4:
                return new lkz[i];
            case 5:
                return new lla[i];
            case 6:
                return new llb[i];
            case 7:
                return new llg[i];
            case 8:
                return new llh[i];
            case 9:
                return new lli[i];
            case 10:
                return new llj[i];
            case 11:
                return new lmh[i];
            case 12:
                return new lmn[i];
            case 13:
                return new lmo[i];
            case 14:
                return new lnk[i];
            case 15:
                return new lnl[i];
            case 16:
                return new lnm[i];
            case 17:
                return new lnn[i];
            case 18:
                return new lno[i];
            case 19:
                return new lnp[i];
            default:
                return new lnq[i];
        }
    }
}

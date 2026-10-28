package defpackage;

import android.accounts.Account;
import android.net.Network;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.ErrorDetails;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jwx implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public jwx(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object jyhVar;
        int I = 0;
        boolean zAb = false;
        boolean zAb2 = false;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        boolean zAb3 = false;
        String strT = null;
        String strT2 = null;
        ArrayList arrayListX = null;
        String strT3 = null;
        String strT4 = null;
        jyi jyiVar = null;
        jyp jypVar = null;
        ArrayList arrayListX2 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        String strT9 = null;
        String strT10 = null;
        String strT11 = null;
        String strT12 = null;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                int I5 = 14400;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        strT = ksy.T(parcel, i);
                    } else if (c != 2) {
                        ksy.aa(parcel, i);
                    } else {
                        I5 = ksy.I(parcel, i);
                    }
                }
                ksy.Y(parcel, iK);
                return new jww(strT, I5);
            case 1:
                return new jvr(parcel);
            case 2:
                int iK2 = ksy.K(parcel);
                String strT13 = null;
                Bundle bundleM = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        strT12 = ksy.T(parcel, i2);
                    } else if (c2 == 2) {
                        strT13 = ksy.T(parcel, i2);
                    } else if (c2 != 3) {
                        ksy.aa(parcel, i2);
                    } else {
                        bundleM = ksy.M(parcel, i2);
                    }
                }
                ksy.Y(parcel, iK2);
                return new jwy(strT12, strT13, bundleM);
            case 3:
                int iK3 = ksy.K(parcel);
                Bundle bundleM2 = null;
                Bundle bundleM3 = null;
                Bundle bundleM4 = null;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        strT11 = ksy.T(parcel, i3);
                    } else if (c3 == 2) {
                        bundleM2 = ksy.M(parcel, i3);
                    } else if (c3 == 3) {
                        bundleM3 = ksy.M(parcel, i3);
                    } else if (c3 != 4) {
                        ksy.aa(parcel, i3);
                    } else {
                        bundleM4 = ksy.M(parcel, i3);
                    }
                }
                ksy.Y(parcel, iK3);
                return new jwz(strT11, bundleM2, bundleM3, bundleM4);
            case 4:
                int iK4 = ksy.K(parcel);
                jwy[] jwyVarArr = null;
                int[] iArrAd = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        strT10 = ksy.T(parcel, i4);
                    } else if (c4 == 2) {
                        jwyVarArr = (jwy[]) ksy.af(parcel, i4, jwy.CREATOR);
                    } else if (c4 != 3) {
                        ksy.aa(parcel, i4);
                    } else {
                        iArrAd = ksy.ad(parcel, i4);
                    }
                }
                ksy.Y(parcel, iK4);
                return new jxa(strT10, jwyVarArr, iArrAd);
            case 5:
                int iK5 = ksy.K(parcel);
                boolean zAb4 = true;
                boolean zAb5 = false;
                boolean zAb6 = false;
                int I6 = 0;
                int I7 = 0;
                ArrayList arrayListW = null;
                ArrayList arrayListX3 = null;
                int[] iArrAd2 = null;
                byte[] bArrAc = null;
                jxc jxcVar = null;
                String strT14 = null;
                jww jwwVar = null;
                boolean zAb7 = false;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    ArrayList arrayList = arrayListW;
                    switch ((char) i5) {
                        case 1:
                            zAb5 = ksy.ab(parcel, i5);
                            break;
                        case 2:
                            arrayListW = ksy.W(parcel, i5);
                            continue;
                        case 3:
                            arrayListX3 = ksy.X(parcel, i5, jxi.CREATOR);
                            break;
                        case 4:
                            zAb6 = ksy.ab(parcel, i5);
                            break;
                        case 5:
                            I6 = ksy.I(parcel, i5);
                            break;
                        case 6:
                            I = ksy.I(parcel, i5);
                            break;
                        case 7:
                            zAb7 = ksy.ab(parcel, i5);
                            break;
                        case '\b':
                            I7 = ksy.I(parcel, i5);
                            break;
                        case '\t':
                            zAb4 = ksy.ab(parcel, i5);
                            break;
                        case '\n':
                            iArrAd2 = ksy.ad(parcel, i5);
                            break;
                        case 11:
                            bArrAc = ksy.ac(parcel, i5);
                            break;
                        case '\f':
                            jxcVar = (jxc) ksy.O(parcel, i5, jxc.CREATOR);
                            break;
                        case '\r':
                            strT14 = ksy.T(parcel, i5);
                            break;
                        case 14:
                        default:
                            ksy.aa(parcel, i5);
                            break;
                        case 15:
                            jwwVar = (jww) ksy.O(parcel, i5, jww.CREATOR);
                            break;
                    }
                    arrayListW = arrayList;
                }
                ksy.Y(parcel, iK5);
                return new jxb(zAb5, arrayListW, arrayListX3, zAb6, I6, I, zAb7, I7, zAb4, iArrAd2, bArrAc, jxcVar, strT14, jwwVar);
            case 6:
                int iK6 = ksy.K(parcel);
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        ksy.aa(parcel, i6);
                    } else {
                        strT9 = ksy.T(parcel, i6);
                    }
                }
                ksy.Y(parcel, iK6);
                return new jxc(strT9);
            case 7:
                int iK7 = ksy.K(parcel);
                int I8 = 0;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        strT8 = ksy.T(parcel, i7);
                    } else if (c5 == 2) {
                        zAb3 = ksy.ab(parcel, i7);
                    } else if (c5 != 3) {
                        ksy.aa(parcel, i7);
                    } else {
                        I8 = ksy.I(parcel, i7);
                    }
                }
                ksy.Y(parcel, iK7);
                return new jxi(strT8, zAb3, I8);
            case 8:
                int iK8 = ksy.K(parcel);
                String[] strArrAg = null;
                String[] strArrAg2 = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        strT7 = ksy.T(parcel, i8);
                    } else if (c6 == 2) {
                        strArrAg = ksy.ag(parcel, i8);
                    } else if (c6 != 3) {
                        ksy.aa(parcel, i8);
                    } else {
                        strArrAg2 = ksy.ag(parcel, i8);
                    }
                }
                ksy.Y(parcel, iK8);
                return new jxk(strT7, strArrAg, strArrAg2);
            case 9:
                int iK9 = ksy.K(parcel);
                long jL = 0;
                int I9 = 0;
                int I10 = 0;
                String strT15 = null;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            I9 = ksy.I(parcel, i9);
                            break;
                        case 2:
                            jL = ksy.L(parcel, i9);
                            break;
                        case 3:
                            strT15 = ksy.T(parcel, i9);
                            break;
                        case 4:
                            I10 = ksy.I(parcel, i9);
                            break;
                        case 5:
                            I4 = ksy.I(parcel, i9);
                            break;
                        case 6:
                            strT6 = ksy.T(parcel, i9);
                            break;
                        default:
                            ksy.aa(parcel, i9);
                            break;
                    }
                }
                ksy.Y(parcel, iK9);
                return new jxl(I9, jL, strT15, I10, I4, strT6);
            case 10:
                int iK10 = ksy.K(parcel);
                int I11 = 0;
                Account account = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        I3 = ksy.I(parcel, i10);
                    } else if (c7 == 2) {
                        I11 = ksy.I(parcel, i10);
                    } else if (c7 == 3) {
                        strT5 = ksy.T(parcel, i10);
                    } else if (c7 != 4) {
                        ksy.aa(parcel, i10);
                    } else {
                        account = (Account) ksy.O(parcel, i10, Account.CREATOR);
                    }
                }
                ksy.Y(parcel, iK10);
                return new jxm(I3, I11, strT5, account);
            case 11:
                int iK11 = ksy.K(parcel);
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        I2 = ksy.I(parcel, i11);
                    } else if (c8 != 2) {
                        ksy.aa(parcel, i11);
                    } else {
                        arrayListX2 = ksy.X(parcel, i11, jxl.CREATOR);
                    }
                }
                ksy.Y(parcel, iK11);
                return new jxn(I2, arrayListX2);
            case 12:
                int iK12 = ksy.K(parcel);
                boolean zAb8 = false;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        zAb2 = ksy.ab(parcel, i12);
                    } else if (c9 != 2) {
                        ksy.aa(parcel, i12);
                    } else {
                        zAb8 = ksy.ab(parcel, i12);
                    }
                }
                ksy.Y(parcel, iK12);
                return new jyi(zAb2, zAb8);
            case 13:
                int iK13 = ksy.K(parcel);
                jyi jyiVar2 = null;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        jypVar = (jyp) ksy.O(parcel, i13, jyp.CREATOR);
                    } else if (c10 != 2) {
                        ksy.aa(parcel, i13);
                    } else {
                        jyiVar2 = (jyi) ksy.O(parcel, i13, jyi.CREATOR);
                    }
                }
                ksy.Y(parcel, iK13);
                return new jyf(jypVar, jyiVar2);
            case 14:
                int iK14 = ksy.K(parcel);
                jyh jyhVar2 = null;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        jyiVar = (jyi) ksy.O(parcel, i14, jyi.CREATOR);
                    } else if (c11 != 2) {
                        ksy.aa(parcel, i14);
                    } else {
                        jyhVar2 = (jyh) ksy.O(parcel, i14, jyh.CREATOR);
                    }
                }
                ksy.Y(parcel, iK14);
                return new jyg(jyiVar, jyhVar2);
            case 15:
                int iK15 = ksy.K(parcel);
                String strT16 = null;
                String strT17 = null;
                String strT18 = null;
                byte[] bArrAc2 = null;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        strT4 = ksy.T(parcel, i15);
                    } else if (c12 == 3) {
                        strT16 = ksy.T(parcel, i15);
                    } else if (c12 == 4) {
                        strT17 = ksy.T(parcel, i15);
                    } else if (c12 == 5) {
                        strT18 = ksy.T(parcel, i15);
                    } else if (c12 != 6) {
                        ksy.aa(parcel, i15);
                    } else {
                        bArrAc2 = ksy.ac(parcel, i15);
                    }
                }
                ksy.Y(parcel, iK15);
                jyhVar = new jyh(strT4, strT16, strT17, strT18, bArrAc2);
                break;
            case 16:
                int iK16 = ksy.K(parcel);
                boolean zAb9 = false;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 1) {
                        zAb = ksy.ab(parcel, i16);
                    } else if (c13 != 2) {
                        ksy.aa(parcel, i16);
                    } else {
                        zAb9 = ksy.ab(parcel, i16);
                    }
                }
                ksy.Y(parcel, iK16);
                return new ErrorDetails(zAb, zAb9);
            case 17:
                int iK17 = ksy.K(parcel);
                boolean zAb10 = false;
                boolean zAb11 = false;
                ArrayList arrayListW2 = null;
                ArrayList arrayListW3 = null;
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 1) {
                        strT3 = ksy.T(parcel, i17);
                    } else if (c14 == 2) {
                        arrayListW2 = ksy.W(parcel, i17);
                    } else if (c14 == 3) {
                        arrayListW3 = ksy.W(parcel, i17);
                    } else if (c14 == 4) {
                        zAb10 = ksy.ab(parcel, i17);
                    } else if (c14 != 5) {
                        ksy.aa(parcel, i17);
                    } else {
                        zAb11 = ksy.ab(parcel, i17);
                    }
                }
                ksy.Y(parcel, iK17);
                jyhVar = new jyk(strT3, arrayListW2, arrayListW3, zAb10, zAb11);
                break;
            case 18:
                int iK18 = ksy.K(parcel);
                ArrayList arrayListX4 = null;
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        arrayListX = ksy.X(parcel, i18, jyp.CREATOR);
                    } else if (c15 != 2) {
                        ksy.aa(parcel, i18);
                    } else {
                        arrayListX4 = ksy.X(parcel, i18, jyf.CREATOR);
                    }
                }
                ksy.Y(parcel, iK18);
                return new jyl(arrayListX, arrayListX4);
            case 19:
                int iK19 = ksy.K(parcel);
                boolean zAb12 = false;
                boolean zAb13 = false;
                boolean zAb14 = false;
                int I12 = 0;
                jyp jypVar2 = null;
                String strT19 = null;
                ArrayList arrayListW4 = null;
                ArrayList arrayListW5 = null;
                ArrayList arrayListW6 = null;
                String strT20 = null;
                byte[] bArrAc3 = null;
                String strT21 = null;
                Network network = null;
                int I13 = 0;
                ArrayList arrayListW7 = null;
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    String str = strT19;
                    switch ((char) i19) {
                        case 1:
                            jypVar2 = (jyp) ksy.O(parcel, i19, jyp.CREATOR);
                            break;
                        case 2:
                            strT19 = ksy.T(parcel, i19);
                            continue;
                        case 3:
                            arrayListW4 = ksy.W(parcel, i19);
                            break;
                        case 4:
                            arrayListW5 = ksy.W(parcel, i19);
                            break;
                        case 5:
                            arrayListW6 = ksy.W(parcel, i19);
                            break;
                        case 6:
                            arrayListW7 = ksy.W(parcel, i19);
                            break;
                        case 7:
                            I13 = ksy.I(parcel, i19);
                            break;
                        case '\b':
                            strT20 = ksy.T(parcel, i19);
                            break;
                        case '\t':
                            zAb12 = ksy.ab(parcel, i19);
                            break;
                        case '\n':
                            bArrAc3 = ksy.ac(parcel, i19);
                            break;
                        case 11:
                            strT21 = ksy.T(parcel, i19);
                            break;
                        case '\f':
                            zAb13 = ksy.ab(parcel, i19);
                            break;
                        case '\r':
                            network = (Network) ksy.O(parcel, i19, Network.CREATOR);
                            break;
                        case 14:
                            zAb14 = ksy.ab(parcel, i19);
                            break;
                        case 15:
                            I12 = ksy.I(parcel, i19);
                            break;
                        default:
                            ksy.aa(parcel, i19);
                            break;
                    }
                    strT19 = str;
                }
                ksy.Y(parcel, iK19);
                return new jyn(jypVar2, strT19, arrayListW4, arrayListW5, arrayListW6, arrayListW7, I13, strT20, zAb12, bArrAc3, strT21, zAb13, network, zAb14, I12);
            default:
                int iK20 = ksy.K(parcel);
                jyr jyrVar = null;
                while (parcel.dataPosition() < iK20) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 1) {
                        strT2 = ksy.T(parcel, i20);
                    } else if (c16 != 2) {
                        ksy.aa(parcel, i20);
                    } else {
                        jyrVar = (jyr) ksy.O(parcel, i20, jyr.CREATOR);
                    }
                }
                ksy.Y(parcel, iK20);
                return new jyo(strT2, jyrVar);
        }
        return jyhVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new jww[i];
            case 1:
                return new jvr[i];
            case 2:
                return new jwy[i];
            case 3:
                return new jwz[i];
            case 4:
                return new jxa[i];
            case 5:
                return new jxb[i];
            case 6:
                return new jxc[i];
            case 7:
                return new jxi[i];
            case 8:
                return new jxk[i];
            case 9:
                return new jxl[i];
            case 10:
                return new jxm[i];
            case 11:
                return new jxn[i];
            case 12:
                return new jyi[i];
            case 13:
                return new jyf[i];
            case 14:
                return new jyg[i];
            case 15:
                return new jyh[i];
            case 16:
                return new ErrorDetails[i];
            case 17:
                return new jyk[i];
            case 18:
                return new jyl[i];
            case 19:
                return new jyn[i];
            default:
                return new jyo[i];
        }
    }
}

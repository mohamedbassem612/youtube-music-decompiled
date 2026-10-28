package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lof implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public lof(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object lptVar;
        int I = 0;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        boolean zAb = false;
        boolean zAb2 = false;
        boolean zAb3 = false;
        int I6 = 0;
        int I7 = 0;
        Intent intent = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String[] strArrAg = null;
        lqf lqfVar = null;
        String[] strArrAg2 = null;
        ArrayList arrayListX = null;
        String strT7 = null;
        klo kloVar = null;
        krq krqVar = null;
        ArrayList arrayListW = null;
        Status status = null;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                int I8 = 0;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        I = ksy.I(parcel, i);
                    } else if (c == 2) {
                        I8 = ksy.I(parcel, i);
                    } else if (c != 3) {
                        ksy.aa(parcel, i);
                    } else {
                        intent = (Intent) ksy.O(parcel, i, Intent.CREATOR);
                    }
                }
                ksy.Y(parcel, iK);
                return new loe(I, I8, intent);
            case 1:
                int iK2 = ksy.K(parcel);
                jxk jxkVar = null;
                Bundle bundleM = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        status = (Status) ksy.O(parcel, i2, Status.CREATOR);
                    } else if (c2 == 2) {
                        jxkVar = (jxk) ksy.O(parcel, i2, jxk.CREATOR);
                    } else if (c2 != 3) {
                        ksy.aa(parcel, i2);
                    } else {
                        bundleM = ksy.M(parcel, i2);
                    }
                }
                ksy.Y(parcel, iK2);
                return new lnr(status, jxkVar, bundleM);
            case 2:
                int iK3 = ksy.K(parcel);
                String strT8 = null;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        arrayListW = ksy.W(parcel, i3);
                    } else if (c3 != 2) {
                        ksy.aa(parcel, i3);
                    } else {
                        strT8 = ksy.T(parcel, i3);
                    }
                }
                ksy.Y(parcel, iK3);
                return new loi(arrayListW, strT8);
            case 3:
                int iK4 = ksy.K(parcel);
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        I7 = ksy.I(parcel, i4);
                    } else if (c4 != 2) {
                        ksy.aa(parcel, i4);
                    } else {
                        krqVar = (krq) ksy.O(parcel, i4, krq.CREATOR);
                    }
                }
                ksy.Y(parcel, iK4);
                return new lok(I7, krqVar);
            case 4:
                int iK5 = ksy.K(parcel);
                krr krrVar = null;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 1) {
                        I6 = ksy.I(parcel, i5);
                    } else if (c5 == 2) {
                        kloVar = (klo) ksy.O(parcel, i5, klo.CREATOR);
                    } else if (c5 != 3) {
                        ksy.aa(parcel, i5);
                    } else {
                        krrVar = (krr) ksy.O(parcel, i5, krr.CREATOR);
                    }
                }
                ksy.Y(parcel, iK5);
                return new lol(I6, kloVar, krrVar);
            case 5:
                int iK6 = ksy.K(parcel);
                byte[] bArrAc = null;
                ArrayList arrayListU = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c6 = (char) i6;
                    if (c6 == 1) {
                        strT7 = ksy.T(parcel, i6);
                    } else if (c6 == 2) {
                        bArrAc = ksy.ac(parcel, i6);
                    } else if (c6 != 3) {
                        ksy.aa(parcel, i6);
                    } else {
                        arrayListU = ksy.U(parcel, i6);
                    }
                }
                ksy.Y(parcel, iK6);
                return new lpj(strT7, bArrAc, arrayListU);
            case 6:
                int iK7 = ksy.K(parcel);
                boolean zAb4 = false;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c7 = (char) i7;
                    if (c7 == 1) {
                        arrayListX = ksy.X(parcel, i7, lpj.CREATOR);
                    } else if (c7 == 2) {
                        zAb3 = ksy.ab(parcel, i7);
                    } else if (c7 != 3) {
                        ksy.aa(parcel, i7);
                    } else {
                        zAb4 = ksy.ab(parcel, i7);
                    }
                }
                ksy.Y(parcel, iK7);
                return new lpk(arrayListX, zAb3, zAb4);
            case 7:
                int iK8 = ksy.K(parcel);
                int I9 = 0;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c8 = (char) i8;
                    if (c8 == 2) {
                        zAb2 = ksy.ab(parcel, i8);
                    } else if (c8 != 3) {
                        ksy.aa(parcel, i8);
                    } else {
                        I9 = ksy.I(parcel, i8);
                    }
                }
                ksy.Y(parcel, iK8);
                return new lpl(zAb2, I9);
            case 8:
                int iK9 = ksy.K(parcel);
                boolean zAb5 = false;
                int I10 = 0;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c9 = (char) i9;
                    if (c9 == 2) {
                        zAb = ksy.ab(parcel, i9);
                    } else if (c9 == 3) {
                        zAb5 = ksy.ab(parcel, i9);
                    } else if (c9 != 4) {
                        ksy.aa(parcel, i9);
                    } else {
                        I10 = ksy.I(parcel, i9);
                    }
                }
                ksy.Y(parcel, iK9);
                return new lpp(zAb, zAb5, I10);
            case 9:
                int iK10 = ksy.K(parcel);
                int I11 = 0;
                boolean zAb6 = false;
                int I12 = 0;
                ArrayList arrayListW2 = null;
                boolean zAb7 = false;
                String strT9 = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            I11 = ksy.I(parcel, i10);
                            break;
                        case 3:
                            zAb6 = ksy.ab(parcel, i10);
                            break;
                        case 4:
                            arrayListW2 = ksy.W(parcel, i10);
                            break;
                        case 5:
                            I12 = ksy.I(parcel, i10);
                            break;
                        case 6:
                            strT9 = ksy.T(parcel, i10);
                            break;
                        case 7:
                            zAb7 = ksy.ab(parcel, i10);
                            break;
                        default:
                            ksy.aa(parcel, i10);
                            break;
                    }
                }
                ksy.Y(parcel, iK10);
                lptVar = new lpt(I11, zAb6, arrayListW2, I12, strT9, zAb7);
                break;
            case 10:
                int iK11 = ksy.K(parcel);
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 2) {
                        I5 = ksy.I(parcel, i11);
                    } else if (c10 != 3) {
                        ksy.aa(parcel, i11);
                    } else {
                        strArrAg2 = ksy.ag(parcel, i11);
                    }
                }
                ksy.Y(parcel, iK11);
                return new lqe(I5, strArrAg2);
            case 11:
                int iK12 = ksy.K(parcel);
                int I13 = 0;
                int I14 = 0;
                int I15 = 0;
                int I16 = 0;
                boolean zAb8 = false;
                String strT10 = null;
                int I17 = 0;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            I13 = ksy.I(parcel, i12);
                            break;
                        case 3:
                            I14 = ksy.I(parcel, i12);
                            break;
                        case 4:
                            I15 = ksy.I(parcel, i12);
                            break;
                        case 5:
                            I16 = ksy.I(parcel, i12);
                            break;
                        case 6:
                            I4 = ksy.I(parcel, i12);
                            break;
                        case 7:
                            I17 = ksy.I(parcel, i12);
                            break;
                        case '\b':
                            zAb8 = ksy.ab(parcel, i12);
                            break;
                        case '\t':
                            strT10 = ksy.T(parcel, i12);
                            break;
                        default:
                            ksy.aa(parcel, i12);
                            break;
                    }
                }
                ksy.Y(parcel, iK12);
                lptVar = new lqf(I13, I14, I15, I16, I4, I17, zAb8, strT10);
                break;
            case 12:
                int iK13 = ksy.K(parcel);
                String strT11 = null;
                String strT12 = null;
                String strT13 = null;
                String strT14 = null;
                String strT15 = null;
                lqf lqfVar2 = null;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strT11 = ksy.T(parcel, i13);
                            break;
                        case 3:
                            strT12 = ksy.T(parcel, i13);
                            break;
                        case 4:
                            strT13 = ksy.T(parcel, i13);
                            break;
                        case 5:
                            strT14 = ksy.T(parcel, i13);
                            break;
                        case 6:
                            strT15 = ksy.T(parcel, i13);
                            break;
                        case 7:
                            lqfVar = (lqf) ksy.O(parcel, i13, lqf.CREATOR);
                            break;
                        case '\b':
                            lqfVar2 = (lqf) ksy.O(parcel, i13, lqf.CREATOR);
                            break;
                        default:
                            ksy.aa(parcel, i13);
                            break;
                    }
                }
                ksy.Y(parcel, iK13);
                lptVar = new lqg(strT11, strT12, strT13, strT14, strT15, lqfVar, lqfVar2);
                break;
            case 13:
                int iK14 = ksy.K(parcel);
                lql lqlVar = null;
                String strT16 = null;
                String strT17 = null;
                lqm[] lqmVarArr = null;
                lqj[] lqjVarArr = null;
                lqe[] lqeVarArr = null;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            lqlVar = (lql) ksy.O(parcel, i14, lql.CREATOR);
                            break;
                        case 3:
                            strT16 = ksy.T(parcel, i14);
                            break;
                        case 4:
                            strT17 = ksy.T(parcel, i14);
                            break;
                        case 5:
                            lqmVarArr = (lqm[]) ksy.af(parcel, i14, lqm.CREATOR);
                            break;
                        case 6:
                            lqjVarArr = (lqj[]) ksy.af(parcel, i14, lqj.CREATOR);
                            break;
                        case 7:
                            strArrAg = ksy.ag(parcel, i14);
                            break;
                        case '\b':
                            lqeVarArr = (lqe[]) ksy.af(parcel, i14, lqe.CREATOR);
                            break;
                        default:
                            ksy.aa(parcel, i14);
                            break;
                    }
                }
                ksy.Y(parcel, iK14);
                lptVar = new lqh(lqlVar, strT16, strT17, lqmVarArr, lqjVarArr, strArrAg, lqeVarArr);
                break;
            case 14:
                int iK15 = ksy.K(parcel);
                String strT18 = null;
                String strT19 = null;
                String strT20 = null;
                String strT21 = null;
                String strT22 = null;
                String strT23 = null;
                String strT24 = null;
                String strT25 = null;
                String strT26 = null;
                String strT27 = null;
                String strT28 = null;
                String strT29 = null;
                String strT30 = null;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    String str = strT19;
                    switch ((char) i15) {
                        case 2:
                            strT18 = ksy.T(parcel, i15);
                            break;
                        case 3:
                            strT19 = ksy.T(parcel, i15);
                            continue;
                        case 4:
                            strT20 = ksy.T(parcel, i15);
                            break;
                        case 5:
                            strT21 = ksy.T(parcel, i15);
                            break;
                        case 6:
                            strT22 = ksy.T(parcel, i15);
                            break;
                        case 7:
                            strT6 = ksy.T(parcel, i15);
                            break;
                        case '\b':
                            strT23 = ksy.T(parcel, i15);
                            break;
                        case '\t':
                            strT24 = ksy.T(parcel, i15);
                            break;
                        case '\n':
                            strT25 = ksy.T(parcel, i15);
                            break;
                        case 11:
                            strT26 = ksy.T(parcel, i15);
                            break;
                        case '\f':
                            strT27 = ksy.T(parcel, i15);
                            break;
                        case '\r':
                            strT28 = ksy.T(parcel, i15);
                            break;
                        case 14:
                            strT29 = ksy.T(parcel, i15);
                            break;
                        case 15:
                            strT30 = ksy.T(parcel, i15);
                            break;
                        default:
                            ksy.aa(parcel, i15);
                            break;
                    }
                    strT19 = str;
                }
                ksy.Y(parcel, iK15);
                lptVar = new lqi(strT18, strT19, strT20, strT21, strT22, strT6, strT23, strT24, strT25, strT26, strT27, strT28, strT29, strT30);
                break;
            case 15:
                int iK16 = ksy.K(parcel);
                String strT31 = null;
                String strT32 = null;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 2) {
                        I3 = ksy.I(parcel, i16);
                    } else if (c11 == 3) {
                        strT5 = ksy.T(parcel, i16);
                    } else if (c11 == 4) {
                        strT31 = ksy.T(parcel, i16);
                    } else if (c11 != 5) {
                        ksy.aa(parcel, i16);
                    } else {
                        strT32 = ksy.T(parcel, i16);
                    }
                }
                ksy.Y(parcel, iK16);
                return new lqj(I3, strT5, strT31, strT32);
            case 16:
                int iK17 = ksy.K(parcel);
                double dG = 0.0d;
                double dG2 = 0.0d;
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 2) {
                        dG = ksy.G(parcel, i17);
                    } else if (c12 != 3) {
                        ksy.aa(parcel, i17);
                    } else {
                        dG2 = ksy.G(parcel, i17);
                    }
                }
                ksy.Y(parcel, iK17);
                return new lqk(dG, dG2);
            case 17:
                int iK18 = ksy.K(parcel);
                String strT33 = null;
                String strT34 = null;
                String strT35 = null;
                String strT36 = null;
                String strT37 = null;
                String strT38 = null;
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            strT33 = ksy.T(parcel, i18);
                            break;
                        case 3:
                            strT34 = ksy.T(parcel, i18);
                            break;
                        case 4:
                            strT35 = ksy.T(parcel, i18);
                            break;
                        case 5:
                            strT36 = ksy.T(parcel, i18);
                            break;
                        case 6:
                            strT37 = ksy.T(parcel, i18);
                            break;
                        case 7:
                            strT4 = ksy.T(parcel, i18);
                            break;
                        case '\b':
                            strT38 = ksy.T(parcel, i18);
                            break;
                        default:
                            ksy.aa(parcel, i18);
                            break;
                    }
                }
                ksy.Y(parcel, iK18);
                lptVar = new lql(strT33, strT34, strT35, strT36, strT37, strT4, strT38);
                break;
            case 18:
                int iK19 = ksy.K(parcel);
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    char c13 = (char) i19;
                    if (c13 == 2) {
                        I2 = ksy.I(parcel, i19);
                    } else if (c13 != 3) {
                        ksy.aa(parcel, i19);
                    } else {
                        strT3 = ksy.T(parcel, i19);
                    }
                }
                ksy.Y(parcel, iK19);
                return new lqm(I2, strT3);
            case 19:
                int iK20 = ksy.K(parcel);
                String strT39 = null;
                while (parcel.dataPosition() < iK20) {
                    int i20 = parcel.readInt();
                    char c14 = (char) i20;
                    if (c14 == 2) {
                        strT2 = ksy.T(parcel, i20);
                    } else if (c14 != 3) {
                        ksy.aa(parcel, i20);
                    } else {
                        strT39 = ksy.T(parcel, i20);
                    }
                }
                ksy.Y(parcel, iK20);
                return new lqn(strT2, strT39);
            default:
                int iK21 = ksy.K(parcel);
                String strT40 = null;
                while (parcel.dataPosition() < iK21) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 2) {
                        strT = ksy.T(parcel, i21);
                    } else if (c15 != 3) {
                        ksy.aa(parcel, i21);
                    } else {
                        strT40 = ksy.T(parcel, i21);
                    }
                }
                ksy.Y(parcel, iK21);
                return new lqo(strT, strT40);
        }
        return lptVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new loe[i];
            case 1:
                return new lnr[i];
            case 2:
                return new loi[i];
            case 3:
                return new lok[i];
            case 4:
                return new lol[i];
            case 5:
                return new lpj[i];
            case 6:
                return new lpk[i];
            case 7:
                return new lpl[i];
            case 8:
                return new lpp[i];
            case 9:
                return new lpt[i];
            case 10:
                return new lqe[i];
            case 11:
                return new lqf[i];
            case 12:
                return new lqg[i];
            case 13:
                return new lqh[i];
            case 14:
                return new lqi[i];
            case 15:
                return new lqj[i];
            case 16:
                return new lqk[i];
            case 17:
                return new lql[i];
            case 18:
                return new lqm[i];
            case 19:
                return new lqn[i];
            default:
                return new lqo[i];
        }
    }
}

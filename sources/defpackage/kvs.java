package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvs implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public kvs(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:133:0x029c. Please report as an issue. */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object ljkVar;
        String strT;
        long jL = 0;
        int I = 0;
        kvt kvtVar = null;
        Uri uri = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        Long lS = null;
        Long lS2 = null;
        Long lS3 = null;
        String strT5 = null;
        String strT6 = null;
        Long lS4 = null;
        String strT7 = null;
        String strT8 = null;
        Integer numR = null;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                byte[] bArrAc = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        kvtVar = (kvt) ksy.O(parcel, i, kvt.CREATOR);
                    } else if (c != 3) {
                        ksy.aa(parcel, i);
                    } else {
                        bArrAc = ksy.ac(parcel, i);
                    }
                }
                ksy.Y(parcel, iK);
                return new kvr(kvtVar, bArrAc);
            case 1:
                int iK2 = ksy.K(parcel);
                ArrayList arrayListV = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        numR = ksy.R(parcel, i2);
                    } else if (c2 != 2) {
                        ksy.aa(parcel, i2);
                    } else {
                        arrayListV = ksy.V(parcel, i2);
                    }
                }
                ksy.Y(parcel, iK2);
                return new lje(numR, arrayListV);
            case 2:
                int iK3 = ksy.K(parcel);
                Bundle bundleM = null;
                Integer numR2 = null;
                Long lS5 = null;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        strT8 = ksy.T(parcel, i3);
                    } else if (c3 == 2) {
                        bundleM = ksy.M(parcel, i3);
                    } else if (c3 == 3) {
                        numR2 = ksy.R(parcel, i3);
                    } else if (c3 != 4) {
                        ksy.aa(parcel, i3);
                    } else {
                        lS5 = ksy.S(parcel, i3);
                    }
                }
                ksy.Y(parcel, iK3);
                return new ljj(strT8, bundleM, numR2, lS5);
            case 3:
                int iK4 = ksy.K(parcel);
                long jL2 = 0;
                int I2 = 0;
                String strT9 = null;
                ljy ljyVar = null;
                Integer numR3 = null;
                Long lS6 = null;
                long jL3 = 0;
                String strT10 = null;
                String strT11 = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            strT9 = ksy.T(parcel, i4);
                            break;
                        case 2:
                            jL2 = ksy.L(parcel, i4);
                            break;
                        case 3:
                            strT10 = ksy.T(parcel, i4);
                            break;
                        case 4:
                            strT11 = ksy.T(parcel, i4);
                            break;
                        case 5:
                            jL3 = ksy.L(parcel, i4);
                            break;
                        case 6:
                            strT7 = ksy.T(parcel, i4);
                            break;
                        case 7:
                            I2 = ksy.I(parcel, i4);
                            break;
                        case '\b':
                            ljyVar = (ljy) ksy.O(parcel, i4, ljy.CREATOR);
                            break;
                        case '\t':
                            numR3 = ksy.R(parcel, i4);
                            break;
                        case '\n':
                            lS6 = ksy.S(parcel, i4);
                            break;
                        default:
                            ksy.aa(parcel, i4);
                            break;
                    }
                }
                ksy.Y(parcel, iK4);
                ljkVar = new ljk(strT9, jL2, strT10, strT11, jL3, strT7, I2, ljyVar, numR3, lS6);
                break;
            case 4:
                int iK5 = ksy.K(parcel);
                String strT12 = null;
                ljl[] ljlVarArr = null;
                Bundle bundleM2 = null;
                String strT13 = null;
                ljw ljwVar = null;
                Integer numR4 = null;
                Long lS7 = null;
                ljd[] ljdVarArr = null;
                String strT14 = null;
                ArrayList arrayListX = null;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            strT12 = ksy.T(parcel, i5);
                            break;
                        case 2:
                            ljlVarArr = (ljl[]) ksy.af(parcel, i5, ljl.CREATOR);
                            break;
                        case 3:
                            bundleM2 = ksy.M(parcel, i5);
                            break;
                        case 4:
                            strT13 = ksy.T(parcel, i5);
                            break;
                        case 5:
                            ljwVar = (ljw) ksy.O(parcel, i5, ljw.CREATOR);
                            break;
                        case 6:
                            numR4 = ksy.R(parcel, i5);
                            break;
                        case 7:
                            lS7 = ksy.S(parcel, i5);
                            break;
                        case '\b':
                            lS4 = ksy.S(parcel, i5);
                            break;
                        case '\t':
                            ljdVarArr = (ljd[]) ksy.af(parcel, i5, ljd.CREATOR);
                            break;
                        case '\n':
                            strT14 = ksy.T(parcel, i5);
                            break;
                        case 11:
                            arrayListX = ksy.X(parcel, i5, ljc.CREATOR);
                            break;
                        default:
                            ksy.aa(parcel, i5);
                            break;
                    }
                }
                ksy.Y(parcel, iK5);
                ljkVar = new ljn(strT12, ljlVarArr, bundleM2, strT13, ljwVar, numR4, lS7, lS4, ljdVarArr, strT14, arrayListX);
                break;
            case 5:
                int iK6 = ksy.K(parcel);
                String strT15 = null;
                String strT16 = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        strT6 = ksy.T(parcel, i6);
                    } else if (c4 == 2) {
                        strT15 = ksy.T(parcel, i6);
                    } else if (c4 == 3) {
                        strT16 = ksy.T(parcel, i6);
                    } else if (c4 != 4) {
                        ksy.aa(parcel, i6);
                    } else {
                        I = ksy.I(parcel, i6);
                    }
                }
                ksy.Y(parcel, iK6);
                return new ljo(strT6, strT15, strT16, I);
            case 6:
                int iK7 = ksy.K(parcel);
                long jL4 = 0;
                String strT17 = null;
                String strT18 = null;
                String strT19 = null;
                String strT20 = null;
                String strT21 = null;
                Bundle bundleM3 = null;
                Integer numR5 = null;
                Long lS8 = null;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            strT17 = ksy.T(parcel, i7);
                            break;
                        case 2:
                            strT18 = ksy.T(parcel, i7);
                            break;
                        case 3:
                            strT19 = ksy.T(parcel, i7);
                            break;
                        case 4:
                            strT20 = ksy.T(parcel, i7);
                            break;
                        case 5:
                            jL4 = ksy.L(parcel, i7);
                            break;
                        case 6:
                            strT21 = ksy.T(parcel, i7);
                            break;
                        case 7:
                            strT5 = ksy.T(parcel, i7);
                            break;
                        case '\b':
                            bundleM3 = ksy.M(parcel, i7);
                            break;
                        case '\t':
                            numR5 = ksy.R(parcel, i7);
                            break;
                        case '\n':
                            lS8 = ksy.S(parcel, i7);
                            break;
                        default:
                            ksy.aa(parcel, i7);
                            break;
                    }
                }
                ksy.Y(parcel, iK7);
                ljkVar = new ljp(strT17, strT18, strT19, strT20, jL4, strT21, strT5, bundleM3, numR5, lS8);
                break;
            case 7:
                return new ljq(parcel.readString(), parcel.readString());
            case 8:
                int iK8 = ksy.K(parcel);
                String strT22 = null;
                String strT23 = null;
                String strT24 = null;
                String strT25 = null;
                MdpUpsellPlan[] mdpUpsellPlanArr = null;
                Bundle bundleM4 = null;
                Integer numR6 = null;
                lkg[] lkgVarArr = null;
                ArrayList arrayListX2 = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            strT22 = ksy.T(parcel, i8);
                            break;
                        case 2:
                            strT23 = ksy.T(parcel, i8);
                            break;
                        case 3:
                            strT24 = ksy.T(parcel, i8);
                            break;
                        case 4:
                            strT25 = ksy.T(parcel, i8);
                            break;
                        case 5:
                            mdpUpsellPlanArr = (MdpUpsellPlan[]) ksy.af(parcel, i8, MdpUpsellPlan.CREATOR);
                            break;
                        case 6:
                            bundleM4 = ksy.M(parcel, i8);
                            break;
                        case 7:
                            numR6 = ksy.R(parcel, i8);
                            break;
                        case '\b':
                            lS3 = ksy.S(parcel, i8);
                            break;
                        case '\t':
                            lkgVarArr = (lkg[]) ksy.af(parcel, i8, lkg.CREATOR);
                            break;
                        case '\n':
                            arrayListX2 = ksy.X(parcel, i8, ljq.CREATOR);
                            break;
                        default:
                            ksy.aa(parcel, i8);
                            break;
                    }
                }
                ksy.Y(parcel, iK8);
                ljkVar = new ljr(strT22, strT23, strT24, strT25, mdpUpsellPlanArr, bundleM4, numR6, lS3, lkgVarArr, arrayListX2);
                break;
            case 9:
                int iK9 = ksy.K(parcel);
                long jL5 = 0;
                int I3 = 0;
                String str = null;
                String strT26 = null;
                String strT27 = null;
                String strT28 = null;
                String strT29 = null;
                String strT30 = null;
                String strT31 = null;
                ArrayList arrayListW = null;
                String strT32 = null;
                ArrayList arrayListU = null;
                ArrayList arrayListX3 = null;
                long jL6 = 0;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    String str2 = strT26;
                    switch ((char) i9) {
                        case 1:
                            strT = ksy.T(parcel, i9);
                            strT26 = str2;
                            break;
                        case 2:
                            strT26 = ksy.T(parcel, i9);
                            strT = str;
                            break;
                        case 3:
                            strT27 = ksy.T(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case 4:
                            jL = ksy.L(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case 5:
                            strT28 = ksy.T(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case 6:
                            strT29 = ksy.T(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case 7:
                            jL6 = ksy.L(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case '\b':
                            jL5 = ksy.L(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case '\t':
                            strT30 = ksy.T(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case '\n':
                            strT31 = ksy.T(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case 11:
                            I3 = ksy.I(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case '\f':
                            arrayListW = ksy.W(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case '\r':
                            strT32 = ksy.T(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case 14:
                            arrayListU = ksy.U(parcel, i9);
                            strT26 = str2;
                            strT = str;
                            break;
                        case 15:
                            arrayListX3 = ksy.X(parcel, i9, lju.CREATOR);
                            strT26 = str2;
                            strT = str;
                            break;
                        default:
                            ksy.aa(parcel, i9);
                            strT = str;
                            strT26 = str2;
                            break;
                    }
                    str = strT;
                }
                ksy.Y(parcel, iK9);
                ljkVar = new MdpUpsellPlan(str, strT26, strT27, jL, strT28, strT29, jL6, jL5, strT30, strT31, I3, arrayListW, strT32, arrayListU, arrayListX3);
                break;
            case 10:
                int iK10 = ksy.K(parcel);
                int I4 = 0;
                String strT33 = null;
                String strT34 = null;
                String strT35 = null;
                String strT36 = null;
                String strT37 = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            strT33 = ksy.T(parcel, i10);
                            break;
                        case 2:
                            I4 = ksy.I(parcel, i10);
                            break;
                        case 3:
                            strT34 = ksy.T(parcel, i10);
                            break;
                        case 4:
                            strT35 = ksy.T(parcel, i10);
                            break;
                        case 5:
                            strT36 = ksy.T(parcel, i10);
                            break;
                        case 6:
                            strT37 = ksy.T(parcel, i10);
                            break;
                        default:
                            ksy.aa(parcel, i10);
                            break;
                    }
                }
                ksy.Y(parcel, iK10);
                ljkVar = new lju(strT33, I4, strT34, strT35, strT36, strT37);
                break;
            case 11:
                int iK11 = ksy.K(parcel);
                Float fQ = null;
                Float fQ2 = null;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        lS2 = ksy.S(parcel, i11);
                    } else if (c5 == 2) {
                        fQ = ksy.Q(parcel, i11);
                    } else if (c5 != 3) {
                        ksy.aa(parcel, i11);
                    } else {
                        fQ2 = ksy.Q(parcel, i11);
                    }
                }
                ksy.Y(parcel, iK11);
                return new ljv(lS2, fQ, fQ2);
            case 12:
                int iK12 = ksy.K(parcel);
                long jL7 = 0;
                int I5 = 0;
                String strT38 = null;
                Long lS9 = null;
                String strT39 = null;
                String strT40 = null;
                Long lS10 = null;
                Long lS11 = null;
                String strT41 = null;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            jL7 = ksy.L(parcel, i12);
                            break;
                        case 2:
                            strT38 = ksy.T(parcel, i12);
                            break;
                        case 3:
                            I5 = ksy.I(parcel, i12);
                            break;
                        case 4:
                            lS9 = ksy.S(parcel, i12);
                            break;
                        case 5:
                            strT39 = ksy.T(parcel, i12);
                            break;
                        case 6:
                            strT40 = ksy.T(parcel, i12);
                            break;
                        case 7:
                            lS = ksy.S(parcel, i12);
                            break;
                        case '\b':
                            lS10 = ksy.S(parcel, i12);
                            break;
                        case '\t':
                            lS11 = ksy.S(parcel, i12);
                            break;
                        case '\n':
                            strT41 = ksy.T(parcel, i12);
                            break;
                        default:
                            ksy.aa(parcel, i12);
                            break;
                    }
                }
                ksy.Y(parcel, iK12);
                ljkVar = new ljw(jL7, strT38, I5, lS9, strT39, strT40, lS, lS10, lS11, strT41);
                break;
            case 13:
                int iK13 = ksy.K(parcel);
                int I6 = 0;
                String strT42 = null;
                String strT43 = null;
                String strT44 = null;
                String strT45 = null;
                String strT46 = null;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            strT42 = ksy.T(parcel, i13);
                            break;
                        case 2:
                            strT43 = ksy.T(parcel, i13);
                            break;
                        case 3:
                            strT44 = ksy.T(parcel, i13);
                            break;
                        case 4:
                            strT45 = ksy.T(parcel, i13);
                            break;
                        case 5:
                            strT46 = ksy.T(parcel, i13);
                            break;
                        case 6:
                            I6 = ksy.I(parcel, i13);
                            break;
                        default:
                            ksy.aa(parcel, i13);
                            break;
                    }
                }
                ksy.Y(parcel, iK13);
                ljkVar = new ljx(strT42, strT43, strT44, strT45, strT46, I6);
                break;
            case 14:
                int iK14 = ksy.K(parcel);
                String strT47 = null;
                ljx[] ljxVarArr = null;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c6 = (char) i14;
                    if (c6 == 1) {
                        strT4 = ksy.T(parcel, i14);
                    } else if (c6 == 2) {
                        strT47 = ksy.T(parcel, i14);
                    } else if (c6 != 3) {
                        ksy.aa(parcel, i14);
                    } else {
                        ljxVarArr = (ljx[]) ksy.af(parcel, i14, ljx.CREATOR);
                    }
                }
                ksy.Y(parcel, iK14);
                return new ljy(strT4, strT47, ljxVarArr);
            case 15:
                int iK15 = ksy.K(parcel);
                lkc lkcVar = null;
                lkc[] lkcVarArr = null;
                lkc[] lkcVarArr2 = null;
                String strT48 = null;
                String strT49 = null;
                String strT50 = null;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            lkcVar = (lkc) ksy.O(parcel, i15, lkc.CREATOR);
                            break;
                        case 2:
                            lkcVarArr = (lkc[]) ksy.af(parcel, i15, lkc.CREATOR);
                            break;
                        case 3:
                            lkcVarArr2 = (lkc[]) ksy.af(parcel, i15, lkc.CREATOR);
                            break;
                        case 4:
                            strT48 = ksy.T(parcel, i15);
                            break;
                        case 5:
                            strT49 = ksy.T(parcel, i15);
                            break;
                        case 6:
                            strT50 = ksy.T(parcel, i15);
                            break;
                        case 7:
                            I = ksy.I(parcel, i15);
                            break;
                        case '\b':
                            strT3 = ksy.T(parcel, i15);
                            break;
                        default:
                            ksy.aa(parcel, i15);
                            break;
                    }
                }
                ksy.Y(parcel, iK15);
                ljkVar = new ljz(lkcVar, lkcVarArr, lkcVarArr2, strT48, strT49, strT50, I, strT3);
                break;
            case 16:
                int iK16 = ksy.K(parcel);
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        ksy.aa(parcel, i16);
                    } else {
                        I = ksy.I(parcel, i16);
                    }
                }
                ksy.Y(parcel, iK16);
                return new lka(I);
            case 17:
                int iK17 = ksy.K(parcel);
                Long lS12 = 0L;
                lka lkaVar = null;
                ljz ljzVar = null;
                Integer numR7 = null;
                Long lS13 = null;
                Integer numR8 = null;
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            lkaVar = (lka) ksy.O(parcel, i17, lka.CREATOR);
                            break;
                        case 2:
                            ljzVar = (ljz) ksy.O(parcel, i17, ljz.CREATOR);
                            break;
                        case 3:
                            lS12 = ksy.S(parcel, i17);
                            break;
                        case 4:
                            numR7 = ksy.R(parcel, i17);
                            break;
                        case 5:
                            lS13 = ksy.S(parcel, i17);
                            break;
                        case 6:
                            numR8 = ksy.R(parcel, i17);
                            break;
                        default:
                            ksy.aa(parcel, i17);
                            break;
                    }
                }
                ksy.Y(parcel, iK17);
                ljkVar = new lkb(lkaVar, ljzVar, lS12, numR7, lS13, numR8);
                break;
            case 18:
                int iK18 = ksy.K(parcel);
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        ksy.aa(parcel, i18);
                    } else {
                        strT2 = ksy.T(parcel, i18);
                    }
                }
                ksy.Y(parcel, iK18);
                return new lkc(strT2);
            case 19:
                int iK19 = ksy.K(parcel);
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        ksy.aa(parcel, i19);
                    } else {
                        I = ksy.I(parcel, i19);
                    }
                }
                ksy.Y(parcel, iK19);
                return new lkg(I);
            default:
                int iK20 = ksy.K(parcel);
                while (parcel.dataPosition() < iK20) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        ksy.aa(parcel, i20);
                    } else {
                        uri = (Uri) ksy.O(parcel, i20, Uri.CREATOR);
                    }
                }
                ksy.Y(parcel, iK20);
                return new lkh(uri);
        }
        return ljkVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new kvr[i];
            case 1:
                return new lje[i];
            case 2:
                return new ljj[i];
            case 3:
                return new ljk[i];
            case 4:
                return new ljn[i];
            case 5:
                return new ljo[i];
            case 6:
                return new ljp[i];
            case 7:
                return new ljq[i];
            case 8:
                return new ljr[i];
            case 9:
                return new MdpUpsellPlan[i];
            case 10:
                return new lju[i];
            case 11:
                return new ljv[i];
            case 12:
                return new ljw[i];
            case 13:
                return new ljx[i];
            case 14:
                return new ljy[i];
            case 15:
                return new ljz[i];
            case 16:
                return new lka[i];
            case 17:
                return new lkb[i];
            case 18:
                return new lkc[i];
            case 19:
                return new lkg[i];
            default:
                return new lkh[i];
        }
    }
}

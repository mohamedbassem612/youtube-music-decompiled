package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbc implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public kbc(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object khdVar;
        Object kkoVar;
        double dG = 0.0d;
        boolean zAb = true;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        Intent intent = null;
        ArrayList arrayListX = null;
        ArrayList arrayListX2 = null;
        kae kaeVar = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        int I = 0;
        int I2 = 0;
        boolean zAb2 = false;
        boolean zAb3 = false;
        boolean zAb4 = false;
        int I3 = 0;
        int I4 = 0;
        boolean zAb5 = false;
        int I5 = 0;
        int I6 = 0;
        int I7 = 0;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                int I8 = 0;
                int I9 = 0;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        I = ksy.I(parcel, i);
                    } else if (c == 3) {
                        I8 = ksy.I(parcel, i);
                    } else if (c != 4) {
                        ksy.aa(parcel, i);
                    } else {
                        I9 = ksy.I(parcel, i);
                    }
                }
                ksy.Y(parcel, iK);
                return new kbb(I, I8, I9);
            case 1:
                int iK2 = ksy.K(parcel);
                String strT8 = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 2) {
                        strT = ksy.T(parcel, i2);
                    } else if (c2 != 3) {
                        ksy.aa(parcel, i2);
                    } else {
                        strT8 = ksy.T(parcel, i2);
                    }
                }
                ksy.Y(parcel, iK2);
                return new kba(strT, strT8);
            case 2:
                int iK3 = ksy.K(parcel);
                int I10 = 0;
                int I11 = 0;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 2) {
                        I7 = ksy.I(parcel, i3);
                    } else if (c3 == 3) {
                        I10 = ksy.I(parcel, i3);
                    } else if (c3 != 4) {
                        ksy.aa(parcel, i3);
                    } else {
                        I11 = ksy.I(parcel, i3);
                    }
                }
                ksy.Y(parcel, iK3);
                return new kem(I7, I10, I11);
            case 3:
                int iK4 = ksy.K(parcel);
                String strT9 = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 2) {
                        strT7 = ksy.T(parcel, i4);
                    } else if (c4 == 3) {
                        I6 = ksy.I(parcel, i4);
                    } else if (c4 != 4) {
                        ksy.aa(parcel, i4);
                    } else {
                        strT9 = ksy.T(parcel, i4);
                    }
                }
                ksy.Y(parcel, iK4);
                return new kes(strT7, I6, strT9);
            case 4:
                int iK5 = ksy.K(parcel);
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        ksy.aa(parcel, i5);
                    } else {
                        strT6 = ksy.T(parcel, i5);
                    }
                }
                ksy.Y(parcel, iK5);
                return new kgq(strT6);
            case 5:
                int iK6 = ksy.K(parcel);
                String strT10 = null;
                String strT11 = null;
                String strT12 = null;
                int I12 = 0;
                boolean zAb6 = false;
                boolean zAb7 = false;
                boolean zAb8 = false;
                boolean zAb9 = false;
                boolean zAb10 = false;
                String strT13 = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            I12 = ksy.I(parcel, i6);
                            break;
                        case 3:
                            zAb6 = ksy.ab(parcel, i6);
                            break;
                        case 4:
                            zAb7 = ksy.ab(parcel, i6);
                            break;
                        case 5:
                            strT10 = ksy.T(parcel, i6);
                            break;
                        case 6:
                            strT11 = ksy.T(parcel, i6);
                            break;
                        case 7:
                            strT12 = ksy.T(parcel, i6);
                            break;
                        case '\b':
                            strT5 = ksy.T(parcel, i6);
                            break;
                        case '\t':
                            strT13 = ksy.T(parcel, i6);
                            break;
                        case '\n':
                            zAb8 = ksy.ab(parcel, i6);
                            break;
                        case 11:
                            zAb9 = ksy.ab(parcel, i6);
                            break;
                        case '\f':
                            zAb10 = ksy.ab(parcel, i6);
                            break;
                        default:
                            ksy.aa(parcel, i6);
                            break;
                    }
                }
                ksy.Y(parcel, iK6);
                khdVar = new khd(I12, zAb6, zAb7, strT10, strT11, strT12, strT5, strT13, zAb8, zAb9, zAb10);
                return khdVar;
            case 6:
                int iK7 = ksy.K(parcel);
                jzt jztVar = null;
                boolean zAb11 = false;
                int I13 = 0;
                int I14 = 0;
                double dG2 = 0.0d;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 2:
                            dG = ksy.G(parcel, i7);
                            break;
                        case 3:
                            zAb11 = ksy.ab(parcel, i7);
                            break;
                        case 4:
                            I13 = ksy.I(parcel, i7);
                            break;
                        case 5:
                            jztVar = (jzt) ksy.O(parcel, i7, jzt.CREATOR);
                            break;
                        case 6:
                            I14 = ksy.I(parcel, i7);
                            break;
                        case 7:
                            kaeVar = (kae) ksy.O(parcel, i7, kae.CREATOR);
                            break;
                        case '\b':
                            dG2 = ksy.G(parcel, i7);
                            break;
                        default:
                            ksy.aa(parcel, i7);
                            break;
                    }
                }
                ksy.Y(parcel, iK7);
                khdVar = new khf(dG, zAb11, I13, jztVar, I14, kaeVar, dG2);
                return khdVar;
            case 7:
                int iK8 = ksy.K(parcel);
                kjg kjgVar = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        arrayListX2 = ksy.X(parcel, i8, kiw.CREATOR);
                    } else if (c5 != 2) {
                        ksy.aa(parcel, i8);
                    } else {
                        kjgVar = (kjg) ksy.O(parcel, i8, kjg.CREATOR);
                    }
                }
                ksy.Y(parcel, iK8);
                return new kie(arrayListX2, kjgVar);
            case 8:
                int iK9 = ksy.K(parcel);
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        ksy.aa(parcel, i9);
                    } else {
                        arrayListX = ksy.X(parcel, i9, kjt.CREATOR);
                    }
                }
                ksy.Y(parcel, iK9);
                return new kjg(arrayListX);
            case 9:
                int iK10 = ksy.K(parcel);
                int I15 = 0;
                int I16 = 0;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        I5 = ksy.I(parcel, i10);
                    } else if (c6 == 2) {
                        I15 = ksy.I(parcel, i10);
                    } else if (c6 != 3) {
                        ksy.aa(parcel, i10);
                    } else {
                        I16 = ksy.I(parcel, i10);
                    }
                }
                ksy.Y(parcel, iK10);
                return new kjp(I5, I15, I16);
            case 10:
                int iK11 = ksy.K(parcel);
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        ksy.aa(parcel, i11);
                    } else {
                        zAb5 = ksy.ab(parcel, i11);
                    }
                }
                ksy.Y(parcel, iK11);
                return new kjv(zAb5);
            case 11:
                int iK12 = ksy.K(parcel);
                String strT14 = null;
                String strT15 = null;
                String strT16 = null;
                Integer numR = null;
                int I17 = 0;
                int I18 = 0;
                boolean zAb12 = false;
                boolean zAb13 = false;
                int I19 = 0;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            strT14 = ksy.T(parcel, i12);
                            break;
                        case 3:
                            I17 = ksy.I(parcel, i12);
                            break;
                        case 4:
                            I18 = ksy.I(parcel, i12);
                            break;
                        case 5:
                            strT15 = ksy.T(parcel, i12);
                            break;
                        case 6:
                        default:
                            ksy.aa(parcel, i12);
                            break;
                        case 7:
                            zAb = ksy.ab(parcel, i12);
                            break;
                        case '\b':
                            strT16 = ksy.T(parcel, i12);
                            break;
                        case '\t':
                            zAb12 = ksy.ab(parcel, i12);
                            break;
                        case '\n':
                            I4 = ksy.I(parcel, i12);
                            break;
                        case 11:
                            numR = ksy.R(parcel, i12);
                            break;
                        case '\f':
                            zAb13 = ksy.ab(parcel, i12);
                            break;
                        case '\r':
                            I19 = ksy.I(parcel, i12);
                            break;
                    }
                }
                ksy.Y(parcel, iK12);
                khdVar = new kjw(strT14, I17, I18, strT15, zAb, strT16, zAb12, I4, numR, zAb13, I19);
                return khdVar;
            case 12:
                int iK13 = ksy.K(parcel);
                double dG3 = 0.0d;
                String strT17 = null;
                int I20 = 0;
                int I21 = 0;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        I3 = ksy.I(parcel, i13);
                    } else if (c7 == 2) {
                        dG3 = ksy.G(parcel, i13);
                    } else if (c7 == 3) {
                        I20 = ksy.I(parcel, i13);
                    } else if (c7 == 4) {
                        I21 = ksy.I(parcel, i13);
                    } else if (c7 != 5) {
                        ksy.aa(parcel, i13);
                    } else {
                        strT17 = ksy.T(parcel, i13);
                    }
                }
                ksy.Y(parcel, iK13);
                kkoVar = new kko(I3, dG3, I20, I21, strT17);
                return kkoVar;
            case 13:
                int iK14 = ksy.K(parcel);
                long jL = 0;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        zAb4 = ksy.ab(parcel, i14);
                    } else if (c8 != 2) {
                        ksy.aa(parcel, i14);
                    } else {
                        jL = ksy.L(parcel, i14);
                    }
                }
                ksy.Y(parcel, iK14);
                return new kkp(zAb4, jL);
            case 14:
                int iK15 = ksy.K(parcel);
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        ksy.aa(parcel, i15);
                    } else {
                        intent = (Intent) ksy.O(parcel, i15, Intent.CREATOR);
                    }
                }
                ksy.Y(parcel, iK15);
                return new kkr(intent);
            case 15:
                return new kku(parcel.readStrongBinder());
            case 16:
                int iK16 = ksy.K(parcel);
                String strT18 = null;
                String strT19 = null;
                String strT20 = null;
                String strT21 = null;
                String strT22 = null;
                int I22 = 0;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strT18 = ksy.T(parcel, i16);
                            break;
                        case 2:
                            strT19 = ksy.T(parcel, i16);
                            break;
                        case 3:
                            strT20 = ksy.T(parcel, i16);
                            break;
                        case 4:
                            strT21 = ksy.T(parcel, i16);
                            break;
                        case 5:
                            strT22 = ksy.T(parcel, i16);
                            break;
                        case 6:
                            I22 = ksy.I(parcel, i16);
                            break;
                        case 7:
                            strT4 = ksy.T(parcel, i16);
                            break;
                        default:
                            ksy.aa(parcel, i16);
                            break;
                    }
                }
                ksy.Y(parcel, iK16);
                khdVar = new kle(strT18, strT19, strT20, strT21, strT22, I22, strT4);
                return khdVar;
            case 17:
                int iK17 = ksy.K(parcel);
                String strT23 = null;
                IBinder iBinderN = null;
                boolean zAb14 = false;
                boolean zAb15 = false;
                boolean zAb16 = false;
                boolean zAb17 = false;
                boolean zAb18 = false;
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            strT23 = ksy.T(parcel, i17);
                            break;
                        case 2:
                            zAb14 = ksy.ab(parcel, i17);
                            break;
                        case 3:
                            zAb15 = ksy.ab(parcel, i17);
                            break;
                        case 4:
                            iBinderN = ksy.N(parcel, i17);
                            break;
                        case 5:
                            zAb16 = ksy.ab(parcel, i17);
                            break;
                        case 6:
                            zAb17 = ksy.ab(parcel, i17);
                            break;
                        case 7:
                        default:
                            ksy.aa(parcel, i17);
                            break;
                        case '\b':
                            zAb18 = ksy.ab(parcel, i17);
                            break;
                    }
                }
                ksy.Y(parcel, iK17);
                khdVar = new kmf(strT23, zAb14, zAb15, iBinderN, zAb16, zAb17, zAb18);
                return khdVar;
            case 18:
                int iK18 = ksy.K(parcel);
                long jL2 = -1;
                String strT24 = null;
                int I23 = 0;
                int I24 = 0;
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    char c9 = (char) i18;
                    if (c9 == 1) {
                        zAb3 = ksy.ab(parcel, i18);
                    } else if (c9 == 2) {
                        strT24 = ksy.T(parcel, i18);
                    } else if (c9 == 3) {
                        I23 = ksy.I(parcel, i18);
                    } else if (c9 == 4) {
                        I24 = ksy.I(parcel, i18);
                    } else if (c9 != 5) {
                        ksy.aa(parcel, i18);
                    } else {
                        jL2 = ksy.L(parcel, i18);
                    }
                }
                ksy.Y(parcel, iK18);
                kkoVar = new kmg(zAb3, strT24, I23, I24, jL2);
                return kkoVar;
            case 19:
                int iK19 = ksy.K(parcel);
                IBinder iBinderN2 = null;
                boolean zAb19 = false;
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    char c10 = (char) i19;
                    if (c10 == 1) {
                        strT3 = ksy.T(parcel, i19);
                    } else if (c10 == 2) {
                        iBinderN2 = ksy.N(parcel, i19);
                    } else if (c10 == 3) {
                        zAb2 = ksy.ab(parcel, i19);
                    } else if (c10 != 4) {
                        ksy.aa(parcel, i19);
                    } else {
                        zAb19 = ksy.ab(parcel, i19);
                    }
                }
                ksy.Y(parcel, iK19);
                return new kmh(strT3, iBinderN2, zAb2, zAb19);
            default:
                int iK20 = ksy.K(parcel);
                while (parcel.dataPosition() < iK20) {
                    int i20 = parcel.readInt();
                    char c11 = (char) i20;
                    if (c11 == 1) {
                        I2 = ksy.I(parcel, i20);
                    } else if (c11 != 2) {
                        ksy.aa(parcel, i20);
                    } else {
                        strT2 = ksy.T(parcel, i20);
                    }
                }
                ksy.Y(parcel, iK20);
                return new Scope(I2, strT2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new kbb[i];
            case 1:
                return new kba[i];
            case 2:
                return new kem[i];
            case 3:
                return new kes[i];
            case 4:
                return new kgq[i];
            case 5:
                return new khd[i];
            case 6:
                return new khf[i];
            case 7:
                return new kie[i];
            case 8:
                return new kjg[i];
            case 9:
                return new kjp[i];
            case 10:
                return new kjv[i];
            case 11:
                return new kjw[i];
            case 12:
                return new kko[i];
            case 13:
                return new kkp[i];
            case 14:
                return new kkr[i];
            case 15:
                return new kku[i];
            case 16:
                return new kle[i];
            case 17:
                return new kmf[i];
            case 18:
                return new kmg[i];
            case 19:
                return new kmh[i];
            default:
                return new Scope[i];
        }
    }
}

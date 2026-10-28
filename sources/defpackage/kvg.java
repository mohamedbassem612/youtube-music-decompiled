package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvg implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public kvg(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x012f. Please report as an issue. */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object kvfVar;
        Object nD4CSettings;
        String strT;
        long jL = 0;
        boolean zAb = false;
        int I = 0;
        int I2 = 0;
        String strT2 = null;
        Integer numR = null;
        Long lS = null;
        ArrayList arrayListX = null;
        ArrayList arrayListU = null;
        Bundle bundleM = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                String strT9 = null;
                String strT10 = null;
                String strT11 = null;
                String strT12 = null;
                String strT13 = null;
                Bundle bundleM2 = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            strT9 = ksy.T(parcel, i);
                            break;
                        case 3:
                            strT10 = ksy.T(parcel, i);
                            break;
                        case 4:
                            strT11 = ksy.T(parcel, i);
                            break;
                        case 5:
                            strT12 = ksy.T(parcel, i);
                            break;
                        case 6:
                            strT13 = ksy.T(parcel, i);
                            break;
                        case 7:
                            bundleM2 = ksy.M(parcel, i);
                            break;
                        default:
                            ksy.aa(parcel, i);
                            break;
                    }
                }
                ksy.Y(parcel, iK);
                kvfVar = new kvf(strT9, strT10, strT11, strT12, strT13, bundleM2);
                return kvfVar;
            case 1:
                int iK2 = ksy.K(parcel);
                int I3 = 0;
                int I4 = 0;
                GoogleHelp googleHelp = null;
                String strT14 = null;
                String strT15 = null;
                String strT16 = null;
                String strT17 = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            googleHelp = (GoogleHelp) ksy.O(parcel, i2, GoogleHelp.CREATOR);
                            break;
                        case 2:
                            strT14 = ksy.T(parcel, i2);
                            break;
                        case 3:
                            strT15 = ksy.T(parcel, i2);
                            break;
                        case 4:
                            I3 = ksy.I(parcel, i2);
                            break;
                        case 5:
                            strT16 = ksy.T(parcel, i2);
                            break;
                        case 6:
                            I4 = ksy.I(parcel, i2);
                            break;
                        case 7:
                            strT17 = ksy.T(parcel, i2);
                            break;
                        default:
                            ksy.aa(parcel, i2);
                            break;
                    }
                }
                ksy.Y(parcel, iK2);
                kvfVar = new kxe(googleHelp, strT14, strT15, I3, strT16, I4, strT17);
                return kvfVar;
            case 2:
                int iK3 = ksy.K(parcel);
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 2) {
                        zAb = ksy.ab(parcel, i3);
                    } else if (c != 3) {
                        ksy.aa(parcel, i3);
                    } else {
                        strT2 = ksy.T(parcel, i3);
                    }
                }
                ksy.Y(parcel, iK3);
                nD4CSettings = new ND4CSettings(zAb, strT2);
                return nD4CSettings;
            case 3:
                int iK4 = ksy.K(parcel);
                String strT18 = null;
                String strT19 = null;
                String strT20 = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 2) {
                        strT8 = ksy.T(parcel, i4);
                    } else if (c2 == 3) {
                        strT18 = ksy.T(parcel, i4);
                    } else if (c2 == 4) {
                        strT20 = ksy.T(parcel, i4);
                    } else if (c2 != 5) {
                        ksy.aa(parcel, i4);
                    } else {
                        strT19 = ksy.T(parcel, i4);
                    }
                }
                ksy.Y(parcel, iK4);
                return new kxf(strT8, strT18, strT19, strT20);
            case 4:
                int iK5 = ksy.K(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 2) {
                        I2 = ksy.I(parcel, i5);
                    } else if (c3 == 3) {
                        strT7 = ksy.T(parcel, i5);
                    } else if (c3 != 4) {
                        ksy.aa(parcel, i5);
                    } else {
                        intent = (Intent) ksy.O(parcel, i5, Intent.CREATOR);
                    }
                }
                ksy.Y(parcel, iK5);
                nD4CSettings = new kxw(I2, strT7, intent);
                return nD4CSettings;
            case 5:
                int iK6 = ksy.K(parcel);
                String strT21 = null;
                String strT22 = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 2) {
                        strT6 = ksy.T(parcel, i6);
                    } else if (c4 == 3) {
                        strT21 = ksy.T(parcel, i6);
                    } else if (c4 != 4) {
                        ksy.aa(parcel, i6);
                    } else {
                        strT22 = ksy.T(parcel, i6);
                    }
                }
                ksy.Y(parcel, iK6);
                return new TogglingData(strT6, strT21, strT22);
            case 6:
                int iK7 = ksy.K(parcel);
                String strT23 = "";
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        strT5 = ksy.T(parcel, i7);
                    } else if (c5 == 2) {
                        jL = ksy.L(parcel, i7);
                    } else if (c5 != 3) {
                        ksy.aa(parcel, i7);
                    } else {
                        strT23 = ksy.T(parcel, i7);
                    }
                }
                ksy.Y(parcel, iK7);
                return new TrailsInteraction(strT5, jL, strT23);
            case 7:
                int iK8 = ksy.K(parcel);
                boolean zAb2 = false;
                String strT24 = null;
                String strT25 = null;
                String strT26 = null;
                String strT27 = null;
                String strT28 = null;
                String strT29 = null;
                String strT30 = null;
                String strT31 = null;
                String strT32 = null;
                String strT33 = null;
                String strT34 = null;
                String strT35 = null;
                String strT36 = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    String str = strT25;
                    switch ((char) i8) {
                        case 2:
                            strT24 = ksy.T(parcel, i8);
                            break;
                        case 3:
                            strT25 = ksy.T(parcel, i8);
                            continue;
                        case 4:
                            strT26 = ksy.T(parcel, i8);
                            break;
                        case 5:
                            strT27 = ksy.T(parcel, i8);
                            break;
                        case 6:
                            strT28 = ksy.T(parcel, i8);
                            break;
                        case 7:
                            strT29 = ksy.T(parcel, i8);
                            break;
                        case '\b':
                            strT30 = ksy.T(parcel, i8);
                            break;
                        case '\t':
                            strT31 = ksy.T(parcel, i8);
                            break;
                        case '\n':
                            strT32 = ksy.T(parcel, i8);
                            break;
                        case 11:
                            strT4 = ksy.T(parcel, i8);
                            break;
                        case '\f':
                            strT33 = ksy.T(parcel, i8);
                            break;
                        case '\r':
                            strT34 = ksy.T(parcel, i8);
                            break;
                        case 14:
                            zAb2 = ksy.ab(parcel, i8);
                            break;
                        case 15:
                            strT35 = ksy.T(parcel, i8);
                            break;
                        case 16:
                            strT36 = ksy.T(parcel, i8);
                            break;
                        default:
                            ksy.aa(parcel, i8);
                            break;
                    }
                    strT25 = str;
                }
                ksy.Y(parcel, iK8);
                kvfVar = new UserAddress(strT24, strT25, strT26, strT27, strT28, strT29, strT30, strT31, strT32, strT4, strT33, strT34, zAb2, strT35, strT36);
                return kvfVar;
            case 8:
                int iK9 = ksy.K(parcel);
                String strT37 = null;
                String strT38 = null;
                ArrayList arrayListX2 = null;
                kyf kyfVar = null;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        I = ksy.I(parcel, i9);
                    } else if (c6 == 3) {
                        strT3 = ksy.T(parcel, i9);
                    } else if (c6 == 4) {
                        strT37 = ksy.T(parcel, i9);
                    } else if (c6 == 6) {
                        strT38 = ksy.T(parcel, i9);
                    } else if (c6 == 7) {
                        kyfVar = (kyf) ksy.O(parcel, i9, kyf.CREATOR);
                    } else if (c6 != '\b') {
                        ksy.aa(parcel, i9);
                    } else {
                        arrayListX2 = ksy.X(parcel, i9, klq.CREATOR);
                    }
                }
                ksy.Y(parcel, iK9);
                strT3.getClass();
                return new kyf(I, strT3, strT37, strT38, arrayListX2, kyfVar);
            case 9:
                int iK10 = ksy.K(parcel);
                int I5 = -1;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        ksy.aa(parcel, i10);
                    } else {
                        I5 = ksy.I(parcel, i10);
                    }
                }
                ksy.Y(parcel, iK10);
                return new kyt(I5);
            case 10:
                int iK11 = ksy.K(parcel);
                int I6 = 0;
                boolean zAb3 = false;
                kyf kyfVar2 = null;
                long jL2 = Long.MAX_VALUE;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        jL2 = ksy.L(parcel, i11);
                    } else if (c7 == 2) {
                        I6 = ksy.I(parcel, i11);
                    } else if (c7 == 3) {
                        zAb3 = ksy.ab(parcel, i11);
                    } else if (c7 != 5) {
                        ksy.aa(parcel, i11);
                    } else {
                        kyfVar2 = (kyf) ksy.O(parcel, i11, kyf.CREATOR);
                    }
                }
                ksy.Y(parcel, iK11);
                return new kyw(jL2, I6, zAb3, kyfVar2);
            case 11:
                int iK12 = ksy.K(parcel);
                IBinder iBinderN = null;
                IBinder iBinderN2 = null;
                PendingIntent pendingIntent = null;
                String strT39 = null;
                int I7 = 0;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        I7 = ksy.I(parcel, i12);
                    } else if (c8 == 2) {
                        iBinderN = ksy.N(parcel, i12);
                    } else if (c8 == 3) {
                        iBinderN2 = ksy.N(parcel, i12);
                    } else if (c8 == 4) {
                        pendingIntent = (PendingIntent) ksy.O(parcel, i12, PendingIntent.CREATOR);
                    } else if (c8 != 6) {
                        ksy.aa(parcel, i12);
                    } else {
                        strT39 = ksy.T(parcel, i12);
                    }
                }
                ksy.Y(parcel, iK12);
                return new kzc(I7, iBinderN, iBinderN2, pendingIntent, strT39);
            case 12:
                int iK13 = ksy.K(parcel);
                double dG = 0.0d;
                double dG2 = 0.0d;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 2) {
                        dG = ksy.G(parcel, i13);
                    } else if (c9 != 3) {
                        ksy.aa(parcel, i13);
                    } else {
                        dG2 = ksy.G(parcel, i13);
                    }
                }
                ksy.Y(parcel, iK13);
                return new LatLng(dG, dG2);
            case 13:
                int iK14 = ksy.K(parcel);
                long jL3 = 0;
                int I8 = 0;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        jL3 = ksy.L(parcel, i14);
                    } else if (c10 == 2) {
                        I8 = ksy.I(parcel, i14);
                    } else if (c10 != 3) {
                        ksy.aa(parcel, i14);
                    } else {
                        jL = ksy.L(parcel, i14);
                    }
                }
                ksy.Y(parcel, iK14);
                kvfVar = new lbp(jL3, I8, jL);
                return kvfVar;
            case 14:
                int iK15 = ksy.K(parcel);
                long jL4 = 0;
                boolean zAb4 = false;
                String str2 = null;
                String strT40 = null;
                lfy lfyVar = null;
                String strT41 = null;
                lcd lcdVar = null;
                lcd lcdVar2 = null;
                lcd lcdVar3 = null;
                long jL5 = 0;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    String str3 = strT40;
                    switch ((char) i15) {
                        case 2:
                            strT = ksy.T(parcel, i15);
                            strT40 = str3;
                            break;
                        case 3:
                            strT40 = ksy.T(parcel, i15);
                            strT = str2;
                            break;
                        case 4:
                            lfyVar = (lfy) ksy.O(parcel, i15, lfy.CREATOR);
                            strT40 = str3;
                            strT = str2;
                            break;
                        case 5:
                            jL = ksy.L(parcel, i15);
                            strT40 = str3;
                            strT = str2;
                            break;
                        case 6:
                            zAb4 = ksy.ab(parcel, i15);
                            strT40 = str3;
                            strT = str2;
                            break;
                        case 7:
                            strT41 = ksy.T(parcel, i15);
                            strT40 = str3;
                            strT = str2;
                            break;
                        case '\b':
                            lcdVar = (lcd) ksy.O(parcel, i15, lcd.CREATOR);
                            strT40 = str3;
                            strT = str2;
                            break;
                        case '\t':
                            jL5 = ksy.L(parcel, i15);
                            strT40 = str3;
                            strT = str2;
                            break;
                        case '\n':
                            lcdVar2 = (lcd) ksy.O(parcel, i15, lcd.CREATOR);
                            strT40 = str3;
                            strT = str2;
                            break;
                        case 11:
                            jL4 = ksy.L(parcel, i15);
                            strT40 = str3;
                            strT = str2;
                            break;
                        case '\f':
                            lcdVar3 = (lcd) ksy.O(parcel, i15, lcd.CREATOR);
                            strT40 = str3;
                            strT = str2;
                            break;
                        default:
                            ksy.aa(parcel, i15);
                            strT = str2;
                            strT40 = str3;
                            break;
                    }
                    str2 = strT;
                }
                ksy.Y(parcel, iK15);
                kvfVar = new lbq(str2, strT40, lfyVar, jL, zAb4, strT41, lcdVar, jL5, lcdVar2, jL4, lcdVar3);
                return kvfVar;
            case 15:
                int iK16 = ksy.K(parcel);
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        ksy.aa(parcel, i16);
                    } else {
                        bundleM = ksy.M(parcel, i16);
                    }
                }
                ksy.Y(parcel, iK16);
                return new lbu(bundleM);
            case 16:
                int iK17 = ksy.K(parcel);
                long jL6 = 0;
                long jL7 = 0;
                int I9 = 0;
                byte[] bArrAc = null;
                String strT42 = null;
                Bundle bundleM3 = null;
                String strT43 = null;
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            jL6 = ksy.L(parcel, i17);
                            break;
                        case 2:
                            bArrAc = ksy.ac(parcel, i17);
                            break;
                        case 3:
                            strT42 = ksy.T(parcel, i17);
                            break;
                        case 4:
                            bundleM3 = ksy.M(parcel, i17);
                            break;
                        case 5:
                            I9 = ksy.I(parcel, i17);
                            break;
                        case 6:
                            jL7 = ksy.L(parcel, i17);
                            break;
                        case 7:
                            strT43 = ksy.T(parcel, i17);
                            break;
                        default:
                            ksy.aa(parcel, i17);
                            break;
                    }
                }
                ksy.Y(parcel, iK17);
                kvfVar = new lfl(jL6, bArrAc, strT42, bundleM3, I9, jL7, strT43);
                return kvfVar;
            case 17:
                int iK18 = ksy.K(parcel);
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        ksy.aa(parcel, i18);
                    } else {
                        arrayListU = ksy.U(parcel, i18);
                    }
                }
                ksy.Y(parcel, iK18);
                return new lfm(arrayListU);
            case 18:
                int iK19 = ksy.K(parcel);
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        ksy.aa(parcel, i19);
                    } else {
                        arrayListX = ksy.X(parcel, i19, lfl.CREATOR);
                    }
                }
                ksy.Y(parcel, iK19);
                return new lfn(arrayListX);
            case 19:
                int iK20 = ksy.K(parcel);
                String strT44 = null;
                String strT45 = null;
                String strT46 = null;
                String strT47 = null;
                while (parcel.dataPosition() < iK20) {
                    int i20 = parcel.readInt();
                    char c11 = (char) i20;
                    if (c11 == 1) {
                        lS = ksy.S(parcel, i20);
                    } else if (c11 == 2) {
                        strT44 = ksy.T(parcel, i20);
                    } else if (c11 == 3) {
                        strT45 = ksy.T(parcel, i20);
                    } else if (c11 == 4) {
                        strT46 = ksy.T(parcel, i20);
                    } else if (c11 != 5) {
                        ksy.aa(parcel, i20);
                    } else {
                        strT47 = ksy.T(parcel, i20);
                    }
                }
                ksy.Y(parcel, iK20);
                return new ljc(lS, strT44, strT45, strT46, strT47);
            default:
                int iK21 = ksy.K(parcel);
                Integer numR2 = null;
                while (parcel.dataPosition() < iK21) {
                    int i21 = parcel.readInt();
                    char c12 = (char) i21;
                    if (c12 == 1) {
                        numR = ksy.R(parcel, i21);
                    } else if (c12 != 2) {
                        ksy.aa(parcel, i21);
                    } else {
                        numR2 = ksy.R(parcel, i21);
                    }
                }
                ksy.Y(parcel, iK21);
                return new ljd(numR, numR2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new kvf[i];
            case 1:
                return new kxe[i];
            case 2:
                return new ND4CSettings[i];
            case 3:
                return new kxf[i];
            case 4:
                return new kxw[i];
            case 5:
                return new TogglingData[i];
            case 6:
                return new TrailsInteraction[i];
            case 7:
                return new UserAddress[i];
            case 8:
                return new kyf[i];
            case 9:
                return new kyt[i];
            case 10:
                return new kyw[i];
            case 11:
                return new kzc[i];
            case 12:
                return new LatLng[i];
            case 13:
                return new lbp[i];
            case 14:
                return new lbq[i];
            case 15:
                return new lbu[i];
            case 16:
                return new lfl[i];
            case 17:
                return new lfm[i];
            case 18:
                return new lfn[i];
            case 19:
                return new ljc[i];
            default:
                return new ljd[i];
        }
    }
}

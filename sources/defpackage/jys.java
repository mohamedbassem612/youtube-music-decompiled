package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jys implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public jys(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:224:0x0428. Please report as an issue. */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object jziVar;
        String strT;
        float fH = 0.0f;
        int I = 0;
        Long lS = null;
        String strT2 = null;
        ArrayList arrayListX = null;
        ArrayList arrayListX2 = null;
        kad kadVar = null;
        String strT3 = null;
        String strT4 = null;
        PendingIntent pendingIntent = null;
        String strT5 = null;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                ArrayList arrayListW = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        lS = ksy.S(parcel, i);
                    } else if (c != 2) {
                        ksy.aa(parcel, i);
                    } else {
                        arrayListW = ksy.W(parcel, i);
                    }
                }
                ksy.Y(parcel, iK);
                return new jyr(lS, arrayListW);
            case 1:
                int iK2 = ksy.K(parcel);
                String strT6 = null;
                String strT7 = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        strT5 = ksy.T(parcel, i2);
                    } else if (c2 == 2) {
                        strT6 = ksy.T(parcel, i2);
                    } else if (c2 != 3) {
                        ksy.aa(parcel, i2);
                    } else {
                        strT7 = ksy.T(parcel, i2);
                    }
                }
                ksy.Y(parcel, iK2);
                return new jyp(strT5, strT6, strT7);
            case 2:
                int iK3 = ksy.K(parcel);
                int I2 = 0;
                int I3 = 0;
                Bundle bundleM = null;
                byte[] bArrAc = null;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        I = ksy.I(parcel, i3);
                    } else if (c3 == 2) {
                        pendingIntent = (PendingIntent) ksy.O(parcel, i3, PendingIntent.CREATOR);
                    } else if (c3 == 3) {
                        I3 = ksy.I(parcel, i3);
                    } else if (c3 == 4) {
                        bundleM = ksy.M(parcel, i3);
                    } else if (c3 == 5) {
                        bArrAc = ksy.ac(parcel, i3);
                    } else if (c3 != 1000) {
                        ksy.aa(parcel, i3);
                    } else {
                        I2 = ksy.I(parcel, i3);
                    }
                }
                ksy.Y(parcel, iK3);
                jziVar = new jzi(I2, I, pendingIntent, I3, bundleM, bArrAc);
                break;
            case 3:
                int iK4 = ksy.K(parcel);
                long jL = 0;
                String strT8 = null;
                String strT9 = null;
                String strT10 = null;
                String strT11 = null;
                Uri uri = null;
                String strT12 = null;
                String strT13 = null;
                ArrayList arrayListX3 = null;
                String strT14 = null;
                String strT15 = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strT8 = ksy.T(parcel, i4);
                            break;
                        case 3:
                            strT9 = ksy.T(parcel, i4);
                            break;
                        case 4:
                            strT10 = ksy.T(parcel, i4);
                            break;
                        case 5:
                            strT11 = ksy.T(parcel, i4);
                            break;
                        case 6:
                            uri = (Uri) ksy.O(parcel, i4, Uri.CREATOR);
                            break;
                        case 7:
                            strT12 = ksy.T(parcel, i4);
                            break;
                        case '\b':
                            jL = ksy.L(parcel, i4);
                            break;
                        case '\t':
                            strT13 = ksy.T(parcel, i4);
                            break;
                        case '\n':
                            arrayListX3 = ksy.X(parcel, i4, Scope.CREATOR);
                            break;
                        case 11:
                            strT14 = ksy.T(parcel, i4);
                            break;
                        case '\f':
                            strT15 = ksy.T(parcel, i4);
                            break;
                        default:
                            ksy.aa(parcel, i4);
                            break;
                    }
                }
                ksy.Y(parcel, iK4);
                return new GoogleSignInAccount(strT8, strT9, strT10, strT11, uri, strT12, jL, strT13, arrayListX3, strT14, strT15);
            case 4:
                int iK5 = ksy.K(parcel);
                long jL2 = 0;
                long jL3 = 0;
                String str = null;
                String strT16 = null;
                String strT17 = null;
                String strT18 = null;
                String strT19 = null;
                String strT20 = null;
                String strT21 = null;
                String strT22 = null;
                kba kbaVar = null;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    String str2 = strT16;
                    switch ((char) i5) {
                        case 2:
                            strT = ksy.T(parcel, i5);
                            strT16 = str2;
                            break;
                        case 3:
                            strT16 = ksy.T(parcel, i5);
                            strT = str;
                            break;
                        case 4:
                            jL2 = ksy.L(parcel, i5);
                            strT16 = str2;
                            strT = str;
                            break;
                        case 5:
                            strT17 = ksy.T(parcel, i5);
                            strT16 = str2;
                            strT = str;
                            break;
                        case 6:
                            strT18 = ksy.T(parcel, i5);
                            strT16 = str2;
                            strT = str;
                            break;
                        case 7:
                            strT19 = ksy.T(parcel, i5);
                            strT16 = str2;
                            strT = str;
                            break;
                        case '\b':
                            strT20 = ksy.T(parcel, i5);
                            strT16 = str2;
                            strT = str;
                            break;
                        case '\t':
                            strT21 = ksy.T(parcel, i5);
                            strT16 = str2;
                            strT = str;
                            break;
                        case '\n':
                            strT22 = ksy.T(parcel, i5);
                            strT16 = str2;
                            strT = str;
                            break;
                        case 11:
                            jL3 = ksy.L(parcel, i5);
                            strT16 = str2;
                            strT = str;
                            break;
                        case '\f':
                            strT4 = ksy.T(parcel, i5);
                            strT16 = str2;
                            strT = str;
                            break;
                        case '\r':
                            kbaVar = (kba) ksy.O(parcel, i5, kba.CREATOR);
                            strT16 = str2;
                            strT = str;
                            break;
                        default:
                            ksy.aa(parcel, i5);
                            strT = str;
                            strT16 = str2;
                            break;
                    }
                    str = strT;
                }
                ksy.Y(parcel, iK5);
                return new jzq(str, strT16, jL2, strT17, strT18, strT19, strT20, strT21, strT22, jL3, strT4, kbaVar);
            case 5:
                int iK6 = ksy.K(parcel);
                long jL4 = 0;
                long jL5 = 0;
                boolean zAb = false;
                boolean zAb2 = false;
                boolean zAb3 = false;
                String strT23 = null;
                String[] strArrAg = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            jL4 = ksy.L(parcel, i6);
                            break;
                        case 3:
                            strT23 = ksy.T(parcel, i6);
                            break;
                        case 4:
                            jL5 = ksy.L(parcel, i6);
                            break;
                        case 5:
                            zAb = ksy.ab(parcel, i6);
                            break;
                        case 6:
                            strArrAg = ksy.ag(parcel, i6);
                            break;
                        case 7:
                            zAb2 = ksy.ab(parcel, i6);
                            break;
                        case '\b':
                            zAb3 = ksy.ab(parcel, i6);
                            break;
                        default:
                            ksy.aa(parcel, i6);
                            break;
                    }
                }
                ksy.Y(parcel, iK6);
                return new jzr(jL4, strT23, jL5, zAb, strArrAg, zAb2, zAb3);
            case 6:
                int iK7 = ksy.K(parcel);
                long jL6 = 0;
                String strT24 = null;
                String strT25 = null;
                long jL7 = 0;
                long jL8 = 0;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 2) {
                        jL7 = ksy.L(parcel, i7);
                    } else if (c4 == 3) {
                        jL8 = ksy.L(parcel, i7);
                    } else if (c4 == 4) {
                        strT24 = ksy.T(parcel, i7);
                    } else if (c4 == 5) {
                        strT25 = ksy.T(parcel, i7);
                    } else if (c4 != 6) {
                        ksy.aa(parcel, i7);
                    } else {
                        jL6 = ksy.L(parcel, i7);
                    }
                }
                ksy.Y(parcel, iK7);
                jziVar = new jzs(jL7, jL8, strT24, strT25, jL6);
                break;
            case 7:
                int iK8 = ksy.K(parcel);
                int I4 = 0;
                String strT26 = null;
                String strT27 = null;
                ArrayList arrayListW2 = null;
                String strT28 = null;
                Uri uri2 = null;
                String strT29 = null;
                String strT30 = null;
                Boolean boolP = null;
                Boolean boolP2 = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 2:
                            strT26 = ksy.T(parcel, i8);
                            break;
                        case 3:
                            strT27 = ksy.T(parcel, i8);
                            break;
                        case 4:
                            ksy.X(parcel, i8, kpo.CREATOR);
                            break;
                        case 5:
                            arrayListW2 = ksy.W(parcel, i8);
                            break;
                        case 6:
                            strT28 = ksy.T(parcel, i8);
                            break;
                        case 7:
                            uri2 = (Uri) ksy.O(parcel, i8, Uri.CREATOR);
                            break;
                        case '\b':
                            strT29 = ksy.T(parcel, i8);
                            break;
                        case '\t':
                            strT30 = ksy.T(parcel, i8);
                            break;
                        case '\n':
                            boolP = ksy.P(parcel, i8);
                            break;
                        case 11:
                            boolP2 = ksy.P(parcel, i8);
                            break;
                        case '\f':
                            I4 = ksy.I(parcel, i8);
                            break;
                        default:
                            ksy.aa(parcel, i8);
                            break;
                    }
                }
                ksy.Y(parcel, iK8);
                return new jzt(strT26, strT27, arrayListW2, strT28, uri2, strT29, strT30, boolP, boolP2, I4);
            case 8:
                int iK9 = ksy.K(parcel);
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        ksy.aa(parcel, i9);
                    } else {
                        I = ksy.I(parcel, i9);
                    }
                }
                ksy.Y(parcel, iK9);
                return new kab(I);
            case 9:
                int iK10 = ksy.K(parcel);
                String strT31 = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 1) {
                        strT3 = ksy.T(parcel, i10);
                    } else if (c5 != 2) {
                        ksy.aa(parcel, i10);
                    } else {
                        strT31 = ksy.T(parcel, i10);
                    }
                }
                ksy.Y(parcel, iK10);
                return new kac(strT3, strT31);
            case 10:
                int iK11 = ksy.K(parcel);
                float fH2 = 0.0f;
                float fH3 = 0.0f;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 2) {
                        fH = ksy.H(parcel, i11);
                    } else if (c6 == 3) {
                        fH2 = ksy.H(parcel, i11);
                    } else if (c6 != 4) {
                        ksy.aa(parcel, i11);
                    } else {
                        fH3 = ksy.H(parcel, i11);
                    }
                }
                ksy.Y(parcel, iK11);
                return new kad(fH, fH2, fH3);
            case 11:
                int iK12 = ksy.K(parcel);
                kad kadVar2 = null;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 2) {
                        kadVar = (kad) ksy.O(parcel, i12, kad.CREATOR);
                    } else if (c7 != 3) {
                        ksy.aa(parcel, i12);
                    } else {
                        kadVar2 = (kad) ksy.O(parcel, i12, kad.CREATOR);
                    }
                }
                ksy.Y(parcel, iK12);
                return new kae(kadVar, kadVar2);
            case 12:
                int iK13 = ksy.K(parcel);
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        ksy.aa(parcel, i13);
                    } else {
                        I = ksy.I(parcel, i13);
                    }
                }
                ksy.Y(parcel, iK13);
                return new kao(I);
            case 13:
                int iK14 = ksy.K(parcel);
                String strT32 = null;
                Integer numR = null;
                String strT33 = null;
                long jL9 = 0;
                String strT34 = null;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 2) {
                        strT34 = ksy.T(parcel, i14);
                    } else if (c8 == 3) {
                        jL9 = ksy.L(parcel, i14);
                    } else if (c8 == 4) {
                        numR = ksy.R(parcel, i14);
                    } else if (c8 == 5) {
                        strT33 = ksy.T(parcel, i14);
                    } else if (c8 != 6) {
                        ksy.aa(parcel, i14);
                    } else {
                        strT32 = ksy.T(parcel, i14);
                    }
                }
                ksy.Y(parcel, iK14);
                jziVar = new MediaError(strT34, jL9, numR, strT33, khe.e(strT32));
                break;
            case 14:
                int iK15 = ksy.K(parcel);
                long jL10 = 0;
                boolean zAb4 = false;
                boolean zAb5 = false;
                long jL11 = 0;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 2) {
                        jL11 = ksy.L(parcel, i15);
                    } else if (c9 == 3) {
                        jL10 = ksy.L(parcel, i15);
                    } else if (c9 == 4) {
                        zAb4 = ksy.ab(parcel, i15);
                    } else if (c9 != 5) {
                        ksy.aa(parcel, i15);
                    } else {
                        zAb5 = ksy.ab(parcel, i15);
                    }
                }
                ksy.Y(parcel, iK15);
                jziVar = new kar(jL11, jL10, zAb4, zAb5);
                break;
            case 15:
                int iK16 = ksy.K(parcel);
                Bundle bundleM2 = null;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 2) {
                        arrayListX2 = ksy.X(parcel, i16, kpo.CREATOR);
                    } else if (c10 == 3) {
                        bundleM2 = ksy.M(parcel, i16);
                    } else if (c10 != 4) {
                        ksy.aa(parcel, i16);
                    } else {
                        I = ksy.I(parcel, i16);
                    }
                }
                ksy.Y(parcel, iK16);
                return new kas(arrayListX2, bundleM2, I);
            case 16:
                int iK17 = ksy.K(parcel);
                double dG = 0.0d;
                int I5 = 0;
                String strT35 = null;
                ArrayList arrayListX4 = null;
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 2) {
                        I5 = ksy.I(parcel, i17);
                    } else if (c11 == 3) {
                        strT35 = ksy.T(parcel, i17);
                    } else if (c11 == 4) {
                        arrayListX = ksy.X(parcel, i17, kas.CREATOR);
                    } else if (c11 == 5) {
                        arrayListX4 = ksy.X(parcel, i17, kpo.CREATOR);
                    } else if (c11 != 6) {
                        ksy.aa(parcel, i17);
                    } else {
                        dG = ksy.G(parcel, i17);
                    }
                }
                ksy.Y(parcel, iK17);
                jziVar = new kat(I5, strT35, arrayListX, arrayListX4, dG);
                break;
            case 17:
                int iK18 = ksy.K(parcel);
                long jL12 = 0;
                int I6 = 0;
                int I7 = 0;
                int I8 = 0;
                boolean zAb6 = false;
                String strT36 = null;
                String strT37 = null;
                String strT38 = null;
                kat katVar = null;
                ArrayList arrayListX5 = null;
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            strT36 = ksy.T(parcel, i18);
                            break;
                        case 3:
                            strT37 = ksy.T(parcel, i18);
                            break;
                        case 4:
                            I6 = ksy.I(parcel, i18);
                            break;
                        case 5:
                            strT38 = ksy.T(parcel, i18);
                            break;
                        case 6:
                            katVar = (kat) ksy.O(parcel, i18, kat.CREATOR);
                            break;
                        case 7:
                            I7 = ksy.I(parcel, i18);
                            break;
                        case '\b':
                            arrayListX5 = ksy.X(parcel, i18, kav.CREATOR);
                            break;
                        case '\t':
                            I8 = ksy.I(parcel, i18);
                            break;
                        case '\n':
                            jL12 = ksy.L(parcel, i18);
                            break;
                        case 11:
                            zAb6 = ksy.ab(parcel, i18);
                            break;
                        default:
                            ksy.aa(parcel, i18);
                            break;
                    }
                }
                ksy.Y(parcel, iK18);
                return new kau(strT36, strT37, I6, strT38, katVar, I7, arrayListX5, I8, jL12, zAb6);
            case 18:
                int iK19 = ksy.K(parcel);
                double dG2 = 0.0d;
                double dG3 = 0.0d;
                double dG4 = 0.0d;
                int I9 = 0;
                boolean zAb7 = false;
                MediaInfo mediaInfo = null;
                long[] jArrAe = null;
                String strT39 = null;
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            mediaInfo = (MediaInfo) ksy.O(parcel, i19, MediaInfo.CREATOR);
                            break;
                        case 3:
                            I9 = ksy.I(parcel, i19);
                            break;
                        case 4:
                            zAb7 = ksy.ab(parcel, i19);
                            break;
                        case 5:
                            dG2 = ksy.G(parcel, i19);
                            break;
                        case 6:
                            dG3 = ksy.G(parcel, i19);
                            break;
                        case 7:
                            dG4 = ksy.G(parcel, i19);
                            break;
                        case '\b':
                            jArrAe = ksy.ae(parcel, i19);
                            break;
                        case '\t':
                            strT39 = ksy.T(parcel, i19);
                            break;
                        default:
                            ksy.aa(parcel, i19);
                            break;
                    }
                }
                ksy.Y(parcel, iK19);
                return new kav(mediaInfo, I9, zAb7, dG2, dG3, dG4, jArrAe, strT39);
            case 19:
                int iK20 = ksy.K(parcel);
                long jL13 = 0;
                int I10 = 0;
                int I11 = 0;
                String strT40 = null;
                String strT41 = null;
                String strT42 = null;
                String strT43 = null;
                ArrayList arrayListW3 = null;
                while (parcel.dataPosition() < iK20) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 2:
                            jL13 = ksy.L(parcel, i20);
                            break;
                        case 3:
                            I10 = ksy.I(parcel, i20);
                            break;
                        case 4:
                            strT40 = ksy.T(parcel, i20);
                            break;
                        case 5:
                            strT41 = ksy.T(parcel, i20);
                            break;
                        case 6:
                            strT42 = ksy.T(parcel, i20);
                            break;
                        case 7:
                            strT43 = ksy.T(parcel, i20);
                            break;
                        case '\b':
                            I11 = ksy.I(parcel, i20);
                            break;
                        case '\t':
                            arrayListW3 = ksy.W(parcel, i20);
                            break;
                        case '\n':
                            strT2 = ksy.T(parcel, i20);
                            break;
                        default:
                            ksy.aa(parcel, i20);
                            break;
                    }
                }
                ksy.Y(parcel, iK20);
                return new MediaTrack(jL13, I10, strT40, strT41, strT42, strT43, I11, arrayListW3, khe.e(strT2));
            default:
                int iK21 = ksy.K(parcel);
                float fH4 = 0.0f;
                int I12 = 0;
                int I13 = 0;
                int I14 = 0;
                int I15 = 0;
                int I16 = 0;
                int I17 = 0;
                int I18 = 0;
                int I19 = 0;
                int I20 = 0;
                String strT44 = null;
                String strT45 = null;
                while (parcel.dataPosition() < iK21) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            fH4 = ksy.H(parcel, i21);
                            break;
                        case 3:
                            I12 = ksy.I(parcel, i21);
                            break;
                        case 4:
                            I13 = ksy.I(parcel, i21);
                            break;
                        case 5:
                            I14 = ksy.I(parcel, i21);
                            break;
                        case 6:
                            I15 = ksy.I(parcel, i21);
                            break;
                        case 7:
                            I16 = ksy.I(parcel, i21);
                            break;
                        case '\b':
                            I17 = ksy.I(parcel, i21);
                            break;
                        case '\t':
                            I18 = ksy.I(parcel, i21);
                            break;
                        case '\n':
                            strT44 = ksy.T(parcel, i21);
                            break;
                        case 11:
                            I19 = ksy.I(parcel, i21);
                            break;
                        case '\f':
                            I20 = ksy.I(parcel, i21);
                            break;
                        case '\r':
                            strT45 = ksy.T(parcel, i21);
                            break;
                        default:
                            ksy.aa(parcel, i21);
                            break;
                    }
                }
                ksy.Y(parcel, iK21);
                return new kaz(fH4, I12, I13, I14, I15, I16, I17, I18, strT44, I19, I20, strT45);
        }
        return jziVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new jyr[i];
            case 1:
                return new jyp[i];
            case 2:
                return new jzi[i];
            case 3:
                return new GoogleSignInAccount[i];
            case 4:
                return new jzq[i];
            case 5:
                return new jzr[i];
            case 6:
                return new jzs[i];
            case 7:
                return new jzt[i];
            case 8:
                return new kab[i];
            case 9:
                return new kac[i];
            case 10:
                return new kad[i];
            case 11:
                return new kae[i];
            case 12:
                return new kao[i];
            case 13:
                return new MediaError[i];
            case 14:
                return new kar[i];
            case 15:
                return new kas[i];
            case 16:
                return new kat[i];
            case 17:
                return new kau[i];
            case 18:
                return new kav[i];
            case 19:
                return new MediaTrack[i];
            default:
                return new kaz[i];
        }
    }
}

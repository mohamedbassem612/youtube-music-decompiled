package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fh implements Parcelable.Creator {
    public static final fh a = new fh(13);
    private final /* synthetic */ int $cid;

    public fh(int i) {
        this.$cid = i;
    }

    public static void a(kqp kqpVar, Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(kqpVar.c);
        parcel.writeInt(262146);
        parcel.writeInt(kqpVar.d);
        parcel.writeInt(262147);
        parcel.writeInt(kqpVar.e);
        String str = kqpVar.f;
        if (str != null) {
            int iG2 = ksy.g(parcel, 4);
            parcel.writeString(str);
            ksy.h(parcel, iG2);
        }
        IBinder iBinder = kqpVar.g;
        if (iBinder != null) {
            int iG3 = ksy.g(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            ksy.h(parcel, iG3);
        }
        ksy.E(parcel, 6, kqpVar.h, i);
        Bundle bundle = kqpVar.i;
        if (bundle != null) {
            int iG4 = ksy.g(parcel, 7);
            parcel.writeBundle(bundle);
            ksy.h(parcel, iG4);
        }
        ksy.A(parcel, 8, kqpVar.j, i);
        ksy.E(parcel, 10, kqpVar.k, i);
        ksy.E(parcel, 11, kqpVar.l, i);
        boolean z = kqpVar.m;
        parcel.writeInt(262156);
        parcel.writeInt(z ? 1 : 0);
        int i2 = kqpVar.n;
        parcel.writeInt(262157);
        parcel.writeInt(i2);
        boolean z2 = kqpVar.o;
        parcel.writeInt(262158);
        parcel.writeInt(z2 ? 1 : 0);
        String str2 = kqpVar.p;
        if (str2 != null) {
            int iG5 = ksy.g(parcel, 15);
            parcel.writeString(str2);
            ksy.h(parcel, iG5);
        }
        ksy.h(parcel, iG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object tokenData;
        Object kapVar;
        Object kehVar;
        boolean zAb = false;
        int I = 0;
        int i = 0;
        int I2 = 0;
        boolean zAb2 = false;
        int I3 = 0;
        boolean zAb3 = false;
        int I4 = 0;
        boolean zAb4 = false;
        Account account = null;
        ArrayList arrayListX = null;
        String strT = null;
        kmx kmxVar = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        Long lS = null;
        switch (this.$cid) {
            case 0:
                return new PlaybackStateCompat(parcel);
            case 1:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 2:
                return new aib(parcel.readInt());
            case 3:
                return new heh(parcel);
            case 4:
                int iK = ksy.K(parcel);
                String[] strArrAg = null;
                Bundle bundleM = null;
                while (parcel.dataPosition() < iK) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        account = (Account) ksy.O(parcel, i2, Account.CREATOR);
                    } else if (c == 2) {
                        strArrAg = ksy.ag(parcel, i2);
                    } else if (c != 3) {
                        ksy.aa(parcel, i2);
                    } else {
                        bundleM = ksy.M(parcel, i2);
                    }
                }
                ksy.Y(parcel, iK);
                return new jyc(account, strArrAg, bundleM);
            case 5:
                int iK2 = ksy.K(parcel);
                int i3 = 0;
                boolean zAb5 = false;
                boolean zAb6 = false;
                String strT5 = null;
                ArrayList arrayListW = null;
                String strT6 = null;
                while (parcel.dataPosition() < iK2) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            ksy.Z(parcel, i4, 4);
                            i3 = parcel.readInt();
                            break;
                        case 2:
                            strT5 = ksy.T(parcel, i4);
                            break;
                        case 3:
                            lS = ksy.S(parcel, i4);
                            break;
                        case 4:
                            zAb5 = ksy.ab(parcel, i4);
                            break;
                        case 5:
                            zAb6 = ksy.ab(parcel, i4);
                            break;
                        case 6:
                            arrayListW = ksy.W(parcel, i4);
                            break;
                        case 7:
                            strT6 = ksy.T(parcel, i4);
                            break;
                        default:
                            ksy.aa(parcel, i4);
                            break;
                    }
                }
                ksy.Y(parcel, iK2);
                tokenData = new TokenData(i3, strT5, lS, zAb5, zAb6, arrayListW, strT6);
                return tokenData;
            case 6:
                int iK3 = ksy.K(parcel);
                boolean zAb7 = false;
                kac kacVar = null;
                while (parcel.dataPosition() < iK3) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 2) {
                        zAb = ksy.ab(parcel, i5);
                    } else if (c2 == 3) {
                        strT4 = ksy.T(parcel, i5);
                    } else if (c2 == 4) {
                        zAb7 = ksy.ab(parcel, i5);
                    } else if (c2 != 5) {
                        ksy.aa(parcel, i5);
                    } else {
                        kacVar = (kac) ksy.O(parcel, i5, kac.CREATOR);
                    }
                }
                ksy.Y(parcel, iK3);
                kapVar = new kap(zAb, strT4, zAb7, kacVar);
                return kapVar;
            case 7:
                int iK4 = ksy.K(parcel);
                while (parcel.dataPosition() < iK4) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 2) {
                        ksy.aa(parcel, i6);
                    } else {
                        zAb4 = ksy.ab(parcel, i6);
                    }
                }
                ksy.Y(parcel, iK4);
                kapVar = new kbl(zAb4);
                return kapVar;
            case 8:
                int iK5 = ksy.K(parcel);
                while (parcel.dataPosition() < iK5) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 2) {
                        ksy.aa(parcel, i7);
                    } else {
                        I4 = ksy.I(parcel, i7);
                    }
                }
                ksy.Y(parcel, iK5);
                kapVar = new kbm(I4);
                return kapVar;
            case 9:
                int iK6 = ksy.K(parcel);
                boolean zAb8 = false;
                String strT7 = null;
                String strT8 = null;
                IBinder iBinderN = null;
                keu keuVar = null;
                while (parcel.dataPosition() < iK6) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 2:
                            strT7 = ksy.T(parcel, i8);
                            break;
                        case 3:
                            strT8 = ksy.T(parcel, i8);
                            break;
                        case 4:
                            iBinderN = ksy.N(parcel, i8);
                            break;
                        case 5:
                            keuVar = (keu) ksy.O(parcel, i8, keu.CREATOR);
                            break;
                        case 6:
                            zAb8 = ksy.ab(parcel, i8);
                            break;
                        case 7:
                            zAb3 = ksy.ab(parcel, i8);
                            break;
                        default:
                            ksy.aa(parcel, i8);
                            break;
                    }
                }
                ksy.Y(parcel, iK6);
                kehVar = new keh(strT7, strT8, iBinderN, keuVar, zAb8, zAb3);
                return kehVar;
            case 10:
                int iK7 = ksy.K(parcel);
                int I5 = 0;
                while (parcel.dataPosition() < iK7) {
                    int i9 = parcel.readInt();
                    char c3 = (char) i9;
                    if (c3 == 1) {
                        strT3 = ksy.T(parcel, i9);
                    } else if (c3 == 2) {
                        I3 = ksy.I(parcel, i9);
                    } else if (c3 != 3) {
                        ksy.aa(parcel, i9);
                    } else {
                        I5 = ksy.I(parcel, i9);
                    }
                }
                ksy.Y(parcel, iK7);
                kapVar = new kjt(strT3, I3, I5);
                return kapVar;
            case 11:
                int iK8 = ksy.K(parcel);
                int I6 = 0;
                int I7 = 0;
                PendingIntent pendingIntent = null;
                String strT9 = null;
                Integer numR = null;
                Bundle bundleM2 = null;
                while (parcel.dataPosition() < iK8) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            I6 = ksy.I(parcel, i10);
                            break;
                        case 2:
                            I7 = ksy.I(parcel, i10);
                            break;
                        case 3:
                            pendingIntent = (PendingIntent) ksy.O(parcel, i10, PendingIntent.CREATOR);
                            break;
                        case 4:
                            strT9 = ksy.T(parcel, i10);
                            break;
                        case 5:
                            numR = ksy.R(parcel, i10);
                            break;
                        case 6:
                            bundleM2 = ksy.M(parcel, i10);
                            break;
                        default:
                            ksy.aa(parcel, i10);
                            break;
                    }
                }
                ksy.Y(parcel, iK8);
                kehVar = new klo(I6, I7, pendingIntent, strT9, numR, bundleM2);
                return kehVar;
            case 12:
                int iK9 = ksy.K(parcel);
                boolean zAb9 = false;
                long j = -1;
                int i11 = 0;
                while (parcel.dataPosition() < iK9) {
                    int i12 = parcel.readInt();
                    char c4 = (char) i12;
                    if (c4 == 1) {
                        strT2 = ksy.T(parcel, i12);
                    } else if (c4 == 2) {
                        ksy.Z(parcel, i12, 4);
                        i11 = parcel.readInt();
                    } else if (c4 == 3) {
                        ksy.Z(parcel, i12, 8);
                        j = parcel.readLong();
                    } else if (c4 != 4) {
                        ksy.aa(parcel, i12);
                    } else {
                        zAb9 = ksy.ab(parcel, i12);
                    }
                }
                ksy.Y(parcel, iK9);
                return new klq(strT2, i11, j, zAb9);
            case 13:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return kmv.a;
                }
                int iK10 = ksy.K(parcel);
                knk knkVar = null;
                while (parcel.dataPosition() < iK10) {
                    int i13 = parcel.readInt();
                    char c5 = (char) i13;
                    if (c5 == 1) {
                        kmxVar = (kmx) ksy.O(parcel, i13, kmx.CREATOR);
                    } else if (c5 == 2) {
                        zAb2 = ksy.ab(parcel, i13);
                    } else if (c5 != 3) {
                        ksy.aa(parcel, i13);
                    } else {
                        knkVar = (knk) ksy.O(parcel, i13, knk.CREATOR);
                    }
                }
                ksy.Y(parcel, iK10);
                kapVar = new kmv(kmxVar, zAb2, knkVar);
                return kapVar;
            case 14:
                int iK11 = ksy.K(parcel);
                boolean zAb10 = true;
                int I8 = 0;
                int I9 = 0;
                while (parcel.dataPosition() < iK11) {
                    int i14 = parcel.readInt();
                    char c6 = (char) i14;
                    if (c6 == 1) {
                        I2 = ksy.I(parcel, i14);
                    } else if (c6 == 2) {
                        I8 = ksy.I(parcel, i14);
                    } else if (c6 == 3) {
                        I9 = ksy.I(parcel, i14);
                    } else if (c6 != 4) {
                        ksy.aa(parcel, i14);
                    } else {
                        zAb10 = ksy.ab(parcel, i14);
                    }
                }
                ksy.Y(parcel, iK11);
                kapVar = new kmx(I2, I8, I9, zAb10);
                return kapVar;
            case 15:
                int iK12 = ksy.K(parcel);
                PendingIntent pendingIntent2 = null;
                klo kloVar = null;
                while (parcel.dataPosition() < iK12) {
                    int i15 = parcel.readInt();
                    char c7 = (char) i15;
                    if (c7 == 1) {
                        ksy.Z(parcel, i15, 4);
                        i = parcel.readInt();
                    } else if (c7 == 2) {
                        strT = ksy.T(parcel, i15);
                    } else if (c7 == 3) {
                        pendingIntent2 = (PendingIntent) ksy.O(parcel, i15, PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        ksy.aa(parcel, i15);
                    } else {
                        kloVar = (klo) ksy.O(parcel, i15, klo.CREATOR);
                    }
                }
                ksy.Y(parcel, iK12);
                kapVar = new Status(i, strT, pendingIntent2, kloVar);
                return kapVar;
            case 16:
                int iK13 = ksy.K(parcel);
                Bundle bundleM3 = null;
                kqj kqjVar = null;
                kqk kqkVar = null;
                String strT10 = null;
                int i16 = 0;
                klq[] klqVarArr = null;
                while (parcel.dataPosition() < iK13) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            bundleM3 = ksy.M(parcel, i17);
                            break;
                        case 2:
                            klqVarArr = (klq[]) ksy.af(parcel, i17, klq.CREATOR);
                            break;
                        case 3:
                            ksy.Z(parcel, i17, 4);
                            i16 = parcel.readInt();
                            break;
                        case 4:
                            kqjVar = (kqj) ksy.O(parcel, i17, kqj.CREATOR);
                            break;
                        case 5:
                            kqkVar = (kqk) ksy.O(parcel, i17, kqk.CREATOR);
                            break;
                        case 6:
                            strT10 = ksy.T(parcel, i17);
                            break;
                        default:
                            ksy.aa(parcel, i17);
                            break;
                    }
                }
                ksy.Y(parcel, iK13);
                tokenData = new kqi(bundleM3, klqVarArr, i16, kqjVar, kqkVar, strT10);
                return tokenData;
            case 17:
                int iK14 = ksy.K(parcel);
                Scope[] scopeArr = kqp.a;
                Bundle bundle = new Bundle();
                klq[] klqVarArr2 = kqp.b;
                klq[] klqVarArr3 = klqVarArr2;
                int I10 = 0;
                int I11 = 0;
                boolean zAb11 = false;
                int I12 = 0;
                boolean zAb12 = false;
                String strT11 = null;
                IBinder iBinderN2 = null;
                Account account2 = null;
                String strT12 = null;
                Scope[] scopeArr2 = scopeArr;
                Bundle bundleM4 = bundle;
                int I13 = 0;
                while (parcel.dataPosition() < iK14) {
                    int i18 = parcel.readInt();
                    int i19 = I13;
                    switch ((char) i18) {
                        case 1:
                            I10 = ksy.I(parcel, i18);
                            break;
                        case 2:
                            I13 = ksy.I(parcel, i18);
                            continue;
                        case 3:
                            I11 = ksy.I(parcel, i18);
                            break;
                        case 4:
                            strT11 = ksy.T(parcel, i18);
                            break;
                        case 5:
                            iBinderN2 = ksy.N(parcel, i18);
                            break;
                        case 6:
                            scopeArr2 = (Scope[]) ksy.af(parcel, i18, Scope.CREATOR);
                            break;
                        case 7:
                            bundleM4 = ksy.M(parcel, i18);
                            break;
                        case '\b':
                            account2 = (Account) ksy.O(parcel, i18, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            ksy.aa(parcel, i18);
                            break;
                        case '\n':
                            klqVarArr2 = (klq[]) ksy.af(parcel, i18, klq.CREATOR);
                            break;
                        case 11:
                            klqVarArr3 = (klq[]) ksy.af(parcel, i18, klq.CREATOR);
                            break;
                        case '\f':
                            zAb11 = ksy.ab(parcel, i18);
                            break;
                        case '\r':
                            I12 = ksy.I(parcel, i18);
                            break;
                        case 14:
                            zAb12 = ksy.ab(parcel, i18);
                            break;
                        case 15:
                            strT12 = ksy.T(parcel, i18);
                            break;
                    }
                    I13 = i19;
                }
                ksy.Y(parcel, iK14);
                kehVar = new kqp(I10, I13, I11, strT11, iBinderN2, scopeArr2, bundleM4, account2, klqVarArr2, klqVarArr3, zAb11, I12, zAb12, strT12);
                return kehVar;
            case 18:
                int iK15 = ksy.K(parcel);
                long jL = 0;
                int I14 = -1;
                int I15 = 0;
                int I16 = 0;
                String strT13 = null;
                String strT14 = null;
                long jL2 = 0;
                int I17 = 0;
                int I18 = 0;
                while (parcel.dataPosition() < iK15) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            I17 = ksy.I(parcel, i20);
                            break;
                        case 2:
                            I18 = ksy.I(parcel, i20);
                            break;
                        case 3:
                            I15 = ksy.I(parcel, i20);
                            break;
                        case 4:
                            jL = ksy.L(parcel, i20);
                            break;
                        case 5:
                            jL2 = ksy.L(parcel, i20);
                            break;
                        case 6:
                            strT13 = ksy.T(parcel, i20);
                            break;
                        case 7:
                            strT14 = ksy.T(parcel, i20);
                            break;
                        case '\b':
                            I16 = ksy.I(parcel, i20);
                            break;
                        case '\t':
                            I14 = ksy.I(parcel, i20);
                            break;
                        default:
                            ksy.aa(parcel, i20);
                            break;
                    }
                }
                ksy.Y(parcel, iK15);
                kehVar = new krj(I17, I18, I15, jL, jL2, strT13, strT14, I16, I14);
                return kehVar;
            case 19:
                int iK16 = ksy.K(parcel);
                int I19 = 0;
                boolean zAb13 = false;
                boolean zAb14 = false;
                int I20 = 0;
                int I21 = 0;
                while (parcel.dataPosition() < iK16) {
                    int i21 = parcel.readInt();
                    char c8 = (char) i21;
                    if (c8 == 1) {
                        I19 = ksy.I(parcel, i21);
                    } else if (c8 == 2) {
                        zAb13 = ksy.ab(parcel, i21);
                    } else if (c8 == 3) {
                        zAb14 = ksy.ab(parcel, i21);
                    } else if (c8 == 4) {
                        I20 = ksy.I(parcel, i21);
                    } else if (c8 != 5) {
                        ksy.aa(parcel, i21);
                    } else {
                        I21 = ksy.I(parcel, i21);
                    }
                }
                ksy.Y(parcel, iK16);
                return new krt(I19, zAb13, zAb14, I20, I21);
            default:
                int iK17 = ksy.K(parcel);
                while (parcel.dataPosition() < iK17) {
                    int i22 = parcel.readInt();
                    char c9 = (char) i22;
                    if (c9 == 1) {
                        I = ksy.I(parcel, i22);
                    } else if (c9 != 2) {
                        ksy.aa(parcel, i22);
                    } else {
                        arrayListX = ksy.X(parcel, i22, krj.CREATOR);
                    }
                }
                ksy.Y(parcel, iK17);
                kapVar = new krv(I, arrayListX);
                return kapVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new PlaybackStateCompat[i];
            case 1:
                return new MediaSessionCompat$Token[i];
            case 2:
                return new aib[i];
            case 3:
                return new heh[i];
            case 4:
                return new jyc[i];
            case 5:
                return new TokenData[i];
            case 6:
                return new kap[i];
            case 7:
                return new kbl[i];
            case 8:
                return new kbm[i];
            case 9:
                return new keh[i];
            case 10:
                return new kjt[i];
            case 11:
                return new klo[i];
            case 12:
                return new klq[i];
            case 13:
                return new kmv[i];
            case 14:
                return new kmx[i];
            case 15:
                return new Status[i];
            case 16:
                return new kqi[i];
            case 17:
                return new kqp[i];
            case 18:
                return new krj[i];
            case 19:
                return new krt[i];
            default:
                return new krv[i];
        }
    }
}

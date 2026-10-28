package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.wallet.firstparty.LoaderConfig;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lry implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public lry(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x026e. Please report as an issue. */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object lrxVar;
        Object lsmVar;
        int I;
        long jL = 0;
        int I2 = 0;
        byte[] bArrAc = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String[] strArrAg = null;
        byte[] bArrAc2 = null;
        String strT6 = null;
        PendingIntent pendingIntent = null;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                int I3 = 0;
                int I4 = 0;
                int I5 = 0;
                Bundle bundleM = null;
                String strT7 = null;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        I3 = ksy.I(parcel, i);
                    } else if (c == 3) {
                        bundleM = ksy.M(parcel, i);
                    } else if (c == 4) {
                        strT7 = ksy.T(parcel, i);
                    } else if (c == 5) {
                        I4 = ksy.I(parcel, i);
                    } else if (c != 6) {
                        ksy.aa(parcel, i);
                    } else {
                        I5 = ksy.I(parcel, i);
                    }
                }
                ksy.Y(parcel, iK);
                lrxVar = new lrx(I3, bundleM, strT7, I4, I5);
                return lrxVar;
            case 1:
                int iK2 = ksy.K(parcel);
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        ksy.aa(parcel, i2);
                    } else {
                        bArrAc = ksy.ac(parcel, i2);
                    }
                }
                ksy.Y(parcel, iK2);
                return new lrw(bArrAc);
            case 2:
                int iK3 = ksy.K(parcel);
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        ksy.aa(parcel, i3);
                    } else {
                        pendingIntent = (PendingIntent) ksy.O(parcel, i3, PendingIntent.CREATOR);
                    }
                }
                ksy.Y(parcel, iK3);
                return new lrz(pendingIntent);
            case 3:
                int iK4 = ksy.K(parcel);
                while (parcel.dataPosition() < iK4) {
                    ksy.aa(parcel, parcel.readInt());
                }
                ksy.Y(parcel, iK4);
                return new lsd();
            case 4:
                int iK5 = ksy.K(parcel);
                while (parcel.dataPosition() < iK5) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 2) {
                        I2 = ksy.I(parcel, i4);
                    } else if (c2 != 3) {
                        ksy.aa(parcel, i4);
                    } else {
                        strT6 = ksy.T(parcel, i4);
                    }
                }
                ksy.Y(parcel, iK5);
                return new lsf(I2, strT6);
            case 5:
                int iK6 = ksy.K(parcel);
                lsf[] lsfVarArr = null;
                while (parcel.dataPosition() < iK6) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 2) {
                        bArrAc2 = ksy.ac(parcel, i5);
                    } else if (c3 != 3) {
                        ksy.aa(parcel, i5);
                    } else {
                        lsfVarArr = (lsf[]) ksy.af(parcel, i5, lsf.CREATOR);
                    }
                }
                ksy.Y(parcel, iK6);
                return new SecurePaymentsPayload(bArrAc2, lsfVarArr);
            case 6:
                int iK7 = ksy.K(parcel);
                int[] iArrAd = null;
                RemoteViews remoteViews = null;
                byte[] bArrAc3 = null;
                while (parcel.dataPosition() < iK7) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        strArrAg = ksy.ag(parcel, i6);
                    } else if (c4 == 2) {
                        iArrAd = ksy.ad(parcel, i6);
                    } else if (c4 == 3) {
                        remoteViews = (RemoteViews) ksy.O(parcel, i6, RemoteViews.CREATOR);
                    } else if (c4 != 4) {
                        ksy.aa(parcel, i6);
                    } else {
                        bArrAc3 = ksy.ac(parcel, i6);
                    }
                }
                ksy.Y(parcel, iK7);
                return new lsg(strArrAg, iArrAd, remoteViews, bArrAc3);
            case 7:
                int iK8 = ksy.K(parcel);
                double dG = 0.0d;
                int i7 = 1;
                boolean zAb = false;
                int I6 = 0;
                int I7 = 0;
                Account account = null;
                Bundle bundleM2 = null;
                LoaderConfig loaderConfig = null;
                double dG2 = 0.0d;
                int I8 = 1;
                int I9 = 0;
                lrx lrxVar2 = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    Account account2 = account;
                    switch ((char) i8) {
                        case 2:
                            I = ksy.I(parcel, i8);
                            account = account2;
                            break;
                        case 3:
                            account = (Account) ksy.O(parcel, i8, Account.CREATOR);
                            I = i7;
                            break;
                        case 4:
                            bundleM2 = ksy.M(parcel, i8);
                            account = account2;
                            I = i7;
                            break;
                        case 5:
                            zAb = ksy.ab(parcel, i8);
                            account = account2;
                            I = i7;
                            break;
                        case 6:
                            I8 = ksy.I(parcel, i8);
                            account = account2;
                            I = i7;
                            break;
                        case 7:
                            lrxVar2 = (lrx) ksy.O(parcel, i8, lrx.CREATOR);
                            account = account2;
                            I = i7;
                            break;
                        case '\b':
                            I6 = ksy.I(parcel, i8);
                            account = account2;
                            I = i7;
                            break;
                        case '\t':
                            dG2 = ksy.G(parcel, i8);
                            account = account2;
                            I = i7;
                            break;
                        case '\n':
                            dG = ksy.G(parcel, i8);
                            account = account2;
                            I = i7;
                            break;
                        case 11:
                            I9 = ksy.I(parcel, i8);
                            account = account2;
                            I = i7;
                            break;
                        case '\f':
                            I7 = ksy.I(parcel, i8);
                            account = account2;
                            I = i7;
                            break;
                        case '\r':
                            loaderConfig = (LoaderConfig) ksy.O(parcel, i8, LoaderConfig.CREATOR);
                            account = account2;
                            I = i7;
                            break;
                        default:
                            ksy.aa(parcel, i8);
                            I = i7;
                            account = account2;
                            break;
                    }
                    i7 = I;
                }
                ksy.Y(parcel, iK8);
                lsmVar = new lsm(i7, account, bundleM2, zAb, I8, lrxVar2, I6, dG2, dG, I9, I7, loaderConfig);
                return lsmVar;
            case 8:
                int iK9 = ksy.K(parcel);
                int I10 = 0;
                String strT8 = null;
                lsm lsmVar2 = null;
                String strT9 = null;
                String strT10 = null;
                String strT11 = null;
                String strT12 = null;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            strT8 = ksy.T(parcel, i9);
                            break;
                        case 3:
                            lsmVar2 = (lsm) ksy.O(parcel, i9, lsm.CREATOR);
                            break;
                        case 4:
                            strT9 = ksy.T(parcel, i9);
                            break;
                        case 5:
                            strT10 = ksy.T(parcel, i9);
                            break;
                        case 6:
                            strT11 = ksy.T(parcel, i9);
                            break;
                        case 7:
                            strT12 = ksy.T(parcel, i9);
                            break;
                        case '\b':
                            I10 = ksy.I(parcel, i9);
                            break;
                        default:
                            ksy.aa(parcel, i9);
                            break;
                    }
                }
                ksy.Y(parcel, iK9);
                lsmVar = new BuyFlowConfig(strT8, lsmVar2, strT9, strT10, strT11, strT12, I10);
                return lsmVar;
            case 9:
                int iK10 = ksy.K(parcel);
                String strT13 = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 2) {
                        strT5 = ksy.T(parcel, i10);
                    } else if (c5 != 3) {
                        ksy.aa(parcel, i10);
                    } else {
                        strT13 = ksy.T(parcel, i10);
                    }
                }
                ksy.Y(parcel, iK10);
                return new lso(strT5, strT13);
            case 10:
                int iK11 = ksy.K(parcel);
                ArrayList arrayList = new ArrayList();
                String strT14 = null;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 2) {
                        strT4 = ksy.T(parcel, i11);
                    } else if (c6 == 3) {
                        strT14 = ksy.T(parcel, i11);
                    } else if (c6 != 4) {
                        ksy.aa(parcel, i11);
                    } else {
                        arrayList = ksy.X(parcel, i11, lso.CREATOR);
                    }
                }
                ksy.Y(parcel, iK11);
                return new lsp(strT4, strT14, arrayList);
            case 11:
                int iK12 = ksy.K(parcel);
                long jL2 = 0;
                double dG3 = 0.0d;
                int I11 = -1;
                int I12 = 0;
                String strT15 = null;
                String strT16 = null;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            I12 = ksy.I(parcel, i12);
                            break;
                        case 3:
                            strT15 = ksy.T(parcel, i12);
                            break;
                        case 4:
                            dG3 = ksy.G(parcel, i12);
                            break;
                        case 5:
                            strT16 = ksy.T(parcel, i12);
                            break;
                        case 6:
                            jL2 = ksy.L(parcel, i12);
                            break;
                        case 7:
                            I11 = ksy.I(parcel, i12);
                            break;
                        default:
                            ksy.aa(parcel, i12);
                            break;
                    }
                }
                ksy.Y(parcel, iK12);
                lsmVar = new lsr(I12, strT15, dG3, strT16, jL2, I11);
                return lsmVar;
            case 12:
                int iK13 = ksy.K(parcel);
                lsr lsrVar = null;
                lst lstVar = null;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 2) {
                        strT3 = ksy.T(parcel, i13);
                    } else if (c7 == 3) {
                        lsrVar = (lsr) ksy.O(parcel, i13, lsr.CREATOR);
                    } else if (c7 != 5) {
                        ksy.aa(parcel, i13);
                    } else {
                        lstVar = (lst) ksy.O(parcel, i13, lst.CREATOR);
                    }
                }
                ksy.Y(parcel, iK13);
                return new lsq(strT3, lsrVar, lstVar);
            case 13:
                int iK14 = ksy.K(parcel);
                String strT17 = null;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 2) {
                        strT2 = ksy.T(parcel, i14);
                    } else if (c8 != 3) {
                        ksy.aa(parcel, i14);
                    } else {
                        strT17 = ksy.T(parcel, i14);
                    }
                }
                ksy.Y(parcel, iK14);
                return new lss(strT2, strT17);
            case 14:
                int iK15 = ksy.K(parcel);
                long jL3 = 0;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 2) {
                        jL = ksy.L(parcel, i15);
                    } else if (c9 != 3) {
                        ksy.aa(parcel, i15);
                    } else {
                        jL3 = ksy.L(parcel, i15);
                    }
                }
                ksy.Y(parcel, iK15);
                return new lst(jL, jL3);
            case 15:
                int iK16 = ksy.K(parcel);
                String strT18 = null;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 2) {
                        strT = ksy.T(parcel, i16);
                    } else if (c10 != 3) {
                        ksy.aa(parcel, i16);
                    } else {
                        strT18 = ksy.T(parcel, i16);
                    }
                }
                ksy.Y(parcel, iK16);
                return new lsu(strT, strT18);
            case 16:
                int iK17 = ksy.K(parcel);
                String strT19 = null;
                String strT20 = null;
                lst lstVar2 = null;
                lsu lsuVar = null;
                lsu lsuVar2 = null;
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 2) {
                        strT19 = ksy.T(parcel, i17);
                    } else if (c11 == 3) {
                        strT20 = ksy.T(parcel, i17);
                    } else if (c11 == 4) {
                        lstVar2 = (lst) ksy.O(parcel, i17, lst.CREATOR);
                    } else if (c11 == 5) {
                        lsuVar = (lsu) ksy.O(parcel, i17, lsu.CREATOR);
                    } else if (c11 != 6) {
                        ksy.aa(parcel, i17);
                    } else {
                        lsuVar2 = (lsu) ksy.O(parcel, i17, lsu.CREATOR);
                    }
                }
                ksy.Y(parcel, iK17);
                lrxVar = new lsv(strT19, strT20, lstVar2, lsuVar, lsuVar2);
                return lrxVar;
            case 17:
                return new mon(parcel);
            case 18:
                return new ogo(parcel);
            case 19:
                parcel.getClass();
                return new pxl(parcel.readString());
            default:
                parcel.getClass();
                return new pxn(parcel.readString(), parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new lrx[i];
            case 1:
                return new lrw[i];
            case 2:
                return new lrz[i];
            case 3:
                return new lsd[i];
            case 4:
                return new lsf[i];
            case 5:
                return new SecurePaymentsPayload[i];
            case 6:
                return new lsg[i];
            case 7:
                return new lsm[i];
            case 8:
                return new BuyFlowConfig[i];
            case 9:
                return new lso[i];
            case 10:
                return new lsp[i];
            case 11:
                return new lsr[i];
            case 12:
                return new lsq[i];
            case 13:
                return new lss[i];
            case 14:
                return new lst[i];
            case 15:
                return new lsu[i];
            case 16:
                return new lsv[i];
            case 17:
                return new mon[i];
            case 18:
                return new ogo[i];
            case 19:
                return new pxl[i];
            default:
                return new pxn[i];
        }
    }
}

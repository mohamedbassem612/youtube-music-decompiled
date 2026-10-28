package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.firstparty.ExitResult;
import com.google.android.gms.wallet.firstparty.LoaderConfig;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqu implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public lqu(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object lqyVar;
        Object lqzVar;
        long jL = 0;
        int I = 1;
        int I2 = 0;
        boolean zAb = false;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        int I6 = 0;
        int I7 = 0;
        int I8 = 0;
        String strT = null;
        String strT2 = null;
        byte[] bArrAc = null;
        lrx lrxVar = null;
        byte[] bArrAc2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        Bundle bundleM = null;
        PendingIntent pendingIntent = null;
        String strT9 = null;
        lrf[] lrfVarArr = null;
        String strT10 = null;
        UserAddress userAddress = null;
        String strT11 = null;
        String strT12 = null;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                boolean zAb2 = false;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        I2 = ksy.I(parcel, i);
                    } else if (c != 3) {
                        ksy.aa(parcel, i);
                    } else {
                        zAb2 = ksy.ab(parcel, i);
                    }
                }
                ksy.Y(parcel, iK);
                return new lqt(I2, zAb2);
            case 1:
                int iK2 = ksy.K(parcel);
                String strT13 = null;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 2) {
                        strT = ksy.T(parcel, i2);
                    } else if (c2 == 3) {
                        strT13 = ksy.T(parcel, i2);
                    } else if (c2 != 4) {
                        ksy.aa(parcel, i2);
                    } else {
                        I8 = ksy.I(parcel, i2);
                    }
                }
                ksy.Y(parcel, iK2);
                return new lqp(strT, strT13, I8);
            case 2:
                int iK3 = ksy.K(parcel);
                long jL2 = 0;
                int I9 = 0;
                int I10 = 0;
                int I11 = 0;
                int I12 = 0;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 2) {
                        I9 = ksy.I(parcel, i3);
                    } else if (c3 == 3) {
                        I10 = ksy.I(parcel, i3);
                    } else if (c3 == 4) {
                        I11 = ksy.I(parcel, i3);
                    } else if (c3 == 5) {
                        jL2 = ksy.L(parcel, i3);
                    } else if (c3 != 6) {
                        ksy.aa(parcel, i3);
                    } else {
                        I12 = ksy.I(parcel, i3);
                    }
                }
                ksy.Y(parcel, iK3);
                lqyVar = new lqy(I9, I10, I11, jL2, I12);
                return lqyVar;
            case 3:
                int iK4 = ksy.K(parcel);
                boolean zAb3 = false;
                String strT14 = null;
                String strT15 = null;
                String strT16 = null;
                String strT17 = null;
                String strT18 = null;
                String strT19 = null;
                String strT20 = null;
                String strT21 = null;
                String strT22 = null;
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strT14 = ksy.T(parcel, i4);
                            break;
                        case 3:
                            strT15 = ksy.T(parcel, i4);
                            break;
                        case 4:
                            strT16 = ksy.T(parcel, i4);
                            break;
                        case 5:
                            strT17 = ksy.T(parcel, i4);
                            break;
                        case 6:
                            strT18 = ksy.T(parcel, i4);
                            break;
                        case 7:
                            strT19 = ksy.T(parcel, i4);
                            break;
                        case '\b':
                            strT20 = ksy.T(parcel, i4);
                            break;
                        case '\t':
                            strT12 = ksy.T(parcel, i4);
                            break;
                        case '\n':
                            strT21 = ksy.T(parcel, i4);
                            break;
                        case 11:
                            zAb3 = ksy.ab(parcel, i4);
                            break;
                        case '\f':
                            strT22 = ksy.T(parcel, i4);
                            break;
                        default:
                            ksy.aa(parcel, i4);
                            break;
                    }
                }
                ksy.Y(parcel, iK4);
                lqzVar = new lqz(strT14, strT15, strT16, strT17, strT18, strT19, strT20, strT12, strT21, zAb3, strT22);
                return lqzVar;
            case 4:
                int iK5 = ksy.K(parcel);
                int I13 = 0;
                String strT23 = null;
                String strT24 = null;
                UserAddress userAddress2 = null;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        strT11 = ksy.T(parcel, i5);
                    } else if (c4 == 2) {
                        strT23 = ksy.T(parcel, i5);
                    } else if (c4 == 3) {
                        strT24 = ksy.T(parcel, i5);
                    } else if (c4 == 4) {
                        I13 = ksy.I(parcel, i5);
                    } else if (c4 != 5) {
                        ksy.aa(parcel, i5);
                    } else {
                        userAddress2 = (UserAddress) ksy.O(parcel, i5, UserAddress.CREATOR);
                    }
                }
                ksy.Y(parcel, iK5);
                lqyVar = new lra(strT11, strT23, strT24, I13, userAddress2);
                return lqyVar;
            case 5:
                int iK6 = ksy.K(parcel);
                String strT25 = null;
                String strT26 = null;
                lrk lrkVar = null;
                String strT27 = null;
                lqz lqzVar2 = null;
                lqz lqzVar3 = null;
                String[] strArrAg = null;
                UserAddress userAddress3 = null;
                lrc[] lrcVarArr = null;
                lrj lrjVar = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            strT25 = ksy.T(parcel, i6);
                            break;
                        case 3:
                            strT26 = ksy.T(parcel, i6);
                            break;
                        case 4:
                            lrkVar = (lrk) ksy.O(parcel, i6, lrk.CREATOR);
                            break;
                        case 5:
                            strT27 = ksy.T(parcel, i6);
                            break;
                        case 6:
                            lqzVar2 = (lqz) ksy.O(parcel, i6, lqz.CREATOR);
                            break;
                        case 7:
                            lqzVar3 = (lqz) ksy.O(parcel, i6, lqz.CREATOR);
                            break;
                        case '\b':
                            strArrAg = ksy.ag(parcel, i6);
                            break;
                        case '\t':
                            userAddress = (UserAddress) ksy.O(parcel, i6, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) ksy.O(parcel, i6, UserAddress.CREATOR);
                            break;
                        case 11:
                            lrcVarArr = (lrc[]) ksy.af(parcel, i6, lrc.CREATOR);
                            break;
                        case '\f':
                            lrjVar = (lrj) ksy.O(parcel, i6, lrj.CREATOR);
                            break;
                        default:
                            ksy.aa(parcel, i6);
                            break;
                    }
                }
                ksy.Y(parcel, iK6);
                lqzVar = new FullWallet(strT25, strT26, lrkVar, strT27, lqzVar2, lqzVar3, strArrAg, userAddress, userAddress3, lrcVarArr, lrjVar);
                return lqzVar;
            case 6:
                int iK7 = ksy.K(parcel);
                String strT28 = null;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 2) {
                        strT10 = ksy.T(parcel, i7);
                    } else if (c5 == 3) {
                        strT28 = ksy.T(parcel, i7);
                    } else if (c5 != 4) {
                        ksy.aa(parcel, i7);
                    } else {
                        I7 = ksy.I(parcel, i7);
                    }
                }
                ksy.Y(parcel, iK7);
                return new lrc(strT10, strT28, I7);
            case 7:
                int iK8 = ksy.K(parcel);
                String strT29 = null;
                String strT30 = null;
                String[] strArrAg2 = null;
                String strT31 = null;
                lqz lqzVar4 = null;
                lqz lqzVar5 = null;
                lrd[] lrdVarArr = null;
                UserAddress userAddress4 = null;
                UserAddress userAddress5 = null;
                lrc[] lrcVarArr2 = null;
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 2:
                            strT29 = ksy.T(parcel, i8);
                            break;
                        case 3:
                            strT30 = ksy.T(parcel, i8);
                            break;
                        case 4:
                            strArrAg2 = ksy.ag(parcel, i8);
                            break;
                        case 5:
                            strT31 = ksy.T(parcel, i8);
                            break;
                        case 6:
                            lqzVar4 = (lqz) ksy.O(parcel, i8, lqz.CREATOR);
                            break;
                        case 7:
                            lqzVar5 = (lqz) ksy.O(parcel, i8, lqz.CREATOR);
                            break;
                        case '\b':
                            lrdVarArr = (lrd[]) ksy.af(parcel, i8, lrd.CREATOR);
                            break;
                        case '\t':
                            lrfVarArr = (lrf[]) ksy.af(parcel, i8, lrf.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) ksy.O(parcel, i8, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress5 = (UserAddress) ksy.O(parcel, i8, UserAddress.CREATOR);
                            break;
                        case '\f':
                            lrcVarArr2 = (lrc[]) ksy.af(parcel, i8, lrc.CREATOR);
                            break;
                        default:
                            ksy.aa(parcel, i8);
                            break;
                    }
                }
                ksy.Y(parcel, iK8);
                lqzVar = new MaskedWallet(strT29, strT30, strArrAg2, strT31, lqzVar4, lqzVar5, lrdVarArr, lrfVarArr, userAddress4, userAddress5, lrcVarArr2);
                return lqzVar;
            case 8:
                int iK9 = ksy.K(parcel);
                String strT32 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        I6 = ksy.I(parcel, i9);
                    } else if (c6 == 2) {
                        strT9 = ksy.T(parcel, i9);
                    } else if (c6 == 3) {
                        strT32 = ksy.T(parcel, i9);
                    } else if (c6 != 4) {
                        ksy.aa(parcel, i9);
                    } else {
                        commonWalletObject = (CommonWalletObject) ksy.O(parcel, i9, CommonWalletObject.CREATOR);
                    }
                }
                ksy.Y(parcel, iK9);
                return new lrf(I6, strT9, strT32, commonWalletObject);
            case 9:
                int iK10 = ksy.K(parcel);
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        ksy.aa(parcel, i10);
                    } else {
                        pendingIntent = (PendingIntent) ksy.O(parcel, i10, PendingIntent.CREATOR);
                    }
                }
                ksy.Y(parcel, iK10);
                return new lrg(pendingIntent);
            case 10:
                int iK11 = ksy.K(parcel);
                String strT33 = null;
                lra lraVar = null;
                UserAddress userAddress6 = null;
                lrj lrjVar2 = null;
                String strT34 = null;
                Bundle bundleM2 = null;
                String strT35 = null;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            strT33 = ksy.T(parcel, i11);
                            break;
                        case 2:
                            lraVar = (lra) ksy.O(parcel, i11, lra.CREATOR);
                            break;
                        case 3:
                            userAddress6 = (UserAddress) ksy.O(parcel, i11, UserAddress.CREATOR);
                            break;
                        case 4:
                            lrjVar2 = (lrj) ksy.O(parcel, i11, lrj.CREATOR);
                            break;
                        case 5:
                            strT34 = ksy.T(parcel, i11);
                            break;
                        case 6:
                            bundleM2 = ksy.M(parcel, i11);
                            break;
                        case 7:
                            strT35 = ksy.T(parcel, i11);
                            break;
                        case '\b':
                            bundleM = ksy.M(parcel, i11);
                            break;
                        default:
                            ksy.aa(parcel, i11);
                            break;
                    }
                }
                ksy.Y(parcel, iK11);
                lqzVar = new lrh(strT33, lraVar, userAddress6, lrjVar2, strT34, bundleM2, strT35, bundleM);
                return lqzVar;
            case 11:
                int iK12 = ksy.K(parcel);
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        ksy.aa(parcel, i12);
                    } else {
                        strT8 = ksy.T(parcel, i12);
                    }
                }
                ksy.Y(parcel, iK12);
                return new lri(strT8);
            case 12:
                int iK13 = ksy.K(parcel);
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 2) {
                        I5 = ksy.I(parcel, i13);
                    } else if (c7 != 3) {
                        ksy.aa(parcel, i13);
                    } else {
                        strT7 = ksy.T(parcel, i13);
                    }
                }
                ksy.Y(parcel, iK13);
                return new lrj(I5, strT7);
            case 13:
                int iK14 = ksy.K(parcel);
                int I14 = 0;
                String strT36 = null;
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 2) {
                        strT6 = ksy.T(parcel, i14);
                    } else if (c8 == 3) {
                        strT36 = ksy.T(parcel, i14);
                    } else if (c8 == 4) {
                        I4 = ksy.I(parcel, i14);
                    } else if (c8 != 5) {
                        ksy.aa(parcel, i14);
                    } else {
                        I14 = ksy.I(parcel, i14);
                    }
                }
                ksy.Y(parcel, iK14);
                return new lrk(strT6, strT36, I4, I14);
            case 14:
                int iK15 = ksy.K(parcel);
                Bundle bundleM3 = null;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 2) {
                        strT5 = ksy.T(parcel, i15);
                    } else if (c9 != 3) {
                        ksy.aa(parcel, i15);
                    } else {
                        bundleM3 = ksy.M(parcel, i15);
                    }
                }
                ksy.Y(parcel, iK15);
                return new WebPaymentData(strT5, bundleM3);
            case 15:
                int iK16 = ksy.K(parcel);
                int I15 = 0;
                boolean zAb4 = false;
                String strT37 = null;
                String strT38 = null;
                String strT39 = null;
                String strT40 = null;
                String strT41 = null;
                String strT42 = null;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strT37 = ksy.T(parcel, i16);
                            break;
                        case 2:
                            I15 = ksy.I(parcel, i16);
                            break;
                        case 3:
                            zAb4 = ksy.ab(parcel, i16);
                            break;
                        case 4:
                            strT38 = ksy.T(parcel, i16);
                            break;
                        case 5:
                            strT39 = ksy.T(parcel, i16);
                            break;
                        case 6:
                            strT40 = ksy.T(parcel, i16);
                            break;
                        case 7:
                            strT41 = ksy.T(parcel, i16);
                            break;
                        case '\b':
                            strT4 = ksy.T(parcel, i16);
                            break;
                        case '\t':
                            strT42 = ksy.T(parcel, i16);
                            break;
                        default:
                            ksy.aa(parcel, i16);
                            break;
                    }
                }
                ksy.Y(parcel, iK16);
                lqzVar = new lrp(strT37, I15, zAb4, strT38, strT39, strT40, strT41, strT4, strT42);
                return lqzVar;
            case 16:
                int iK17 = ksy.K(parcel);
                int I16 = 0;
                int I17 = 0;
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 1) {
                        I3 = ksy.I(parcel, i17);
                    } else if (c10 == 2) {
                        strT3 = ksy.T(parcel, i17);
                    } else if (c10 == 3) {
                        I16 = ksy.I(parcel, i17);
                    } else if (c10 != 4) {
                        ksy.aa(parcel, i17);
                    } else {
                        I17 = ksy.I(parcel, i17);
                    }
                }
                ksy.Y(parcel, iK17);
                return new ExitResult(I3, strT3, I16, I17);
            case 17:
                int iK18 = ksy.K(parcel);
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 2) {
                        ksy.aa(parcel, i18);
                    } else {
                        bArrAc2 = ksy.ac(parcel, i18);
                    }
                }
                ksy.Y(parcel, iK18);
                return new lrs(bArrAc2);
            case 18:
                int iK19 = ksy.K(parcel);
                while (parcel.dataPosition() < iK19) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 2) {
                        lrxVar = (lrx) ksy.O(parcel, i19, lrx.CREATOR);
                    } else if (c11 == 3) {
                        zAb = ksy.ab(parcel, i19);
                    } else if (c11 != 4) {
                        ksy.aa(parcel, i19);
                    } else {
                        I = ksy.I(parcel, i19);
                    }
                }
                ksy.Y(parcel, iK19);
                return new lrt(lrxVar, zAb, I);
            case 19:
                int iK20 = ksy.K(parcel);
                while (parcel.dataPosition() < iK20) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 2) {
                        ksy.aa(parcel, i20);
                    } else {
                        bArrAc = ksy.ac(parcel, i20);
                    }
                }
                ksy.Y(parcel, iK20);
                return new lru(bArrAc);
            default:
                int iK21 = ksy.K(parcel);
                String strT43 = null;
                while (parcel.dataPosition() < iK21) {
                    int i21 = parcel.readInt();
                    char c12 = (char) i21;
                    if (c12 == 1) {
                        strT2 = ksy.T(parcel, i21);
                    } else if (c12 == 2) {
                        strT43 = ksy.T(parcel, i21);
                    } else if (c12 != 3) {
                        ksy.aa(parcel, i21);
                    } else {
                        jL = ksy.L(parcel, i21);
                    }
                }
                ksy.Y(parcel, iK21);
                return new LoaderConfig(strT2, strT43, jL);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new lqt[i];
            case 1:
                return new lqp[i];
            case 2:
                return new lqy[i];
            case 3:
                return new lqz[i];
            case 4:
                return new lra[i];
            case 5:
                return new FullWallet[i];
            case 6:
                return new lrc[i];
            case 7:
                return new MaskedWallet[i];
            case 8:
                return new lrf[i];
            case 9:
                return new lrg[i];
            case 10:
                return new lrh[i];
            case 11:
                return new lri[i];
            case 12:
                return new lrj[i];
            case 13:
                return new lrk[i];
            case 14:
                return new WebPaymentData[i];
            case 15:
                return new lrp[i];
            case 16:
                return new ExitResult[i];
            case 17:
                return new lrs[i];
            case 18:
                return new lrt[i];
            case 19:
                return new lru[i];
            default:
                return new LoaderConfig[i];
        }
    }
}

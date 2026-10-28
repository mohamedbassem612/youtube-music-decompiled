package defpackage;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.database.CursorWindow;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpm implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public kpm(int i) {
        this.$cid = i;
    }

    public static final ErrorReport a(Parcel parcel) {
        int iK = ksy.K(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        String strT9 = null;
        String strT10 = null;
        String strT11 = null;
        String strT12 = null;
        String strT13 = null;
        String[] strArrAg = null;
        String[] strArrAg2 = null;
        String[] strArrAg3 = null;
        String strT14 = null;
        String strT15 = null;
        byte[] bArrAc = null;
        String strT16 = null;
        String strT17 = null;
        String strT18 = null;
        Bundle bundleM = null;
        String strT19 = null;
        String strT20 = null;
        String strT21 = null;
        String strT22 = null;
        String strT23 = null;
        String strT24 = null;
        String strT25 = null;
        String strT26 = null;
        String strT27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strT28 = null;
        kvp[] kvpVarArr = null;
        String[] strArrAg4 = null;
        String strT29 = null;
        kvv kvvVar = null;
        kvq kvqVar = null;
        String strT30 = null;
        Bundle bundleM2 = null;
        ArrayList arrayListX = null;
        Bitmap bitmap = null;
        String strT31 = null;
        ArrayList arrayListW = null;
        String[] strArrAg5 = null;
        String[] strArrAg6 = null;
        String[] strArrAg7 = null;
        String strT32 = null;
        kvf kvfVar = null;
        kvr[] kvrVarArr = null;
        String strT33 = null;
        int I = 0;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        int I6 = 0;
        boolean zAb = false;
        int I7 = 0;
        int I8 = 0;
        boolean zAb2 = false;
        int I9 = 0;
        boolean zAb3 = false;
        boolean zAb4 = false;
        boolean zAb5 = false;
        int I10 = 0;
        int I11 = 0;
        boolean zAb6 = false;
        boolean zAb7 = false;
        ApplicationErrorReport applicationErrorReport = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            ApplicationErrorReport applicationErrorReport2 = applicationErrorReport;
            switch ((char) i) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) ksy.O(parcel, i, ApplicationErrorReport.CREATOR);
                    continue;
                case 3:
                    strT = ksy.T(parcel, i);
                    break;
                case 4:
                    I = ksy.I(parcel, i);
                    break;
                case 5:
                    strT2 = ksy.T(parcel, i);
                    break;
                case 6:
                    strT3 = ksy.T(parcel, i);
                    break;
                case 7:
                    strT4 = ksy.T(parcel, i);
                    break;
                case '\b':
                    strT5 = ksy.T(parcel, i);
                    break;
                case '\t':
                    strT6 = ksy.T(parcel, i);
                    break;
                case '\n':
                    strT7 = ksy.T(parcel, i);
                    break;
                case 11:
                    strT8 = ksy.T(parcel, i);
                    break;
                case '\f':
                    I2 = ksy.I(parcel, i);
                    break;
                case '\r':
                    strT9 = ksy.T(parcel, i);
                    break;
                case 14:
                    strT10 = ksy.T(parcel, i);
                    break;
                case 15:
                    strT11 = ksy.T(parcel, i);
                    break;
                case 16:
                    strT12 = ksy.T(parcel, i);
                    break;
                case 17:
                    strT13 = ksy.T(parcel, i);
                    break;
                case 18:
                    strArrAg = ksy.ag(parcel, i);
                    break;
                case 19:
                    strArrAg2 = ksy.ag(parcel, i);
                    break;
                case 20:
                    strArrAg3 = ksy.ag(parcel, i);
                    break;
                case 21:
                    strT14 = ksy.T(parcel, i);
                    break;
                case 22:
                    strT15 = ksy.T(parcel, i);
                    break;
                case 23:
                    bArrAc = ksy.ac(parcel, i);
                    break;
                case 24:
                    I3 = ksy.I(parcel, i);
                    break;
                case 25:
                    I4 = ksy.I(parcel, i);
                    break;
                case 26:
                    I5 = ksy.I(parcel, i);
                    break;
                case 27:
                    I6 = ksy.I(parcel, i);
                    break;
                case 28:
                    strT16 = ksy.T(parcel, i);
                    break;
                case 29:
                    strT17 = ksy.T(parcel, i);
                    break;
                case 30:
                    strT18 = ksy.T(parcel, i);
                    break;
                case 31:
                    bundleM = ksy.M(parcel, i);
                    break;
                case ' ':
                    zAb = ksy.ab(parcel, i);
                    break;
                case '!':
                    I7 = ksy.I(parcel, i);
                    break;
                case '\"':
                    I8 = ksy.I(parcel, i);
                    break;
                case '#':
                    zAb2 = ksy.ab(parcel, i);
                    break;
                case '$':
                    strT19 = ksy.T(parcel, i);
                    break;
                case '%':
                    strT20 = ksy.T(parcel, i);
                    break;
                case '&':
                    I9 = ksy.I(parcel, i);
                    break;
                case '\'':
                    strT21 = ksy.T(parcel, i);
                    break;
                case '(':
                    strT22 = ksy.T(parcel, i);
                    break;
                case ')':
                    strT23 = ksy.T(parcel, i);
                    break;
                case '*':
                    strT24 = ksy.T(parcel, i);
                    break;
                case '+':
                    strT25 = ksy.T(parcel, i);
                    break;
                case ',':
                    strT26 = ksy.T(parcel, i);
                    break;
                case '-':
                    strT27 = ksy.T(parcel, i);
                    break;
                case '.':
                    bitmapTeleporter = (BitmapTeleporter) ksy.O(parcel, i, BitmapTeleporter.CREATOR);
                    break;
                case '/':
                    strT28 = ksy.T(parcel, i);
                    break;
                case '0':
                    kvpVarArr = (kvp[]) ksy.af(parcel, i, kvp.CREATOR);
                    break;
                case '1':
                    strArrAg4 = ksy.ag(parcel, i);
                    break;
                case '2':
                    zAb3 = ksy.ab(parcel, i);
                    break;
                case '3':
                    strT29 = ksy.T(parcel, i);
                    break;
                case '4':
                    kvvVar = (kvv) ksy.O(parcel, i, kvv.CREATOR);
                    break;
                case '5':
                    kvqVar = (kvq) ksy.O(parcel, i, kvq.CREATOR);
                    break;
                case '6':
                    strT30 = ksy.T(parcel, i);
                    break;
                case '7':
                    zAb4 = ksy.ab(parcel, i);
                    break;
                case '8':
                    bundleM2 = ksy.M(parcel, i);
                    break;
                case '9':
                    arrayListX = ksy.X(parcel, i, RectF.CREATOR);
                    break;
                case ':':
                    zAb5 = ksy.ab(parcel, i);
                    break;
                case ';':
                    bitmap = (Bitmap) ksy.O(parcel, i, Bitmap.CREATOR);
                    break;
                case '<':
                    strT31 = ksy.T(parcel, i);
                    break;
                case '=':
                    arrayListW = ksy.W(parcel, i);
                    break;
                case '>':
                    I10 = ksy.I(parcel, i);
                    break;
                case '?':
                    I11 = ksy.I(parcel, i);
                    break;
                case '@':
                    strArrAg5 = ksy.ag(parcel, i);
                    break;
                case 'A':
                    strArrAg6 = ksy.ag(parcel, i);
                    break;
                case 'B':
                    strArrAg7 = ksy.ag(parcel, i);
                    break;
                case 'C':
                    zAb6 = ksy.ab(parcel, i);
                    break;
                case 'D':
                    zAb7 = ksy.ab(parcel, i);
                    break;
                case 'E':
                    strT32 = ksy.T(parcel, i);
                    break;
                case 'F':
                    kvfVar = (kvf) ksy.O(parcel, i, kvf.CREATOR);
                    break;
                case 'G':
                    kvrVarArr = (kvr[]) ksy.af(parcel, i, kvr.CREATOR);
                    break;
                case 'H':
                    strT33 = ksy.T(parcel, i);
                    break;
                default:
                    ksy.aa(parcel, i);
                    break;
            }
            applicationErrorReport = applicationErrorReport2;
        }
        ksy.Y(parcel, iK);
        return new ErrorReport(applicationErrorReport, strT, I, strT2, strT3, strT4, strT5, strT6, strT7, strT8, I2, strT9, strT10, strT11, strT12, strT13, strArrAg, strArrAg2, strArrAg3, strT14, strT15, bArrAc, I3, I4, I5, I6, strT16, strT17, strT18, bundleM, zAb, I7, I8, zAb2, strT19, strT20, I9, strT21, strT22, strT23, strT24, strT25, strT26, strT27, bitmapTeleporter, strT28, kvpVarArr, strArrAg4, zAb3, strT29, kvvVar, kvqVar, strT30, zAb4, bundleM2, arrayListX, zAb5, bitmap, strT31, arrayListW, I10, I11, strArrAg5, strArrAg6, strArrAg7, zAb6, zAb7, strT32, kvfVar, kvrVarArr, strT33);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object kqaVar;
        Object kqjVar;
        long jL = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Boolean boolP = null;
        byte[] bArrAc = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Bundle bundleM = null;
        Account account = null;
        ArrayList arrayListX = null;
        String strT = null;
        Uri uri = null;
        int I = 0;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                int I2 = 0;
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        I = ksy.I(parcel, i);
                    } else if (c == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ksy.O(parcel, i, ParcelFileDescriptor.CREATOR);
                    } else if (c != 3) {
                        ksy.aa(parcel, i);
                    } else {
                        I2 = ksy.I(parcel, i);
                    }
                }
                ksy.Y(parcel, iK);
                return new BitmapTeleporter(I, parcelFileDescriptor, I2);
            case 1:
                int iK2 = ksy.K(parcel);
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        ksy.aa(parcel, i2);
                    } else {
                        jL = ksy.L(parcel, i2);
                    }
                }
                ksy.Y(parcel, iK2);
                return new knk(jL);
            case 2:
                int iK3 = ksy.K(parcel);
                String[] strArrAg = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleM2 = null;
                int I3 = 0;
                int I4 = 0;
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        strArrAg = ksy.ag(parcel, i3);
                    } else if (c2 == 2) {
                        cursorWindowArr = (CursorWindow[]) ksy.af(parcel, i3, CursorWindow.CREATOR);
                    } else if (c2 == 3) {
                        I4 = ksy.I(parcel, i3);
                    } else if (c2 == 4) {
                        bundleM2 = ksy.M(parcel, i3);
                    } else if (c2 != 1000) {
                        ksy.aa(parcel, i3);
                    } else {
                        I3 = ksy.I(parcel, i3);
                    }
                }
                ksy.Y(parcel, iK3);
                DataHolder dataHolder = new DataHolder(I3, strArrAg, cursorWindowArr, I4, bundleM2);
                dataHolder.c = new Bundle();
                int i4 = 0;
                while (true) {
                    String[] strArr = dataHolder.b;
                    if (i4 >= strArr.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.g = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        while (I < cursorWindowArr2.length) {
                            dataHolder.g[I] = numRows;
                            numRows += cursorWindowArr2[I].getNumRows() - (numRows - cursorWindowArr2[I].getStartPosition());
                            I++;
                        }
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr[i4], i4);
                    i4++;
                }
                break;
            case 3:
                int iK4 = ksy.K(parcel);
                int I5 = 0;
                int I6 = 0;
                while (parcel.dataPosition() < iK4) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        I = ksy.I(parcel, i5);
                    } else if (c3 == 2) {
                        uri = (Uri) ksy.O(parcel, i5, Uri.CREATOR);
                    } else if (c3 == 3) {
                        I5 = ksy.I(parcel, i5);
                    } else if (c3 != 4) {
                        ksy.aa(parcel, i5);
                    } else {
                        I6 = ksy.I(parcel, i5);
                    }
                }
                ksy.Y(parcel, iK4);
                return new kpo(I, uri, I5, I6);
            case 4:
                return new BinderWrapper(parcel);
            case 5:
                int iK5 = ksy.K(parcel);
                long jL2 = 0;
                String strT2 = null;
                int I7 = 0;
                boolean zAb = false;
                while (parcel.dataPosition() < iK5) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        I = ksy.I(parcel, i6);
                    } else if (c4 == 2) {
                        strT2 = ksy.T(parcel, i6);
                    } else if (c4 == 3) {
                        jL2 = ksy.L(parcel, i6);
                    } else if (c4 == 4) {
                        I7 = ksy.I(parcel, i6);
                    } else if (c4 != 5) {
                        ksy.aa(parcel, i6);
                    } else {
                        zAb = ksy.ab(parcel, i6);
                    }
                }
                ksy.Y(parcel, iK5);
                kqaVar = new kqa(I, strT2, jL2, I7, zAb);
                break;
            case 6:
                int iK6 = ksy.K(parcel);
                int I8 = 1;
                int I9 = 0;
                while (parcel.dataPosition() < iK6) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        I = ksy.I(parcel, i7);
                    } else if (c5 == 2) {
                        strT = ksy.T(parcel, i7);
                    } else if (c5 == 3) {
                        I9 = ksy.I(parcel, i7);
                    } else if (c5 != 4) {
                        ksy.aa(parcel, i7);
                    } else {
                        I8 = ksy.I(parcel, i7);
                    }
                }
                ksy.Y(parcel, iK6);
                return new kqf(I, strT, I9, I8);
            case 7:
                int iK7 = ksy.K(parcel);
                while (parcel.dataPosition() < iK7) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        ksy.aa(parcel, i8);
                    } else {
                        arrayListX = ksy.X(parcel, i8, kqf.CREATOR);
                    }
                }
                ksy.Y(parcel, iK7);
                return new kqg(arrayListX);
            case 8:
                int iK8 = ksy.K(parcel);
                krt krtVar = null;
                int[] iArrAd = null;
                int[] iArrAd2 = null;
                boolean zAb2 = false;
                boolean zAb3 = false;
                int I10 = 0;
                while (parcel.dataPosition() < iK8) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            krtVar = (krt) ksy.O(parcel, i9, krt.CREATOR);
                            break;
                        case 2:
                            zAb2 = ksy.ab(parcel, i9);
                            break;
                        case 3:
                            zAb3 = ksy.ab(parcel, i9);
                            break;
                        case 4:
                            iArrAd = ksy.ad(parcel, i9);
                            break;
                        case 5:
                            I10 = ksy.I(parcel, i9);
                            break;
                        case 6:
                            iArrAd2 = ksy.ad(parcel, i9);
                            break;
                        default:
                            ksy.aa(parcel, i9);
                            break;
                    }
                }
                ksy.Y(parcel, iK8);
                kqjVar = new kqj(krtVar, zAb2, zAb3, iArrAd, I10, iArrAd2);
                return kqjVar;
            case 9:
                int iK9 = ksy.K(parcel);
                while (true) {
                    SparseArray sparseArray = null;
                    while (true) {
                        if (parcel.dataPosition() >= iK9) {
                            ksy.Y(parcel, iK9);
                            return new kqk(sparseArray);
                        }
                        int i10 = parcel.readInt();
                        if (((char) i10) != 1) {
                            ksy.aa(parcel, i10);
                        } else {
                            Parcelable.Creator creator = kyt.CREATOR;
                            int iJ = ksy.J(parcel, i10);
                            int iDataPosition = parcel.dataPosition();
                            if (iJ != 0) {
                                int i11 = parcel.readInt();
                                SparseArray sparseArray2 = new SparseArray();
                                for (int i12 = 0; i12 < i11; i12++) {
                                    sparseArray2.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
                                }
                                parcel.setDataPosition(iDataPosition + iJ);
                                sparseArray = sparseArray2;
                            }
                        }
                    }
                }
                break;
            case 10:
                int iK10 = ksy.K(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int I11 = 0;
                while (parcel.dataPosition() < iK10) {
                    int i13 = parcel.readInt();
                    char c6 = (char) i13;
                    if (c6 == 1) {
                        I = ksy.I(parcel, i13);
                    } else if (c6 == 2) {
                        account = (Account) ksy.O(parcel, i13, Account.CREATOR);
                    } else if (c6 == 3) {
                        I11 = ksy.I(parcel, i13);
                    } else if (c6 != 4) {
                        ksy.aa(parcel, i13);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) ksy.O(parcel, i13, GoogleSignInAccount.CREATOR);
                    }
                }
                ksy.Y(parcel, iK10);
                return new krq(I, account, I11, googleSignInAccount);
            case 11:
                int iK11 = ksy.K(parcel);
                IBinder iBinderN = null;
                klo kloVar = null;
                boolean zAb4 = false;
                boolean zAb5 = false;
                while (parcel.dataPosition() < iK11) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        I = ksy.I(parcel, i14);
                    } else if (c7 == 2) {
                        iBinderN = ksy.N(parcel, i14);
                    } else if (c7 == 3) {
                        kloVar = (klo) ksy.O(parcel, i14, klo.CREATOR);
                    } else if (c7 == 4) {
                        zAb4 = ksy.ab(parcel, i14);
                    } else if (c7 != 5) {
                        ksy.aa(parcel, i14);
                    } else {
                        zAb5 = ksy.ab(parcel, i14);
                    }
                }
                ksy.Y(parcel, iK11);
                kqaVar = new krr(I, iBinderN, kloVar, zAb4, zAb5);
                break;
            case 12:
                int iK12 = ksy.K(parcel);
                while (parcel.dataPosition() < iK12) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        ksy.aa(parcel, i15);
                    } else {
                        bundleM = ksy.M(parcel, i15);
                    }
                }
                ksy.Y(parcel, iK12);
                return new kth(bundleM);
            case 13:
                ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor) parcel.readParcelable(ParcelFileDescriptor.class.getClassLoader());
                Parcelable parcelable = parcel.readParcelable(getClass().getClassLoader());
                ahno.F((parcelFileDescriptor3 == null) == (parcelable == null));
                kqjVar = new kti(parcelFileDescriptor3, parcelable);
                return kqjVar;
            case 14:
                return a(parcel);
            case 15:
                int iK13 = ksy.K(parcel);
                String strT3 = null;
                String strT4 = null;
                while (parcel.dataPosition() < iK13) {
                    int i16 = parcel.readInt();
                    char c8 = (char) i16;
                    if (c8 == 2) {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) ksy.O(parcel, i16, ParcelFileDescriptor.CREATOR);
                    } else if (c8 == 3) {
                        strT3 = ksy.T(parcel, i16);
                    } else if (c8 != 4) {
                        ksy.aa(parcel, i16);
                    } else {
                        strT4 = ksy.T(parcel, i16);
                    }
                }
                ksy.Y(parcel, iK13);
                return new kvp(parcelFileDescriptor2, strT3, strT4);
            case 16:
                int iK14 = ksy.K(parcel);
                String strT5 = null;
                kvt[] kvtVarArr = null;
                boolean zAb6 = false;
                boolean zAb7 = false;
                boolean zAb8 = false;
                boolean zAb9 = false;
                boolean zAb10 = false;
                while (parcel.dataPosition() < iK14) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            strT5 = ksy.T(parcel, i17);
                            break;
                        case 3:
                            zAb6 = ksy.ab(parcel, i17);
                            break;
                        case 4:
                            zAb7 = ksy.ab(parcel, i17);
                            break;
                        case 5:
                            zAb8 = ksy.ab(parcel, i17);
                            break;
                        case 6:
                            zAb9 = ksy.ab(parcel, i17);
                            break;
                        case 7:
                            kvtVarArr = (kvt[]) ksy.af(parcel, i17, kvt.CREATOR);
                            break;
                        case '\b':
                            zAb10 = ksy.ab(parcel, i17);
                            break;
                        default:
                            ksy.aa(parcel, i17);
                            break;
                    }
                }
                ksy.Y(parcel, iK14);
                kqjVar = new kvq(strT5, zAb6, zAb7, zAb8, zAb9, kvtVarArr, zAb10);
                return kqjVar;
            case 17:
                int iK15 = ksy.K(parcel);
                int I12 = 0;
                while (parcel.dataPosition() < iK15) {
                    int i18 = parcel.readInt();
                    char c9 = (char) i18;
                    if (c9 == 2) {
                        I = ksy.I(parcel, i18);
                    } else if (c9 != 3) {
                        ksy.aa(parcel, i18);
                    } else {
                        I12 = ksy.I(parcel, i18);
                    }
                }
                ksy.Y(parcel, iK15);
                return new kvv(I, I12);
            case 18:
                int iK16 = ksy.K(parcel);
                String strT6 = null;
                String strT7 = null;
                int I13 = 0;
                int I14 = 0;
                while (parcel.dataPosition() < iK16) {
                    int i19 = parcel.readInt();
                    char c10 = (char) i19;
                    if (c10 == 1) {
                        I = ksy.I(parcel, i19);
                    } else if (c10 == 2) {
                        I13 = ksy.I(parcel, i19);
                    } else if (c10 == 3) {
                        strT6 = ksy.T(parcel, i19);
                    } else if (c10 == 4) {
                        strT7 = ksy.T(parcel, i19);
                    } else if (c10 != 5) {
                        ksy.aa(parcel, i19);
                    } else {
                        I14 = ksy.I(parcel, i19);
                    }
                }
                ksy.Y(parcel, iK16);
                kqaVar = new kwr(I, I13, I14, strT6, strT7);
                break;
            case 19:
                int iK17 = ksy.K(parcel);
                int I15 = 0;
                while (parcel.dataPosition() < iK17) {
                    int i20 = parcel.readInt();
                    char c11 = (char) i20;
                    if (c11 == 1) {
                        I = ksy.I(parcel, i20);
                    } else if (c11 == 2) {
                        bArrAc = ksy.ac(parcel, i20);
                    } else if (c11 != 3) {
                        ksy.aa(parcel, i20);
                    } else {
                        I15 = ksy.I(parcel, i20);
                    }
                }
                ksy.Y(parcel, iK17);
                return new kws(I, bArrAc, I15);
            default:
                int iK18 = ksy.K(parcel);
                ArrayList arrayListW = null;
                ArrayList arrayListV = null;
                ArrayList arrayListW2 = null;
                ArrayList arrayListV2 = null;
                byte[][] bArrAh = null;
                int I16 = 0;
                int I17 = 0;
                while (parcel.dataPosition() < iK18) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            I16 = ksy.I(parcel, i21);
                            break;
                        case 3:
                            I17 = ksy.I(parcel, i21);
                            break;
                        case 4:
                            arrayListW = ksy.W(parcel, i21);
                            break;
                        case 5:
                            arrayListV = ksy.V(parcel, i21);
                            break;
                        case 6:
                            arrayListW2 = ksy.W(parcel, i21);
                            break;
                        case 7:
                            arrayListV2 = ksy.V(parcel, i21);
                            break;
                        case '\b':
                            bArrAh = ksy.ah(parcel, i21);
                            break;
                        case '\t':
                            boolP = ksy.P(parcel, i21);
                            break;
                        default:
                            ksy.aa(parcel, i21);
                            break;
                    }
                }
                ksy.Y(parcel, iK18);
                kqjVar = new FRDProductSpecificDataEntry(I16, I17, arrayListW, arrayListV, arrayListW2, arrayListV2, bArrAh, boolP.booleanValue());
                return kqjVar;
        }
        return kqaVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new BitmapTeleporter[i];
            case 1:
                return new knk[i];
            case 2:
                return new DataHolder[i];
            case 3:
                return new kpo[i];
            case 4:
                return new BinderWrapper[i];
            case 5:
                return new kqa[i];
            case 6:
                return new kqf[i];
            case 7:
                return new kqg[i];
            case 8:
                return new kqj[i];
            case 9:
                return new kqk[i];
            case 10:
                return new krq[i];
            case 11:
                return new krr[i];
            case 12:
                return new kth[i];
            case 13:
                return new kti[i];
            case 14:
                return new ErrorReport[i];
            case 15:
                return new kvp[i];
            case 16:
                return new kvq[i];
            case 17:
                return new kvv[i];
            case 18:
                return new kwr[i];
            case 19:
                return new kws[i];
            default:
                return new FRDProductSpecificDataEntry[i];
        }
    }
}

package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kxb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        int I = 0;
        String strT = null;
        Account account = null;
        Bundle bundleM = null;
        String strT2 = null;
        String strT3 = null;
        Bitmap bitmap = null;
        ArrayList arrayListW = null;
        Bundle bundleM2 = null;
        Bitmap bitmap2 = null;
        byte[] bArrAc = null;
        String strT4 = null;
        Uri uri = null;
        ArrayList arrayListX = null;
        kvv kvvVar = null;
        ArrayList arrayListX2 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String strT5 = null;
        String strT6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayListX3 = null;
        String strT7 = null;
        ArrayList arrayListX4 = null;
        String strT8 = null;
        Intent intent = null;
        ArrayList arrayListW2 = null;
        boolean zAb = false;
        boolean zAb2 = false;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        boolean zAb3 = false;
        int I5 = 0;
        int I6 = 0;
        boolean zAb4 = false;
        boolean zAb5 = false;
        int I7 = 0;
        boolean zAb6 = false;
        boolean zAb7 = false;
        boolean zAb8 = false;
        int I8 = 0;
        int I9 = 0;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            int i2 = I;
            switch ((char) i) {
                case 1:
                    I = ksy.I(parcel, i);
                    continue;
                case 2:
                    strT = ksy.T(parcel, i);
                    break;
                case 3:
                    account = (Account) ksy.O(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    bundleM = ksy.M(parcel, i);
                    break;
                case 5:
                    zAb = ksy.ab(parcel, i);
                    break;
                case 6:
                    zAb2 = ksy.ab(parcel, i);
                    break;
                case 7:
                    arrayListW = ksy.W(parcel, i);
                    break;
                case '\b':
                case '\t':
                case '\f':
                case '\r':
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    ksy.aa(parcel, i);
                    break;
                case '\n':
                    bundleM2 = ksy.M(parcel, i);
                    break;
                case 11:
                    bitmap2 = (Bitmap) ksy.O(parcel, i, Bitmap.CREATOR);
                    break;
                case 14:
                    strT4 = ksy.T(parcel, i);
                    break;
                case 15:
                    uri = (Uri) ksy.O(parcel, i, Uri.CREATOR);
                    break;
                case 16:
                    arrayListX = ksy.X(parcel, i, kxw.CREATOR);
                    break;
                case 17:
                    I4 = ksy.I(parcel, i);
                    break;
                case 18:
                    arrayListX2 = ksy.X(parcel, i, kxf.CREATOR);
                    break;
                case 19:
                    bArrAc = ksy.ac(parcel, i);
                    break;
                case 20:
                    I2 = ksy.I(parcel, i);
                    break;
                case 21:
                    I3 = ksy.I(parcel, i);
                    break;
                case 22:
                    zAb3 = ksy.ab(parcel, i);
                    break;
                case 23:
                    errorReport = (ErrorReport) ksy.O(parcel, i, ErrorReport.CREATOR);
                    break;
                case 25:
                    kvvVar = (kvv) ksy.O(parcel, i, kvv.CREATOR);
                    break;
                case 28:
                    strT2 = ksy.T(parcel, i);
                    break;
                case 31:
                    togglingData = (TogglingData) ksy.O(parcel, i, TogglingData.CREATOR);
                    break;
                case ' ':
                    I5 = ksy.I(parcel, i);
                    break;
                case '!':
                    pendingIntent = (PendingIntent) ksy.O(parcel, i, PendingIntent.CREATOR);
                    break;
                case '\"':
                    strT3 = ksy.T(parcel, i);
                    break;
                case '#':
                    bitmap = (Bitmap) ksy.O(parcel, i, Bitmap.CREATOR);
                    break;
                case '$':
                    I6 = ksy.I(parcel, i);
                    break;
                case '%':
                    zAb4 = ksy.ab(parcel, i);
                    break;
                case '&':
                    zAb5 = ksy.ab(parcel, i);
                    break;
                case '\'':
                    I7 = ksy.I(parcel, i);
                    break;
                case '(':
                    strT5 = ksy.T(parcel, i);
                    break;
                case ')':
                    zAb6 = ksy.ab(parcel, i);
                    break;
                case '*':
                    strT6 = ksy.T(parcel, i);
                    break;
                case '+':
                    zAb7 = ksy.ab(parcel, i);
                    break;
                case ',':
                    nD4CSettings = (ND4CSettings) ksy.O(parcel, i, ND4CSettings.CREATOR);
                    break;
                case '-':
                    zAb8 = ksy.ab(parcel, i);
                    break;
                case '.':
                    arrayListX3 = ksy.X(parcel, i, FRDProductSpecificDataEntry.CREATOR);
                    break;
                case '/':
                    strT7 = ksy.T(parcel, i);
                    break;
                case '0':
                    I8 = ksy.I(parcel, i);
                    break;
                case '1':
                    I9 = ksy.I(parcel, i);
                    break;
                case '2':
                    arrayListX4 = ksy.X(parcel, i, TrailsInteraction.CREATOR);
                    break;
                case '3':
                    strT8 = ksy.T(parcel, i);
                    break;
                case '4':
                    intent = (Intent) ksy.O(parcel, i, Intent.CREATOR);
                    break;
                case '5':
                    arrayListW2 = ksy.W(parcel, i);
                    break;
            }
            I = i2;
        }
        ksy.Y(parcel, iK);
        return new GoogleHelp(I, strT, account, bundleM, strT2, strT3, bitmap, zAb, zAb2, arrayListW, bundleM2, bitmap2, bArrAc, I2, I3, strT4, uri, arrayListX, I4, kvvVar, arrayListX2, zAb3, errorReport, togglingData, I5, pendingIntent, I6, zAb4, zAb5, I7, strT5, zAb6, strT6, zAb7, nD4CSettings, zAb8, arrayListX3, strT7, I8, I9, arrayListX4, strT8, intent, arrayListW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}

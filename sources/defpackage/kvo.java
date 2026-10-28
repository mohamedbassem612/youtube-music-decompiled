package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvo implements Parcelable.Creator {
    public static void a(kvn kvnVar, Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, kvnVar.a);
        ksy.p(parcel, 3, kvnVar.b);
        ksy.B(parcel, 5, kvnVar.c);
        ksy.A(parcel, 6, kvnVar.d, i);
        ksy.B(parcel, 7, kvnVar.e);
        ksy.A(parcel, 8, kvnVar.f, i);
        ksy.B(parcel, 9, kvnVar.g);
        ksy.F(parcel, 10, kvnVar.h);
        ksy.i(parcel, 11, kvnVar.i);
        ksy.A(parcel, 12, kvnVar.j, i);
        ksy.A(parcel, 13, kvnVar.k, i);
        ksy.i(parcel, 14, kvnVar.l);
        ksy.A(parcel, 15, kvnVar.m, i);
        ksy.B(parcel, 16, kvnVar.n);
        ksy.i(parcel, 17, kvnVar.o);
        ksy.m(parcel, 18, kvnVar.p);
        ksy.i(parcel, 19, kvnVar.q);
        ksy.B(parcel, 20, kvnVar.r);
        ksy.A(parcel, 21, kvnVar.s, i);
        ksy.B(parcel, 22, kvnVar.t);
        ksy.h(parcel, iG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = ksy.K(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String strT = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strT2 = null;
        ArrayList arrayListX = null;
        kvv kvvVar = null;
        kvq kvqVar = null;
        Bitmap bitmap = null;
        String strT3 = null;
        String strT4 = null;
        kvf kvfVar = null;
        String strT5 = null;
        boolean zAb = false;
        boolean zAb2 = false;
        boolean zAb3 = false;
        boolean zAb4 = false;
        long jL = 0;
        String strT6 = null;
        Bundle bundleM = null;
        String strT7 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            String str = strT6;
            switch ((char) i) {
                case 2:
                    strT6 = ksy.T(parcel, i);
                    continue;
                case 3:
                    strT6 = str;
                    bundleM = ksy.M(parcel, i);
                    continue;
                case 4:
                default:
                    ksy.aa(parcel, i);
                    break;
                case 5:
                    strT6 = str;
                    strT7 = ksy.T(parcel, i);
                    continue;
                case 6:
                    strT6 = str;
                    applicationErrorReport = (ApplicationErrorReport) ksy.O(parcel, i, ApplicationErrorReport.CREATOR);
                    continue;
                case 7:
                    strT6 = str;
                    strT = ksy.T(parcel, i);
                    continue;
                case '\b':
                    strT6 = str;
                    bitmapTeleporter = (BitmapTeleporter) ksy.O(parcel, i, BitmapTeleporter.CREATOR);
                    continue;
                case '\t':
                    strT6 = str;
                    strT2 = ksy.T(parcel, i);
                    continue;
                case '\n':
                    strT6 = str;
                    arrayListX = ksy.X(parcel, i, kvp.CREATOR);
                    continue;
                case 11:
                    strT6 = str;
                    zAb = ksy.ab(parcel, i);
                    continue;
                case '\f':
                    strT6 = str;
                    kvvVar = (kvv) ksy.O(parcel, i, kvv.CREATOR);
                    continue;
                case '\r':
                    strT6 = str;
                    kvqVar = (kvq) ksy.O(parcel, i, kvq.CREATOR);
                    continue;
                case 14:
                    strT6 = str;
                    zAb2 = ksy.ab(parcel, i);
                    continue;
                case 15:
                    strT6 = str;
                    bitmap = (Bitmap) ksy.O(parcel, i, Bitmap.CREATOR);
                    continue;
                case 16:
                    strT6 = str;
                    strT3 = ksy.T(parcel, i);
                    continue;
                case 17:
                    strT6 = str;
                    zAb3 = ksy.ab(parcel, i);
                    continue;
                case 18:
                    jL = ksy.L(parcel, i);
                    break;
                case 19:
                    strT6 = str;
                    zAb4 = ksy.ab(parcel, i);
                    continue;
                case 20:
                    strT6 = str;
                    strT4 = ksy.T(parcel, i);
                    continue;
                case 21:
                    strT6 = str;
                    kvfVar = (kvf) ksy.O(parcel, i, kvf.CREATOR);
                    continue;
                case 22:
                    strT6 = str;
                    strT5 = ksy.T(parcel, i);
                    continue;
            }
            strT6 = str;
        }
        ksy.Y(parcel, iK);
        return new kvn(strT6, bundleM, strT7, applicationErrorReport, strT, bitmapTeleporter, strT2, arrayListX, zAb, kvvVar, kvqVar, zAb2, bitmap, strT3, zAb3, jL, zAb4, strT4, kvfVar, strT5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new kvn[i];
    }
}

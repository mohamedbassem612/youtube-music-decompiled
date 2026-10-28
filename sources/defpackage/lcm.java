package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcm extends gda implements lco {
    public lcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.lco
    public final byte[] A(lcd lcdVar, String str) {
        Parcel parcelC = c();
        gdc.c(parcelC, lcdVar);
        parcelC.writeString(str);
        Parcel parcelD = d(9, parcelC);
        byte[] bArrCreateByteArray = parcelD.createByteArray();
        parcelD.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.lco
    public final lbu a(lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        Parcel parcelD = d(21, parcelC);
        lbu lbuVar = (lbu) gdc.a(parcelD, lbu.CREATOR);
        parcelD.recycle();
        return lbuVar;
    }

    @Override // defpackage.lco
    public final String b(lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        Parcel parcelD = d(11, parcelC);
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }

    @Override // defpackage.lco
    public final List g(String str, String str2, lbg lbgVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        gdc.c(parcelC, lbgVar);
        Parcel parcelD = d(16, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(lbq.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.lco
    public final List h(String str, String str2, String str3) {
        Parcel parcelC = c();
        parcelC.writeString(null);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        Parcel parcelD = d(17, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(lbq.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.lco
    public final List i(String str, String str2, boolean z, lbg lbgVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        ClassLoader classLoader = gdc.a;
        parcelC.writeInt(z ? 1 : 0);
        gdc.c(parcelC, lbgVar);
        Parcel parcelD = d(14, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(lfy.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.lco
    public final List j(String str, String str2, String str3, boolean z) {
        Parcel parcelC = c();
        parcelC.writeString(null);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        ClassLoader classLoader = gdc.a;
        parcelC.writeInt(z ? 1 : 0);
        Parcel parcelD = d(15, parcelC);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(lfy.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.lco
    public final void k(lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        e(27, parcelC);
    }

    @Override // defpackage.lco
    public final void l(lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        e(33, parcelC);
    }

    @Override // defpackage.lco
    public final void m(lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        e(4, parcelC);
    }

    @Override // defpackage.lco
    public final void n(lbg lbgVar, lfm lfmVar, lcs lcsVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        gdc.c(parcelC, lfmVar);
        gdc.e(parcelC, lcsVar);
        e(29, parcelC);
    }

    @Override // defpackage.lco
    public final void o(lcd lcdVar, lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lcdVar);
        gdc.c(parcelC, lbgVar);
        e(1, parcelC);
    }

    @Override // defpackage.lco
    public final void p(lbg lbgVar, List list) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        parcelC.writeTypedList(list);
        e(32, parcelC);
    }

    @Override // defpackage.lco
    public final void q(lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        e(18, parcelC);
    }

    @Override // defpackage.lco
    public final void r(lbq lbqVar, lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbqVar);
        gdc.c(parcelC, lbgVar);
        e(12, parcelC);
    }

    @Override // defpackage.lco
    public final void s(lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        e(20, parcelC);
    }

    @Override // defpackage.lco
    public final void t(long j, String str, String str2, String str3) {
        Parcel parcelC = c();
        parcelC.writeLong(j);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        e(10, parcelC);
    }

    @Override // defpackage.lco
    public final void u(Bundle bundle, lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, bundle);
        gdc.c(parcelC, lbgVar);
        e(19, parcelC);
    }

    @Override // defpackage.lco
    public final void v(lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        e(26, parcelC);
    }

    @Override // defpackage.lco
    public final void w(lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        e(6, parcelC);
    }

    @Override // defpackage.lco
    public final void x(lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        e(25, parcelC);
    }

    @Override // defpackage.lco
    public final void y(lfy lfyVar, lbg lbgVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lfyVar);
        gdc.c(parcelC, lbgVar);
        e(2, parcelC);
    }

    @Override // defpackage.lco
    public final void z(lbg lbgVar, lbp lbpVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, lbgVar);
        gdc.c(parcelC, lbpVar);
        e(30, parcelC);
    }
}

package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxx implements jxy {
    final /* synthetic */ jxm a;

    public jxx(jxm jxmVar) {
        this.a = jxmVar;
    }

    @Override // defpackage.jxy
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        jrz jrzVar;
        if (iBinder == null) {
            jrzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            jrzVar = iInterfaceQueryLocalInterface instanceof jrz ? (jrz) iInterfaceQueryLocalInterface : new jrz(iBinder);
        }
        jxm jxmVar = this.a;
        Parcel parcelC = jrzVar.c();
        gdc.c(parcelC, jxmVar);
        Parcel parcelD = jrzVar.d(3, parcelC);
        jxn jxnVar = (jxn) gdc.a(parcelD, jxn.CREATOR);
        parcelD.recycle();
        jxz.h(jxnVar);
        return jxnVar.b;
    }
}

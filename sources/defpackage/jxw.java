package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jxw implements jxy {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public jxw(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.jxy
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws jxr {
        jrz jrzVar;
        if (iBinder == null) {
            jrzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            jrzVar = iInterfaceQueryLocalInterface instanceof jrz ? (jrz) iInterfaceQueryLocalInterface : new jrz(iBinder);
        }
        String str = this.a;
        Bundle bundle = this.b;
        Parcel parcelC = jrzVar.c();
        parcelC.writeString(str);
        gdc.c(parcelC, bundle);
        Parcel parcelD = jrzVar.d(2, parcelC);
        Bundle bundle2 = (Bundle) gdc.a(parcelD, Bundle.CREATOR);
        parcelD.recycle();
        jxz.h(bundle2);
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new jxr(string);
    }
}

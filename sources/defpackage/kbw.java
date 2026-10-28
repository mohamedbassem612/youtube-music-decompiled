package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kbw extends gdb implements kbx {
    public kbw() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.os.IBinder, kuo] */
    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ?? B = b();
            parcel2.writeNoException();
            ClassLoader classLoader = gdc.a;
            parcel2.writeStrongBinder(B);
            return true;
        }
        if (i == 2) {
            d();
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            c();
            parcel2.writeNoException();
            return true;
        }
        if (i != 4) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(264205000);
        return true;
    }
}

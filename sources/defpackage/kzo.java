package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kzo extends gdb implements kzp {
    final /* synthetic */ Runnable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzo(Runnable runnable) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.a = runnable;
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a();
        return true;
    }

    @Override // defpackage.kzp
    public final void a() {
        this.a.run();
    }
}

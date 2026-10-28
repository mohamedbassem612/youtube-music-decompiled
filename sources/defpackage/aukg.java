package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class aukg extends gdb implements aukh {
    public aukg() {
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        b();
        return true;
    }
}

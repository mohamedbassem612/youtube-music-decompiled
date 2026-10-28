package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kzl extends gdb implements kzm {
    private final AtomicReference a;
    private boolean b;

    public kzl() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.a = new AtomicReference();
    }

    public static Object d(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("%s: %s, %s", "Unexpected object type. Expected, Received", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) gdc.a(parcel, Bundle.CREATOR);
        gdc.b(parcel);
        a(bundle);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.kzm
    public final void a(Bundle bundle) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            try {
                atomicReference.set(bundle);
                this.b = true;
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }

    public final Bundle b(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            if (!this.b) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.a.get();
        }
        return bundle;
    }

    public final String c(long j) {
        return (String) d(b(j), String.class);
    }
}

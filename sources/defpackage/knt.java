package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class knt {
    public final int c;
    public boolean d = false;
    public boolean e = false;

    public knt(int i) {
        this.c = i;
    }

    public static Status j(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void f(Status status);

    public abstract void g(Exception exc);

    public abstract void h(kol kolVar);

    public abstract void i(khn khnVar, boolean z);

    protected final boolean k(Exception exc) {
        if (exc != null && exc.getMessage() != null) {
            String message = exc.getMessage();
            if (message.startsWith("Throttled:") || message.startsWith("GmsCore module throttled:")) {
                f(new Status(23, exc.getLocalizedMessage(), null, null));
                return true;
            }
        }
        return false;
    }
}

package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kny extends BasePendingResult implements knz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected kny(khn khnVar, knc kncVar) {
        super(kncVar);
        if (kncVar == null) {
            throw new NullPointerException("GoogleApiClient must not be null");
        }
        if (khnVar == null) {
            throw new NullPointerException("Api must not be null");
        }
    }

    private final void n(RemoteException remoteException) {
        i(new Status(8, remoteException.getLocalizedMessage(), null, null));
    }

    protected abstract void b(kmp kmpVar);

    public /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void h(kmp kmpVar) throws DeadObjectException {
        try {
            b(kmpVar);
        } catch (DeadObjectException e) {
            n(e);
            throw e;
        } catch (RemoteException e2) {
            n(e2);
        }
    }

    public final void i(Status status) {
        kro.d(!status.c(), "Failed result must not be success");
        l(a(status));
    }
}

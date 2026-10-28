package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lnt extends gdb implements IInterface {
    private final lnx a;
    private final kjc b;

    public lnt(lnx lnxVar, kjc kjcVar) {
        super("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
        this.a = lnxVar;
        this.b = kjcVar;
    }

    private final void b(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("should_log_stats")) {
            return;
        }
        bundle.putLong("response_timestamp_ms", System.currentTimeMillis());
        try {
            try {
                lnu lnuVar = (lnu) this.a.C();
                Context context = this.a.p;
                kmv kmvVarAp = ksy.ap();
                Parcel parcelC = lnuVar.c();
                gdc.c(parcelC, bundle);
                gdc.c(parcelC, kmvVarAp);
                lnuVar.f(8, parcelC);
            } catch (IllegalStateException e) {
                RemoteException remoteException = new RemoteException();
                remoteException.initCause(e);
                throw remoteException;
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                lnq lnqVar = (lnq) gdc.a(parcel, lnq.CREATOR);
                gdc.b(parcel);
                b(lnqVar.c);
                kro.z(lnqVar.a, lnqVar.b, this.b);
                return true;
            case 3:
                lno lnoVar = (lno) gdc.a(parcel, lno.CREATOR);
                gdc.b(parcel);
                b(lnoVar.c);
                kro.z(lnoVar.a, lnoVar.b, this.b);
                return true;
            case 4:
                lnm lnmVar = (lnm) gdc.a(parcel, lnm.CREATOR);
                gdc.b(parcel);
                b(lnmVar.c);
                kro.z(lnmVar.a, lnmVar.b, this.b);
                return true;
            case 5:
                lnn lnnVar = (lnn) gdc.a(parcel, lnn.CREATOR);
                gdc.b(parcel);
                b(lnnVar.c);
                kro.z(lnnVar.a, lnnVar.b, this.b);
                return true;
            case 6:
                lnr lnrVar = (lnr) gdc.a(parcel, lnr.CREATOR);
                gdc.b(parcel);
                b(lnrVar.c);
                kro.z(lnrVar.a, lnrVar.b, this.b);
                return true;
            case 7:
                lnk lnkVar = (lnk) gdc.a(parcel, lnk.CREATOR);
                gdc.b(parcel);
                b(lnkVar.c);
                kro.z(lnkVar.a, lnkVar.b, this.b);
                return true;
            default:
                return false;
        }
    }
}

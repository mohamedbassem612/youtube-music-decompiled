package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kwg implements kpq, kpr {
    public final LinkedBlockingQueue a;
    public final long b;
    protected final jwe c;
    private final String d;
    private final String e;
    private final gcw f;
    private final HandlerThread g;
    private final kwc h;

    public kwg(Context context, gcw gcwVar, String str, String str2, kwc kwcVar) {
        this.d = str;
        this.f = gcwVar;
        this.e = str2;
        this.h = kwcVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.g = handlerThread;
        handlerThread.start();
        this.b = System.currentTimeMillis();
        jwe jweVar = new jwe(context, handlerThread.getLooper(), this, this, 19621000);
        this.c = jweVar;
        this.a = new LinkedBlockingQueue();
        jweVar.H();
    }

    @Override // defpackage.kpq
    public final void a(Bundle bundle) {
        kwp kwpVarF = f();
        if (kwpVarF != null) {
            try {
                gcw gcwVar = this.f;
                kwr kwrVar = new kwr(1, 1, gcwVar.h, this.d, this.e);
                Parcel parcelC = kwpVarF.c();
                gdc.c(parcelC, kwrVar);
                Parcel parcelD = kwpVarF.d(3, parcelC);
                kws kwsVar = (kws) gdc.a(parcelD, kws.CREATOR);
                parcelD.recycle();
                e(5011, this.b, null);
                this.a.put(kwsVar);
            } catch (Throwable th) {
                try {
                    e(2010, this.b, new Exception(th));
                } finally {
                    d();
                    this.g.quit();
                }
            }
        }
    }

    @Override // defpackage.kpq
    public final void b(int i) {
        try {
            e(4011, this.b, null);
            this.a.put(new kws(1, null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.kpr
    public final void c(klo kloVar) {
        try {
            e(4012, this.b, null);
            this.a.put(new kws(1, null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final void d() {
        jwe jweVar = this.c;
        if (jweVar != null) {
            if (jweVar.w() || jweVar.x()) {
                jweVar.l();
            }
        }
    }

    public final void e(int i, long j, Exception exc) {
        kwc kwcVar = this.h;
        if (kwcVar != null) {
            kwcVar.c(i, System.currentTimeMillis() - j, exc);
        }
    }

    protected final kwp f() {
        try {
            return this.c.e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}

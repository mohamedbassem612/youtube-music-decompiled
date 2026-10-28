package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class crl extends Handler implements Runnable {
    public final int a;
    public IOException b;
    public int c;
    final /* synthetic */ crp d;
    private final crm e;
    private final long f;
    private crk g;
    private Thread h;
    private boolean i;
    private volatile boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crl(crp crpVar, Looper looper, crm crmVar, crk crkVar, int i, long j) {
        super(looper);
        this.d = crpVar;
        this.e = crmVar;
        this.g = crkVar;
        this.a = i;
        this.f = j;
    }

    private final void c() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f;
        crk crkVar = this.g;
        crkVar.getClass();
        crkVar.gr(this.e, jElapsedRealtime, j, this.c);
        this.b = null;
        crp crpVar = this.d;
        crl crlVar = crpVar.a;
        crlVar.getClass();
        crpVar.c.execute(crlVar);
    }

    private final void d() {
        this.d.a = null;
    }

    public final void a(boolean z) {
        this.j = z;
        this.b = null;
        if (hasMessages(1)) {
            this.i = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.i = true;
                this.e.a();
                Thread thread = this.h;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            d();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            crk crkVar = this.g;
            crkVar.getClass();
            crkVar.gq(this.e, jElapsedRealtime, jElapsedRealtime - this.f, true);
            this.g = null;
        }
    }

    public final void b(long j) {
        crp crpVar = this.d;
        ahno.O(crpVar.a == null);
        crpVar.a = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            c();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.j) {
            return;
        }
        if (message.what == 1) {
            c();
            return;
        }
        if (message.what == 4) {
            throw ((Error) message.obj);
        }
        d();
        long j = this.f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - j;
        crk crkVar = this.g;
        crkVar.getClass();
        if (this.i) {
            crkVar.gq(this.e, jElapsedRealtime, j2, false);
            return;
        }
        int i = message.what;
        if (i == 2) {
            try {
                crkVar.gv(this.e, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                bvx.d("LoadTask", "Unexpected exception handling load completed", e);
                this.d.b = new cro(e);
                return;
            }
        }
        if (i == 3) {
            IOException iOException = (IOException) message.obj;
            this.b = iOException;
            int i2 = this.c + 1;
            this.c = i2;
            yvt yvtVarGs = crkVar.gs(this.e, jElapsedRealtime, j2, iOException, i2);
            int i3 = yvtVarGs.b;
            if (i3 == 3) {
                this.d.b = this.b;
            } else if (i3 != 2) {
                if (i3 == 1) {
                    this.c = 1;
                }
                long jMin = yvtVarGs.a;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.c - 1) * 1000, 5000);
                }
                b(jMin);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.i;
                this.h = Thread.currentThread();
            }
            if (!z) {
                crm crmVar = this.e;
                crmVar.getClass().getSimpleName();
                crmVar.b();
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (this.j) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.j) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Error e2) {
            if (!this.j) {
                bvx.d("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.j) {
                return;
            }
            bvx.d("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(3, new cro(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.j) {
                return;
            }
            bvx.d("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(3, new cro(e4)).sendToTarget();
        }
    }
}

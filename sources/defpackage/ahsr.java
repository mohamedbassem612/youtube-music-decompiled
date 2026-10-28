package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ahsr extends Service {
    private Binder a;
    private final Object b;
    private int c;
    private int d;
    final ExecutorService h;

    public ahsr() {
        ksy ksyVar = kyq.a;
        this.h = ksy.al(1, new ktb("Firebase-Messaging-Intent-Handle", 0));
        this.b = new Object();
        this.d = 0;
    }

    public final lpa d(Intent intent) {
        kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        this.h.execute(new adab(this, intent, kjcVar, 17, (byte[]) null));
        return (lpa) kjcVar.a;
    }

    public final void e(Intent intent) {
        if (intent != null) {
            ahtt.b(intent);
        }
        synchronized (this.b) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                stopSelfResult(this.c);
            }
        }
    }

    public abstract void f(Intent intent);

    protected Intent g() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new ahtu(new avgj(this));
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.h.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c = i2;
            this.d++;
        }
        Intent intentG = g();
        if (intentG == null) {
            e(intent);
            return 2;
        }
        lpa lpaVarD = d(intentG);
        if (lpaVarD.i()) {
            e(intent);
            return 2;
        }
        lpaVarD.l(new cte(14), new ahsq(this, intent, 0));
        return 3;
    }
}

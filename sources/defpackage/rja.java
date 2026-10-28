package defpackage;

import android.os.Handler;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rja {
    public static final Duration a = Duration.ofMillis(5);
    public static final rbm d = new rbm("rja");
    public final riy b;
    public final Duration c;

    public rja(ahxp ahxpVar, Duration duration) {
        riy riyVar = new riy(this, ahxpVar);
        this.b = riyVar;
        riyVar.setName("EngineThread");
        this.c = duration;
    }

    public final void a() {
        riy riyVar = this.b;
        Handler handler = riyVar.m;
        if (handler != null) {
            riyVar.getClass();
            handler.post(new rhl(riyVar, 14));
        } else {
            rbc rbcVar = new rbc(d, rbd.d);
            rbcVar.c();
            rbcVar.a("Engine thread is not running. Cannot do work now.", new Object[0]);
        }
    }

    public final void b() {
        int i = riy.f;
        riy riyVar = this.b;
        synchronized (riyVar.a) {
            riyVar.d = false;
        }
    }

    public final void c() {
        int i = riy.f;
        riy riyVar = this.b;
        synchronized (riyVar.a) {
            riyVar.d = true;
            riyVar.b();
        }
    }
}

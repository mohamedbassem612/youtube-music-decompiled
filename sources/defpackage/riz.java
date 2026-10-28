package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class riz extends rjc {
    public final riy a;
    private Runnable b;

    public riz(riy riyVar) {
        this.a = riyVar;
    }

    @Override // defpackage.rjc
    public final rfo a() {
        return this.a;
    }

    @Override // defpackage.rjc
    public final void b() {
        Runnable runnable = this.b;
        if (runnable != null) {
            riy riyVar = this.a;
            int i = riy.f;
            riyVar.b.remove(runnable);
            this.b = null;
        }
    }

    @Override // defpackage.rjc
    public final void c(Runnable runnable) {
        riy riyVar = this.a;
        ahno.P(riyVar.isAlive(), "Trying post a task after the thread was stopped.");
        Handler handler = riyVar.m;
        if (handler == null) {
            rbc rbcVar = new rbc(rja.d, rbd.d);
            rbcVar.c();
            rbcVar.a("Engine thread is not running. Cannot post a task.", new Object[0]);
        } else {
            if (handler.post(new rhz(riyVar, runnable, 8, null))) {
                return;
            }
            rbc rbcVar2 = new rbc(rja.d, rbd.d);
            rbcVar2.c();
            rbcVar2.a = new Exception("Engine thread is not running.");
            rbcVar2.a("Engine thread is not running. Cannot post a task.", new Object[0]);
        }
    }

    @Override // defpackage.rjc
    public final void d(Runnable runnable) {
        ahno.P(this.b == null, "There can be only one repeated task scheduled per handle.");
        riy riyVar = this.a;
        ahno.P(riyVar.isAlive(), "Trying add a periodic task after thread was stopped.");
        this.b = runnable;
        riyVar.b.add(runnable);
        riyVar.b();
    }
}

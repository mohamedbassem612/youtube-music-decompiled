package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wxf {
    private boolean a = true;
    private boolean b = false;
    private avmn c;
    private Future d;
    private acjx e;
    private acjx f;

    final synchronized acjx a() {
        return this.e;
    }

    final synchronized acjx b() {
        return this.f;
    }

    final synchronized void c() {
        Future future;
        avmn avmnVar = this.c;
        if (avmnVar != null && !avmnVar.f()) {
            this.c.dispose();
        }
        this.c = null;
        this.b = false;
        if (k() && (future = this.d) != null) {
            future.cancel(false);
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    final synchronized void d(acjx acjxVar) {
        this.b = true;
        this.e = acjxVar;
    }

    final synchronized void e(boolean z) {
        this.a = z;
    }

    final synchronized void f(acjx acjxVar) {
        this.f = acjxVar;
    }

    final synchronized void g(Future future) {
        Future future2;
        if (k() && (future2 = this.d) != null) {
            future2.cancel(false);
        }
        this.d = future;
    }

    final synchronized void h(avmn avmnVar) {
        avmn avmnVar2 = this.c;
        if (avmnVar2 != null && !avmnVar2.f()) {
            this.c.dispose();
        }
        this.c = avmnVar;
    }

    final synchronized boolean i() {
        return this.b;
    }

    final synchronized boolean j() {
        return this.a;
    }

    final synchronized boolean k() {
        Future future = this.d;
        return (future == null || future.isCancelled() || this.d.isDone()) ? false : true;
    }

    final synchronized boolean l() {
        return i() || k();
    }
}

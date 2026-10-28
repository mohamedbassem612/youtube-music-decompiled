package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aok extends awuq {
    public static final awmi a = atqp.k(1, new aoh(0));
    public final Choreographer b;
    public final Handler c;
    public boolean g;
    public final ahy i;
    private boolean m;
    public final Object d = new Object();
    private final awnm l = new awnm();
    public List e = new ArrayList();
    public List f = new ArrayList();
    public final aoj h = new aoj(this);

    public aok(Choreographer choreographer, Handler handler) {
        this.b = choreographer;
        this.c = handler;
        this.i = new aon(choreographer, this);
    }

    private final Runnable c() {
        Runnable runnable;
        synchronized (this.d) {
            runnable = (Runnable) this.l.e();
        }
        return runnable;
    }

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        synchronized (this.d) {
            this.l.addLast(runnable);
            if (!this.m) {
                this.m = true;
                Handler handler = this.c;
                aoj aojVar = this.h;
                handler.post(aojVar);
                if (!this.g) {
                    this.g = true;
                    this.b.postFrameCallback(aojVar);
                }
            }
        }
    }

    public final void b() {
        boolean z;
        do {
            Runnable runnableC = c();
            while (runnableC != null) {
                runnableC.run();
                runnableC = c();
            }
            synchronized (this.d) {
                if (this.l.isEmpty()) {
                    z = false;
                    this.m = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}

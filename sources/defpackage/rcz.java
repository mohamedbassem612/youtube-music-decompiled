package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rcz implements AutoCloseable {
    public static final bug a = new bug(48000, 2, 2);
    public static final rbm m = rbm.c(rcz.class);
    public final quc b;
    public final Context c;
    public final rdj d;
    public final qyx e;
    public final qyt f;
    public final Optional g;
    public final Optional h;
    public final qug i;
    public final rjb j;
    public final rcy k;
    public qxm l;
    public tld n;

    public rcz(quc qucVar, Context context, rdj rdjVar, qyx qyxVar, qyt qytVar, Optional optional, Optional optional2, qug qugVar, rcy rcyVar, rjb rjbVar) {
        this.b = qucVar;
        this.c = context;
        this.d = rdjVar;
        this.e = qyxVar;
        this.f = qytVar;
        this.g = optional;
        this.h = optional2;
        this.i = qugVar;
        this.k = rcyVar;
        this.j = rjbVar;
    }

    public final synchronized ListenableFuture a(final Duration duration) {
        final SettableFuture settableFutureCreate;
        settableFutureCreate = SettableFuture.create();
        this.n.l(new Runnable() { // from class: rcv
            @Override // java.lang.Runnable
            public final void run() {
                settableFutureCreate.setFuture(this.a.l.a(duration));
            }
        });
        return settableFutureCreate;
    }

    public final synchronized ListenableFuture b(quc qucVar, final Duration duration, final boolean z) throws Throwable {
        try {
            try {
                final quc qucVarA = rjo.a(qucVar);
                final SettableFuture settableFutureCreate = SettableFuture.create();
                this.n.l(new Runnable() { // from class: rcw
                    @Override // java.lang.Runnable
                    public final void run() {
                        rcz rczVar = this.a;
                        qxm qxmVar = rczVar.l;
                        qxmVar.g();
                        qxmVar.y.getClass();
                        boolean z2 = qxmVar.w;
                        quc qucVar2 = qucVarA;
                        Duration duration2 = duration;
                        if (qxmVar.i(qucVar2, duration2)) {
                            qxmVar.s++;
                            qxmVar.d.b(qucVar2);
                            qxmVar.f(duration2);
                            if (!z2) {
                                qxmVar.d();
                            }
                        }
                        SettableFuture settableFuture = settableFutureCreate;
                        if (z) {
                            settableFuture.setFuture(rczVar.l.a(duration2));
                        } else {
                            settableFuture.set(null);
                        }
                    }
                });
                return settableFutureCreate;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.n.l(new rcu(this, 4));
        this.n.m();
    }
}

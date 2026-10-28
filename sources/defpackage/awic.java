package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awic extends avmc {
    final Callable a;
    final avnn b;
    final avni c;

    public awic(Callable callable, avnn avnnVar, avni avniVar) {
        this.a = callable;
        this.b = avnnVar;
        this.c = avniVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [avmf, java.lang.Object] */
    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        try {
            Object objCall = this.a.call();
            try {
                this.b.a(objCall).F(new awib(avmdVar, objCall, this.c));
            } catch (Throwable th) {
                th = th;
                avkz.a(th);
                try {
                    this.c.a(objCall);
                } catch (Throwable th2) {
                    avkz.a(th2);
                    th = new avmw(th, th2);
                }
                avns.h(th, avmdVar);
            }
        } catch (Throwable th3) {
            avkz.a(th3);
            avns.h(th3, avmdVar);
        }
    }
}

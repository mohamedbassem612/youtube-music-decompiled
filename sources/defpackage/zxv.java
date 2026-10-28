package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zxv implements Runnable, sxu {
    final /* synthetic */ zxw a;
    private final Object b;
    private final Object c;
    private final sxu d;
    private Object e;

    public zxv(zxw zxwVar, Object obj, Object obj2, sxu sxuVar) {
        this.a = zxwVar;
        this.b = obj;
        this.c = obj2;
        this.d = sxuVar;
    }

    @Override // defpackage.sxu
    public final void b(Object obj, Object obj2) {
        this.e = obj2;
        run();
    }

    @Override // defpackage.sxu
    public final void iT(Object obj, Exception exc) {
        this.d.iT(this.b, exc);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.b(this.b, this.a.a.d(this.e));
        } catch (IOException e) {
            this.a.c(this.b, this.c, this.d, e);
        } catch (tzn e2) {
            this.a.c(this.b, this.c, this.d, e2);
        }
    }
}

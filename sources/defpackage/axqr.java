package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axqr {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public axqr(afho afhoVar, qrx qrxVar) {
        this.a = new Object();
        this.b = new HashMap();
        this.d = afhoVar;
        this.c = qrxVar;
    }

    public final ListenableFuture a(affd affdVar) {
        return ((afho) this.d).a(affdVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final void b() {
        synchronized (this.a) {
            this.b.clear();
        }
    }

    public axqr(aika aikaVar, Object obj, aika aikaVar2, Object obj2) {
        this.a = aikaVar;
        this.c = obj;
        this.b = aikaVar2;
        this.d = obj2;
    }

    public axqr(axrt axrtVar, axrt axrtVar2, Object obj) {
        this.c = axrtVar;
        this.a = "";
        this.d = axrtVar2;
        this.b = obj;
    }

    public axqr() {
        throw null;
    }

    public axqr(afpa afpaVar, hhb hhbVar) {
        this.a = new Object();
        this.b = new HashMap();
        this.d = afpaVar;
        this.c = hhbVar;
    }
}

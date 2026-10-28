package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evu {
    public final Object a;
    public final /* synthetic */ Object b;
    public final Object c;

    public evu(afjq afjqVar, hhb hhbVar, Executor executor) {
        this.b = afjqVar;
        this.a = new WeakReference(hhbVar);
        this.c = executor;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void a() {
        this.c.execute(new px(this, 4));
    }

    public evu(aerj aerjVar, fed fedVar, evx evxVar) {
        this.b = aerjVar;
        this.c = fedVar;
        this.a = evxVar;
    }
}

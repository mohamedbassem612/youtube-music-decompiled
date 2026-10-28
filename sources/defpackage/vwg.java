package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vwg extends agcv {
    public final wek a;
    public final awut b;
    public final AtomicInteger c;
    public final aga d;
    private final zvl e;

    public vwg(wek wekVar, awut awutVar, avmb avmbVar, zvl zvlVar) {
        wekVar.getClass();
        awutVar.getClass();
        avmbVar.getClass();
        zvlVar.getClass();
        this.a = wekVar;
        this.b = awutVar;
        this.e = zvlVar;
        this.d = new aga(6);
        this.c = new AtomicInteger(0);
    }

    public final void a(Throwable th, String str) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
        zvjVarA.j = 63;
        zvjVarA.d(str);
        zvjVarA.f(th);
        this.e.a(zvjVarA.a());
    }
}

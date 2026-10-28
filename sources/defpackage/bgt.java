package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgt {
    public bgr a;
    public final List b = new ArrayList();
    private final bgh c;
    private final Callable d;
    private awuq e;

    public bgt(bgh bghVar, Callable callable) {
        this.c = bghVar;
        this.d = callable;
        awuq awuqVar = awvi.a;
        this.e = axew.a;
    }

    public final void a(Executor executor) {
        executor.getClass();
        this.e = awuw.f(executor);
    }

    public final ayq b() {
        beb bebVar = new beb(new bfv(this.c, new bgs(this.d)), ((axcw) awrc.K(this.e.plus(new awxf(null)))).a);
        bgr bgrVar = this.a;
        if (bgrVar != null) {
            bebVar.a = bgrVar;
        }
        bebVar.b(this.b);
        return new ayq((bfp) bebVar.a(), this.e);
    }
}

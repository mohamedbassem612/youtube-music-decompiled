package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aajm {
    public static final agrf b = agrf.h("com/google/android/libraries/youtube/offline/features/appsearch/indexing/AbstractAppSearchIncrementalIndexer");
    public final Executor d;
    protected final avmb e;
    public final aajv f;
    protected avmn g;
    public final aajt i;
    protected final isi j;
    public final grj k;
    protected final grj l;
    public ListenableFuture h = ahng.m(new Throwable("Future not started"));
    public final awkv c = new awkx().aI();

    protected aajm(aajt aajtVar, grj grjVar, Executor executor, avmb avmbVar, isi isiVar, grj grjVar2, aajv aajvVar) {
        this.i = aajtVar;
        this.l = grjVar;
        this.d = executor;
        this.e = avmbVar;
        this.j = isiVar;
        this.k = grjVar2;
        this.f = aajvVar;
    }

    protected static akne f(String str) {
        aihf aihfVarCreateBuilder = akne.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akne akneVar = (akne) aihfVarCreateBuilder.instance;
        str.getClass();
        akneVar.b = 2;
        akneVar.c = str;
        return (akne) aihfVarCreateBuilder.build();
    }

    protected static akne g(String str) {
        aihf aihfVarCreateBuilder = akne.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akne akneVar = (akne) aihfVarCreateBuilder.instance;
        str.getClass();
        akneVar.b = 1;
        akneVar.c = str;
        return (akne) aihfVarCreateBuilder.build();
    }

    protected static List h(List list, Class cls) {
        return (List) Collection.EL.stream(list).filter(new aajl(cls, 0)).map(new woi(cls, 14)).distinct().collect(Collectors.toCollection(new yoj(5)));
    }

    public abstract ListenableFuture a(List list);

    public abstract ListenableFuture b(List list);

    public abstract void d();

    public abstract void e();

    protected final void i() {
        avmn avmnVar = this.g;
        if (avmnVar == null || avmnVar.f()) {
            avlh avlhVarN = this.c.N();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.g = avlhVarN.d(5000L, TimeUnit.MILLISECONDS, this.e).x(new yqz(5)).al(new zgd(this, 10), new xuk(6));
        }
    }
}

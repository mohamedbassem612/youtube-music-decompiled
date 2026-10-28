package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class tlj extends ths {
    public ExecutorService A() {
        throw null;
    }

    public ExecutorService B() {
        throw null;
    }

    public abstract vxz C();

    public abstract void D();

    public abstract vwt E();

    public final tgk F() {
        return h().b;
    }

    public final Executor G(tns tnsVar) {
        return tnsVar.af() == tnr.d ? B() : A();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awut, java.lang.Object] */
    public final awut H(tns tnsVar) {
        return tnsVar.af() == tnr.d ? r().get() : p().get();
    }

    public final boolean I() {
        tqj tqjVarM = m();
        int i = tqr.a;
        return tqjVarM.k(1073830968);
    }

    public final boolean J() {
        tqj tqjVarM = m();
        int i = tqr.a;
        return tqjVarM.k(1073830331);
    }

    public final boolean K() {
        tqj tqjVarM = m();
        int i = tqr.a;
        return tqjVarM.k(1073830969);
    }

    public final boolean L() {
        return n().j;
    }

    public final boolean M() {
        return n().c;
    }

    public final boolean N() {
        tqj tqjVarM = m();
        int i = tqr.a;
        return tqjVarM.k(1073828986);
    }

    public abstract int d();

    public abstract long e();

    public abstract mbc f();

    public abstract tfx g();

    public abstract tgl h();

    public abstract tgv i();

    public abstract tli j();

    public abstract tli k();

    public abstract tmo l();

    public abstract tqj m();

    public abstract ajcb n();

    public abstract Optional o();

    public abstract Optional p();

    public abstract Optional q();

    public abstract Optional r();

    public abstract Optional s();

    public abstract String t();

    public abstract Executor u();

    public abstract Executor v();

    public abstract ScheduledExecutorService w();

    public abstract awmd x();

    public abstract boolean y();

    public toh z() {
        throw null;
    }
}

package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class rae implements Function {
    public abstract void a(quy quyVar, aihf aihfVar);

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        quy quyVar = (quy) obj;
        aihf aihfVarCreateBuilder = atrx.a.createBuilder();
        if (quyVar.k != null) {
            q(quyVar, aihfVarCreateBuilder);
        }
        e(quyVar, aihfVarCreateBuilder);
        t(quyVar, aihfVarCreateBuilder);
        b(quyVar, aihfVarCreateBuilder);
        d(quyVar, aihfVarCreateBuilder);
        i(quyVar, aihfVarCreateBuilder);
        g(quyVar, aihfVarCreateBuilder);
        h(quyVar, aihfVarCreateBuilder);
        f(quyVar, aihfVarCreateBuilder);
        if (quyVar.r != null) {
            j(quyVar, aihfVarCreateBuilder);
        }
        m(quyVar, aihfVarCreateBuilder);
        p(quyVar, aihfVarCreateBuilder);
        k(quyVar, aihfVarCreateBuilder);
        r(quyVar, aihfVarCreateBuilder);
        s(quyVar, aihfVarCreateBuilder);
        a(quyVar, aihfVarCreateBuilder);
        if (quyVar.v != null) {
            n(quyVar, aihfVarCreateBuilder);
        }
        o(quyVar, aihfVarCreateBuilder);
        if (quyVar.N != null) {
            l(quyVar, aihfVarCreateBuilder);
        }
        if (quyVar.M != null) {
            c(quyVar, aihfVarCreateBuilder);
        }
        return (atrx) aihfVarCreateBuilder.build();
    }

    public void b(quy quyVar, aihf aihfVar) {
        throw null;
    }

    public abstract void c(quy quyVar, aihf aihfVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public void d(quy quyVar, aihf aihfVar) {
        throw null;
    }

    public abstract void e(quy quyVar, aihf aihfVar);

    public abstract void f(quy quyVar, aihf aihfVar);

    public abstract void g(quy quyVar, aihf aihfVar);

    public abstract void h(quy quyVar, aihf aihfVar);

    public abstract void i(quy quyVar, aihf aihfVar);

    public abstract void j(quy quyVar, aihf aihfVar);

    public abstract void k(quy quyVar, aihf aihfVar);

    public abstract void l(quy quyVar, aihf aihfVar);

    public void m(quy quyVar, aihf aihfVar) {
        throw null;
    }

    public abstract void n(quy quyVar, aihf aihfVar);

    public void o(quy quyVar, aihf aihfVar) {
        throw null;
    }

    public abstract void p(quy quyVar, aihf aihfVar);

    public void q(quy quyVar, aihf aihfVar) {
        throw null;
    }

    public abstract void r(quy quyVar, aihf aihfVar);

    public abstract void s(quy quyVar, aihf aihfVar);

    public abstract void t(quy quyVar, aihf aihfVar);
}

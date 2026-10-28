package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class veh implements Function {
    public abstract void a(augy augyVar, aihf aihfVar);

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        augy augyVar = (augy) obj;
        aihf aihfVarCreateBuilder = akqs.a.createBuilder();
        i(augyVar, aihfVarCreateBuilder);
        c(augyVar, aihfVarCreateBuilder);
        j(augyVar, aihfVarCreateBuilder);
        a(augyVar, aihfVarCreateBuilder);
        f(augyVar, aihfVarCreateBuilder);
        l(augyVar, aihfVarCreateBuilder);
        d(augyVar, aihfVarCreateBuilder);
        g(augyVar, aihfVarCreateBuilder);
        b(augyVar, aihfVarCreateBuilder);
        e(augyVar, aihfVarCreateBuilder);
        h(augyVar, aihfVarCreateBuilder);
        k(augyVar, aihfVarCreateBuilder);
        return (akqs) aihfVarCreateBuilder.build();
    }

    public abstract void b(augy augyVar, aihf aihfVar);

    public abstract void c(augy augyVar, aihf aihfVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(augy augyVar, aihf aihfVar);

    public abstract void e(augy augyVar, aihf aihfVar);

    public abstract void f(augy augyVar, aihf aihfVar);

    public abstract void g(augy augyVar, aihf aihfVar);

    public abstract void h(augy augyVar, aihf aihfVar);

    public abstract void i(augy augyVar, aihf aihfVar);

    public abstract void j(augy augyVar, aihf aihfVar);

    public abstract void k(augy augyVar, aihf aihfVar);

    public abstract void l(augy augyVar, aihf aihfVar);
}

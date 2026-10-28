package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class vek implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final akqv apply(auhs auhsVar) {
        aihf aihfVarCreateBuilder = akqv.a.createBuilder();
        b(auhsVar, aihfVarCreateBuilder);
        return (akqv) aihfVarCreateBuilder.build();
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(auhs auhsVar, aihf aihfVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}

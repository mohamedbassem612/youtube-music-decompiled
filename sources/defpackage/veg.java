package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class veg implements Function {
    public abstract void a(auih auihVar, aihf aihfVar);

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        auih auihVar = (auih) obj;
        aihf aihfVarCreateBuilder = akqd.a.createBuilder();
        a(auihVar, aihfVarCreateBuilder);
        b(auihVar, aihfVarCreateBuilder);
        return (akqd) aihfVarCreateBuilder.build();
    }

    public abstract void b(auih auihVar, aihf aihfVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}

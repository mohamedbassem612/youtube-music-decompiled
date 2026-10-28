package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ovp implements UnaryOperator {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ovl ovlVar = (ovl) obj;
        return ovlVar == null ? new ovl() : ovlVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}

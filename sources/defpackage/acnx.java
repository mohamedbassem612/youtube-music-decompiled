package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acnx implements Function {
    public final /* synthetic */ acoi a;
    public final /* synthetic */ acmi b;

    public /* synthetic */ acnx(acoi acoiVar, acmi acmiVar) {
        this.a = acoiVar;
        this.b = acmiVar;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        acmi acmiVar = this.b;
        boolean z = true;
        if ((acmiVar.e != null || acmiVar.f != null) && !acmiVar.b && (!this.a.ck.ay() || acmiVar.a)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}

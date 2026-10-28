package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abqp implements Function {
    public final /* synthetic */ abqq a;
    public final /* synthetic */ abnl b;
    public final /* synthetic */ String c;
    public final /* synthetic */ abnp d;

    public /* synthetic */ abqp(abqq abqqVar, abnl abnlVar, String str, abnp abnpVar) {
        this.a = abqqVar;
        this.b = abnlVar;
        this.c = str;
        this.d = abnpVar;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.a.a(this.b, this.c, this.d);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}

package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zyp implements Function {
    public final /* synthetic */ zyq a;
    public final /* synthetic */ tgg b;
    public final /* synthetic */ tgi c;

    public /* synthetic */ zyp(zyq zyqVar, tgg tggVar, tgi tgiVar) {
        this.a = zyqVar;
        this.b = tggVar;
        this.c = tgiVar;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [awmd, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        abxv abxvVar = (abxv) obj;
        abfv abfvVar = (abfv) this.a.a.io();
        ahey aheyVar = (ahey) abfvVar.a.io();
        aheyVar.getClass();
        vxz vxzVar = (vxz) abfvVar.b.io();
        vxzVar.getClass();
        abxvVar.getClass();
        tgg tggVar = this.b;
        tggVar.getClass();
        tgi tgiVar = this.c;
        Optional optional = tgiVar.d;
        optional.getClass();
        Optional optional2 = tgiVar.f;
        optional2.getClass();
        Executor executor = tgiVar.h;
        executor.getClass();
        return new zyt(aheyVar, vxzVar, abxvVar, tggVar, optional, optional2, executor);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}

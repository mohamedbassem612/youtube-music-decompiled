package defpackage;

import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adcv implements BiConsumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ adcv(adcw adcwVar, avmm avmmVar, nsr nsrVar, int i) {
        this.$cid = i;
        this.a = adcwVar;
        this.b = avmmVar;
        this.c = nsrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, nsr] */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        if (this.$cid != 0) {
            argn argnVar = (argn) obj;
            Object obj3 = this.b;
            Object obj4 = this.a;
            xgo xgoVar = (xgo) this.c;
            xgt xgtVar = (xgt) obj4;
            xie xieVar = (xie) obj3;
            xgoVar.h(xgtVar, argnVar, (argn) obj2, xieVar);
            xgoVar.n(xgtVar, new xhm(xgo.a, argnVar, Optional.empty(), null), xieVar);
            return;
        }
        String str = (String) obj;
        agke agkeVar = (agke) obj2;
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            ?? r2 = this.c;
            Object obj5 = this.b;
            ((adcw) this.a).j((avmm) obj5, r2, str, (String) agkeVar.get(i));
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return this.$cid != 0 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ adcv(xgo xgoVar, xgt xgtVar, xie xieVar, int i) {
        this.$cid = i;
        this.c = xgoVar;
        this.a = xgtVar;
        this.b = xieVar;
    }
}

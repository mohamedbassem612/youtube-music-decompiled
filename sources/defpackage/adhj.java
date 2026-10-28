package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adhj implements Consumer {
    public final /* synthetic */ adhf a;
    public final /* synthetic */ wqa b;
    public final /* synthetic */ sve c;

    public /* synthetic */ adhj(sve sveVar, adhf adhfVar, wqa wqaVar) {
        this.c = sveVar;
        this.a = adhfVar;
        this.b = wqaVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwb] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        if (((alac) obj) == alac.FLOW_STATE_PASSING_SPEC_FULL_STATE) {
            adhf adhfVar = this.a;
            sve sveVar = this.c;
            ?? r1 = sveVar.b;
            Optional optionalOfNullable = Optional.ofNullable((akzz) sveVar.d.b(r1.e()).g(adhfVar.g).g(akzz.class).E());
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(((akzz) optionalOfNullable.get()).c);
            }
            addb addbVar = new addb(this.b, 19);
            if (true == optionalOfNullable.isPresent()) {
                ((wqa) addbVar.a).e = (alab) optionalOfNullable.get();
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

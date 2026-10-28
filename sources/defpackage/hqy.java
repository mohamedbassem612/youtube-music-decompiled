package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hqy implements acwm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public hqy(gte gteVar, List list, Map map, int i) {
        this.$cid = i;
        this.a = list;
        this.b = map;
        this.c = gteVar;
    }

    @Override // defpackage.acwm
    public final void a() {
        if (this.$cid == 0) {
            ((hra) this.a).b(hra.b);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.acwm
    public final void b() {
        if (this.$cid == 0) {
            hra hraVar = (hra) this.a;
            hraVar.b(hra.a);
            hqx hqxVar = new hqx((Runnable) this.b, (awoq) null, 0);
            awro.t(hraVar.i, hraVar.h, 0, hqxVar, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [acwn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.acwm
    public final void c(boolean z) {
        int i = this.$cid;
        ?? r1 = this.c;
        if (i != 0) {
            ((vxe) ((gte) r1).a.io()).d(this.a, this.b);
            return;
        }
        hra hraVar = (hra) this.a;
        hraVar.k.o(r1, "");
        if (z && !((hqw) r1).a) {
            hraVar.b(hra.b);
        }
        xgn xgnVarHB = hraVar.g.hB();
        xgnVarHB.p(hra.a, null);
        xgnVarHB.p(hra.b, null);
        xgnVarHB.p(hra.c, null);
    }

    public hqy(hra hraVar, Runnable runnable, hqw hqwVar, int i) {
        this.$cid = i;
        this.a = hraVar;
        this.b = runnable;
        this.c = hqwVar;
    }
}

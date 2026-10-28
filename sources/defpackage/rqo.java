package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rqo implements tnh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public rqo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
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
    @Override // defpackage.tnh
    public final /* synthetic */ void a(Object obj) {
        int i = this.$cid;
        Object obj2 = this.a;
        if (i == 0) {
            xsc xscVar = (xsc) obj;
            rqq rqqVar = (rqq) obj2;
            if (this == rqqVar.d) {
                rqqVar.e.g(xscVar);
                rqqVar.f = rqqVar.h.y(new rqn(this), xscVar.c);
                rqqVar.f.b();
                return;
            }
            return;
        }
        xsc xscVar2 = (xsc) obj;
        gdr gdrVar = (gdr) obj2;
        if (this == gdrVar.m) {
            admu admuVar = gdrVar.l;
            admuVar.clear();
            Context contextRequireContext = gdrVar.requireContext();
            Object obj3 = xscVar2.a;
            admuVar.getClass();
            rme rmeVar = new rme(admuVar, 4);
            rme rmeVar2 = new rme(admuVar, 5);
            admuVar.getClass();
            rpm.a(contextRequireContext, rmeVar, rmeVar2, new rme(admuVar, 6), (wnt) obj3);
            tuk.l(gdrVar.k, false);
        }
    }
}

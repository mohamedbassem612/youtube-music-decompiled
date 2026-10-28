package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rty implements rsu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ abzo c;

    public rty(abzo abzoVar, String str, acfw acfwVar, int i) {
        this.$cid = i;
        this.a = str;
        this.b = acfwVar;
        this.c = abzoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [acfw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awmd, java.lang.Object] */
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
    @Override // defpackage.rsu
    public final void Q() throws Throwable {
        if (this.$cid != 0) {
            Object obj = this.b;
            abzo abzoVar = this.c;
            String str = (String) obj;
            if (abzoVar.B(str)) {
                return;
            }
            abzoVar.x(str);
            return;
        }
        Object obj2 = this.a;
        abzo abzoVar2 = this.c;
        String str2 = (String) obj2;
        if (abzoVar2.D(str2)) {
            abzoVar2.s(str2, this.b);
            abzoVar2.B(str2);
            abzoVar2.t(str2);
        } else {
            if (abzoVar2.B(str2)) {
                return;
            }
            ((acm) abzoVar2.f.io()).d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
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
    @Override // defpackage.rsu
    public final void R() {
        if (this.$cid != 0) {
            Object obj = this.b;
            this.c.n(this.a, (String) obj);
        } else {
            Object obj2 = this.a;
            abzo abzoVar = this.c;
            String str = (String) obj2;
            abzoVar.p(str);
            abzoVar.q(str);
        }
    }

    public rty(abzo abzoVar, String str, List list, int i) {
        this.$cid = i;
        this.b = str;
        this.a = list;
        this.c = abzoVar;
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void s() {
    }
}

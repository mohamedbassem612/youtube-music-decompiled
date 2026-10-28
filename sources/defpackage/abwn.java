package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abwn implements sxu {
    final /* synthetic */ wjf a;
    final /* synthetic */ abwo b;
    final /* synthetic */ abnl c;
    final /* synthetic */ xir d;
    public final /* synthetic */ abwp e;

    public abwn(abwp abwpVar, wjf wjfVar, abwo abwoVar, abnl abnlVar, xir xirVar) {
        this.a = wjfVar;
        this.b = abwoVar;
        this.c = abnlVar;
        this.d = xirVar;
        this.e = abwpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [acey, java.lang.Object] */
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
    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        absh abshVar = (absh) obj2;
        abwp abwpVar = this.e;
        abwk abwkVar = abwpVar.a;
        synchronized (abwkVar) {
            ?? r3 = abwkVar.d;
            if (r3 == 0) {
                return;
            }
            if (abmt.aG(abwpVar.d)) {
                int i = abshVar.c - 1;
                if (i == 0) {
                    wjf wjfVar = this.a;
                    if (aaje.p(wjfVar.t())) {
                        abwpVar.b.execute(afwl.i(new abwm(this, wjfVar, (acey) r3, this.b, this.c, this.d, 0)));
                    } else {
                        abwpVar.d(wjfVar, this.c, this.d, r3);
                    }
                } else if (i != 1) {
                    this.b.a();
                } else {
                    abwpVar.b.execute(afwl.i(new zdy(this, this.a, (Object) r3, this.b, abshVar, 6)));
                }
            } else {
                int i2 = abshVar.c - 1;
                if (i2 == 0) {
                    abwpVar.d(this.a, this.c, this.d, r3);
                } else if (i2 != 1) {
                    this.b.a();
                } else {
                    wjf wjfVar2 = this.a;
                    if (!abwpVar.f(wjfVar2, r3, this.b)) {
                        abwpVar.c(wjfVar2, abshVar.b, r3);
                    }
                }
            }
        }
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        zvp.a(zvn.b, zvm.k, "Could not get playability result: ".concat(String.valueOf(String.valueOf(exc))));
    }
}

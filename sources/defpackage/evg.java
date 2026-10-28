package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class evg implements evj, eug {
    private final List a;
    private final evk b;
    private final evi c;
    private int d = -1;
    private ett e;
    private List f;
    private int g;
    private File h;
    private volatile hed i;

    public evg(List list, evk evkVar, evi eviVar) {
        this.a = list;
        this.b = evkVar;
        this.c = eviVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [euh, java.lang.Object] */
    @Override // defpackage.evj
    public final void a() {
        hed hedVar = this.i;
        if (hedVar != null) {
            hedVar.a.gI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [euh, java.lang.Object] */
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
    @Override // defpackage.eug
    public final void b(Object obj) {
        this.c.d(this.e, obj, this.i.a, 3, this.e);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [euh, java.lang.Object] */
    @Override // defpackage.evj
    public final boolean c() {
        boolean z;
        while (true) {
            z = false;
            if (this.f != null && d()) {
                this.i = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    eyv eyvVar = (eyv) list.get(i);
                    File file = this.h;
                    evk evkVar = this.b;
                    this.i = eyvVar.b(file, evkVar.e, evkVar.f, evkVar.h);
                    if (this.i != null && evkVar.g(this.i.a.a())) {
                        this.i.a.f(evkVar.n, this);
                        z = true;
                    }
                }
                break;
            }
            int i2 = this.d + 1;
            this.d = i2;
            List list2 = this.a;
            if (i2 >= list2.size()) {
                break;
            }
            ett ettVar = (ett) list2.get(this.d);
            evk evkVar2 = this.b;
            File fileA = evkVar2.c().a(new evh(ettVar, evkVar2.m));
            this.h = fileA;
            if (fileA != null) {
                this.e = ettVar;
                this.f = evkVar2.f(fileA);
                this.g = 0;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [euh, java.lang.Object] */
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
    @Override // defpackage.eug
    public final void e(Exception exc) {
        this.c.b(this.e, exc, this.i.a, 3);
    }
}

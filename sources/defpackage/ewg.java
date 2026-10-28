package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ewg implements evj, eug {
    private final evi a;
    private final evk b;
    private int c;
    private int d = -1;
    private ett e;
    private List f;
    private int g;
    private File h;
    private ewh i;
    private volatile hed j;

    public ewg(evk evkVar, evi eviVar) {
        this.b = evkVar;
        this.a = eviVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [euh, java.lang.Object] */
    @Override // defpackage.evj
    public final void a() {
        hed hedVar = this.j;
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
        this.a.d(this.e, obj, this.j.a, 4, this.i);
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [euh, java.lang.Object] */
    @Override // defpackage.evj
    public final boolean c() {
        List arrayList;
        evk evkVar = this.b;
        List listD = evkVar.d();
        boolean z = false;
        if (!listD.isEmpty()) {
            jqs jqsVarB = evkVar.c.b();
            Class<?> cls = evkVar.d.getClass();
            Class cls2 = evkVar.g;
            Class cls3 = evkVar.j;
            Object obj = jqsVarB.i;
            ffq ffqVar = (ffq) ((AtomicReference) ((gev) obj).b).getAndSet(null);
            if (ffqVar == null) {
                ffqVar = new ffq(cls, cls2, cls3);
            } else {
                ffqVar.a(cls, cls2, cls3);
            }
            Object obj2 = ((gev) obj).a;
            synchronized (obj2) {
                arrayList = (List) ((aha) obj2).get(ffqVar);
            }
            ((AtomicReference) ((gev) obj).b).set(ffqVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                Iterator it = ((pj) jqsVarB.a).R(cls).iterator();
                while (it.hasNext()) {
                    for (Class cls4 : ((gev) jqsVarB.e).f((Class) it.next(), cls2)) {
                        if (!((ci) jqsVarB.d).T(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                Object obj3 = jqsVarB.i;
                List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                Object obj4 = ((gev) obj3).a;
                synchronized (obj4) {
                    ((aha) obj4).put(new ffq(cls, cls2, cls3), listUnmodifiableList);
                }
            }
            if (!arrayList.isEmpty()) {
                while (true) {
                    if (this.f != null && d()) {
                        this.j = null;
                        while (!z && d()) {
                            List list = this.f;
                            int i = this.g;
                            this.g = i + 1;
                            eyv eyvVar = (eyv) list.get(i);
                            File file = this.h;
                            evk evkVar2 = this.b;
                            this.j = eyvVar.b(file, evkVar2.e, evkVar2.f, evkVar2.h);
                            if (this.j != null && evkVar2.g(this.j.a.a())) {
                                this.j.a.f(evkVar2.n, this);
                                z = true;
                            }
                        }
                        break;
                    }
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 >= arrayList.size()) {
                        int i3 = this.c + 1;
                        this.c = i3;
                        if (i3 >= listD.size()) {
                            break;
                        }
                        this.d = 0;
                    }
                    ett ettVar = (ett) listD.get(this.c);
                    Class cls5 = (Class) arrayList.get(this.d);
                    evk evkVar3 = this.b;
                    this.i = new ewh(evkVar3.h(), ettVar, evkVar3.m, evkVar3.e, evkVar3.f, evkVar3.a(cls5), cls5, evkVar3.h);
                    File fileA = evkVar3.c().a(this.i);
                    this.h = fileA;
                    if (fileA != null) {
                        this.e = ettVar;
                        this.f = evkVar3.f(fileA);
                        this.g = 0;
                    }
                }
            } else {
                evk evkVar4 = this.b;
                if (!File.class.equals(evkVar4.j)) {
                    throw new IllegalStateException("Failed to find any load path from " + String.valueOf(evkVar4.d.getClass()) + " to " + String.valueOf(evkVar4.j));
                }
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
        this.a.b(this.i, exc, this.j.a, 4);
    }
}

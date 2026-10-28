package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ewk implements evj, evi {
    public final evk a;
    public final evi b;
    public volatile Object c;
    public volatile evh d;
    private volatile int e;
    private volatile evg f;
    private volatile hed g;

    public ewk(evk evkVar, evi eviVar) {
        this.a = evkVar;
        this.b = eviVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [euh, java.lang.Object] */
    @Override // defpackage.evj
    public final void a() {
        hed hedVar = this.g;
        if (hedVar != null) {
            hedVar.a.gI();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [euh, java.lang.Object] */
    @Override // defpackage.evi
    public final void b(ett ettVar, Exception exc, euh euhVar, int i) {
        this.b.b(ettVar, exc, euhVar, this.g.a.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [ett, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [ett, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [ett, java.lang.Object] */
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
    @Override // defpackage.evj
    public final boolean c() throws Throwable {
        boolean z;
        boolean z2 = false;
        if (this.c != null) {
            Object obj = this.c;
            this.c = null;
            try {
                double d = ffn.a;
                SystemClock.elapsedRealtimeNanos();
                try {
                    evk evkVar = this.a;
                    euj eujVarB = evkVar.c.b().b(obj);
                    Object objA = eujVarB.a();
                    eth ethVarQ = ((ci) evkVar.c.b().j).Q(objA.getClass());
                    if (ethVarQ == null) {
                        throw new esk(objA.getClass());
                    }
                    xsc xscVar = new xsc((Object) ethVarQ, objA, (Object) evkVar.h, (byte[]) null);
                    evh evhVar = new evh(this.g.b, evkVar.m);
                    exe exeVarC = evkVar.c();
                    exeVarC.c(evhVar, xscVar);
                    if (exeVarC.a(evhVar) == null) {
                        try {
                            this.b.d(this.g.b, eujVarB.a(), this.g.a, this.g.a.g(), this.g.b);
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (!z) {
                                this.g.a.d();
                            }
                            throw th;
                        }
                    }
                    this.d = evhVar;
                    this.f = new evg(Collections.singletonList(this.g.b), evkVar, this);
                    this.g.a.d();
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f != null && this.f.c()) {
            return true;
        }
        this.f = null;
        this.g = null;
        while (!z2) {
            int i = this.e;
            evk evkVar2 = this.a;
            if (i >= evkVar2.e().size()) {
                break;
            }
            List listE = evkVar2.e();
            int i2 = this.e;
            this.e = i2 + 1;
            this.g = (hed) listE.get(i2);
            if (this.g != null && (evkVar2.o.c(this.g.a.g()) || evkVar2.g(this.g.a.a()))) {
                this.g.a.f(evkVar2.n, new ewj(this, this.g));
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [euh, java.lang.Object] */
    @Override // defpackage.evi
    public final void d(ett ettVar, Object obj, euh euhVar, int i, ett ettVar2) {
        this.b.d(ettVar, obj, euhVar, this.g.a.g(), ettVar);
    }

    final boolean e(hed hedVar) {
        hed hedVar2 = this.g;
        return hedVar2 != null && hedVar2 == hedVar;
    }
}

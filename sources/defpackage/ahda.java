package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahda implements aheh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public ahda(ahdm ahdmVar, Executor executor, int i) {
        this.$cid = i;
        this.a = ahdmVar;
        this.b = executor;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        if (this.$cid != 0) {
            Object obj = this.b;
            hej hejVar = (hej) obj;
            if (hejVar.g != hei.e) {
                Object obj2 = this.a;
                hejVar.k(hei.d);
                gmy gmyVar = (gmy) obj2;
                hejVar.i = gmyVar.j.b(th);
                hejVar.n = th;
                heh hehVar = (heh) obj;
                hehVar.d = null;
                gmyVar.c(hehVar);
                Context context = gmyVar.c;
                if (!txz.d(context) && !txz.g(context) && !txz.f(context) && ((th instanceof tmg) || (th instanceof tnc))) {
                    gmyVar.o.d(gmyVar.d, null);
                }
            }
            ((agrc) ((agrc) ((agrc) gmy.a.c()).j(th)).k("com/google/android/apps/youtube/music/browse/BrowseController", "onBrowseErrorResponse", (char) 538, "BrowseController.java")).w("Encountered error for browse model: %s", obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
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
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        if (this.$cid == 0) {
            ((ahdm) this.a).c.b.a.j((AutoCloseable) obj, this.b);
            return;
        }
        gnq gnqVar = (gnq) obj;
        Object obj2 = this.b;
        hej hejVar = (hej) obj2;
        if (hejVar.g != hei.e) {
            Object obj3 = this.a;
            hejVar.k(hei.c);
            hejVar.h = gnqVar.a;
            gnn gnnVar = gnqVar.b;
            heh hehVar = (heh) obj2;
            hehVar.a = gnnVar;
            hehVar.d = null;
            hejVar.i = null;
            gmy gmyVar = (gmy) obj3;
            gmyVar.c(hehVar);
            if (hehVar.e() && gnnVar.d) {
                heh hehVarA = hehVar.a();
                hehVarA.g();
                hehVarA.h(2);
                gmyVar.d(hehVarA, 4);
            }
        }
    }

    public ahda(gmy gmyVar, heh hehVar, int i) {
        this.$cid = i;
        this.b = hehVar;
        this.a = gmyVar;
    }
}

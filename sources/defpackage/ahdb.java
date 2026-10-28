package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahdb implements ahcy {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public ahdb(afvl afvlVar, ahcy ahcyVar, int i) {
        this.$cid = i;
        this.a = afvlVar;
        this.b = ahcyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ahdf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [afvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ahdd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ahcy, java.lang.Object] */
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
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((ahdm) this.b).c.b.a(this.a, obj);
        }
        if (i != 1) {
            ahde ahdeVar = new ahde();
            ?? r1 = this.a;
            ahde ahdeVar2 = ((ahdm) this.b).c.b;
            try {
                ahdm ahdmVarA = r1.a(ahdeVar.a, obj);
                ahdmVarA.e(ahdeVar);
                return ahdmVarA.c.c;
            } finally {
                ahdeVar2.b(ahdeVar, MoreExecutors.directExecutor());
            }
        }
        afvh afvhVar = (afvh) afty.d.get();
        afvl afvlVarE = afty.e(afvhVar, this.a);
        try {
            ListenableFuture listenableFutureA = this.b.a(obj);
            if (listenableFutureA == null) {
                throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
            }
            afty.e(afvhVar, afvlVarE);
            return listenableFutureA;
        } catch (Throwable th) {
            try {
                aftt.a(th);
                throw th;
            } catch (Throwable th2) {
                afty.e(afvhVar, afvlVarE);
                throw th2;
            }
        }
    }

    public final String toString() {
        int i = this.$cid;
        if (i == 0) {
            return this.a.toString();
        }
        if (i != 1) {
            return this.a.toString();
        }
        return "propagating=[" + this.b + ']';
    }

    public ahdb(ahdm ahdmVar, Object obj, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = ahdmVar;
    }
}

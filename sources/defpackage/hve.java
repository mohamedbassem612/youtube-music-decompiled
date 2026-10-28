package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hve implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hve(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, zwa] */
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
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        ListenableFuture listenableFuture;
        int i = this.$cid;
        int i2 = 8;
        if (i == 0) {
            if (((Boolean) obj).booleanValue()) {
                return;
            }
            hvh hvhVar = (hvh) this.a;
            aarj aarjVar = (aarj) hvhVar.e.io();
            zwb zwbVar = aarjVar.f;
            int i3 = 6;
            if (zwbVar.u() && ((listenableFuture = aarjVar.i) == null || listenableFuture.isCancelled() || aarjVar.i.isDone())) {
                aarjVar.i = afxd.f(afxd.f(((aald) aarjVar.e.io()).d(zwbVar.e())).g(new aaoz(aarjVar, 4), MoreExecutors.directExecutor())).h(new aajs(aarjVar, 7), MoreExecutors.directExecutor());
                taf.i(aarjVar.i, MoreExecutors.directExecutor(), new ztb(8), new yqj(aarjVar, 6), null);
            }
            ?? r7 = this.b;
            final long epochMilli = hvhVar.c.f().toEpochMilli();
            taf.i(hvhVar.a(r7), hvhVar.h, new hou(i3), new tae() { // from class: hvd
                @Override // defpackage.tae, defpackage.twi
                public final void a(Object obj2) {
                    long j = hvh.a;
                    taf.j(((ayq) ((iqk) obj2).a.io()).j(new iqh(epochMilli, 0)), new ihw(7));
                }
            }, null);
            return;
        }
        int i4 = 0;
        if (i == 1) {
            agke agkeVar = (agke) obj;
            if (agkeVar.isEmpty()) {
                return;
            }
            ((hmf) this.a).e.k(this.b).c(new hbn(agkeVar, i2)).F(new hrj(1), new hmd(i4));
            return;
        }
        zfp zfpVar = (zfp) obj;
        Object obj2 = this.b;
        Object obj3 = this.a;
        synchronized (obj3) {
            ((zfo) obj3).l = 0;
            ((zfo) obj3).k = null;
            if (!((zfo) obj3).c.aa().k || ((zfo) obj3).j.a() || !zfpVar.a()) {
                ((zfo) obj3).j = zfpVar;
            }
            ((zfo) obj3).d(zik.aB((apbm) obj2, ((zfo) obj3).l, ((zfo) obj3).h));
        }
    }
}

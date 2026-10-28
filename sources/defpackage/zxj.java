package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zxj {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/net/ping/HttpPingService");
    public final zxs b;
    public final zrw c;
    public final tao d;
    public final zxp e;
    public final tfq f;
    private final zwb g;
    private final tqj h;
    private final Set i;
    private final tgg j;
    private final mbc k;
    private final Executor l;
    private final Executor m;
    private final Executor n;
    private final awmd o;
    private final vxz p;
    private final vxz q;

    public zxj(zwb zwbVar, tgg tggVar, zxs zxsVar, mbc mbcVar, tfq tfqVar, zrw zrwVar, Executor executor, Executor executor2, tao taoVar, zxp zxpVar, vxz vxzVar, tqj tqjVar, Set set, vxz vxzVar2, awmd awmdVar) {
        this.g = zwbVar;
        this.j = tggVar;
        this.b = zxsVar;
        this.k = mbcVar;
        this.f = tfqVar;
        this.c = zrwVar;
        this.l = executor;
        this.m = executor2;
        this.n = new ahfg(executor2);
        this.d = taoVar;
        this.e = zxpVar;
        this.p = vxzVar;
        this.h = tqjVar;
        this.i = set;
        this.q = vxzVar2;
        this.o = awmdVar;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final defpackage.zxf a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public final void b(zrx zrxVar, zxi zxiVar, tng tngVar) {
        boolean zD = zrxVar != null ? zrxVar.d() : this.c.g();
        if (zD && zxiVar.d) {
            tqj tqjVar = this.h;
            int i = tqr.a;
            if (tqjVar.k(1073830251)) {
                zxq zxqVar = (zxq) this.o.io();
                zup zupVarQ = zxqVar.e.q();
                zupVarQ.getClass();
                zxo zxoVar = new zxo(zupVarQ, zxqVar);
                zxoVar.e = this;
                zxoVar.f = zrxVar;
                zxoVar.g = zxiVar;
                zxoVar.h = tngVar;
                ztf ztfVar = zxoVar.k.e;
                zxoVar.l = ztfVar.a();
                ztfVar.k(zxoVar);
                return;
            }
        }
        zxf zxfVarA = a(zrxVar, zxiVar, tngVar);
        if (zxfVarA != null) {
            boolean z = zxiVar.d;
            if (!zD || !z || this.b == zxs.d) {
                this.j.b(zxfVarA);
                return;
            }
            zgc zgcVar = new zgc(this, zxfVarA, 14);
            if (this.c.h()) {
                this.n.execute(afwl.i(zgcVar));
            } else {
                this.m.execute(afwl.i(zgcVar));
            }
        }
    }
}

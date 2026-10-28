package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cig implements cwj {
    public final con a;
    final /* synthetic */ cih c;
    private final ccu d = new ccu();
    private final cxn e = new cxn();
    public long b = -9223372036854775807L;

    public cig(cih cihVar, cra craVar) {
        this.c = cihVar;
        this.a = new con(craVar, null, null);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ int a(brv brvVar, int i, boolean z) {
        return g(brvVar, i, z);
    }

    @Override // defpackage.cwj
    public final void b(bse bseVar) {
        this.a.b(bseVar);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void c(bwb bwbVar, int i) {
        d(bwbVar, i, 0);
    }

    @Override // defpackage.cwj
    public final void d(bwb bwbVar, int i, int i2) {
        this.a.d(bwbVar, i, 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cwj
    public final void e(long j, int i, int i2, int i3, cwi cwiVar) {
        long jA;
        con conVar = this.a;
        conVar.e(j, i, i2, i3, cwiVar);
        while (conVar.F(false)) {
            cxn cxnVar = this.e;
            cxnVar.clear();
            if (conVar.l(this.d, cxnVar, 0, false) == -4) {
                cxnVar.flip();
            } else {
                cxnVar = null;
            }
            if (cxnVar != null) {
                cih cihVar = this.c;
                long j2 = cxnVar.timeUs;
                bsx bsxVarA = cihVar.b.a(cxnVar);
                if (bsxVarA != null) {
                    cxt cxtVar = (cxt) bsxVarA.b(0);
                    String str = cxtVar.a;
                    String str2 = cxtVar.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jA = bwp.A(bwp.L(cxtVar.e));
                        } catch (bsz unused) {
                            jA = -9223372036854775807L;
                        }
                        if (jA != -9223372036854775807L) {
                            czo czoVar = new czo(j2, jA);
                            Handler handler = this.c.c;
                            handler.sendMessage(handler.obtainMessage(1, czoVar));
                        }
                    }
                }
            }
        }
        con conVar2 = this.a;
        conVar2.a.c(conVar2.m());
    }

    @Override // defpackage.cwj
    public final int g(brv brvVar, int i, boolean z) {
        return this.a.g(brvVar, i, z);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void f() {
    }
}

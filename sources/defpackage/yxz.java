package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yxz implements cgw {
    private final yye a;
    private final cgw b;

    public yxz(yye yyeVar, cgw cgwVar) {
        this.a = yyeVar;
        this.b = cgwVar;
    }

    @Override // defpackage.cgw
    public final cfl a(bse bseVar, brq brqVar) {
        cfl cflVarA = this.b.a(bseVar, brqVar);
        boolean z = cflVarA.b;
        yye yyeVar = this.a;
        if (z) {
            zjr zjrVar = yyeVar.d;
            if (zjrVar.y && (Build.VERSION.SDK_INT < 33 || !zjrVar.S().ak)) {
                cfk cfkVar = new cfk(cflVarA);
                cfkVar.b = false;
                cflVarA = cfkVar.a();
            }
        }
        zcf zcfVar = yyeVar.m;
        if (zcfVar != null) {
            String str = bseVar.a;
            boolean z2 = cflVarA.b;
            int i = zic.a;
            zcfVar.Z.l("dsao", "format." + str + ";fs." + (true != z2 ? "0" : "1") + ";gs." + (true != cflVarA.c ? "0" : "1") + ";scs." + (true == cflVarA.d ? "1" : "0"));
        }
        return cflVarA;
    }
}

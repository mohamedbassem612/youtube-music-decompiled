package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wrg extends wnn {
    public boolean c;
    private final wnh d;
    private final Executor e;
    private final boolean f;
    private final mbc g;
    private final vxz h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrg(wlp wlpVar, abxv abxvVar, tqj tqjVar, awmd awmdVar, awmd awmdVar2, vxu vxuVar, Executor executor, mbc mbcVar, vxz vxzVar) {
        super(abxvVar, tqjVar.k(1073820297) ? (tgg) awmdVar2.io() : (tgg) awmdVar.io());
        int i = tqr.a;
        boolean z = false;
        this.d = f(alox.a, wlpVar, new wql(3), new wre(0));
        ajvu ajvuVarC = vxuVar.c();
        if (ajvuVarC != null) {
            anhb anhbVar = ajvuVarC.j;
            akwd akwdVar = (anhbVar == null ? anhb.a : anhbVar).i;
            z = (akwdVar == null ? akwd.a : akwdVar).f;
        }
        this.f = z;
        this.e = executor;
        this.g = mbcVar;
        this.h = vxzVar;
        this.c = true;
    }

    public final wrf a(zwa zwaVar, String str, boolean z) {
        boolean z2 = false;
        if (this.c && this.h.m(21, 45386336L)) {
            z2 = true;
        }
        mbc mbcVar = this.g;
        boolean z3 = this.f;
        return new wrf(this.b, zwaVar, str, z3, z, mbcVar, z2);
    }

    public final ListenableFuture b(wrf wrfVar) {
        return this.d.b(wrfVar, this.e, null);
    }
}

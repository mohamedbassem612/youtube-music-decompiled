package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmz extends fkx {

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int a;

    @fmt(a = 10)
    @fmu(a = fmv.a)
    public fgy b;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int c;

    public mmz() {
        super("CollectionItemInfoAccessibilityWrapper");
    }

    @Override // defpackage.fgy
    protected final Object A(fip fipVar, Object obj) {
        int i = fipVar.c;
        if (i == -1933296085) {
            acv acvVar = (acv) obj;
            fiu fiuVar = fipVar.b;
            Object obj2 = acvVar.c;
            Object obj3 = acvVar.b;
            Object obj4 = acvVar.a;
            mmz mmzVar = (mmz) fiuVar;
            int i2 = mmzVar.c;
            int i3 = mmzVar.a;
            bbz bbzVar = (bbz) obj4;
            ((axx) obj2).onInitializeAccessibilityNodeInfo((View) obj3, bbzVar);
            bbzVar.y(zs.f(i2, i3));
        } else if (i == -1048037474) {
            gzj.bO((fhd) fipVar.d[0], (isw) obj);
        }
        return null;
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        fgy fgyVar = this.b;
        fmc fmcVarAE = fmd.aE(fhdVar);
        fmcVarAE.S(o(mmz.class, "CollectionItemInfoAccessibilityWrapper", fhdVar, -1933296085, new Object[]{fhdVar}));
        fmcVarAE.c(fgyVar);
        return fmcVarAE.a();
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        mmz mmzVar = (mmz) super.l();
        fgy fgyVar = mmzVar.b;
        mmzVar.b = fgyVar != null ? fgyVar.l() : null;
        return mmzVar;
    }
}

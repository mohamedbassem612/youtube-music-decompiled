package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fof extends fhd {
    public foq l;
    public WeakReference m;
    public fip n;
    public final dov o;

    /* JADX WARN: Illegal instructions before constructor call */
    public fof(fhd fhdVar) {
        Context context = fhdVar.a;
        String strN = fhdVar.n();
        omj omjVarW = fhdVar.w();
        fly flyVarJ = fhdVar.j();
        super(context, strN, omjVarW, null);
        this.e = flyVarJ;
        this.o = new dov((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    public static fof B(fof fofVar, foe foeVar) {
        fof fofVar2 = new fof(fofVar);
        fofVar2.l = fofVar.l;
        fofVar2.n = fofVar.n;
        fofVar2.m = new WeakReference(foeVar);
        return fofVar2;
    }

    public final foe A() {
        return (foe) this.m.get();
    }

    @Override // defpackage.fhd
    public final String m() {
        foe foeVar = (foe) this.m.get();
        if (foeVar != null) {
            return foeVar.k;
        }
        throw new IllegalStateException("getGlobalKey cannot be accessed from a SectionContext without a scope");
    }

    @Override // defpackage.fhd
    public final void x(aero aeroVar, String str) {
        foe foeVar = (foe) this.m.get();
        foq foqVar = this.l;
        if (foqVar == null || foeVar == null) {
            return;
        }
        if (ftj.a) {
            this.l.hashCode();
            aeroVar.getClass().getName();
        }
        foqVar.l(foeVar.k, aeroVar, str);
    }

    @Override // defpackage.fhd
    public final void z(aero aeroVar, String str) {
        foe foeVar = (foe) this.m.get();
        foq foqVar = this.l;
        if (foqVar == null || foeVar == null) {
            return;
        }
        if (ftj.a) {
            this.l.hashCode();
            aeroVar.getClass().getName();
        }
        foqVar.k(foeVar.k, aeroVar, str);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fow extends foe {

    @fmt(a = 10)
    @fmu(a = fmv.a)
    fgy m;

    public fow() {
        super("SingleComponentSection");
    }

    @Override // defpackage.foe
    public final /* bridge */ /* synthetic */ foe c(boolean z) {
        fow fowVar = (fow) super.c(z);
        fgy fgyVar = fowVar.m;
        fowVar.m = fgyVar != null ? fgyVar.l() : null;
        return fowVar;
    }

    @Override // defpackage.foe
    /* JADX INFO: renamed from: f */
    public final boolean a(foe foeVar) {
        if (this == foeVar) {
            return true;
        }
        if (foeVar != null && getClass() == foeVar.getClass()) {
            fow fowVar = (fow) foeVar;
            fgy fgyVar = this.m;
            if (fgyVar != null) {
                fgy fgyVar2 = fowVar.m;
                boolean z = fna.a;
                if (fgyVar.g(fgyVar2)) {
                    return true;
                }
            } else if (fowVar.m == null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.foh
    public final boolean k() {
        return true;
    }

    @Override // defpackage.foh
    protected final void r(fof fofVar, afts aftsVar, foe foeVar, foe foeVar2) {
        fow fowVar = (fow) foeVar;
        fow fowVar2 = (fow) foeVar2;
        fif fifVar = new fif(fowVar == null ? null : fowVar.m, fowVar2 == null ? null : fowVar2.m);
        fif fifVar2 = new fif(null, null);
        fif fifVar3 = new fif(null, null);
        fif fifVar4 = new fif(null, null);
        fif fifVar5 = new fif(null, null);
        fif fifVar6 = new fif(null, null);
        fif fifVar7 = new fif(null, null);
        fif fifVar8 = new fif(null, null);
        Object obj = fifVar6.a;
        Object obj2 = fifVar6.b;
        fgy fgyVar = (fgy) fifVar.a;
        fgy fgyVar2 = (fgy) fifVar.b;
        boolean z = false;
        if (fgyVar == null) {
            if (fgyVar2 == null) {
                return;
            }
        } else if (fgyVar2 == null) {
            aftsVar.q(0, obj);
            return;
        }
        Object obj3 = fifVar2.b;
        boolean zBooleanValue = obj3 != null ? ((Boolean) obj3).booleanValue() : false;
        Object obj4 = fifVar3.b;
        int iIntValue = obj4 != null ? ((Integer) obj4).intValue() : 1;
        Object obj5 = fifVar4.b;
        boolean zBooleanValue2 = obj5 != null ? ((Boolean) obj5).booleanValue() : false;
        if (fgyVar == null) {
            fqc fqcVar = new fqc();
            gzj.aP(fqcVar, (Map) fifVar5.b, fifVar7);
            fqcVar.b = fgyVar2;
            fqcVar.c(zBooleanValue);
            fqcVar.d(iIntValue);
            fqcVar.b(zBooleanValue2);
            fqcVar.c = (String) fifVar8.b;
            aftsVar.r(0, new fqe(fqcVar), fofVar.j(), obj2);
            return;
        }
        Object obj6 = fifVar2.a;
        boolean zBooleanValue3 = obj6 != null ? ((Boolean) obj6).booleanValue() : false;
        Object obj7 = fifVar3.a;
        int iIntValue2 = obj7 != null ? ((Integer) obj7).intValue() : 1;
        Object obj8 = fifVar4.a;
        boolean zBooleanValue4 = obj8 != null ? ((Boolean) obj8).booleanValue() : false;
        Map map = (Map) fifVar5.a;
        Map map2 = (Map) fifVar5.b;
        if (map == map2) {
            z = true;
        } else if (map == null) {
            z = false;
        } else if (map2 != null) {
            if (map.size() == map2.size()) {
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!gzj.bH(entry.getValue(), map2.get(entry.getKey()))) {
                        }
                    } else {
                        z = true;
                    }
                }
            }
            z = false;
        }
        if (zBooleanValue3 == zBooleanValue && iIntValue2 == iIntValue && zBooleanValue4 == zBooleanValue2 && z) {
            boolean z2 = fna.a;
            if (fgyVar.g(fgyVar2)) {
                return;
            }
        }
        fqc fqcVar2 = new fqc();
        gzj.aP(fqcVar2, (Map) fifVar5.b, fifVar7);
        fqcVar2.b = fgyVar2;
        fqcVar2.c(zBooleanValue);
        fqcVar2.d(iIntValue);
        fqcVar2.b(zBooleanValue2);
        aftsVar.s(0, new fqe(fqcVar2), fofVar.j(), obj, obj2);
    }
}

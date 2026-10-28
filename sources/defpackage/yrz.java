package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yrz implements tjl {
    private final awmd a;
    private final zjr b;
    private final zjk c;
    private final zgm d;
    private final vyo e;
    private final mbc f;
    private final vxu g;
    private final yql h;
    private final vxz i;
    private final abxv j;
    private final hed k;
    private final hed l;
    private final zik m;

    public yrz(awmd awmdVar, vxz vxzVar, zjr zjrVar, zjk zjkVar, abxv abxvVar, zgm zgmVar, vyo vyoVar, vxu vxuVar, mbc mbcVar, ci ciVar, yql yqlVar, hed hedVar, hed hedVar2, zik zikVar) {
        awmdVar.getClass();
        zjrVar.getClass();
        zjkVar.getClass();
        abxvVar.getClass();
        zgmVar.getClass();
        vyoVar.getClass();
        vxuVar.getClass();
        mbcVar.getClass();
        ciVar.getClass();
        hedVar2.getClass();
        this.a = awmdVar;
        this.i = vxzVar;
        this.b = zjrVar;
        this.c = zjkVar;
        this.j = abxvVar;
        this.d = zgmVar;
        this.e = vyoVar;
        this.g = vxuVar;
        this.f = mbcVar;
        this.h = yqlVar;
        this.k = hedVar;
        this.l = hedVar2;
        this.m = zikVar;
    }

    @Override // defpackage.tjl
    public final boolean a(tns tnsVar, List list, Throwable th) {
        yrr yrrVarW;
        if (this.b.cM()) {
            return false;
        }
        if ((th instanceof ysd) || (th.getCause() instanceof ysd)) {
            if (((yrw) tnsVar).W() == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tns tnsVar2 = (tns) it.next();
                yrw yrwVar = tnsVar2 instanceof yrw ? (yrw) tnsVar2 : null;
                if (yrwVar == null || (yrrVarW = yrwVar.W()) == null || !yrrVarW.c()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.tjl
    public final boolean b(tns tnsVar) {
        return (tnsVar instanceof yrw) && ((yrw) tnsVar).W() != null;
    }

    @Override // defpackage.tjl
    public final tjm c(tns tnsVar, tlj tljVar, tit titVar, tmt tmtVar) {
        yrw yrwVar = (yrw) tnsVar;
        yrr yrrVarW = yrwVar.W();
        if (yrrVarW != null) {
            return new ysf(tnsVar, yrrVarW, tljVar, yrwVar, this.b, this.c, this.j, this.d, this.e, this.g, this.f, this.h, this.k, this.l, this.m, this.a, this.i);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}

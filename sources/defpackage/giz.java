package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class giz implements aupr {
    private final ght a;
    private final gja b;
    private final int c;
    private final gkg d;
    private final gjt e;

    public giz(ght ghtVar, gkg gkgVar, gjt gjtVar, gja gjaVar, int i) {
        this.a = ghtVar;
        this.d = gkgVar;
        this.e = gjtVar;
        this.b = gjaVar;
        this.c = i;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object vgeVar;
        Object aehsVar;
        switch (this.c) {
            case 0:
                vgeVar = new vge((Context) this.e.e.io(), (Executor) this.a.u.io());
                return vgeVar;
            case 1:
                gjt gjtVar = this.e;
                gja gjaVar = this.b;
                vgeVar = new via(gjtVar.a(), gjaVar.a, (vge) gjaVar.c.io(), (zf) gjaVar.d.io(), (vhn) gjaVar.e.io(), (xgm) gjtVar.D.io(), 1);
                return vgeVar;
            case 2:
                ght ghtVar = this.a;
                qcb qcbVar = (qcb) ghtVar.yO.io();
                return new zf(qcbVar);
            case 3:
                vgeVar = new vhn((Context) this.e.e.io(), (Handler) this.a.cY.io());
                return vgeVar;
            case 4:
                gja gjaVar2 = this.b;
                ght ghtVar2 = gjaVar2.b;
                xsc xscVar = new xsc((awmd) ghtVar2.kk, (awmd) gjaVar2.t.ca, (awmd) ghtVar2.a.iZ, (short[]) null);
                gjt gjtVar2 = this.e;
                ght ghtVar3 = this.a;
                Activity activityA = gjtVar2.a();
                vyo vyoVar = (vyo) ghtVar3.av.io();
                vhd vhdVarA = gjaVar2.a();
                zf zfVar = (zf) gjaVar2.d.io();
                vhn vhnVar = (vhn) gjaVar2.e.io();
                ghx ghxVar = ghtVar3.a;
                return new vgw(xscVar, activityA, gjaVar2.a, vyoVar, vhdVarA, zfVar, vhnVar, (zs) ghxVar.ja.io(), (aebx) ghxVar.jc.io(), (xgm) gjtVar2.D.io());
            case 5:
                gja gjaVar3 = this.b;
                xpl xplVar = new xpl((awmd) gjaVar3.t.e, (awmd) gjaVar3.j);
                gjt gjtVar3 = this.e;
                cf cfVar = (cf) gjtVar3.k.io();
                ght ghtVar4 = this.a;
                gjaVar3.a();
                vgeVar = new vho(xplVar, cfVar);
                return vgeVar;
            case 6:
                gjt gjtVar4 = this.e;
                gja gjaVar4 = this.b;
                ght ghtVar5 = this.a;
                aehsVar = new aehs(gjtVar4.e, gjaVar4.h, gjtVar4.aS, gjtVar4.i, ghtVar5.aZ, ghtVar5.aR, ghtVar5.um, ghtVar5.cY, gjaVar4.i, (byte[]) null, (byte[]) null);
                return aehsVar;
            case 7:
                vgeVar = new ahek(this.e.d, (tqj) this.a.q.io());
                return vgeVar;
            case 8:
                ght ghtVar6 = this.a;
                vxu vxuVar = (vxu) ghtVar6.at.io();
                vyo vyoVar2 = (vyo) ghtVar6.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar2, "SuggestClient");
            case 9:
                gjt gjtVar5 = this.e;
                cf cfVar2 = (cf) gjtVar5.k.io();
                gja gjaVar5 = this.b;
                vhd vhdVarA2 = gjaVar5.a();
                ght ghtVar7 = this.a;
                gjaVar5.b();
                this.d.o();
                aehsVar = new xpl(cfVar2, vhdVarA2, (short[]) null);
                return aehsVar;
            case 10:
                gja gjaVar6 = this.b;
                vgeVar = new via((vic) gjaVar6.n.io(), gjaVar6.a, (Executor) this.a.B.io(), (vhn) gjaVar6.e.io(), (xgm) this.e.D.io(), 0);
                return vgeVar;
            case 11:
                Context context = (Context) this.e.e.io();
                ght ghtVar8 = this.a;
                vgeVar = new vic(context, (adhv) ghtVar8.rB.io(), (Executor) ghtVar8.u.io(), (aeiv) this.b.m.io());
                return vgeVar;
            case 12:
                ght ghtVar9 = this.a;
                return new aeiv((Executor) ghtVar9.u.io(), (qcb) ghtVar9.yO.io());
            case 13:
                gjt gjtVar6 = this.e;
                gja gjaVar7 = this.b;
                aehsVar = new vil(gjtVar6.a(), (zf) gjaVar7.d.io(), gjaVar7.a, (zs) this.a.a.ja.io(), 1);
                return aehsVar;
            case 14:
                gjt gjtVar7 = this.e;
                gja gjaVar8 = this.b;
                Activity activityA2 = gjtVar7.a();
                zf zfVar2 = (zf) gjaVar8.d.io();
                aehsVar = new vie(activityA2, zfVar2, gjaVar8.a, (xgm) gjtVar7.D.io(), (vhn) gjaVar8.e.io());
                return aehsVar;
            case 15:
                cf cfVar3 = (cf) this.e.k.io();
                gja gjaVar9 = this.b;
                return new vik(cfVar3, gjaVar9.a, (zf) gjaVar9.d.io(), (adhv) this.a.rB.io(), gjaVar9.b());
            default:
                gjt gjtVar8 = this.e;
                gja gjaVar10 = this.b;
                aehsVar = new vil(gjtVar8.a(), (zf) gjaVar10.d.io(), gjaVar10.a, (zs) this.a.a.ja.io(), 0);
                return aehsVar;
        }
    }
}

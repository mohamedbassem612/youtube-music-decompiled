package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sue implements vxc {
    private final xeu a;

    public sue(xeu xeuVar) {
        this.a = xeuVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amtz.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        amtz amtzVar = (amtz) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (!(amtzVar.c == 1 ? (aigj) amtzVar.d : aigj.d).E()) {
            acb acbVar = new acb((char[]) null);
            acbVar.d = amtzVar.c == 1 ? (aigj) amtzVar.d : aigj.d;
            xeu xeuVar = this.a;
            if (!xeuVar.b) {
                xeuVar.b(acbVar.g());
                return;
            }
            xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_CANCELLED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        if (!(amtzVar.c == 2 ? (aigj) amtzVar.d : aigj.d).E()) {
            zh zhVar = new zh((byte[]) null);
            zhVar.b = amtzVar.c == 2 ? (aigj) amtzVar.d : aigj.d;
            xeu xeuVar2 = this.a;
            if (xeuVar2.b) {
                xff xffVarA2 = xeuVar2.a(zhVar.g(), alot.YPC_CANCEL_FLOW_CANCELLED);
                ztf ztfVar2 = xffVarA2.k.e;
                xffVarA2.l = ztfVar2.a();
                ztfVar2.k(xffVarA2);
                return;
            }
            alos alosVar = (alos) alou.a.createBuilder();
            aroc arocVarF = zhVar.f();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            arocVarF.getClass();
            alouVar.d = arocVarF;
            alouVar.c = 199;
            xeuVar2.b((alou) alosVar.build());
            return;
        }
        if (!(amtzVar.c == 3 ? (aigj) amtzVar.d : aigj.d).E()) {
            zh zhVar2 = new zh((byte[]) null);
            zhVar2.b = amtzVar.c == 3 ? (aigj) amtzVar.d : aigj.d;
            xeu xeuVar3 = this.a;
            if (xeuVar3.b) {
                xff xffVarA3 = xeuVar3.a(zhVar2.q(), alot.YPC_PAUSE_FLOW_CANCELLED);
                ztf ztfVar3 = xffVarA3.k.e;
                xffVarA3.l = ztfVar3.a();
                ztfVar3.k(xffVarA3);
                return;
            }
            alos alosVar2 = (alos) alou.a.createBuilder();
            arog arogVarP = zhVar2.p();
            alosVar2.copyOnWrite();
            alou alouVar2 = (alou) alosVar2.instance;
            arogVarP.getClass();
            alouVar2.d = arogVarP;
            alouVar2.c = 189;
            xeuVar3.b((alou) alosVar2.build());
            return;
        }
        if ((amtzVar.c == 4 ? (aigj) amtzVar.d : aigj.d).E()) {
            if ((amtzVar.c == 5 ? (aigj) amtzVar.d : aigj.d).E()) {
                return;
            }
            aigj aigjVar = amtzVar.c == 5 ? (aigj) amtzVar.d : aigj.d;
            xeu xeuVar4 = this.a;
            if (!xeuVar4.b) {
                xeuVar4.b(nsg.a(aigjVar, 4));
                return;
            }
            xff xffVarA4 = xeuVar4.a(nsg.b(aigjVar, 4), alot.YPC_REFUND_FLOW_EVENT);
            ztf ztfVar4 = xffVarA4.k.e;
            xffVarA4.l = ztfVar4.a();
            ztfVar4.k(xffVarA4);
            return;
        }
        zh zhVar3 = new zh((byte[]) null);
        zhVar3.b = amtzVar.c == 4 ? (aigj) amtzVar.d : aigj.d;
        xeu xeuVar5 = this.a;
        if (xeuVar5.b) {
            xff xffVarA5 = xeuVar5.a(zhVar3.o(), alot.YPC_RESUME_FLOW_CANCELLED);
            ztf ztfVar5 = xffVarA5.k.e;
            xffVarA5.l = ztfVar5.a();
            ztfVar5.k(xffVarA5);
            return;
        }
        alos alosVar3 = (alos) alou.a.createBuilder();
        aroj arojVarN = zhVar3.n();
        alosVar3.copyOnWrite();
        alou alouVar3 = (alou) alosVar3.instance;
        arojVarN.getClass();
        alouVar3.d = arojVarN;
        alouVar3.c = 194;
        xeuVar5.b((alou) alosVar3.build());
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}

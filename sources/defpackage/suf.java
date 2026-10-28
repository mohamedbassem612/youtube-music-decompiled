package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class suf implements vxc {
    private final xeu a;

    public suf(xeu xeuVar) {
        this.a = xeuVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amub.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        amub amubVar = (amub) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (!(amubVar.c == 1 ? (aigj) amubVar.d : aigj.d).E()) {
            acb acbVar = new acb((char[]) null);
            acbVar.d = amubVar.c == 1 ? (aigj) amubVar.d : aigj.d;
            xeu xeuVar = this.a;
            if (!xeuVar.b) {
                xeuVar.b(acbVar.k());
                return;
            }
            xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_STARTED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        if (!(amubVar.c == 2 ? (aigj) amubVar.d : aigj.d).E()) {
            zh zhVar = new zh((byte[]) null);
            zhVar.b = amubVar.c == 2 ? (aigj) amubVar.d : aigj.d;
            xeu xeuVar2 = this.a;
            if (xeuVar2.b) {
                xff xffVarA2 = xeuVar2.a(zhVar.g(), alot.YPC_CANCEL_FLOW_STARTED);
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
            alouVar.c = 198;
            xeuVar2.b((alou) alosVar.build());
            return;
        }
        if (!(amubVar.c == 3 ? (aigj) amubVar.d : aigj.d).E()) {
            zh zhVar2 = new zh((byte[]) null);
            zhVar2.b = amubVar.c == 3 ? (aigj) amubVar.d : aigj.d;
            xeu xeuVar3 = this.a;
            if (xeuVar3.b) {
                xff xffVarA3 = xeuVar3.a(zhVar2.q(), alot.YPC_PAUSE_FLOW_STARTED);
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
            alouVar2.c = 188;
            xeuVar3.b((alou) alosVar2.build());
            return;
        }
        if (!(amubVar.c == 4 ? (aigj) amubVar.d : aigj.d).E()) {
            zh zhVar3 = new zh((byte[]) null);
            zhVar3.b = amubVar.c == 4 ? (aigj) amubVar.d : aigj.d;
            xeu xeuVar4 = this.a;
            if (xeuVar4.b) {
                xff xffVarA4 = xeuVar4.a(zhVar3.o(), alot.YPC_RESUME_FLOW_STARTED);
                ztf ztfVar4 = xffVarA4.k.e;
                xffVarA4.l = ztfVar4.a();
                ztfVar4.k(xffVarA4);
                return;
            }
            alos alosVar3 = (alos) alou.a.createBuilder();
            aroj arojVarN = zhVar3.n();
            alosVar3.copyOnWrite();
            alou alouVar3 = (alou) alosVar3.instance;
            arojVarN.getClass();
            alouVar3.d = arojVarN;
            alouVar3.c = 193;
            xeuVar4.b((alou) alosVar3.build());
            return;
        }
        if (!(amubVar.c == 5 ? (aigj) amubVar.d : aigj.d).E()) {
            aigj aigjVar = amubVar.c == 5 ? (aigj) amubVar.d : aigj.d;
            xeu xeuVar5 = this.a;
            if (xeuVar5.b) {
                xff xffVarA5 = xeuVar5.a(nsg.c(aigjVar), alot.YPC_DEACTIVATE_FLOW_STARTED);
                ztf ztfVar5 = xffVarA5.k.e;
                xffVarA5.l = ztfVar5.a();
                ztfVar5.k(xffVarA5);
                return;
            }
            alos alosVar4 = (alos) alou.a.createBuilder();
            arod arodVar = (arod) nsg.c(aigjVar).build();
            alosVar4.copyOnWrite();
            alou alouVar4 = (alou) alosVar4.instance;
            arodVar.getClass();
            alouVar4.d = arodVar;
            alouVar4.c = 320;
            xeuVar5.b((alou) alosVar4.build());
            return;
        }
        if (!(amubVar.c == 6 ? (aigj) amubVar.d : aigj.d).E()) {
            aigj aigjVar2 = amubVar.c == 6 ? (aigj) amubVar.d : aigj.d;
            xeu xeuVar6 = this.a;
            if (!xeuVar6.b) {
                xeuVar6.b(nsg.a(aigjVar2, 2));
                return;
            }
            xff xffVarA6 = xeuVar6.a(nsg.b(aigjVar2, 2), alot.YPC_REFUND_FLOW_EVENT);
            ztf ztfVar6 = xffVarA6.k.e;
            xffVarA6.l = ztfVar6.a();
            ztfVar6.k(xffVarA6);
            return;
        }
        if ((amubVar.c == 8 ? (aigj) amubVar.d : aigj.d).E()) {
            return;
        }
        zh zhVar4 = new zh((byte[]) null);
        zhVar4.b = amubVar.c == 8 ? (aigj) amubVar.d : aigj.d;
        xeu xeuVar7 = this.a;
        if (xeuVar7.b) {
            xff xffVarA7 = xeuVar7.a(zhVar4.g(), alot.YPC_CANCEL_FLOW_GO_TO_PAYMENT_PROCESSOR);
            ztf ztfVar7 = xffVarA7.k.e;
            xffVarA7.l = ztfVar7.a();
            ztfVar7.k(xffVarA7);
            return;
        }
        alos alosVar5 = (alos) alou.a.createBuilder();
        aroc arocVarF2 = zhVar4.f();
        alosVar5.copyOnWrite();
        alou alouVar5 = (alou) alosVar5.instance;
        arocVarF2.getClass();
        alouVar5.d = arocVarF2;
        alouVar5.c = 402;
        xeuVar7.b((alou) alosVar5.build());
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}

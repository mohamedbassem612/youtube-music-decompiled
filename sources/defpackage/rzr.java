package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rzr implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rzr(rzs rzsVar, smr smrVar, sko skoVar, slb slbVar, ListenableFuture listenableFuture, int i) {
        this.$cid = i;
        this.a = rzsVar;
        this.b = smrVar;
        this.c = skoVar;
        this.d = slbVar;
        this.e = listenableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r5v3, types: [acfw, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        char c;
        char c2;
        int i;
        if (this.$cid != 0) {
            return ((xte) this.a).j((wgk) this.c, null, (String) this.e, this.d, this.b, null);
        }
        ArrayList arrayList = new ArrayList();
        rzs rzsVar = (rzs) this.a;
        vyo vyoVar = rzsVar.i;
        Object obj = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        if (taq.aW(vyoVar)) {
            rzsVar.e(arrayList, (smr) obj, (sko) obj2, (slb) obj3);
        } else {
            ?? r0 = this.e;
            slb slbVar = (slb) obj3;
            sko skoVar = (sko) obj2;
            smr smrVar = (smr) obj;
            rzsVar.d(arrayList, smrVar, skoVar, slbVar, r0);
            rzsVar.c(arrayList, smrVar, skoVar, slbVar, r0);
            agkz agkzVar = rzsVar.e;
            aixo aixoVar = aixo.SLOT_TYPE_FULLSCREEN_ENGAGEMENT;
            if (agkzVar.contains(aixoVar) && (obj3 instanceof skz) && smrVar.g(aixo.SLOT_TYPE_PLAYER_BYTES, sic.class)) {
                aaok aaokVar = (aaok) rzsVar.c.io();
                String str = skoVar.a;
                skm skmVar = new skm((smc) obj3);
                String str2 = (String) smrVar.d(sic.class);
                xsc xscVar = (xsc) aaokVar.d;
                String strAa = xscVar.aa();
                aixr aixrVar = aixr.TRIGGER_TYPE_ON_PLAYBACK_WITH_CONTENT_VIDEO_ID;
                i = 2;
                slw slwVar = new slw(xscVar.Z(aixrVar), aixrVar, true, str2);
                aixr aixrVar2 = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
                c2 = 1;
                smu smuVar = new smu(xscVar.Z(aixrVar2), aixrVar2, false, strAa);
                agke agkeVarQ = agke.q(slwVar);
                agke agkeVarQ2 = agke.q(smuVar);
                aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                slt sltVar = new slt(xscVar.Z(aixrVar3), aixrVar3, false, str2, false);
                aixr aixrVar4 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                c = 0;
                arrayList.add(smr.i(strAa, aixoVar, agkeVarQ, agkeVarQ2, agke.r(sltVar, new smv(xscVar.Z(aixrVar4), aixrVar4, false, strAa)), shh.b(new sjh(str), new sjz(r0), new siq(skmVar))));
            } else {
                c = 0;
                c2 = 1;
                i = 2;
            }
            aixo aixoVar2 = aixo.SLOT_TYPE_PLAYER_BYTES;
            int i2 = i;
            Class[] clsArr = new Class[i2];
            clsArr[c] = sic.class;
            clsArr[c2] = sid.class;
            if (smrVar.g(aixoVar2, clsArr)) {
                aixg aixgVar = aixg.LAYOUT_TYPE_MEDIA;
                Class[] clsArr2 = new Class[i2];
                clsArr2[c] = sib.class;
                clsArr2[c2] = shn.class;
                if (skoVar.f(aixgVar, clsArr2)) {
                    sdo sdoVar = (sdo) rzsVar.g.io();
                    ahng.x(r0, new rzm(sdoVar, (String) skoVar.d(sib.class), (String) smrVar.d(sic.class), (wjf) smrVar.d(sid.class), skoVar.a, slbVar), sdoVar.a);
                }
            }
        }
        return arrayList;
    }

    public /* synthetic */ rzr(xte xteVar, wgk wgkVar, String str, wjf wjfVar, acfw acfwVar, int i) {
        this.$cid = i;
        this.a = xteVar;
        this.c = wgkVar;
        this.e = str;
        this.d = wjfVar;
        this.b = acfwVar;
    }
}

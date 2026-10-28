package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rzo implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rzo(abqq abqqVar, wlo wloVar, abnp abnpVar, AtomicBoolean atomicBoolean, int i) {
        this.$cid = i;
        this.d = abqqVar;
        this.a = wloVar;
        this.c = abnpVar;
        this.b = atomicBoolean;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0246  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [acfw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, wjf] */
    @Override // java.util.function.Supplier
    public final Object get() {
        Object obj;
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new aaki((abqq) this.d, (AtomicBoolean) this.b, ((abnp) this.c).b, (wlo) this.a, 3);
                }
                return ((rzz) this.a).s(this.c, this.d, (String) this.b, null);
            }
            Object obj2 = ((aaok) ((rzj) this.a).a.io()).d;
            aixo aixoVar = aixo.SLOT_TYPE_IN_PLAYER;
            xsc xscVar = (xsc) obj2;
            String strAa = xscVar.aa();
            aixr aixrVar = aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED;
            String strZ = xscVar.Z(aixrVar);
            String str = ((sko) this.c).a;
            agke agkeVarQ = agke.q(new skv(strZ, aixrVar, false, str));
            aixr aixrVar2 = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
            agke agkeVarQ2 = agke.q(new smu(xscVar.Z(aixrVar2), aixrVar2, false, strAa));
            aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
            slt sltVar = new slt(xscVar.Z(aixrVar3), aixrVar3, false, (String) this.b, false);
            aixr aixrVar4 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
            return Arrays.asList(smr.i(strAa, aixoVar, agkeVarQ, agkeVarQ2, agke.r(sltVar, new smv(xscVar.Z(aixrVar4), aixrVar4, false, strAa)), shh.b(new sig((apji) this.d), new sij(str))));
        }
        rzs rzsVar = (rzs) this.a;
        rtm rtmVar = rzsVar.j;
        Object obj3 = this.d;
        slb slbVar = (slb) obj3;
        ListenableFuture listenableFutureA = rtmVar.a(slbVar);
        ArrayList arrayList = new ArrayList();
        agkz agkzVar = rzsVar.e;
        aixo aixoVar2 = aixo.SLOT_TYPE_IN_PLAYER;
        boolean zContains = agkzVar.contains(aixoVar2);
        Object obj4 = this.b;
        Object obj5 = this.c;
        if (zContains) {
            smr smrVar = (smr) obj4;
            if (smrVar.g(aixo.SLOT_TYPE_PLAYER_BYTES, sic.class, sid.class, shx.class, siv.class)) {
                obj = obj5;
                sko skoVar = (sko) obj;
                if (skoVar.f(aixg.LAYOUT_TYPE_MEDIA, sjm.class, shq.class)) {
                    agke agkeVarR = taq.bb(rzsVar.k).g ? agke.r(aixoVar2, aixo.SLOT_TYPE_LOCKSCREEN) : agke.s(aixoVar2, aixo.SLOT_TYPE_LOCKSCREEN, aixo.SLOT_TYPE_FIXED_FOOTER);
                    wjf wjfVar = (wjf) smrVar.d(sid.class);
                    aaok aaokVar = (aaok) rzsVar.c.io();
                    String str2 = skoVar.a;
                    String str3 = (String) smrVar.d(sic.class);
                    slm slmVar = (slm) smrVar.d(shx.class);
                    sgs sgsVar = (sgs) skoVar.d(shq.class);
                    sgn sgnVar = sgn.a;
                    boolean zBooleanValue = ((Boolean) smrVar.d(siv.class)).booleanValue();
                    ArrayList arrayList2 = new ArrayList(((agpi) agkeVarR).d);
                    ArrayList arrayList3 = new ArrayList(Arrays.asList(new sjh(str2), new sid(wjfVar), new shx(slmVar), new shq(sgsVar), new shn(sgnVar), new siv(zBooleanValue), new sjz(listenableFutureA)));
                    if (agkeVarR.contains(aixo.SLOT_TYPE_FIXED_FOOTER) || zBooleanValue) {
                        arrayList3.add(new sjm((smk) obj3));
                    } else {
                        arrayList3.add(new sjb(slbVar));
                    }
                    agqs agqsVarListIterator = agkeVarR.listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        aixo aixoVar3 = (aixo) agqsVarListIterator.next();
                        xsc xscVar2 = (xsc) aaokVar.d;
                        String strAa2 = xscVar2.aa();
                        aixr aixrVar5 = aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED;
                        agke agkeVarQ3 = agke.q(new skv(xscVar2.Z(aixrVar5), aixrVar5, false, str2));
                        aixr aixrVar6 = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
                        agke agkeVarQ4 = agke.q(new smu(xscVar2.Z(aixrVar6), aixrVar6, false, strAa2));
                        aixr aixrVar7 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                        slt sltVar2 = new slt(xscVar2.Z(aixrVar7), aixrVar7, false, str3, false);
                        aixr aixrVar8 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                        arrayList2.add(smr.i(strAa2, aixoVar3, agkeVarQ3, agkeVarQ4, agke.r(sltVar2, new smv(xscVar2.Z(aixrVar8), aixrVar8, false, strAa2)), shh.a(arrayList3)));
                    }
                    arrayList.addAll(arrayList2);
                }
            } else {
                obj = obj5;
            }
        } else {
            obj = obj5;
        }
        if (taq.aW(rzsVar.i)) {
            rzsVar.e(arrayList, (smr) obj4, (sko) obj, slbVar);
        } else if (taq.bc(rzsVar.k)) {
            sko skoVar2 = (sko) obj;
            smr smrVar2 = (smr) obj4;
            rzsVar.d(arrayList, smrVar2, skoVar2, slbVar, listenableFutureA);
            rzsVar.c(arrayList, smrVar2, skoVar2, slbVar, listenableFutureA);
        }
        rzsVar.f = ((sko) obj).a;
        return arrayList;
    }

    public /* synthetic */ rzo(rzj rzjVar, sko skoVar, String str, apji apjiVar, int i) {
        this.$cid = i;
        this.a = rzjVar;
        this.c = skoVar;
        this.b = str;
        this.d = apjiVar;
    }

    public /* synthetic */ rzo(rzs rzsVar, smr smrVar, sko skoVar, smk smkVar, int i) {
        this.$cid = i;
        this.a = rzsVar;
        this.b = smrVar;
        this.c = skoVar;
        this.d = smkVar;
    }

    public /* synthetic */ rzo(rzz rzzVar, wjf wjfVar, acfw acfwVar, String str, int i) {
        this.$cid = i;
        this.a = rzzVar;
        this.c = wjfVar;
        this.d = acfwVar;
        this.b = str;
    }
}

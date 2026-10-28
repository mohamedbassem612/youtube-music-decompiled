package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mly implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mly(gfz gfzVar, smr smrVar, sko skoVar, int i) {
        this.$cid = i;
        this.b = gfzVar;
        this.c = smrVar;
        this.a = skoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ndv] */
    /* JADX WARN: Type inference failed for: r1v29, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = 0;
        switch (this.$cid) {
            case 0:
                return ((qnl) this.c).in((nsl) this.a, this.b);
            case 1:
                ArrayList arrayList = new ArrayList();
                aixg aixgVar = aixg.LAYOUT_TYPE_MEDIA;
                sko skoVar = (sko) this.a;
                boolean zF = skoVar.f(aixgVar, sjb.class);
                Object obj = this.b;
                if (zF) {
                    slb slbVar = (slb) skoVar.d(sjb.class);
                    if (skoVar.e(sjd.class)) {
                        slbVar = (slb) skoVar.d(sjd.class);
                    }
                    gfz gfzVar = (gfz) obj;
                    rtm rtmVar = gfzVar.f;
                    vyo vyoVar = gfzVar.d;
                    ListenableFuture listenableFutureA = rtmVar.a(slbVar);
                    if (afxw.e(vyoVar).C) {
                        agkz agkzVar = gfzVar.c;
                        aixo aixoVar = aixo.SLOT_TYPE_LOCKSCREEN;
                        if (agkzVar.contains(aixoVar)) {
                            smr smrVar = (smr) this.c;
                            if (smrVar.g(aixo.SLOT_TYPE_PLAYER_BYTES, sic.class, sid.class) && skoVar.f(aixgVar, new Class[0])) {
                                sgs sgsVarB = slb.av(slbVar.iJ()) ? ((sag) gfzVar.b.io()).b(smrVar, skoVar) : ((sag) gfzVar.b.io()).a(smrVar, skoVar);
                                aaok aaokVar = (aaok) gfzVar.a.io();
                                String str = skoVar.a;
                                String str2 = (String) smrVar.d(sic.class);
                                wjf wjfVar = (wjf) smrVar.d(sid.class);
                                slm slmVar = (slm) smrVar.d(shx.class);
                                Object obj2 = aaokVar.d;
                                sgn sgnVar = sgn.a;
                                xsc xscVar = (xsc) obj2;
                                String strAa = xscVar.aa();
                                ArrayList arrayList2 = new ArrayList(Arrays.asList(new sjh(str), new shq(sgsVarB), new sid(wjfVar), new shn(sgnVar), new sjb(slbVar), new shx(slmVar), new sjz(listenableFutureA)));
                                aixr aixrVar = aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED;
                                agke agkeVarQ = agke.q(new skv(xscVar.Z(aixrVar), aixrVar, false, str));
                                aixr aixrVar2 = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
                                agke agkeVarQ2 = agke.q(new smu(xscVar.Z(aixrVar2), aixrVar2, false, strAa));
                                aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                                slt sltVar = new slt(xscVar.Z(aixrVar3), aixrVar3, false, str2, false);
                                aixr aixrVar4 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                                arrayList.add(smr.i(strAa, aixoVar, agkeVarQ, agkeVarQ2, agke.r(sltVar, new smv(xscVar.Z(aixrVar4), aixrVar4, false, strAa)), shh.a(arrayList2)));
                            }
                        }
                    }
                }
                ((gfz) obj).e = skoVar.a;
                return arrayList;
            case 2:
                final rzi rziVar = (rzi) this.b;
                final acfw acfwVar = rziVar.e;
                final wjf wjfVar2 = rziVar.d;
                final String str3 = rziVar.c;
                aihf aihfVarCreateBuilder = allc.a.createBuilder();
                while (true) {
                    smn smnVar = (smn) this.a;
                    agke agkeVar = smnVar.a;
                    if (i >= ((agpi) agkeVar).d) {
                        aiui aiuiVar = smnVar.b;
                        if (aiuiVar != null && (aiuiVar.b & 1) != 0) {
                            aigj aigjVar = aiuiVar.c;
                            aihfVarCreateBuilder.copyOnWrite();
                            allc allcVar = (allc) aihfVarCreateBuilder.instance;
                            aigjVar.getClass();
                            allcVar.b |= SemanticState.Focused;
                            allcVar.h = aigjVar;
                        }
                        Object obj3 = this.c;
                        final wgk wgkVar = new wgk((allc) aihfVarCreateBuilder.build(), 0L);
                        final yvs yvsVar = (yvs) obj3;
                        return (List) Collection.EL.stream(agkeVar).filter(new rej(19)).map(new Function() { // from class: rzh
                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public final /* synthetic */ Function mo840andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj4) {
                                aivt aivtVar = (aivt) obj4;
                                aaok aaokVar2 = (aaok) rziVar.a.io();
                                String str4 = str3;
                                wjf wjfVar3 = wjfVar2;
                                acfw acfwVar2 = acfwVar;
                                yvs yvsVar2 = yvsVar;
                                return aaokVar2.Z(aivtVar, str4, wjfVar3, acfwVar2, Optional.empty(), Optional.of(wgkVar), Optional.of(yvsVar2), Optional.empty(), null);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(aghu.a);
                    }
                    aivt aivtVar = (aivt) agkeVar.get(i);
                    aihh aihhVar = (aihh) apji.a.createBuilder();
                    aihhVar.e(aivv.a, aivtVar);
                    aihfVarCreateBuilder.ba((apji) aihhVar.build());
                    i++;
                }
                break;
            case 3:
                Object obj4 = ((aaok) ((rzn) this.b).a.io()).d;
                aixo aixoVar2 = aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE;
                xsc xscVar2 = (xsc) obj4;
                String strAa2 = xscVar2.aa();
                sht[] shtVarArr = new sht[5];
                String str4 = (String) this.c;
                shtVarArr[0] = new sic(str4);
                amae amaeVar = ((wgi) this.a).a;
                apji apjiVar = amaeVar.t;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajlk.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                shtVarArr[1] = new shw((ajlj) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
                ajwo ajwoVar = amaeVar.w;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                shtVarArr[2] = new sjv(ajwoVar);
                shtVarArr[3] = new sjt(agpn.b);
                shtVarArr[4] = new siw(Boolean.TRUE);
                shh shhVarB = shh.b(shtVarArr);
                aixr aixrVar5 = aixr.TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED;
                agke agkeVarQ3 = agke.q(new she(xscVar2.Z(aixrVar5), aixrVar5, false, str4));
                aixr aixrVar6 = aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED;
                agke agkeVarQ4 = agke.q(new smy(xscVar2.Z(aixrVar6), aixrVar6, false, strAa2));
                aixr aixrVar7 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                slt sltVar2 = new slt(xscVar2.Z(aixrVar7), aixrVar7, false, str4, false);
                aixr aixrVar8 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                return agke.q(smr.i(strAa2, aixoVar2, agkeVarQ3, agkeVarQ4, agke.r(sltVar2, new smv(xscVar2.Z(aixrVar8), aixrVar8, false, strAa2)), shhVarB));
            case 4:
                rzn rznVar = (rzn) this.b;
                aehs aehsVar = (aehs) rznVar.b.io();
                new agjz(4);
                return aaok.al(aehsVar, ((wgi) this.a).e(), (String) this.c);
            case 5:
                rzs rzsVar = (rzs) this.b;
                return aaok.al((aehs) rzsVar.d.io(), this.a, (String) this.c);
            case 6:
                return ((aapa) this.b).a((abnl) this.a, this.c);
            default:
                return ((aapa) this.b).a((abnl) this.a, this.c);
        }
    }

    public /* synthetic */ mly(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ mly(qnl qnlVar, nsl nslVar, ndv ndvVar, int i) {
        this.$cid = i;
        this.c = qnlVar;
        this.a = nslVar;
        this.b = ndvVar;
    }
}

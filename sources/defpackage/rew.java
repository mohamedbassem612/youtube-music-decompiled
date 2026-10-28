package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.video.mediaengine.textures.processors.SkiaTextureProcessor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rew implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rew(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0282  */
    /* JADX WARN: Code duplicated, block: B:104:0x028e  */
    /* JADX WARN: Code duplicated, block: B:107:0x02af  */
    /* JADX WARN: Code duplicated, block: B:110:0x02bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v46, types: [acjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, tyz] */
    /* JADX WARN: Type inference failed for: r7v35, types: [bog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32, types: [auht, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        Object obj2;
        rqt rqtVar;
        Map map;
        rqs rqsVar;
        int i = 7;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                quk qukVar = (quk) this.b;
                tge tgeVar = new tge(qukVar);
                tgeVar.c = new quh(((qup) obj).a, ((quh) qukVar.d).b);
                ((rey) this.a).c.a(tgeVar.e());
                break;
            case 1:
                UUID uuid = (UUID) obj;
                qxj qxjVar = (qxj) ((agkj) this.a).get(uuid);
                qvu qvuVar = qxjVar.e;
                Object obj3 = this.b;
                if (qvuVar != null) {
                    if (((rek) obj3).d.containsKey(qvuVar.m)) {
                    }
                    rbc rbcVar = new rbc(rek.m, rbd.c);
                    rbcVar.c();
                    rbcVar.a("MediaComposition transition found with referenced segment not found in the composition", new Object[0]);
                    req reqVar = ((rek) obj3).h;
                    tge tgeVarA = quk.a();
                    tgeVarA.b = new IllegalStateException("MediaComposition transition found with referenced segment not found in the composition");
                    tgeVarA.c = new quj(qxjVar.b, 2);
                    ((rdr) reqVar).D(tgeVarA.e());
                    break;
                } else if (qxjVar.f == null) {
                    rbc rbcVar2 = new rbc(rek.m, rbd.c);
                    rbcVar2.c();
                    rbcVar2.a("MediaComposition transition found with no incoming or outgoing segment", new Object[0]);
                    req reqVar2 = ((rek) obj3).h;
                    tge tgeVarA2 = quk.a();
                    tgeVarA2.b = new IllegalStateException("MediaComposition transition found with no incoming or outgoing segment");
                    tgeVarA2.c = new quj(qxjVar.b, 2);
                    ((rdr) reqVar2).D(tgeVarA2.e());
                    break;
                } else if (qxjVar.f == null) {
                }
                qvu qvuVar2 = qxjVar.f;
                if (qvuVar2 == null || ((rek) obj3).d.containsKey(qvuVar2.m)) {
                    rek rekVar = (rek) obj3;
                    rec recVar = new rec(qxjVar, rekVar.j.b, rekVar.h);
                    recVar.j = new rcu(obj3, 10);
                    rekVar.e(recVar);
                    rekVar.e.put(uuid, recVar);
                }
                rbc rbcVar3 = new rbc(rek.m, rbd.c);
                rbcVar3.c();
                rbcVar3.a("MediaComposition transition found with referenced segment not found in the composition", new Object[0]);
                req reqVar3 = ((rek) obj3).h;
                tge tgeVarA3 = quk.a();
                tgeVarA3.b = new IllegalStateException("MediaComposition transition found with referenced segment not found in the composition");
                tgeVarA3.c = new quj(qxjVar.b, 2);
                ((rdr) reqVar3).D(tgeVarA3.e());
                break;
            case 2:
                ((SkiaTextureProcessor) this.b).m((qup) obj, (Throwable) this.a, 4);
                break;
            case 3:
                ((SkiaTextureProcessor) this.b).m((qup) obj, (Throwable) this.a, 1);
                break;
            case 4:
                ?? r0 = ((xsc) this.b).c;
                wns wnsVar = (wns) obj;
                for (aire aireVar : wnsVar.c()) {
                    if ((aireVar.b & 1) != 0) {
                        aobx aobxVar = aireVar.c;
                        if (aobxVar == null) {
                            aobxVar = aobx.a;
                        }
                        rlt rltVar = (rlt) r0.get(aobxVar.e);
                        if (rltVar != null) {
                            str = rltVar.b;
                            obj2 = this.a;
                            if (str != null) {
                                rqtVar = (rqt) obj2;
                                map = rqtVar.f;
                                rqsVar = (rqs) map.get(str);
                                if (rqsVar == null) {
                                    rqsVar = new rqs();
                                    rqsVar.m(-1, rqsVar.a, true);
                                    rqsVar.m(-1, rqsVar.b, true);
                                    map.put(str, rqsVar);
                                    rqtVar.e.m(-1, rqsVar, true);
                                }
                                if (!wnsVar.c().isEmpty()) {
                                    rqsVar.b(2);
                                }
                                rqsVar.a.addAll(wnsVar.d());
                            } else {
                                admu admuVar = new admu();
                                admuVar.addAll(wnsVar.d());
                                ((rqt) obj2).e.m(-1, admuVar, true);
                            }
                            break;
                        }
                    }
                }
                obj2 = this.a;
                if (str != null) {
                    rqtVar = (rqt) obj2;
                    map = rqtVar.f;
                    rqsVar = (rqs) map.get(str);
                    if (rqsVar == null) {
                        rqsVar = new rqs();
                        rqsVar.m(-1, rqsVar.a, true);
                        rqsVar.m(-1, rqsVar.b, true);
                        map.put(str, rqsVar);
                        rqtVar.e.m(-1, rqsVar, true);
                    }
                    if (!wnsVar.c().isEmpty()) {
                        rqsVar.b(2);
                    }
                    rqsVar.a.addAll(wnsVar.d());
                } else {
                    admu admuVar2 = new admu();
                    admuVar2.addAll(wnsVar.d());
                    ((rqt) obj2).e.m(-1, admuVar2, true);
                }
                break;
            case 5:
                ((rsq) obj).o(((aazn) this.b).a, (String) this.a);
                break;
            case 6:
                ((Set) j$.util.Map.EL.computeIfAbsent(((oml) this.b).a, (aixo) obj, new rxg(i2))).add(this.a);
                break;
            case 7:
                ((wjr) this.b).b.a(obj, this.a);
                break;
            case 8:
                rbm rbmVar = ufm.a;
                ((rbi) obj).a((UUID) this.a, (anck) this.b);
                break;
            case 9:
                Pair pair = (Pair) obj;
                ListenableFuture listenableFuture = (ListenableFuture) pair.second;
                Object obj4 = this.b;
                taf.k(((xsc) this.a).b, listenableFuture, new svm(pair, obj4, i, objArr2 == true ? 1 : 0), new svm(pair, obj4, 8, objArr == true ? 1 : 0));
                break;
            case 10:
                ((usd) this.a).i(new uun(((augy) obj).e, (Uri) this.b));
                break;
            case 11:
                ugo ugoVar = new ugo((roq) this.b, (xgz) obj);
                ugoVar.i(((upo) this.a).f);
                ugoVar.c();
                break;
            case 12:
                augy augyVar = (augy) obj;
                int i3 = augyVar.c;
                Object obj5 = this.a;
                Object obj6 = this.b;
                if (i3 == 110) {
                    uql uqlVar = (uql) obj6;
                    uqlVar.l.w(new uxk(augyVar, (Optional) obj5, Optional.of((augj) yno.gx(uqlVar.d(), augj.b))));
                } else if (i3 != 101) {
                    if (i3 != 102 && i3 != 105 && i3 != 106) {
                        if ((i3 == 107 ? (auhv) augyVar.d : auhv.a).c != 2) {
                        }
                    }
                    ((uql) obj6).l.t(new uxk(augyVar, (Optional) obj5));
                } else {
                    ((uql) obj6).l.w(new uxk(augyVar, (Optional) obj5));
                }
                break;
            case 13:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                urrVar.f((auhs) this.b, this.a);
                break;
            case 14:
                urr urrVar2 = (urr) obj;
                urrVar2.getClass();
                urrVar2.e((auhs) this.b, this.a);
                break;
            case 15:
                long j = ((augy) obj).e;
                ?? r8 = this.a;
                auga augaVarG = usj.g((auhs) r8, j);
                boolean zEquals = augaVarG.equals(auga.a);
                Object obj7 = this.b;
                if (!zEquals) {
                    ((agjz) obj7).h(new uur(j, augaVarG, 0));
                }
                aufq aufqVar = (aufq) yno.gx(r8, aufq.b);
                aufp aufpVar = aufp.a;
                aufp aufpVar2 = (aufp) aufqVar.c.get(Long.valueOf(j));
                if (aufpVar2 == null) {
                    aufpVar2 = aufpVar;
                }
                if (!aufpVar2.equals(aufpVar)) {
                    ((agjz) obj7).h(new uur(j, aufpVar2, 1));
                }
                break;
            case 16:
                vro vroVar = (vro) obj;
                if (vroVar instanceof vrx) {
                    ?? r1 = this.a;
                    Object obj8 = this.b;
                    vrx vrxVar = (vrx) vroVar;
                    if (!vrxVar.p().g() || !r1.c().equals(((vnr) obj8).l)) {
                        vrxVar.n(r1);
                        ((vnr) obj8).l = r1.c();
                    }
                }
                break;
            case 17:
                vro vroVar2 = (vro) obj;
                if (vroVar2 instanceof vrx) {
                    vrx vrxVar2 = (vrx) vroVar2;
                    apho aphoVar = vrxVar2.p().g() ? (apho) aawb.ag((acjx) vrxVar2.p().c(), apho.class) : null;
                    if (aphoVar == null) {
                        aphoVar = apho.a;
                    }
                    svm svmVar = new svm(this.b, this.a, 18, objArr3 == true ? 1 : 0);
                    grh grhVar = new grh(2);
                    adwg adwgVar = vrxVar2.h;
                    if (adwgVar != null) {
                        adwgVar.O(aphoVar, svmVar, grhVar, null);
                    }
                }
                break;
            case 18:
                ((zs) obj).q(new iab(this.b, this.a, i));
                break;
            case 19:
                aloy aloyVar = (aloy) obj;
                akwf akwfVar = aloyVar.b;
                if (akwfVar == null) {
                    akwfVar = akwf.a;
                }
                alot alotVarA = alot.a(akwfVar.c);
                if (alotVarA != null) {
                    ((agkh) this.a).e(alotVarA, Long.valueOf(aloyVar.c <= 0 ? Long.MAX_VALUE : ((xic) this.b).b.f().toEpochMilli() + TimeUnit.MINUTES.toMillis(aloyVar.c)));
                }
                break;
            default:
                Object obj9 = this.a;
                Object obj10 = this.b;
                ((xiv) obj10).b.execute(afwl.i(new vwh(obj10, obj, obj9, 19, (byte[]) null)));
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ rew(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}

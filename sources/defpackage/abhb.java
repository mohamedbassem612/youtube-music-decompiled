package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abhb implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abhb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v101, types: [aeez, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [awmd, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        Optional optionalEmpty;
        abnx abnxVar;
        alay alayVar;
        alay alayVar2;
        switch (this.$cid) {
            case 0:
                ((abhe) this.a).h((aazk) obj);
                break;
            case 1:
                ((abhe) this.a).g((aazj) obj);
                break;
            case 2:
                ((abhh) this.a).handleSubtitleTracksAvailabilityEvent((aazc) obj);
                break;
            case 3:
                ((abhh) this.a).handleSubtitleTrackChangedEvent((aazb) obj);
                break;
            case 4:
                ((abhx) this.a).handleFormatStreamChangeEvent((yvu) obj);
                break;
            case 5:
                weo weoVar = (weo) obj;
                aret aretVar = (aret) weoVar.b;
                aret aretVar2 = (aret) weoVar.c;
                Object obj2 = this.a;
                if (aretVar2 != null) {
                    wer werVarE = ((abib) obj2).d.e();
                    werVarE.e(aretVar2);
                    taf.j(tzk.g(werVarE.b()), new ztb(13));
                } else if (aretVar != null) {
                    wer werVarE2 = ((abib) obj2).d.e();
                    yno.ey(werVarE2, aretVar);
                    taf.j(tzk.g(werVarE2.b()), new ztb(14));
                }
                break;
            case 6:
                acip acipVar = ((aazq) obj).b;
                abio abioVar = (abio) this.a;
                apbm apbmVar = abmt.q(abioVar.a.a).j;
                if (apbmVar == null) {
                    apbmVar = apbm.a;
                }
                if (apbmVar.c && acipVar != null) {
                    abioVar.b = agev.h(acipVar.j());
                    break;
                }
                break;
            case 7:
                amae amaeVar = ((wgi) obj).a;
                alzo alzoVar = amaeVar.h;
                if (alzoVar == null) {
                    alzoVar = alzo.a;
                }
                if (((alzoVar.b == 78882851 ? (aorw) alzoVar.c : aorw.a).b & 33554432) != 0) {
                    alzo alzoVar2 = amaeVar.h;
                    if (alzoVar2 == null) {
                        alzoVar2 = alzo.a;
                    }
                    alay alayVar3 = (alzoVar2.b == 78882851 ? (aorw) alzoVar2.c : aorw.a).f;
                    if (alayVar3 == null) {
                        alayVar3 = alay.a;
                    }
                    optionalEmpty = Optional.of(alayVar3);
                } else {
                    optionalEmpty = Optional.empty();
                }
                yyk yykVar = new yyk(this.a, 17);
                if (true == optionalEmpty.isPresent()) {
                    ((abge) yykVar.a).p(optionalEmpty.get());
                }
                break;
            case 8:
                Pair pair = (Pair) obj;
                ablf ablfVar = (ablf) this.a;
                String str = ablfVar.b;
                if (str == null || !str.equals(((acip) pair.first).au())) {
                    ablfVar.b = ((acip) pair.first).au();
                    ablfVar.d = (acip) pair.first;
                    ablfVar.c = ((acip) pair.first).x();
                    ablfVar.h.clear();
                }
                aawz aawzVar = (aawz) pair.second;
                ahha ahhaVar = aawzVar.f;
                aawy aawyVar = aawzVar.c;
                if (aawzVar.d) {
                    if (ablfVar.f) {
                        ablfVar.f = false;
                        if ((ahhaVar == null || aawyVar == null) && (abnxVar = ablfVar.i) != null && !((String) abnxVar.d).equals(ablfVar.b)) {
                            abnx abnxVar2 = ablfVar.i;
                            long j = abnxVar2.b;
                            String str2 = (String) abnxVar2.d;
                            ablfVar.f(str2, ablfVar.b, j, false, true);
                            ablfVar.f(ablfVar.b, str2, aawzVar.b, true, true);
                            ablfVar.i = null;
                        }
                    }
                    if (ahhaVar != null && aawyVar != null) {
                        for (abnx abnxVar3 : aawyVar.c()) {
                            Map map = ablfVar.g;
                            Object obj3 = abnxVar3.d;
                            map.put(obj3, Long.valueOf(abnxVar3.c));
                            if (ablfVar.h.containsKey(obj3)) {
                                able ableVar = (able) ablfVar.h.get(obj3);
                                acga acgaVar = ablfVar.j;
                                if (ableVar != null && acgaVar != null) {
                                    acgaVar.k(ableVar, abnxVar3.b);
                                }
                            } else {
                                ablf ablfVar2 = ablfVar;
                                String str3 = (String) obj3;
                                able ableVar2 = new able(ablfVar2, str3, abnxVar3.a, abnxVar3.b);
                                ablfVar = ablfVar2;
                                acga acgaVar2 = ablfVar.j;
                                if (acgaVar2 != null) {
                                    acgaVar2.g(ableVar2);
                                }
                                if (!ablfVar.d(str3)) {
                                    ablfVar.h.put(obj3, ableVar2);
                                }
                            }
                        }
                        yvs yvsVarA = ahhaVar.a();
                        if (aawyVar.b() || (yvsVarA != null && yvsVarA.b == 4)) {
                            ablf ablfVar3 = ablfVar;
                            able ableVar3 = new able(ablfVar3, ablfVar.b, aawyVar.a() + 1, aawyVar.a() + 1);
                            acga acgaVar3 = ablfVar3.j;
                            if (acgaVar3 != null) {
                                acgaVar3.g(ableVar3);
                            }
                        }
                        break;
                    }
                }
                break;
            case 9:
                aaxj aaxjVar = (aaxj) obj;
                ablf ablfVar4 = (ablf) this.a;
                acjb acjbVar = ablfVar4.c;
                if (acjbVar != null) {
                    ablfVar4.f = true;
                    long j2 = aaxjVar.a;
                    aciw aciwVarT = acjbVar.t(j2);
                    ablfVar4.i = new abnx(aciwVarT != null ? aciwVarT.h : ablfVar4.b, j2, j2);
                }
                break;
            case 10:
                acip acipVar2 = ((aazq) obj).b;
                abyv abyvVarP = acipVar2.p();
                ablf ablfVar5 = (ablf) this.a;
                ablfVar5.e = abyvVarP;
                ablfVar5.j = acipVar2.bq();
                ablfVar5.c();
                break;
            case 11:
                ((ablf) this.a).c();
                break;
            case 12:
                acip acipVar3 = ((aazq) obj).b;
                acipVar3.getClass();
                dxu dxuVar = (dxu) this.a;
                abfv abfvVar = (abfv) dxuVar.d;
                adws adwsVar = (adws) abfvVar.a.io();
                adwsVar.getClass();
                Object obj4 = dxuVar.b;
                obj4.getClass();
                ablo abloVar = new ablo(acipVar3, abfvVar.b, adwsVar, (abmt) obj4);
                abloVar.b.c(abloVar.h.ak(new abll(abloVar, 7)));
                break;
            case 13:
                aayp aaypVar = (aayp) obj;
                wjf wjfVar = aaypVar.a;
                ablx ablxVar = (ablx) this.a;
                ablxVar.c(wjfVar);
                if (ablxVar.o.bY()) {
                    String str4 = aaypVar.b;
                }
                break;
            case 14:
                aazk aazkVar = (aazk) obj;
                ablx ablxVar2 = (ablx) this.a;
                if (ablxVar2.e()) {
                    long j3 = aazkVar.e - aazkVar.a;
                    long j4 = aazkVar.d;
                    vxz vxzVar = ablxVar2.q;
                    long jMin = 5000;
                    if (vxzVar != null && vxzVar.c(7, 45422129L, 0L) > 0) {
                        jMin = Math.min(5000L, j4 / vxzVar.c(7, 45422129L, 0L));
                    }
                    ablxVar2.j = j3 > jMin;
                }
                break;
            case 15:
                acip acipVar4 = ((aazq) obj).b;
                wjf wjfVarF = acipVar4.f();
                if (acipVar4.a() == 3 && wjfVarF != null) {
                    ((ablx) this.a).c(wjfVarF);
                    break;
                }
                break;
            case 16:
                aazn aaznVar = (aazn) obj;
                ablx ablxVar3 = (ablx) this.a;
                if (ablxVar3.e()) {
                    boolean zA = aaznVar.a();
                    ablxVar3.k = zA;
                    ablxVar3.j = !zA && ablxVar3.j;
                }
                break;
            case 17:
                ((ablx) this.a).d();
                break;
            case 18:
                aazj aazjVar = (aazj) obj;
                abob abobVar = aazjVar.a;
                boolean zA2 = abobVar.a(abob.c);
                Object obj5 = this.a;
                if (zA2) {
                    abmc abmcVar = (abmc) obj5;
                    abmcVar.g = null;
                    wjf wjfVar2 = aazjVar.b;
                    if (wjfVar2 != null) {
                        for (alvq alvqVar : wjfVar2.ad()) {
                            if (alvqVar != null && (alvqVar.b & 2) != 0) {
                                arnk arnkVar = alvqVar.d;
                                if (arnkVar == null) {
                                    arnkVar = arnk.a;
                                }
                                abmcVar.g = arnkVar;
                                abmcVar.k = aazjVar.g;
                            }
                        }
                    }
                } else if (abobVar.a(abob.a, abob.j)) {
                    abmc abmcVar2 = (abmc) obj5;
                    abmcVar2.a();
                    abmcVar2.k = "";
                    abmcVar2.l = -1;
                }
                ((abmc) obj5).j = abobVar.a(abob.i);
                break;
            case 19:
                aazk aazkVar2 = (aazk) obj;
                Object obj6 = this.a;
                abmc abmcVar3 = (abmc) obj6;
                arnk arnkVar2 = abmcVar3.g;
                if (abmcVar3.j && arnkVar2 != null) {
                    arnl arnlVar = arnkVar2.b;
                    if (arnlVar == null) {
                        arnlVar = arnl.a;
                    }
                    if (arnlVar.b == 126827209 && !abmcVar3.i) {
                        arnl arnlVar2 = arnkVar2.b;
                        if (arnlVar2 == null) {
                            arnlVar2 = arnl.a;
                        }
                        arnj arnjVar = arnlVar2.b == 126827209 ? (arnj) arnlVar2.c : arnj.a;
                        long j5 = aazkVar2.a;
                        if (j5 > TimeUnit.SECONDS.toMillis(arnjVar.d)) {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            abmcVar3.l = (int) (j5 / 1000);
                            tun tunVar = abmcVar3.d;
                            long jB = tunVar.c.b();
                            long j6 = tunVar.a;
                            if ((j6 != -1 ? jB - j6 : -1L) <= arnjVar.c) {
                                abmcVar3.h(2, arnjVar);
                            } else if (arnjVar.f == 0) {
                                abmcVar3.g(arnjVar);
                                abmcVar3.f(arnjVar);
                            } else {
                                int i = arnjVar.b;
                                if ((i & SemanticState.Focused) == 0 || !arnjVar.i) {
                                    abmcVar3.b(arnjVar, false);
                                } else {
                                    hee heeVar = abmcVar3.m;
                                    aefw aefwVar = new aefw(obj6, arnjVar, 1);
                                    vqd vqdVar = new vqd(obj6, (aihn) arnjVar, 18);
                                    if ((i & SemanticState.ReadOnly) != 0) {
                                        alayVar = arnjVar.j;
                                        if (alayVar == null) {
                                            alayVar = alay.a;
                                        }
                                    } else {
                                        alayVar = null;
                                    }
                                    Spanned spannedK = ackj.k(null, alayVar, null, false);
                                    if (!TextUtils.isEmpty(spannedK)) {
                                        ?? r1 = heeVar.a;
                                        jio jioVarE = jin.e();
                                        jik jikVar = (jik) jioVarE;
                                        jikVar.i(arnjVar.f);
                                        jikVar.k(spannedK);
                                        jikVar.a = aefwVar;
                                        ajng ajngVar = arnjVar.k;
                                        if (ajngVar == null) {
                                            ajngVar = ajng.a;
                                        }
                                        if ((ajngVar.b & 1) != 0) {
                                            ajng ajngVar2 = arnjVar.k;
                                            if (ajngVar2 == null) {
                                                ajngVar2 = ajng.a;
                                            }
                                            ajnf ajnfVar = ajngVar2.c;
                                            if (ajnfVar == null) {
                                                ajnfVar = ajnf.a;
                                            }
                                            if ((ajnfVar.b & 64) != 0) {
                                                ajng ajngVar3 = arnjVar.k;
                                                if (ajngVar3 == null) {
                                                    ajngVar3 = ajng.a;
                                                }
                                                ajnf ajnfVar2 = ajngVar3.c;
                                                if (ajnfVar2 == null) {
                                                    ajnfVar2 = ajnf.a;
                                                }
                                                alayVar2 = ajnfVar2.m;
                                                if (alayVar2 == null) {
                                                    alayVar2 = alay.a;
                                                }
                                            } else {
                                                alayVar2 = null;
                                            }
                                            jioVarE.l(ackj.k(null, alayVar2, null, false), vqdVar);
                                        }
                                        heeVar.b = jioVarE.b();
                                        r1.d((aefd) heeVar.b);
                                    }
                                }
                            }
                            abmcVar3.g = null;
                        }
                        break;
                    }
                }
                break;
            default:
                ((abmc) this.a).i = ((aaxo) obj).a == abnr.REMOTE;
                break;
        }
    }
}

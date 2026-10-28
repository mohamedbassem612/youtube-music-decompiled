package defpackage;

import android.text.TextUtils;
import j$.time.Duration;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abtq implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abtq(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x016c  */
    /* JADX WARN: Type inference failed for: r10v35, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v36, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v37, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v38, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v39, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v40, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v41, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [acey, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        int i;
        acca accaVar;
        acca accaVarC;
        wjf wjfVar = null;
        switch (this.$cid) {
            case 0:
                int iOrdinal = ((abmh) obj).a.ordinal();
                Object obj2 = this.a;
                switch (iOrdinal) {
                    case 0:
                    case 1:
                    case 2:
                    case 6:
                    case 7:
                        ((abtr) obj2).a();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        abtr abtrVar = (abtr) obj2;
                        if (abtrVar.h) {
                            abtrVar.i++;
                        }
                        break;
                }
                break;
            case 1:
                abtr abtrVar2 = (abtr) this.a;
                aunn aunnVar = abtrVar2.c;
                aboe aboeVar = (aboe) obj;
                if (aunnVar != null) {
                    aavo aavoVar = (aavo) aunnVar.io();
                    abtu abtuVar = abtu.c;
                    if ((aajg.g(aavoVar.q(abtuVar)) || aajg.g(((aavo) aunnVar.io()).q(abtu.d))) && aboeVar.g() && abtrVar2.i < abtrVar2.a.e) {
                        if (((aavo) aunnVar.io()).q(abtuVar) == 2) {
                            abtrVar2.h = true;
                            abtrVar2.b.post(abtrVar2.f);
                        } else if (((aavo) aunnVar.io()).q(abtu.d) == 2) {
                            abtrVar2.h = true;
                            abtrVar2.b.post(abtrVar2.g);
                        } else if (((aavo) aunnVar.io()).q(abtuVar) == 3) {
                            abtrVar2.j = true;
                        }
                    }
                }
                abtrVar2.a();
                break;
            case 2:
                ((abtr) this.a).a();
                break;
            case 3:
                abnw abnwVar = ((aayw) obj).b;
                Object obj3 = this.a;
                if (abnwVar == abnw.e) {
                    abtr abtrVar3 = (abtr) obj3;
                    if (abtrVar3.j && ((aavo) abtrVar3.c.io()).q(abtu.c) == 2) {
                        abtrVar3.h = true;
                        abtrVar3.b.post(abtrVar3.f);
                        abtrVar3.j = false;
                    }
                }
                if (abnwVar == abnw.b) {
                    ((abtr) obj3).j = false;
                }
                break;
            case 4:
                boolean z = ((aayn) obj).a;
                Object obj4 = this.a;
                if (z) {
                    ((aavg) obj4).a();
                } else {
                    ((aavg) obj4).b();
                }
                break;
            case 5:
                abmw abmwVar = abmw.MEDIASESSION;
                boolean zC = ((aazn) obj).c();
                aavr aavrVar = (aavr) this.a;
                aavrVar.j = zC;
                if (zC) {
                    aavrVar.b();
                }
                break;
            case 6:
                if (((aazn) obj).a != 3) {
                    ((aboi) this.a).b = false;
                }
                break;
            case 7:
                ((abvk) this.a).handleSequencerEndedEvent((aayu) obj);
                break;
            case 8:
                ((abvk) this.a).handlePlaybackServiceException((aboe) obj);
                break;
            case 9:
                aayo aayoVar = (aayo) obj;
                taq.d();
                abvk abvkVar = (abvk) this.a;
                abwk abwkVar = abvkVar.o;
                ?? r1 = abwkVar.d;
                if (r1 != 0) {
                    boolean zAj = r1.aj();
                    r1.aa(false);
                    abpj abpjVar = abvkVar.m;
                    acey aceyVarA = abwkVar.a(abpjVar.k, abvkVar.e(abpjVar.l));
                    if (!zAj) {
                        aceyVarA.aa(true);
                    }
                }
                abvkVar.p.d(Duration.ZERO, aayoVar.a);
                break;
            case 10:
                aazj aazjVar = (aazj) obj;
                abob abobVar = aazjVar.a;
                acag acagVar = (acag) this.a;
                abob abobVar2 = acagVar.t;
                acagVar.t = abobVar;
                abob abobVar3 = abob.a;
                if (abobVar.a(abobVar3)) {
                    if (!acagVar.i.o.l(271, 45815833L, false) || !abobVar2.a(abobVar3)) {
                        acagVar.l();
                    }
                } else if (acagVar.i.g.l(203, 45688015L, false) ? abobVar.a(abob.i, abob.f) : abobVar.a(abob.c, abob.i, abob.f)) {
                    if (abobVar == abob.f) {
                        wjf wjfVar2 = aazjVar.c;
                        if (wjfVar2 != null) {
                            wjfVar = wjfVar2;
                        }
                    } else {
                        wjfVar = aazjVar.b;
                    }
                    if (!Objects.equals(wjfVar, acagVar.p)) {
                        acagVar.p = wjfVar;
                        if (wjfVar == null) {
                            acagVar.l();
                        } else {
                            acagVar.k(wjfVar, wjfVar.x());
                        }
                    }
                }
                break;
            case 11:
                aazj aazjVar2 = (aazj) obj;
                abob abobVar4 = aazjVar2.a;
                Object obj5 = this.a;
                abob abobVar5 = abob.h;
                if (abobVar4 == abobVar5) {
                    ((aavg) obj5).l = aazjVar2.b;
                } else if (abobVar4 == abob.e) {
                    ((aavg) obj5).l = aazjVar2.c;
                } else if (abobVar4 == abob.c) {
                    aavg aavgVar = (aavg) obj5;
                    aavgVar.h.a(aavgVar.p);
                }
                aavg aavgVar2 = (aavg) obj5;
                if (!aavgVar2.i.bx(2L) || abobVar4.a(abobVar5, abob.e)) {
                    wjf wjfVar3 = aavgVar2.l;
                    if (wjfVar3 != null && wjfVar3.u() != null && (wjfVar3.u().b & 8) != 0) {
                        alvw alvwVar = wjfVar3.u().g;
                        if (alvwVar == null) {
                            alvwVar = alvw.a;
                        }
                        if ((alvwVar.b & 67108864) != 0) {
                            alvw alvwVar2 = wjfVar3.u().g;
                            if (alvwVar2 == null) {
                                alvwVar2 = alvw.a;
                            }
                            anzw anzwVarA = anzw.a(alvwVar2.p);
                            if (anzwVarA == null) {
                                anzwVarA = anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
                            }
                            i = anzwVarA != anzw.MUSIC_VIDEO_TYPE_PODCAST_EPISODE ? 2 : 3;
                        }
                    }
                    if (aavgVar2.n != i) {
                        aavgVar2.n = i;
                        aavgVar2.b();
                    }
                }
                break;
            case 12:
                acag acagVar2 = (acag) this.a;
                accc acccVar = acagVar2.o;
                wgs wgsVar = ((yvu) obj).f;
                if (acccVar != null && wgsVar != null && !wgsVar.v().isEmpty()) {
                    String strV = wgsVar.v();
                    int i2 = 0;
                    for (aopx aopxVar : acccVar.a.c) {
                        if (TextUtils.equals(strV, aopxVar.c)) {
                            acccVar.b = aopxVar;
                            acccVar.c = i2;
                            if (acagVar2.o(acagVar2.n)) {
                                acagVar2.n = null;
                            }
                            accaVar = acagVar2.n;
                            if (accaVar != null && (accaVarC = acccVar.c(accaVar.a)) != null) {
                                acagVar2.n = accaVarC;
                            }
                            acagVar2.n(new aazb(acagVar2.n, aazh.b, 0, acagVar2.c()));
                        } else {
                            i2++;
                        }
                        break;
                    }
                    if (acagVar2.o(acagVar2.n)) {
                        acagVar2.n = null;
                    }
                    accaVar = acagVar2.n;
                    if (accaVar != null) {
                        acagVar2.n = accaVarC;
                    }
                    acagVar2.n(new aazb(acagVar2.n, aazh.b, 0, acagVar2.c()));
                    break;
                }
                break;
            case 13:
                if (((aazn) obj).a == 2) {
                    aavg aavgVar3 = (aavg) this.a;
                    aavgVar3.h.a(aavgVar3.p);
                    if (aavgVar3.m == 1) {
                        wjf wjfVar4 = aavgVar3.l;
                        wiu wiuVarF = wjfVar4 != null ? wjfVar4.f() : aavgVar3.d.io();
                        abnc abncVar = aavgVar3.c;
                        if (abncVar.a() != 0.0f && abncVar.s != 2) {
                            if (wiuVarF != null) {
                                if (!wiuVarF.aO()) {
                                    if (wiuVarF.aQ() && abncVar.s == 1) {
                                    }
                                }
                            }
                            aavgVar3.b();
                            break;
                        }
                    }
                }
                break;
            case 14:
                this.a.invoke(obj);
                break;
            case 15:
                this.a.invoke(obj);
                break;
            case 16:
                this.a.invoke(obj);
                break;
            case 17:
                this.a.invoke(obj);
                break;
            case 18:
                this.a.invoke(obj);
                break;
            case 19:
                this.a.invoke(obj);
                break;
            default:
                String str = abwx.a;
                this.a.invoke(obj);
                break;
        }
    }
}

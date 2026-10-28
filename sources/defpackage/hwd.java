package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hwd implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hwd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, vxe] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        wjf wjfVar;
        switch (this.$cid) {
            case 0:
                ((hwg) this.a).a.H();
                break;
            case 1:
                hww hwwVar = (hww) obj;
                hwg hwgVar = (hwg) this.a;
                hwgVar.e();
                hww hwwVar2 = hww.c;
                if (hwwVar.b(hwwVar2) && hwgVar.v) {
                    hwgVar.v = false;
                    hwgVar.a.D();
                }
                if (!hwwVar.b(hwwVar2)) {
                    hwgVar.d();
                }
                break;
            case 2:
                ((hwf) this.a).handleVideoStageEvent((aazj) obj);
                break;
            case 3:
                ((hwf) this.a).handleSequencerStageEvent((aayw) obj);
                break;
            case 4:
                ((hwf) this.a).handlePlaybackServiceException((aboe) obj);
                break;
            case 5:
                aayw aaywVar = (aayw) obj;
                int iOrdinal = aaywVar.b.ordinal();
                Object obj2 = this.a;
                if (iOrdinal == 0) {
                    ((hwj) ((hwf) obj2).a).c = false;
                } else if (iOrdinal == 1) {
                    ((hwj) ((hwf) obj2).a).c = igs.c(gzj.P(aaywVar.e));
                } else if (iOrdinal == 3) {
                    Object obj3 = ((hwf) obj2).a;
                    wjf wjfVar2 = aaywVar.c;
                    ((hwj) obj3).c = wjfVar2 != null && hna.y(wjfVar2);
                }
                break;
            case 6:
                hwr hwrVar = (hwr) this.a;
                axfd axfdVar = hwrVar.p;
                if (axfdVar.ah().isPresent()) {
                    hwrVar.b((hyw) axfdVar.ah().get());
                }
                break;
            case 7:
                aazj aazjVar = (aazj) obj;
                boolean zH = aazjVar.a.h();
                hwr hwrVar2 = (hwr) ((hws) this.a).a;
                hwrVar2.h = zH;
                wjf wjfVar3 = aazjVar.b;
                if (wjfVar3 != null) {
                    hwrVar2.j = hna.v(wjfVar3);
                }
                hwrVar2.a();
                break;
            case 8:
                aayw aaywVar2 = (aayw) obj;
                abnw abnwVar = aaywVar2.b;
                Object obj4 = this.a;
                if (abnwVar == abnw.a) {
                    hwr hwrVar3 = (hwr) ((hws) obj4).a;
                    if (hwrVar3.p.ah().isEmpty()) {
                        hwrVar3.a.x(null);
                    }
                    hwrVar3.k = false;
                    hwrVar3.l = false;
                    hwrVar3.i = null;
                    hwrVar3.m = true;
                    break;
                } else {
                    hwr hwrVar4 = (hwr) ((hws) obj4).a;
                    if (hwrVar4.m) {
                        if (abnwVar.b(abnw.e)) {
                            hwrVar4.m = false;
                            break;
                        } else {
                            wjf wjfVar4 = aaywVar2.c;
                            if (wjfVar4 != null && wjfVar4.af().m()) {
                                hwrVar4.d(wjfVar4.af());
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                int i = ((aazn) obj).a;
                hwr hwrVar5 = (hwr) ((hws) this.a).a;
                hwrVar5.l = i == 4;
                hwrVar5.a();
                break;
            case 10:
                ((hws) this.a).handleVideoStageEvent((aazj) obj);
                break;
            case 11:
                ((hws) this.a).handleSequencerStageEvent((aayw) obj);
                break;
            case 12:
                ((hws) this.a).handlePlaybackServiceException((aboe) obj);
                break;
            case 13:
                aazj aazjVar2 = (aazj) obj;
                trf trfVar = (trf) this.a;
                if (((trfVar.b == null && aazjVar2.a.c(abob.c)) || aazjVar2.a == abob.c) && (wjfVar = aazjVar2.b) != null) {
                    Iterator it = wjfVar.u().y.iterator();
                    while (it.hasNext()) {
                        trfVar.a.c((ajwo) it.next(), null);
                    }
                }
                trfVar.b = aazjVar2.a;
                break;
            case 14:
                ((hwy) this.a).c();
                break;
            case 15:
                aayw aaywVar3 = (aayw) obj;
                int iOrdinal2 = aaywVar3.b.ordinal();
                Object obj5 = this.a;
                if (iOrdinal2 == 0) {
                    ((fdl) ((hxh) obj5).a).f();
                } else if (iOrdinal2 == 3) {
                    Object obj6 = ((hxh) obj5).a;
                    boolean zW = hna.w(aaywVar3.c);
                    fdl fdlVar = (fdl) obj6;
                    if (!fdlVar.a) {
                        if (!zW) {
                            fdlVar.f();
                        }
                    } else if (!zW) {
                        fdlVar.a = false;
                        ((awku) fdlVar.b).kk(akxs.FEATURE_AVAILABILITY_ALLOWED);
                    }
                    if (!fdlVar.g()) {
                        fdlVar.a = hwz.k(((hwz) fdlVar.c).f());
                    }
                    ((awku) fdlVar.b).kk(akxs.FEATURE_AVAILABILITY_BLOCKED);
                }
                break;
            case 16:
                aayw aaywVar4 = (aayw) obj;
                int iOrdinal3 = aaywVar4.b.ordinal();
                Object obj7 = this.a;
                if (iOrdinal3 == 0) {
                    ((awku) ((ayq) obj7).c).kk(Boolean.FALSE);
                } else if (iOrdinal3 == 1) {
                    ((awku) ((ayq) obj7).c).kk(Boolean.valueOf(igs.c(gzj.P(aaywVar4.e))));
                } else if (iOrdinal3 == 3) {
                    Object obj8 = ((ayq) obj7).c;
                    wjf wjfVar5 = aaywVar4.c;
                    ((awku) obj8).kk(Boolean.valueOf(wjfVar5 != null && hna.y(wjfVar5)));
                }
                break;
            case 17:
                Boolean bool = (Boolean) obj;
                hxj hxjVar = (hxj) this.a;
                if (hxjVar.i != bool.booleanValue()) {
                    hxjVar.i = bool.booleanValue();
                    hxjVar.f();
                }
                break;
            case 18:
                ((hxj) this.a).f();
                break;
            case 19:
                hxj hxjVar2 = (hxj) this.a;
                hxjVar2.l.j((ibh) obj);
                hxjVar2.e();
                break;
            default:
                ((hxj) this.a).d((hyz) ((hzc) obj).a().orElse(null));
                break;
        }
    }
}

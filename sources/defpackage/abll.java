package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abll implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abll(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.avni
    public final void a(Object obj) {
        abzc abzcVar;
        abzc abzcVar2;
        int i = 4;
        int i2 = 3;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                wjf wjfVar = ((aayp) obj).a;
                ablm ablmVar = (ablm) this.a;
                if (ablmVar.e.e.m(229, 45646334L) || (wjfVar != null && wjfVar.f().aA())) {
                    z = true;
                }
                ablmVar.g = z;
                break;
            case 1:
                acip acipVar = ((aazq) obj).b;
                acjb acjbVarX = acipVar.x();
                ablm ablmVar2 = (ablm) this.a;
                ablmVar2.b = acjbVarX;
                ablmVar2.d = acipVar.l();
                ablmVar2.c.clear();
                ablmVar2.f = 0;
                break;
            case 2:
                ((ablm) this.a).d((aawz) obj);
                break;
            case 3:
                ablo abloVar = (ablo) this.a;
                abzc abzcVar3 = abloVar.w;
                if (abzcVar3 != null) {
                    abzcVar3.k(abloVar.v.f);
                }
                abloVar.t.clear();
                abloVar.a();
                break;
            case 4:
                boolean z2 = ((aayn) obj).a;
                Object obj2 = this.a;
                if (!z2) {
                    abzc abzcVar4 = ((ablo) obj2).w;
                    if (abzcVar4 != null) {
                        abzcVar4.s();
                    }
                } else {
                    abzc abzcVar5 = ((ablo) obj2).w;
                    if (abzcVar5 != null) {
                        abzcVar5.m();
                    }
                }
                break;
            case 5:
                aaxh aaxhVar = (aaxh) obj;
                abzc abzcVar6 = ((ablo) this.a).w;
                if (abzcVar6 != null) {
                    abzcVar6.e(aaxhVar);
                }
                break;
            case 6:
                aazg aazgVar = (aazg) obj;
                abzc abzcVar7 = ((ablo) this.a).w;
                if (abzcVar7 != null) {
                    abzcVar7.h(aazgVar);
                }
                break;
            case 7:
                wjf wjfVar2 = ((aayp) obj).a;
                if (wjfVar2 != null && wjfVar2.f().ag()) {
                    Object obj3 = this.a;
                    final ablo abloVar2 = (ablo) obj3;
                    avmn avmnVarAk = abloVar2.g.ak(new avni() { // from class: abln
                        @Override // defpackage.avni
                        public final void a(Object obj4) {
                            abzc abzcVar8;
                            String str;
                            aaza aazaVar = (aaza) obj4;
                            boolean z3 = aazaVar.g;
                            ablo abloVar3 = abloVar2;
                            if (!z3) {
                                String str2 = aazaVar.a;
                                if (abloVar3.b(str2) || !str2.equals(abloVar3.x) || (abzcVar8 = abloVar3.w) == null) {
                                    return;
                                }
                                abzcVar8.r();
                                abyu abyuVarB = abloVar3.w.b();
                                HashMap map = abloVar3.t;
                                aazo aazoVar = (aazo) map.get(str2);
                                map.put(str2, new aazo(Long.valueOf(aazoVar != null ? ((Long) aazoVar.b).longValue() : 0L), abyuVarB, null));
                                abloVar3.a();
                                return;
                            }
                            String str3 = aazaVar.a;
                            if (abloVar3.b(str3)) {
                                abloVar3.a();
                                return;
                            }
                            wjf wjfVar3 = aazaVar.j;
                            if (wjfVar3.h().b == null) {
                                ((agrc) ((agrc) ablo.a.c()).k("com/google/android/libraries/youtube/player/features/serverstitch/VideoStatsMonitor", "handleStitchedVideoTransition", 165, "VideoStatsMonitor.java")).t("Missing Vss base url");
                                return;
                            }
                            String str4 = abloVar3.y;
                            long j = aazaVar.e;
                            if (str3.equals(abloVar3.x)) {
                                str = str3;
                            } else {
                                HashMap map2 = abloVar3.t;
                                aazo aazoVar2 = (aazo) map2.get(str3);
                                abzd abzdVar = abloVar3.s;
                                boolean z4 = aazoVar2 != null && ((abyu) aazoVar2.a).a;
                                boolean z5 = aazoVar2 != null && ((abyu) aazoVar2.a).b;
                                boolean z6 = aazoVar2 != null && ((abyu) aazoVar2.a).c;
                                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) abzdVar.a.io();
                                scheduledExecutorService.getClass();
                                zxj zxjVar = (zxj) abzdVar.b.io();
                                zxjVar.getClass();
                                zrx zrxVar = (zrx) abzdVar.c.io();
                                zrxVar.getClass();
                                mbc mbcVar = (mbc) abzdVar.d.io();
                                mbcVar.getClass();
                                tfq tfqVar = (tfq) abzdVar.e.io();
                                tfqVar.getClass();
                                tyw tywVar = (tyw) abzdVar.f.io();
                                tywVar.getClass();
                                abuz abuzVar = (abuz) abzdVar.g.io();
                                abuzVar.getClass();
                                zzj zzjVar = (zzj) abzdVar.h.io();
                                zzjVar.getClass();
                                tun tunVar = (tun) abzdVar.i.io();
                                aawa aawaVar = (aawa) abzdVar.j.io();
                                aawaVar.getClass();
                                zwb zwbVar = (zwb) abzdVar.k.io();
                                zwbVar.getClass();
                                ci ciVar = (ci) abzdVar.l.io();
                                ciVar.getClass();
                                vyo vyoVar = (vyo) abzdVar.m.io();
                                vyoVar.getClass();
                                vxu vxuVar = (vxu) abzdVar.n.io();
                                vxuVar.getClass();
                                abmt abmtVar = (abmt) abzdVar.o.io();
                                abmtVar.getClass();
                                abnc abncVar = (abnc) abzdVar.p.io();
                                abncVar.getClass();
                                aboi aboiVar = (aboi) abzdVar.q.io();
                                aboiVar.getClass();
                                arif arifVar = (arif) abzdVar.r.io();
                                abzj abzjVar = (abzj) abzdVar.s.io();
                                abzjVar.getClass();
                                awmd awmdVar = abzdVar.t;
                                awmd awmdVar2 = abzdVar.u;
                                awmd awmdVar3 = abzdVar.v;
                                abnl abnlVar = (abnl) ((aupo) awmdVar).b;
                                abnp abnpVar = (abnp) ((aupo) awmdVar2).b;
                                xeu xeuVar = (xeu) awmdVar3.io();
                                xeuVar.getClass();
                                Map map3 = (Map) ((aupo) abzdVar.w).b;
                                map3.getClass();
                                awmd awmdVar4 = abzdVar.x;
                                ijt ijtVar = (ijt) abzdVar.y.io();
                                ijtVar.getClass();
                                abzc abzcVar9 = new abzc(scheduledExecutorService, zxjVar, zrxVar, mbcVar, tfqVar, tywVar, abuzVar, zzjVar, tunVar, aawaVar, zwbVar, ciVar, vyoVar, vxuVar, abmtVar, abncVar, aboiVar, arifVar, abzjVar, abnlVar, abnpVar, xeuVar, map3, awmdVar4, ijtVar, str4, wjfVar3, str3, 1, z4, z5, z6);
                                str = str3;
                                abloVar3.w = abzcVar9;
                                if (aazoVar2 == null) {
                                    map2.put(str, new aazo(Long.valueOf(j), abloVar3.w.b(), null));
                                }
                                abloVar3.x = str;
                            }
                            aciq aciqVar = abloVar3.v;
                            HashMap map4 = abloVar3.t;
                            long jLongValue = aciqVar.f;
                            aazo aazoVar3 = (aazo) map4.get(str);
                            if (aazoVar3 != null) {
                                jLongValue = aciqVar.f - ((Long) aazoVar3.b).longValue();
                            }
                            abzc abzcVar10 = abloVar3.w;
                            if (abzcVar10 != null) {
                                abzcVar10.p(jLongValue);
                            }
                        }
                    });
                    avmm avmmVar = abloVar2.b;
                    avmmVar.c(avmnVarAk);
                    avmmVar.c(abloVar2.c.ak(new abll(obj3, 12)));
                    avmmVar.c(abloVar2.d.ak(new aawl(new abll(obj3, 13), "VSM", 2)));
                    avmmVar.c(abloVar2.e.ak(new abll(obj3, 14)));
                    avmmVar.c(abloVar2.f.ak(new abll(obj3, 15)));
                    avmmVar.c(abloVar2.i.ak(new abll(obj3, 16)));
                    avmmVar.c(abloVar2.j.C(new abll(obj3, i2)));
                    avmmVar.c(abloVar2.k.ak(new abll(obj3, i)));
                    avmmVar.c(abloVar2.l.ak(new abll(obj3, 5)));
                    avmmVar.c(abloVar2.m.ak(new abll(obj3, 6)));
                    avmmVar.c(abloVar2.n.ak(new abll(obj3, 8)));
                    avmmVar.c(((avlh) abloVar2.o.io()).ak(new abll(obj3, 9)));
                    if (!abloVar2.r.cl()) {
                        avmmVar.c(abloVar2.p.ak(new abll(obj3, 11)));
                    } else {
                        avmmVar.c(abloVar2.q.ak(new abll(obj3, 10)));
                    }
                    break;
                }
                break;
            case 8:
                aaxo aaxoVar = (aaxo) obj;
                abzc abzcVar8 = ((ablo) this.a).w;
                if (abzcVar8 != null) {
                    abzcVar8.f(aaxoVar);
                }
                break;
            case 9:
                abzc abzcVar9 = ((ablo) this.a).w;
                if (abzcVar9 != null) {
                    abzcVar9.d();
                }
                break;
            case 10:
                aazl aazlVar = (aazl) obj;
                abzc abzcVar10 = ((ablo) this.a).w;
                if (abzcVar10 != null) {
                    abzcVar10.i(aazlVar);
                }
                break;
            case 11:
                aazb aazbVar = (aazb) obj;
                abzc abzcVar11 = ((ablo) this.a).w;
                if (abzcVar11 != null) {
                    abzcVar11.g(aazbVar);
                }
                break;
            case 12:
                aazn aaznVar = (aazn) obj;
                ablo abloVar3 = (ablo) this.a;
                if (!abloVar3.b(abloVar3.x)) {
                    int i3 = aaznVar.a;
                    if (i3 == 3) {
                        abzc abzcVar12 = abloVar3.w;
                        if (abzcVar12 != null) {
                            abzcVar12.n();
                        }
                        break;
                    } else if (i3 == 4) {
                        abzc abzcVar13 = abloVar3.w;
                        if (abzcVar13 != null) {
                            abzcVar13.q(abloVar3.v.f);
                        }
                        break;
                    } else if (i3 == 7 && (abzcVar = abloVar3.w) != null) {
                        abzcVar.l();
                        break;
                    }
                }
                break;
            case 13:
                aazk aazkVar = (aazk) obj;
                ablo abloVar4 = (ablo) this.a;
                if (!abloVar4.b(abloVar4.x)) {
                    long jLongValue = aazkVar.a;
                    aazo aazoVar = (aazo) abloVar4.t.get(abloVar4.x);
                    if (aazoVar != null) {
                        jLongValue -= ((Long) aazoVar.b).longValue();
                    }
                    long j = jLongValue;
                    long millis = aazkVar.d;
                    acjd acjdVarC = abloVar4.u.c(abloVar4.x);
                    if (acjdVarC instanceof aciw) {
                        millis = TimeUnit.SECONDS.toMillis(((aciw) acjdVarC).i.a());
                    }
                    aazk aazkVar2 = new aazk(j, aazkVar.b, 0L, millis, aazkVar.e, aazkVar.f, aazkVar.g, aazkVar.h, abloVar4.x);
                    abzc abzcVar14 = abloVar4.w;
                    if (abzcVar14 != null) {
                        abzcVar14.t(aazkVar2);
                    }
                }
                break;
            case 14:
                abzc abzcVar15 = ((ablo) this.a).w;
                if (abzcVar15 != null) {
                    abzcVar15.r();
                }
                break;
            case 15:
                yvu yvuVar = (yvu) obj;
                if (yno.cw(yvuVar.j) && (abzcVar2 = ((ablo) this.a).w) != null) {
                    abzcVar2.j(yvuVar);
                    break;
                }
                break;
            case 16:
                aaxj aaxjVar = (aaxj) obj;
                long jLongValue2 = aaxjVar.b;
                ablo abloVar5 = (ablo) this.a;
                aciw aciwVarT = abloVar5.u.t(jLongValue2);
                if (aciwVarT != null) {
                    if (aciwVarT.h.equals(abloVar5.x) && !abloVar5.b(abloVar5.x)) {
                        aazo aazoVar2 = (aazo) abloVar5.t.get(abloVar5.x);
                        if (aazoVar2 != null) {
                            jLongValue2 -= ((Long) aazoVar2.b).longValue();
                        }
                        abzc abzcVar16 = abloVar5.w;
                        if (abzcVar16 != null) {
                            abzcVar16.o(jLongValue2, aaxjVar.c);
                        }
                        break;
                    }
                }
                break;
            case 17:
                ((abmq) this.a).h((aazq) obj);
                break;
            case 18:
                ((abmq) this.a).i((aazs) obj);
                break;
            case 19:
                ((isi) this.a).C((aazk) obj);
                break;
            default:
                ((isi) this.a).C((zhz) obj);
                break;
        }
    }
}

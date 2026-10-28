package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abyr implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abyr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((abyv) this.a).e((aazb) obj);
                break;
            case 1:
                ((abyv) this.a).b();
                break;
            case 2:
                ((avmm) this.a).dispose();
                break;
            case 3:
                aazl aazlVar = (aazl) obj;
                Object obj2 = this.a;
                if (aazlVar != null) {
                    ((abyv) obj2).g = aazlVar;
                }
                abyv abyvVar = (abyv) obj2;
                abzc abzcVar = abyvVar.b;
                if (abzcVar != null && abyvVar.f) {
                    abzcVar.i(aazlVar);
                }
                abzh abzhVar = abyvVar.c;
                if (abzhVar != null && !TextUtils.equals(abzhVar.o, aazlVar.b())) {
                    if (abzhVar.i) {
                        mbc mbcVar = abzhVar.d;
                        abzhVar.b(false, mbcVar.b());
                        abzhVar.l(mbcVar.b());
                    }
                    abzhVar.o = aazlVar.b();
                    break;
                }
                break;
            case 4:
                awka.f((AtomicReference) this.a);
                break;
            case 5:
                ((abyv) this.a).d((aaxo) obj);
                break;
            case 6:
                ((abyv) this.a).p();
                break;
            case 7:
                ((abyv) this.a).c((aaxh) obj);
                break;
            case 8:
                ((abzc) this.a).w();
                break;
            case 9:
                abzh abzhVar2 = (abzh) this.a;
                long jB = abzhVar2.d.b();
                abzhVar2.b(false, jB);
                abzhVar2.l(jB);
                break;
            case 10:
                aaxd aaxdVar = (aaxd) obj;
                boolean z = aaxdVar.d;
                zgj zgjVar = ((acab) this.a).p;
                if (z && zgjVar != null) {
                    zgjVar.E(aaxdVar.c, aaxdVar.b);
                } else if (zgjVar != null) {
                    zgjVar.u(aaxdVar.c);
                }
                break;
            case 11:
                aazk aazkVar = (aazk) obj;
                zgj zgjVar2 = ((acab) this.a).p;
                if (zgjVar2 != null) {
                    zgjVar2.F(aazkVar.h, aazkVar.a, aazkVar.e);
                }
                break;
            case 12:
                aooc aoocVar = (aooc) obj;
                zgj zgjVar3 = ((acab) this.a).p;
                if (zgjVar3 != null) {
                    zgjVar3.I(aoocVar.n);
                }
                break;
            case 13:
                aaza aazaVar = (aaza) obj;
                zgj zgjVar4 = ((acab) this.a).p;
                if (zgjVar4 != null) {
                    zgjVar4.D(aazaVar.e, aazaVar.g, aazaVar.h, aazaVar.i, aazaVar.k, aazaVar.a, aazaVar.a(), aazaVar.b, aazaVar.c);
                }
                break;
            case 14:
                yvu yvuVar = (yvu) obj;
                zgj zgjVar5 = ((acab) this.a).p;
                if (zgjVar5 != null) {
                    zgjVar5.s(yvuVar);
                }
                break;
            case 15:
                aazn aaznVar = (aazn) obj;
                zgj zgjVar6 = ((acab) this.a).p;
                if (zgjVar6 != null) {
                    int i = aaznVar.a;
                    if (i == 2) {
                        zgjVar6.B();
                    } else if (i == 3) {
                        zgjVar6.x();
                    } else if (i == 5) {
                        zgjVar6.p();
                    } else if (i == 6) {
                        zgjVar6.y();
                    } else if (i == 7) {
                        zgjVar6.r();
                    } else if (i == 9 || i == 10) {
                        zgjVar6.C();
                    }
                }
                break;
            case 16:
                aaxh aaxhVar = (aaxh) obj;
                zgj zgjVar7 = ((acab) this.a).p;
                if (zgjVar7 != null) {
                    zgjVar7.h(aaxhVar.c);
                }
                break;
            case 17:
                aazj aazjVar = (aazj) obj;
                wjf wjfVar = aazjVar.b;
                String str = aazjVar.g;
                wjf wjfVar2 = aazjVar.c;
                String str2 = aazjVar.h;
                int iOrdinal = aazjVar.a.ordinal();
                Object obj3 = this.a;
                if (iOrdinal == 3) {
                    acab acabVar = (acab) obj3;
                    zgj zgjVar8 = acabVar.p;
                    if (zgjVar8 != null) {
                        if (acabVar.e()) {
                            zgjVar8.t("dedi", new abzw(obj3, 3));
                        }
                        zgjVar8.z();
                    }
                    break;
                } else if (iOrdinal != 4 && iOrdinal != 5) {
                    if ((iOrdinal == 7 || iOrdinal == 8) && wjfVar != null && str != null) {
                        acab acabVar2 = (acab) obj3;
                        acabVar2.c(wjfVar.G(), str, acabVar2.a, wjfVar.g(), wjfVar.h().e, wjfVar.f(), wjfVar.Z());
                    }
                    break;
                } else if (wjfVar2 != null && wjfVar != null && str2 != null) {
                    acab acabVar3 = (acab) obj3;
                    acabVar3.c(wjfVar2.G(), str2, acabVar3.a, wjfVar.g(), wjfVar2.h().e, wjfVar2.f(), wjfVar2.Z());
                    break;
                }
                break;
            case 18:
                Throwable th = (Throwable) obj;
                zgj zgjVar9 = ((acab) this.a).p;
                if (zgjVar9 == null) {
                    zvp.b(zvn.b, zvm.k, "QoeStatsMonitor failed unexpectedly.", th);
                } else {
                    zgjVar9.w(new zhz(zhw.a, "rx", 0L, th));
                }
                break;
            case 19:
                zhz zhzVar = (zhz) obj;
                zgj zgjVar10 = ((acab) this.a).p;
                if (zgjVar10 != null) {
                    zgjVar10.w(zhzVar);
                }
                break;
            default:
                Object obj4 = this.a;
                acab acabVar4 = (acab) obj4;
                zgj zgjVar11 = acabVar4.p;
                if (zgjVar11 != null) {
                    if (acabVar4.e()) {
                        zgjVar11.t("dedi", new abzw(obj4, 2));
                    }
                    zgjVar11.z();
                }
                break;
        }
    }
}

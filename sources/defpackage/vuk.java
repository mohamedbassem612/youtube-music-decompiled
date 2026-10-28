package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.engagementpanel.size.EngagementPanelSizeBehavior;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vuk {
    public final vua a;
    public final EngagementPanelSizeBehavior b;
    public final vul c;
    public final vuw d;
    public final vtj e;
    public final vuu f;
    public final vum g;
    public final vtt h;
    public final avlh i;
    public final avlh j;
    public final avlh k;
    public final avlh l;
    public final avlh m;
    public final avlh n;
    public final avlh o;
    public final avlh p;
    public final avlh q;
    public final tqj r;
    public final avmm s;
    public int t;
    public vun u;
    public final vwt v;
    public final abxv w;
    private final avlh x;

    /* JADX WARN: Type inference failed for: r2v27, types: [axso, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [axso, java.lang.Object] */
    public vuk(Context context, final vua vuaVar, EngagementPanelSizeBehavior engagementPanelSizeBehavior, vtm vtmVar, final vul vulVar, ahto ahtoVar, abwk abwkVar, ayq ayqVar, vuw vuwVar, vtj vtjVar, vuu vuuVar, vwt vwtVar, vum vumVar, vtt vttVar, abxv abxvVar, wjr wjrVar, vwt vwtVar2, avlr avlrVar, vxz vxzVar, tth tthVar, vxz vxzVar2, tqj tqjVar) {
        int i;
        avlh avlhVarI;
        this.a = vuaVar;
        this.b = engagementPanelSizeBehavior;
        this.c = vulVar;
        this.d = vuwVar;
        this.e = vtjVar;
        this.f = vuuVar;
        this.g = vumVar;
        this.h = vttVar;
        this.w = abxvVar;
        this.v = vwtVar2;
        this.r = tqjVar;
        avmm avmmVar = new avmm();
        this.s = avmmVar;
        vun vunVar = vun.d;
        this.u = vunVar;
        awkv awkvVarAI = new awku(vunVar).aI();
        avlh avlhVarI2 = awkvVarAI.E().u(new rtn(this, 20)).i(new vqh(4));
        this.i = avlhVarI2;
        this.n = (avlh) vwtVar.a;
        Object obj = wjrVar.b;
        final boolean zD = vpo.d(context);
        final avlh avlhVarW = ((avlh) obj).W(new tfk(14));
        final avlh avlhVarP = avlh.f(vulVar.g(), avlhVarI2, new idi(18)).p();
        int i2 = 1;
        avlh avlhVarI3 = avlhVarI2.W(new avnn() { // from class: vud
            @Override // defpackage.avnn
            public final Object a(Object obj2) {
                avlh avlhVarAc = avlhVarW.ac(vulVar.f(), new idi(17));
                final boolean z = zD;
                return avlh.f(avlhVarP, avlhVarAc.R(0, new avnf() { // from class: vuf
                    @Override // defpackage.avnf
                    public final Object a(Object obj3, Object obj4) {
                        Integer num = (Integer) obj3;
                        vuj vujVar = (vuj) obj4;
                        int i3 = vujVar.a;
                        int iWidth = vujVar.b.width();
                        return z ? Integer.valueOf(vuk.c(num.intValue(), i3, -iWidth, 0)) : Integer.valueOf(vuk.c(num.intValue(), i3, 0, iWidth));
                    }
                }), new idi(16));
            }
        }).p().i(new tyc(new vub(this, 3), i2));
        avlh avlhVarH = tzk.X(avlrVar, (avlh) ahtoVar.b, tthVar, vxzVar2.m(25, 45689881L)).H(new tfk(10));
        agev agfaVar = agdf.a;
        avlh avlhVarU = avlhVarH.U(agfaVar);
        avlh avlhVar = vuuVar.e;
        avlh avlhVarG = vulVar.g();
        avnk avnkVar = new avnk() { // from class: vue
            @Override // defpackage.avnk
            public final Object a(Object obj2, Object obj3, Object obj4, Object obj5) {
                avlh avlhVarA;
                vus vusVar = (vus) obj2;
                agev agevVar = (agev) obj5;
                int iIntValue = ((Integer) obj3).intValue();
                int iIntValue2 = ((Integer) obj4).intValue();
                if (agevVar.g() && !((Boolean) agevVar.c()).booleanValue()) {
                    agdf agdfVar = agdf.a;
                    int i3 = avlh.a;
                    avuu avuuVar = new avuu(agdfVar);
                    avnn avnnVar = atqp.j;
                    return avuuVar;
                }
                agev agevVar2 = vusVar.b;
                if (agevVar2.g()) {
                    avlhVarA = (avlh) agevVar2.c();
                } else {
                    vua vuaVar2 = vuaVar;
                    int iA = vuk.a(iIntValue2, 0, 0, 0, vusVar.a);
                    long j = vuaVar2.e;
                    int i4 = avlh.a;
                    avuu avuuVar2 = new avuu(0);
                    avnn avnnVar2 = atqp.j;
                    avlhVarA = vuaVar2.a(iIntValue, iA, j, avuuVar2, vua.a);
                }
                avlh avlhVarH2 = avlhVarA.H(new tfk(18));
                avuu avuuVar3 = new avuu(agdf.a);
                avnn avnnVar3 = atqp.j;
                return avlhVarH2.k(avuuVar3);
            }
        };
        avlhVarI3.getClass();
        int i3 = 2;
        this.o = avlh.f(avlhVar.ad(new axso[]{avlhVarI3, avlhVarG, avlhVarU}, new avnx(avnkVar, 2)).W(new tfk(15)).i(new tyc(new vub(avmmVar, 4), i2)), avlhVarI3, new idi(9)).p().u(new jop(10)).i(new tyc(new vub(this, 0), 1));
        avlh avlhVar2 = (avlh) wjrVar.b;
        final avlh avlhVarF = avlh.f(vtmVar.e(), avlhVar2.H(new tfk(12)), new idi(11));
        final avlh avlhVarW2 = avlhVar2.W(new tfk(13));
        avlh avlhVarF2 = vulVar.f();
        avlh avlhVarH2 = vulVar.h();
        avlh avlhVarI4 = vulVar.i();
        avlh avlhVarM = vulVar.m();
        vug vugVar = new vug();
        avlhVarM.getClass();
        avlhVarI2.getClass();
        avnx avnxVar = new avnx(vugVar, 3);
        axso[] axsoVarArr = {avlhVarF2, avlhVarH2, avlhVarI4, avlhVarM, avlhVarI2};
        int i4 = avlh.a;
        avoj.a(i4, "bufferSize");
        avrz avrzVar = new avrz(axsoVarArr, avnxVar, i4);
        avnn avnnVar = atqp.j;
        final avlh avlhVarP2 = avrzVar.p();
        avlh avlhVarI5 = avlhVarI2.W(new avnn() { // from class: vuc
            @Override // defpackage.avnn
            public final Object a(Object obj2) {
                int i5 = 10;
                idi idiVar = new idi(i5);
                avlh avlhVar3 = avlhVarW2;
                avlh avlhVar4 = avlhVarP2;
                return avlh.f(avlhVar4, avlhVarF.W(new zze(avlhVar3.ac(avlhVar4, new idi(i5)).R(0, new idi(8)), avlhVar3.ac(avlhVar4, idiVar).R(0, new idi(13)), 1)), new idi(15));
            }
        }).p().i(new vqh(4));
        avlh avlhVar3 = vuuVar.e;
        avlh avlhVarH3 = vulVar.h();
        agfaVar = vxzVar.l(204, 45685365L, false) ? new agfa(vulVar.i()) : agfaVar;
        avlh avlhVarM2 = vulVar.m();
        if (agfaVar.g()) {
            List listAsList = Arrays.asList(avlhVarI5, avlhVarH3, (avlh) agfaVar.c(), avlhVarM2, avlhVarU);
            ugm ugmVar = new ugm(vuaVar, 8);
            listAsList.getClass();
            avxy avxyVar = new avxy(avlhVar3, listAsList, ugmVar);
            avnn avnnVar2 = atqp.j;
            i = 4;
            avlhVarI = avxyVar.W(new uxe(12)).i(new vqh(i));
        } else {
            i = 4;
            avlhVarI = avlhVar3.af(avlhVarI5, avlhVarH3, avlhVarM2, avlhVarU, new avnl() { // from class: vuh
                @Override // defpackage.avnl
                public final Object a(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    int iIntValue = ((Integer) obj3).intValue();
                    int iIntValue2 = ((Integer) obj4).intValue();
                    int iIntValue3 = ((Integer) obj5).intValue();
                    return vuk.d(vuaVar, (vus) obj2, iIntValue, iIntValue2, 0, iIntValue3, (agev) obj6);
                }
            }).W(new tfk(17)).i(new vqh(i));
        }
        this.p = avlh.f(avlhVarI, avlhVarI5, new idi(9)).p().u(new vub(this, i3)).i(new vqh(i));
        avlhVarI.x(new jna(16)).ac(vuuVar.e, new idi(14)).aq(awkvVarAI);
        this.l = avlh.f(avlhVarI, vtmVar.d(), new idi(12)).i(new vqh(4));
        this.m = avlh.g(wjrVar.a, vtmVar.d(), avlhVarI.H(new tfk(11)), new vqp(3)).p().i(new vqh(4));
        avlh avlhVar4 = (avlh) ahtoVar.b;
        this.j = avlhVar4;
        avlh avlhVar5 = (avlh) abwkVar.c;
        this.x = avlhVar5;
        this.k = avlh.g(avlhVar5, avlhVar4, ayqVar.a, new vqp(2));
        int i5 = 1;
        this.q = tzk.W(avlrVar, (avlh) ahtoVar.b).W(new hby(this, 20)).p().i(new tyc(new vub(this, i5), i5));
    }

    public static int a(int i, int i2, int i3, int i4, vun vunVar) {
        int iOrdinal = vunVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return i3;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? i2 : i4;
        }
        return i;
    }

    public static int b(int i, int i2, int i3, int i4) {
        int i5 = i + i2;
        return i5 + i3 < i4 ? i4 - i3 : i5;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return (int) tym.A(i + i2, i3, i4);
    }

    public static avlh d(vua vuaVar, vus vusVar, int i, int i2, int i3, int i4, agev agevVar) {
        avlh avlhVarA;
        if (agevVar.g() && ((Boolean) agevVar.c()).booleanValue()) {
            agdf agdfVar = agdf.a;
            int i5 = avlh.a;
            avuu avuuVar = new avuu(agdfVar);
            avnn avnnVar = atqp.j;
            return avuuVar;
        }
        agev agevVar2 = vusVar.b;
        if (agevVar2.g()) {
            avlhVarA = (avlh) agevVar2.c();
        } else {
            avlhVarA = vuaVar.a(i, a(vuaVar.c.c().bottom, i2, i3, i4, vusVar.a), vuaVar.e, vuaVar.b(), vua.a);
        }
        avlh avlhVarH = avlhVarA.H(new tfk(18));
        avuu avuuVar2 = new avuu(agdf.a);
        avnn avnnVar2 = atqp.j;
        return avlhVarH.k(avuuVar2);
    }

    public final void e(View view) {
        this.c.n(view);
    }

    public final void f(View view) {
        this.c.o(view);
    }
}

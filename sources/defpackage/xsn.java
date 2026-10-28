package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class xsn extends adyw implements acwn {
    public ahek A;
    public abfv B;
    private adlq C;
    private admq D;
    private boolean F;
    private elq T;
    private admu k;
    public xsh l;
    public mbc m;
    public abvn n;
    public avmb o;
    public aeda p;
    public adhv q;
    public adxj r;
    public xpq s;
    public xzm t;
    xte u;
    public admo w;
    public ycp x;
    public vxz y;
    public vxz z;
    xsv v = null;
    private final avmm E = new avmm();

    private final void i() {
        if (isAdded() && isVisible()) {
            this.l.h(getActivity(), 3);
        }
        this.l.c(false);
    }

    @Override // defpackage.acwn
    public final void a() {
        if (this.l != null) {
            i();
        }
    }

    @Override // defpackage.adyw, defpackage.aevy, defpackage.gs, defpackage.bp
    public final Dialog iH(Bundle bundle) {
        Dialog dialogIH = super.iH(bundle);
        dialogIH.setOnKeyListener(new xsm(this, 0));
        return dialogIH;
    }

    @Override // defpackage.bp, defpackage.cc
    public void onAttach(Context context) {
        super.onAttach(context);
        final Context contextIG = iG();
        this.k = new admu();
        boolean z = false;
        z = false;
        this.C = new adlq(false);
        this.T = new elq(this.k);
        admq admqVar = new admq();
        this.D = admqVar;
        admqVar.d(xsz.class, new rle(contextIG, 12));
        final int i = 1;
        this.D.d(xvq.class, new adme(this) { // from class: xsk
            public final /* synthetic */ xsn a;

            {
                this.a = this;
            }

            @Override // defpackage.adme
            public final adma a(ViewGroup viewGroup) {
                switch (i) {
                    case 0:
                        xsn xsnVar = this.a;
                        return new xsy(contextIG, xsnVar.l, xsnVar.m, xsnVar.y, xsnVar.p, xsnVar.r);
                    case 1:
                        xsn xsnVar2 = this.a;
                        return new xsw(contextIG, xsnVar2.l, xsnVar2.y, xsnVar2.p, xsnVar2.r);
                    case 2:
                        xsn xsnVar3 = this.a;
                        return new xsq(contextIG, xsnVar3.p, xsnVar3.r, xsnVar3.l);
                    case 3:
                        return new xtd(contextIG, this.a.l, 0);
                    case 4:
                        xsv xsvVar = this.a.v;
                        xsvVar.getClass();
                        return new xsp(contextIG, xsvVar);
                    case 5:
                        xsn xsnVar4 = this.a;
                        return new xtg(contextIG, xsnVar4.l, xsnVar4.getResources());
                    case 6:
                        xsn xsnVar5 = this.a;
                        return new xsr(contextIG, xsnVar5.p, xsnVar5.r, xsnVar5.l);
                    default:
                        xsn xsnVar6 = this.a;
                        return new xst(contextIG, xsnVar6.s, xsnVar6.r, xsnVar6.p);
                }
            }
        });
        admq admqVar2 = this.D;
        final int i2 = z ? 1 : 0;
        admqVar2.d(xtr.class, new adme(this) { // from class: xsk
            public final /* synthetic */ xsn a;

            {
                this.a = this;
            }

            @Override // defpackage.adme
            public final adma a(ViewGroup viewGroup) {
                switch (i2) {
                    case 0:
                        xsn xsnVar = this.a;
                        return new xsy(contextIG, xsnVar.l, xsnVar.m, xsnVar.y, xsnVar.p, xsnVar.r);
                    case 1:
                        xsn xsnVar2 = this.a;
                        return new xsw(contextIG, xsnVar2.l, xsnVar2.y, xsnVar2.p, xsnVar2.r);
                    case 2:
                        xsn xsnVar3 = this.a;
                        return new xsq(contextIG, xsnVar3.p, xsnVar3.r, xsnVar3.l);
                    case 3:
                        return new xtd(contextIG, this.a.l, 0);
                    case 4:
                        xsv xsvVar = this.a.v;
                        xsvVar.getClass();
                        return new xsp(contextIG, xsvVar);
                    case 5:
                        xsn xsnVar4 = this.a;
                        return new xtg(contextIG, xsnVar4.l, xsnVar4.getResources());
                    case 6:
                        xsn xsnVar5 = this.a;
                        return new xsr(contextIG, xsnVar5.p, xsnVar5.r, xsnVar5.l);
                    default:
                        xsn xsnVar6 = this.a;
                        return new xst(contextIG, xsnVar6.s, xsnVar6.r, xsnVar6.p);
                }
            }
        });
        final int i3 = 2;
        this.D.d(xtj.class, new adme(this) { // from class: xsk
            public final /* synthetic */ xsn a;

            {
                this.a = this;
            }

            @Override // defpackage.adme
            public final adma a(ViewGroup viewGroup) {
                switch (i3) {
                    case 0:
                        xsn xsnVar = this.a;
                        return new xsy(contextIG, xsnVar.l, xsnVar.m, xsnVar.y, xsnVar.p, xsnVar.r);
                    case 1:
                        xsn xsnVar2 = this.a;
                        return new xsw(contextIG, xsnVar2.l, xsnVar2.y, xsnVar2.p, xsnVar2.r);
                    case 2:
                        xsn xsnVar3 = this.a;
                        return new xsq(contextIG, xsnVar3.p, xsnVar3.r, xsnVar3.l);
                    case 3:
                        return new xtd(contextIG, this.a.l, 0);
                    case 4:
                        xsv xsvVar = this.a.v;
                        xsvVar.getClass();
                        return new xsp(contextIG, xsvVar);
                    case 5:
                        xsn xsnVar4 = this.a;
                        return new xtg(contextIG, xsnVar4.l, xsnVar4.getResources());
                    case 6:
                        xsn xsnVar5 = this.a;
                        return new xsr(contextIG, xsnVar5.p, xsnVar5.r, xsnVar5.l);
                    default:
                        xsn xsnVar6 = this.a;
                        return new xst(contextIG, xsnVar6.s, xsnVar6.r, xsnVar6.p);
                }
            }
        });
        final int i4 = 3;
        this.D.d(xtb.class, new adme(this) { // from class: xsk
            public final /* synthetic */ xsn a;

            {
                this.a = this;
            }

            @Override // defpackage.adme
            public final adma a(ViewGroup viewGroup) {
                switch (i4) {
                    case 0:
                        xsn xsnVar = this.a;
                        return new xsy(contextIG, xsnVar.l, xsnVar.m, xsnVar.y, xsnVar.p, xsnVar.r);
                    case 1:
                        xsn xsnVar2 = this.a;
                        return new xsw(contextIG, xsnVar2.l, xsnVar2.y, xsnVar2.p, xsnVar2.r);
                    case 2:
                        xsn xsnVar3 = this.a;
                        return new xsq(contextIG, xsnVar3.p, xsnVar3.r, xsnVar3.l);
                    case 3:
                        return new xtd(contextIG, this.a.l, 0);
                    case 4:
                        xsv xsvVar = this.a.v;
                        xsvVar.getClass();
                        return new xsp(contextIG, xsvVar);
                    case 5:
                        xsn xsnVar4 = this.a;
                        return new xtg(contextIG, xsnVar4.l, xsnVar4.getResources());
                    case 6:
                        xsn xsnVar5 = this.a;
                        return new xsr(contextIG, xsnVar5.p, xsnVar5.r, xsnVar5.l);
                    default:
                        xsn xsnVar6 = this.a;
                        return new xst(contextIG, xsnVar6.s, xsnVar6.r, xsnVar6.p);
                }
            }
        });
        final int i5 = 4;
        this.D.d(xso.class, new adme(this) { // from class: xsk
            public final /* synthetic */ xsn a;

            {
                this.a = this;
            }

            @Override // defpackage.adme
            public final adma a(ViewGroup viewGroup) {
                switch (i5) {
                    case 0:
                        xsn xsnVar = this.a;
                        return new xsy(contextIG, xsnVar.l, xsnVar.m, xsnVar.y, xsnVar.p, xsnVar.r);
                    case 1:
                        xsn xsnVar2 = this.a;
                        return new xsw(contextIG, xsnVar2.l, xsnVar2.y, xsnVar2.p, xsnVar2.r);
                    case 2:
                        xsn xsnVar3 = this.a;
                        return new xsq(contextIG, xsnVar3.p, xsnVar3.r, xsnVar3.l);
                    case 3:
                        return new xtd(contextIG, this.a.l, 0);
                    case 4:
                        xsv xsvVar = this.a.v;
                        xsvVar.getClass();
                        return new xsp(contextIG, xsvVar);
                    case 5:
                        xsn xsnVar4 = this.a;
                        return new xtg(contextIG, xsnVar4.l, xsnVar4.getResources());
                    case 6:
                        xsn xsnVar5 = this.a;
                        return new xsr(contextIG, xsnVar5.p, xsnVar5.r, xsnVar5.l);
                    default:
                        xsn xsnVar6 = this.a;
                        return new xst(contextIG, xsnVar6.s, xsnVar6.r, xsnVar6.p);
                }
            }
        });
        final int i6 = 5;
        this.D.d(xtf.class, new adme(this) { // from class: xsk
            public final /* synthetic */ xsn a;

            {
                this.a = this;
            }

            @Override // defpackage.adme
            public final adma a(ViewGroup viewGroup) {
                switch (i6) {
                    case 0:
                        xsn xsnVar = this.a;
                        return new xsy(contextIG, xsnVar.l, xsnVar.m, xsnVar.y, xsnVar.p, xsnVar.r);
                    case 1:
                        xsn xsnVar2 = this.a;
                        return new xsw(contextIG, xsnVar2.l, xsnVar2.y, xsnVar2.p, xsnVar2.r);
                    case 2:
                        xsn xsnVar3 = this.a;
                        return new xsq(contextIG, xsnVar3.p, xsnVar3.r, xsnVar3.l);
                    case 3:
                        return new xtd(contextIG, this.a.l, 0);
                    case 4:
                        xsv xsvVar = this.a.v;
                        xsvVar.getClass();
                        return new xsp(contextIG, xsvVar);
                    case 5:
                        xsn xsnVar4 = this.a;
                        return new xtg(contextIG, xsnVar4.l, xsnVar4.getResources());
                    case 6:
                        xsn xsnVar5 = this.a;
                        return new xsr(contextIG, xsnVar5.p, xsnVar5.r, xsnVar5.l);
                    default:
                        xsn xsnVar6 = this.a;
                        return new xst(contextIG, xsnVar6.s, xsnVar6.r, xsnVar6.p);
                }
            }
        });
        final int i7 = 6;
        this.D.d(xtk.class, new adme(this) { // from class: xsk
            public final /* synthetic */ xsn a;

            {
                this.a = this;
            }

            @Override // defpackage.adme
            public final adma a(ViewGroup viewGroup) {
                switch (i7) {
                    case 0:
                        xsn xsnVar = this.a;
                        return new xsy(contextIG, xsnVar.l, xsnVar.m, xsnVar.y, xsnVar.p, xsnVar.r);
                    case 1:
                        xsn xsnVar2 = this.a;
                        return new xsw(contextIG, xsnVar2.l, xsnVar2.y, xsnVar2.p, xsnVar2.r);
                    case 2:
                        xsn xsnVar3 = this.a;
                        return new xsq(contextIG, xsnVar3.p, xsnVar3.r, xsnVar3.l);
                    case 3:
                        return new xtd(contextIG, this.a.l, 0);
                    case 4:
                        xsv xsvVar = this.a.v;
                        xsvVar.getClass();
                        return new xsp(contextIG, xsvVar);
                    case 5:
                        xsn xsnVar4 = this.a;
                        return new xtg(contextIG, xsnVar4.l, xsnVar4.getResources());
                    case 6:
                        xsn xsnVar5 = this.a;
                        return new xsr(contextIG, xsnVar5.p, xsnVar5.r, xsnVar5.l);
                    default:
                        xsn xsnVar6 = this.a;
                        return new xst(contextIG, xsnVar6.s, xsnVar6.r, xsnVar6.p);
                }
            }
        });
        final int i8 = 7;
        this.D.d(xss.class, new adme(this) { // from class: xsk
            public final /* synthetic */ xsn a;

            {
                this.a = this;
            }

            @Override // defpackage.adme
            public final adma a(ViewGroup viewGroup) {
                switch (i8) {
                    case 0:
                        xsn xsnVar = this.a;
                        return new xsy(contextIG, xsnVar.l, xsnVar.m, xsnVar.y, xsnVar.p, xsnVar.r);
                    case 1:
                        xsn xsnVar2 = this.a;
                        return new xsw(contextIG, xsnVar2.l, xsnVar2.y, xsnVar2.p, xsnVar2.r);
                    case 2:
                        xsn xsnVar3 = this.a;
                        return new xsq(contextIG, xsnVar3.p, xsnVar3.r, xsnVar3.l);
                    case 3:
                        return new xtd(contextIG, this.a.l, 0);
                    case 4:
                        xsv xsvVar = this.a.v;
                        xsvVar.getClass();
                        return new xsp(contextIG, xsvVar);
                    case 5:
                        xsn xsnVar4 = this.a;
                        return new xtg(contextIG, xsnVar4.l, xsnVar4.getResources());
                    case 6:
                        xsn xsnVar5 = this.a;
                        return new xsr(contextIG, xsnVar5.p, xsnVar5.r, xsnVar5.l);
                    default:
                        xsn xsnVar6 = this.a;
                        return new xst(contextIG, xsnVar6.s, xsnVar6.r, xsnVar6.p);
                }
            }
        });
        this.w = this.A.d(this.D);
        this.C.m(-1, this.k, true);
        this.w.D(this.C, null);
        if (this.z.l(137, 45648358L, false) && Build.VERSION.SDK_INT >= 35) {
            z = true;
        }
        this.F = z;
    }

    @Override // defpackage.adyw, defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        xsh xshVar = this.l;
        xshVar.c.x(2, xshVar.a());
    }

    @Override // defpackage.adyw, defpackage.cc
    public final void onDestroy() {
        super.onDestroy();
        this.E.b();
    }

    @Override // defpackage.adyw, defpackage.cc
    public final void onPause() {
        super.onPause();
        if (this.l != null) {
            i();
        }
    }

    @Override // defpackage.cc
    public final void onResume() {
        xgn xgnVar;
        xgt xgtVarA;
        xgt xgtVarA2;
        super.onResume();
        xsh xshVar = this.l;
        if (xshVar != null) {
            xshVar.c(true);
            xsh xshVar2 = this.l;
            xsj xsjVar = xshVar2.c;
            int iA = xshVar2.a();
            xgn xgnVar2 = xsjVar.x;
            if (xgnVar2 != null && (xgtVarA2 = xgnVar2.a()) != null) {
                xsjVar.z = new xgx(xgtVarA2, xhb.b(162177));
                xgnVar2.d(xsjVar.z);
                xgx xgxVar = xsjVar.z;
                aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                aihf aihfVarCreateBuilder2 = amdg.a.createBuilder();
                int iBU = zik.bU(iA);
                aihfVarCreateBuilder2.copyOnWrite();
                amdg amdgVar = (amdg) aihfVarCreateBuilder2.instance;
                amdgVar.d = iBU - 1;
                amdgVar.b |= 4;
                amdg amdgVar2 = (amdg) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                amdgVar2.getClass();
                amddVar.f = amdgVar2;
                amddVar.b |= 4;
                xgnVar2.w(xgxVar, (amdd) aihfVarCreateBuilder.build());
            }
            xsj xsjVar2 = this.l.c;
            if (!xsjVar2.H || xsjVar2.L != null || xsjVar2.z == null || (xgnVar = xsjVar2.x) == null || (xgtVarA = xgnVar.a()) == null) {
                return;
            }
            xgx xgxVar2 = new xgx(xgtVarA, xhb.b(162338), 0, true, (xgz) null, (ajva) null);
            xsjVar2.L = xgxVar2;
            xgx xgxVar3 = xsjVar2.z;
            if (xgxVar3 == null) {
                xgnVar.d(xgxVar2);
            } else {
                xgnVar.e(xgxVar2, xgxVar3);
            }
            xgnVar.w(xgxVar2, null);
            xsjVar2.H = false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [abvn, java.lang.Object] */
    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        cf activity = getActivity();
        avmm avmmVar = this.E;
        avmmVar.b();
        xsh xshVar = this.l;
        if (xshVar != null) {
            if (activity != null) {
                this.u = new xte(this.n, xshVar, this.o, this.q, getResources());
                xsh xshVar2 = this.l;
                xsv xsvVar = new xsv(activity, xshVar2, this.y, this.p, this.r, this.x);
                this.v = xsvVar;
                if (xshVar2.c.s) {
                    xte xteVar = this.u;
                    ?? r2 = xteVar.b;
                    if (zik.bS(r2)) {
                        ((xtf) xteVar.a).f();
                        xteVar.a();
                        ((xsh) xteVar.c).d();
                    }
                    avlh avlhVarP = ((avlh) r2.r().l).p();
                    avmb avmbVar = (avmb) xteVar.d;
                    int i = 1;
                    avmmVar.e(avlhVarP.L(avmbVar).al(new xbo(xteVar, 18), new xuk(i)), r2.M(new vxq(20), new xwx(i)).p().L(avmbVar).al(new xbo(xteVar, 19), new xuk(i)), r2.N().L(avmbVar).al(new xbo(xteVar, 20), new xuk(i)));
                }
                if (this.l.g()) {
                    xsvVar.e.a(xsvVar);
                }
            }
            avlh avlhVarP2 = this.l.c.n.P();
            final elq elqVar = this.T;
            elqVar.getClass();
            avmmVar.c(avlhVarP2.ak(new avni() { // from class: xsl
                /* JADX WARN: Code duplicated, block: B:83:0x0229  */
                /* JADX WARN: Code duplicated, block: B:85:0x0247  */
                /* JADX WARN: Code duplicated, block: B:87:0x024a  */
                /* JADX WARN: Code duplicated, block: B:89:0x024d  */
                /* JADX WARN: Code duplicated, block: B:90:0x0254  */
                /* JADX WARN: Code duplicated, block: B:91:0x025b  */
                /* JADX WARN: Code duplicated, block: B:94:0x0262 A[LOOP:1: B:92:0x025c->B:94:0x0262, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:98:0x0271 A[SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
                @Override // defpackage.avni
                public final void a(Object obj) {
                    int i2;
                    List<twy> listN;
                    float fD;
                    int i3;
                    int iA;
                    int size;
                    agke agkeVarN;
                    int iC;
                    int i4;
                    ?? r0 = elqVar.a;
                    agke agkeVarN2 = agke.n(r0);
                    agke agkeVarN3 = agke.n((List) obj);
                    itl itlVar = new itl(6);
                    agkeVarN2.getClass();
                    agkeVarN3.getClass();
                    boolean zIsEmpty = agkeVarN2.isEmpty();
                    boolean zIsEmpty2 = agkeVarN3.isEmpty();
                    int i5 = 2;
                    int i6 = 0;
                    if (!zIsEmpty) {
                        int i7 = 4;
                        if (zIsEmpty2) {
                            listN = Collections.singletonList(new twz(4, agke.n(agkeVarN2)));
                        } else if (agkeVarN2.size() == 1 || agkeVarN3.size() == 1) {
                            int size2 = agkeVarN2.size();
                            ArrayList arrayList = new ArrayList(size2 == 1 ? agkeVarN2 : agkeVarN3);
                            if (size2 == 1) {
                                agkeVarN2 = agkeVarN3;
                            }
                            ArrayList arrayList2 = new ArrayList(agkeVarN2);
                            int iIndexOf = arrayList2.indexOf(arrayList.get(0));
                            ArrayList arrayList3 = new ArrayList(3);
                            if (iIndexOf == -1) {
                                if (size2 == 1) {
                                    arrayList3.add(new twz(4, arrayList));
                                    arrayList3.add(new twz(3, arrayList2));
                                } else {
                                    arrayList3.add(new twz(4, arrayList2));
                                    arrayList3.add(new twz(3, arrayList));
                                }
                                i2 = 0;
                            } else {
                                int i8 = size2 == 1 ? 3 : 4;
                                if (iIndexOf > 0) {
                                    i2 = 0;
                                    arrayList3.add(new twz(i8, arrayList2.subList(0, iIndexOf)));
                                } else {
                                    i2 = 0;
                                }
                                arrayList3.add(new twz(1, arrayList));
                                int i9 = iIndexOf + 1;
                                int size3 = arrayList2.size();
                                if (i9 < size3) {
                                    arrayList3.add(new twz(i8, arrayList2.subList(i9, size3)));
                                }
                            }
                            listN = arrayList3;
                        } else {
                            List listH = nsj.h(agkeVarN2);
                            List listH2 = nsj.h(agkeVarN3);
                            int size4 = listH.size();
                            int size5 = listH2.size();
                            ArrayList arrayList4 = new ArrayList(size5);
                            arrayList4.add(null);
                            for (int i10 = 1; i10 < size5; i10++) {
                                arrayList4.add(new twx(3, listH2.get(i10), (twx) arrayList4.get(i10 - 1)));
                            }
                            ArrayList arrayList5 = new ArrayList(size5);
                            int i11 = 1;
                            while (i11 < size4) {
                                arrayList5.clear();
                                twx twxVar = (twx) arrayList4.get(i6);
                                Object obj2 = listH.get(i11);
                                twx twxVar2 = new twx(i7, obj2, (twx) arrayList4.get(i6));
                                arrayList5.add(twxVar2);
                                int i12 = 1;
                                while (i12 < size5) {
                                    twx twxVar3 = (twx) arrayList4.get(i12);
                                    if (((Boolean) itlVar.apply(obj2, listH2.get(i12))).booleanValue()) {
                                        fD = twx.d(twxVar);
                                        i3 = 1;
                                    } else {
                                        fD = twx.d(twxVar) + 1.5f;
                                        i3 = i5;
                                    }
                                    if (fD > twx.d(twxVar2) + 1.0f) {
                                        fD = twx.d(twxVar2) + 1.0f;
                                        i3 = 3;
                                    }
                                    if (fD > twx.d(twxVar3) + 1.0f) {
                                        i3 = 4;
                                    }
                                    int i13 = i3 - 1;
                                    twxVar2 = (i13 == 0 || i13 == 1) ? new twx(i3, listH2.get(i12), (twx) arrayList4.get(i12 - 1)) : i13 != i5 ? new twx(i3, listH.get(i11), (twx) arrayList4.get(i12)) : new twx(i3, listH2.get(i12), (twx) arrayList5.get(i12 - 1));
                                    arrayList5.add(twxVar2);
                                    i12++;
                                    twxVar = twxVar3;
                                    i5 = 2;
                                }
                                i11++;
                                ArrayList arrayList6 = arrayList4;
                                arrayList4 = arrayList5;
                                arrayList5 = arrayList6;
                                i7 = 4;
                                i5 = 2;
                                i6 = 0;
                            }
                            twx twxVar4 = (twx) arrayList4.get(size5 - 1);
                            if (twxVar4 == null) {
                                listN = Collections.EMPTY_LIST;
                            } else {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                ArrayDeque arrayDeque2 = new ArrayDeque();
                                int i14 = twxVar4.a;
                                while (twxVar4 != null) {
                                    if (!arrayDeque2.isEmpty() && i14 != twxVar4.a) {
                                        arrayDeque.addFirst(nsj.i(i14, arrayDeque2));
                                        arrayDeque2.clear();
                                    }
                                    i14 = twxVar4.a;
                                    arrayDeque2.addFirst(twxVar4);
                                    twxVar4 = twxVar4.c;
                                }
                                if (!arrayDeque2.isEmpty()) {
                                    arrayDeque.addFirst(nsj.i(i14, arrayDeque2));
                                }
                                listN = agke.n(arrayDeque);
                            }
                            i2 = 0;
                        }
                        iA = i2;
                        for (twy twyVar : listN) {
                            size = twyVar.e().size();
                            agkeVarN = agke.n(twyVar.e());
                            iC = twyVar.c() - 1;
                            if (iC != 1) {
                                for (i4 = i2; i4 < agkeVarN.size(); i4++) {
                                    ((admu) r0).hM(iA + i4, agkeVarN.get(i4));
                                }
                            } else if (iC != 2) {
                                ((tbm) r0).addAll(iA, agkeVarN);
                            } else if (iC == 3) {
                                ((admu) r0).hL(iA, size);
                            }
                            iA += twyVar.a();
                        }
                    }
                    listN = zIsEmpty2 ? Collections.EMPTY_LIST : Collections.singletonList(new twz(3, agke.n(agkeVarN3)));
                    i2 = 0;
                    iA = i2;
                    while (r1.hasNext()) {
                        size = twyVar.e().size();
                        agkeVarN = agke.n(twyVar.e());
                        iC = twyVar.c() - 1;
                        if (iC != 1) {
                            while (i4 < agkeVarN.size()) {
                                ((admu) r0).hM(iA + i4, agkeVarN.get(i4));
                            }
                        } else if (iC != 2) {
                            ((tbm) r0).addAll(iA, agkeVarN);
                        } else if (iC == 3) {
                            ((admu) r0).hL(iA, size);
                        }
                        iA += twyVar.a();
                    }
                }
            }));
        }
        if (this.F) {
            this.B.m(this, "");
        }
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStop() {
        super.onStop();
        this.E.b();
        xsv xsvVar = this.v;
        if (xsvVar == null || !this.l.g()) {
            return;
        }
        xsvVar.e.d(xsvVar);
    }
}

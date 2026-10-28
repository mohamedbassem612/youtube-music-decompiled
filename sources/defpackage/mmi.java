package defpackage;

import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.core.widget.NestedScrollView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mmi extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj A;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj B;

    @fmt(a = 6)
    @fmu(a = fmv.a)
    List a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nry b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    String d;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean e;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean f;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean g;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean q;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean r;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nee s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int u;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int v;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int w;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    mip x;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int y;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj z;

    public mmi() {
        super("ScrollableContainerComponent");
    }

    private static final mmh aE(fhd fhdVar) {
        return (mmh) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    protected final Object A(fip fipVar, Object obj) {
        int i = fipVar.c;
        if (i == -1048037474) {
            gzj.bO((fhd) fipVar.d[0], (isw) obj);
        } else if (i == 1803022739) {
            fiu fiuVar = fipVar.b;
            fhd fhdVar = (fhd) fipVar.d[0];
            Object obj2 = ((ahfi) obj).c;
            mmi mmiVar = (mmi) fiuVar;
            omj omjVar = mmiVar.A;
            nry nryVar = mmiVar.b;
            nsl nslVar = mmiVar.c;
            float f = fhdVar.c().getDisplayMetrics().density;
            if (omjVar != null) {
                ntx ntxVar = nslVar.x;
                ntg ntgVar = nslVar.t;
                CommandOuterClass$Command commandOuterClass$CommandX = omjVar.x();
                aihf aihfVarCreateBuilder = asob.a.createBuilder();
                View view = (View) obj2;
                float fL = ket.L(fhdVar, view.getX());
                aihfVarCreateBuilder.copyOnWrite();
                asob asobVar = (asob) aihfVarCreateBuilder.instance;
                asobVar.b |= 1;
                asobVar.c = fL;
                float fL2 = ket.L(fhdVar, view.getY());
                aihfVarCreateBuilder.copyOnWrite();
                asob asobVar2 = (asob) aihfVarCreateBuilder.instance;
                asobVar2.b |= 2;
                asobVar2.d = fL2;
                asob asobVar3 = (asob) aihfVarCreateBuilder.build();
                aihf aihfVarCreateBuilder2 = ason.a.createBuilder();
                float fL3 = ket.L(fhdVar, view.getMeasuredHeight());
                aihfVarCreateBuilder2.copyOnWrite();
                ason asonVar = (ason) aihfVarCreateBuilder2.instance;
                asonVar.b |= 2;
                asonVar.d = fL3;
                float fL4 = ket.L(fhdVar, view.getMeasuredWidth());
                aihfVarCreateBuilder2.copyOnWrite();
                ason asonVar2 = (ason) aihfVarCreateBuilder2.instance;
                asonVar2.b |= 1;
                asonVar2.c = fL4;
                ket.N(view, nryVar, commandOuterClass$CommandX, ntxVar, ntgVar, asobVar3, (ason) aihfVarCreateBuilder2.build(), f);
            }
        }
        return null;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        mmh mmhVarAE = aE(fhdVar);
        nee neeVar = this.s;
        boolean z = this.r;
        boolean z2 = this.e;
        boolean z3 = this.g;
        boolean z4 = this.q;
        mmf mmfVar = null;
        if (z2 || z3) {
            atomicInteger = new AtomicInteger(-1);
            atomicInteger2 = new AtomicInteger(-1);
        } else {
            atomicInteger = null;
            atomicInteger2 = null;
        }
        mmo mmoVar = z ? new mmo(fhdVar.a, neeVar) : null;
        if (z4) {
            mmfVar = new mmf(neeVar.w() != 3, false);
        }
        mmhVarAE.a = mmoVar;
        mmhVarAE.c = atomicInteger;
        mmhVarAE.d = atomicInteger2;
        mmhVarAE.b = mmfVar;
    }

    @Override // defpackage.fgy
    public final void I(fhd fhdVar) {
        mqt mqtVarA;
        nsl nslVar = this.c;
        boolean z = this.e;
        boolean z2 = this.g;
        if (z || z2) {
            String str = nslVar.n;
            mlf mlfVar = (mlf) fhdVar.l(mlf.class);
            Integer numValueOf = null;
            if (mlfVar != null && (mqtVarA = mlfVar.a(str)) != null) {
                aihl aihlVar = mqu.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                mqtVarA.c(aihlVarCheckIsLite);
                if (mqtVarA.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    mqtVarA.c(aihlVarCheckIsLite2);
                    Object objK = mqtVarA.j.k(aihlVarCheckIsLite2.d);
                    numValueOf = Integer.valueOf(((mqu) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d);
                }
            }
            if (numValueOf != null) {
                numValueOf.intValue();
                if (fhdVar.c != null) {
                    fhdVar.x(new aero(0, new Object[]{numValueOf}), "updateState:ScrollableContainerComponent.updateRestoreScrollPosition");
                }
            }
        }
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        mlf mlfVar;
        mmh mmhVarAE = aE(fhdVar);
        nsl nslVar = this.c;
        boolean z = this.e;
        boolean z2 = this.g;
        AtomicInteger atomicInteger = mmhVarAE.c;
        mmf mmfVar = mmhVarAE.b;
        if (mmfVar != null) {
            mmfVar.d();
        }
        if ((!z && !z2) || atomicInteger == null || atomicInteger.get() == -1 || (mlfVar = (mlf) fhdVar.l(mlf.class)) == null) {
            return;
        }
        String str = nslVar.n;
        int i = atomicInteger.get();
        aihh aihhVar = (aihh) mqt.a.createBuilder();
        aihl aihlVar = mqu.b;
        aihf aihfVarCreateBuilder = mqu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        mqu mquVar = (mqu) aihfVarCreateBuilder.instance;
        mquVar.c |= 1;
        mquVar.d = i;
        aihhVar.e(aihlVar, (mqu) aihfVarCreateBuilder.build());
        mlfVar.e(str, (mqt) aihhVar.build());
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        mmh mmhVar = (mmh) fkyVar;
        mmh mmhVar2 = (mmh) fkyVar2;
        mmhVar2.a = mmhVar.a;
        mmhVar2.b = mmhVar.b;
        mmhVar2.c = mmhVar.c;
        mmhVar2.d = mmhVar.d;
    }

    @Override // defpackage.fgy
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0197  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x0204 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r6v14, types: [fgv] */
    /* JADX WARN: Type inference failed for: r8v8, types: [fus] */
    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        oyg oygVarBw;
        int iAU;
        int i;
        AtomicInteger atomicInteger;
        String str;
        fhd fhdVar2;
        int i2;
        omj omjVar;
        oyg oygVar;
        fuv fuvVar;
        char c;
        ?? r0;
        oyg oygVar2;
        fqw fqwVar;
        int i3;
        int i4;
        final int i5;
        final omj omjVar2;
        final omj omjVar3;
        String str2;
        String str3;
        mmh mmhVarAE = aE(fhdVar);
        nee neeVar = this.s;
        final omj omjVar4 = this.A;
        omj omjVar5 = this.z;
        omj omjVar6 = this.B;
        final nry nryVar = this.b;
        final nsl nslVar = this.c;
        int i6 = this.y;
        int i7 = this.u;
        int i8 = this.w;
        int i9 = this.v;
        int i10 = this.t;
        String str4 = this.d;
        boolean z = this.f;
        final boolean z2 = this.e;
        final boolean z3 = this.g;
        AtomicInteger atomicInteger2 = mmhVarAE.c;
        AtomicInteger atomicInteger3 = mmhVarAE.d;
        omj omjVar7 = omjVar5;
        mip mipVar = this.x;
        boolean z4 = this.r;
        nru nruVar = mmhVarAE.a;
        mmf mmfVar = mmhVarAE.b;
        List list = this.a;
        if (mipVar != null && z4) {
            mipVar.b(nruVar, nruVar);
        }
        if (mmfVar != null) {
            oygVarBw = qnl.bw(fhdVar.a.getResources().getDisplayMetrics(), neeVar.r() ? neeVar.j() : null);
        } else {
            oygVarBw = null;
        }
        ntx ntxVar = nslVar.x;
        asnu asnuVarD = nslVar.d();
        if (nslVar.i() == null || asnuVarD == null) {
            iAU = 1;
        } else {
            asnw asnwVar = asnuVarD.c;
            if (asnwVar == null) {
                asnwVar = asnw.a;
            }
            asnv asnvVar = asnwVar.e;
            if (asnvVar == null) {
                asnvVar = asnv.a;
            }
            iAU = a.aU(asnvVar.b);
            if (iAU == 0) {
                iAU = 1;
            }
        }
        mjd mjdVarAE = mje.aE(fhdVar);
        mjdVarAE.d(i7);
        mjdVarAE.h(i8);
        mjdVarAE.f(i9);
        mjdVarAE.c(i10);
        mjdVarAE.i(i6);
        mjdVarAE.e(list);
        if (neeVar.q() && omj.w(neeVar.m())) {
            neh nehVarM = neeVar.m();
            atomicInteger = atomicInteger2;
            i = iAU;
            if (nehVarM.cf() > 0.5d && nehVarM.g() > 0.5d) {
                mjdVarAE.k(nehVarM.cf());
                mjdVarAE.x(nehVarM.g());
            }
        } else {
            i = iAU;
            atomicInteger = atomicInteger2;
        }
        final float f = fhdVar.c().getDisplayMetrics().density;
        if (neeVar.w() - 1 != 2) {
            fqw fqwVar2 = new fqw(fhdVar, new fqz());
            boolean zN = neeVar.n();
            fqz fqzVar = fqwVar2.a;
            fqzVar.y = zN;
            fqzVar.e = true;
            fqzVar.u = ket.P(neeVar.x());
            if (neeVar.s()) {
                ndy ndyVarL = neeVar.l();
                fqzVar.q = true;
                fqzVar.a = ndyVarL.k();
                fqzVar.d = ndyVarL.g();
                fqzVar.s = ndyVarL.h();
                oygVar2 = oygVarBw;
                fqwVar = fqwVar2;
                fqzVar.g = ndyVarL.i();
                int iM = ndyVarL.m();
                if (iM == 1) {
                    str2 = "MARQUEE_SCROLL_DIRECTION_UNKNOWN";
                } else if (iM != 2) {
                    str2 = iM != 3 ? "MARQUEE_SCROLL_DIRECTION_LEFT_TO_RIGHT" : "MARQUEE_SCROLL_DIRECTION_RIGHT_TO_LEFT";
                } else {
                    str2 = "MARQUEE_SCROLL_DIRECTION_DEFAULT";
                }
                fqzVar.r = str2;
                fqzVar.A = i7;
                fqzVar.C = i8;
                fqzVar.B = i9;
                fqzVar.z = i10;
                fqzVar.E = i6;
                fqzVar.b = list;
                if (ndyVarL.l()) {
                    nea neaVarJ = ndyVarL.j();
                    int iAu = neaVarJ.au();
                    i3 = 2;
                    if (iAu != 1) {
                        str3 = iAu != 2 ? "MARQUEE_SPEED_CURVE_TYPE_ACCELERATE_DECELERATE" : "MARQUEE_SPEED_CURVE_TYPE_LINEAR";
                    } else {
                        str3 = "MARQUEE_SPEED_CURVE_UNKNOWN";
                    }
                    fqzVar.t = str3;
                    fqzVar.w = neaVarJ.at();
                }
                if (z2) {
                    fqzVar.v = Integer.valueOf(atomicInteger3.getAndSet(-1));
                }
                if (neeVar.p() && omj.v(neeVar.k())) {
                    fqzVar.f = qnl.bu(neeVar.k().ap(), fhdVar.c().getDisplayMetrics());
                }
                if (omjVar4 != null) {
                    fqzVar.D = new mmk(nryVar, omjVar4, nslVar, f);
                }
                i4 = i;
                if (omjVar7 == null) {
                    i5 = i4;
                    omjVar2 = omjVar7;
                    omjVar3 = omjVar6;
                } else if (omjVar6 == null) {
                    i5 = i4;
                    omjVar3 = omjVar6;
                    omjVar2 = null;
                } else if (i4 == 1) {
                    if (z2) {
                        omjVar2 = null;
                        omjVar3 = null;
                        i5 = 1;
                    } else {
                        str = str4;
                    }
                    if (mmfVar != null && oygVar2 != null) {
                        fqzVar.F = new mmm(mmfVar, oygVar2);
                    }
                    fqzVar.c = mjdVarAE.a();
                    fqw fqwVar3 = fqwVar;
                    fqwVar3.d.set(0);
                    fhdVar2 = fhdVar;
                    c = 0;
                    r0 = fqwVar3;
                } else {
                    i5 = i3;
                    omjVar2 = null;
                    omjVar3 = null;
                }
                final int i11 = 0;
                str = str4;
                final AtomicInteger atomicInteger4 = atomicInteger;
                fqzVar.x = new fti() { // from class: mml
                    @Override // defpackage.fti
                    public final void a(View view, int i12) {
                        int i13 = i11;
                        nry nryVar2 = nryVar;
                        if (i13 != 0) {
                            nsl nslVar2 = nslVar;
                            float f2 = f;
                            if (i12 == 0) {
                                omj omjVar8 = omjVar2;
                                if (omjVar8 != null) {
                                    View childAt = ((NestedScrollView) view).getChildAt(0);
                                    ntx ntxVar2 = nslVar2.x;
                                    ntg ntgVar = nslVar2.t;
                                    CommandOuterClass$Command commandOuterClass$CommandX = omjVar8.x();
                                    aihf aihfVarCreateBuilder = asob.a.createBuilder();
                                    float scrollX = view.getScrollX() / f2;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    asob asobVar = (asob) aihfVarCreateBuilder.instance;
                                    asobVar.b |= 1;
                                    asobVar.c = scrollX;
                                    float scrollY = view.getScrollY() / f2;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    asob asobVar2 = (asob) aihfVarCreateBuilder.instance;
                                    asobVar2.b |= 2;
                                    asobVar2.d = scrollY;
                                    asob asobVar3 = (asob) aihfVarCreateBuilder.build();
                                    aihf aihfVarCreateBuilder2 = ason.a.createBuilder();
                                    float measuredHeight = childAt.getMeasuredHeight() / f2;
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    ason asonVar = (ason) aihfVarCreateBuilder2.instance;
                                    asonVar.b |= 2;
                                    asonVar.d = measuredHeight;
                                    float measuredWidth = childAt.getMeasuredWidth() / f2;
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    ason asonVar2 = (ason) aihfVarCreateBuilder2.instance;
                                    asonVar2.b |= 1;
                                    asonVar2.c = measuredWidth;
                                    ket.N(view, nryVar2, commandOuterClass$CommandX, ntxVar2, ntgVar, asobVar3, (ason) aihfVarCreateBuilder2.build(), f2);
                                    return;
                                }
                                return;
                            }
                            omj omjVar9 = omjVar3;
                            if (omjVar9 != null) {
                                View childAt2 = ((NestedScrollView) view).getChildAt(0);
                                ntx ntxVar3 = nslVar2.x;
                                ntg ntgVar2 = nslVar2.t;
                                CommandOuterClass$Command commandOuterClass$CommandX2 = omjVar9.x();
                                aihf aihfVarCreateBuilder3 = asob.a.createBuilder();
                                float scrollX2 = view.getScrollX() / f2;
                                aihfVarCreateBuilder3.copyOnWrite();
                                asob asobVar4 = (asob) aihfVarCreateBuilder3.instance;
                                asobVar4.b |= 1;
                                asobVar4.c = scrollX2;
                                float scrollY2 = view.getScrollY() / f2;
                                aihfVarCreateBuilder3.copyOnWrite();
                                asob asobVar5 = (asob) aihfVarCreateBuilder3.instance;
                                asobVar5.b |= 2;
                                asobVar5.d = scrollY2;
                                asob asobVar6 = (asob) aihfVarCreateBuilder3.build();
                                aihf aihfVarCreateBuilder4 = ason.a.createBuilder();
                                float measuredHeight2 = childAt2.getMeasuredHeight() / f2;
                                aihfVarCreateBuilder4.copyOnWrite();
                                ason asonVar3 = (ason) aihfVarCreateBuilder4.instance;
                                asonVar3.b |= 2;
                                asonVar3.d = measuredHeight2;
                                float measuredWidth2 = childAt2.getMeasuredWidth() / f2;
                                aihfVarCreateBuilder4.copyOnWrite();
                                ason asonVar4 = (ason) aihfVarCreateBuilder4.instance;
                                asonVar4.b |= 1;
                                asonVar4.c = measuredWidth2;
                                ket.N(view, nryVar2, commandOuterClass$CommandX2, ntxVar3, ntgVar2, asobVar6, (ason) aihfVarCreateBuilder4.build(), f2);
                            }
                            if (i5 == 2) {
                                ket.M(nslVar2);
                            }
                            if (z2) {
                                atomicInteger4.set(view.getScrollY());
                                return;
                            }
                            return;
                        }
                        nsl nslVar3 = nslVar;
                        float f3 = f;
                        if (i12 == 0) {
                            omj omjVar10 = omjVar2;
                            if (omjVar10 != null) {
                                View childAt3 = ((HorizontalScrollView) view).getChildAt(0);
                                ntx ntxVar4 = nslVar3.x;
                                ntg ntgVar3 = nslVar3.t;
                                CommandOuterClass$Command commandOuterClass$CommandX3 = omjVar10.x();
                                aihf aihfVarCreateBuilder5 = asob.a.createBuilder();
                                float scrollX3 = view.getScrollX() / f3;
                                aihfVarCreateBuilder5.copyOnWrite();
                                asob asobVar7 = (asob) aihfVarCreateBuilder5.instance;
                                asobVar7.b |= 1;
                                asobVar7.c = scrollX3;
                                float scrollY3 = view.getScrollY() / f3;
                                aihfVarCreateBuilder5.copyOnWrite();
                                asob asobVar8 = (asob) aihfVarCreateBuilder5.instance;
                                asobVar8.b |= 2;
                                asobVar8.d = scrollY3;
                                asob asobVar9 = (asob) aihfVarCreateBuilder5.build();
                                aihf aihfVarCreateBuilder6 = ason.a.createBuilder();
                                float measuredHeight3 = childAt3.getMeasuredHeight() / f3;
                                aihfVarCreateBuilder6.copyOnWrite();
                                ason asonVar5 = (ason) aihfVarCreateBuilder6.instance;
                                asonVar5.b |= 2;
                                asonVar5.d = measuredHeight3;
                                float measuredWidth3 = childAt3.getMeasuredWidth() / f3;
                                aihfVarCreateBuilder6.copyOnWrite();
                                ason asonVar6 = (ason) aihfVarCreateBuilder6.instance;
                                asonVar6.b |= 1;
                                asonVar6.c = measuredWidth3;
                                ket.N(view, nryVar2, commandOuterClass$CommandX3, ntxVar4, ntgVar3, asobVar9, (ason) aihfVarCreateBuilder6.build(), f3);
                                return;
                            }
                            return;
                        }
                        omj omjVar11 = omjVar3;
                        if (omjVar11 != null) {
                            View childAt4 = ((HorizontalScrollView) view).getChildAt(0);
                            ntx ntxVar5 = nslVar3.x;
                            ntg ntgVar4 = nslVar3.t;
                            CommandOuterClass$Command commandOuterClass$CommandX4 = omjVar11.x();
                            aihf aihfVarCreateBuilder7 = asob.a.createBuilder();
                            float scrollX4 = view.getScrollX() / f3;
                            aihfVarCreateBuilder7.copyOnWrite();
                            asob asobVar10 = (asob) aihfVarCreateBuilder7.instance;
                            asobVar10.b |= 1;
                            asobVar10.c = scrollX4;
                            float scrollY4 = view.getScrollY() / f3;
                            aihfVarCreateBuilder7.copyOnWrite();
                            asob asobVar11 = (asob) aihfVarCreateBuilder7.instance;
                            asobVar11.b |= 2;
                            asobVar11.d = scrollY4;
                            asob asobVar12 = (asob) aihfVarCreateBuilder7.build();
                            aihf aihfVarCreateBuilder8 = ason.a.createBuilder();
                            float measuredHeight4 = childAt4.getMeasuredHeight() / f3;
                            aihfVarCreateBuilder8.copyOnWrite();
                            ason asonVar7 = (ason) aihfVarCreateBuilder8.instance;
                            asonVar7.b |= 2;
                            asonVar7.d = measuredHeight4;
                            float measuredWidth4 = childAt4.getMeasuredWidth() / f3;
                            aihfVarCreateBuilder8.copyOnWrite();
                            ason asonVar8 = (ason) aihfVarCreateBuilder8.instance;
                            asonVar8.b |= 1;
                            asonVar8.c = measuredWidth4;
                            ket.N(view, nryVar2, commandOuterClass$CommandX4, ntxVar5, ntgVar4, asobVar12, (ason) aihfVarCreateBuilder8.build(), f3);
                        }
                        if (i5 == 2) {
                            ket.M(nslVar3);
                        }
                        if (z2) {
                            atomicInteger4.set(view.getScrollX());
                        }
                    }
                };
                if (mmfVar != null) {
                    fqzVar.F = new mmm(mmfVar, oygVar2);
                }
                fqzVar.c = mjdVarAE.a();
                fqw fqwVar4 = fqwVar;
                fqwVar4.d.set(0);
                fhdVar2 = fhdVar;
                c = 0;
                r0 = fqwVar4;
            } else {
                oygVar2 = oygVarBw;
                fqwVar = fqwVar2;
            }
            i3 = 2;
            if (z2) {
                fqzVar.v = Integer.valueOf(atomicInteger3.getAndSet(-1));
            }
            if (neeVar.p()) {
                fqzVar.f = qnl.bu(neeVar.k().ap(), fhdVar.c().getDisplayMetrics());
            }
            if (omjVar4 != null) {
                fqzVar.D = new mmk(nryVar, omjVar4, nslVar, f);
            }
            i4 = i;
            if (omjVar7 == null) {
                i5 = i4;
                omjVar2 = omjVar7;
                omjVar3 = omjVar6;
            } else if (omjVar6 == null) {
                i5 = i4;
                omjVar3 = omjVar6;
                omjVar2 = null;
            } else if (i4 == 1) {
                if (z2) {
                    omjVar2 = null;
                    omjVar3 = null;
                    i5 = 1;
                } else {
                    str = str4;
                }
                if (mmfVar != null) {
                    fqzVar.F = new mmm(mmfVar, oygVar2);
                }
                fqzVar.c = mjdVarAE.a();
                fqw fqwVar5 = fqwVar;
                fqwVar5.d.set(0);
                fhdVar2 = fhdVar;
                c = 0;
                r0 = fqwVar5;
            } else {
                i5 = i3;
                omjVar2 = null;
                omjVar3 = null;
            }
            final int i12 = 0;
            str = str4;
            final AtomicInteger atomicInteger5 = atomicInteger;
            fqzVar.x = new fti() { // from class: mml
                @Override // defpackage.fti
                public final void a(View view, int i13) {
                    int i14 = i12;
                    nry nryVar2 = nryVar;
                    if (i14 != 0) {
                        nsl nslVar2 = nslVar;
                        float f2 = f;
                        if (i13 == 0) {
                            omj omjVar8 = omjVar2;
                            if (omjVar8 != null) {
                                View childAt = ((NestedScrollView) view).getChildAt(0);
                                ntx ntxVar2 = nslVar2.x;
                                ntg ntgVar = nslVar2.t;
                                CommandOuterClass$Command commandOuterClass$CommandX = omjVar8.x();
                                aihf aihfVarCreateBuilder = asob.a.createBuilder();
                                float scrollX = view.getScrollX() / f2;
                                aihfVarCreateBuilder.copyOnWrite();
                                asob asobVar = (asob) aihfVarCreateBuilder.instance;
                                asobVar.b |= 1;
                                asobVar.c = scrollX;
                                float scrollY = view.getScrollY() / f2;
                                aihfVarCreateBuilder.copyOnWrite();
                                asob asobVar2 = (asob) aihfVarCreateBuilder.instance;
                                asobVar2.b |= 2;
                                asobVar2.d = scrollY;
                                asob asobVar3 = (asob) aihfVarCreateBuilder.build();
                                aihf aihfVarCreateBuilder2 = ason.a.createBuilder();
                                float measuredHeight = childAt.getMeasuredHeight() / f2;
                                aihfVarCreateBuilder2.copyOnWrite();
                                ason asonVar = (ason) aihfVarCreateBuilder2.instance;
                                asonVar.b |= 2;
                                asonVar.d = measuredHeight;
                                float measuredWidth = childAt.getMeasuredWidth() / f2;
                                aihfVarCreateBuilder2.copyOnWrite();
                                ason asonVar2 = (ason) aihfVarCreateBuilder2.instance;
                                asonVar2.b |= 1;
                                asonVar2.c = measuredWidth;
                                ket.N(view, nryVar2, commandOuterClass$CommandX, ntxVar2, ntgVar, asobVar3, (ason) aihfVarCreateBuilder2.build(), f2);
                                return;
                            }
                            return;
                        }
                        omj omjVar9 = omjVar3;
                        if (omjVar9 != null) {
                            View childAt2 = ((NestedScrollView) view).getChildAt(0);
                            ntx ntxVar3 = nslVar2.x;
                            ntg ntgVar2 = nslVar2.t;
                            CommandOuterClass$Command commandOuterClass$CommandX2 = omjVar9.x();
                            aihf aihfVarCreateBuilder3 = asob.a.createBuilder();
                            float scrollX2 = view.getScrollX() / f2;
                            aihfVarCreateBuilder3.copyOnWrite();
                            asob asobVar4 = (asob) aihfVarCreateBuilder3.instance;
                            asobVar4.b |= 1;
                            asobVar4.c = scrollX2;
                            float scrollY2 = view.getScrollY() / f2;
                            aihfVarCreateBuilder3.copyOnWrite();
                            asob asobVar5 = (asob) aihfVarCreateBuilder3.instance;
                            asobVar5.b |= 2;
                            asobVar5.d = scrollY2;
                            asob asobVar6 = (asob) aihfVarCreateBuilder3.build();
                            aihf aihfVarCreateBuilder4 = ason.a.createBuilder();
                            float measuredHeight2 = childAt2.getMeasuredHeight() / f2;
                            aihfVarCreateBuilder4.copyOnWrite();
                            ason asonVar3 = (ason) aihfVarCreateBuilder4.instance;
                            asonVar3.b |= 2;
                            asonVar3.d = measuredHeight2;
                            float measuredWidth2 = childAt2.getMeasuredWidth() / f2;
                            aihfVarCreateBuilder4.copyOnWrite();
                            ason asonVar4 = (ason) aihfVarCreateBuilder4.instance;
                            asonVar4.b |= 1;
                            asonVar4.c = measuredWidth2;
                            ket.N(view, nryVar2, commandOuterClass$CommandX2, ntxVar3, ntgVar2, asobVar6, (ason) aihfVarCreateBuilder4.build(), f2);
                        }
                        if (i5 == 2) {
                            ket.M(nslVar2);
                        }
                        if (z2) {
                            atomicInteger5.set(view.getScrollY());
                            return;
                        }
                        return;
                    }
                    nsl nslVar3 = nslVar;
                    float f3 = f;
                    if (i13 == 0) {
                        omj omjVar10 = omjVar2;
                        if (omjVar10 != null) {
                            View childAt3 = ((HorizontalScrollView) view).getChildAt(0);
                            ntx ntxVar4 = nslVar3.x;
                            ntg ntgVar3 = nslVar3.t;
                            CommandOuterClass$Command commandOuterClass$CommandX3 = omjVar10.x();
                            aihf aihfVarCreateBuilder5 = asob.a.createBuilder();
                            float scrollX3 = view.getScrollX() / f3;
                            aihfVarCreateBuilder5.copyOnWrite();
                            asob asobVar7 = (asob) aihfVarCreateBuilder5.instance;
                            asobVar7.b |= 1;
                            asobVar7.c = scrollX3;
                            float scrollY3 = view.getScrollY() / f3;
                            aihfVarCreateBuilder5.copyOnWrite();
                            asob asobVar8 = (asob) aihfVarCreateBuilder5.instance;
                            asobVar8.b |= 2;
                            asobVar8.d = scrollY3;
                            asob asobVar9 = (asob) aihfVarCreateBuilder5.build();
                            aihf aihfVarCreateBuilder6 = ason.a.createBuilder();
                            float measuredHeight3 = childAt3.getMeasuredHeight() / f3;
                            aihfVarCreateBuilder6.copyOnWrite();
                            ason asonVar5 = (ason) aihfVarCreateBuilder6.instance;
                            asonVar5.b |= 2;
                            asonVar5.d = measuredHeight3;
                            float measuredWidth3 = childAt3.getMeasuredWidth() / f3;
                            aihfVarCreateBuilder6.copyOnWrite();
                            ason asonVar6 = (ason) aihfVarCreateBuilder6.instance;
                            asonVar6.b |= 1;
                            asonVar6.c = measuredWidth3;
                            ket.N(view, nryVar2, commandOuterClass$CommandX3, ntxVar4, ntgVar3, asobVar9, (ason) aihfVarCreateBuilder6.build(), f3);
                            return;
                        }
                        return;
                    }
                    omj omjVar11 = omjVar3;
                    if (omjVar11 != null) {
                        View childAt4 = ((HorizontalScrollView) view).getChildAt(0);
                        ntx ntxVar5 = nslVar3.x;
                        ntg ntgVar4 = nslVar3.t;
                        CommandOuterClass$Command commandOuterClass$CommandX4 = omjVar11.x();
                        aihf aihfVarCreateBuilder7 = asob.a.createBuilder();
                        float scrollX4 = view.getScrollX() / f3;
                        aihfVarCreateBuilder7.copyOnWrite();
                        asob asobVar10 = (asob) aihfVarCreateBuilder7.instance;
                        asobVar10.b |= 1;
                        asobVar10.c = scrollX4;
                        float scrollY4 = view.getScrollY() / f3;
                        aihfVarCreateBuilder7.copyOnWrite();
                        asob asobVar11 = (asob) aihfVarCreateBuilder7.instance;
                        asobVar11.b |= 2;
                        asobVar11.d = scrollY4;
                        asob asobVar12 = (asob) aihfVarCreateBuilder7.build();
                        aihf aihfVarCreateBuilder8 = ason.a.createBuilder();
                        float measuredHeight4 = childAt4.getMeasuredHeight() / f3;
                        aihfVarCreateBuilder8.copyOnWrite();
                        ason asonVar7 = (ason) aihfVarCreateBuilder8.instance;
                        asonVar7.b |= 2;
                        asonVar7.d = measuredHeight4;
                        float measuredWidth4 = childAt4.getMeasuredWidth() / f3;
                        aihfVarCreateBuilder8.copyOnWrite();
                        ason asonVar8 = (ason) aihfVarCreateBuilder8.instance;
                        asonVar8.b |= 1;
                        asonVar8.c = measuredWidth4;
                        ket.N(view, nryVar2, commandOuterClass$CommandX4, ntxVar5, ntgVar4, asobVar12, (ason) aihfVarCreateBuilder8.build(), f3);
                    }
                    if (i5 == 2) {
                        ket.M(nslVar3);
                    }
                    if (z2) {
                        atomicInteger5.set(view.getScrollX());
                    }
                }
            };
            if (mmfVar != null) {
                fqzVar.F = new mmm(mmfVar, oygVar2);
            }
            fqzVar.c = mjdVarAE.a();
            fqw fqwVar6 = fqwVar;
            fqwVar6.d.set(0);
            fhdVar2 = fhdVar;
            c = 0;
            r0 = fqwVar6;
        } else {
            oyg oygVar3 = oygVarBw;
            str = str4;
            final AtomicInteger atomicInteger6 = atomicInteger;
            int i13 = i;
            fhdVar2 = fhdVar;
            fus fusVar = new fus(fhdVar2, new fuv());
            boolean zO = neeVar.o();
            fuv fuvVar2 = fusVar.a;
            fuvVar2.t = zO;
            fuvVar2.f = ntxVar == null || ntxVar.g;
            fuvVar2.d = nslVar.h();
            fuvVar2.c = true;
            fuvVar2.b = true;
            fuvVar2.q = ket.P(neeVar.x());
            if (z3) {
                fuvVar2.r = Integer.valueOf(atomicInteger3.getAndSet(-1));
            }
            if (neeVar.p() && omj.v(neeVar.k())) {
                fuvVar2.e = qnl.bu(neeVar.k().aq(), fhdVar2.c().getDisplayMetrics());
            }
            if (omjVar4 != null) {
                fuvVar2.g = new bdb() { // from class: mmj
                    @Override // defpackage.bdb
                    public final void a(NestedScrollView nestedScrollView, int i14, int i15) {
                        View childAt = nestedScrollView.getChildAt(0);
                        CommandOuterClass$Command commandOuterClass$CommandX = omjVar4.x();
                        aihf aihfVarCreateBuilder = asob.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        asob asobVar = (asob) aihfVarCreateBuilder.instance;
                        asobVar.b |= 1;
                        float f2 = f;
                        asobVar.c = i14 / f2;
                        aihfVarCreateBuilder.copyOnWrite();
                        asob asobVar2 = (asob) aihfVarCreateBuilder.instance;
                        asobVar2.b |= 2;
                        asobVar2.d = i15 / f2;
                        asob asobVar3 = (asob) aihfVarCreateBuilder.build();
                        aihf aihfVarCreateBuilder2 = ason.a.createBuilder();
                        float measuredHeight = childAt.getMeasuredHeight();
                        aihfVarCreateBuilder2.copyOnWrite();
                        ason asonVar = (ason) aihfVarCreateBuilder2.instance;
                        asonVar.b |= 2;
                        asonVar.d = measuredHeight / f2;
                        float measuredWidth = childAt.getMeasuredWidth();
                        aihfVarCreateBuilder2.copyOnWrite();
                        ason asonVar2 = (ason) aihfVarCreateBuilder2.instance;
                        asonVar2.b |= 1;
                        asonVar2.c = measuredWidth / f2;
                        ason asonVar3 = (ason) aihfVarCreateBuilder2.build();
                        nsl nslVar2 = nslVar;
                        ket.N(nestedScrollView, nryVar, commandOuterClass$CommandX, nslVar2.x, nslVar2.t, asobVar3, asonVar3, f2);
                    }
                };
            }
            if (omjVar7 == null) {
                if (omjVar6 != null) {
                    i2 = i13;
                    omjVar = omjVar6;
                } else if (i13 == 1) {
                    if (z3) {
                        omjVar = null;
                        i2 = 1;
                    } else {
                        oygVar = oygVar3;
                        fuvVar = fuvVar2;
                    }
                    if (mmfVar != null && oygVar != null) {
                        fuvVar.u = new mmn(mmfVar, oygVar);
                    }
                    fuvVar.a = mjdVarAE.a();
                    c = 0;
                    fusVar.d.set(0);
                    r0 = fusVar;
                } else {
                    i2 = 2;
                    omjVar = null;
                }
                omjVar7 = null;
            } else {
                i2 = i13;
                oygVar3 = oygVar3;
                omjVar = omjVar6;
            }
            final int i14 = 1;
            fuvVar = fuvVar2;
            final int i15 = i2;
            final omj omjVar8 = omjVar7;
            oygVar = oygVar3;
            final omj omjVar9 = omjVar;
            fuvVar.s = new fti() { // from class: mml
                @Override // defpackage.fti
                public final void a(View view, int i16) {
                    int i17 = i14;
                    nry nryVar2 = nryVar;
                    if (i17 != 0) {
                        nsl nslVar2 = nslVar;
                        float f2 = f;
                        if (i16 == 0) {
                            omj omjVar10 = omjVar8;
                            if (omjVar10 != null) {
                                View childAt = ((NestedScrollView) view).getChildAt(0);
                                ntx ntxVar2 = nslVar2.x;
                                ntg ntgVar = nslVar2.t;
                                CommandOuterClass$Command commandOuterClass$CommandX = omjVar10.x();
                                aihf aihfVarCreateBuilder = asob.a.createBuilder();
                                float scrollX = view.getScrollX() / f2;
                                aihfVarCreateBuilder.copyOnWrite();
                                asob asobVar = (asob) aihfVarCreateBuilder.instance;
                                asobVar.b |= 1;
                                asobVar.c = scrollX;
                                float scrollY = view.getScrollY() / f2;
                                aihfVarCreateBuilder.copyOnWrite();
                                asob asobVar2 = (asob) aihfVarCreateBuilder.instance;
                                asobVar2.b |= 2;
                                asobVar2.d = scrollY;
                                asob asobVar3 = (asob) aihfVarCreateBuilder.build();
                                aihf aihfVarCreateBuilder2 = ason.a.createBuilder();
                                float measuredHeight = childAt.getMeasuredHeight() / f2;
                                aihfVarCreateBuilder2.copyOnWrite();
                                ason asonVar = (ason) aihfVarCreateBuilder2.instance;
                                asonVar.b |= 2;
                                asonVar.d = measuredHeight;
                                float measuredWidth = childAt.getMeasuredWidth() / f2;
                                aihfVarCreateBuilder2.copyOnWrite();
                                ason asonVar2 = (ason) aihfVarCreateBuilder2.instance;
                                asonVar2.b |= 1;
                                asonVar2.c = measuredWidth;
                                ket.N(view, nryVar2, commandOuterClass$CommandX, ntxVar2, ntgVar, asobVar3, (ason) aihfVarCreateBuilder2.build(), f2);
                                return;
                            }
                            return;
                        }
                        omj omjVar11 = omjVar9;
                        if (omjVar11 != null) {
                            View childAt2 = ((NestedScrollView) view).getChildAt(0);
                            ntx ntxVar3 = nslVar2.x;
                            ntg ntgVar2 = nslVar2.t;
                            CommandOuterClass$Command commandOuterClass$CommandX2 = omjVar11.x();
                            aihf aihfVarCreateBuilder3 = asob.a.createBuilder();
                            float scrollX2 = view.getScrollX() / f2;
                            aihfVarCreateBuilder3.copyOnWrite();
                            asob asobVar4 = (asob) aihfVarCreateBuilder3.instance;
                            asobVar4.b |= 1;
                            asobVar4.c = scrollX2;
                            float scrollY2 = view.getScrollY() / f2;
                            aihfVarCreateBuilder3.copyOnWrite();
                            asob asobVar5 = (asob) aihfVarCreateBuilder3.instance;
                            asobVar5.b |= 2;
                            asobVar5.d = scrollY2;
                            asob asobVar6 = (asob) aihfVarCreateBuilder3.build();
                            aihf aihfVarCreateBuilder4 = ason.a.createBuilder();
                            float measuredHeight2 = childAt2.getMeasuredHeight() / f2;
                            aihfVarCreateBuilder4.copyOnWrite();
                            ason asonVar3 = (ason) aihfVarCreateBuilder4.instance;
                            asonVar3.b |= 2;
                            asonVar3.d = measuredHeight2;
                            float measuredWidth2 = childAt2.getMeasuredWidth() / f2;
                            aihfVarCreateBuilder4.copyOnWrite();
                            ason asonVar4 = (ason) aihfVarCreateBuilder4.instance;
                            asonVar4.b |= 1;
                            asonVar4.c = measuredWidth2;
                            ket.N(view, nryVar2, commandOuterClass$CommandX2, ntxVar3, ntgVar2, asobVar6, (ason) aihfVarCreateBuilder4.build(), f2);
                        }
                        if (i15 == 2) {
                            ket.M(nslVar2);
                        }
                        if (z3) {
                            atomicInteger6.set(view.getScrollY());
                            return;
                        }
                        return;
                    }
                    nsl nslVar3 = nslVar;
                    float f3 = f;
                    if (i16 == 0) {
                        omj omjVar12 = omjVar8;
                        if (omjVar12 != null) {
                            View childAt3 = ((HorizontalScrollView) view).getChildAt(0);
                            ntx ntxVar4 = nslVar3.x;
                            ntg ntgVar3 = nslVar3.t;
                            CommandOuterClass$Command commandOuterClass$CommandX3 = omjVar12.x();
                            aihf aihfVarCreateBuilder5 = asob.a.createBuilder();
                            float scrollX3 = view.getScrollX() / f3;
                            aihfVarCreateBuilder5.copyOnWrite();
                            asob asobVar7 = (asob) aihfVarCreateBuilder5.instance;
                            asobVar7.b |= 1;
                            asobVar7.c = scrollX3;
                            float scrollY3 = view.getScrollY() / f3;
                            aihfVarCreateBuilder5.copyOnWrite();
                            asob asobVar8 = (asob) aihfVarCreateBuilder5.instance;
                            asobVar8.b |= 2;
                            asobVar8.d = scrollY3;
                            asob asobVar9 = (asob) aihfVarCreateBuilder5.build();
                            aihf aihfVarCreateBuilder6 = ason.a.createBuilder();
                            float measuredHeight3 = childAt3.getMeasuredHeight() / f3;
                            aihfVarCreateBuilder6.copyOnWrite();
                            ason asonVar5 = (ason) aihfVarCreateBuilder6.instance;
                            asonVar5.b |= 2;
                            asonVar5.d = measuredHeight3;
                            float measuredWidth3 = childAt3.getMeasuredWidth() / f3;
                            aihfVarCreateBuilder6.copyOnWrite();
                            ason asonVar6 = (ason) aihfVarCreateBuilder6.instance;
                            asonVar6.b |= 1;
                            asonVar6.c = measuredWidth3;
                            ket.N(view, nryVar2, commandOuterClass$CommandX3, ntxVar4, ntgVar3, asobVar9, (ason) aihfVarCreateBuilder6.build(), f3);
                            return;
                        }
                        return;
                    }
                    omj omjVar13 = omjVar9;
                    if (omjVar13 != null) {
                        View childAt4 = ((HorizontalScrollView) view).getChildAt(0);
                        ntx ntxVar5 = nslVar3.x;
                        ntg ntgVar4 = nslVar3.t;
                        CommandOuterClass$Command commandOuterClass$CommandX4 = omjVar13.x();
                        aihf aihfVarCreateBuilder7 = asob.a.createBuilder();
                        float scrollX4 = view.getScrollX() / f3;
                        aihfVarCreateBuilder7.copyOnWrite();
                        asob asobVar10 = (asob) aihfVarCreateBuilder7.instance;
                        asobVar10.b |= 1;
                        asobVar10.c = scrollX4;
                        float scrollY4 = view.getScrollY() / f3;
                        aihfVarCreateBuilder7.copyOnWrite();
                        asob asobVar11 = (asob) aihfVarCreateBuilder7.instance;
                        asobVar11.b |= 2;
                        asobVar11.d = scrollY4;
                        asob asobVar12 = (asob) aihfVarCreateBuilder7.build();
                        aihf aihfVarCreateBuilder8 = ason.a.createBuilder();
                        float measuredHeight4 = childAt4.getMeasuredHeight() / f3;
                        aihfVarCreateBuilder8.copyOnWrite();
                        ason asonVar7 = (ason) aihfVarCreateBuilder8.instance;
                        asonVar7.b |= 2;
                        asonVar7.d = measuredHeight4;
                        float measuredWidth4 = childAt4.getMeasuredWidth() / f3;
                        aihfVarCreateBuilder8.copyOnWrite();
                        ason asonVar8 = (ason) aihfVarCreateBuilder8.instance;
                        asonVar8.b |= 1;
                        asonVar8.c = measuredWidth4;
                        ket.N(view, nryVar2, commandOuterClass$CommandX4, ntxVar5, ntgVar4, asobVar12, (ason) aihfVarCreateBuilder8.build(), f3);
                    }
                    if (i15 == 2) {
                        ket.M(nslVar3);
                    }
                    if (z3) {
                        atomicInteger6.set(view.getScrollX());
                    }
                }
            };
            if (mmfVar != null) {
                fuvVar.u = new mmn(mmfVar, oygVar);
            }
            fuvVar.a = mjdVarAE.a();
            c = 0;
            fusVar.d.set(0);
            r0 = fusVar;
        }
        ?? r6 = r0;
        if (str != null) {
            r6.H(str);
        }
        if (z && !z4) {
            Object[] objArr = new Object[1];
            objArr[c] = fhdVar2;
            r6.I(o(mmi.class, "ScrollableContainerComponent", fhdVar2, 1803022739, objArr));
        }
        return r6.a();
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (mmi) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new mmh();
    }
}

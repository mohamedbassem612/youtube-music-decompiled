package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rxz implements rye, rtc {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final vyo d;
    private final tun e;
    private final saq f;
    private agev g = agdf.a;
    private rwy h;
    private final abnc i;
    private final wxh j;
    private final rmp k;
    private final ayq l;

    public rxz(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, agev agevVar, tun tunVar, saq saqVar, vyo vyoVar, ayq ayqVar, abnc abncVar, rmp rmpVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.j = (wxh) ((agfa) agevVar).a;
        this.e = tunVar;
        this.f = saqVar;
        this.d = vyoVar;
        this.k = rmpVar;
        this.i = abncVar;
        this.l = ayqVar;
    }

    private static final boolean c(smr smrVar) {
        return smrVar.e(siw.class) && Objects.equals(smrVar.d(siw.class), Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (c(r14) == false) goto L18;
     */
    @Override // defpackage.rye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rxj U(defpackage.smr r14, defpackage.sko r15) throws defpackage.ryd {
        /*
            r13 = this;
            java.lang.Class<rwy> r0 = defpackage.rwy.class
            boolean r0 = defpackage.nrj.e(r0, r14, r15)
            if (r0 == 0) goto L7f
            aixg r0 = r15.b
            aixg r1 = defpackage.aixg.LAYOUT_TYPE_PANEL_IMAGE_CAROUSEL_CARD_ONE_BUTTON
            if (r0 == r1) goto L38
            aixg r1 = defpackage.aixg.LAYOUT_TYPE_PANEL_IMAGE_CAROUSEL_CARD_BUTTON_GROUP
            if (r0 == r1) goto L38
            aixg r1 = defpackage.aixg.LAYOUT_TYPE_PANEL_IMAGE_GRID_BUTTON
            if (r0 == r1) goto L38
            ayq r0 = r13.l
            java.lang.Object r1 = r0.b
            vxz r1 = (defpackage.vxz) r1
            r4 = 0
            r5 = 45371287(0x2b44f97, double:2.2416394E-316)
            boolean r1 = r1.m(r4, r5)
            if (r1 == 0) goto L2c
            boolean r1 = c(r14)
            if (r1 != 0) goto L38
        L2c:
            boolean r0 = r0.U()
            if (r0 == 0) goto L7f
            boolean r0 = c(r14)
            if (r0 != 0) goto L7f
        L38:
            rwy r0 = r13.h
            if (r0 == 0) goto L48
            boolean r0 = r0.g()
            if (r0 != 0) goto L48
            r0 = 0
            java.lang.String r1 = "Overriding belowPlayerImmersiveAdLayoutRenderingAdapter when it is not released"
            defpackage.rmp.n(r0, r1)
        L48:
            awmd r0 = r13.a
            r1 = r0
            rwy r0 = new rwy
            java.lang.Object r1 = r1.io()
            rsk r1 = (defpackage.rsk) r1
            agev r4 = r13.g
            java.lang.Object r4 = r4.f()
            rtb r4 = (defpackage.rtb) r4
            awmd r5 = r13.b
            java.lang.Object r5 = r5.io()
            rsr r5 = (defpackage.rsr) r5
            awmd r6 = r13.c
            java.lang.Object r6 = r6.io()
            ruk r6 = (defpackage.ruk) r6
            wxh r7 = r13.j
            tun r8 = r13.e
            saq r9 = r13.f
            vyo r10 = r13.d
            ayq r11 = r13.l
            abnc r12 = r13.i
            r2 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.h = r0
            goto Lb3
        L7f:
            java.lang.Class<rwz> r0 = defpackage.rwz.class
            boolean r0 = defpackage.nrj.e(r0, r14, r15)
            if (r0 == 0) goto Lbe
            agev r0 = r13.g
            boolean r0 = r0.g()
            if (r0 == 0) goto Lb4
            awmd r0 = r13.a
            r1 = r0
            rwz r0 = new rwz
            java.lang.Object r1 = r1.io()
            rsk r1 = (defpackage.rsk) r1
            vyo r4 = r13.d
            agev r5 = r13.g
            java.lang.Object r5 = r5.c()
            rtb r5 = (defpackage.rtb) r5
            awmd r6 = r13.c
            java.lang.Object r6 = r6.io()
            ruk r6 = (defpackage.ruk) r6
            abnc r7 = r13.i
            r2 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        Lb3:
            return r0
        Lb4:
            ryd r13 = new ryd
            java.lang.String r0 = "No adsEngagementPanelApi set when trying to build immersive LRA"
            r1 = 34
            r13.<init>(r0, r1)
            throw r13
        Lbe:
            ryd r13 = new ryd
            java.lang.String r0 = "BelowPlayerImmersiveLayoutRenderingAdapterFactory invalid metadata"
            r1 = 52
            r13.<init>(r0, r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxz.U(smr, sko):rxj");
    }

    @Override // defpackage.rtc
    public final void a(rtb rtbVar) {
        if (this.g.g() && !Objects.equals(this.g.c(), rtbVar)) {
            rmp.n(null, "Received mismatching registration request for adsEngagementPanelApi");
        }
        this.g = new agfa(rtbVar);
        rwy rwyVar = this.h;
        if (rwyVar != null) {
            rtb rtbVar2 = rwyVar.a;
            if (rtbVar2 != null && !Objects.equals(rtbVar2, rtbVar)) {
                rmp.n(null, "[BelowPlayerImmersiveAdLayoutRenderingAdapter]Received mismatching registration request for adsEngagementPanelApi");
            }
            rwyVar.a = rtbVar;
            int i = rwyVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == 2) {
                rwyVar.f();
            }
        }
    }

    @Override // defpackage.rtc
    public final void b(rtb rtbVar) {
        if (this.g.g() && !Objects.equals(this.g.c(), rtbVar)) {
            rmp.n(null, "Received mismatching unregistration request for adsEngagementPanelApi");
        }
        this.g = agdf.a;
        rwy rwyVar = this.h;
        if (rwyVar != null) {
            rtb rtbVar2 = rwyVar.a;
            if (rtbVar2 != null && !Objects.equals(rtbVar2, rtbVar)) {
                rmp.n(null, "[BelowPlayerImmersiveAdLayoutRenderingAdapter]Received mismatching unregistration request for adsEngagementPanelApi");
            }
            int i = rwyVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == 4) {
                rwyVar.a = null;
            }
            if (this.h.g()) {
                this.h = null;
            }
        }
    }
}

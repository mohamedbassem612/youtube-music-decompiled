package defpackage;

import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ryp implements aclo, rtc {
    public final awmd a;
    public final awmd b;
    public final awmd c;
    public final mbc d;
    public final awmd e;
    public final awmd f;
    public final awmd g;
    public final awmd h;
    public final Executor i;
    public final spv j;
    public final awmd k;
    public final awmd l;
    public final tun m;
    public final awmd n;
    public final awmd o;
    public final awmd p;
    public rtb r;
    public final rsz s;
    public final abnc v;
    public final rmp w;
    public final Set q = new HashSet();
    public final rsx t = rsx.a;
    public final rtk u = rtk.a;

    public ryp(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, Executor executor, spv spvVar, awmd awmdVar4, awmd awmdVar5, mbc mbcVar, awmd awmdVar6, awmd awmdVar7, rsz rszVar, rmp rmpVar, abnc abncVar, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, tun tunVar, awmd awmdVar12, awmd awmdVar13, awmd awmdVar14) {
        this.a = awmdVar;
        this.i = executor;
        this.j = spvVar;
        this.b = awmdVar4;
        this.c = awmdVar5;
        this.d = mbcVar;
        this.e = awmdVar6;
        this.f = awmdVar7;
        this.w = rmpVar;
        this.v = abncVar;
        this.s = rszVar;
        this.g = awmdVar8;
        this.h = awmdVar9;
        this.k = awmdVar10;
        this.l = awmdVar11;
        this.m = tunVar;
        this.n = awmdVar12;
        this.o = awmdVar13;
        this.p = awmdVar14;
        auor auorVar = (auor) awmdVar3.io();
        auorVar.l(this);
    }

    @Override // defpackage.rtc
    public final void a(rtb rtbVar) {
        rtb rtbVar2 = this.r;
        if (rtbVar2 != null && !Objects.equals(rtbVar2, rtbVar)) {
            rmp.n(null, "Received mismatching registration request for adsEngagementPanelApi");
        }
        this.r = rtbVar;
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((ryk) it.next()).d(rtbVar);
        }
    }

    @Override // defpackage.rtc
    public final void b(rtb rtbVar) {
        rtb rtbVar2 = this.r;
        if (rtbVar2 != null && !Objects.equals(rtbVar2, rtbVar)) {
            rmp.n(null, "Received mismatching unregistration request for adsEngagementPanelApi");
        }
        this.r = null;
        for (ryk rykVar : this.q) {
            rtb rtbVar3 = rykVar.a;
            if (rtbVar3 != null && !Objects.equals(rtbVar3, rtbVar)) {
                rmp rmpVar = rykVar.c;
                rmp.n(null, "[BelowPlayerImmersiveRenderingAdapter#onEngagementPanelApiUnregistered]Received mismatching unregistration request for adsEngagementPanelApi");
            }
            if (rykVar.b == 4) {
                rykVar.a = null;
            }
        }
    }

    @Override // defpackage.aclo
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.aclo
    public final /* synthetic */ void ag() {
    }
}

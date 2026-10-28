package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.libraries.elements.interfaces.ComponentConfig;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmv implements mkz {
    public final agev a;
    public final nuc b;
    public final mrl c;
    public final ComponentConfig d;
    public volatile agev e;
    public final boolean f;
    public final awmd g;
    public final nsu h;
    public final boolean i;
    public final boolean j;
    public final aunn k;
    public final nso l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final avmb v;
    private final boolean w;

    public mmv(agev agevVar, nuc nucVar, mrl mrlVar, awmd awmdVar, nsu nsuVar, avmb avmbVar, agev agevVar2, agev agevVar3, agev agevVar4, agev agevVar5, agev agevVar6, agev agevVar7, aunn aunnVar, agev agevVar8, agev agevVar9, agev agevVar10, agev agevVar11, Context context, agev agevVar12, agev agevVar13, agev agevVar14, agev agevVar15, agev agevVar16, agev agevVar17, agev agevVar18, agev agevVar19, agev agevVar20) {
        Application applicationB;
        Activity activityA;
        this.a = agevVar;
        this.b = nucVar;
        this.c = mrlVar;
        Boolean bool = Boolean.FALSE;
        this.q = ((Boolean) agevVar2.e(bool)).booleanValue();
        this.r = ((Boolean) agevVar3.e(bool)).booleanValue();
        this.s = ((Boolean) agevVar14.e(bool)).booleanValue();
        this.d = (ComponentConfig) agevVar12.d(new jxp(6));
        this.g = awmdVar;
        this.h = nsuVar;
        boolean zBooleanValue = ((Boolean) agevVar20.e(bool)).booleanValue();
        this.w = zBooleanValue;
        this.e = agevVar4;
        if (zBooleanValue && (applicationB = miy.b(context)) != null && (activityA = miy.a(context)) != null) {
            if (activityA.isDestroyed() || activityA.isFinishing()) {
                this.e = agdf.a;
            } else {
                applicationB.registerActivityLifecycleCallbacks(new mmu(this, activityA, applicationB, 0));
            }
        }
        this.f = ((Boolean) agevVar5.e(bool)).booleanValue();
        this.i = ((Boolean) agevVar6.e(bool)).booleanValue();
        this.j = ((Boolean) agevVar7.e(bool)).booleanValue();
        this.k = aunnVar;
        this.t = ((Boolean) agevVar8.e(bool)).booleanValue();
        this.u = ((Boolean) agevVar9.e(bool)).booleanValue();
        this.v = avmbVar;
        if (((Boolean) agevVar10.e(bool)).booleanValue()) {
            ((nze) ((agfa) agevVar11).a).a(context);
        }
        this.l = nxy.a;
        this.m = ((Boolean) agevVar13.e(bool)).booleanValue();
        ((Boolean) agevVar15.e(bool)).booleanValue();
        this.n = ((Boolean) agevVar17.e(bool)).booleanValue();
        this.o = ((Boolean) agevVar18.e(bool)).booleanValue();
        this.p = ((Boolean) agevVar19.e(bool)).booleanValue();
    }

    @Override // defpackage.mkz
    public final fgv d(fhd fhdVar, nsl nslVar, nay nayVar) {
        mzt mztVar = (mzt) nayVar.j().d(mzt.K);
        if (mztVar == null) {
            throw new nud("Missing SharedComponentType extension");
        }
        nds ndsVarI = nayVar.m() ? nayVar.i() : nnb.a;
        nwy nwyVar = nslVar.h;
        nwy nwyVar2 = nwy.a;
        if (nwyVar == null) {
            nwyVar = nwyVar2;
        }
        nxa nxaVarA = nwyVar.a();
        avlr avlrVarQ = avlr.q(new hog(this, fhdVar, nslVar, mztVar, ndsVarI, nxaVarA, 4));
        miq miqVarAE = mis.aE(fhdVar);
        miqVarAE.c(nslVar);
        miqVarAE.Z(avlrVarQ);
        miqVarAE.aa(this.b);
        miqVarAE.ab(nxaVarA);
        miqVarAE.d(this.r);
        miqVarAE.ac(new mjb(mztVar, ndsVarI));
        miqVarAE.g(this.q);
        miqVarAE.f(this.h);
        miqVarAE.e(this.g);
        miqVarAE.i(this.t);
        miqVarAE.j(this.u);
        miqVarAE.b(this.v);
        miqVarAE.h(this.s);
        return miqVarAE;
    }
}

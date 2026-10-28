package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mpo implements nvr {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final nry b;
    public final boolean c;
    public final mpe d;
    private final boolean e;
    private final omj f;

    public mpo(nry nryVar, omj omjVar, mpe mpeVar, agev agevVar, agev agevVar2) {
        this.b = nryVar;
        this.f = omjVar;
        Boolean bool = Boolean.FALSE;
        this.e = ((Boolean) agevVar.e(bool)).booleanValue();
        this.d = mpeVar;
        this.c = ((Boolean) agevVar2.e(bool)).booleanValue();
    }

    public static float b(DisplayMetrics displayMetrics, float f) {
        displayMetrics.getClass();
        return (f / displayMetrics.density) + 0.5f;
    }

    public static aslo f(View view, nxg nxgVar, float f, float f2) {
        float left = view.getLeft();
        float top = view.getTop();
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        float f3 = nxgVar.a;
        float f4 = left + f3 + translationX;
        float f5 = nxgVar.b;
        float f6 = top + f5 + translationY;
        aihf aihfVarCreateBuilder = aslo.a.createBuilder();
        asob asobVar = asob.a;
        aihf aihfVarCreateBuilder2 = asobVar.createBuilder();
        float fB = b(displayMetrics, f3);
        aihfVarCreateBuilder2.copyOnWrite();
        asob asobVar2 = (asob) aihfVarCreateBuilder2.instance;
        asobVar2.b |= 1;
        asobVar2.c = fB;
        float fB2 = b(displayMetrics, f5);
        aihfVarCreateBuilder2.copyOnWrite();
        asob asobVar3 = (asob) aihfVarCreateBuilder2.instance;
        asobVar3.b |= 2;
        asobVar3.d = fB2;
        aihfVarCreateBuilder.copyOnWrite();
        aslo asloVar = (aslo) aihfVarCreateBuilder.instance;
        asob asobVar4 = (asob) aihfVarCreateBuilder2.build();
        asobVar4.getClass();
        asloVar.c = asobVar4;
        asloVar.b |= 1;
        aihf aihfVarCreateBuilder3 = asobVar.createBuilder();
        float fB3 = b(displayMetrics, f4);
        aihfVarCreateBuilder3.copyOnWrite();
        asob asobVar5 = (asob) aihfVarCreateBuilder3.instance;
        asobVar5.b |= 1;
        asobVar5.c = fB3;
        float fB4 = b(displayMetrics, f6);
        aihfVarCreateBuilder3.copyOnWrite();
        asob asobVar6 = (asob) aihfVarCreateBuilder3.instance;
        asobVar6.b |= 2;
        asobVar6.d = fB4;
        aihfVarCreateBuilder.copyOnWrite();
        aslo asloVar2 = (aslo) aihfVarCreateBuilder.instance;
        asob asobVar7 = (asob) aihfVarCreateBuilder3.build();
        asobVar7.getClass();
        asloVar2.d = asobVar7;
        asloVar2.b |= 2;
        aihf aihfVarCreateBuilder4 = asobVar.createBuilder();
        float fB5 = b(displayMetrics, f + f3);
        aihfVarCreateBuilder4.copyOnWrite();
        asob asobVar8 = (asob) aihfVarCreateBuilder4.instance;
        asobVar8.b |= 1;
        asobVar8.c = fB5;
        float fB6 = b(displayMetrics, f2 + f5);
        aihfVarCreateBuilder4.copyOnWrite();
        asob asobVar9 = (asob) aihfVarCreateBuilder4.instance;
        asobVar9.b |= 2;
        asobVar9.d = fB6;
        aihfVarCreateBuilder.copyOnWrite();
        aslo asloVar3 = (aslo) aihfVarCreateBuilder.instance;
        asob asobVar10 = (asob) aihfVarCreateBuilder4.build();
        asobVar10.getClass();
        asloVar3.e = asobVar10;
        asloVar3.b |= 4;
        return (aslo) aihfVarCreateBuilder.build();
    }

    public static aslp g(View view) {
        float width;
        float height;
        float width2 = view.getWidth();
        float height2 = view.getHeight();
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        float fWidth = rect.width();
        float fHeight = rect.height();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            width = view2.getWidth();
            height = view2.getHeight();
        } else {
            width = 0.0f;
            height = 0.0f;
        }
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        aslx aslxVar = aslx.a;
        aihf aihfVarCreateBuilder = aslxVar.createBuilder();
        ason asonVar = ason.a;
        aihf aihfVarCreateBuilder2 = asonVar.createBuilder();
        float fB = b(displayMetrics, width2);
        aihfVarCreateBuilder2.copyOnWrite();
        ason asonVar2 = (ason) aihfVarCreateBuilder2.instance;
        asonVar2.b |= 1;
        asonVar2.c = fB;
        float fB2 = b(displayMetrics, height2);
        aihfVarCreateBuilder2.copyOnWrite();
        ason asonVar3 = (ason) aihfVarCreateBuilder2.instance;
        asonVar3.b |= 2;
        asonVar3.d = fB2;
        aihfVarCreateBuilder.copyOnWrite();
        aslx aslxVar2 = (aslx) aihfVarCreateBuilder.instance;
        ason asonVar4 = (ason) aihfVarCreateBuilder2.build();
        asonVar4.getClass();
        aslxVar2.c = asonVar4;
        aslxVar2.b |= 1;
        aslx aslxVar3 = (aslx) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder3 = aslxVar.createBuilder();
        aihf aihfVarCreateBuilder4 = asonVar.createBuilder();
        float fB3 = b(displayMetrics, width);
        aihfVarCreateBuilder4.copyOnWrite();
        ason asonVar5 = (ason) aihfVarCreateBuilder4.instance;
        asonVar5.b |= 1;
        asonVar5.c = fB3;
        float fB4 = b(displayMetrics, height);
        aihfVarCreateBuilder4.copyOnWrite();
        ason asonVar6 = (ason) aihfVarCreateBuilder4.instance;
        asonVar6.b |= 2;
        asonVar6.d = fB4;
        aihfVarCreateBuilder3.copyOnWrite();
        aslx aslxVar4 = (aslx) aihfVarCreateBuilder3.instance;
        ason asonVar7 = (ason) aihfVarCreateBuilder4.build();
        asonVar7.getClass();
        aslxVar4.c = asonVar7;
        aslxVar4.b |= 1;
        aslx aslxVar5 = (aslx) aihfVarCreateBuilder3.build();
        aihf aihfVarCreateBuilder5 = aslxVar.createBuilder();
        aihf aihfVarCreateBuilder6 = asonVar.createBuilder();
        float fB5 = b(displayMetrics, fWidth);
        aihfVarCreateBuilder6.copyOnWrite();
        ason asonVar8 = (ason) aihfVarCreateBuilder6.instance;
        asonVar8.b |= 1;
        asonVar8.c = fB5;
        float fB6 = b(displayMetrics, fHeight);
        aihfVarCreateBuilder6.copyOnWrite();
        ason asonVar9 = (ason) aihfVarCreateBuilder6.instance;
        asonVar9.b |= 2;
        asonVar9.d = fB6;
        aihfVarCreateBuilder5.copyOnWrite();
        aslx aslxVar6 = (aslx) aihfVarCreateBuilder5.instance;
        ason asonVar10 = (ason) aihfVarCreateBuilder6.build();
        asonVar10.getClass();
        aslxVar6.c = asonVar10;
        aslxVar6.b |= 1;
        aslx aslxVar7 = (aslx) aihfVarCreateBuilder5.build();
        aihf aihfVarCreateBuilder7 = aslp.a.createBuilder();
        aihfVarCreateBuilder7.copyOnWrite();
        aslp aslpVar = (aslp) aihfVarCreateBuilder7.instance;
        aslxVar3.getClass();
        aslpVar.d = aslxVar3;
        aslpVar.c |= 1;
        aihfVarCreateBuilder7.copyOnWrite();
        aslp aslpVar2 = (aslp) aihfVarCreateBuilder7.instance;
        aslxVar5.getClass();
        aslpVar2.e = aslxVar5;
        aslpVar2.c |= 2;
        aihfVarCreateBuilder7.copyOnWrite();
        aslp aslpVar3 = (aslp) aihfVarCreateBuilder7.instance;
        aslxVar7.getClass();
        aslpVar3.f = aslxVar7;
        aslpVar3.c |= 4;
        return (aslp) aihfVarCreateBuilder7.build();
    }

    public static SenderStateOuterClass$SenderState h(nxg nxgVar, DisplayMetrics displayMetrics, aslp aslpVar) {
        aihf aihfVarCreateBuilder = aslw.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aslv.a.createBuilder();
        aihf aihfVarCreateBuilder3 = asob.a.createBuilder();
        float fB = b(displayMetrics, nxgVar.a);
        aihfVarCreateBuilder3.copyOnWrite();
        asob asobVar = (asob) aihfVarCreateBuilder3.instance;
        asobVar.b |= 1;
        asobVar.c = fB;
        float fB2 = b(displayMetrics, nxgVar.b);
        aihfVarCreateBuilder3.copyOnWrite();
        asob asobVar2 = (asob) aihfVarCreateBuilder3.instance;
        asobVar2.b |= 2;
        asobVar2.d = fB2;
        aihfVarCreateBuilder2.copyOnWrite();
        aslv aslvVar = (aslv) aihfVarCreateBuilder2.instance;
        asob asobVar3 = (asob) aihfVarCreateBuilder3.build();
        asobVar3.getClass();
        aslvVar.c = asobVar3;
        aslvVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aslw aslwVar = (aslw) aihfVarCreateBuilder.instance;
        aslv aslvVar2 = (aslv) aihfVarCreateBuilder2.build();
        aslvVar2.getClass();
        aslwVar.d = aslvVar2;
        aslwVar.c |= 1;
        aslw aslwVar2 = (aslw) aihfVarCreateBuilder.build();
        aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
        aihhVar.e(aslw.b, aslwVar2);
        if (aslpVar != null) {
            aihhVar.e(aslp.b, aslpVar);
        }
        return (SenderStateOuterClass$SenderState) aihhVar.build();
    }

    public static nrv j(View view, View view2, int i, nxg nxgVar, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, ntq ntqVar, nru nruVar, nsl nslVar, MotionEvent motionEvent) {
        nrt nrtVarD = nrv.d();
        nrtVarD.d(view);
        nrtVarD.b = view2;
        nrtVarD.k = i;
        nrtVarD.c = nxgVar;
        nrtVarD.b(nslVar);
        nrtVarD.g = nslVar.x;
        if (nruVar != null) {
            nrtVarD = nruVar.a(nrtVarD);
        }
        if (senderStateOuterClass$SenderState != null) {
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = nrtVarD.e;
            if (senderStateOuterClass$SenderState2 == null) {
                nrtVarD.e = senderStateOuterClass$SenderState;
            } else {
                aihh aihhVar = (aihh) senderStateOuterClass$SenderState2.toBuilder();
                aihhVar.mergeFrom((aihn) senderStateOuterClass$SenderState);
                nrtVarD.e = (SenderStateOuterClass$SenderState) aihhVar.build();
            }
        }
        nrtVarD.h = motionEvent;
        nrtVarD.f = ntqVar;
        nrv nrvVar = nslVar.I;
        if (nrvVar != null) {
            nrtVarD.a.i(nrvVar.e);
        }
        return nrtVarD.a();
    }

    @Override // defpackage.nvr
    public final mep a() {
        return mzl.I;
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void c(fhd fhdVar, nsl nslVar, Object obj, ntq ntqVar) {
        throw null;
    }

    @Override // defpackage.nvs
    public final /* bridge */ /* synthetic */ void e(fhd fhdVar, nsl nslVar, String str, Object obj, ntq ntqVar, nru nruVar) {
        mpo mpoVar;
        nsl nslVar2;
        ntq ntqVar2;
        nru nruVar2;
        mzl mzlVar;
        nxq nxqVar;
        mzl mzlVar2 = (mzl) obj;
        int i = 1;
        if (mzlVar2.N()) {
            mpoVar = this;
            nslVar2 = nslVar;
            ntqVar2 = ntqVar;
            nruVar2 = nruVar;
            ntqVar2.o(new mpk(mpoVar, this.f.B(mzlVar2.s(), nslVar), ntqVar2, nruVar2, nslVar2));
            ntqVar2.a().w(true);
        } else {
            mpoVar = this;
            nslVar2 = nslVar;
            ntqVar2 = ntqVar;
            nruVar2 = nruVar;
        }
        if (mzlVar2.B()) {
            ntqVar2.E(new aclc(mpoVar, mpoVar.f.B(mzlVar2.h(), nslVar2), ntqVar2, nruVar2, nslVar2, null));
            ntqVar2.a().w(true);
        }
        if (mzlVar2.A()) {
            ntqVar2.D(new aclc(mpoVar, mpoVar.f.B(mzlVar2.g(), nslVar2), ntqVar2, nruVar2, nslVar2, null));
            ntqVar2.a().w(true);
        }
        if (mzlVar2.F()) {
            ntqVar2.C(new aclc(mpoVar, mpoVar.f.B(mzlVar2.k(), nslVar2), ntqVar2, nruVar2, nslVar2));
            ntqVar2.a().w(true);
        }
        if (mzlVar2.G()) {
            ntqVar2.B(new aclc(mpoVar, mpoVar.f.B(mzlVar2.l(), nslVar2), ntqVar2, nruVar2, nslVar2));
            ntqVar2.a().w(true);
        }
        if (mzlVar2.H()) {
            ntqVar2.m(new mpm(mpoVar, mpoVar.f.B(mzlVar2.m(), nslVar2), ntqVar2, nruVar2, nslVar2));
            ntqVar2.a().w(true);
        }
        if (mzlVar2.C()) {
            mzn mznVarY = mzlVar2.y();
            if (mznVarY.i()) {
                ntqVar2.A(new aclc(mpoVar, mpoVar.f.B(mznVarY.g(), nslVar2), ntqVar2, nruVar2, nslVar2));
            }
            if (mznVarY.j()) {
                ntqVar2.z(new aclc(mpoVar, mpoVar.f.B(mznVarY.h(), nslVar2), ntqVar2, nruVar2, nslVar2));
            }
            Context context = fhdVar.a;
            int iK = mznVarY.k() - 1;
            if (iK != 0) {
                nxqVar = iK != 1 ? new nxq(context, 45.0f, 90.0f, true) : new nxq(context, 0.0f, 45.0f, true);
            } else {
                nxqVar = new nxq(context, 0.0f, 90.0f, true);
            }
            ntqVar2.x(nxqVar);
            ntqVar2.a().w(true);
        }
        if (mzlVar2.M()) {
            ntqVar2.n(new mpn(mpoVar, mpoVar.f.B(mzlVar2.r(), nslVar2), ntqVar2, nruVar2, nslVar2));
            ntqVar2.a().w(true);
        }
        if (mzlVar2.I()) {
            ntqVar2.J(new aclc(mpoVar, mpoVar.f.B(mzlVar2.n(), nslVar2), ntqVar2, nruVar2, nslVar2));
            ntqVar2.a().w(true);
        }
        if (mzlVar2.J()) {
            ntqVar2.I(new aclc(mpoVar, mpoVar.f.B(mzlVar2.o(), nslVar2), ntqVar2, nruVar2, nslVar2, null, null));
            ntqVar2.a().w(true);
        }
        if (mzlVar2.K()) {
            ntqVar2.H(new aclc(mpoVar, mpoVar.f.B(mzlVar2.p(), nslVar2), ntqVar2, nruVar2, nslVar2, null, null));
            ntqVar2.a().w(true);
        }
        if (mzlVar2.L()) {
            ntqVar2.G(new aclc(mpoVar, mpoVar.f.B(mzlVar2.q(), nslVar2), ntqVar2, nruVar2, nslVar2, null));
            ntqVar2.a().w(true);
        }
        if (mzlVar2.D()) {
            mzlVar = mzlVar2;
            ntqVar2.k(new mpf(mpoVar, mzlVar, mpoVar.f.B(mzlVar2.i(), nslVar2), ntqVar2, nruVar2, nslVar2));
        } else {
            mzlVar = mzlVar2;
        }
        if (mzlVar.S()) {
            ntqVar2.s(new mpg(mpoVar, mpoVar.f.B(mzlVar.x(), nslVar2), ntqVar2, nruVar2, nslVar2));
        }
        if (mzlVar.E()) {
            ntqVar2.l(new mph(mpoVar, mpoVar.f.B(mzlVar.j(), nslVar2), ntqVar2, nruVar2, nslVar2));
        }
        if (mzlVar.T()) {
            qnl.bx(mzlVar.z(), new mpv(ntqVar2, i));
        }
        if (mzlVar.O()) {
            ntqVar2.q(new mpi(mpoVar, mpoVar.f.B(mzlVar.t(), nslVar2), ntqVar2, nruVar2, nslVar2));
        }
        if (mzlVar.Q()) {
            ntqVar2.r(new mpj(mpoVar, mpoVar.f.B(mzlVar.v(), nslVar2), ntqVar2, nruVar2, nslVar2));
        }
        if (mzlVar.R()) {
            ntqVar2.F(new aclc(mpoVar, mpoVar.f.B(mzlVar.w(), nslVar2), ntqVar2, nruVar2, nslVar2, null));
        }
        if (mzlVar.P()) {
            ntqVar2.p(new mpl(mpoVar, mpoVar.f.B(mzlVar.u(), nslVar2), ntqVar2, nruVar2, nslVar2));
        }
    }

    public final void i(avmn avmnVar, nsl nslVar) {
        avnq avnqVar;
        if (!this.e || (avnqVar = nslVar.i) == null) {
            return;
        }
        avnqVar.c(avmnVar);
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void d(ntq ntqVar) {
    }
}

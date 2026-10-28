package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.util.Objects;
import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mhr extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nry a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    String c;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean d;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean e;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nuc g;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    agev q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    mww r;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nxl s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    mip t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj u;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj v;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj w;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj x;

    public mhr() {
        super("AnimatedType");
    }

    private static final adeq aE(fhd fhdVar) {
        return (adeq) fkx.al(fhdVar);
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        return new LottieAnimationView(context);
    }

    @Override // defpackage.fgy
    protected final void F(fko fkoVar, fko fkoVar2) {
        ((adeq) fkoVar).a = ((adeq) fkoVar2).a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b  */
    /* JADX WARN: Code duplicated, block: B:44:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0191  */
    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        ImageView.ScaleType scaleType;
        boolean z;
        float f;
        int i;
        Object obj2;
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
        Object obj3 = aE(fhdVar).a;
        final nry nryVar = this.a;
        nsl nslVar = this.b;
        nxl nxlVar = this.s;
        final nsl nslVar2 = nslVar;
        final nuc nucVar = this.g;
        mip mipVar = this.t;
        mww mwwVar = this.r;
        omj omjVar = this.u;
        omj omjVar2 = this.x;
        final omj omjVar3 = this.v;
        final omj omjVar4 = this.w;
        boolean z2 = this.f;
        boolean z3 = this.d;
        if ((mwwVar.u() && (mwwVar.l().j() || mwwVar.l().l() || mwwVar.l().k())) || mhz.c(mwwVar)) {
            mwx mwxVarA = mhz.a(mwwVar);
            lottieAnimationView.b = new eho() { // from class: mht
                @Override // defpackage.eho
                public final void a(Object obj4) {
                    nsl nslVar3 = nslVar2;
                    nucVar.f(aslh.LOG_TYPE_PROPERTY_RESOLUTION_ERROR, nslVar3, (Throwable) obj4, "Unable to parse Lottie animation", new Object[0]);
                    omj omjVar5 = omjVar4;
                    if (omjVar5 != null) {
                        LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                        nry nryVar2 = nryVar;
                        CommandOuterClass$Command commandOuterClass$CommandX = omjVar5.x();
                        nrt nrtVarD = nrv.d();
                        nrtVarD.e = ket.V(lottieAnimationView2);
                        nrtVarD.g = nslVar3.x;
                        nryVar2.a(commandOuterClass$CommandX, nrtVarD.a()).D();
                    }
                }
            };
            lottieAnimationView.e = !mwwVar.q();
            if (obj3 != null && (obj2 = ((ehs) obj3).a) != null) {
                lottieAnimationView.k((egy) obj2);
                lottieAnimationView.setTag(R.id.elements_lottie_animation_view_tag_id, null);
            } else if (mwxVarA.l()) {
                String strI = mwxVarA.i();
                if (!Objects.equals((String) lottieAnimationView.getTag(R.id.elements_lottie_animation_view_tag_id), strI)) {
                    lottieAnimationView.j(strI);
                    if (z2) {
                        lottieAnimationView.p(0.0f, true);
                    }
                    lottieAnimationView.setTag(R.id.elements_lottie_animation_view_tag_id, strI);
                }
            } else if (mwxVarA.j()) {
                lottieAnimationView.l(ehd.e(new ByteArrayInputStream(mwxVarA.h().getBytes()), mhz.b(mwwVar)));
                lottieAnimationView.setTag(R.id.elements_lottie_animation_view_tag_id, null);
            } else if (mwxVarA.k()) {
                lottieAnimationView.h(npy.a(fhdVar.b(), "raw", mwxVarA.g().h()));
                lottieAnimationView.setTag(R.id.elements_lottie_animation_view_tag_id, null);
            }
            int iD = mwwVar.D() - 1;
            if (mhz.c(mwwVar)) {
                if (iD == 2) {
                    scaleType = ImageView.ScaleType.CENTER_INSIDE;
                } else if (iD == 3) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                } else if (iD != 4) {
                    scaleType = ImageView.ScaleType.FIT_XY;
                } else {
                    scaleType = ImageView.ScaleType.CENTER;
                }
            } else if (iD == 1) {
                scaleType = ImageView.ScaleType.FIT_XY;
            } else if (iD == 3) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            } else if (iD != 4) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            } else {
                scaleType = ImageView.ScaleType.CENTER;
            }
            lottieAnimationView.setScaleType(scaleType);
            if (scaleType.equals(ImageView.ScaleType.FIT_XY)) {
                ehm ehmVar = lottieAnimationView.d;
            }
            lottieAnimationView.s(mwwVar.h());
            lottieAnimationView.d.w(true != mwwVar.s() ? 0 : -1);
            if (!z2) {
                lottieAnimationView.p(mwwVar.g(), true);
                lottieAnimationView.g();
            }
            if (z3) {
                lottieAnimationView.v(new eol(fhdVar.a, nxlVar));
            }
            if (mwwVar.w()) {
                mwq mwqVarI = mwwVar.i();
                if (mwqVarI.bV() <= mwqVarI.bU()) {
                    lottieAnimationView.n(mwqVarI.bV(), mwqVarI.bU());
                    if (omjVar == null || mwqVarI.bV() == mwqVarI.bU()) {
                        f = 0.0f;
                        i = 2;
                        z = true;
                    } else {
                        f = 0.0f;
                        i = 2;
                        lottieAnimationView.a(new mib(new aew(nryVar, omjVar, lottieAnimationView, nslVar2, 19)));
                        z = true;
                    }
                } else {
                    f = 0.0f;
                    i = 2;
                    z = true;
                }
            } else {
                z = true;
                f = 0.0f;
                i = 2;
                if (mwwVar.B()) {
                    mwr mwrVarJ = mwwVar.j();
                    if (mwrVarJ.bX() <= mwrVarJ.bW()) {
                        lottieAnimationView.o(mwrVarJ.bX(), mwrVarJ.bW());
                        if (omjVar2 != null && mwrVarJ.bX() != mwrVarJ.bW()) {
                            lottieAnimationView.a(new mib(new aew(nryVar, omjVar2, lottieAnimationView, nslVar2, 20)));
                        }
                    }
                }
            }
            if (omjVar3 != null) {
                nslVar2 = nslVar2;
                nslVar2 = nslVar2;
                lottieAnimationView.u(new ehq() { // from class: mhu
                    @Override // defpackage.ehq
                    public final void a(egy egyVar) {
                        CommandOuterClass$Command commandOuterClass$CommandX = omjVar3.x();
                        nrt nrtVarD = nrv.d();
                        nrtVarD.e = ket.V(lottieAnimationView);
                        nrtVarD.g = nslVar2.x;
                        nryVar.a(commandOuterClass$CommandX, nrtVarD.a()).D();
                    }
                });
            }
            if (z2) {
                if (mwwVar.v()) {
                    lottieAnimationView.p(mwwVar.g(), z);
                }
                if (mwwVar.C() == i) {
                    lottieAnimationView.g();
                } else if (mwwVar.C() == 3) {
                    lottieAnimationView.e();
                } else {
                    lottieAnimationView.e();
                    lottieAnimationView.p(f, z);
                }
            } else if (mwwVar.C() == i) {
                lottieAnimationView.f();
            } else {
                lottieAnimationView.e();
            }
            if (mwwVar.r() && fhdVar.a.getResources().getConfiguration().getLayoutDirection() == z) {
                final PointF pointF = new PointF();
                lottieAnimationView.u(new ehq() { // from class: mhw
                    @Override // defpackage.ehq
                    public final void a(egy egyVar) {
                        pointF.x = egyVar.i.width();
                    }
                });
                ejv ejvVar = ejv.a;
                lottieAnimationView.c(ejvVar, ehr.f, new enr() { // from class: mhx
                    @Override // defpackage.enr
                    public final Object a() {
                        return pointF;
                    }
                });
                lottieAnimationView.c(ejvVar, ehr.o, new mhy());
            }
            if (mipVar != null) {
                mipVar.b(lottieAnimationView, new nru() { // from class: mhv
                    @Override // defpackage.nru
                    public final nrt a(nrt nrtVar) {
                        askn asknVarU = ket.U(lottieAnimationView);
                        nrv nrvVarA = nrtVar.a();
                        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = nrvVarA.f;
                        nrt nrtVarE = nrvVarA.e();
                        nrtVarE.e = ket.W(senderStateOuterClass$SenderState, asknVarU);
                        return nrtVarE;
                    }
                });
            }
        }
    }

    @Override // defpackage.fgy
    public final void M(fhd fhdVar) {
        mww mwwVar = this.r;
        ehs ehsVarB = null;
        if (mwwVar.u() || mwwVar.t()) {
            mwx mwxVarA = mhz.a(mwwVar);
            if (mwxVarA.j()) {
                ehsVarB = ehd.b(mwxVarA.h(), mhz.b(mwwVar));
            } else if (mwxVarA.l()) {
                if (!mwwVar.q()) {
                    ehd.i(fhdVar.b(), mwxVarA.i());
                }
            } else if (mwxVarA.k()) {
                ehd.g(fhdVar.b(), npy.a(fhdVar.b(), "raw", mwxVarA.g().h()));
            }
        }
        aE(fhdVar).a = ehsVarB;
    }

    @Override // defpackage.fgy
    public final boolean V() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    @Override // defpackage.fgy
    protected final boolean ae(fgy fgyVar, fky fkyVar, fgy fgyVar2, fky fkyVar2) {
        boolean zEquals;
        mhr mhrVar = (mhr) fgyVar;
        mhr mhrVar2 = (mhr) fgyVar2;
        fif fifVar = new fif(mhrVar == null ? null : mhrVar.r, mhrVar2 == null ? null : mhrVar2.r);
        fif fifVar2 = new fif(mhrVar == null ? null : mhrVar.c, mhrVar2 != null ? mhrVar2.c : null);
        boolean zEquals2 = Objects.equals(fifVar.a, fifVar.b);
        Object obj = fifVar2.a;
        Object obj2 = fifVar2.b;
        if (obj == null) {
            if (obj2 == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (obj2 != null) {
            zEquals = obj.equals(obj2);
        } else {
            zEquals = false;
        }
        return (zEquals2 && zEquals) ? false : true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
        mip mipVar = this.t;
        boolean z = this.f;
        lottieAnimationView.clearAnimation();
        if (!z) {
            lottieAnimationView.p(0.0f, true);
        }
        lottieAnimationView.e();
        ehm ehmVar = lottieAnimationView.d;
        ehmVar.o();
        lottieAnimationView.f.clear();
        lottieAnimationView.v(null);
        ehmVar.s(null);
        if (mipVar != null) {
            mipVar.a.remove(lottieAnimationView);
        }
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        nuc nucVar;
        agev agevVar;
        omj omjVar;
        omj omjVar2;
        omj omjVar3;
        omj omjVar4;
        mww mwwVar;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            mhr mhrVar = (mhr) fgyVar;
            nry nryVar = this.a;
            if (nryVar == null ? mhrVar.a == null : nryVar.equals(mhrVar.a)) {
                nsl nslVar = this.b;
                if (nslVar == null ? mhrVar.b == null : nslVar.equals(mhrVar.b)) {
                    mip mipVar = this.t;
                    if (mipVar == null ? mhrVar.t == null : mipVar.equals(mhrVar.t)) {
                        String str = this.c;
                        if (str == null ? mhrVar.c == null : str.equals(mhrVar.c)) {
                            if (this.d == mhrVar.d && this.e == mhrVar.e && this.f == mhrVar.f && ((nucVar = this.g) == null ? mhrVar.g == null : nucVar.equals(mhrVar.g)) && ((agevVar = this.q) == null ? mhrVar.q == null : agevVar.equals(mhrVar.q)) && ((omjVar = this.u) == null ? mhrVar.u == null : omjVar.equals(mhrVar.u)) && ((omjVar2 = this.v) == null ? mhrVar.v == null : omjVar2.equals(mhrVar.v)) && ((omjVar3 = this.w) == null ? mhrVar.w == null : omjVar3.equals(mhrVar.w)) && ((omjVar4 = this.x) == null ? mhrVar.x == null : omjVar4.equals(mhrVar.x)) && ((mwwVar = this.r) == null ? mhrVar.r == null : mwwVar.equals(mhrVar.r))) {
                                nxl nxlVar = this.s;
                                if (nxlVar != null) {
                                    if (nxlVar.equals(mhrVar.s)) {
                                        return true;
                                    }
                                } else if (mhrVar.s == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 3;
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fko t() {
        return new adeq();
    }
}

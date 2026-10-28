package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mka extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nry a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nso c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nar d;

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
    Map q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nxl r;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj u;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj v;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj w;

    public mka() {
        super("EditableTextMount");
    }

    private static final mjz aE(fhd fhdVar) {
        return (mjz) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        return new mji(context, false);
    }

    @Override // defpackage.fgy
    protected final void E(fiz fizVar, fiz fizVar2) {
        mjy mjyVar = (mjy) fizVar;
        mjy mjyVar2 = (mjy) fizVar2;
        mjyVar.a = mjyVar2.a;
        mjyVar.b = mjyVar2.b;
        mjyVar.c = mjyVar2.c;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        mjz mjzVarAE = aE(fhdVar);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicReference atomicReference = new AtomicReference(new ArrayList());
        AtomicInteger atomicInteger2 = new AtomicInteger(0);
        mjzVarAE.a = atomicInteger;
        mjzVarAE.c = atomicReference;
        mjzVarAE.b = atomicInteger2;
    }

    @Override // defpackage.fgy
    protected final void J(fhd fhdVar, Object obj, fiz fizVar) {
        mji mjiVar = (mji) obj;
        TextWatcher textWatcher = mjiVar.b;
        if (textWatcher != null) {
            mjiVar.addTextChangedListener(textWatcher);
        }
        if (mjiVar.a.a.v()) {
            mjiVar.g = new orx(1);
        }
        mjiVar.c = true;
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        mjz mjzVarAE = aE(fhdVar);
        mji mjiVar = (mji) obj;
        nar narVar = this.d;
        omj omjVar = this.t;
        omj omjVar2 = this.u;
        omj omjVar3 = this.s;
        omj omjVar4 = this.v;
        omj omjVar5 = this.w;
        nxl nxlVar = this.r;
        nuc nucVar = this.g;
        nso nsoVar = this.c;
        boolean z = this.f;
        boolean z2 = this.e;
        nry nryVar = this.a;
        nsl nslVar = this.b;
        Map map = this.q;
        AtomicReference atomicReference = mjzVarAE.c;
        AtomicInteger atomicInteger = mjzVarAE.a;
        AtomicInteger atomicInteger2 = mjzVarAE.b;
        mjy mjyVar = (mjy) fizVar;
        int iIntValue = mjyVar.b.intValue();
        int iIntValue2 = mjyVar.a.intValue();
        Object obj2 = mjyVar.c;
        mjiVar.setWidth(iIntValue);
        mjiVar.setHeight(iIntValue2);
        mjiVar.e = atomicInteger;
        mjiVar.d = z2;
        mjiVar.f = atomicReference;
        mjiVar.c(narVar, mjh.a(omjVar, omjVar2, omjVar3, omjVar4, narVar, omjVar5, nxlVar, nucVar, nsoVar, z, nryVar, map, nslVar));
        mxc mxcVarK = narVar.k();
        if (mxcVarK != null && mxcVarK.E() != 2) {
            mjiVar.setEllipsize(msf.f(mxcVarK.E()));
        }
        if (mxcVarK != null && mxcVarK.E() == 1) {
            mjiVar.setEllipsize(msf.g(mxcVarK.H()));
        }
        fwl fwlVar = fwl.RTL;
        mjiVar.setTextDirection(obj2 == fwlVar ? 7 : 1);
        mxc mxcVarL = narVar.l();
        CharSequence text = mjiVar.getText();
        if (TextUtils.isEmpty(mjiVar.getText()) && !TextUtils.isEmpty(mjiVar.getHint())) {
            mxcVarL = narVar.k();
            text = mjiVar.getHint();
        }
        mjiVar.setTextAlignment(qnl.bJ(qnl.bK(mxcVarL), obj2 == fwlVar ? axn.d : axn.c, text, (fwl) obj2));
        if (atomicInteger2.get() != atomicInteger.get()) {
            atomicInteger2.set(atomicInteger.get());
        }
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        mjz mjzVar = (mjz) fkyVar;
        mjz mjzVar2 = (mjz) fkyVar2;
        mjzVar2.a = mjzVar.a;
        mjzVar2.b = mjzVar.b;
        mjzVar2.c = mjzVar.c;
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean V() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    protected final boolean ae(fgy fgyVar, fky fkyVar, fgy fgyVar2, fky fkyVar2) {
        mka mkaVar = (mka) fgyVar;
        mka mkaVar2 = (mka) fgyVar2;
        fif fifVar = new fif(mkaVar == null ? null : mkaVar.d, mkaVar2 == null ? null : mkaVar2.d);
        fif fifVar2 = new fif(mkaVar == null ? null : ((mjz) fkyVar).c, mkaVar2 == null ? null : ((mjz) fkyVar2).c);
        fif fifVar3 = new fif(mkaVar == null ? null : ((mjz) fkyVar).a, mkaVar2 == null ? null : ((mjz) fkyVar2).a);
        fif fifVar4 = new fif(mkaVar == null ? null : ((mjz) fkyVar).b, mkaVar2 == null ? null : ((mjz) fkyVar2).b);
        fif fifVar5 = new fif(mkaVar == null ? null : mkaVar.b, mkaVar2 != null ? mkaVar2.b : null);
        nar narVar = (nar) fifVar.a;
        nar narVar2 = (nar) fifVar.b;
        if (narVar != null && narVar2 != null) {
            if (narVar.u() != narVar2.u()) {
                return true;
            }
            if (narVar.D() && narVar2.D() && narVar2.k().y() && narVar.k().y() && !narVar.k().u().equals(narVar2.k().u())) {
                return true;
            }
            Object obj = fifVar3.b;
            if (obj != null && fifVar4.b != null && ((AtomicInteger) obj).get() != ((AtomicInteger) fifVar4.b).get()) {
                return true;
            }
            AtomicReference atomicReference = (AtomicReference) fifVar2.b;
            if (narVar.F() != narVar2.F()) {
                return true;
            }
            if (narVar.F() && narVar2.F() && narVar2.l().y() && narVar.l().y()) {
                String strU = narVar.l().u();
                String strU2 = narVar2.l().u();
                if (!strU.contentEquals(strU2)) {
                    if (atomicReference == null) {
                        return true;
                    }
                    Stream stream = Collection.EL.stream((List) atomicReference.get());
                    strU2.getClass();
                    if (!stream.anyMatch(new jmy(strU2, 5))) {
                        return true;
                    }
                }
            }
        }
        Object obj2 = fifVar5.a;
        Object obj3 = fifVar5.b;
        if (obj2 == null) {
            if (obj3 != null) {
                return true;
            }
        } else {
            if (obj3 == null) {
                return true;
            }
            Object obj4 = fifVar5.b;
            if (obj4 != null && !((nsl) obj2).n.equals(((nsl) obj4).n)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    @Override // defpackage.fgy
    public final void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
        Integer numValueOf = Integer.valueOf(fjiVar.g());
        Integer numValueOf2 = Integer.valueOf(fjiVar.b());
        fwl fwlVarM = fjiVar.m();
        mjy mjyVar = (mjy) fizVar;
        mjyVar.b = numValueOf;
        mjyVar.a = numValueOf2;
        mjyVar.c = fwlVarM;
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        mjz mjzVarAE = aE(fhdVar);
        nar narVar = this.d;
        nsl nslVar = this.b;
        nxl nxlVar = this.r;
        nuc nucVar = this.g;
        nso nsoVar = this.c;
        boolean z = this.f;
        nry nryVar = this.a;
        omj omjVar = this.w;
        Map map = this.q;
        CharSequence charSequenceA = mji.a(narVar, mjzVarAE.c);
        mji mjiVar = new mji(fhdVar.a, true);
        mjiVar.c(narVar, mjh.a(null, null, null, null, narVar, omjVar, nxlVar, nucVar, nsoVar, z, nryVar, map, nslVar));
        if (charSequenceA != null && !TextUtils.equals(mjiVar.getText(), charSequenceA)) {
            mjiVar.setText(charSequenceA);
        }
        mjiVar.measure(fhz.p(i), fhz.p(i2));
        fkwVar.b = mjiVar.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i) == 0) {
            fkwVar.a = 0;
        } else {
            fkwVar.a = Math.min(View.MeasureSpec.getSize(i), mjiVar.getMeasuredWidth());
        }
    }

    @Override // defpackage.fgy
    protected final void aq(fhd fhdVar, Object obj) {
        mji mjiVar = (mji) obj;
        TextWatcher textWatcher = mjiVar.b;
        if (textWatcher != null) {
            mjiVar.removeTextChangedListener(textWatcher);
        }
        orx orxVar = mjiVar.g;
        if (orxVar != null) {
            orxVar.d();
            mjiVar.g = null;
        }
        mjiVar.c = false;
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        omj omjVar;
        nuc nucVar;
        omj omjVar2;
        omj omjVar3;
        omj omjVar4;
        omj omjVar5;
        Map map;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            mka mkaVar = (mka) fgyVar;
            nry nryVar = this.a;
            if (nryVar == null ? mkaVar.a == null : nryVar.equals(mkaVar.a)) {
                nsl nslVar = this.b;
                if (nslVar == null ? mkaVar.b == null : nslVar.equals(mkaVar.b)) {
                    nso nsoVar = this.c;
                    if (nsoVar == null ? mkaVar.c == null : nsoVar.equals(mkaVar.c)) {
                        nar narVar = this.d;
                        if (narVar == null ? mkaVar.d == null : narVar.equals(mkaVar.d)) {
                            if (this.e == mkaVar.e && this.f == mkaVar.f && ((omjVar = this.w) == null ? mkaVar.w == null : omjVar.equals(mkaVar.w)) && ((nucVar = this.g) == null ? mkaVar.g == null : nucVar.equals(mkaVar.g)) && ((omjVar2 = this.s) == null ? mkaVar.s == null : omjVar2.equals(mkaVar.s)) && ((omjVar3 = this.t) == null ? mkaVar.t == null : omjVar3.equals(mkaVar.t)) && ((omjVar4 = this.u) == null ? mkaVar.u == null : omjVar4.equals(mkaVar.u)) && ((omjVar5 = this.v) == null ? mkaVar.v == null : omjVar5.equals(mkaVar.v)) && ((map = this.q) == null ? mkaVar.q == null : aguu.q(map, mkaVar.q))) {
                                nxl nxlVar = this.r;
                                if (nxlVar != null) {
                                    if (nxlVar.equals(mkaVar.r)) {
                                        return true;
                                    }
                                } else if (mkaVar.r == null) {
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
    public final /* bridge */ /* synthetic */ fgy l() {
        return (mka) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fiz r() {
        return new mjy();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new mjz();
    }
}

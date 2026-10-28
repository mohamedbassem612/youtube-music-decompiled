package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msm extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nxl A;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public omj B;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Boolean a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nry b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nso d;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean e;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nte f;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean g;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean q;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean r;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nuc t;

    @fmt(a = 13)
    @fmu(a = fmv.g)
    public Integer u;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float v;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float w;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float x;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    Map y;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    ner z;

    public msm() {
        super("TextComponent");
        this.d = msn.a;
    }

    public static msk aE(fhd fhdVar) {
        return new msk(fhdVar, new msm());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        mxc mxcVarI;
        Context context;
        mxc mxcVarC;
        nsl nslVar;
        mxc mxcVarT;
        msl mslVar = (msl) fhdVar.i().c;
        ner nerVar = this.z;
        nry nryVar = this.b;
        nxl nxlVar = this.A;
        nsl nslVar2 = this.c;
        nuc nucVar = this.t;
        nso nsoVar = this.d;
        Map map = this.y;
        nte nteVar = this.f;
        omj omjVar = this.B;
        boolean z = this.q;
        boolean z2 = this.r;
        boolean z3 = this.s;
        boolean z4 = this.e;
        boolean z5 = this.g;
        AtomicReference atomicReference = new AtomicReference(nerVar.m() ? nerVar.i() : null);
        AtomicReference atomicReference2 = new AtomicReference(nerVar.n() ? nerVar.j() : null);
        if (nerVar.m()) {
            mxcVarI = nerVar.i();
            if (mxcVarI instanceof ngf) {
                mxcVarI = omj.t(mxcVarI, nslVar2, nucVar);
            }
        } else {
            mxcVarI = null;
        }
        Context context2 = fhdVar.a;
        mxc mxcVar = mxcVarI;
        AtomicReference atomicReference3 = new AtomicReference(msf.i(nslVar2, context2, mxcVar, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z, z2, z3, z4, 0));
        if (nerVar.n()) {
            mxcVarC = nerVar.j();
            context = context2;
            mxcVarT = mxcVarC instanceof ngf ? omj.t(mxcVarC, nslVar2, nucVar) : null;
            if (z5 || mxcVarC == null || mxcVar == null) {
                nslVar = nslVar2;
            } else {
                nslVar = nslVar2;
                if (msn.a(mxcVarC.u(), mxcVar.E(), nerVar.h())) {
                    mxcVarC = nsoVar.c(mxcVarC);
                }
            }
            AtomicReference atomicReference4 = new AtomicReference(msf.i(nslVar, context, mxcVarC, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z, z2, z3, z4, 0));
            mslVar.c = atomicReference;
            mslVar.d = atomicReference2;
            mslVar.a = atomicReference3;
            mslVar.b = atomicReference4;
        }
        context = context2;
        mxcVarC = mxcVarT;
        if (z5) {
            nslVar = nslVar2;
        } else {
            nslVar = nslVar2;
        }
        AtomicReference atomicReference5 = new AtomicReference(msf.i(nslVar, context, mxcVarC, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z, z2, z3, z4, 0));
        mslVar.c = atomicReference;
        mslVar.d = atomicReference2;
        mslVar.a = atomicReference3;
        mslVar.b = atomicReference5;
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        msl mslVar = (msl) fhdVar.i().c;
        nte nteVar = this.f;
        AtomicReference atomicReference = mslVar.c;
        AtomicReference atomicReference2 = mslVar.d;
        AtomicReference atomicReference3 = mslVar.a;
        AtomicReference atomicReference4 = mslVar.b;
        nteVar.a();
        atomicReference.lazySet(null);
        atomicReference2.lazySet(null);
        atomicReference3.lazySet(null);
        atomicReference4.lazySet(null);
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        msl mslVar = (msl) fkyVar;
        msl mslVar2 = (msl) fkyVar2;
        mslVar2.a = mslVar.a;
        mslVar2.b = mslVar.b;
        mslVar2.c = mslVar.c;
        mslVar2.d = mslVar.d;
    }

    @Override // defpackage.fgy
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        boolean z;
        Context context;
        CharSequence charSequenceI;
        mxc mxcVar;
        CharSequence charSequenceI2;
        Resources resources;
        mxc mxcVarC;
        mxc mxcVar2;
        msl mslVar = (msl) fhdVar.i().c;
        ner nerVar = this.z;
        nry nryVar = this.b;
        nxl nxlVar = this.A;
        nuc nucVar = this.t;
        nso nsoVar = this.d;
        nsl nslVar = this.c;
        Map map = this.y;
        nte nteVar = this.f;
        omj omjVar = this.B;
        boolean z2 = this.q;
        float f = this.x;
        float f2 = this.v;
        float f3 = this.w;
        Integer num = this.u;
        boolean z3 = this.r;
        boolean z4 = this.s;
        boolean z5 = this.e;
        Boolean bool = this.a;
        boolean z6 = this.g;
        AtomicReference atomicReference = mslVar.c;
        AtomicReference atomicReference2 = mslVar.d;
        AtomicReference atomicReference3 = mslVar.a;
        AtomicReference atomicReference4 = mslVar.b;
        Context context2 = fhdVar.a;
        Resources resources2 = context2.getResources();
        mxc mxcVarT = null;
        if (a.av(atomicReference, (mxc) atomicReference.get(), nerVar.m() ? nerVar.i() : null)) {
            if (nerVar.m()) {
                mxc mxcVarI = nerVar.i();
                if (mxcVarI instanceof ngf) {
                    mxcVarI = omj.t(mxcVarI, nslVar, nucVar);
                }
                mxcVar2 = mxcVarI;
            } else {
                mxcVar2 = null;
            }
            z = z5;
            context = context2;
            charSequenceI = msf.i(nslVar, context, mxcVar2, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z2, z3, z4, z, 0);
            atomicReference3.set(charSequenceI);
        } else {
            z = z5;
            context = context2;
            charSequenceI = (CharSequence) atomicReference3.get();
        }
        CharSequence charSequence = charSequenceI;
        mxc mxcVarJ = nerVar.n() ? nerVar.j() : null;
        Context context3 = context;
        if (Objects.equals(mxcVarJ, atomicReference2.get())) {
            mxcVar = mxcVarJ;
            charSequenceI2 = (CharSequence) atomicReference4.get();
        } else {
            atomicReference2.set(nerVar.j());
            if (nerVar.n()) {
                mxcVarC = nerVar.j();
                if (mxcVarC instanceof ngf) {
                    mxcVarT = omj.t(mxcVarC, nslVar, nucVar);
                    mxcVarC = mxcVarT;
                }
            } else {
                mxcVarC = mxcVarT;
            }
            if (!z6 || mxcVarC == null) {
                nslVar = nslVar;
                mxcVar = mxcVarJ;
            } else {
                mxcVar = mxcVarJ;
                if (msn.a(mxcVarC.u(), nerVar.i() != null ? nerVar.i().E() : 1, nerVar.h())) {
                    mxcVarC = nsoVar.c(mxcVarC);
                }
            }
            charSequenceI2 = msf.i(nslVar, context3, mxcVarC, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z2, z3, z4, z, 0);
            atomicReference4.set(charSequenceI2);
        }
        int i = 0;
        boolean z7 = nerVar.m() && nerVar.i().E() == 5;
        fts ftsVar = new fts(fhdVar, new ftu());
        ftu ftuVar = ftsVar.a;
        ftuVar.y = charSequence;
        ftsVar.d.set(0);
        ftuVar.f = z7;
        ayq ayqVar = ftsVar.c;
        ftuVar.w = ayqVar.z(f);
        ftuVar.u = ayqVar.z(f2);
        ftuVar.v = ayqVar.z(f3);
        ftuVar.t = num == null ? 0 : num.intValue();
        TypedArray typedArrayObtainStyledAttributes = ((Resources.Theme) ayqVar.a).obtainStyledAttributes(new int[]{R.attr.textColorLink});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            ftuVar.r = color;
            Typeface typefaceN = Typeface.DEFAULT;
            int iA = msf.a(resources2);
            if (iA <= 0) {
                resources = resources2;
            } else if (iA == 300) {
                typefaceN = Typeface.DEFAULT_BOLD;
                resources = resources2;
            } else {
                resources = resources2;
                typefaceN = afxw.n(resources, Typeface.DEFAULT);
            }
            ftu ftuVar2 = ftsVar.a;
            ftuVar2.D = typefaceN;
            ftuVar2.A = msf.d(charSequence, resources);
            ftuVar2.b = TextUtils.isEmpty(charSequenceI2) ? 1 : 0;
            if (nerVar.h() > 0) {
                ftuVar2.s = nerVar.h();
            }
            if (nerVar.m()) {
                mxc mxcVarI2 = nerVar.i();
                ftuVar2.E = qnl.bK(mxcVarI2);
                if (mxcVarI2.g() != 0.0f) {
                    ftuVar2.g = ftsVar.c.A(mxcVarI2.g());
                }
                ftuVar2.x = mxcVarI2.v();
                if (mxcVarI2.E() != 2) {
                    ftsVar.d(msf.f(mxcVarI2.E()));
                }
                if (mxcVarI2.E() == 1) {
                    if (mxcVarI2.H() != 6) {
                        ftsVar.d(msf.g(mxcVarI2.H()));
                    } else {
                        ftuVar2.C = true;
                    }
                }
                if (mxcVarI2.E() == 7) {
                    ftsVar.d(TextUtils.TruncateAt.MARQUEE);
                }
                if (mxcVarI2.i() != 0) {
                    ftsVar.c();
                }
                if (mxcVar != null && mxcVar.i() > 0) {
                    ftsVar.c();
                }
                if (z6 && msn.a(charSequenceI2, nerVar.i().E(), nerVar.h())) {
                    charSequenceI2 = "…";
                }
            }
            if (!TextUtils.isEmpty(charSequenceI2)) {
                ftuVar2.d = charSequenceI2;
            }
            if (nerVar.m()) {
                mxc mxcVarI3 = nerVar.i();
                while (true) {
                    if (i >= mxcVarI3.m()) {
                        if (mxcVarI3.j() <= 0) {
                            break;
                        }
                        break;
                    }
                    mxy mxyVarT = mxcVarI3.t(i);
                    if (mxyVarT.j() == 0 && mxyVarT.F() != 5) {
                        i++;
                    }
                    ftuVar2.G = new heg();
                    break;
                }
            }
            if (bool != null) {
                ftuVar2.c = bool.booleanValue();
            }
            if (nerVar.g() > 0) {
                ftsVar.e(nerVar.g());
            } else {
                ftsVar.e(436207616);
            }
            return ftsVar.a();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new msl();
    }
}

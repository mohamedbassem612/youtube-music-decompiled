package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ades extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nxs a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Executor b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public mbc c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nry d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nsl e;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nuc g;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public asnq q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public adhv r;

    @fmt(a = 0)
    @fmu(a = fmv.a)
    public float s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Optional t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Executor u;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public zsl v;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Executor w;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean x;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public asnt y;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public ci z;

    public ades() {
        super("ImageZoom");
    }

    private static final ader aE(fhd fhdVar) {
        return (ader) fhdVar.i().c;
    }

    private static final adeq aF(fhd fhdVar) {
        return (adeq) fkx.al(fhdVar);
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        return new adfc(context);
    }

    @Override // defpackage.fgy
    protected final void E(fiz fizVar, fiz fizVar2) {
        zpd zpdVar = (zpd) fizVar;
        zpd zpdVar2 = (zpd) fizVar2;
        zpdVar.d = zpdVar2.d;
        zpdVar.b = zpdVar2.b;
        zpdVar.a = zpdVar2.a;
        zpdVar.c = zpdVar2.c;
    }

    @Override // defpackage.fgy
    protected final void F(fko fkoVar, fko fkoVar2) {
        ((adeq) fkoVar).a = ((adeq) fkoVar2).a;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        ader aderVarAE = aE(fhdVar);
        AtomicReference atomicReference = new AtomicReference(null);
        AtomicReference atomicReference2 = new AtomicReference(null);
        aderVarAE.a = atomicReference;
        aderVarAE.b = atomicReference2;
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        int i;
        amiu amiuVarC;
        Uri uri;
        ader aderVarAE = aE(fhdVar);
        adfc adfcVar = (adfc) obj;
        asnt asntVar = this.y;
        adhv adhvVar = this.r;
        nry nryVar = this.d;
        nsl nslVar = this.e;
        nxs nxsVar = this.a;
        zsl zslVar = this.v;
        zpd zpdVar = (zpd) fizVar;
        Object obj2 = zpdVar.a;
        ((Integer) zpdVar.c).intValue();
        ((Integer) zpdVar.d).intValue();
        Object obj3 = zpdVar.b;
        int iIntValue = ((Integer) aF(fhdVar).a).intValue();
        nuc nucVar = this.g;
        Optional optional = this.t;
        asnq asnqVar = this.q;
        ci ciVar = this.z;
        mbc mbcVar = this.c;
        Executor executor = this.w;
        Executor executor2 = this.b;
        boolean z = this.f;
        boolean z2 = this.x;
        AtomicReference atomicReference = aderVarAE.a;
        AtomicReference atomicReference2 = aderVarAE.b;
        asnm asnmVar = asntVar.d;
        if (asnmVar == null) {
            asnmVar = asnm.a;
        }
        Context context = fhdVar.a;
        adfcVar.a = iIntValue;
        adfcVar.b = asnmVar.e;
        adfcVar.k = nryVar;
        adfcVar.j = nslVar;
        if ((asntVar.c & 2) != 0) {
            CommandOuterClass$Command defaultInstance = asntVar.e;
            if (defaultInstance == null) {
                defaultInstance = CommandOuterClass$Command.getDefaultInstance();
            }
            adfcVar.l = defaultInstance;
        }
        if ((asntVar.c & 4) != 0) {
            CommandOuterClass$Command defaultInstance2 = asntVar.f;
            if (defaultInstance2 == null) {
                defaultInstance2 = CommandOuterClass$Command.getDefaultInstance();
            }
            adfcVar.m = defaultInstance2;
        }
        adfcVar.p = asntVar.h;
        int iAU = a.aU(asntVar.i);
        if (iAU == 0) {
            iAU = 1;
        }
        adfcVar.C = iAU;
        adfcVar.q = asntVar.o;
        int iAS = a.aS(asntVar.j);
        if (iAS == 0) {
            iAS = 1;
        }
        adfcVar.D = iAS;
        adfcVar.v = asntVar.q;
        asnr asnrVar = asnr.a;
        asns asnsVar = asntVar.k;
        if (asnsVar == null) {
            asnsVar = asns.a;
        }
        asnr asnrVar2 = asnsVar.b;
        if (asnrVar2 == null) {
            asnrVar2 = asnrVar;
        }
        boolean zEquals = asnrVar.equals(asnrVar2);
        boolean z3 = !zEquals;
        adfcVar.r = z3;
        if (!zEquals) {
            asns asnsVar2 = asntVar.k;
            if (asnsVar2 == null) {
                asnsVar2 = asns.a;
            }
            asnr asnrVar3 = asnsVar2.b;
            if (asnrVar3 != null) {
                asnrVar = asnrVar3;
            }
            adfcVar.t = asnrVar;
            adfcVar.s = (asnsVar2 == 0 ? asns.a : asnsVar2).c;
            adfcVar.u = (asnsVar2 == 0 ? asns.a : asnsVar2).d;
        }
        if (obj2 == null) {
            asnm asnmVar2 = asnmVar;
            int iBc = a.bc(asnmVar2.d);
            if (iBc == 0) {
                iBc = 1;
            }
            adfcVar.B = iBc;
            int iD = npy.d(context, asnmVar2);
            if (iD > 0) {
                Resources resources = context.getResources();
                int i2 = avt.a;
                adfcVar.setImageDrawable(resources.getDrawable(iD, null));
                aecm.J(adfcVar, asntVar);
                return;
            }
            agev agevVarE = nqv.e(asnmVar2);
            if (agevVarE.g()) {
                adfcVar.setImageDrawable(nqv.a(context, (byte[]) agevVarE.c()));
                aecm.J(adfcVar, asntVar);
                return;
            }
            return;
        }
        Uri uriD = tyu.d(((aqmg) obj2).c);
        adhq adhqVarA = adhr.a();
        adhqVarA.e = new adhw();
        adhqVarA.h = 1;
        if (uriD != null) {
            boolean z4 = nxsVar != null;
            String string = uriD.toString();
            acog acogVar = new acog(string, asnqVar, 5, null);
            if (true != optional.isPresent()) {
                string = string;
                nxsVar = nxsVar;
                i = 8;
            } else {
                Object obj4 = optional.get();
                Object obj5 = acogVar.b;
                Object obj6 = acogVar.a;
                xje xjeVar = (xje) obj4;
                i = 8;
                if (xjeVar.c()) {
                    xii xiiVarG = ((xit) xjeVar.a.io()).g();
                    xis xisVar = xis.a;
                    xiiVarG.a(269, new xis((String) obj5, false)).k();
                }
                int i3 = adex.a;
                if (obj6 == 0) {
                    amiuVarC = adex.c(null, null, null, null);
                } else {
                    asnq asnqVar2 = (asnq) obj6;
                    int i4 = asnqVar2.b;
                    amiuVarC = adex.c((i4 & 1) != 0 ? asnqVar2.c : null, (i4 & 2) != 0 ? Boolean.valueOf(asnqVar2.d) : null, (asnqVar2.b & 4) != 0 ? Boolean.valueOf(asnqVar2.e) : null, (asnqVar2.b & 8) != 0 ? asnqVar2.f : null);
                }
                if (xjeVar.c()) {
                    Optional optionalB = ((xit) xjeVar.a.io()).g().b(269, (String) obj5);
                    xdd xddVar = new xdd(amiuVarC, 3);
                    if (true == optionalB.isPresent()) {
                        ((xir) optionalB.get()).h((amiu) xddVar.a);
                    }
                }
            }
            atomicReference2.set(uriD);
            if (!z4 || z2) {
                adev adevVar = new adev(asntVar, nryVar, nslVar, context, z3, executor, executor2, z, asnmVar, z4, z2, optional, string, nxsVar, nucVar);
                optional = optional;
                adhqVarA.d = adevVar;
                uri = uriD;
                adhvVar.i(adfcVar, uri, adhqVarA.a());
            } else {
                int iBc2 = a.bc(asnmVar.d);
                int i5 = iBc2 == 0 ? 1 : iBc2;
                asnm asnmVar3 = asnmVar;
                adew adewVar = new adew(adfcVar, asntVar, nucVar, i5, nslVar);
                boolean z5 = (asntVar.c & SemanticState.Modal) != 0;
                CommandOuterClass$Command defaultInstance3 = asntVar.m;
                if (defaultInstance3 == null) {
                    defaultInstance3 = CommandOuterClass$Command.getDefaultInstance();
                }
                Optional optionalM = aext.m(z5, defaultInstance3);
                nxs nxsVar2 = nxsVar;
                int i6 = i;
                adeo adeoVar = new adeo(uriD, adfcVar, nxsVar2, zslVar, ciVar, mbcVar, adewVar, nryVar, nslVar, optionalM, nucVar, optional, executor, executor2, z);
                uri = uriD;
                atomicReference.set(adeoVar);
                if ((asntVar.c & SemanticState.Obscured) != 0) {
                    CommandOuterClass$Command defaultInstance4 = asntVar.n;
                    if (defaultInstance4 == null) {
                        defaultInstance4 = CommandOuterClass$Command.getDefaultInstance();
                    }
                    nrt nrtVarD = nrv.d();
                    nrtVarD.b(nslVar);
                    nryVar.a(defaultInstance4, nrtVarD.a()).D();
                }
                if ((asntVar.c & i6) != 0) {
                    asnm asnmVar4 = asntVar.g;
                    if (asnmVar4 == null) {
                        asnmVar4 = asnm.a;
                    }
                    aecm.I(adfcVar, asnmVar4, context, nryVar, z3, executor, executor2, z);
                }
                String str = string;
                addb addbVar = new addb(str, i6);
                if (true == optional.isPresent()) {
                    ((xje) optional.get()).b((String) addbVar.a, "img_ls");
                }
                adfcVar.A = false;
                adfcVar.x = zslVar;
                adfcVar.y = nxsVar2;
                if (obj3 != null) {
                    int iBc3 = a.bc(asnmVar3.d);
                    if (iBc3 == 0) {
                        iBc3 = 1;
                    }
                    adfcVar.B = iBc3;
                    adeo.d(new AtomicBoolean(false), (Bitmap) ((zrr) obj3).a, str, adfcVar, optional);
                    aecm.J(adfcVar, asntVar);
                } else {
                    adhvVar.m(uri, adeoVar);
                }
            }
            addb addbVar2 = new addb(uri, 9);
            if (true == optional.isPresent()) {
                ((xje) optional.get()).b(((Uri) addbVar2.a).toString(), "img_vv");
            }
        }
    }

    @Override // defpackage.fgy
    public final void M(fhd fhdVar) {
        asnm asnmVar = this.y.d;
        if (asnmVar == null) {
            asnmVar = asnm.a;
        }
        int i = adex.a;
        int i2 = 0;
        if (asnmVar != null && asnmVar.c.size() > 0 && ((asno) asnmVar.c.get(0)).c == 3) {
            asno asnoVar = (asno) asnmVar.c.get(0);
            i2 = (asnoVar.c == 3 ? (asnk) asnoVar.d : asnk.a).d;
        }
        aF(fhdVar).a = Integer.valueOf(i2);
        float f = this.s;
        if (f > 0.0f) {
            nyc nycVar = new nyc(f);
            fhdVar.m();
            as(fhdVar, nycVar);
        }
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        ader aderVar = (ader) fkyVar;
        ader aderVar2 = (ader) fkyVar2;
        aderVar2.a = aderVar.a;
        aderVar2.b = aderVar.b;
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
        ades adesVar = (ades) fgyVar;
        ades adesVar2 = (ades) fgyVar2;
        fif fifVar = new fif(adesVar == null ? null : adesVar.y, adesVar2 != null ? adesVar2.y : null);
        return !((asnt) fifVar.a).equals(fifVar.b);
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, syp] */
    @Override // defpackage.fgy
    public final void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
        aqmh aqmhVar;
        Object obj;
        asnt asntVar = this.y;
        nxs nxsVar = this.a;
        boolean z = this.x;
        ci ciVar = this.z;
        asnm asnmVar = asntVar.d;
        if (asnmVar == null) {
            asnmVar = asnm.a;
        }
        int i = adex.a;
        if (asnmVar == null) {
            aqmhVar = aqmh.a;
        } else {
            aihh aihhVar = (aihh) aqmh.a.createBuilder();
            int size = asnmVar.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                asno asnoVar = (asno) asnmVar.c.get(i2);
                if (asnoVar.c == 1) {
                    aihf aihfVarCreateBuilder = aqmg.a.createBuilder();
                    String str = asnoVar.c == 1 ? (String) asnoVar.d : "";
                    aihfVarCreateBuilder.copyOnWrite();
                    aqmg aqmgVar = (aqmg) aihfVarCreateBuilder.instance;
                    str.getClass();
                    aqmgVar.b |= 1;
                    aqmgVar.c = str;
                    int i3 = asnoVar.e;
                    aihfVarCreateBuilder.copyOnWrite();
                    aqmg aqmgVar2 = (aqmg) aihfVarCreateBuilder.instance;
                    aqmgVar2.b |= 2;
                    aqmgVar2.d = i3;
                    int i4 = asnoVar.f;
                    aihfVarCreateBuilder.copyOnWrite();
                    aqmg aqmgVar3 = (aqmg) aihfVarCreateBuilder.instance;
                    aqmgVar3.b |= 4;
                    aqmgVar3.e = i4;
                    aihhVar.x(aihfVarCreateBuilder);
                }
            }
            aqmhVar = (aqmh) aihhVar.build();
        }
        Integer numValueOf = Integer.valueOf(fjiVar.g());
        Integer numValueOf2 = Integer.valueOf(fjiVar.b());
        Object objA = null;
        if (aqmhVar.c.size() <= 0 || fjiVar.g() <= 0 || fjiVar.b() <= 0) {
            obj = null;
        } else {
            aqmg aqmgVarK = aawb.K(aqmhVar, fjiVar.g(), fjiVar.b());
            if (nxsVar != null && !z) {
                objA = ciVar.a.a(adeo.c(Uri.parse(aqmgVarK.c)));
            }
            obj = objA;
            objA = aqmgVarK;
        }
        zpd zpdVar = (zpd) fizVar;
        zpdVar.a = objA;
        zpdVar.b = obj;
        zpdVar.c = numValueOf;
        zpdVar.d = numValueOf2;
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        asno asnoVar;
        int i3;
        int i4;
        asnm asnmVar = this.y.d;
        if (asnmVar == null) {
            asnmVar = asnm.a;
        }
        int i5 = adex.a;
        float f = 1.0f;
        if (asnmVar != null && asnmVar.c.size() != 0 && (i3 = (asnoVar = (asno) asnmVar.c.get(0)).e) != 0 && (i4 = asnoVar.f) != 0) {
            f = i3 / i4;
        }
        fhz.q(i, i2, f, fkwVar);
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        ader aderVarAE = aE(fhdVar);
        adfc adfcVar = (adfc) obj;
        adhv adhvVar = this.r;
        Optional optional = this.t;
        nxs nxsVar = this.a;
        AtomicReference atomicReference = aderVarAE.a;
        AtomicReference atomicReference2 = aderVarAE.b;
        adhvVar.f(adfcVar);
        adeo adeoVar = (adeo) atomicReference.getAndSet(null);
        if (adeoVar != null) {
            adeoVar.h.set(true);
        }
        if (nxsVar != null) {
            nxsVar.f();
            nxsVar.a();
        }
        Dialog dialog = adfcVar.f;
        if (dialog != null) {
            dialog.dismiss();
            adfcVar.f = null;
        }
        adfcVar.setImageDrawable(null);
        adfcVar.k = null;
        adfcVar.l = null;
        adfcVar.m = null;
        adfcVar.a = 0;
        adfcVar.b = false;
        adfcVar.z = null;
        adfcVar.x = null;
        adfcVar.y = null;
        adfcVar.A = false;
        adfcVar.o = false;
        adfcVar.p = false;
        adfcVar.q = false;
        adfcVar.r = false;
        adfcVar.s = false;
        adfcVar.t = asnr.a;
        adfcVar.u = false;
        adfcVar.w = false;
        adfcVar.C = 1;
        adfcVar.D = 1;
        adfcVar.v = false;
        if (atomicReference2.get() != null) {
            Uri uri = (Uri) atomicReference2.get();
            uri.getClass();
            String string = uri.toString();
            addb addbVar = new addb(string, 10);
            if (true == optional.isPresent()) {
                ((xje) optional.get()).b((String) addbVar.a, "img_lc");
            }
            addb addbVar2 = new addb(string, 11);
            if (true == optional.isPresent()) {
                ((xje) optional.get()).a((String) addbVar2.a);
            }
            atomicReference2.set(null);
        }
    }

    @Override // defpackage.fgy
    public final void au(fiz fizVar) {
        zpd zpdVar = (zpd) fizVar;
        aecm.K(this.r, (aqmg) zpdVar.a, ((Integer) zpdVar.c).intValue(), ((Integer) zpdVar.d).intValue(), this.g, this.e, this.u);
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        nuc nucVar;
        ci ciVar;
        asnq asnqVar;
        adhv adhvVar;
        Optional optional;
        Executor executor;
        zsl zslVar;
        Executor executor2;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            ades adesVar = (ades) fgyVar;
            nxs nxsVar = this.a;
            if (nxsVar == null ? adesVar.a == null : nxsVar.equals(adesVar.a)) {
                Executor executor3 = this.b;
                if (executor3 == null ? adesVar.b == null : executor3.equals(adesVar.b)) {
                    mbc mbcVar = this.c;
                    if (mbcVar == null ? adesVar.c == null : mbcVar.equals(adesVar.c)) {
                        nry nryVar = this.d;
                        if (nryVar == null ? adesVar.d == null : nryVar.equals(adesVar.d)) {
                            nsl nslVar = this.e;
                            if (nslVar == null ? adesVar.e == null : nslVar.equals(adesVar.e)) {
                                if (this.f == adesVar.f && ((nucVar = this.g) == null ? adesVar.g == null : nucVar.equals(adesVar.g)) && ((ciVar = this.z) == null ? adesVar.z == null : ciVar.equals(adesVar.z)) && ((asnqVar = this.q) == null ? adesVar.q == null : asnqVar.equals(adesVar.q)) && ((adhvVar = this.r) == null ? adesVar.r == null : adhvVar.equals(adesVar.r)) && Float.compare(this.s, adesVar.s) == 0 && ((optional = this.t) == null ? adesVar.t == null : optional.equals(adesVar.t)) && ((executor = this.u) == null ? adesVar.u == null : executor.equals(adesVar.u)) && ((zslVar = this.v) == null ? adesVar.v == null : zslVar.equals(adesVar.v)) && ((executor2 = this.w) == null ? adesVar.w == null : executor2.equals(adesVar.w)) && this.x == adesVar.x) {
                                    asnt asntVar = this.y;
                                    if (asntVar != null) {
                                        if (asntVar.equals(adesVar.y)) {
                                            return true;
                                        }
                                    } else if (adesVar.y == null) {
                                        return true;
                                    }
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
        return 30;
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (ades) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fiz r() {
        return new zpd();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fko t() {
        return new adeq();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new ader();
    }

    @Override // defpackage.fgy
    public final void ai() {
    }
}

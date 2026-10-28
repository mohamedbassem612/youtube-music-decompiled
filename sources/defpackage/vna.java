package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class vna extends vmz implements voa, xcl, xcv, wwm, wxj {
    private final Executor A;
    private boolean B;
    private boolean C;
    private final avmm D;
    private final avmm E;
    private avmn F;
    private final tce G;
    private final vxz H;
    private final vxz I;
    private final ahrn J;
    private final aeiy K;
    private final afip L;
    private final Context a;
    private final awmd b;
    private final aefv c;
    private final vpq d;
    protected final wwn h;
    public final wwt i;
    public final vyo j;
    public amqm k;
    public CharSequence l;
    public vpk m;
    public ViewGroup n;
    public final avmb o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final wwb t;
    public final abwk u;
    public final ahto v;
    private aecp w;
    private CharSequence x;
    private wwu y;
    private vos z;

    protected vna(Context context, aeiy aeiyVar, wwn wwnVar, wwt wwtVar, awmd awmdVar, afip afipVar, vyo vyoVar, aefv aefvVar, abxv abxvVar, wwb wwbVar, abwk abwkVar, ahto ahtoVar, ahrn ahrnVar, vxz vxzVar, vxz vxzVar2, tce tceVar, avmb avmbVar, Executor executor) {
        super(wwnVar.l);
        this.p = false;
        this.q = false;
        this.D = new avmm();
        this.E = new avmm();
        this.a = context;
        this.K = aeiyVar;
        this.h = wwnVar;
        this.i = wwtVar;
        this.b = awmdVar;
        this.L = afipVar;
        this.j = vyoVar;
        this.c = aefvVar;
        this.d = abxvVar.y(wwnVar.l);
        this.t = wwbVar;
        this.u = abwkVar;
        this.v = ahtoVar;
        this.J = ahrnVar;
        this.H = vxzVar;
        this.I = vxzVar2;
        this.G = tceVar;
        this.o = avmbVar;
        this.A = executor;
    }

    private final vpk a() {
        vpk vpkVar = this.m;
        if (vpkVar != null) {
            return vpkVar;
        }
        vpk vpkVar2 = (vpk) this.b.io();
        this.m = vpkVar2;
        vpkVar2.l(this);
        vpk vpkVar3 = this.m;
        vpkVar3.j = this.e;
        return vpkVar3;
    }

    private final void b(boolean z) {
        aihf aihfVarCreateBuilder = aqnm.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aqnm aqnmVar = (aqnm) aihfVarCreateBuilder.instance;
        aqnmVar.b |= 2;
        aqnmVar.c = z;
        this.G.a(new wxy(agev.i("tag"), (aqnm) aihfVarCreateBuilder.build()));
    }

    private final void g() {
        vny vnyVarT = T();
        if (vnyVarT == null || this.r) {
            return;
        }
        boolean z = false;
        if (!this.B && !this.C) {
            z = true;
        }
        vnyVarT.j(z);
    }

    @Override // defpackage.vmz, defpackage.vob
    public final void A(akuj akujVar, amdd amddVar, adxd adxdVar) {
        wvz wvzVarCc;
        super.A(akujVar, amddVar, adxdVar);
        if (akujVar == null || (wvzVarCc = zik.cc(akujVar)) == null) {
            return;
        }
        this.d.f(this.f, this.g);
        this.k = wvzVarCc.c;
        akuo akuoVar = wvzVarCc.a;
        if (akuoVar != null) {
            aj(akuoVar);
            return;
        }
        akrn akrnVar = wvzVarCc.b;
        if (akrnVar != null) {
            af(akrnVar);
        }
    }

    @Override // defpackage.vmz, defpackage.vob
    public final boolean F() {
        return true;
    }

    @Override // defpackage.vmz, defpackage.vob
    public final boolean I(akuj akujVar, ajwo ajwoVar) {
        if (!this.H.m(39, 45664796L)) {
            return false;
        }
        A(akujVar, this.g, null);
        return true;
    }

    @Override // defpackage.vob
    public final vny T() {
        vos vosVar = this.z;
        return vosVar == null ? a() : vosVar;
    }

    protected final void U(avmn avmnVar) {
        this.D.c(avmnVar);
    }

    protected final void W() {
        amqm amqmVar = this.k;
        if (amqmVar != null) {
            this.h.l.p(new xgj(amqmVar.k, (amud) null), null);
        }
    }

    protected final void X() {
        amqm amqmVar = this.k;
        if (amqmVar != null) {
            this.h.l.w(new xgj(amqmVar.k, (amud) null), null);
        }
    }

    @Override // defpackage.wxj
    public final void Y() {
        this.C = false;
        g();
    }

    @Override // defpackage.wxj
    public final void Z() {
        this.C = true;
        g();
    }

    @Override // defpackage.vob
    public final void aa() {
        this.t.b();
        this.q = false;
        am();
        b(false);
        this.E.b();
        aecp aecpVar = this.w;
        if (aecpVar != null) {
            aecpVar.a.a();
        }
        this.p = false;
        W();
    }

    @Override // defpackage.vob
    public final void ab() {
        this.d.c();
        this.r = true;
    }

    @Override // defpackage.voa
    public final void ac(acjx acjxVar) {
        this.h.r(acjxVar);
    }

    @Override // defpackage.vob
    public final void ad(ajwo ajwoVar) {
        avmn avmnVar = this.F;
        if (avmnVar != null) {
            avmnVar.dispose();
        }
        this.p = true;
        this.d.d(ajwoVar);
        this.A.execute(afwl.i(new vlj(this, 6)));
        this.r = false;
        this.c.g();
        g();
        X();
    }

    @Override // defpackage.wwm
    public final void ae(int i) {
        this.B = i > 0;
        g();
    }

    protected final void af(akrn akrnVar) {
        this.m = null;
        vos vosVarAd = this.L.ad(this.e, this.g, akrnVar, w());
        this.z = vosVarAd;
        vosVarAd.g();
    }

    @Override // defpackage.xcv
    public final void ah(akrn akrnVar) {
        this.w.c(akrnVar);
    }

    public final void ai() {
        vny vnyVarT = T();
        if (vnyVarT != null) {
            if (TextUtils.isEmpty(this.x) && TextUtils.isEmpty(this.l)) {
                vnyVarT.n(null);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(this.x)) {
                spannableStringBuilder.append(this.x);
                if (!TextUtils.isEmpty(this.l)) {
                    spannableStringBuilder.append((char) 160);
                    spannableStringBuilder.append((char) 160);
                }
            }
            if (!TextUtils.isEmpty(this.l)) {
                Context context = this.a;
                Drawable drawable = context.getResources().getDrawable(R.drawable.artboard);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.engagement_panel_header_icon_size);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable.setTint(tzk.n(context, R.attr.ytIcon1).orElse(0));
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append(' ');
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append(this.l);
            }
            vnyVarT.n(spannableStringBuilder);
            vnyVarT.o(TextUtils.TruncateAt.MIDDLE);
        }
    }

    protected final void aj(akuo akuoVar) {
        alay alayVar;
        vpk vpkVarA = a();
        if (vpkVarA != null) {
            aqaw aqawVar = null;
            this.z = null;
            if (akuoVar == null || (akuoVar.b & 2) == 0) {
                vpkVarA.C(this.a.getString(R.string.live_chat_header_title));
            } else {
                alay alayVar2 = akuoVar.e;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
                vpkVarA.C(ackj.k(null, alayVar2, null, false));
            }
            this.x = null;
            if (akuoVar != null) {
                if ((akuoVar.b & 32) == 0) {
                    akup akupVar = akuoVar.h;
                    if (akupVar == null) {
                        akupVar = akup.a;
                    }
                    for (aqav aqavVar : (akupVar.b == 76818770 ? (aqaw) akupVar.c : aqaw.a).c) {
                        if (aqavVar.f) {
                            this.x = aqavVar.e;
                            break;
                        }
                    }
                } else {
                    alay alayVar3 = akuoVar.i;
                    if (alayVar3 == null) {
                        alayVar3 = alay.a;
                    }
                    this.x = ackj.k(null, alayVar3, null, false);
                }
            }
            if (akuoVar != null) {
                amoo amooVar = this.j.b().e;
                if (amooVar == null) {
                    amooVar = amoo.a;
                }
                if (amooVar.c) {
                    if ((akuoVar.b & 8) != 0) {
                        alayVar = akuoVar.g;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                    } else {
                        alayVar = null;
                    }
                    this.l = ackj.k(null, alayVar, null, false);
                }
            }
            ai();
            if (akuoVar != null && (akuoVar.b & 16) != 0) {
                akup akupVar2 = akuoVar.h;
                if (akupVar2 == null) {
                    akupVar2 = akup.a;
                }
                aqawVar = akupVar2.b == 76818770 ? (aqaw) akupVar2.c : aqaw.a;
            }
            vpkVarA.k(aqawVar);
            vpkVarA.v(akuoVar);
            vpkVarA.x(akuoVar);
            vpkVarA.w(akuoVar);
        }
    }

    public final void ak() {
        this.q = true;
        al();
        b(true);
        f();
        vpk vpkVar = this.m;
        if (vpkVar != null) {
            vpkVar.h();
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [awmd, java.lang.Object] */
    protected final void al() {
        wvx wvxVar;
        amqm amqmVar = this.k;
        if (amqmVar != null) {
            wwt wwtVar = this.i;
            wwn wwnVar = (wwn) wwtVar.a.io();
            if (Objects.equals(amqmVar, wwtVar.g) && wwnVar.x()) {
                return;
            }
            wwtVar.g = amqmVar;
            if (wwtVar.h == null || !yno.dC(amqmVar)) {
                return;
            }
            wwnVar.n(false);
            if (wwtVar.h.b() != null) {
                wwtVar.h.b().l();
            }
            wwnVar.w();
            wwnVar.h(wwtVar.h.b());
            wwu wwuVar = wwtVar.h;
            if (wwuVar.i == null) {
                zs zsVar = wwuVar.k;
                ViewGroup viewGroup = wwuVar.b;
                wzb wzbVar = (wzb) zsVar.a.io();
                wzbVar.getClass();
                wwuVar.i = new abix(wzbVar, viewGroup);
            }
            abix abixVar = wwuVar.i;
            wwp wwpVar = (wwp) wwtVar.e.io();
            if (wwnVar != null) {
                wwpVar.a = wwnVar;
                wwnVar.E(wwpVar);
            }
            wwpVar.b = abixVar;
            wwnVar.r.h(wwpVar);
            wxm wxmVarA = wwtVar.h.a();
            ((wwi) wwtVar.b.io()).jl(wxmVarA);
            wwk wwkVar = (wwk) wwtVar.f.io();
            wwu wwuVar2 = wwtVar.h;
            if (wwuVar2.e == null) {
                aehs aehsVar = wwuVar2.j;
                ViewGroup viewGroup2 = wwuVar2.b;
                xgn xgnVar = wwuVar2.c;
                ((Context) aehsVar.e.io()).getClass();
                advb advbVar = (advb) aehsVar.h.io();
                advbVar.getClass();
                wyx wyxVar = (wyx) aehsVar.i.io();
                wyxVar.getClass();
                vxe vxeVar = (vxe) aehsVar.a.io();
                vxeVar.getClass();
                ci ciVar = (ci) aehsVar.d.io();
                ciVar.getClass();
                acyx acyxVar = (acyx) aehsVar.c.io();
                acyxVar.getClass();
                Handler handler = (Handler) aehsVar.g.io();
                handler.getClass();
                ((xgn) aehsVar.b.io()).getClass();
                wwuVar2.e = new xcd(advbVar, wyxVar, vxeVar, ciVar, acyxVar, handler, aehsVar.f, viewGroup2, xgnVar);
                if (((vxz) wwuVar2.d.io()).m(12, 45756228L)) {
                    wwuVar2.e.c.b = true;
                }
            }
            wwkVar.a(wwuVar2.e);
            wwu wwuVar3 = wwtVar.h;
            if (((vxz) wwuVar3.d.io()).m(28, 45825352L)) {
                if (wwuVar3.f == null) {
                    xte xteVar = wwuVar3.h;
                    ViewGroup viewGroup3 = wwuVar3.b;
                    acyx acyxVar2 = (acyx) xteVar.c.io();
                    acyxVar2.getClass();
                    advb advbVar2 = (advb) xteVar.f.io();
                    advbVar2.getClass();
                    ci ciVar2 = (ci) xteVar.e.io();
                    ciVar2.getClass();
                    xgm xgmVar = (xgm) xteVar.a.io();
                    xgmVar.getClass();
                    wyx wyxVar2 = (wyx) xteVar.d.io();
                    wyxVar2.getClass();
                    xsc xscVar = (xsc) xteVar.b.io();
                    xscVar.getClass();
                    wwuVar3.f = new wvy(acyxVar2, advbVar2, ciVar2, xgmVar, wyxVar2, xscVar, viewGroup3);
                }
                wvxVar = wwuVar3.f;
            } else {
                wvxVar = null;
            }
            if (wvxVar != null) {
                wwkVar.a(wvxVar);
            }
            wws wwsVar = (wws) wwtVar.c.io();
            wwu wwuVar4 = wwtVar.h;
            if (wwuVar4.g == null) {
                wyk wykVar = wwuVar4.a;
                ViewGroup viewGroup4 = wwuVar4.b;
                xgn xgnVar2 = wwuVar4.c;
                Context context = (Context) wykVar.b.io();
                context.getClass();
                aduv aduvVar = (aduv) wykVar.c.io();
                aduvVar.getClass();
                adhv adhvVar = (adhv) wykVar.d.io();
                adhvVar.getClass();
                vxe vxeVar2 = (vxe) wykVar.e.io();
                vxeVar2.getClass();
                ahey aheyVar = (ahey) wykVar.f.io();
                aheyVar.getClass();
                wxi wxiVar = (wxi) wykVar.g.io();
                wxiVar.getClass();
                ci ciVar3 = (ci) wykVar.h.io();
                ciVar3.getClass();
                wyx wyxVar3 = (wyx) wykVar.a.io();
                wyxVar3.getClass();
                wbz wbzVar = (wbz) wykVar.i.io();
                wbzVar.getClass();
                ahgb ahgbVar = (ahgb) wykVar.j.io();
                ahgbVar.getClass();
                adsa adsaVar = (adsa) wykVar.k.io();
                adsaVar.getClass();
                vxz vxzVar = (vxz) wykVar.l.io();
                vxzVar.getClass();
                wwuVar4.g = new wyj(context, aduvVar, adhvVar, vxeVar2, aheyVar, wxiVar, ciVar3, wyxVar3, wbzVar, ahgbVar, adsaVar, vxzVar, viewGroup4, xgnVar2);
            }
            wwsVar.a = wwuVar4.g;
            ((xbf) wxmVarA).T = new xxj(wwtVar, null);
            ((wwh) wwtVar.d.io()).a = wwnVar;
            wwnVar.u(amqmVar);
            xck xckVar = wwtVar.i;
            if (xckVar != null) {
                wwtVar.a(xckVar);
            }
        }
    }

    protected final void am() {
        avmn avmnVar = this.F;
        if (avmnVar != null) {
            avmnVar.dispose();
        }
        avmb avmbVar = this.o;
        wwt wwtVar = this.i;
        wwtVar.getClass();
        this.F = avmbVar.e(afwl.i(new vlj(wwtVar, 7)));
    }

    @Override // defpackage.xcl
    public final void an(amqk amqkVar) {
        if (amqkVar != null) {
            int i = amqkVar.b;
            if (i == 138681548) {
                aj((akuo) amqkVar.c);
                return;
            }
            if (i == 153515154) {
                af((akrn) amqkVar.c);
                return;
            }
            if (i == 130028801) {
                amol amolVar = (amol) amqkVar.c;
                vny vnyVarT = T();
                if (vnyVarT != null) {
                    int i2 = amolVar.b;
                    Spanned spannedK = ackj.k(null, i2 == 1 ? i2 == 1 ? (alay) amolVar.c : alay.a : null, null, false);
                    if (!TextUtils.isEmpty(spannedK)) {
                        this.x = spannedK;
                        ai();
                        vnyVarT.k(null);
                        return;
                    }
                    int i3 = amolVar.b;
                    if (i3 == 5) {
                        apji apjiVar = i3 == 5 ? (apji) amolVar.c : apji.a;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqay.a);
                        apjiVar.c(aihlVarCheckIsLite);
                        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                        aqaw aqawVar = (aqaw) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                        if (aqawVar.c.size() != 0) {
                            for (aqav aqavVar : aqawVar.c) {
                                if (aqavVar.f) {
                                    this.x = aqavVar.e;
                                    ai();
                                    break;
                                }
                            }
                        }
                        vnyVarT.k(aqawVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.vob
    public final View c() {
        return this.n;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [awmd, java.lang.Object] */
    @Override // defpackage.vob
    public final void d(ajwo ajwoVar) {
        k();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.live_chat_content, (ViewGroup) null, false);
        this.n = viewGroup;
        ViewStub viewStub = this.I.m(12, 45756228L) ? (ViewStub) viewGroup.findViewById(R.id.live_chat_banner_stub_bottom) : (ViewStub) viewGroup.findViewById(R.id.live_chat_banner_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        aeiy aeiyVar = this.K;
        ViewGroup viewGroup2 = this.n;
        xgn xgnVar = this.e;
        xcf xcfVar = (xcf) aeiyVar.c.io();
        zs zsVar = (zs) aeiyVar.d.io();
        aehs aehsVar = (aehs) aeiyVar.a.io();
        xte xteVar = (xte) aeiyVar.g.io();
        wyk wykVar = (wyk) aeiyVar.f.io();
        xcj xcjVar = (xcj) aeiyVar.b.io();
        viewGroup2.getClass();
        xgnVar.getClass();
        wwu wwuVar = new wwu(xcfVar, zsVar, aehsVar, xteVar, wykVar, xcjVar, aeiyVar.e, viewGroup2, xgnVar);
        this.y = wwuVar;
        wwt wwtVar = this.i;
        if (wwtVar.h != wwuVar) {
            wwtVar.h = wwuVar;
            ViewGroup viewGroup3 = wwtVar.h.b;
            wwtVar.i = new xck(viewGroup3.getContext());
            wwtVar.i.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            xck xckVar = wwtVar.i;
            xckVar.a = wwtVar;
            viewGroup3.addView(xckVar);
        }
        this.y.b().m();
        wwn wwnVar = this.h;
        wwnVar.p(this);
        aecp aecpVar = this.w;
        if (aecpVar == null) {
            ahrn ahrnVar = this.J;
            Context context = (Context) ahrnVar.b.io();
            context.getClass();
            acxn acxnVar = (acxn) ahrnVar.c.io();
            acxnVar.getClass();
            nuc nucVar = (nuc) ahrnVar.a.io();
            nucVar.getClass();
            ElementsServices elementsServices = (ElementsServices) ahrnVar.d.io();
            elementsServices.getClass();
            abxu abxuVar = (abxu) ahrnVar.f.io();
            abxuVar.getClass();
            xgnVar.getClass();
            aecp aecpVar2 = new aecp(context, ahrnVar.e, acxnVar, nucVar, elementsServices, abxuVar, xgnVar, null, true);
            this.w = aecpVar2;
            aecpVar = aecpVar2;
        }
        aecpVar.b((FrameLayout) this.n.findViewById(R.id.reaction_control_panel_overlay));
        wwnVar.q(this);
        wwnVar.i = this;
        wwnVar.s.b.add(this);
        al();
        this.d.a();
    }

    @Override // defpackage.vob
    public final void e() {
        wwn wwnVar = this.h;
        wwnVar.v();
        this.t.a.clear();
        this.D.b();
        this.d.b();
        wwnVar.s.b.remove(this);
        aecp aecpVar = this.w;
        if (aecpVar != null) {
            aecpVar.a();
        }
        avmn avmnVar = this.F;
        if (avmnVar != null) {
            avmnVar.dispose();
            this.F = null;
        }
    }

    protected abstract void f();

    protected void k() {
        throw null;
    }

    @Override // defpackage.vmz, defpackage.vob
    public final void y() {
        ak();
    }

    @Override // defpackage.vob
    public final void V(adlz adlzVar) {
    }

    @Override // defpackage.vob
    public final void ag(vnz vnzVar) {
    }
}

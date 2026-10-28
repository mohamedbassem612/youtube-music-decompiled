package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vsc extends vrk {
    public final Context d;
    public final zwb e;
    public final vxe f;
    public final LoadingFrameLayout g;
    public final xgn h;
    public FrameLayout i;
    public Optional j = Optional.empty();
    public boolean k = false;
    public final aegs l;
    private final cf m;
    private final awmd n;
    private final Map o;
    private final awmd p;
    private final awmd q;
    private final awmd r;
    private final awmd s;
    private final awmd t;
    private final awmd u;
    private final xit v;
    private final vxz w;

    public vsc(Context context, cf cfVar, zwb zwbVar, vxe vxeVar, aegs aegsVar, awmd awmdVar, Map map, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, xit xitVar, vxz vxzVar, LoadingFrameLayout loadingFrameLayout, xgn xgnVar) {
        this.d = context;
        this.m = cfVar;
        this.e = zwbVar;
        this.f = vxeVar;
        this.l = aegsVar;
        this.n = awmdVar;
        this.o = map;
        this.p = awmdVar2;
        this.q = awmdVar3;
        this.r = awmdVar4;
        this.s = awmdVar5;
        this.t = awmdVar6;
        this.u = awmdVar7;
        this.v = xitVar;
        this.w = vxzVar;
        this.h = xgnVar;
        this.g = loadingFrameLayout;
    }

    private final void u() {
        if (this.i == null) {
            Context context = this.d;
            FrameLayout frameLayout = new FrameLayout(context);
            this.i = frameLayout;
            frameLayout.setBackgroundColor(tzk.n(context, R.attr.ytBrandBackgroundSolid).orElse(-16777216));
        }
    }

    private final void w() {
        this.j.ifPresentOrElse(new vnm(this, 3), new vlj(this, 10));
    }

    @Override // defpackage.vox
    public final void c() {
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        w();
    }

    @Override // defpackage.vox
    public final void d() {
        w();
    }

    @Override // defpackage.vox
    public final void f() {
        if (!this.k) {
            j((arkm) this.b, false, null);
        }
        arkm arkmVar = (arkm) this.b;
        if (!this.w.m(12, 45834315L) || arkmVar == null || (arkmVar.b & 536870912) == 0) {
            return;
        }
        arkg arkgVar = arkmVar.G;
        if (arkgVar == null) {
            arkgVar = arkg.a;
        }
        if (arkgVar.b) {
            Optional optional = this.j;
            if (true == optional.isPresent()) {
                ((aehd) optional.get()).g();
            }
            this.l.c();
        }
    }

    @Override // defpackage.vro
    public final View k() {
        u();
        FrameLayout frameLayout = this.i;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.vro
    public final agev l() {
        return agdf.a;
    }

    @Override // defpackage.vro
    public final agev m() {
        return agdf.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0348  */
    /* JADX WARN: Code duplicated, block: B:103:0x0358  */
    /* JADX WARN: Code duplicated, block: B:106:0x039b  */
    /* JADX WARN: Code duplicated, block: B:108:0x039f  */
    /* JADX WARN: Code duplicated, block: B:111:0x041e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0432  */
    /* JADX WARN: Code duplicated, block: B:156:0x0522  */
    /* JADX WARN: Code duplicated, block: B:229:0x075d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0768  */
    /* JADX WARN: Code duplicated, block: B:232:0x076f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0781  */
    /* JADX WARN: Code duplicated, block: B:237:0x0787  */
    /* JADX WARN: Code duplicated, block: B:241:0x079a  */
    /* JADX WARN: Code duplicated, block: B:244:0x081e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0821  */
    /* JADX WARN: Code duplicated, block: B:263:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:265:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:267:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:271:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:96:0x032c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0342  */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r0v79, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, zvl] */
    /* JADX WARN: Type inference failed for: r11v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v20, types: [ahey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v116, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v110, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r5v116, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v117, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v64, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v65, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v60, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v61, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r9v28, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v29, types: [aunn, java.lang.Object] */
    @Override // defpackage.vrk, defpackage.vro
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void j(arkm arkmVar, boolean z, adxd adxdVar) {
        HashSet hashSet;
        boolean z2;
        vsc vscVar;
        WebView webView;
        boolean z3;
        wby wbyVarB;
        int iBt;
        int i;
        ajwo ajwoVar;
        ajwo ajwoVar2;
        boolean zA;
        String str;
        amdh amdhVar;
        arkm arkmVar2;
        anhh anhhVar;
        aihf aihfVarCreateBuilder;
        xeu xeuVar;
        int i2;
        agev agevVarI;
        agev agevVarI2;
        agev agevVarI3;
        arkm arkmVar3 = arkmVar;
        super.j(arkmVar, z, adxdVar);
        u();
        FrameLayout frameLayout = this.i;
        frameLayout.getClass();
        frameLayout.removeAllViews();
        w();
        this.b = arkmVar3;
        if (arkmVar3 != null) {
            if (arkmVar3.B) {
                this.j = Optional.of((aehd) this.n.io());
                xir xirVarO = this.v.o(184);
                vsb vsbVar = new vsb(this, 0);
                int i3 = arkmVar3.f;
                if (i3 == 0) {
                    i2 = 9;
                } else if (i3 == 44) {
                    i2 = 1;
                } else if (i3 == 48) {
                    i2 = 2;
                } else if (i3 == 54) {
                    i2 = 4;
                } else if (i3 == 57) {
                    i2 = 5;
                } else if (i3 == 59) {
                    i2 = 6;
                } else if (i3 == 65) {
                    i2 = 8;
                } else if (i3 != 62) {
                    i2 = i3 != 63 ? 0 : 7;
                } else {
                    i2 = 3;
                }
                int i4 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i4 != 0) {
                    if (i4 == 1) {
                        agevVarI2 = agev.i(((lqa) this.s.io()).I(arkmVar3, this.h));
                    } else if (i4 == 3) {
                        vxe vxeVar = (vxe) ((lqa) this.r.io()).a.io();
                        vxeVar.getClass();
                        agevVarI2 = agev.i(new aehv(arkmVar3, vxeVar));
                    } else if (i4 != 4) {
                        if (i4 == 6) {
                            vxz vxzVar = (vxz) ((lqa) this.t.io()).a.io();
                            vxzVar.getClass();
                            agevVarI3 = agev.i(new aehx(vxzVar));
                        } else if (i4 != 7) {
                            agevVarI3 = agdf.a;
                        } else {
                            agevVarI3 = agev.i(new aehw(this.m, this.f, arkmVar3));
                        }
                        agevVarI = agevVarI3;
                        xirVarO = xirVarO;
                    } else {
                        aehs aehsVar = (aehs) this.q.io();
                        zwb zwbVar = this.e;
                        xgn xgnVar = this.h;
                        ?? r4 = aehsVar.a;
                        zwa zwaVarE = zwbVar.e();
                        ?? Io = r4.io();
                        Io.getClass();
                        ?? Io2 = aehsVar.b.io();
                        Io2.getClass();
                        vxe vxeVar2 = (vxe) aehsVar.c.io();
                        vxeVar2.getClass();
                        ?? Io3 = aehsVar.g.io();
                        Io3.getClass();
                        ?? Io4 = aehsVar.d.io();
                        Io4.getClass();
                        ?? Io5 = aehsVar.h.io();
                        Io5.getClass();
                        ?? Io6 = aehsVar.e.io();
                        Io6.getClass();
                        ?? Io7 = aehsVar.f.io();
                        Io7.getClass();
                        vxz vxzVar2 = (vxz) aehsVar.i.io();
                        vxzVar2.getClass();
                        zwaVarE.getClass();
                        agevVarI2 = agev.i(new aehr(Io, Io2, vxeVar2, Io3, Io4, Io5, Io6, Io7, vxzVar2, arkmVar3, zwaVarE, xgnVar, xirVarO));
                    }
                    agevVarI = agevVarI2;
                } else {
                    xirVarO = xirVarO;
                    aejq aejqVar = (aejq) this.p.io();
                    zwb zwbVar2 = this.e;
                    ?? r5 = aejqVar.i;
                    Object obj = aejqVar.n;
                    Object obj2 = aejqVar.j;
                    Object obj3 = aejqVar.b;
                    ?? r9 = aejqVar.m;
                    wby wbyVarB2 = aejqVar.e.b(zwbVar2.e());
                    ?? r11 = aejqVar.g;
                    Object obj4 = aejqVar.c;
                    tun tunVar = (tun) obj4;
                    xeu xeuVar2 = (xeu) obj3;
                    ahnz ahnzVar = (ahnz) obj2;
                    txp txpVar = (txp) obj;
                    agevVarI = agev.i(new aeic(arkmVar3, vsbVar, r5, txpVar, ahnzVar, xeuVar2, r9, wbyVarB2, r11, tunVar, (vxz) aejqVar.f, (lqa) aejqVar.h, aejqVar.k, (lqa) aejqVar.l, (zj) aejqVar.d, aejqVar.a));
                }
                Optional optional = this.j;
                z3 = true;
                hqe hqeVar = new hqe(this, arkmVar, agevVarI, xirVarO, 3);
                if (true == optional.isPresent()) {
                    Object obj5 = optional.get();
                    Object obj6 = hqeVar.a;
                    Object obj7 = hqeVar.b;
                    Object obj8 = hqeVar.d;
                    ?? r0 = hqeVar.c;
                    vsc vscVar2 = (vsc) obj6;
                    FrameLayout frameLayout2 = vscVar2.i;
                    frameLayout2.getClass();
                    ((aehd) obj5).d(vscVar2.d, (arkm) obj7, frameLayout2, vscVar2.e.e(), vscVar2.f, new aehe((aehi) ((agev) obj8).f(), vscVar2.g, vscVar2.h, r0));
                }
                vscVar = this;
            } else {
                aegs aegsVar = this.l;
                Context context = this.d;
                zwb zwbVar3 = this.e;
                vxe vxeVar3 = this.f;
                LoadingFrameLayout loadingFrameLayout = this.g;
                zwa zwaVarE2 = zwbVar3.e();
                vsb vsbVar2 = new vsb(this, 1);
                xgn xgnVar2 = this.h;
                WebView webView2 = aegsVar.m;
                if (webView2 != null && webView2.getParent() != null) {
                    abte abteVar = aegsVar.H;
                    arkf arkfVarA = arkf.a(arkmVar3.v);
                    if (arkfVarA == null) {
                        arkfVarA = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
                    }
                    aeho.m(abteVar, 9, arkfVarA, "", false, false);
                    aegsVar.a();
                    Iterator it = aegsVar.i.iterator();
                    while (it.hasNext()) {
                        ((aego) it.next()).c();
                    }
                }
                Set set = aegsVar.i;
                set.clear();
                set.add(vsbVar2);
                aegsVar.p = arkmVar3;
                aegsVar.B = vxeVar3;
                aegsVar.o = xgnVar2;
                arkf arkfVarA2 = arkf.a(arkmVar3.v);
                if (arkfVarA2 == null) {
                    arkfVarA2 = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
                }
                aegsVar.r = arkfVarA2;
                arkf arkfVar = aegsVar.r;
                if (arkmVar3.d == 1 || arkfVar == arkf.WEB_VIEW_USE_CASE_IDENTITY_VERIFICATION || arkfVar == arkf.WEB_VIEW_USE_CASE_GEN_LIKENESS_IDENTITY_VERIFICATION) {
                    hashSet = new HashSet();
                    hashSet.addAll(aegsVar.E.h(0, 45389063L).b);
                    hashSet.addAll(aegsVar.p.y);
                } else {
                    hashSet = new HashSet();
                }
                aegsVar.A = hashSet;
                aegsVar.u = null;
                aegsVar.l = false;
                arkf arkfVar2 = aegsVar.r;
                arkf arkfVar3 = arkf.WEB_VIEW_USE_CASE_GAMEPLAY_MINI_APP;
                if (arkfVar2 == arkfVar3) {
                    amdd amddVar = aegsVar.u;
                    if (amddVar == null) {
                        ahqj ahqjVar = aegsVar.J;
                        ahqjVar.b = ((txp) ahqjVar.a).a();
                        str = (String) ahqjVar.b;
                        if (!ahno.aa(str)) {
                            aegsVar.t = str;
                            if (aegsVar.u == null) {
                                aegsVar.u = amdd.a;
                            }
                            aihf builder = aegsVar.u.toBuilder();
                            amdhVar = aegsVar.u.z;
                            if (amdhVar == null) {
                                amdhVar = amdh.a;
                            }
                            aihf builder2 = amdhVar.toBuilder();
                            String str2 = aegsVar.t;
                            builder2.copyOnWrite();
                            amdh amdhVar2 = (amdh) builder2.instance;
                            str2.getClass();
                            amdhVar2.b |= 1;
                            amdhVar2.c = str2;
                            amdh amdhVar3 = (amdh) builder2.build();
                            builder.copyOnWrite();
                            amdd amddVar2 = (amdd) builder.instance;
                            amdhVar3.getClass();
                            amddVar2.z = amdhVar3;
                            amddVar2.d |= 32768;
                            aegsVar.u = (amdd) builder.build();
                            arkmVar2 = aegsVar.p;
                            if ((arkmVar2.c & SemanticState.LiveRegion) != 0) {
                                anhhVar = arkmVar2.M;
                                if (anhhVar == null) {
                                    anhhVar = anhh.a;
                                }
                                aihf builder3 = anhhVar.toBuilder();
                                String str3 = aegsVar.t;
                                builder3.copyOnWrite();
                                anhh anhhVar2 = (anhh) builder3.instance;
                                str3.getClass();
                                anhhVar2.b |= 4;
                                anhhVar2.e = str3;
                                aegsVar.s = (anhh) builder3.build();
                                aegsVar.I.a = aegsVar.s;
                                aihfVarCreateBuilder = anhr.a.createBuilder();
                                String str4 = aegsVar.s.c;
                                aihfVarCreateBuilder.copyOnWrite();
                                anhr anhrVar = (anhr) aihfVarCreateBuilder.instance;
                                str4.getClass();
                                anhrVar.b |= 1;
                                anhrVar.c = str4;
                                String str5 = aegsVar.t;
                                aihfVarCreateBuilder.copyOnWrite();
                                anhr anhrVar2 = (anhr) aihfVarCreateBuilder.instance;
                                str5.getClass();
                                anhrVar2.b |= 2;
                                anhrVar2.d = str5;
                                aihfVarCreateBuilder.copyOnWrite();
                                anhr anhrVar3 = (anhr) aihfVarCreateBuilder.instance;
                                anhrVar3.e = 9;
                                anhrVar3.b |= 4;
                                int i5 = aegsVar.s.d;
                                aihfVarCreateBuilder.copyOnWrite();
                                anhr anhrVar4 = (anhr) aihfVarCreateBuilder.instance;
                                anhrVar4.b |= 8;
                                anhrVar4.f = i5;
                                xeuVar = aegsVar.j;
                                if (xeuVar.b) {
                                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MINI_APP_PLAY_EVENT);
                                    ztf ztfVar = xffVarA.k.e;
                                    xffVarA.l = ztfVar.a();
                                    ztfVar.k(xffVarA);
                                } else {
                                    alos alosVar = (alos) alou.a.createBuilder();
                                    alosVar.copyOnWrite();
                                    alou alouVar = (alou) alosVar.instance;
                                    anhr anhrVar5 = (anhr) aihfVarCreateBuilder.build();
                                    anhrVar5.getClass();
                                    alouVar.d = anhrVar5;
                                    alouVar.c = 469;
                                    xeuVar.b((alou) alosVar.build());
                                }
                            }
                        }
                    } else {
                        amdh amdhVar4 = amddVar.z;
                        if (amdhVar4 == null) {
                            amdhVar4 = amdh.a;
                        }
                        if ((amdhVar4.b & 1) != 0) {
                            amdd amddVar3 = aegsVar.u;
                            amddVar3.getClass();
                            amdh amdhVar5 = amddVar3.z;
                            if (amdhVar5 == null) {
                                amdhVar5 = amdh.a;
                            }
                            aegsVar.t = amdhVar5.c;
                            arkm arkmVar4 = aegsVar.p;
                            if ((arkmVar4.c & SemanticState.LiveRegion) != 0) {
                                anhh anhhVar3 = arkmVar4.M;
                                if (anhhVar3 == null) {
                                    anhhVar3 = anhh.a;
                                }
                                aihf builder4 = anhhVar3.toBuilder();
                                String str6 = aegsVar.t;
                                builder4.copyOnWrite();
                                anhh anhhVar4 = (anhh) builder4.instance;
                                str6.getClass();
                                anhhVar4.b |= 4;
                                anhhVar4.e = str6;
                                aegsVar.s = (anhh) builder4.build();
                            }
                        } else {
                            ahqj ahqjVar2 = aegsVar.J;
                            ahqjVar2.b = ((txp) ahqjVar2.a).a();
                            str = (String) ahqjVar2.b;
                            if (!ahno.aa(str)) {
                                aegsVar.t = str;
                                if (aegsVar.u == null) {
                                    aegsVar.u = amdd.a;
                                }
                                aihf builder5 = aegsVar.u.toBuilder();
                                amdhVar = aegsVar.u.z;
                                if (amdhVar == null) {
                                    amdhVar = amdh.a;
                                }
                                aihf builder6 = amdhVar.toBuilder();
                                String str7 = aegsVar.t;
                                builder6.copyOnWrite();
                                amdh amdhVar6 = (amdh) builder6.instance;
                                str7.getClass();
                                amdhVar6.b |= 1;
                                amdhVar6.c = str7;
                                amdh amdhVar7 = (amdh) builder6.build();
                                builder5.copyOnWrite();
                                amdd amddVar4 = (amdd) builder5.instance;
                                amdhVar7.getClass();
                                amddVar4.z = amdhVar7;
                                amddVar4.d |= 32768;
                                aegsVar.u = (amdd) builder5.build();
                                arkmVar2 = aegsVar.p;
                                if ((arkmVar2.c & SemanticState.LiveRegion) != 0) {
                                    anhhVar = arkmVar2.M;
                                    if (anhhVar == null) {
                                        anhhVar = anhh.a;
                                    }
                                    aihf builder7 = anhhVar.toBuilder();
                                    String str8 = aegsVar.t;
                                    builder7.copyOnWrite();
                                    anhh anhhVar5 = (anhh) builder7.instance;
                                    str8.getClass();
                                    anhhVar5.b |= 4;
                                    anhhVar5.e = str8;
                                    aegsVar.s = (anhh) builder7.build();
                                    aegsVar.I.a = aegsVar.s;
                                    aihfVarCreateBuilder = anhr.a.createBuilder();
                                    String str9 = aegsVar.s.c;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    anhr anhrVar6 = (anhr) aihfVarCreateBuilder.instance;
                                    str9.getClass();
                                    anhrVar6.b |= 1;
                                    anhrVar6.c = str9;
                                    String str10 = aegsVar.t;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    anhr anhrVar7 = (anhr) aihfVarCreateBuilder.instance;
                                    str10.getClass();
                                    anhrVar7.b |= 2;
                                    anhrVar7.d = str10;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    anhr anhrVar8 = (anhr) aihfVarCreateBuilder.instance;
                                    anhrVar8.e = 9;
                                    anhrVar8.b |= 4;
                                    int i6 = aegsVar.s.d;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    anhr anhrVar9 = (anhr) aihfVarCreateBuilder.instance;
                                    anhrVar9.b |= 8;
                                    anhrVar9.f = i6;
                                    xeuVar = aegsVar.j;
                                    if (xeuVar.b) {
                                        xff xffVarA2 = xeuVar.a(aihfVarCreateBuilder, alot.MINI_APP_PLAY_EVENT);
                                        ztf ztfVar2 = xffVarA2.k.e;
                                        xffVarA2.l = ztfVar2.a();
                                        ztfVar2.k(xffVarA2);
                                    } else {
                                        alos alosVar2 = (alos) alou.a.createBuilder();
                                        alosVar2.copyOnWrite();
                                        alou alouVar2 = (alou) alosVar2.instance;
                                        anhr anhrVar10 = (anhr) aihfVarCreateBuilder.build();
                                        anhrVar10.getClass();
                                        alouVar2.d = anhrVar10;
                                        alouVar2.c = 469;
                                        xeuVar.b((alou) alosVar2.build());
                                    }
                                }
                            }
                        }
                    }
                }
                aegsVar.q = aegsVar.e.b();
                abte abteVar2 = aegsVar.H;
                arkf arkfVarA3 = arkf.a(arkmVar3.v);
                if (arkfVarA3 == null) {
                    arkfVarA3 = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
                }
                aeho.l(abteVar2, 2, arkfVarA3, "", false, false, -1, Optional.of(Long.valueOf(aeho.k(context))));
                if ((arkmVar3.b & SemanticState.Focused) != 0) {
                    vxe vxeVar4 = aegsVar.B;
                    ajwo ajwoVar3 = arkmVar3.o;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    vxeVar4.a(aeho.b(ajwoVar3, aegsVar.r, aegsVar.s));
                }
                int i7 = arkmVar3.d;
                String str11 = i7 == 1 ? agvp.f((agya) arkmVar3.e).a : i7 == 14 ? (String) arkmVar3.e : "";
                int i8 = arkmVar3.d;
                ahub ahubVar = i8 == 1 ? new ahub(agvp.f(i8 == 1 ? (agya) arkmVar3.e : agya.a)) : null;
                amud amudVar = arkmVar3.A;
                if (amudVar == null) {
                    amudVar = amud.b;
                }
                if ((amudVar.c & 1) != 0) {
                    if (ahubVar != null) {
                        ahubVar.f("parentCsn", xgnVar2.i());
                        amud amudVar2 = arkmVar3.A;
                        if (amudVar2 == null) {
                            amudVar2 = amud.b;
                        }
                        ahubVar.f("parentTrackingParams", Base64.encodeToString(amudVar2.d.G(), 10));
                    }
                    z2 = true;
                    if (!aegsVar.G.m(12, 45834315L) || (arkmVar3.b & 536870912) == 0) {
                        aegsVar.c();
                    } else {
                        arkg arkgVar = arkmVar3.G;
                        if (arkgVar == null) {
                            arkgVar = arkg.a;
                        }
                        if (!arkgVar.b) {
                            aegsVar.c();
                        }
                    }
                } else {
                    z2 = true;
                }
                if (aegsVar.r == arkfVar3 && ahubVar != null && !aegsVar.t.isEmpty()) {
                    ahubVar.f("postPlayNonce", aegsVar.t);
                }
                if (aegsVar.r == arkfVar3) {
                    aegsVar.n = aegsVar.c.g().a(184, xis.a);
                    aegsVar.n.k();
                } else {
                    aegsVar.n = aegsVar.c.n(184);
                }
                aihf aihfVarCreateBuilder2 = amjm.a.createBuilder();
                arkf arkfVarA4 = arkf.a(arkmVar3.v);
                if (arkfVarA4 == null) {
                    arkfVarA4 = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
                }
                aihfVarCreateBuilder2.copyOnWrite();
                amjm amjmVar = (amjm) aihfVarCreateBuilder2.instance;
                amjmVar.c = arkfVarA4.z;
                amjmVar.b |= 1;
                amjm amjmVar2 = (amjm) aihfVarCreateBuilder2.build();
                xir xirVar = aegsVar.n;
                amiu amiuVar = amiu.a;
                aihf aihfVarCreateBuilder3 = amiuVar.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                amiu amiuVar2 = (amiu) aihfVarCreateBuilder3.instance;
                amjmVar2.getClass();
                amiuVar2.V = amjmVar2;
                amiuVar2.d |= 33554432;
                xirVar.h((amiu) aihfVarCreateBuilder3.build());
                arkf arkfVarA5 = arkf.a(arkmVar3.v);
                if (arkfVarA5 == null) {
                    arkfVarA5 = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
                }
                if (arkfVarA5 == arkfVar3) {
                    aihf aihfVarCreateBuilder4 = amjc.a.createBuilder();
                    String str12 = aegsVar.s.e;
                    aihfVarCreateBuilder4.copyOnWrite();
                    amjc amjcVar = (amjc) aihfVarCreateBuilder4.instance;
                    str12.getClass();
                    amjcVar.b |= 2;
                    amjcVar.d = str12;
                    String str13 = aegsVar.s.c;
                    aihfVarCreateBuilder4.copyOnWrite();
                    amjc amjcVar2 = (amjc) aihfVarCreateBuilder4.instance;
                    str13.getClass();
                    amjcVar2.b |= 1;
                    amjcVar2.c = str13;
                    int i9 = aegsVar.s.d;
                    aihfVarCreateBuilder4.copyOnWrite();
                    amjc amjcVar3 = (amjc) aihfVarCreateBuilder4.instance;
                    amjcVar3.b |= 4;
                    amjcVar3.e = i9;
                    amjc amjcVar4 = (amjc) aihfVarCreateBuilder4.build();
                    xir xirVar2 = aegsVar.n;
                    aihf aihfVarCreateBuilder5 = amiuVar.createBuilder();
                    aihfVarCreateBuilder5.copyOnWrite();
                    amiu amiuVar3 = (amiu) aihfVarCreateBuilder5.instance;
                    amjcVar4.getClass();
                    amiuVar3.X = amjcVar4;
                    amiuVar3.e |= 1;
                    xirVar2.h((amiu) aihfVarCreateBuilder5.build());
                }
                vxz vxzVar3 = aegsVar.C;
                if (vxzVar3.m(3, 45625459L) && aedi.f(context) == null) {
                    zvp.a(zvn.b, zvm.af, "No WebView installed");
                    if ((arkmVar3.b & 16384) != 0) {
                        ajwo ajwoVar4 = arkmVar3.u;
                        if (ajwoVar4 == null) {
                            ajwoVar4 = ajwo.a;
                        }
                        aegsVar.B.a(aeho.b(ajwoVar4, aegsVar.r, aegsVar.s));
                    } else {
                        agke agkeVarN = agke.n(set);
                        int size = agkeVarN.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((aego) agkeVarN.get(i10)).c();
                        }
                    }
                    vscVar = this;
                    webView = null;
                } else {
                    aegsVar.m = new WebView(context);
                    arkf arkfVar4 = aegsVar.r;
                    if (arkfVar4 == arkfVar3 || arkfVar4 == arkf.WEB_VIEW_USE_CASE_MY_AD_CENTER) {
                        boolean z4 = z2;
                        aegsVar.m.setRendererPriorityPolicy(z4 ? 1 : 0, z4);
                    }
                    if (aegsVar.r == arkfVar3 && ahubVar != null) {
                        ahubVar.f("deviceTextZoomSetting", Integer.toString(aegsVar.m.getSettings().getTextZoom()));
                    }
                    if (ahubVar != null) {
                        str11 = ahubVar.e().a;
                    }
                    String str14 = str11;
                    WebView webView3 = aegsVar.m;
                    webView3.setScrollBarStyle(33554432);
                    webView3.setScrollbarFadingEnabled(false);
                    vxz vxzVar4 = aegsVar.E;
                    if (vxzVar4.m(5, 45359121L)) {
                        WebView.setWebContentsDebuggingEnabled(true);
                    }
                    WebSettings settings = webView3.getSettings();
                    settings.setJavaScriptEnabled(true);
                    settings.setDomStorageEnabled(true);
                    settings.setSupportMultipleWindows(true);
                    settings.setMixedContentMode(2);
                    if (vxzVar3.m(0, 45422163L)) {
                        settings.setMediaPlaybackRequiresUserGesture(false);
                    }
                    settings.setLoadWithOverviewMode(true);
                    settings.setUseWideViewPort(true);
                    settings.setAllowContentAccess(false);
                    settings.setAllowFileAccess(false);
                    webView3.setDownloadListener(new aehb(context, 1));
                    arkf arkfVar5 = aegsVar.r;
                    if (aeho.f(str14, new HashSet(aegsVar.p.y))) {
                        aegsVar.x = false;
                        if (aegsVar.v.equals(str14)) {
                            aegsVar.w++;
                        } else {
                            aegsVar.v = str14;
                            aegsVar.w = 1;
                        }
                        loadingFrameLayout.g(0);
                        loadingFrameLayout.c();
                        if ((arkmVar3.b & 2097152) != 0) {
                            vxe vxeVar5 = aegsVar.B;
                            ajwoVar2 = arkmVar3.z;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            vxeVar5.a(ajwoVar2);
                        }
                        wbz wbzVar = aegsVar.b;
                        wbyVarB = wbzVar.b(zwaVarE2);
                        if (!arkmVar3.i.isEmpty()) {
                            arkc arkcVarAn = arkc.e(arkmVar3.i).an();
                            wer werVarE = wbyVarB.e();
                            werVarE.e(arkcVarAn);
                            werVarE.b();
                        }
                        xir xirVar3 = aegsVar.n;
                        Set set2 = aegsVar.A;
                        vxe vxeVar6 = aegsVar.B;
                        acwd acwdVar = aegsVar.h;
                        boolean zL = aegsVar.F.l(64, 45763769L, true);
                        agpr agprVar = agpr.a;
                        vscVar = this;
                        aegc aegcVar = new aegc(wbyVarB, xirVar3, abteVar2, xgnVar2, arkmVar3, set2, agprVar, vxeVar6, acwdVar, zL, null);
                        AtomicReference atomicReference = new AtomicReference();
                        atomicReference.set(Boolean.FALSE);
                        aegq aegqVar = new aegq(aegsVar, loadingFrameLayout, atomicReference, str14, arkmVar);
                        arkmVar3 = arkmVar;
                        aegcVar.a(aegqVar);
                        aegsVar.m.setWebViewClient(aegcVar);
                        wby wbyVarB3 = wbzVar.b(zwaVarE2);
                        String str15 = arkmVar3.i;
                        iBt = a.bt(arkmVar3.l);
                        if (iBt == 0) {
                            i = 1;
                        } else {
                            i = iBt;
                        }
                        aegsVar.m.setWebChromeClient(new aega(wbyVarB3, str15, i, acwdVar, context, agprVar));
                        if (!aeho.f(str14, aegsVar.A) && dvy.a("WEB_MESSAGE_LISTENER") && !DesugarCollections.unmodifiableMap(arkmVar3.J).isEmpty()) {
                            WebView webView4 = aegsVar.m;
                            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(arkmVar3.J);
                            String str16 = arkmVar3.i;
                            Uri uri = Uri.parse(str14);
                            agkx agkxVar = new agkx();
                            if (aegsVar.D.m(6, 45760217L)) {
                                Iterator it2 = aegsVar.A.iterator();
                                while (it2.hasNext()) {
                                    agkxVar.c("https://".concat(String.valueOf((String) it2.next())));
                                }
                            }
                            String scheme = uri.getScheme();
                            String host = uri.getHost();
                            if (scheme != null && host != null) {
                                agkxVar.c(a.cd(host, scheme, "://"));
                            }
                            aedi.k(webView4, "youtubewebview", agkxVar.g(), new aegr(aegsVar, mapUnmodifiableMap, str16, wbyVarB));
                        } else if (!DesugarCollections.unmodifiableMap(arkmVar3.J).isEmpty()) {
                            aeho.f(str14, aegsVar.A);
                            if (!dvy.a("WEB_MESSAGE_LISTENER") && (arkmVar3.b & 16384) != 0) {
                                ajwoVar = arkmVar3.u;
                                if (ajwoVar == null) {
                                    ajwoVar = ajwo.a;
                                }
                                aegsVar.B.a(aeho.b(ajwoVar, aegsVar.r, aegsVar.s));
                            }
                        }
                        taf.n(aegsVar.g.submit(afwl.j(new aalq(aegsVar, zwaVarE2, 11, null))), aegsVar.f, new gst(aegsVar, str14, arkmVar3, zwaVarE2, 10));
                        aegsVar.m.addOnAttachStateChangeListener(new aegz(1));
                        webView = aegsVar.m;
                    } else {
                        if (dvy.a("MULTI_PROCESS")) {
                            zA = dva.a();
                        } else {
                            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                            zA = Build.VERSION.SDK_INT >= 30 || !(Build.SUPPORTED_64_BIT_ABIS.length == 0 && activityManager != null && activityManager.isLowRamDevice());
                        }
                        if (new HashSet(vxzVar4.e(1, 45390369L).b).contains(Integer.valueOf(arkfVar5.z)) || !zA) {
                            vscVar = this;
                            aeho.m(abteVar2, 12, aegsVar.r, str14, aeho.f(str14, aegsVar.A), false);
                            aeho.g(Uri.parse(str14), context);
                            agke agkeVarN2 = agke.n(set);
                            int size2 = agkeVarN2.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                ((aego) agkeVarN2.get(i11)).c();
                            }
                            webView = aegsVar.m;
                        } else {
                            aegsVar.x = false;
                            if (aegsVar.v.equals(str14)) {
                                aegsVar.w++;
                            } else {
                                aegsVar.v = str14;
                                aegsVar.w = 1;
                            }
                            loadingFrameLayout.g(0);
                            loadingFrameLayout.c();
                            if ((arkmVar3.b & 2097152) != 0) {
                                vxe vxeVar7 = aegsVar.B;
                                ajwoVar2 = arkmVar3.z;
                                if (ajwoVar2 == null) {
                                    ajwoVar2 = ajwo.a;
                                }
                                vxeVar7.a(ajwoVar2);
                            }
                            wbz wbzVar2 = aegsVar.b;
                            wbyVarB = wbzVar2.b(zwaVarE2);
                            if (!arkmVar3.i.isEmpty()) {
                                arkc arkcVarAn2 = arkc.e(arkmVar3.i).an();
                                wer werVarE2 = wbyVarB.e();
                                werVarE2.e(arkcVarAn2);
                                werVarE2.b();
                            }
                            xir xirVar4 = aegsVar.n;
                            Set set3 = aegsVar.A;
                            vxe vxeVar8 = aegsVar.B;
                            acwd acwdVar2 = aegsVar.h;
                            boolean zL2 = aegsVar.F.l(64, 45763769L, true);
                            agpr agprVar2 = agpr.a;
                            vscVar = this;
                            aegc aegcVar2 = new aegc(wbyVarB, xirVar4, abteVar2, xgnVar2, arkmVar3, set3, agprVar2, vxeVar8, acwdVar2, zL2, null);
                            AtomicReference atomicReference2 = new AtomicReference();
                            atomicReference2.set(Boolean.FALSE);
                            aegq aegqVar2 = new aegq(aegsVar, loadingFrameLayout, atomicReference2, str14, arkmVar);
                            arkmVar3 = arkmVar;
                            aegcVar2.a(aegqVar2);
                            aegsVar.m.setWebViewClient(aegcVar2);
                            wby wbyVarB4 = wbzVar2.b(zwaVarE2);
                            String str17 = arkmVar3.i;
                            iBt = a.bt(arkmVar3.l);
                            if (iBt == 0) {
                                i = 1;
                            } else {
                                i = iBt;
                            }
                            aegsVar.m.setWebChromeClient(new aega(wbyVarB4, str17, i, acwdVar2, context, agprVar2));
                            if (!aeho.f(str14, aegsVar.A)) {
                                if (!DesugarCollections.unmodifiableMap(arkmVar3.J).isEmpty()) {
                                    aeho.f(str14, aegsVar.A);
                                    if (!dvy.a("WEB_MESSAGE_LISTENER")) {
                                        ajwoVar = arkmVar3.u;
                                        if (ajwoVar == null) {
                                            ajwoVar = ajwo.a;
                                        }
                                        aegsVar.B.a(aeho.b(ajwoVar, aegsVar.r, aegsVar.s));
                                    }
                                }
                            } else if (!DesugarCollections.unmodifiableMap(arkmVar3.J).isEmpty()) {
                                aeho.f(str14, aegsVar.A);
                                if (!dvy.a("WEB_MESSAGE_LISTENER")) {
                                    ajwoVar = arkmVar3.u;
                                    if (ajwoVar == null) {
                                        ajwoVar = ajwo.a;
                                    }
                                    aegsVar.B.a(aeho.b(ajwoVar, aegsVar.r, aegsVar.s));
                                }
                            }
                            taf.n(aegsVar.g.submit(afwl.j(new aalq(aegsVar, zwaVarE2, 11, null))), aegsVar.f, new gst(aegsVar, str14, arkmVar3, zwaVarE2, 10));
                            aegsVar.m.addOnAttachStateChangeListener(new aegz(1));
                            webView = aegsVar.m;
                        }
                    }
                }
                if (webView != null) {
                    Map map = vscVar.o;
                    arkf arkfVarA6 = arkf.a(arkmVar3.v);
                    if (arkfVarA6 == null) {
                        arkfVarA6 = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
                    }
                    awmd awmdVar = (awmd) map.get(arkfVarA6);
                    if (awmdVar != null) {
                        ((vsp) awmdVar.io()).b(webView);
                    }
                    WebSettings settings2 = webView.getSettings();
                    if (settings2 != null) {
                        settings2.setAllowFileAccess(false);
                        settings2.setAllowContentAccess(false);
                    }
                    FrameLayout frameLayout3 = vscVar.i;
                    frameLayout3.getClass();
                    frameLayout3.addView(webView);
                }
                z3 = true;
            }
            vscVar.k = z3;
        }
    }

    @Override // defpackage.vro
    public final boolean s() {
        return false;
    }

    @Override // defpackage.vro
    public final boolean t() {
        return false;
    }

    @Override // defpackage.adwm
    public final boolean v(String str, int i, Runnable runnable) {
        return false;
    }

    @Override // defpackage.vox
    public final void b() {
    }

    @Override // defpackage.vro
    public final void hP() {
    }

    @Override // defpackage.vro
    public final void o() {
    }

    @Override // defpackage.vro
    public final void q() {
    }

    @Override // defpackage.vro
    public final void r() {
    }

    @Override // defpackage.vro
    public final void n(acjx acjxVar) {
    }
}

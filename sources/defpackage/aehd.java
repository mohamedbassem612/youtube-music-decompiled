package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehd {
    private final mbc A;
    private final acwd B;
    private final awmd C;
    private ListenableFuture D;
    private xir E;
    private boolean F;
    private long G;
    private aehg I;
    private final vxz J;
    private final lqa K;
    public final awmd a;
    public final ttm b;
    public final ahey c;
    public final ahex d;
    public final aeid e;
    public final zvl f;
    public String g;
    public aeiy h;
    public WebView i;
    public LoadingFrameLayout j;
    public xgn k;
    public arkm l;
    public zwa m;
    public arkf n;
    public boolean o;
    public String p;
    public Set q;
    public Set r;
    public aehi s;
    public final aeiv u;
    public final vxz v;
    public final abte w;
    public final aciz x;
    private final wbz y;
    private final xit z;
    private vxe H = vxe.d;
    public boolean t = false;

    public aehd(lqa lqaVar, awmd awmdVar, wbz wbzVar, vxz vxzVar, abte abteVar, xit xitVar, ttm ttmVar, mbc mbcVar, aciz acizVar, ahex ahexVar, ahey aheyVar, acwd acwdVar, aeid aeidVar, awmd awmdVar2, vxz vxzVar2, aeiv aeivVar, zvl zvlVar) {
        int i = aegw.a;
        this.K = lqaVar;
        this.a = awmdVar;
        this.y = wbzVar;
        this.v = vxzVar;
        this.w = abteVar;
        this.z = xitVar;
        this.b = ttmVar;
        this.A = mbcVar;
        this.x = acizVar;
        this.d = ahexVar;
        this.c = aheyVar;
        this.B = acwdVar;
        this.e = aeidVar;
        this.C = awmdVar2;
        this.J = vxzVar2;
        this.u = aeivVar;
        this.f = zvlVar;
        this.G = 0L;
        this.n = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
        this.o = false;
        this.p = "";
        this.q = new HashSet();
        this.r = new HashSet();
        this.h = null;
    }

    private final boolean m() {
        if (!this.m.h()) {
            arkm arkmVar = this.l;
            if ((arkmVar.b & 32) != 0) {
                arkp arkpVar = arkmVar.m;
                if (arkpVar == null) {
                    arkpVar = arkp.a;
                }
                int iAS = a.aS(arkpVar.b);
                if (iAS != 0 && iAS == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean n() {
        if (dvy.a("MULTI_PROFILE")) {
            arkm arkmVar = this.l;
            if ((arkmVar.b & 32) != 0) {
                arkp arkpVar = arkmVar.m;
                if (arkpVar == null) {
                    arkpVar = arkp.a;
                }
                int iAS = a.aS(arkpVar.b);
                if (iAS != 0 && iAS != 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean o() {
        aehi aehiVar = this.s;
        if (aehiVar != null) {
            return aehiVar.o();
        }
        return true;
    }

    public final void a() {
        aehi aehiVar = this.s;
        if (aehiVar != null) {
            aehiVar.e();
        }
        e();
    }

    public final void b() {
        WebView webView = this.i;
        if (webView == null || !(webView.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.i.getParent()).removeView(this.i);
    }

    public final void c() {
        LoadingFrameLayout loadingFrameLayout = this.j;
        boolean z = false;
        if (loadingFrameLayout != null && loadingFrameLayout.d != 2) {
            z = true;
        }
        if (loadingFrameLayout != null) {
            loadingFrameLayout.g(2);
        }
        if (!z || this.k == null) {
            return;
        }
        amud amudVar = this.l.A;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        if ((amudVar.c & 1) != 0) {
            xgn xgnVar = this.k;
            amud amudVar2 = this.l.A;
            if (amudVar2 == null) {
                amudVar2 = amud.b;
            }
            xgnVar.w(new xgj(amudVar2.d, (amud) null), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0253  */
    /* JADX WARN: Code duplicated, block: B:146:0x0340  */
    /* JADX WARN: Code duplicated, block: B:86:0x0235  */
    /* JADX WARN: Code duplicated, block: B:89:0x023c  */
    /* JADX WARN: Code duplicated, block: B:90:0x023f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0247  */
    /* JADX WARN: Code duplicated, block: B:97:0x024d  */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.Map] */
    public final void d(Context context, arkm arkmVar, ViewGroup viewGroup, zwa zwaVar, vxe vxeVar, aehe aeheVar) {
        String str;
        ahub ahubVar;
        long jA;
        boolean zA;
        HashSet hashSet;
        int i;
        boolean z;
        aehi aehiVar;
        int iAU;
        dvr dvsVar;
        ahub ahubVar2;
        int iAV;
        String str2;
        String str3;
        aehi aehiVar2;
        arko arkoVar;
        arko arkoVar2;
        ajwo ajwoVar;
        arkm arkmVar2 = this.l;
        if (arkmVar2 != null) {
            arkf arkfVarA = arkf.a(arkmVar2.v);
            if (arkfVarA == null) {
                arkfVarA = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
            }
            if (arkfVarA != arkf.WEB_VIEW_USE_CASE_SHOPPING_PRODUCT_DETAILS) {
                throw new IllegalStateException("initAndLoad has already been called.");
            }
            abte abteVar = this.w;
            arkf arkfVarA2 = arkf.a(arkmVar.v);
            if (arkfVarA2 == null) {
                arkfVarA2 = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
            }
            aeho.m(abteVar, 9, arkfVarA2, "", false, false);
            b();
        }
        vxz vxzVar = this.v;
        int i2 = 8;
        this.t = vxzVar.m(8, 45798904L);
        this.s = aeheVar.a;
        this.l = arkmVar;
        aeiv aeivVar = this.u;
        arkf arkfVarA3 = arkf.a(arkmVar.v);
        if (arkfVarA3 == null) {
            arkfVarA3 = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
        }
        aeivVar.c = arkfVarA3;
        adyu adyuVar = new adyu(arkfVarA3, 6);
        Optional optional = (Optional) aeivVar.b;
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = adyuVar.a;
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            aihf aihfVarCreateBuilder2 = amjm.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            amjm amjmVar = (amjm) aihfVarCreateBuilder2.instance;
            amjmVar.c = ((arkf) obj2).z;
            amjmVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            amjm amjmVar2 = (amjm) aihfVarCreateBuilder2.build();
            amjmVar2.getClass();
            amiuVar.V = amjmVar2;
            amiuVar.d |= 33554432;
            ((xir) obj).h((amiu) aihfVarCreateBuilder.build());
        }
        this.H = vxeVar;
        this.m = zwaVar;
        aehi aehiVar3 = this.s;
        if (aehiVar3 != null) {
            aehiVar3.f();
        }
        arkf arkfVarA4 = arkf.a(arkmVar.v);
        if (arkfVarA4 == null) {
            arkfVarA4 = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
        }
        this.n = arkfVarA4;
        this.G = this.A.b();
        abte abteVar2 = this.w;
        aeho.j(2, this.n, "", false, false, -1, Optional.of(Long.valueOf(aeho.k(context))), new adsk(abteVar2, 4));
        xir xirVar = aeheVar.d;
        if (xirVar != null) {
            this.E = xirVar;
            xirVar.k();
        } else {
            this.E = this.z.n(184);
        }
        aihf aihfVarCreateBuilder3 = amiu.a.createBuilder();
        aihf aihfVarCreateBuilder4 = amjm.a.createBuilder();
        arkf arkfVar = this.n;
        aihfVarCreateBuilder4.copyOnWrite();
        amjm amjmVar3 = (amjm) aihfVarCreateBuilder4.instance;
        amjmVar3.c = arkfVar.z;
        amjmVar3.b |= 1;
        amjm amjmVar4 = (amjm) aihfVarCreateBuilder4.build();
        aihfVarCreateBuilder3.copyOnWrite();
        amiu amiuVar2 = (amiu) aihfVarCreateBuilder3.instance;
        amjmVar4.getClass();
        amiuVar2.V = amjmVar4;
        amiuVar2.d |= 33554432;
        aehi aehiVar4 = this.s;
        if (aehiVar4 != null) {
            aehiVar4.t(aihfVarCreateBuilder3);
        }
        this.E.h((amiu) aihfVarCreateBuilder3.build());
        int i3 = arkmVar.d;
        boolean z2 = i3 == 1;
        if (z2) {
            agxz agxzVarF = agvp.f((agya) arkmVar.e);
            str = agxzVarF.a;
            ahubVar = new ahub(agxzVarF);
        } else {
            str = i3 == 14 ? (String) arkmVar.e : "";
            ahubVar = null;
        }
        arko arkoVar3 = this.l.D;
        if (arkoVar3 == null) {
            arkoVar3 = arko.a;
        }
        if ((arkoVar3.b & 1) != 0) {
            arko arkoVar4 = this.l.D;
            if (arkoVar4 == null) {
                arkoVar4 = arko.a;
            }
            jA = arkoVar4.c;
        } else {
            jA = 0;
        }
        aehi aehiVar5 = this.s;
        if (aehiVar5 != null) {
            jA = aehiVar5.a(jA);
        }
        if (jA > 0) {
            if (aeho.k(context) < jA) {
                str2 = str;
                aeho.m(abteVar2, 16, this.n, str2, aeho.f(str, this.r), false);
            }
            str3 = str2;
            aehiVar2 = this.s;
            if (aehiVar2 != null) {
                aehiVar2.m();
            }
            arkoVar = arkmVar.D;
            if (arkoVar == null) {
                arkoVar2 = arko.a;
            } else {
                arkoVar2 = arkoVar;
            }
            if ((arkoVar2.b & 2) != 0) {
                aeho.g(Uri.parse(str3), context);
                return;
            }
            if (arkoVar == null) {
                arkoVar = arko.a;
            }
            ajwoVar = arkoVar.d;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            h(ajwoVar);
            return;
        }
        String str4 = str;
        aeho.m(abteVar2, 17, this.n, str4, aeho.f(str, this.r), false);
        str = str4;
        if (dvy.a("MULTI_PROCESS")) {
            zA = dva.a();
        } else {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            zA = Build.VERSION.SDK_INT >= 30 || !(Build.SUPPORTED_64_BIT_ABIS.length == 0 && activityManager != null && activityManager.isLowRamDevice());
        }
        if (!zA) {
            str2 = str;
            aeho.m(abteVar2, 18, this.n, str2, aeho.f(str, this.r), false);
            str3 = str2;
            aehiVar2 = this.s;
            if (aehiVar2 != null) {
                aehiVar2.m();
            }
            arkoVar = arkmVar.D;
            if (arkoVar == null) {
                arkoVar2 = arko.a;
            } else {
                arkoVar2 = arkoVar;
            }
            if ((arkoVar2.b & 2) != 0) {
                aeho.g(Uri.parse(str3), context);
                return;
            }
            if (arkoVar == null) {
                arkoVar = arko.a;
            }
            ajwoVar = arkoVar.d;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            h(ajwoVar);
            return;
        }
        if (vxzVar.m(6, 45798902L) && (iAV = a.aV(arkmVar.j)) != 0 && iAV == 3) {
            agkx agkxVar = new agkx();
            agkxVar.c(str);
            aehi aehiVar6 = this.s;
            if (aehiVar6 != null) {
                agkxVar.j(aehiVar6.b());
            }
            this.D = ((aegh) this.a.io()).d(agkxVar.g(), zwaVar, this.E);
        }
        ListenableFuture listenableFutureAs = n() ? ahno.as(((axlj) this.C.io()).k(zwaVar), new hoy(this, m(), i2), this.c) : null;
        this.K.a.put(arkmVar.h, this);
        if ((arkmVar.b & SemanticState.Focused) != 0) {
            ajwo ajwoVar2 = arkmVar.o;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            h(ajwoVar2);
        }
        if (z2) {
            hashSet = new HashSet();
            hashSet.addAll(this.l.y);
        } else {
            hashSet = new HashSet();
        }
        this.r = hashSet;
        String str5 = str;
        HashSet hashSet2 = new HashSet();
        arkm arkmVar3 = this.l;
        if ((arkmVar3.b & 67108864) != 0) {
            arko arkoVar5 = arkmVar3.D;
            if (arkoVar5 == null) {
                arkoVar5 = arko.a;
            }
            for (arkh arkhVar : arkoVar5.f) {
                if ((arkhVar.b & 1) != 0) {
                    hashSet2.add(arkhVar.c);
                }
            }
        }
        xgn xgnVar = aeheVar.c;
        if (xgnVar != null) {
            this.k = xgnVar;
        }
        this.F = false;
        ahub ahubVar3 = ahubVar;
        if (!vxzVar.m(12, 45834315L) || (arkmVar.b & 536870912) == 0) {
            g();
        } else {
            arkg arkgVar = arkmVar.G;
            if (arkgVar == null) {
                arkgVar = arkg.a;
            }
            if (!arkgVar.b) {
                g();
            }
        }
        WebView webView = new WebView(context);
        this.i = webView;
        webView.setRendererPriorityPolicy(1, true);
        if (ahubVar3 != null) {
            aehi aehiVar7 = this.s;
            if (aehiVar7 != null) {
                ahubVar2 = ahubVar3;
                aehiVar7.u(ahubVar2, this.i.getSettings());
            } else {
                ahubVar2 = ahubVar3;
            }
            str5 = ahubVar2.e().a;
        }
        String str6 = str5;
        WebView webView2 = this.i;
        WebView.setWebContentsDebuggingEnabled(vxzVar.m(2, 45739651L));
        webView2.setScrollBarStyle(33554432);
        webView2.setScrollbarFadingEnabled(false);
        WebSettings settings = webView2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(2);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        webView2.setDownloadListener(new aehb(context, 0));
        WebView webView3 = this.i;
        WebSettings settings2 = webView3.getSettings();
        if ((arkmVar.b & Integer.MIN_VALUE) != 0) {
            settings2.setUserAgentString(settings2.getUserAgentString() + ' ' + arkmVar.H);
        }
        if (dvy.a("PAYMENT_REQUEST") && (iAU = a.aU(arkmVar.E)) != 0 && iAU == 2) {
            if (!dvy.i.d()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            try {
                dvsVar = new dvr((WebSettingsBoundaryInterface) axsn.a(WebSettingsBoundaryInterface.class, dvz.a.a.convertSettings(settings2)));
            } catch (ClassCastException e) {
                if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(settings2.getClass().getCanonicalName())) {
                    throw e;
                }
                Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
                dvsVar = new dvs();
            }
            dvsVar.a();
        }
        int iBt = a.bt(arkmVar.l);
        if (iBt == 0) {
            z = true;
            i = 6;
        } else {
            i = 6;
            z = iBt != 6;
        }
        settings2.setSupportMultipleWindows(z);
        if (arkmVar.F && (aehiVar = this.s) != null) {
            webView3.setOnTouchListener(new aehl(context, aehiVar));
        }
        this.o = false;
        LoadingFrameLayout loadingFrameLayout = aeheVar.b;
        this.j = loadingFrameLayout;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.g(0);
            this.j.c();
        }
        if ((arkmVar.b & 2097152) != 0) {
            ajwo ajwoVar3 = arkmVar.z;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            vxeVar.a(ajwoVar3);
        }
        wbz wbzVar = this.y;
        int i4 = i;
        wby wbyVarB = wbzVar.e(zwaVar);
        if (!arkmVar.i.isEmpty()) {
            arkc arkcVarAn = arkc.e(arkmVar.i).an();
            wer werVarE = wbyVarB.e();
            werVarE.e(arkcVarAn);
            werVarE.b();
        }
        xir xirVar2 = this.E;
        Set set = this.r;
        acwd acwdVar = this.B;
        aegc aegcVar = new aegc(wbyVarB, xirVar2, abteVar2, xgnVar, arkmVar, set, hashSet2, vxeVar, acwdVar, this.J.l(64, 45763769L, true), this.s);
        aehg aehgVar = this.I;
        if (aehgVar != null) {
            aehgVar.a();
        }
        wby wbyVarB2 = wbzVar.e(zwaVar);
        String str7 = arkmVar.i;
        int iBt2 = a.bt(arkmVar.l);
        if (iBt2 == 0) {
            iBt2 = 1;
        }
        arkf arkfVar2 = this.n;
        int i5 = iBt2;
        Set set2 = this.r;
        arko arkoVar6 = arkmVar.D;
        if (arkoVar6 == null) {
            arkoVar6 = arko.a;
        }
        ListenableFuture listenableFuture = listenableFutureAs;
        aehg aehgVar2 = new aehg(wbyVarB2, str7, i5, acwdVar, context, abteVar2, vxzVar, arkfVar2, set2, hashSet2, arkoVar6, new abzk(this, i4), new abzk(this, 7), new abzk(this, 8));
        this.I = aehgVar2;
        this.i.setWebChromeClient(aehgVar2);
        AtomicReference atomicReference = new AtomicReference();
        atomicReference.set(Boolean.FALSE);
        aegcVar.a(new aegy(this, aehgVar2, atomicReference, str6, arkmVar));
        this.i.setWebViewClient(aegcVar);
        this.i.setOnScrollChangeListener(new aegx());
        if (aeho.f(str6, this.r) && dvy.a("WEB_MESSAGE_LISTENER") && (arkmVar.b & 64) != 0) {
            WebView webView4 = this.i;
            Uri uri = Uri.parse(str6);
            agkx agkxVar2 = new agkx();
            if (vxzVar.m(3, 45760258L)) {
                Iterator it = this.r.iterator();
                while (it.hasNext()) {
                    agkxVar2.c("https://".concat(String.valueOf((String) it.next())));
                }
            }
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (scheme != null && host != null) {
                agkxVar2.c(a.cd(host, scheme, "://"));
            }
            aedi.k(webView4, this.l.n, agkxVar2.g(), new aehc(this));
        } else if (!DesugarCollections.unmodifiableMap(arkmVar.J).isEmpty()) {
            aeho.f(str6, this.r);
            if (!dvy.a("WEB_MESSAGE_LISTENER") && (arkmVar.b & 16384) != 0) {
                ajwo ajwoVar4 = arkmVar.u;
                if (ajwoVar4 == null) {
                    ajwoVar4 = ajwo.a;
                }
                h(ajwoVar4);
            }
        }
        this.i.addOnAttachStateChangeListener(new aegz(0));
        if (listenableFuture != null) {
            ahno.at(listenableFuture, new aeha(this, m(), str6, zwaVar, viewGroup), this.c);
            return;
        }
        int iAV2 = a.aV(this.l.j);
        if (iAV2 == 0) {
            iAV2 = 1;
        }
        k(str6, zwaVar, iAV2);
        i(viewGroup);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    final void e() {
        aeiy aeiyVar;
        boolean z = this.e.a;
        byte[] bArr = null;
        if (n() && (aeiyVar = this.h) != null) {
            int i = 20;
            if (m()) {
                ahno.aq(new iud(aeiyVar, i), aeiyVar.a);
            } else {
                String str = this.g;
                if (str != null) {
                    taf.i(ahno.aq(new wan(aeiyVar, str, 10, bArr), aeiyVar.b), this.c, new wuy(this, i), new yqj(this, 18), null);
                }
            }
        }
        xir xirVar = this.E;
        if (xirVar != null) {
            if (!this.o) {
                xirVar.n("gw_d");
                abte abteVar = this.w;
                arkf arkfVar = this.n;
                String str2 = this.p;
                aeho.m(abteVar, 51, arkfVar, str2, aeho.f(str2, this.r), this.o);
            }
            this.E.n("aa");
        }
        if (!this.o) {
            aeho.i(this.k, this.l, 33, null, this.J.l(64, 45763769L, true));
        }
        aeho.i(this.k, this.l, 32, null, this.J.l(64, 45763769L, true));
        abte abteVar2 = this.w;
        arkf arkfVar2 = this.n;
        String str3 = this.p;
        aeho.n(abteVar2, arkfVar2, str3, aeho.f(str3, this.r), this.o, (int) ((this.A.b() - this.G) / 1000));
        Map.EL.remove(this.K.a, this.l.h, this);
        b();
        aehg aehgVar = this.I;
        if (aehgVar != null) {
            aehgVar.a();
            this.I = null;
        }
        WebView webView = this.i;
        if (webView != null) {
            webView.destroy();
        }
        this.i = null;
        this.j = null;
        this.G = 0L;
        this.n = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
        this.o = false;
        this.p = "";
        this.q = new HashSet();
        this.r = new HashSet();
        this.h = null;
        this.F = false;
    }

    public final void f(String str) {
        if (str != null) {
            if (this.m.l().isEmpty() || this.i == null || !o()) {
                WebView webView = this.i;
                if (webView != null) {
                    webView.loadUrl(str);
                    return;
                }
                return;
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("pageId", this.m.l());
            String string = builderBuildUpon.toString();
            zwa zwaVar = this.m;
            HashMap map = new HashMap();
            if (!zwaVar.l().isEmpty() && o()) {
                map.put("X-Goog-PageId", zwaVar.l());
            }
            this.i.loadUrl(string, map);
        }
    }

    public final void g() {
        arkm arkmVar;
        if (this.F || this.k == null || (arkmVar = this.l) == null) {
            return;
        }
        amud amudVar = arkmVar.A;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        if ((amudVar.c & 1) != 0) {
            amud amudVar2 = this.l.A;
            if (amudVar2 == null) {
                amudVar2 = amud.b;
            }
            this.k.l(new xgj(amudVar2.d, (amud) null));
            this.F = true;
        }
    }

    public final void h(ajwo ajwoVar) {
        aehi aehiVar = this.s;
        if (aehiVar != null) {
            ajwoVar = aehiVar.c(ajwoVar);
        }
        this.H.a(ajwoVar);
    }

    public final void i(ViewGroup viewGroup) {
        WebView webView = this.i;
        if (webView == null || webView.getParent() != null) {
            return;
        }
        viewGroup.addView(this.i);
    }

    public final void j(boolean z) {
        if (this.i == null || !dvy.a("MUTE_AUDIO")) {
            return;
        }
        if (Looper.getMainLooper().isCurrentThread()) {
            aedi.g(this.i, z);
        } else {
            this.c.execute(afwl.i(new csd(this, z, 16)));
        }
    }

    public final void k(String str, zwa zwaVar, int i) {
        taf.n(this.d.submit(afwl.j(new aalq(this, zwaVar, 12, null))), this.c, new aegv(this, str, i, 0));
    }

    public final void l(String str, dvo dvoVar, int i) {
        String str2;
        WebView webView;
        int i2 = 3;
        try {
            if (i != 3) {
                str2 = str;
                if (i == 4 && !str2.isEmpty() && this.i != null) {
                    awmd awmdVar = this.a;
                    aegg aeggVarB = ((aegh) awmdVar.io()).b(this.m);
                    if (aeggVarB != null) {
                        ((aegh) awmdVar.io()).p(aeggVarB, this.m, dvoVar);
                    }
                    this.i.loadUrl(str2);
                    return;
                }
            } else {
                if (!str.isEmpty()) {
                    if (this.m != null) {
                        ListenableFuture listenableFuture = this.D;
                        if (listenableFuture != null) {
                            this.D = null;
                            ahno.at(listenableFuture, new hqd((Object) this, (Object) dvoVar, str, 8), this.c);
                            return;
                        }
                        if (dvoVar != null) {
                            String strC = dvoVar.c();
                            agkz agkzVar = aeho.a;
                            if (!Objects.equals(strC, "Default")) {
                                agkx agkxVar = new agkx();
                                agkxVar.c(str);
                                aehi aehiVar = this.s;
                                if (aehiVar != null) {
                                    agkxVar.j(aehiVar.b());
                                }
                                ahno.at(((aegh) this.a.io()).n(agkxVar.g(), this.m, dvoVar, this.E), new hhi(this, str, 12), this.c);
                                return;
                            }
                        }
                        ((aegh) this.a.io()).j(str, this.m, this.n, this.E, this.k, this.l, new adxm(this, i2));
                        return;
                    }
                    return;
                }
                str2 = str;
            }
            if (str2.isEmpty() || (webView = this.i) == null) {
                return;
            }
            webView.loadUrl(str2);
        } catch (RuntimeException e) {
            zvp.b(zvn.b, zvm.af, "RuntimeException while calling WebView#loadUrl: ".concat(String.valueOf(e.getMessage() == null ? "no error message" : e.getMessage())), e);
        }
    }
}

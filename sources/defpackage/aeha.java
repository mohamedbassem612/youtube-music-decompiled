package defpackage;

import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeha implements aheh {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ zwa c;
    final /* synthetic */ ViewGroup d;
    final /* synthetic */ aehd e;

    public aeha(aehd aehdVar, boolean z, String str, zwa zwaVar, ViewGroup viewGroup) {
        this.a = z;
        this.b = str;
        this.c = zwaVar;
        this.d = viewGroup;
        this.e = aehdVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        aehd aehdVar = this.e;
        aehdVar.u.d(41);
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 58;
        zvjVarA.d("WebView profile creation failed");
        zvjVarA.f(th);
        aehdVar.f.a(zvjVarA.a());
        int iAV = a.aV(aehdVar.l.j);
        if (iAV == 0) {
            iAV = 1;
        }
        aehdVar.k(this.b, this.c, iAV);
        aehdVar.i(this.d);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface] */
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        final dvo dvoVar = (dvo) obj;
        if (dvoVar != null) {
            try {
                aehd aehdVar = this.e;
                WebView webView = aehdVar.i;
                String strC = dvoVar.c();
                int i = dva.a;
                if (!dvy.e.d()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                dva.b(webView).a.setProfile(strC);
                if (!this.a) {
                    aehdVar.g = dvoVar.c();
                }
                aeiv aeivVar = aehdVar.u;
                aeivVar.d(26);
                aeivVar.c("ds_ac");
                if (this.a) {
                    aehd aehdVar2 = this.e;
                    String str = this.b;
                    int iAV = a.aV(aehdVar2.l.j);
                    aehdVar2.l(str, dvoVar, iAV != 0 ? iAV : 1);
                } else {
                    final aehd aehdVar3 = this.e;
                    if (aehdVar3.t) {
                        final String str2 = this.b;
                        int iAV2 = a.aV(aehdVar3.l.j);
                        final int i2 = iAV2 != 0 ? iAV2 : 1;
                        taf.n(aehdVar3.d.submit(afwl.j(new aegt(dvoVar, 0))), aehdVar3.c, new tae() { // from class: aegu
                            @Override // defpackage.tae, defpackage.twi
                            public final void a(Object obj2) {
                                WebView webView2;
                                aehd aehdVar4 = aehdVar3;
                                if (!aehdVar4.v.m(9, 45810489L) && (webView2 = aehdVar4.i) != null) {
                                    webView2.clearCache(true);
                                }
                                aehdVar4.l(str2, dvoVar, i2);
                            }
                        });
                    } else {
                        aehd aehdVar4 = this.e;
                        String str3 = this.b;
                        int iAV3 = a.aV(aehdVar4.l.j);
                        aehdVar4.l(str3, dvoVar, iAV3 != 0 ? iAV3 : 1);
                    }
                }
                this.e.i(this.d);
            } catch (RuntimeException e) {
                aehd aehdVar5 = this.e;
                aehdVar5.u.d(47);
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 58;
                zvjVarA.d("WebView.setProfile failed");
                zvjVarA.f(e);
                aehdVar5.f.a(zvjVarA.a());
                aehdVar5.g = null;
                aehd aehdVar6 = this.e;
                String str4 = this.b;
                zwa zwaVar = this.c;
                int iAV4 = a.aV(aehdVar6.l.j);
                aehdVar6.k(str4, zwaVar, iAV4 != 0 ? iAV4 : 1);
            }
        } else {
            this.e.u.d(40);
        }
        aehd aehdVar7 = this.e;
        String str5 = this.b;
        zwa zwaVar2 = this.c;
        int iAV5 = a.aV(aehdVar7.l.j);
        aehdVar7.k(str5, zwaVar2, iAV5 != 0 ? iAV5 : 1);
        this.e.i(this.d);
    }
}

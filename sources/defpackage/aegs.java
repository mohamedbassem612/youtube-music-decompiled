package defpackage;

import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aegs {
    public Set A;
    public final vxz C;
    public final vxz D;
    public final vxz E;
    public final vxz F;
    public final vxz G;
    public final abte H;
    public final ahnz I;
    public final ahqj J;
    public final aciz K;
    private final aeid L;
    public final awmd a;
    public final wbz b;
    public final xit c;
    public final ttm d;
    public final mbc e;
    public final ahey f;
    public final ahex g;
    public final acwd h;
    public final xeu j;
    public final zvl k;
    public boolean l;
    public WebView m;
    public xir n;
    public xgn o;
    public arkm p;
    public long q;
    public arkf r;
    public anhh s;
    public String t;
    public amdd u;
    public String v;
    public int w;
    public boolean x;
    public String y;
    public Set z;
    public final Set i = new HashSet();
    public vxe B = vxe.d;

    public aegs(awmd awmdVar, wbz wbzVar, abte abteVar, xit xitVar, ttm ttmVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, vxz vxzVar4, mbc mbcVar, aciz acizVar, ahex ahexVar, ahey aheyVar, acwd acwdVar, aeid aeidVar, ahqj ahqjVar, ahnz ahnzVar, xeu xeuVar, zvl zvlVar, vxz vxzVar5) {
        int i = aegw.a;
        this.a = awmdVar;
        this.b = wbzVar;
        this.H = abteVar;
        this.c = xitVar;
        this.d = ttmVar;
        this.C = vxzVar;
        this.D = vxzVar2;
        this.E = vxzVar3;
        this.F = vxzVar4;
        this.e = mbcVar;
        this.K = acizVar;
        this.g = ahexVar;
        this.f = aheyVar;
        this.h = acwdVar;
        this.L = aeidVar;
        this.J = ahqjVar;
        this.I = ahnzVar;
        this.j = xeuVar;
        this.k = zvlVar;
        this.G = vxzVar5;
        this.q = 0L;
        this.r = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
        this.s = anhh.a;
        this.t = "";
        this.v = "";
        this.w = 0;
        this.x = false;
        this.y = "";
        this.z = new HashSet();
        this.A = new HashSet();
    }

    public final void a() {
        WebView webView = this.m;
        if (webView == null || webView.getParent() == null) {
            return;
        }
        ((ViewGroup) this.m.getParent()).removeView(this.m);
    }

    public final void b(String str, vxe vxeVar, List list) {
        if (this.m == null || !this.v.contains(str)) {
            return;
        }
        int i = this.w - 1;
        this.w = i;
        if (i <= 0) {
            boolean z = this.L.a;
            xir xirVar = this.n;
            if (xirVar != null) {
                if (!this.x) {
                    xirVar.n("gw_d");
                }
                this.n.n("aa");
                if (this.r == arkf.WEB_VIEW_USE_CASE_GAMEPLAY_MINI_APP) {
                    this.c.g().c(184);
                }
            }
            if (!this.x) {
                aeho.i(this.o, this.p, 33, null, this.F.l(64, 45763769L, true));
            }
            aeho.i(this.o, this.p, 32, null, this.F.l(64, 45763769L, true));
            abte abteVar = this.H;
            arkf arkfVar = this.r;
            String str2 = this.y;
            aeho.n(abteVar, arkfVar, str2, aeho.f(str2, this.A), this.x, (int) ((this.e.b() - this.q) / 1000));
            a();
            WebView webView = this.m;
            if (webView != null) {
                webView.destroy();
            }
            this.m = null;
            this.q = 0L;
            this.r = arkf.WEB_VIEW_USE_CASE_UNSPECIFIED;
            this.x = false;
            this.v = "";
            this.w = 0;
            this.p = null;
            this.u = null;
            this.l = false;
            if (vxeVar != null && list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arkq arkqVar = (arkq) it.next();
                    int i2 = 0;
                    for (String str3 : arkqVar.c) {
                        Iterator it2 = this.z.iterator();
                        while (it2.hasNext()) {
                            if (((String) it2.next()).contains(str3)) {
                                i2++;
                                break;
                            }
                        }
                    }
                    boolean z2 = false;
                    for (String str4 : arkqVar.d) {
                        Iterator it3 = this.z.iterator();
                        while (it3.hasNext()) {
                            if (((String) it3.next()).contains(str4)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    if ((arkqVar.b & 1) != 0 && !z2 && i2 == arkqVar.c.size()) {
                        ajwo ajwoVar = arkqVar.e;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        vxeVar.a(ajwoVar);
                    }
                }
            }
            this.y = "";
            this.z = new HashSet();
            this.A = new HashSet();
        }
    }

    public final void c() {
        arkm arkmVar;
        if (this.l || this.o == null || (arkmVar = this.p) == null) {
            return;
        }
        amud amudVar = arkmVar.A;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        if ((amudVar.c & 1) != 0) {
            amud amudVar2 = this.p.A;
            if (amudVar2 == null) {
                amudVar2 = amud.b;
            }
            xgj xgjVar = new xgj(amudVar2.d, (amud) null);
            this.o.l(xgjVar);
            amdd amddVar = this.u;
            if (amddVar != null) {
                this.o.A(xgjVar, amddVar);
            }
            this.l = true;
        }
    }
}

package defpackage;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.rive.semantics.SemanticState;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class vta extends vmz implements adww, srj {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/engagementpanel/shared/AbstractCommentRepliesEngagementPanel");
    protected final aczl A;
    private vpk B;
    protected final wom b;
    protected final ttm c;
    protected final srh d;
    protected final Executor h;
    public final vxe i;
    protected final tts j;
    protected final awmd k;
    protected final vyo l;
    public SwipeRefreshLayout m;
    protected adwj n;
    public adwg o;
    protected Set p;
    public View q;
    public vnx r;
    public ajwo s;
    public boolean t;
    public boolean u;
    protected boolean v;
    protected final vxz w;
    protected final lqa x;
    protected final nsg y;
    protected final axfd z;

    protected vta(wom womVar, ttm ttmVar, srh srhVar, Executor executor, xgn xgnVar, vxe vxeVar, tts ttsVar, aczl aczlVar, awmd awmdVar, lqa lqaVar, nsg nsgVar, vyo vyoVar, axfd axfdVar, vxz vxzVar) {
        super(xgnVar);
        this.b = womVar;
        this.c = ttmVar;
        this.d = srhVar;
        this.h = executor;
        this.i = vxeVar;
        this.j = ttsVar;
        this.A = aczlVar;
        this.k = awmdVar;
        this.x = lqaVar;
        this.y = nsgVar;
        this.l = vyoVar;
        this.z = axfdVar;
        this.w = vxzVar;
    }

    protected static agev U(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apxs.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                apxs apxsVar = (apxs) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                apxq apxqVar = apxsVar.n;
                if (apxqVar == null) {
                    apxqVar = apxq.a;
                }
                if (apxqVar.b == 2) {
                    apxq apxqVar2 = apxsVar.n;
                    if (apxqVar2 == null) {
                        apxqVar2 = apxq.a;
                    }
                    return agev.i(apxqVar2.b == 2 ? (ajyg) apxqVar2.c : ajyg.a);
                }
            }
        }
        return agdf.a;
    }

    public static agev W(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVar = apxj.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                return agev.i((apxj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            }
        }
        return agdf.a;
    }

    public static String X(ajwo ajwoVar) {
        agev agevVarW = W(ajwoVar);
        if (agevVarW.g() && (((apxj) agevVarW.c()).c & 1) != 0) {
            return ((apxj) agevVarW.c()).d;
        }
        agev agevVarU = U(ajwoVar);
        return (!agevVarU.g() || (((ajyg) agevVarU.c()).b & 1) == 0) ? "" : ((ajyg) agevVarU.c()).c;
    }

    public static void Z(xgn xgnVar, String str) {
        xgt xgtVarA = xgnVar.a();
        if (xgtVarA != null) {
            aihf aihfVarCreateBuilder = amdd.a.createBuilder();
            aihf aihfVarCreateBuilder2 = amcz.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            amcz amczVar = (amcz) aihfVarCreateBuilder2.instance;
            amczVar.b |= 1;
            amczVar.c = str;
            aihfVarCreateBuilder2.copyOnWrite();
            amcz amczVar2 = (amcz) aihfVarCreateBuilder2.instance;
            amczVar2.b |= 2;
            amczVar2.d = xgtVarA.f;
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
            amcz amczVar3 = (amcz) aihfVarCreateBuilder2.build();
            amczVar3.getClass();
            amddVar.k = amczVar3;
            amddVar.b |= 16384;
            amdd amddVar2 = (amdd) aihfVarCreateBuilder.build();
            argn argnVarG = xgnVar.g(new Object(), xhb.b(22811));
            xgnVar.d(new xgx(argnVarG));
            xgnVar.w(new xgx(argnVarG), amddVar2);
        }
    }

    public static final boolean ae(ajwo ajwoVar) {
        if (ajwoVar != null) {
            return W(ajwoVar).g() || U(ajwoVar).g();
        }
        return false;
    }

    public static final ajwo af(ajwo ajwoVar, boolean z) {
        agev agevVarI;
        if (ae(ajwoVar)) {
            agev agevVarW = W(ajwoVar);
            if (agevVarW.g()) {
                aihf builder = ((aihn) agevVarW.c()).toBuilder();
                builder.copyOnWrite();
                apxj apxjVar = (apxj) builder.instance;
                apxjVar.c |= 8;
                apxjVar.g = z;
                apxj apxjVar2 = (apxj) builder.build();
                ajwoVar.getClass();
                aihh aihhVar = (aihh) ajwoVar.toBuilder();
                aihhVar.e(apxj.b, apxjVar2);
                return (ajwo) aihhVar.build();
            }
            if (ajwoVar == null) {
                agevVarI = agdf.a;
            } else {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apxs.b);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    agevVarI = agev.i((apxs) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
                } else {
                    agevVarI = agdf.a;
                }
            }
            agev agevVarU = U(ajwoVar);
            if (agevVarI.g() && agevVarU.g()) {
                apxq apxqVar = ((apxs) agevVarI.c()).n;
                if (apxqVar == null) {
                    apxqVar = apxq.a;
                }
                aihf builder2 = apxqVar.toBuilder();
                aihf builder3 = ((aihn) agevVarU.c()).toBuilder();
                builder3.copyOnWrite();
                ajyg ajygVar = (ajyg) builder3.instance;
                ajygVar.b |= 8;
                ajygVar.f = z;
                ajyg ajygVar2 = (ajyg) builder3.build();
                builder2.copyOnWrite();
                apxq apxqVar2 = (apxq) builder2.instance;
                ajygVar2.getClass();
                apxqVar2.c = ajygVar2;
                apxqVar2.b = 2;
                apxq apxqVar3 = (apxq) builder2.build();
                aihf builder4 = ((aihn) agevVarI.c()).toBuilder();
                builder4.copyOnWrite();
                apxs apxsVar = (apxs) builder4.instance;
                apxqVar3.getClass();
                apxsVar.n = apxqVar3;
                apxsVar.c |= SemanticState.Hidden;
                apxs apxsVar2 = (apxs) builder4.build();
                ajwoVar.getClass();
                aihh aihhVar2 = (aihh) ajwoVar.toBuilder();
                aihhVar2.e(apxs.b, apxsVar2);
                return (ajwo) aihhVar2.build();
            }
        }
        return null;
    }

    @Override // defpackage.vob
    public final void V(adlz adlzVar) {
        adwg adwgVar = this.o;
        if (adwgVar != null) {
            adwgVar.L(adlzVar);
            return;
        }
        if (this.p == null) {
            this.p = new HashSet();
        }
        this.p.add(adlzVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    public final void Y(boolean z) {
        String str;
        boolean z2;
        f();
        this.t = true;
        ajwo ajwoVar = this.s;
        ajwoVar.getClass();
        byte[] bArrG = (ajwoVar.b & 1) != 0 ? ajwoVar.c.G() : vzh.b;
        wom womVar = this.b;
        woo wooVarL = womVar.l();
        wooVarL.o(bArrG);
        if (ae(this.s)) {
            wooVarL.J(X(ajwoVar));
            agev agevVarW = W(ajwoVar);
            if (agevVarW.g()) {
                str = ((apxj) agevVarW.c()).f;
            } else {
                agev agevVarU = U(ajwoVar);
                str = agevVarU.g() ? ((ajyg) agevVarU.c()).e : "";
            }
            wooVarL.L(str);
            if (z) {
                wooVarL.A = 2;
                this.s = af(this.s, false);
            } else {
                agev agevVarW2 = W(ajwoVar);
                if (agevVarW2.g()) {
                    z2 = ((apxj) agevVarW2.c()).g;
                } else {
                    agev agevVarU2 = U(ajwoVar);
                    if (agevVarU2.g()) {
                        z2 = ((ajyg) agevVarU2.c()).f;
                    }
                }
                if (z2) {
                    wooVarL.A = 2;
                    this.s = af(this.s, false);
                }
            }
        } else {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/engagementpanel/shared/AbstractCommentRepliesEngagementPanel", "loadNewBrowse", 360, "AbstractCommentRepliesEngagementPanel.java")).t("CommentRepliesEngagementPanel: cannot load navigation endpoint.");
        }
        taf.i(womVar.h(wooVarL, this.h), taf.a, new roc(this, 18), new ixb(this, 9), null);
    }

    @Override // defpackage.vob
    public final void aa() {
        agev agevVarI;
        this.e.t();
        vnx vnxVar = this.r;
        if (vnxVar != null) {
            ((vnw) vnxVar).d();
        }
        ajwo ajwoVar = this.s;
        if (ajwoVar == null) {
            agevVarI = agdf.a;
        } else {
            agev agevVarW = W(ajwoVar);
            if (!agevVarW.g() || (((apxj) agevVarW.c()).c & SemanticState.Focused) == 0) {
                agev agevVarU = U(ajwoVar);
                if (!agevVarU.g() || (((ajyg) agevVarU.c()).b & 64) == 0) {
                    agevVarI = agdf.a;
                } else {
                    ajwo ajwoVar2 = ((ajyg) agevVarU.c()).i;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    agevVarI = agev.i(ajwoVar2);
                }
            } else {
                ajwo ajwoVar3 = ((apxj) agevVarW.c()).j;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                agevVarI = agev.i(ajwoVar3);
            }
        }
        if (agevVarI.g()) {
            this.i.a((ajwo) agevVarI.c());
        }
    }

    @Override // defpackage.vob
    public final void ab() {
        this.e.t();
        vnx vnxVar = this.r;
        if (vnxVar != null) {
            vnxVar.d();
        }
    }

    public final void ac() {
        int i;
        if (!this.u) {
            this.u = true;
            return;
        }
        xgn xgnVar = this.e;
        ajwo ajwoVar = this.s;
        int i2 = 32276;
        if (ajwoVar != null) {
            agev agevVarW = W(ajwoVar);
            if (agevVarW.g()) {
                i = ((apxj) agevVarW.c()).i;
            } else {
                agev agevVarU = U(ajwoVar);
                i = agevVarU.g() ? ((ajyg) agevVarU.c()).h : 0;
            }
            if (i != 0) {
                i2 = i;
            }
        }
        xgnVar.D(xhb.a(i2), xgu.b, this.s);
    }

    @Override // defpackage.vob
    public final void ad(ajwo ajwoVar) {
        ac();
        this.u = false;
        if (!this.t) {
            Y(false);
        }
        vnx vnxVar = this.r;
        if (vnxVar != null) {
            vnxVar.f();
        }
    }

    @Override // defpackage.vob
    public void d(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vob
    public void e() {
        throw null;
    }

    public void f() {
        throw null;
    }

    public void g(Throwable th) {
        throw null;
    }

    public abstract void h(wfy wfyVar);

    public void hP() {
        throw null;
    }

    @Override // defpackage.adww
    public final boolean jf() {
        return this.v;
    }

    @Override // defpackage.vob
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final vpk T() {
        vpk vpkVar = this.B;
        if (vpkVar != null) {
            return vpkVar;
        }
        vpk vpkVar2 = (vpk) this.k.io();
        this.B = vpkVar2;
        vpkVar2.j = this.e;
        return vpkVar2;
    }

    @Override // defpackage.vmz, defpackage.vob
    public final String w() {
        ajwo ajwoVar = this.s;
        if (ajwoVar != null) {
            return X(ajwoVar);
        }
        return null;
    }

    @Override // defpackage.vmz, defpackage.vob
    public final void x() {
        View view = this.q;
        if (view == null || !twb.c(view.getContext())) {
            return;
        }
        View view2 = this.q;
        view2.getClass();
        view2.sendAccessibilityEvent(8);
    }

    @Override // defpackage.vob
    public final void ag(vnz vnzVar) {
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.engagementpanel.util.InterceptTouchListenerLinearLayout;
import j$.lang.Iterable$EL;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vor implements vpb {
    private static final agrf x = agrf.h("com/google/android/libraries/youtube/engagementpanel/EngagementPanelControllerImpl");
    private final voz A;
    private final abet B;
    private final agev C;
    private final wbz D;
    private final zwb E;
    private final avlr F;
    private ViewGroup G;
    private InterceptTouchListenerLinearLayout H;
    private ViewGroup I;
    private final adxl K;
    private boolean L;
    private final zvl M;
    private final xeu N;
    private final agev O;
    private final vxz P;
    private final vxz Q;
    private final vxz R;
    private final vxz S;
    private final abuz T;
    private final vwt U;
    private final ayq V;
    private final jnm W;
    public final vov a;
    public final vpc b;
    public final Activity c;
    public final vuk d;
    public final xgv e;
    public final vog f;
    public final vyo g;
    public final vxe h;
    public RelativeLayout i;
    public RelativeLayout j;
    public voi k;
    public boolean l;
    public boolean m;
    public vob n;
    public avmn p;
    public avmn q;
    public final aeda r;
    public final aunn s;
    public tss t;
    public final vxz u;
    public final vxz v;
    public final abwk w;
    private final avmb y;
    private final xgv z;
    public int o = 1;
    private final vpg J = new vpg();

    public vor(Activity activity, avmb avmbVar, bog bogVar, vwt vwtVar, vuk vukVar, xgv xgvVar, xgv xgvVar2, abwk abwkVar, ayq ayqVar, vog vogVar, jnm jnmVar, vyo vyoVar, vov vovVar, vpc vpcVar, vxe vxeVar, voz vozVar, abuz abuzVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, vxz vxzVar4, abet abetVar, agev agevVar, vwt vwtVar2, vxz vxzVar5, zvl zvlVar, adxl adxlVar, xeu xeuVar, wbz wbzVar, zwb zwbVar, avlr avlrVar, vxz vxzVar6, aeda aedaVar, aunn aunnVar, agev agevVar2, aunn aunnVar2) {
        this.c = activity;
        this.y = avmbVar;
        this.d = vukVar;
        this.e = xgvVar;
        this.z = xgvVar2;
        this.w = abwkVar;
        this.V = ayqVar;
        this.a = vovVar;
        this.b = vpcVar;
        this.g = vyoVar;
        this.f = vogVar;
        this.A = vozVar;
        this.W = jnmVar;
        this.h = vxeVar;
        this.u = vxzVar2;
        this.P = vxzVar3;
        this.v = vxzVar4;
        this.B = abetVar;
        this.C = agevVar;
        this.U = vwtVar2;
        this.Q = vxzVar5;
        this.F = avlrVar;
        this.S = vxzVar6;
        this.T = abuzVar;
        this.R = vxzVar;
        this.M = zvlVar;
        this.K = adxlVar;
        this.N = xeuVar;
        this.D = wbzVar;
        this.E = zwbVar;
        this.r = aedaVar;
        this.s = aunnVar;
        this.O = agevVar2;
        bogVar.getLifecycle().b(new voo(this, vovVar, vxzVar4, aunnVar2));
        vwtVar.D(new fzs(this, vxeVar, 8));
    }

    public static final boolean N(ajwo ajwoVar) {
        if (ajwoVar == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aoli aoliVar = ((apxs) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).o;
        if (aoliVar == null) {
            aoliVar = aoli.a;
        }
        return aoliVar.i;
    }

    private final int O() {
        return tzk.i(this.i.getContext(), R.attr.ytBrandBackgroundSolid);
    }

    private final void P(boolean z) {
        Q((vot) this.b.c().f(), z);
    }

    private final void Q(vot votVar, boolean z) {
        vun vunVar;
        if (z || !this.b.m(1)) {
            this.b.i();
            U(votVar != null ? votVar.b : null);
            vuk vukVar = this.d;
            vxz vxzVar = this.P;
            vun vunVar2 = vukVar.u;
            if (vxzVar.l(24, 45627625L, false) && vunVar2 != (vunVar = vun.d)) {
                vukVar.f.a(vunVar);
            }
        }
        agev agevVarC = this.b.c();
        n(agevVarC.g() ? ((vot) agevVarC.c()).b : null, agevVarC.g());
        if (votVar != null) {
            tuk.h(this.c);
        }
    }

    private final void R(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            akuf akufVar = (akuf) it.next();
            w(akufVar.b == 138681066 ? (akuj) akufVar.c : akuj.b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [avmn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [adxj, java.lang.Object] */
    private final void S(vot votVar) {
        vob vobVar = votVar.b;
        vny vnyVarT = vobVar.T();
        if (vnyVarT != null) {
            vnyVarT.i(this.b.j());
        }
        int i = 2;
        votVar.b(2);
        xgn xgnVarG = g();
        vog vogVar = this.f;
        if (vogVar != null) {
            ViewGroup viewGroup = (ViewGroup) vogVar.c(votVar).orElse(null);
            this.I = viewGroup;
            if (viewGroup != null) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) viewGroup.findViewById(R.id.close_button);
                if (this.r.v()) {
                    appCompatImageView.setImageResource(((agfa) this.O).a.b(arqz.oQ));
                }
                if (xgnVarG != null && appCompatImageView != null && appCompatImageView.getVisibility() == 0) {
                    xgnVarG.l(new xgj(xhb.b(31880)));
                }
            }
        }
        if (this.k != null && L().a()) {
            this.k.b();
        }
        n(vobVar, true);
        abuz abuzVar = this.T;
        ?? r0 = abuzVar.a;
        if (r0 != 0 && !r0.f()) {
            awka.f((AtomicReference) r0);
        }
        abuzVar.a = ((avlh) abuzVar.b).az().al(new vqe(i), new vqe(3));
        tuk.h(this.c);
    }

    private static final ajwo T(ajwo ajwoVar, String str) {
        aihf aihfVarCreateBuilder;
        aihl aihlVar = aoaq.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            aihfVarCreateBuilder = ((aoar) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
        } else {
            aihfVarCreateBuilder = aoar.a.createBuilder();
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
        str.getClass();
        aoarVar.b |= 1;
        aoarVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
        aoarVar2.b |= 2;
        aoarVar2.d = 33917;
        aihhVar.e(aihlVar, (aoar) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    private final void U(vob vobVar) {
        voi voiVar = this.k;
        if (voiVar == null || vobVar == null) {
            return;
        }
        voiVar.a();
    }

    public static ajwo j(ajwo ajwoVar) {
        aihl aihlVar = aoaq.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return ajwoVar;
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aihf builder = ((aoar) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
        builder.copyOnWrite();
        aoar aoarVar = (aoar) builder.instance;
        aoarVar.b &= -2;
        aoarVar.c = aoar.a.c;
        aihhVar.e(aihlVar, (aoar) builder.build());
        return (ajwo) aihhVar.build();
    }

    public final void A() {
        akuj akujVarU;
        akuj akujVarU2;
        vov vovVar = this.a;
        boolean zL = ((vxz) vovVar.b.io()).l(189, 45774499L, false);
        HashSet hashSet = new HashSet();
        Map map = vovVar.a;
        for (vou vouVar : map.values()) {
            vwt vwtVar = vovVar.f;
            String str = vouVar.a;
            if (!vwtVar.j(str) && (!zL || (akujVarU2 = vouVar.b.u()) == null || !akujVarU2.A)) {
                hashSet.add(str);
                vouVar.c();
            }
        }
        map.keySet().removeAll(hashSet);
        vpc vpcVar = this.b;
        vot votVar = (vot) vpcVar.c().f();
        if (!this.P.l(153, 45732224L, false)) {
            if (vpcVar.a() > 1 || votVar == null || vovVar.a(votVar.a) == null || votVar.c == 5) {
                vpcVar.h();
                this.f.d();
                RelativeLayout relativeLayout = this.i;
                if (relativeLayout != null) {
                    relativeLayout.animate().cancel();
                }
                Q(votVar, true);
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = vpcVar.a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            xsc xscVar = (xsc) it.next();
            akuj akujVarU3 = ((vot) xscVar.b).b.u();
            if (akujVarU3 == null || !akujVarU3.A) {
                xscVar.k();
                it.remove();
            } else {
                while (xscVar.h() > 1 && ((akujVarU = xscVar.i().b.u()) == null || !akujVarU.A)) {
                    xscVar.j();
                }
            }
        }
        if (arrayDeque.isEmpty()) {
            vpcVar.c.kk(agdf.a);
        } else {
            vpcVar.c.kk(agev.h(((vot) ((xsc) arrayDeque.peek()).b).b));
        }
        vot votVar2 = (vot) vpcVar.c().f();
        if (vpcVar.b() == 0) {
            this.f.d();
            RelativeLayout relativeLayout2 = this.i;
            if (relativeLayout2 != null) {
                relativeLayout2.animate().cancel();
            }
            Q(votVar, true);
            return;
        }
        if (votVar2 == null || Objects.equals(votVar2, votVar)) {
            return;
        }
        r(agev.i(votVar2));
        this.f.h(votVar2);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, vob] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, vob] */
    public final void B(vsv vsvVar, adxd adxdVar) {
        ajwo ajwoVar;
        vtk vtkVarV;
        vun vunVar;
        HashMap map = new HashMap();
        vop vopVar = adxdVar instanceof vop ? (vop) adxdVar : null;
        vss vssVar = vsvVar.d;
        if (vssVar == null) {
            vssVar = vss.a;
        }
        Iterable$EL.forEach(vssVar.b, new hrr(this, vopVar, map, 9, (short[]) null));
        vsu vsuVar = vsvVar.e;
        if (vsuVar == null) {
            vsuVar = vsu.a;
        }
        Iterator it = vsuVar.b.iterator();
        vot votVar = null;
        while (it.hasNext()) {
            boolean z = true;
            for (String str : ((vsx) it.next()).b) {
                vot votVarA = this.a.a(str);
                votVarA.getClass();
                Integer num = (Integer) map.get(str);
                num.getClass();
                int iIntValue = num.intValue();
                if (iIntValue == 2) {
                    votVar = votVarA;
                }
                ajwo ajwoVar2 = votVarA.e;
                if (ajwoVar2 != null && (iIntValue == 3 || iIntValue == 2)) {
                    vob vobVarF = f(ajwoVar2, null, z, false);
                    if (vobVarF != null) {
                        if (!this.v.l(372, 45812899L, false) || vopVar == null || (vunVar = vopVar.b) == null || !str.equals(vopVar.c)) {
                            vuk vukVar = this.d;
                            Optional optionalOf = Optional.of(vobVarF);
                            boolean zIsEmpty = optionalOf.isEmpty();
                            abxv abxvVar = vukVar.w;
                            vtkVarV = zIsEmpty ? abxvVar.v(vun.c) : abxvVar.v(((axfd) abxvVar.a).F(optionalOf.get().G(((Context) abxvVar.d).getResources().getConfiguration().orientation), optionalOf.get().r()));
                        } else {
                            vtkVarV = this.d.w.v(vunVar);
                        }
                        vtkVarV.b(vobVarF.c(), 0L, new vol());
                        z = false;
                    }
                }
            }
        }
        if (!this.v.l(413, 45836026L, false) || votVar == null || (ajwoVar = votVar.e) == null) {
            return;
        }
        akuj akujVarU = votVar.b.u();
        if (akujVarU == null || (akujVarU.c & 4) == 0) {
            this.h.a(ajwoVar);
        }
    }

    public final void C(GradientDrawable gradientDrawable, int i) {
        float[] cornerRadii;
        ViewGroup viewGroup = this.I;
        if (viewGroup != null) {
            viewGroup.setBackground(gradientDrawable);
        }
        ViewGroup viewGroup2 = this.G;
        if (viewGroup2 != null) {
            viewGroup2.setBackground(gradientDrawable);
        }
        boolean zL = this.v.l(204, 45685365L, false);
        if (zL) {
            this.J.b(i);
        }
        if (this.H != null) {
            if (zL) {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(i);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Drawable background = this.H.getBackground();
                if ((background instanceof GradientDrawable) && (cornerRadii = ((GradientDrawable) background).getCornerRadii()) != null) {
                    gradientDrawable.setCornerRadii(cornerRadii);
                }
            }
            this.H.setBackground(gradientDrawable);
        }
    }

    public final void D(boolean z, boolean z2) {
        InterceptTouchListenerLinearLayout interceptTouchListenerLinearLayout = this.H;
        if (interceptTouchListenerLinearLayout != null) {
            interceptTouchListenerLinearLayout.findViewById(R.id.panel_header_bottom_border).setVisibility(true != (z2 && !z) ? 8 : 0);
        }
    }

    public final void E(vob vobVar, vny vnyVar) {
        if (this.H == null || vnyVar == null) {
            return;
        }
        D(H(vobVar), vnyVar.p());
        vnyVar.s(new yhi(this, vobVar));
    }

    public final void F(vob vobVar) {
        int i;
        ViewGroup viewGroup;
        akuj akujVarU;
        if (this.H != null) {
            Object obj = this.p;
            if (obj != null) {
                avnr.b((AtomicReference) obj);
                this.p = null;
            }
            if (vobVar.P() == 5) {
                if (vobVar.P() != 5 || (akujVarU = vobVar.u()) == null || (akujVarU.d & SemanticState.Hidden) == 0) {
                    return;
                }
                this.p = this.D.e(this.E.e()).j(akujVarU.Q, this.v.l(284, 45728813L, false)).O(this.y).af(new var(this, 16));
                return;
            }
            if (vobVar.P() == 6) {
                GradientDrawable gradientDrawableB = b(vobVar);
                if (gradientDrawableB != null) {
                    C(gradientDrawableB, a(vobVar));
                    return;
                }
                return;
            }
            int iP = vobVar.P();
            Objects.checkIndex(0, 3);
            int[] iArr = von.b;
            boolean[] zArr = von.a;
            if (yno.eR(iP, iArr, zArr, 0, "ENGAGEMENT_PANEL_BACKGROUND_STYLE_RAISED")) {
                i = R.drawable.engagement_panel_header_drawable_raised;
            } else {
                i = yno.eR(iP, von.b, zArr, 1, "ENGAGEMENT_PANEL_BACKGROUND_STYLE_DARK") ? R.drawable.engagement_panel_header_drawable_dark : R.drawable.engagement_panel_header_drawable;
            }
            this.H.setBackgroundResource(i);
            ViewGroup viewGroup2 = this.I;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundResource(i);
            }
            if ((this.S.m(30, 45712516L) || this.v.l(284, 45728813L, false)) && (viewGroup = this.G) != null) {
                viewGroup.setBackgroundResource(i);
            }
            if (this.v.l(204, 45685365L, false)) {
                this.J.b(O());
            }
        }
    }

    public final boolean G(String str) {
        return this.a.c(str);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    public final boolean H(vob vobVar) {
        String strW = vobVar.w();
        if (strW != null) {
            for (xsc xscVar : this.b.a) {
                if (xscVar.a.contains(strW)) {
                    if (((vot) xscVar.b).a.equals(strW)) {
                        break;
                    }
                }
            }
            if (vpo.e(vobVar)) {
                return true;
            }
        } else if (vpo.e(vobVar)) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        return this.n != null;
    }

    public final boolean J(apxs apxsVar) {
        String strK = k();
        boolean z = apxsVar.k && !ahno.aa(strK);
        boolean z2 = apxsVar.j && ((!ahno.aa(strK) && h(strK).f() == vok.b) || (this.d.u == vun.a && this.o == 1 && this.P.l(215, 45816760L, false)));
        if (!z && !z2) {
            return false;
        }
        if (((apxsVar.d == 10 ? (akud) apxsVar.e : akud.a).b & 2) != 0) {
            if ((apxsVar.d == 10 ? (akud) apxsVar.e : akud.a).d.startsWith("mea-")) {
                aihf aihfVarCreateBuilder = arim.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                arim arimVar = (arim) aihfVarCreateBuilder.instance;
                arimVar.c = 1;
                arimVar.b |= 1;
                String str = (apxsVar.d == 10 ? (akud) apxsVar.e : akud.a).d;
                aihfVarCreateBuilder.copyOnWrite();
                arim arimVar2 = (arim) aihfVarCreateBuilder.instance;
                str.getClass();
                arimVar2.b |= 2;
                arimVar2.d = str;
                if (strK == null) {
                    strK = "";
                }
                aihfVarCreateBuilder.copyOnWrite();
                arim arimVar3 = (arim) aihfVarCreateBuilder.instance;
                arimVar3.b |= 4;
                arimVar3.e = strK;
                xeu xeuVar = this.N;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.WATCH_EP_PROMO_CONFLICT);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    arim arimVar4 = (arim) aihfVarCreateBuilder.build();
                    arimVar4.getClass();
                    alouVar.d = arimVar4;
                    alouVar.c = 503;
                    xeuVar.b((alou) alosVar.build());
                }
            }
        }
        if ((apxsVar.c & 64) != 0) {
            vxe vxeVar = this.h;
            ajwo ajwoVar = apxsVar.l;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
        return true;
    }

    public final void K(String str) {
        xsc xscVar = (xsc) this.b.a.peek();
        if (xscVar == null || !xscVar.q(str)) {
            return;
        }
        agev agevVarI = i();
        str.getClass();
        if (((Boolean) agevVarI.a(new vdm(str, 6)).e(Boolean.FALSE)).booleanValue()) {
            M(false);
            return;
        }
        String strK = k();
        while (strK != null && !strK.equals(str)) {
            v(agez.a, true);
            strK = k();
        }
        v(agez.a, true);
    }

    public final tss L() {
        if (this.t == null) {
            voq voqVar = new voq(this);
            voqVar.g(new vtz(voqVar.e.d.a, null));
            voqVar.d(new tuv() { // from class: vom
                @Override // defpackage.tuv
                public final void a(int i, tss tssVar) {
                    vor vorVar = this.a;
                    if (i == 0) {
                        vorVar.b.d();
                        vorVar.o(4);
                    } else if (i == 2 && vorVar.n == null && vorVar.k() != null) {
                        vorVar.o(2);
                    }
                }
            });
            this.t = voqVar;
        }
        return this.t;
    }

    public final void M(boolean z) {
        this.b.d();
        P(z);
    }

    public final int a(vob vobVar) {
        int iO = O();
        akuj akujVarU = vobVar.u();
        return (akujVarU == null || (akujVarU.d & SemanticState.Modal) == 0) ? iO : avv.f(iO, (int) (akujVarU.S * 255.0d));
    }

    public final GradientDrawable b(vob vobVar) {
        akuj akujVarU;
        if ((vobVar.P() != 6 && vobVar.P() != 7) || (akujVarU = vobVar.u()) == null || (akujVarU.d & SemanticState.Modal) == 0) {
            return null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(O());
        gradientDrawable.setAlpha((int) (akujVarU.S * 255.0d));
        return gradientDrawable;
    }

    public final vob c(String str) {
        vot votVarA = this.a.a(str);
        if (votVarA == null) {
            return null;
        }
        return votVarA.b;
    }

    public final vob d() {
        return (vob) this.b.c().a(new sdp(14)).f();
    }

    public final vob e(ajwo ajwoVar, vnz vnzVar) {
        if (this.u.l(10, 45619755L, false) && this.z.a() == null) {
            z("InteractionLoggingScreen is null.");
        }
        return f(this.z.f(j(ajwoVar)), vnzVar, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x026e  */
    /* JADX WARN: Code duplicated, block: B:228:0x086f  */
    /* JADX WARN: Code duplicated, block: B:234:0x0888  */
    /* JADX WARN: Code duplicated, block: B:236:0x089b  */
    /* JADX WARN: Code duplicated, block: B:239:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:241:0x08af  */
    /* JADX WARN: Code duplicated, block: B:243:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:291:0x098e  */
    /* JADX WARN: Code duplicated, block: B:293:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:295:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:296:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:299:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:302:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:303:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:306:0x09d7  */
    /* JADX WARN: Code duplicated, block: B:307:0x09da  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    /* JADX WARN: Type inference failed for: r11v73, types: [java.lang.Object, vob] */
    /* JADX WARN: Type inference failed for: r12v33, types: [awmd, java.lang.Object] */
    public final vob f(ajwo ajwoVar, vnz vnzVar, boolean z, boolean z2) {
        vot votVarA;
        String strAb;
        Optional optionalEmpty;
        amtn amtnVar;
        int i;
        RelativeLayout.LayoutParams layoutParams;
        vny vnyVar;
        vob vobVar;
        vor vorVar;
        aihl aihlVarCheckIsLite;
        boolean z3;
        aihl aihlVarCheckIsLite2;
        Object objK;
        Object objC;
        akum akumVar;
        akue akueVar;
        xsc xscVar;
        if (!this.l) {
            ((agrc) ((agrc) x.b()).k("com/google/android/libraries/youtube/engagementpanel/EngagementPanelControllerImpl", "show", 1080, "EngagementPanelControllerImpl.java")).t("EngagementPanelController: cannot show EngagementPanel before EngagementPanelController.init() has been called.");
            zvp.a(zvn.a, zvm.z, "[EngagementPanel] Cannot show EngagementPanel before EngagementPanelController.init() has been called.");
            return null;
        }
        vov vovVar = this.a;
        vovVar.d.getClass();
        int i2 = 4;
        int i3 = 1;
        if (ajwoVar == null) {
            votVarA = null;
        } else {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apxs.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apxs.b);
                ajwoVar.c(aihlVarCheckIsLite4);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                apxs apxsVar = (apxs) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                if ((apxsVar.c & SemanticState.Hidden) != 0) {
                    dov dovVar = vovVar.g;
                    apxq apxqVar = apxsVar.n;
                    if (apxqVar == null) {
                        apxqVar = apxq.a;
                    }
                    int i4 = apxqVar.b;
                    if (i4 == 2) {
                        ajyg ajygVar = i4 == 2 ? (ajyg) apxqVar.c : ajyg.a;
                        ?? r12 = dovVar.a;
                        String str = ajygVar.c;
                        hbo hboVar = (hbo) r12.io();
                        hboVar.V(new gob(str, i2));
                        optionalEmpty = Optional.of(new xpl(hboVar, str, (char[]) null));
                    } else {
                        optionalEmpty = Optional.empty();
                    }
                    vre vreVar = new vre(vovVar, i3);
                    if (true == optionalEmpty.isPresent()) {
                        xpl xplVar = (xpl) optionalEmpty.get();
                        optionalEmpty = Optional.ofNullable(new vou((vov) vreVar.a, (String) xplVar.a, xplVar.b));
                    }
                    votVarA = (vot) optionalEmpty.orElse(null);
                } else {
                    votVarA = null;
                }
            } else {
                votVarA = null;
            }
            if (votVarA == null) {
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apxs.b);
                ajwoVar.c(aihlVarCheckIsLite5);
                if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apxs.b);
                    ajwoVar.c(aihlVarCheckIsLite6);
                    Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                    votVarA = vovVar.a(tzk.ab((apxs) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))));
                } else {
                    aihl aihlVar = aqnn.b;
                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar);
                    ajwoVar.c(aihlVarCheckIsLite7);
                    if (ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
                        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar);
                        ajwoVar.c(aihlVarCheckIsLite8);
                        Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
                        aqnn aqnnVar = (aqnn) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4));
                        if ((aqnnVar.c & 4) != 0) {
                            ajwo ajwoVar2 = aqnnVar.g;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(apxs.b);
                            ajwoVar2.c(aihlVarCheckIsLite9);
                            Object objK5 = ajwoVar2.j.k(aihlVarCheckIsLite9.d);
                            strAb = tzk.ab((apxs) (objK5 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK5)));
                        } else {
                            if (((aqnnVar.d == 2 ? (akud) aqnnVar.e : akud.a).b & 2) != 0) {
                                strAb = (aqnnVar.d == 2 ? (akud) aqnnVar.e : akud.a).d;
                            } else {
                                int i5 = aqnnVar.d;
                                if (i5 == 1) {
                                    strAb = i5 == 1 ? (String) aqnnVar.e : "";
                                } else {
                                    strAb = null;
                                }
                            }
                        }
                        votVarA = vovVar.a(strAb);
                    } else {
                        aihl aihlVarCheckIsLite10 = aihn.checkIsLite(apxt.b);
                        ajwoVar.c(aihlVarCheckIsLite10);
                        if (ajwoVar.j.n(aihlVarCheckIsLite10.d)) {
                            aihl aihlVarCheckIsLite11 = aihn.checkIsLite(apxt.b);
                            ajwoVar.c(aihlVarCheckIsLite11);
                            Object objK6 = ajwoVar.j.k(aihlVarCheckIsLite11.d);
                            votVarA = vovVar.a(((apxt) (objK6 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK6))).d);
                        } else {
                            Optional optionalEmpty2 = Optional.empty();
                            optionalEmpty2.isPresent();
                            votVarA = (vot) optionalEmpty2.orElse(null);
                        }
                    }
                }
            }
        }
        if (votVarA != null && ajwoVar != null) {
            boolean zN = N(ajwoVar);
            vob vobVar2 = votVarA.b;
            vobVar2.C(zN);
            if (this.u.l(10, 45619755L, false)) {
                aihl aihlVar2 = aoaq.b;
                aihl aihlVarCheckIsLite12 = aihn.checkIsLite(aihlVar2);
                ajwoVar.c(aihlVarCheckIsLite12);
                if (ajwoVar.j.n(aihlVarCheckIsLite12.d)) {
                    aihl aihlVarCheckIsLite13 = aihn.checkIsLite(aihlVar2);
                    ajwoVar.c(aihlVarCheckIsLite13);
                    Object objK7 = ajwoVar.j.k(aihlVarCheckIsLite13.d);
                    aoar aoarVar = (aoar) (objK7 == null ? aihlVarCheckIsLite13.b : aihlVarCheckIsLite13.c(objK7));
                    if ((aoarVar.b & 1) == 0 || aoarVar.c.isEmpty()) {
                        z("Failed to get parent CSN on show command.");
                    }
                } else {
                    z("Show command lacks navigation endpoint extension.");
                }
            }
            abet abetVar = this.B;
            aihl aihlVarCheckIsLite14 = aihn.checkIsLite(apxs.b);
            ajwoVar.c(aihlVarCheckIsLite14);
            Object objK8 = ajwoVar.j.k(aihlVarCheckIsLite14.d);
            apxs apxsVar2 = (apxs) (objK8 == null ? aihlVarCheckIsLite14.b : aihlVarCheckIsLite14.c(objK8));
            int i6 = apxsVar2.d;
            if (i6 != 1) {
                amtnVar = abetVar.b;
                if (!amtnVar.equals(amtn.LOCK_MODE_STATE_ENUM_LOCKED) || amtnVar.equals(amtn.LOCK_MODE_STATE_ENUM_CAN_UNLOCK) || amtnVar.equals(amtn.LOCK_MODE_STATE_ENUM_UNLOCK_EXPANDED)) {
                }
            } else {
                if (!abet.a.contains(i6 == 1 ? (String) apxsVar2.e : "")) {
                    amtnVar = abetVar.b;
                    if (!amtnVar.equals(amtn.LOCK_MODE_STATE_ENUM_LOCKED)) {
                    }
                }
            }
            if (this.m) {
                i = 1;
            } else {
                this.L = true;
                aihf aihfVarCreateBuilder = rrg.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                rrg rrgVar = (rrg) aihfVarCreateBuilder.instance;
                rrgVar.c = 6;
                rrgVar.b |= 1;
                if (((rrf) ((agfa) this.C).a).a((rrg) aihfVarCreateBuilder.build()) == aiwh.ANIMATION_DECISION_OFF) {
                    this.L = false;
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.i.getContext());
                vxz vxzVar = this.v;
                layoutInflaterFrom.inflate(true != vxzVar.l(244, 45711405L, false) ? R.layout.engagement_panel_content_swipable_container : R.layout.engagement_panel_content_swipable_container_layered, (ViewGroup) this.i, true);
                InterceptTouchListenerLinearLayout interceptTouchListenerLinearLayout = (InterceptTouchListenerLinearLayout) this.i.findViewById(R.id.panel_content_touch_wrapper);
                if (vxzVar.l(244, 45711405L, false) && (layoutParams = (RelativeLayout.LayoutParams) interceptTouchListenerLinearLayout.getLayoutParams()) != null) {
                    layoutParams.addRule(3, R.id.header_container);
                    interceptTouchListenerLinearLayout.setLayoutParams(layoutParams);
                }
                this.H = (InterceptTouchListenerLinearLayout) this.i.findViewById(R.id.header_container);
                View viewFindViewById = this.i.findViewById(R.id.scrim);
                FrameLayout frameLayout = (FrameLayout) this.i.findViewById(R.id.panel_header_wrapper);
                this.G = (ViewGroup) this.i.findViewById(R.id.panel_content);
                this.K.a(this.i);
                vog vogVar = this.f;
                ViewGroup viewGroup = this.G;
                viewGroup.getClass();
                vhv vhvVar = new vhv(this, 7);
                boolean z4 = this.L;
                frameLayout.getClass();
                vogVar.a = frameLayout;
                vogVar.b = viewGroup;
                viewFindViewById.getClass();
                vogVar.c = viewFindViewById;
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                Context context = frameLayout.getContext();
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context);
                LinearLayout linearLayout = (LinearLayout) layoutInflaterFrom2.inflate(R.layout.engagement_panel_header, (ViewGroup) vogVar.a, false);
                LinearLayout linearLayout2 = (LinearLayout) layoutInflaterFrom2.inflate(R.layout.engagement_panel_header, (ViewGroup) vogVar.a, false);
                linearLayout.findViewById(R.id.close_button).setOnClickListener(vhvVar);
                linearLayout2.findViewById(R.id.close_button).setOnClickListener(vhvVar);
                frameLayout.addView(linearLayout);
                frameLayout.addView(linearLayout2);
                FrameLayout frameLayout2 = new FrameLayout(context);
                FrameLayout frameLayout3 = new FrameLayout(context);
                viewGroup.addView(frameLayout2);
                viewGroup.addView(frameLayout3);
                linearLayout2.setVisibility(8);
                frameLayout3.setVisibility(8);
                Resources resources = context.getResources();
                float dimension = resources.getDimension(R.dimen.engagement_panel_header_animation_distance);
                int integer = resources.getInteger(android.R.integer.config_mediumAnimTime);
                vogVar.i = resources.getDimensionPixelSize(R.dimen.engagement_panel_animation_elevation);
                vogVar.f = new tsu();
                vogVar.d = new voe(dimension);
                vogVar.e = new voc();
                vogVar.g = new vof(viewGroup2, true);
                vogVar.h = new vof(viewGroup2, false);
                long j = integer;
                vogVar.p = new tss(linearLayout, j, vogVar.f);
                vogVar.n = new tss(linearLayout2, j, vogVar.d);
                vogVar.q = new tss(frameLayout2, j, vogVar.e);
                vogVar.o = new tss(frameLayout3, j, vogVar.e);
                vogVar.o.d(vogVar);
                vogVar.k = Optional.empty();
                vogVar.j = Optional.empty();
                vogVar.l = z4;
                RelativeLayout relativeLayout = this.j;
                if (relativeLayout != null) {
                    LayoutInflater.from(relativeLayout.getContext()).inflate(true != vxzVar.l(244, 45711405L, false) ? R.layout.engagement_panel_content_swipable_container : R.layout.engagement_panel_content_swipable_container_layered, (ViewGroup) relativeLayout, true);
                    if (vxzVar.l(244, 45711405L, false)) {
                        InterceptTouchListenerLinearLayout interceptTouchListenerLinearLayout2 = (InterceptTouchListenerLinearLayout) relativeLayout.findViewById(R.id.panel_content_touch_wrapper);
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) interceptTouchListenerLinearLayout2.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.addRule(3, R.id.header_container);
                            interceptTouchListenerLinearLayout2.setLayoutParams(layoutParams2);
                        }
                    }
                    voz vozVar = this.A;
                    vpc vpcVar = this.b;
                    RelativeLayout relativeLayout2 = this.i;
                    vuk vukVar = this.d;
                    avmb avmbVar = this.y;
                    vpcVar.getClass();
                    vozVar.f = vpcVar;
                    vozVar.g = relativeLayout;
                    Drawable background = relativeLayout.getBackground();
                    if (background instanceof ColorDrawable) {
                        vozVar.m = ((ColorDrawable) background).getColor();
                    }
                    vozVar.j = relativeLayout.findViewById(R.id.header_container);
                    vozVar.h = (FrameLayout) relativeLayout.findViewById(R.id.panel_header_wrapper);
                    vozVar.i = relativeLayout.findViewById(R.id.panel_header_bottom_border);
                    vozVar.l = (ViewGroup) relativeLayout.findViewById(R.id.panel_content);
                    vozVar.j = relativeLayout.findViewById(R.id.header_container);
                    vozVar.k = LayoutInflater.from(relativeLayout.getContext()).inflate(R.layout.engagement_panel_header, (ViewGroup) vozVar.h, false);
                    vozVar.h.addView(vozVar.k);
                    avlr avlrVarR = relativeLayout2.getParent() != null ? tuk.g((View) relativeLayout2.getParent(), avmbVar).r() : avlr.J(new Rect(0, 0, 0, 0));
                    avlh avlhVar = vukVar.j;
                    vwt vwtVar = vozVar.u;
                    vwtVar.D(new ium(vozVar, avlhVar, avlrVarR, 20));
                    View viewFindViewById2 = relativeLayout.findViewById(R.id.engagement_panel_lower_view_scrim);
                    if (vozVar.s.l(26, 45418396L, false)) {
                        viewFindViewById2.setVisibility(8);
                        relativeLayout.setBackgroundColor(0);
                    } else {
                        vwtVar.D(new tsn(vozVar, viewFindViewById2, 7));
                    }
                }
                final InterceptTouchListenerLinearLayout interceptTouchListenerLinearLayout3 = this.H;
                final ViewGroup viewGroup3 = this.G;
                viewGroup3.getClass();
                vuk vukVar2 = this.d;
                RelativeLayout relativeLayout3 = this.i;
                yyq yyqVar = new yyq(this, 1);
                avmb avmbVar2 = this.y;
                vukVar2.c.j(relativeLayout3, interceptTouchListenerLinearLayout3, viewGroup3);
                vua vuaVar = vukVar2.a;
                avlh avlhVar2 = vukVar2.o;
                avlh avlhVar3 = vukVar2.p;
                avlhVar2.ak(new vpi(vuaVar, 14));
                avlhVar3.ak(new vpi(vuaVar, 15));
                final vuu vuuVar = vukVar2.f;
                avlh avlhVar4 = vukVar2.i;
                avlhVar2.i(new avll() { // from class: vuq
                    @Override // defpackage.avll
                    public final axso a(avlh avlhVar5) {
                        return vuuVar.g.z(tdw.a).g(avla.e).W(new ugm(avlhVar5, 9));
                    }
                }).ap(vuuVar.b);
                avlhVar3.i(new avll() { // from class: vuq
                    @Override // defpackage.avll
                    public final axso a(avlh avlhVar5) {
                        return vuuVar.g.z(tdw.a).g(avla.e).W(new ugm(avlhVar5, 9));
                    }
                }).ap(vuuVar.c);
                avlhVar4.i(new avll() { // from class: vuq
                    @Override // defpackage.avll
                    public final axso a(avlh avlhVar5) {
                        return vuuVar.g.z(tdw.a).g(avla.e).W(new ugm(avlhVar5, 9));
                    }
                }).ap(vuuVar.d);
                avlh avlhVar5 = vuuVar.f;
                vum vumVar = vukVar2.g;
                vumVar.d = yyqVar;
                avlh avlhVarD = vumVar.c.d();
                vwt vwtVar2 = vumVar.e;
                byte[] bArr = null;
                vwtVar2.D(new vtq(vumVar, avlhVar5, avlhVarD, 2, bArr));
                vwtVar2.D(new vtq(vumVar, avlhVar4, avlhVarD, 3, bArr));
                vwtVar2.D(new vtq(vumVar, avlhVarD, yyqVar, 4));
                vuw vuwVar = vukVar2.d;
                vwt vwtVar3 = vuwVar.d;
                avlh avlhVar6 = vukVar2.n;
                byte[] bArr2 = null;
                vwtVar3.D(new tsn(vuwVar, avlhVar2, 11, bArr2));
                vwtVar3.D(new tsn(vuwVar, avlhVar3, 12, bArr2));
                vwtVar3.D(new tsn(vuwVar, avlhVar6, 13, bArr2));
                final vtt vttVar = vukVar2.h;
                final avlh avlhVar7 = vukVar2.j;
                avlh avlhVar8 = vukVar2.k;
                vttVar.f = interceptTouchListenerLinearLayout3.findViewById(R.id.arrow_drag_handle);
                vttVar.f.setOnClickListener(new vhv(vttVar.d, 10));
                final View view = vttVar.f;
                if (view != null) {
                    final boolean zL = vttVar.l.l(218, 45818032L, false);
                    final int iC = twm.c(view.getContext().getResources().getDisplayMetrics(), 52);
                    final View view2 = (View) view.getParent();
                    view2.post(new Runnable() { // from class: vtn
                        @Override // java.lang.Runnable
                        public final void run() {
                            Rect rect = new Rect();
                            View view3 = view;
                            view3.getHitRect(rect);
                            int i7 = iC;
                            if (zL) {
                                int iHeight = i7 - rect.height();
                                if (iHeight > 0) {
                                    rect.bottom += iHeight;
                                }
                                int iWidth = i7 - rect.width();
                                if (iWidth > 0) {
                                    rect.left -= iWidth >> 1;
                                    rect.right += (iWidth + 1) / 2;
                                }
                            } else {
                                rect.bottom = Math.max(i7, rect.height());
                            }
                            view2.setTouchDelegate(new TouchDelegate(rect, view3));
                        }
                    });
                }
                vttVar.g = avlhVar4;
                final Context context2 = interceptTouchListenerLinearLayout3.getContext();
                vttVar.h = new vtr(context2);
                vttVar.i = new vts(context2);
                final int iC2 = twm.c(context2.getResources().getDisplayMetrics(), 528);
                final avlr avlrVarR2 = relativeLayout3.getParent() != null ? tuk.g((View) relativeLayout3.getParent(), avmbVar2).r() : avlr.J(new Rect(0, 0, 0, 0));
                vwt vwtVar4 = vttVar.o;
                vwtVar4.D(new Callable() { // from class: vtp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final vtt vttVar2 = vttVar;
                        avlr avlrVar = vttVar2.c;
                        avlh avlhVar9 = avlhVar7;
                        vxz vxzVar2 = vttVar2.m;
                        avlh avlhVarX = avlh.h(vttVar2.b.d(), tzk.X(avlrVar, avlhVar9, vttVar2.j, vxzVar2.m(25, 45689881L)), avlrVarR2.g(avla.e), avlhVar9, new vth(2)).x(new sqj(15));
                        final Context context3 = context2;
                        final int i7 = iC2;
                        final ViewGroup viewGroup4 = interceptTouchListenerLinearLayout3;
                        final ViewGroup viewGroup5 = viewGroup3;
                        return avlhVarX.ak(new avni() { // from class: vto
                            @Override // defpackage.avni
                            public final void a(Object obj) {
                                vvl vvlVar = (vvl) obj;
                                int iWidth = vvlVar.d.width();
                                agev agevVar = vvlVar.c;
                                int iR = ((vob) agevVar.c()).R();
                                int i8 = i7;
                                Context context4 = context3;
                                boolean zF = vpo.f(context4, iWidth, iR, i8);
                                int iS = ((vob) agevVar.c()).S();
                                vtt vttVar3 = vttVar2;
                                boolean z5 = false;
                                if (vttVar3.l.l(237, 45828593L, false) && iS == 2) {
                                    z5 = true;
                                }
                                ViewGroup viewGroup6 = viewGroup5;
                                ViewGroup viewGroup7 = viewGroup4;
                                vpo.g(context4, vvlVar.a, vvlVar.b, false, zF, viewGroup7, viewGroup6, vttVar3.k, z5);
                            }
                        });
                    }
                });
                vwtVar4.D(new tsp(vttVar, 15));
                int i7 = 0;
                if (vttVar.n.l(204, 45685365L, false)) {
                    vwtVar4.D(new vtq(vttVar, avlhVar8, context2, i7));
                }
                vwt vwtVar5 = vukVar2.v;
                vwtVar5.D(new tsp(vukVar2, 16));
                vwtVar5.D(new tsn(vukVar2, interceptTouchListenerLinearLayout3, 10, null));
                tqj tqjVar = vukVar2.r;
                int i8 = tqr.a;
                if (tqjVar.k(1073830144)) {
                    vwtVar5.G(new vtu(vukVar2.s, 2));
                } else {
                    vwtVar5.D(new tsp(vukVar2, 17));
                }
                avlhVar4.x(new sqj(8)).ak(new var(this, 17));
                if (this.P.l(215, 45816760L, false)) {
                    avlhVar6.ak(new var(this, 18));
                }
                if (this.Q.l(1, 45615449L, false)) {
                    Object obj = this.U.a;
                }
                vtj vtjVar = vukVar2.e;
                vtjVar.b.D(new tsn(vtjVar, avlh.h(vukVar2.l, avlhVar6, vukVar2.m, avlhVar8, new vth(0)), 9, null));
                interceptTouchListenerLinearLayout.a(vtjVar);
                i = 1;
                this.m = true;
            }
            vny vnyVarT = vobVar2.T();
            E(vobVar2, vnyVarT);
            vot votVar = votVarA;
            votVar.e = ajwoVar;
            vobVar2.ag(vnzVar);
            votVar.b(i);
            this.P.l(160, 45737471L, false);
            if (vnyVarT != null) {
                this.d.f(vnyVarT.c(this.i.getContext()));
            }
            this.d.e(vobVar2.c());
            char c = true != this.L ? (char) 2 : (char) 1;
            vpc vpcVar2 = this.b;
            char c2 = true != z ? (char) 1 : (char) 2;
            String str2 = votVar.a;
            if (ahno.aa(str2)) {
                vnyVar = vnyVarT;
                vobVar = vobVar2;
            } else {
                vog vogVar2 = vpcVar2.b;
                vogVar2.e();
                ArrayDeque arrayDeque = vpcVar2.a;
                xsc xscVar2 = (xsc) arrayDeque.peek();
                if (xscVar2 != null) {
                    vot votVarI = xscVar2.i();
                    String str3 = votVarI.a;
                    if (str2.equals(str3)) {
                        if (!Objects.equals(votVar, votVarI)) {
                            vogVar2.e();
                            vogVar2.h(votVar);
                            xscVar2.j();
                            xscVar2.o(votVar, true);
                        }
                        vnyVar = vnyVarT;
                        vobVar = vobVar2;
                    } else {
                        Iterator it = arrayDeque.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                xsc xscVar3 = (xsc) it.next();
                                if (xscVar3.q(str2)) {
                                    if (xscVar3 != xscVar2) {
                                        vobVar = vobVar2;
                                        vnyVar = vnyVarT;
                                        if (vpcVar2.e.l(170, 45745677L, false) && c2 == 1) {
                                            xscVar3.p(str2);
                                            if (xscVar3.h() == 0) {
                                                arrayDeque.remove(xscVar3);
                                            }
                                            c2 = 1;
                                            xscVar = (xsc) arrayDeque.peek();
                                            if (xscVar != null || c2 == 2) {
                                                arrayDeque.push(xsc.s(votVar, true));
                                                vpcVar2.c.kk(agev.h(vobVar));
                                                if (xscVar != null || c == 2) {
                                                    vogVar2.h(votVar);
                                                } else {
                                                    vogVar2.k(xscVar.i(), votVar, vpc.k(votVar));
                                                }
                                                if (xscVar != null) {
                                                    if (vpcVar2.e.l(164, 45739594L, false)) {
                                                        vpcVar2.n(xscVar);
                                                    }
                                                    xscVar.m();
                                                }
                                            } else {
                                                vot votVarI2 = xscVar.i();
                                                votVarI2.b(3);
                                                xscVar.o(votVar, true);
                                                if (c == 1) {
                                                    vogVar2.k(votVarI2, votVar, 3);
                                                } else {
                                                    vogVar2.h(votVar);
                                                }
                                            }
                                        } else {
                                            arrayDeque.remove(xscVar3);
                                            arrayDeque.push(xscVar3);
                                        }
                                    } else {
                                        vnyVar = vnyVarT;
                                        vobVar = vobVar2;
                                    }
                                    if (!Objects.equals(votVar, votVarI)) {
                                        boolean zQ = xscVar3.q(str3);
                                        xscVar3.n(str2);
                                        if (c != 1) {
                                            vogVar2.h(votVar);
                                        } else if (zQ) {
                                            vogVar2.j(votVarI, votVar, 3);
                                        } else {
                                            vogVar2.k(votVarI, votVar, vpc.k((vot) xscVar3.b));
                                        }
                                        votVar.b(2);
                                    }
                                    if (xscVar3 != xscVar2) {
                                        if (vpcVar2.e.l(164, 45739594L, false)) {
                                            vpcVar2.n(xscVar2);
                                        }
                                        xscVar2.m();
                                        vpcVar2.c.kk(agev.i(((vot) xscVar3.b).b));
                                    }
                                }
                            } else {
                                vnyVar = vnyVarT;
                                vobVar = vobVar2;
                                xscVar = (xsc) arrayDeque.peek();
                                if (xscVar != null) {
                                    arrayDeque.push(xsc.s(votVar, true));
                                    vpcVar2.c.kk(agev.h(vobVar));
                                    if (xscVar != null) {
                                        vogVar2.h(votVar);
                                    } else {
                                        vogVar2.h(votVar);
                                    }
                                    if (xscVar != null) {
                                        if (vpcVar2.e.l(164, 45739594L, false)) {
                                            vpcVar2.n(xscVar);
                                        }
                                        xscVar.m();
                                    }
                                } else {
                                    arrayDeque.push(xsc.s(votVar, true));
                                    vpcVar2.c.kk(agev.h(vobVar));
                                    if (xscVar != null) {
                                        vogVar2.h(votVar);
                                    } else {
                                        vogVar2.h(votVar);
                                    }
                                    if (xscVar != null) {
                                        if (vpcVar2.e.l(164, 45739594L, false)) {
                                            vpcVar2.n(xscVar);
                                        }
                                        xscVar.m();
                                    }
                                }
                            }
                        }
                    }
                } else {
                    vnyVar = vnyVarT;
                    vobVar = vobVar2;
                    xscVar = (xsc) arrayDeque.peek();
                    if (xscVar != null) {
                        arrayDeque.push(xsc.s(votVar, true));
                        vpcVar2.c.kk(agev.h(vobVar));
                        if (xscVar != null) {
                            vogVar2.h(votVar);
                        } else {
                            vogVar2.h(votVar);
                        }
                        if (xscVar != null) {
                            if (vpcVar2.e.l(164, 45739594L, false)) {
                                vpcVar2.n(xscVar);
                            }
                            xscVar.m();
                        }
                    } else {
                        arrayDeque.push(xsc.s(votVar, true));
                        vpcVar2.c.kk(agev.h(vobVar));
                        if (xscVar != null) {
                            vogVar2.h(votVar);
                        } else {
                            vogVar2.h(votVar);
                        }
                        if (xscVar != null) {
                            if (vpcVar2.e.l(164, 45739594L, false)) {
                                vpcVar2.n(xscVar);
                            }
                            xscVar.m();
                        }
                    }
                }
            }
            if (vnyVar != null) {
                vorVar = this;
                vnyVar.r(new yhi(vorVar, votVar.a));
            } else {
                vorVar = this;
            }
            aihl aihlVarCheckIsLite15 = aihn.checkIsLite(apxs.b);
            ajwoVar.c(aihlVarCheckIsLite15);
            if (ajwoVar.j.n(aihlVarCheckIsLite15.d)) {
                aihl aihlVarCheckIsLite16 = aihn.checkIsLite(apxs.b);
                ajwoVar.c(aihlVarCheckIsLite16);
                Object objK9 = ajwoVar.j.k(aihlVarCheckIsLite16.d);
                apxs apxsVar3 = (apxs) (objK9 == null ? aihlVarCheckIsLite16.b : aihlVarCheckIsLite16.c(objK9));
                if ((apxsVar3.c & SemanticState.Focused) != 0) {
                    akum akumVar2 = apxsVar3.m;
                    if (akumVar2 == null) {
                        akumVar2 = akum.a;
                    }
                    if (((akumVar2.b == 1 ? (akuq) akumVar2.c : akuq.a).b & 1) != 0) {
                        boolean z5 = (akumVar2.b == 1 ? (akuq) akumVar2.c : akuq.a).c;
                    }
                }
            } else {
                aihl aihlVarCheckIsLite17 = aihn.checkIsLite(apxt.b);
                ajwoVar.c(aihlVarCheckIsLite17);
                if (ajwoVar.j.n(aihlVarCheckIsLite17.d)) {
                    aihl aihlVarCheckIsLite18 = aihn.checkIsLite(apxt.b);
                    ajwoVar.c(aihlVarCheckIsLite18);
                    Object objK10 = ajwoVar.j.k(aihlVarCheckIsLite18.d);
                    apxt apxtVar = (apxt) (objK10 == null ? aihlVarCheckIsLite18.b : aihlVarCheckIsLite18.c(objK10));
                    if ((apxtVar.c & 2) != 0) {
                        boolean z6 = apxtVar.e;
                    }
                }
            }
            akuj akujVarU = vobVar.u();
            if (akujVarU == null) {
                aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihlVarCheckIsLite2 = aihn.checkIsLite(apxs.b);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    if (objK == null) {
                        objC = aihlVarCheckIsLite2.b;
                    } else {
                        objC = aihlVarCheckIsLite2.c(objK);
                    }
                    akumVar = ((apxs) objC).m;
                    if (akumVar == null) {
                        akumVar = akum.a;
                    }
                    if (akumVar.b == 2) {
                        akueVar = (akue) akumVar.c;
                    } else {
                        akueVar = akue.a;
                    }
                    if ((akueVar.b & 1) != 0) {
                        z3 = akueVar.c;
                    } else {
                        z3 = akue.a.c;
                    }
                } else {
                    z3 = akue.a.c;
                }
            } else {
                akum akumVar3 = akujVarU.R;
                if (akumVar3 == null) {
                    akumVar3 = akum.a;
                }
                akue akueVar2 = akumVar3.b == 2 ? (akue) akumVar3.c : akue.a;
                if ((akueVar2.b & 1) != 0) {
                    z3 = akueVar2.c;
                } else {
                    aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                        aihlVarCheckIsLite2 = aihn.checkIsLite(apxs.b);
                        ajwoVar.c(aihlVarCheckIsLite2);
                        objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                        if (objK == null) {
                            objC = aihlVarCheckIsLite2.b;
                        } else {
                            objC = aihlVarCheckIsLite2.c(objK);
                        }
                        akumVar = ((apxs) objC).m;
                        if (akumVar == null) {
                            akumVar = akum.a;
                        }
                        if (akumVar.b == 2) {
                            akueVar = (akue) akumVar.c;
                        } else {
                            akueVar = akue.a;
                        }
                        if ((akueVar.b & 1) != 0) {
                            z3 = akueVar.c;
                        } else {
                            z3 = akue.a.c;
                        }
                    } else {
                        z3 = akue.a.c;
                    }
                }
            }
            vob vobVar3 = vobVar;
            vobVar3.B(z3);
            vorVar.S(votVar);
            vorVar.F(vobVar3);
            if (vorVar.S.m(30, 45712516L)) {
                vorVar.q = vorVar.F.af(new mnt(vorVar, votVar, 8));
            }
            vorVar.l(vobVar3);
            return vobVar3;
        }
        ((agrc) ((agrc) x.b()).k("com/google/android/libraries/youtube/engagementpanel/EngagementPanelControllerImpl", "show", 1093, "EngagementPanelControllerImpl.java")).t("EngagementPanelController: failed to get a valid EngagementPanel instance.");
        P(true);
        return null;
    }

    public final xgn g() {
        vot votVar = (vot) this.b.c().f();
        if (votVar != null) {
            return votVar.b.p();
        }
        return null;
    }

    public final agev h(String str) {
        return agev.h(this.a.a(str)).a(new sdp(15));
    }

    public final agev i() {
        return agev.h((xsc) this.b.a.peek()).a(new sdp(18)).a(new sdp(12));
    }

    public final String k() {
        return (String) this.b.c().a(new sdp(16)).f();
    }

    public final void l(vob vobVar) {
        View viewFindViewById;
        if (this.v.l(244, 45711405L, false) && vobVar.Q() == 3) {
            InterceptTouchListenerLinearLayout interceptTouchListenerLinearLayout = this.H;
            if (interceptTouchListenerLinearLayout != null) {
                interceptTouchListenerLinearLayout.getBackground().setAlpha(0);
            }
            ViewGroup viewGroup = this.I;
            if (viewGroup != null) {
                viewGroup.getBackground().setAlpha(0);
            }
            InterceptTouchListenerLinearLayout interceptTouchListenerLinearLayout2 = (InterceptTouchListenerLinearLayout) this.i.findViewById(R.id.panel_content_touch_wrapper);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) interceptTouchListenerLinearLayout2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.removeRule(3);
                interceptTouchListenerLinearLayout2.setLayoutParams(layoutParams);
            }
        }
        InterceptTouchListenerLinearLayout interceptTouchListenerLinearLayout3 = this.H;
        if (interceptTouchListenerLinearLayout3 == null || (viewFindViewById = interceptTouchListenerLinearLayout3.findViewById(R.id.panel_header_wrapper)) == null) {
            return;
        }
        if (H(vobVar)) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
        }
    }

    public final void m() {
        this.a.d = this;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    public final void n(vob vobVar, boolean z) {
        vob vobVar2 = this.n;
        if (true != z) {
            vobVar = null;
        }
        if (vobVar2 != vobVar) {
            this.n = vobVar;
            if (this.v.l(204, 45685365L, false)) {
                if (vobVar == null) {
                    this.J.a();
                } else {
                    l(vobVar);
                    F(vobVar);
                    ViewGroup viewGroup = this.G;
                    if (viewGroup != null) {
                        boolean zH = H(vobVar);
                        vpg vpgVar = this.J;
                        if (zH) {
                            vpgVar.c(viewGroup, this.i.getContext());
                        } else {
                            vpgVar.a();
                        }
                    }
                }
            }
            abwk abwkVar = this.w;
            vob vobVar3 = this.n;
            abwkVar.d = vobVar3;
            Iterator it = abwkVar.a.iterator();
            while (it.hasNext()) {
                ((vqi) it.next()).a(vobVar3);
            }
            ((awku) abwkVar.b).kk(agev.h(vobVar3));
            if (this.P.l(176, 45757544L, false)) {
                ayq ayqVar = this.V;
                vob vobVar4 = this.n;
                ayqVar.J(vobVar4 != null ? vobVar4.u() : null);
            }
        }
    }

    public final void o(int i) {
        agev agevVarC = this.b.c();
        if (agevVarC.g() && ((vot) agevVarC.c()).b.F()) {
            ((vot) agevVarC.c()).b(i);
        }
        vob vobVar = null;
        if (agevVarC.g() && i == 2) {
            vobVar = ((vot) agevVarC.c()).b;
        }
        n(vobVar, agevVarC.g());
    }

    @Override // defpackage.vpb
    public final void p(agev agevVar) {
        vun vunVar;
        U((vob) agevVar.a(new sdp(13)).f());
        vxz vxzVar = this.P;
        vuk vukVar = this.d;
        vun vunVar2 = vukVar.u;
        if (vxzVar.l(24, 45627625L, false) && vunVar2 != (vunVar = vun.d)) {
            vukVar.f.a(vunVar);
        }
        n(null, false);
        tuk.h(this.c);
    }

    public final void q(wgi wgiVar) {
        ajlj ajljVar;
        amae amaeVar = wgiVar.a;
        agke agkeVarN = agke.n(amaeVar.r);
        agke agkeVarN2 = agke.n(amaeVar.s);
        apji apjiVar = amaeVar.t;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        voh vohVar = new voh(agkeVarN, agkeVarN2, apjiVar);
        agke agkeVar = vohVar.a;
        if (agkeVar != null && !agkeVar.isEmpty()) {
            R(agkeVar);
        }
        agke agkeVar2 = vohVar.b;
        if (agkeVar2 != null && !agkeVar2.isEmpty()) {
            R(agkeVar2);
        }
        apji apjiVar2 = vohVar.c;
        if (apjiVar2 == null || (ajljVar = (ajlj) aavv.s(apjiVar2, ajlk.a)) == null || !ajljVar.i) {
            return;
        }
        apji apjiVar3 = ajljVar.d;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aitn.a);
        apjiVar3.c(aihlVarCheckIsLite);
        Object objK = apjiVar3.j.k(aihlVarCheckIsLite.d);
        R(((aitm) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c);
    }

    @Override // defpackage.vpb
    public final void r(agev agevVar) {
        if (agevVar.g()) {
            vot votVar = (vot) agevVar.c();
            vob vobVar = votVar.b;
            vny vnyVarT = vobVar.T();
            if (vnyVarT != null) {
                D(H(vobVar), vnyVarT.p());
                F(vobVar);
                l(vobVar);
                this.d.f(vnyVarT.c(this.i.getContext()));
            }
            this.d.e(vobVar.c());
            S(votVar);
        }
    }

    @Override // defpackage.vpb
    public final void s(agev agevVar) {
        vot votVar;
        ajwo ajwoVar;
        if (this.R.l(5, 45363147L, false) && agevVar.g() && this.b.j() && (ajwoVar = (votVar = (vot) agevVar.c()).e) != null) {
            votVar.e = T(ajwoVar, this.z.i());
        }
    }

    public final void t() {
        v(new bym(19), true);
    }

    public final void u(boolean z) {
        while (k() != null) {
            v(agez.a, z);
        }
    }

    public final void v(agex agexVar, boolean z) {
        vpc vpcVar = this.b;
        if (vpcVar.a() != 0) {
            String strK = k();
            if (strK == null || agexVar.a(strK)) {
                agev agevVarF = vpcVar.f();
                vxz vxzVar = this.v;
                if (vxzVar.l(283, 45728364L, false)) {
                    s(agevVarF);
                } else if (this.R.l(5, 45363147L, false) && agevVarF.g() && vpcVar.j()) {
                    vot votVar = (vot) agevVarF.c();
                    votVar.e = T(votVar.e, this.z.i());
                }
                if (!vpcVar.l(2 >>> (z ? 1 : 0))) {
                    P(z);
                    return;
                }
                if (vxzVar.l(283, 45728364L, false)) {
                    r(agevVarF);
                    return;
                }
                if (agevVarF.g()) {
                    vot votVar2 = (vot) agevVarF.c();
                    vob vobVar = votVar2.b;
                    vny vnyVarT = vobVar.T();
                    if (vnyVarT != null) {
                        D(H(vobVar), vnyVarT.p());
                        F(vobVar);
                        l(vobVar);
                        this.d.f(vnyVarT.c(this.i.getContext()));
                    }
                    this.d.e(vobVar.c());
                    S(votVar2);
                }
            }
        }
    }

    public final void w(akuj akujVar) {
        boolean z = false;
        if ((akujVar.c & 4194304) != 0 && akujVar.B) {
            z = true;
        }
        x(akujVar, null, z, null, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [vns] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, wrp] */
    /* JADX WARN: Type inference failed for: r5v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, wnf] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, wrp] */
    /* JADX WARN: Type inference failed for: r5v8, types: [wnf] */
    /* JADX WARN: Type inference failed for: r9v3, types: [vns] */
    public final void x(akuj akujVar, amdd amddVar, boolean z, ajwo ajwoVar, boolean z2, adxd adxdVar) {
        vob vobVarA;
        Object obj;
        ?? r5;
        wrq wrqVarA;
        vob vobVar;
        String strAa = tzk.aa(akujVar);
        if (ahno.aa(strAa)) {
            return;
        }
        if (z || !this.a.c(strAa)) {
            vov vovVar = this.a;
            vot votVarA = vovVar.c(strAa) ? vovVar.a(strAa) : null;
            boolean z3 = false;
            if (votVarA != null) {
                vob vobVar2 = votVarA.b;
                if (vobVar2.I(akujVar, ajwoVar)) {
                    if (ajwoVar != null) {
                        votVarA.e = ajwoVar;
                    }
                    if (this.P.l(176, 45757544L, false) && vobVar2 == (vobVar = this.n)) {
                        this.V.J(vobVar.u());
                        return;
                    }
                    return;
                }
            }
            boolean zN = N(ajwoVar);
            wvz wvzVarCc = zik.cc(akujVar);
            jnm jnmVar = this.W;
            if (wvzVarCc != null) {
                vobVarA = (vob) jnmVar.c.io();
            } else {
                int iAV = a.aV(akujVar.s);
                if (iAV == 0) {
                    iAV = 1;
                }
                int i = iAV - 1;
                if (i == 2) {
                    vobVarA = ((vns) jnmVar.d).a(jnmVar.a, false);
                } else if (i != 3) {
                    Object obj2 = jnmVar.d;
                    if (z2) {
                        wrqVarA = jnmVar.b.a(zN);
                    } else {
                        obj = jnmVar.a;
                    }
                    if (z2 && zN) {
                        z3 = true;
                    }
                    r5 = obj;
                    r5 = wrqVarA;
                    vobVarA = ((vns) obj2).a(r5, z3);
                } else {
                    vobVarA = ((vns) jnmVar.d).a(jnmVar.b.a(zN), zN);
                }
            }
            boolean z4 = vovVar.c;
            vobVarA.A(akujVar, amddVar, adxdVar);
            if (!z4) {
                vobVarA.V(new jao(strAa, 6));
            }
            vou vouVar = (vou) vovVar.a.put(strAa, new vou(vovVar, strAa, vobVarA));
            if (vouVar != null) {
                vouVar.c();
            }
        }
    }

    public final void y(String str) {
        vpc vpcVar = this.b;
        ArrayDeque arrayDeque = vpcVar.a;
        if (arrayDeque.isEmpty() || ahno.aa(str)) {
            return;
        }
        agev agevVarC = vpcVar.c();
        if (agevVarC.g() && ((vot) agevVarC.c()).a.equals(str)) {
            agev agevVarF = vpcVar.f();
            vpcVar.d.s(agevVarF);
            if (vpcVar.l(1)) {
                vpcVar.d.r(agevVarF);
                return;
            } else {
                vpcVar.i();
                vpcVar.d.p(agevVarC);
                return;
            }
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            xsc xscVar = (xsc) it.next();
            if (xscVar.q(str)) {
                xscVar.p(str);
                if (xscVar.h() == 0) {
                    it.remove();
                    return;
                }
                return;
            }
        }
    }

    public final void z(String str) {
        zvl zvlVar = this.M;
        if (zvlVar != null) {
            zvj zvjVarA = zvk.a();
            zvjVarA.j = 50;
            zvjVarA.i = 70;
            zvjVarA.d(str);
            zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
            zvlVar.a(zvjVarA.a());
        }
    }
}

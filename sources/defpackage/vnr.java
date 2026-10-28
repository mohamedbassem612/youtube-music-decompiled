package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vnr extends vnb implements voa {
    public final vwt A;
    ayq B;
    public final dov C;
    public final afip D;
    public final hed E;
    private final Context F;
    private final wrp G;
    private boolean H;
    private wrq I;
    private final awmd J;
    private final awmd K;
    private final vxe L;
    private final Set M;
    private final Set N;
    private final Set O;
    private final vpf P;
    private final avmm Q;
    private final vpq R;
    private final Set S;
    private final avmr T;
    private final Optional U;
    private final aunn V;
    private FrameLayout W;
    private Drawable X;
    private FrameLayout Y;
    private vnz Z;
    public final wnf a;
    private boolean aa;
    private boolean ab;
    private apof ac;
    private adxd ad;
    private vrp ae;
    private final Set af;
    private final awmd ag;
    private aecp ah;
    private final vxz ai;
    private final ahrn aj;
    private final vwt ak;
    private final afip al;
    private final aerj am;
    private final abxv an;
    private final axfd ao;
    public final tbt b;
    public final vps c;
    public final vrn d;
    public LoadingFrameLayout h;
    public StickyHeaderContainer i;
    public vnx j;
    public vny k;
    public String l;
    public vro m;
    public Optional n;
    public avmn o;
    View.OnAttachStateChangeListener p;
    public final boolean q;
    aeei r;
    public final tth s;
    public final vxz t;
    public final vxz u;
    public final vxz v;
    public final xgg w;
    public final zpw x;
    public final abxu y;
    public final afwv z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnr(Context context, xgn xgnVar, abxu abxuVar, awmd awmdVar, awmd awmdVar2, afip afipVar, axfd axfdVar, Set set, awmd awmdVar3, ahrn ahrnVar, vwt vwtVar, tbt tbtVar, vxe vxeVar, vpf vpfVar, vps vpsVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, afwv afwvVar, aerj aerjVar, dov dovVar, abxv abxvVar, xgg xggVar, afip afipVar2, hed hedVar, zpw zpwVar, vrn vrnVar, vwt vwtVar2, abxv abxvVar2, Optional optional, vxz vxzVar4, aunn aunnVar, tth tthVar, Optional optional2, Set set2, wrp wrpVar, wnf wnfVar, boolean z) {
        super(xgnVar);
        vpq vpqVarY = abxvVar.y(xgnVar);
        boolean zBooleanValue = ((Boolean) optional2.orElse(Boolean.FALSE)).booleanValue();
        this.N = new HashSet();
        this.T = new avmr();
        this.n = Optional.empty();
        this.F = context;
        this.t = vxzVar;
        this.ai = vxzVar2;
        this.u = vxzVar3;
        this.y = abxuVar;
        this.J = awmdVar;
        this.K = awmdVar2;
        this.al = afipVar;
        this.ao = axfdVar;
        this.af = set;
        this.ag = awmdVar3;
        this.aj = ahrnVar;
        this.a = wnfVar;
        this.G = wrpVar;
        this.H = z;
        this.ak = vwtVar;
        this.b = tbtVar;
        this.L = vxeVar;
        this.P = vpfVar;
        this.c = vpsVar;
        this.z = afwvVar;
        this.O = set2;
        this.M = new afx(0);
        this.Q = new avmm();
        context.getResources().getDimensionPixelSize(R.dimen.engagement_panel_scroll_cancel_padding);
        this.aa = true;
        this.R = vpqVarY;
        this.am = aerjVar;
        this.C = dovVar;
        this.w = xggVar;
        this.D = afipVar2;
        this.E = hedVar;
        this.x = zpwVar;
        this.d = vrnVar;
        this.A = vwtVar2;
        this.an = abxvVar2;
        this.U = optional;
        this.v = vxzVar4;
        this.V = aunnVar;
        this.s = tthVar;
        this.q = zBooleanValue;
        this.S = new HashSet();
    }

    private final void aA(int i, ConstraintLayout constraintLayout) {
        FrameLayout frameLayout;
        if (this.i == null || (frameLayout = this.W) == null || constraintLayout == null) {
            return;
        }
        if (i == 2) {
            frameLayout.setBackground(null);
            this.W.setClipToPadding(false);
            asl aslVar = new asl();
            aslVar.c(constraintLayout);
            aslVar.j(R.id.content_overlay, R.id.footer, 4);
            aslVar.j(R.id.content, R.id.footer, 4);
            aslVar.b(constraintLayout);
            return;
        }
        frameLayout.setBackground(this.X);
        this.W.setClipToPadding(true);
        asl aslVar2 = new asl();
        aslVar2.c(constraintLayout);
        aslVar2.j(R.id.content_overlay, R.id.footer, 3);
        aslVar2.j(R.id.content, R.id.footer, 3);
        aslVar2.b(constraintLayout);
    }

    private final void aB(aksk akskVar, int i) {
        adxd adxdVar;
        if (this.j == null) {
            if (akskVar == null) {
                return;
            }
            vnw vnwVarL = this.ao.L(this.e, this.g, new vnl(this, 0));
            this.j = vnwVarL;
            FrameLayout frameLayout = this.W;
            if (frameLayout != null) {
                frameLayout.addView(vnwVarL.a);
                ar();
            }
        }
        b(this.j);
        if (akskVar == null || (adxdVar = this.ad) == null) {
            adxdVar = null;
        } else {
            this.ad = null;
        }
        vnx vnxVar = this.j;
        vro vroVar = this.m;
        vnxVar.g(akskVar, vroVar != null ? (adwq) vroVar.h().f() : null, adxdVar);
        ((vnw) this.j).d = i;
    }

    private final vrp aC() {
        return (vrp) Collection.EL.stream(this.af).filter(new uvm(11)).findFirst().orElse(null);
    }

    private final vro af(akuj akujVar) {
        vro vroVarA;
        int iAV;
        akuh akuhVar = akujVar.h;
        if (akuhVar == null) {
            akuhVar = akuh.a;
        }
        Object objA = (!this.u.l(173, 45748247L, false) || (akujVar.c & SemanticState.Multiline) == 0 || (iAV = a.aV(akujVar.s)) == 0 || iAV != 4) ? this.a : this.G.a(this.H);
        if (objA instanceof wrq) {
            this.I = (wrq) objA;
        } else {
            this.I = null;
        }
        int i = akuhVar.b;
        if (i == 49399797) {
            return ah(new uqq(this, objA, 2), (apoq) akuhVar.c);
        }
        if ((i == 290136234 ? (akuk) akuhVar.c : akuk.a).b.size() > 0) {
            return ah(new uqq(this, objA, 3), akuhVar.b == 290136234 ? (akuk) akuhVar.c : akuk.a);
        }
        int i2 = akuhVar.b;
        if (i2 == 371777145) {
            return ah(new rzt(this, 16), (akzv) akuhVar.c);
        }
        if (i2 == 449330433) {
            return ah(new rzt(this, 17), (arkm) akuhVar.c);
        }
        if (i2 == 2421) {
            return ah(new rzt(this, 18), (aitl) akuhVar.c);
        }
        if (i2 == 91613400) {
            return ah(new rzt(this, 19), (aovg) akuhVar.c);
        }
        if (i2 == 153515154) {
            return ah(new rzt(this, 20), (akrn) akuhVar.c);
        }
        vrp vrpVarAC = aC();
        if (vrpVarAC == null || (vroVarA = vrpVarAC.c().a()) == null) {
            return null;
        }
        return ah(new vnn(vroVarA, 1), akuhVar);
    }

    private final vro ah(Supplier supplier, Object obj) {
        vro vroVar = (vro) supplier.get();
        Iterator it = this.S.iterator();
        while (it.hasNext()) {
            vroVar.i((adlz) it.next());
        }
        if (this.h != null) {
            vroVar.q();
        }
        vroVar.j(obj, false, null);
        return vroVar;
    }

    private static apof ai(ajwo ajwoVar) {
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
            if (apxqVar.b == 3) {
                apxq apxqVar2 = apxsVar.n;
                if (apxqVar2 == null) {
                    apxqVar2 = apxq.a;
                }
                return apxqVar2.b == 3 ? (apof) apxqVar2.c : apof.a;
            }
        } else {
            aihl aihlVar = aqnn.b;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite4);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                aqnn aqnnVar = (aqnn) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                apxq apxqVar3 = aqnnVar.f;
                if (apxqVar3 == null) {
                    apxqVar3 = apxq.a;
                }
                if (apxqVar3.b == 3) {
                    apxq apxqVar4 = aqnnVar.f;
                    if (apxqVar4 == null) {
                        apxqVar4 = apxq.a;
                    }
                    return apxqVar4.b == 3 ? (apof) apxqVar4.c : apof.a;
                }
            }
        }
        return null;
    }

    private final Object aj(Class cls) {
        if (cls.isInstance(this.m)) {
            return cls.cast(this.m);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01de  */
    /* JADX WARN: Code duplicated, block: B:91:0x019b  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Set] */
    private final void ak(akuj akujVar) {
        String str;
        String strG;
        LoadingFrameLayout loadingFrameLayout;
        Object obj;
        RecyclerView recyclerView;
        this.L.b(akujVar.u);
        vps vpsVar = this.c;
        if (!vpsVar.c && (recyclerView = vpsVar.a) != null) {
            vpsVar.c = true;
            recyclerView.aC(vpsVar);
        }
        avmm avmmVar = this.Q;
        avmmVar.b();
        String strAa = tzk.aa(akujVar);
        if (strAa != null) {
            ayq ayqVar = this.B;
            String str2 = (String) Objects.requireNonNullElse(ayqVar != null ? ayqVar.I(this.m) : null, strAa);
            av(az(akujVar));
            Optional optionalF = f();
            int i = 0;
            if (optionalF.isPresent()) {
                akuh akuhVar = akujVar.h;
                if (akuhVar == null) {
                    akuhVar = akuh.a;
                }
                if (((akuhVar.b == 49399797 ? (apoq) akuhVar.c : apoq.a).c & 131072) == 0 || (loadingFrameLayout = this.h) == null) {
                    str = str2;
                } else {
                    afwv afwvVar = this.z;
                    RecyclerView recyclerView2 = (RecyclerView) optionalF.get();
                    vxz vxzVar = (vxz) afwvVar.a;
                    str = str2;
                    if (!vxzVar.l(91, 45660282L, false)) {
                        Object obj2 = afwvVar.c;
                        ((vqg) obj2).u();
                        ((vpt) obj2).m(loadingFrameLayout, recyclerView2);
                        afwvVar.b(akujVar);
                        akuh akuhVar2 = akujVar.h;
                        if (akuhVar2 == null) {
                            akuhVar2 = akuh.a;
                        }
                        apom apomVar = (akuhVar2.b == 49399797 ? (apoq) akuhVar2.c : apoq.a).n;
                        if (apomVar == null) {
                            apomVar = apom.a;
                        }
                        int iAV = a.aV(apomVar.d);
                        if (iAV == 0) {
                            iAV = 1;
                        }
                        if (vxzVar.l(95, 45661351L, false) && iAV == 4) {
                            Optional optional = (Optional) afwvVar.b;
                            if (true == optional.isPresent()) {
                                avju avjuVar = (avju) optional.get();
                                avjuVar.c();
                                avjuVar.b = 0;
                            }
                            afwvVar.b = Optional.of(new avju(recyclerView2));
                        }
                        afwvVar.c(akujVar);
                    } else if ((akujVar.c & 4) != 0) {
                        akuh akuhVar3 = akujVar.h;
                        if (akuhVar3 == null) {
                            akuhVar3 = akuh.a;
                        }
                        if (akuhVar3.b == 49399797) {
                            Object obj3 = afwvVar.c;
                            ((vqg) obj3).u();
                            akuh akuhVar4 = akujVar.h;
                            if (akuhVar4 == null) {
                                akuhVar4 = akuh.a;
                            }
                            apoq apoqVar = akuhVar4.b == 49399797 ? (apoq) akuhVar4.c : apoq.a;
                            apom apomVar2 = apoqVar.n;
                            if (apomVar2 == null) {
                                apomVar2 = apom.a;
                            }
                            int iAV2 = a.aV(apomVar2.d);
                            if (iAV2 == 0) {
                                iAV2 = 1;
                            }
                            if (iAV2 == 4 || iAV2 == 3) {
                                afwvVar.a();
                            }
                            if (vxzVar.l(95, 45661351L, false) && iAV2 == 4) {
                                Optional optional2 = (Optional) afwvVar.b;
                                if (true == optional2.isPresent()) {
                                    avju avjuVar2 = (avju) optional2.get();
                                    avjuVar2.c();
                                    avjuVar2.b = 0;
                                }
                                afwvVar.b = Optional.of(new avju(recyclerView2));
                            }
                            if (vxzVar.l(91, 45660282L, false) && iAV2 == 4) {
                                obj = obj3;
                                apoq apoqVar2 = apoqVar;
                                ((Optional) afwvVar.b).ifPresentOrElse(new hnw(afwvVar, apoqVar2, (FrameLayout) loadingFrameLayout, recyclerView2, 5), new mrh(afwvVar, loadingFrameLayout, recyclerView2, apoqVar2, 20));
                            } else {
                                obj = obj3;
                                ((vpt) obj).m(loadingFrameLayout, recyclerView2);
                                afwvVar.c(akujVar);
                            }
                            if (afwvVar.e()) {
                                ((vpt) obj).r();
                            }
                        }
                    }
                }
            } else {
                str = str2;
            }
            vpf vpfVar = this.P;
            if ((akujVar.c & 4) == 0) {
                strG = vpf.a;
            } else {
                akuh akuhVar5 = akujVar.h;
                if (akuhVar5 == null) {
                    akuhVar5 = akuh.a;
                }
                if (akuhVar5.b == 49399797) {
                    akuh akuhVar6 = akujVar.h;
                    if (akuhVar6 == null) {
                        akuhVar6 = akuh.a;
                    }
                    apoq apoqVar3 = akuhVar6.b == 49399797 ? (apoq) akuhVar6.c : apoq.a;
                    strG = (apoqVar3 == null || (apoqVar3.c & 524288) == 0) ? vpf.a : wfs.g(amwh.b.a(), apoqVar3.p);
                } else {
                    strG = vpf.a;
                }
            }
            avlr avlrVarO = vpfVar.b.c().j(strG, true).B(new sqj(10)).K(new uxe(6)).h(amwf.class).B(new sqj(11)).l(new vpe()).K(new uxe(7)).O(vpfVar.c);
            avla avlaVar = avla.e;
            avmmVar.c(avlrVarO.g(avlaVar).i(new tyc(((vqg) this.z.c).q.r().g(avlaVar), i)).x(new hhw(str, 20)).ak(new var(this, 15)));
            if (akujVar.A) {
                this.ak.a.add(strAa);
            }
            if (this.ai.l(15, 45400573L, false)) {
                return;
            }
            Optional optionalF2 = f();
            if (true == optionalF2.isPresent()) {
            }
        }
    }

    private final void al() {
        am();
        this.M.clear();
        this.N.clear();
        vro vroVar = this.m;
        if (vroVar != null) {
            vroVar.c();
            this.m = null;
        }
        this.ae = null;
        StickyHeaderContainer stickyHeaderContainer = this.i;
        if (stickyHeaderContainer != null) {
            stickyHeaderContainer.removeAllViews();
        }
        this.b.l(this);
    }

    private final void am() {
        if (this.ai.l(182, 45834706L, false)) {
            adxd adxdVar = this.ad;
            if (adxdVar instanceof vnu) {
                ((vnu) adxdVar).a.d();
            }
        }
        this.ad = null;
    }

    private final void an(vro vroVar, Supplier supplier, Object obj, vrp vrpVar, boolean z, adxd adxdVar) {
        if (vroVar == null) {
            this.M.retainAll(this.N);
            vro vroVar2 = this.m;
            if (vroVar2 != null) {
                vroVar2.c();
                this.m = null;
            }
            this.ae = null;
            vroVar = (vro) supplier.get();
            if (vroVar == null) {
                return;
            }
            b(vroVar);
            Iterator it = this.S.iterator();
            while (it.hasNext()) {
                vroVar.i((adlz) it.next());
            }
            if (this.h != null) {
                vroVar.q();
            }
        }
        this.m = vroVar;
        this.ae = vrpVar;
        vroVar.j(obj, z, adxdVar);
        if (this.ab) {
            vroVar.f();
            vroVar.e();
        }
    }

    private final void ao() {
        if (this.ah == null) {
            this.ah = this.aj.f(this.e, this.g);
        }
    }

    private final void ap() {
        if (this.h == null) {
            Context context = this.F;
            this.h = new LoadingFrameLayout(context);
            LayoutInflater.from(context).inflate(R.layout.constraint_default_engagement_panel, this.h);
            this.i = (StickyHeaderContainer) this.h.findViewById(R.id.content);
            ConstraintLayout constraintLayout = (ConstraintLayout) this.h.findViewById(R.id.engagement_panel_content);
            FrameLayout frameLayout = (FrameLayout) this.h.findViewById(R.id.footer);
            this.W = frameLayout;
            this.X = frameLayout.getBackground();
            akuj akujVar = this.f;
            if (akujVar != null && new aihx(akujVar.r, akuj.a).contains(akua.ENGAGEMENT_PANEL_SNAP_STATE_WRAP_CONTENT)) {
                StickyHeaderContainer stickyHeaderContainer = this.i;
                if (constraintLayout != null && stickyHeaderContainer != null) {
                    asl aslVar = new asl();
                    aslVar.c(constraintLayout);
                    HashMap map = aslVar.b;
                    Integer numValueOf = Integer.valueOf(R.id.content);
                    if (!map.containsKey(numValueOf)) {
                        map.put(numValueOf, new asg());
                    }
                    ((asg) map.get(numValueOf)).d.e = -2;
                    aslVar.j(R.id.content_overlay, R.id.content, 4);
                    constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    aslVar.b(constraintLayout);
                }
            }
            if (akujVar != null) {
                int iAU = a.aU(akujVar.k);
                if (iAU == 0) {
                    iAU = 1;
                }
                aA(iAU, constraintLayout);
            }
            if (this.q) {
                vnp vnpVar = new vnp(this, this.W);
                this.p = vnpVar;
                this.W.addOnAttachStateChangeListener(vnpVar);
            }
            vnx vnxVar = this.j;
            if (vnxVar != null) {
                this.W.addView(((vnw) vnxVar).a);
            }
            ao();
            FrameLayout frameLayout2 = (FrameLayout) this.h.findViewById(R.id.content_overlay);
            this.Y = frameLayout2;
            this.ah.b(frameLayout2);
        }
    }

    private final void aq(ajwo ajwoVar, akuj akujVar) {
        if (ajwoVar != null) {
            boolean z = this.ab;
            vpq vpqVar = this.R;
            if (!z) {
                vpqVar.e();
                return;
            }
            vpqVar.c();
            vpqVar.e();
            vpqVar.f(akujVar, this.g);
            vpqVar.d(ajwoVar);
            afw afwVar = new afw((afx) this.M);
            while (afwVar.hasNext()) {
                ((vox) afwVar.next()).e();
            }
        }
    }

    private final void ar() {
        FrameLayout frameLayout = this.W;
        if (frameLayout == null || !this.q) {
            return;
        }
        frameLayout.requestApplyInsets();
    }

    private final void as() {
        apof apofVar = this.ac;
        if (apofVar != null) {
            int i = 1;
            if ((apofVar.b & 1) != 0) {
                k(new vnm(apofVar, i));
            }
            this.ac = null;
        }
    }

    private final void at(akuj akujVar) {
        String strAa;
        if (!this.u.l(154, 45732657L, false) || (strAa = tzk.aa(akujVar)) == null) {
            return;
        }
        vwt vwtVar = this.ak;
        if (vwtVar.j(strAa)) {
            vwtVar.i(strAa);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [bog, java.lang.Object] */
    private final void au() {
        akuj akujVar = this.f;
        akujVar.getClass();
        this.ab = true;
        ak(akujVar);
        afw afwVar = new afw((afx) this.M);
        while (afwVar.hasNext()) {
            vox voxVar = (vox) afwVar.next();
            voxVar.f();
            voxVar.e();
        }
        aerj aerjVar = this.am;
        String strAa = tzk.aa(akujVar);
        if (Objects.equals(strAa, "music-comment-panel")) {
            ((syn) aerjVar.g).f();
            Object obj = aerjVar.b;
            gze gzeVar = (gze) obj;
            gzeVar.a(false);
            gzeVar.f = gzeVar.c.e(gzeVar.d.e()).i(ajxn.class).O(gzeVar.e).af(new gks(obj, 20));
        } else if (strAa != null && strAa.startsWith("samples")) {
            ((syn) aerjVar.g).f();
        }
        ?? r3 = aerjVar.a;
        cf cfVar = (cf) r3;
        cfVar.getWindow().setNavigationBarColor(((Context) r3).getColor(R.color.yt_black1));
        if (((akujVar.e == 18 ? (akud) akujVar.f : akud.a).b & 1) != 0 || akujVar.e == 1) {
            Set set = hbm.a;
            akuc akucVarA = akuc.a((akujVar.e == 18 ? (akud) akujVar.f : akud.a).c);
            if (akucVarA == null) {
                akucVarA = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
            }
            if (set.contains(akucVarA)) {
                ((qe) r3).getOnBackPressedDispatcher().c(r3, (qr) aerjVar.e);
            }
        } else {
            ((qe) r3).getOnBackPressedDispatcher().c(r3, (qr) aerjVar.e);
        }
        akuc akucVarA2 = akuc.a((akujVar.e == 18 ? (akud) akujVar.f : akud.a).c);
        if (akucVarA2 == null) {
            akucVarA2 = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
        }
        if (akucVarA2 == akuc.ENGAGEMENT_PANEL_SURFACE_WATCH) {
            ((jin) aerjVar.c).b = cfVar.findViewById(R.id.watch_engagement_panel_floating_layout);
        } else {
            ((jin) aerjVar.c).b = cfVar.findViewById(R.id.engagement_panel_floating_layout);
        }
        this.ai.l(15, 45400573L, false);
    }

    private final void av(akrn akrnVar) {
        ao();
        this.ah.c(akrnVar);
    }

    private final void aw() {
        if (this.h != null) {
            StickyHeaderContainer stickyHeaderContainer = this.i;
            if (stickyHeaderContainer != null) {
                stickyHeaderContainer.removeAllViews();
            }
            k(new vnm(this, 0));
        }
    }

    private final void ax(akuj akujVar, vro vroVar, ajwo ajwoVar) {
        akuj akujVar2 = this.f;
        Y();
        boolean z = true;
        if (ajwoVar != null && akujVar2 != null) {
            xgn xgnVar = this.e;
            aihh aihhVar = (aihh) ajwoVar.toBuilder();
            aihl aihlVar = aoaq.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            aihf builder = ((aoar) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).toBuilder();
            String strI = xgnVar.i();
            builder.copyOnWrite();
            aoar aoarVar = (aoar) builder.instance;
            strI.getClass();
            aoarVar.b |= 1;
            aoarVar.c = strI;
            int i = akujVar2.D;
            builder.copyOnWrite();
            aoar aoarVar2 = (aoar) builder.instance;
            aoarVar2.b |= 2;
            aoarVar2.d = i;
            aihhVar.e(aihlVar, (aoar) builder.build());
            ajwoVar = (ajwo) aihhVar.build();
        }
        super.A(akujVar, this.g, null);
        if ((akujVar.c & SemanticState.Focused) != 0 && akujVar.m) {
            z = false;
        }
        this.aa = z;
        this.M.retainAll(this.N);
        this.m = vroVar;
        b(vroVar);
        this.z.d();
        aw();
        aq(ajwoVar, akujVar);
        au();
        akui akuiVar = akujVar.g;
        if (akuiVar == null) {
            akuiVar = akui.a;
        }
        g(akuiVar, false);
        W();
    }

    private final boolean ay(ajwo ajwoVar) {
        vro vroVar;
        akuj akujVar;
        apof apofVarAi = ai(ajwoVar);
        return (apofVarAi == null || (vroVar = this.m) == null || (akujVar = this.f) == null || !akujVar.B || (apofVarAi.b & 8) == 0 || !(vroVar instanceof vrx)) ? false : true;
    }

    private static final akrn az(akuj akujVar) {
        if ((akujVar.c & 4) != 0) {
            akuh akuhVar = akujVar.h;
            if (akuhVar == null) {
                akuhVar = akuh.a;
            }
            if (akuhVar.b == 49399797) {
                akuh akuhVar2 = akujVar.h;
                if (akuhVar2 == null) {
                    akuhVar2 = akuh.a;
                }
                if (((akuhVar2.b == 49399797 ? (apoq) akuhVar2.c : apoq.a).c & SemanticState.Hidden) != 0) {
                    akuh akuhVar3 = akujVar.h;
                    if (akuhVar3 == null) {
                        akuhVar3 = akuh.a;
                    }
                    apji apjiVar = (akuhVar3.b == 49399797 ? (apoq) akuhVar3.c : apoq.a).k;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                    apjiVar.c(aihlVarCheckIsLite);
                    if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                        akuh akuhVar4 = akujVar.h;
                        if (akuhVar4 == null) {
                            akuhVar4 = akuh.a;
                        }
                        apji apjiVar2 = (akuhVar4.b == 49399797 ? (apoq) akuhVar4.c : apoq.a).k;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                        return (akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01db  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:123:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:125:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0212  */
    /* JADX WARN: Code duplicated, block: B:130:0x0218  */
    /* JADX WARN: Code duplicated, block: B:132:0x0223 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0225  */
    /* JADX WARN: Code duplicated, block: B:136:0x022e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0241  */
    /* JADX WARN: Code duplicated, block: B:141:0x0247  */
    /* JADX WARN: Code duplicated, block: B:143:0x024d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0257  */
    /* JADX WARN: Code duplicated, block: B:147:0x025d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0273  */
    /* JADX WARN: Code duplicated, block: B:157:0x027e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0287  */
    /* JADX WARN: Code duplicated, block: B:89:0x017e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0182  */
    /* JADX WARN: Code duplicated, block: B:92:0x0185  */
    /* JADX WARN: Code duplicated, block: B:95:0x018d  */
    /* JADX WARN: Code duplicated, block: B:97:0x019f  */
    @Override // defpackage.vmz, defpackage.vob
    public final void A(akuj akujVar, amdd amddVar, adxd adxdVar) {
        adxd adxdVar2;
        vnr vnrVar;
        akuh akuhVar;
        akuh akuhVar2;
        akuh akuhVar3;
        akuh akuhVar4;
        vrp vrpVarAC;
        vro vroVar;
        akuh akuhVar5;
        akuh akuhVar6;
        akrn akrnVar;
        akuh akuhVar7;
        aovg aovgVar;
        akuh akuhVar8;
        aitl aitlVar;
        akuh akuhVar9;
        arkm arkmVar;
        super.A(akujVar, amddVar, adxdVar);
        this.an.x(Optional.ofNullable(akujVar));
        am();
        int i = 0;
        if (this.v.l(412, 45835819L, false) && (adxdVar instanceof vnq)) {
            vnq vnqVar = (vnq) adxdVar;
            adxd adxdVar3 = vnqVar.a;
            this.ad = vnqVar.b;
            adxdVar2 = adxdVar3;
        } else {
            adxdVar2 = adxdVar;
        }
        aB(null, 0);
        if (akujVar == null) {
            al();
            return;
        }
        int iAU = a.aU(akujVar.k);
        if (iAU == 0) {
            iAU = 1;
        }
        LoadingFrameLayout loadingFrameLayout = this.h;
        aA(iAU, loadingFrameLayout == null ? null : (ConstraintLayout) loadingFrameLayout.findViewById(R.id.engagement_panel_content));
        Set set = this.N;
        set.clear();
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            set.add(((vow) it.next()).a());
        }
        this.M.addAll(set);
        this.z.b(akujVar);
        this.aa = (akujVar.c & SemanticState.Focused) == 0 || !akujVar.m;
        if (Objects.equals(tzk.aa(akujVar), "engagement-panel-timeline-view-consolidated")) {
            this.B = new ayq(akujVar);
        }
        akui akuiVar = akujVar.g;
        if (akuiVar == null) {
            akuiVar = akui.a;
        }
        g(akuiVar, false);
        akuh akuhVar10 = akujVar.h;
        if (akuhVar10 == null) {
            akuhVar10 = akuh.a;
        }
        int i2 = 3;
        if (akuhVar10.b == 49399797) {
            vrx vrxVar = (vrx) aj(vrx.class);
            tbq tbqVar = new tbq(this, 3);
            akuh akuhVar11 = akujVar.h;
            if (akuhVar11 == null) {
                akuhVar11 = akuh.a;
            }
            vnrVar = this;
            vnrVar.an(vrxVar, tbqVar, akuhVar11.b == 49399797 ? (apoq) akuhVar11.c : apoq.a, null, this.aa, adxdVar2);
        } else {
            vnrVar = this;
            akuh akuhVar12 = akujVar.h;
            if (akuhVar12 == null) {
                akuhVar12 = akuh.a;
            }
            if ((akuhVar12.b == 290136234 ? (akuk) akuhVar12.c : akuk.a).b.size() > 0) {
                vsr vsrVar = (vsr) vnrVar.aj(vsr.class);
                vnn vnnVar = new vnn(vnrVar, i);
                akuh akuhVar13 = akujVar.h;
                if (akuhVar13 == null) {
                    akuhVar13 = akuh.a;
                }
                vnrVar.an(vsrVar, vnnVar, akuhVar13.b == 290136234 ? (akuk) akuhVar13.c : akuk.a, null, vnrVar.aa, adxdVar2);
            } else {
                akuh akuhVar14 = akujVar.h;
                if (akuhVar14 == null) {
                    akuhVar14 = akuh.a;
                }
                if (akuhVar14.b == 371777145) {
                    vry vryVar = (vry) vnrVar.aj(vry.class);
                    vnn vnnVar2 = new vnn(vnrVar, 2);
                    akuh akuhVar15 = akujVar.h;
                    if (akuhVar15 == null) {
                        akuhVar15 = akuh.a;
                    }
                    vnrVar.an(vryVar, vnnVar2, akuhVar15.b == 371777145 ? (akzv) akuhVar15.c : akzv.a, null, vnrVar.aa, adxdVar2);
                } else if (((aeda) vnrVar.V.io()).w()) {
                    akuh akuhVar16 = akujVar.h;
                    if (akuhVar16 == null) {
                        akuhVar16 = akuh.a;
                    }
                    if (akuhVar16.b == 413221919) {
                        vnrVar.al();
                        vnrVar.Y();
                    } else {
                        akuhVar = akujVar.h;
                        if (akuhVar == null) {
                            akuhVar2 = akuh.a;
                        } else {
                            akuhVar2 = akuhVar;
                        }
                        if (akuhVar2.b == 449330433) {
                            vsc vscVar = (vsc) vnrVar.aj(vsc.class);
                            vnn vnnVar3 = new vnn(vnrVar, i2);
                            akuhVar9 = akujVar.h;
                            if (akuhVar9 == null) {
                                akuhVar9 = akuh.a;
                            }
                            if (akuhVar9.b == 449330433) {
                                arkmVar = (arkm) akuhVar9.c;
                            } else {
                                arkmVar = arkm.a;
                            }
                            vnrVar.an(vscVar, vnnVar3, arkmVar, null, vnrVar.aa, adxdVar2);
                        } else {
                            if (akuhVar == null) {
                                akuhVar3 = akuh.a;
                            } else {
                                akuhVar3 = akuhVar;
                            }
                            if (akuhVar3.b == 2421) {
                                vrm vrmVar = (vrm) vnrVar.aj(vrm.class);
                                vnn vnnVar4 = new vnn(vnrVar, 4);
                                akuhVar8 = akujVar.h;
                                if (akuhVar8 == null) {
                                    akuhVar8 = akuh.a;
                                }
                                if (akuhVar8.b == 2421) {
                                    aitlVar = (aitl) akuhVar8.c;
                                } else {
                                    aitlVar = aitl.a;
                                }
                                vnrVar.an(vrmVar, vnnVar4, aitlVar, null, vnrVar.aa, adxdVar2);
                            } else {
                                if (akuhVar == null) {
                                    akuhVar4 = akuh.a;
                                } else {
                                    akuhVar4 = akuhVar;
                                }
                                if (akuhVar4.b == 91613400) {
                                    vsa vsaVar = (vsa) vnrVar.aj(vsa.class);
                                    vnn vnnVar5 = new vnn(vnrVar, 5);
                                    akuhVar7 = akujVar.h;
                                    if (akuhVar7 == null) {
                                        akuhVar7 = akuh.a;
                                    }
                                    if (akuhVar7.b == 91613400) {
                                        aovgVar = (aovg) akuhVar7.c;
                                    } else {
                                        aovgVar = aovg.a;
                                    }
                                    vnrVar.an(vsaVar, vnnVar5, aovgVar, null, vnrVar.aa, adxdVar2);
                                } else {
                                    if (akuhVar == null) {
                                        akuhVar = akuh.a;
                                    }
                                    if (akuhVar.b == 153515154) {
                                        vrt vrtVar = (vrt) vnrVar.aj(vrt.class);
                                        vnn vnnVar6 = new vnn(vnrVar, 6);
                                        akuhVar6 = akujVar.h;
                                        if (akuhVar6 == null) {
                                            akuhVar6 = akuh.a;
                                        }
                                        if (akuhVar6.b == 153515154) {
                                            akrnVar = (akrn) akuhVar6.c;
                                        } else {
                                            akrnVar = akrn.a;
                                        }
                                        vnrVar.an(vrtVar, vnnVar6, akrnVar, null, vnrVar.aa, adxdVar2);
                                    } else {
                                        vrpVarAC = vnrVar.aC();
                                        if (vrpVarAC != null) {
                                            if (vrpVarAC.equals(vnrVar.ae)) {
                                                vroVar = null;
                                            } else {
                                                vroVar = null;
                                            }
                                            vnn vnnVar7 = new vnn(vrpVarAC, 7);
                                            akuhVar5 = akujVar.h;
                                            if (akuhVar5 == null) {
                                                akuhVar5 = akuh.a;
                                            }
                                            vnrVar.an(vroVar, vnnVar7, akuhVar5, vrpVarAC, vnrVar.aa, adxdVar2);
                                        } else {
                                            vnrVar.al();
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    akuhVar = akujVar.h;
                    if (akuhVar == null) {
                        akuhVar2 = akuh.a;
                    } else {
                        akuhVar2 = akuhVar;
                    }
                    if (akuhVar2.b == 449330433) {
                        vsc vscVar2 = (vsc) vnrVar.aj(vsc.class);
                        vnn vnnVar8 = new vnn(vnrVar, i2);
                        akuhVar9 = akujVar.h;
                        if (akuhVar9 == null) {
                            akuhVar9 = akuh.a;
                        }
                        if (akuhVar9.b == 449330433) {
                            arkmVar = (arkm) akuhVar9.c;
                        } else {
                            arkmVar = arkm.a;
                        }
                        vnrVar.an(vscVar2, vnnVar8, arkmVar, null, vnrVar.aa, adxdVar2);
                    } else {
                        if (akuhVar == null) {
                            akuhVar3 = akuh.a;
                        } else {
                            akuhVar3 = akuhVar;
                        }
                        if (akuhVar3.b == 2421) {
                            vrm vrmVar2 = (vrm) vnrVar.aj(vrm.class);
                            vnn vnnVar9 = new vnn(vnrVar, 4);
                            akuhVar8 = akujVar.h;
                            if (akuhVar8 == null) {
                                akuhVar8 = akuh.a;
                            }
                            if (akuhVar8.b == 2421) {
                                aitlVar = (aitl) akuhVar8.c;
                            } else {
                                aitlVar = aitl.a;
                            }
                            vnrVar.an(vrmVar2, vnnVar9, aitlVar, null, vnrVar.aa, adxdVar2);
                        } else {
                            if (akuhVar == null) {
                                akuhVar4 = akuh.a;
                            } else {
                                akuhVar4 = akuhVar;
                            }
                            if (akuhVar4.b == 91613400) {
                                vsa vsaVar2 = (vsa) vnrVar.aj(vsa.class);
                                vnn vnnVar10 = new vnn(vnrVar, 5);
                                akuhVar7 = akujVar.h;
                                if (akuhVar7 == null) {
                                    akuhVar7 = akuh.a;
                                }
                                if (akuhVar7.b == 91613400) {
                                    aovgVar = (aovg) akuhVar7.c;
                                } else {
                                    aovgVar = aovg.a;
                                }
                                vnrVar.an(vsaVar2, vnnVar10, aovgVar, null, vnrVar.aa, adxdVar2);
                            } else {
                                if (akuhVar == null) {
                                    akuhVar = akuh.a;
                                }
                                if (akuhVar.b == 153515154) {
                                    vrt vrtVar2 = (vrt) vnrVar.aj(vrt.class);
                                    vnn vnnVar11 = new vnn(vnrVar, 6);
                                    akuhVar6 = akujVar.h;
                                    if (akuhVar6 == null) {
                                        akuhVar6 = akuh.a;
                                    }
                                    if (akuhVar6.b == 153515154) {
                                        akrnVar = (akrn) akuhVar6.c;
                                    } else {
                                        akrnVar = akrn.a;
                                    }
                                    vnrVar.an(vrtVar2, vnnVar11, akrnVar, null, vnrVar.aa, adxdVar2);
                                } else {
                                    vrpVarAC = vnrVar.aC();
                                    if (vrpVarAC != null) {
                                        if (vrpVarAC.equals(vnrVar.ae) || vnrVar.m == null || !vrpVarAC.b()) {
                                            vroVar = null;
                                        } else {
                                            vroVar = vnrVar.m;
                                        }
                                        vnn vnnVar12 = new vnn(vrpVarAC, 7);
                                        akuhVar5 = akujVar.h;
                                        if (akuhVar5 == null) {
                                            akuhVar5 = akuh.a;
                                        }
                                        vnrVar.an(vroVar, vnnVar12, akuhVar5, vrpVarAC, vnrVar.aa, adxdVar2);
                                    } else {
                                        vnrVar.al();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        vnrVar.R.f(akujVar, vnrVar.g);
        apji apjiVar = akujVar.i;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aksl.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            if ((akujVar.c & 8) != 0) {
                apji apjiVar2 = akujVar.i;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                for (vnx vnxVar : (Set) vnrVar.ag.io()) {
                    if (vnxVar.h(apjiVar2)) {
                        FrameLayout frameLayout = vnrVar.W;
                        if (frameLayout != null) {
                            frameLayout.addView(vnxVar.a());
                            vnrVar.ar();
                        }
                        vnrVar.b(vnxVar);
                        vro vroVar2 = vnrVar.m;
                        vnxVar.g(apjiVar2, vroVar2 == null ? null : (adwq) vroVar2.h().f(), null);
                        break;
                    }
                }
            }
        } else {
            apji apjiVar3 = akujVar.i;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aksl.a);
            apjiVar3.c(aihlVarCheckIsLite2);
            Object objK = apjiVar3.j.k(aihlVarCheckIsLite2.d);
            aksk akskVar = (aksk) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            int iAU2 = a.aU(akujVar.j);
            vnrVar.aB(akskVar, iAU2 != 0 ? iAU2 : 1);
        }
        vnrVar.av(az(akujVar));
        if (vnrVar.q) {
            vnrVar.h();
        }
    }

    @Override // defpackage.vmz, defpackage.vob
    public final void C(boolean z) {
        if (this.H != z) {
            this.H = z;
            wnf wnfVar = this.a;
            if (wnfVar instanceof wrq) {
                ((wrq) wnfVar).a = z;
            }
            wrq wrqVar = this.I;
            if (wrqVar != null) {
                wrqVar.a = z;
            }
        }
    }

    @Override // defpackage.vmz, defpackage.vob
    public final boolean H() {
        return this.H;
    }

    @Override // defpackage.vmz, defpackage.vob
    public final boolean I(akuj akujVar, ajwo ajwoVar) {
        N(akujVar, ajwoVar, true);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aghp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aghp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.vmz, defpackage.vob
    public final boolean J(String str, ajwo ajwoVar) {
        ayq ayqVar;
        if (this.f == null || (ayqVar = this.B) == null || !ayqVar.c.containsKey(str) || !ayqVar.a.containsKey(str)) {
            return false;
        }
        ayq ayqVar2 = this.B;
        akuj akujVar = (akuj) ayqVar2.c.get(str);
        vro vroVar = (vro) ayqVar2.a.get(str);
        vrq vrqVar = null;
        if (akujVar != null && vroVar != null) {
            vrqVar = new vrq(akujVar, vroVar);
        }
        vrqVar.getClass();
        ax(vrqVar.a, vrqVar.b, ajwoVar);
        return true;
    }

    @Override // defpackage.vmz, defpackage.vob
    public final boolean L() {
        int iAU;
        akuj akujVar = this.f;
        return akujVar == null || (akujVar.c & 65536) == 0 || (iAU = a.aU(akujVar.t)) == 0 || iAU != 2;
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.vmz, defpackage.vob
    public final void M(akuj akujVar, ajwo ajwoVar) {
        ayq ayqVar;
        if (this.f == null || (ayqVar = this.B) == null) {
            return;
        }
        aihf builder = ((aihn) ayqVar.b).toBuilder();
        akui akuiVar = akujVar.g;
        if (akuiVar == null) {
            akuiVar = akui.a;
        }
        aihf builder2 = akuiVar.toBuilder();
        builder2.mergeFrom((aihn) ayqVar.H());
        akui akuiVar2 = (akui) builder2.build();
        akui akuiVarH = ayqVar.H();
        akuo akuoVar = akuiVarH.b == 138681548 ? (akuo) akuiVarH.c : akuo.a;
        aihf builder3 = (akuiVar2.b == 138681548 ? (akuo) akuiVar2.c : akuo.a).toBuilder();
        if ((akuoVar.b & 2) != 0) {
            alay alayVar = akuoVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            builder3.copyOnWrite();
            akuo akuoVar2 = (akuo) builder3.instance;
            alayVar.getClass();
            akuoVar2.e = alayVar;
            akuoVar2.b |= 2;
        } else {
            builder3.copyOnWrite();
            akuo akuoVar3 = (akuo) builder3.instance;
            akuoVar3.e = null;
            akuoVar3.b &= -3;
        }
        if ((akuoVar.b & 32) != 0) {
            alay alayVar2 = akuoVar.i;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            builder3.copyOnWrite();
            akuo akuoVar4 = (akuo) builder3.instance;
            alayVar2.getClass();
            akuoVar4.i = alayVar2;
            akuoVar4.b |= 32;
        } else {
            builder3.copyOnWrite();
            akuo akuoVar5 = (akuo) builder3.instance;
            akuoVar5.i = null;
            akuoVar5.b &= -33;
        }
        aihf builder4 = akuiVar2.toBuilder();
        builder4.copyOnWrite();
        akui akuiVar3 = (akui) builder4.instance;
        akuo akuoVar6 = (akuo) builder3.build();
        akuoVar6.getClass();
        akuiVar3.c = akuoVar6;
        akuiVar3.b = 138681548;
        akui akuiVar4 = (akui) builder4.build();
        builder.copyOnWrite();
        akuj akujVar2 = (akuj) builder.instance;
        akuiVar4.getClass();
        akujVar2.g = akuiVar4;
        akujVar2.c |= 2;
        akuh akuhVar = akujVar.h;
        if (akuhVar == null) {
            akuhVar = akuh.a;
        }
        builder.copyOnWrite();
        akuj akujVar3 = (akuj) builder.instance;
        akuhVar.getClass();
        akujVar3.h = akuhVar;
        akujVar3.c |= 4;
        int i = akujVar.D;
        builder.copyOnWrite();
        akuj akujVar4 = (akuj) builder.instance;
        akujVar4.c |= 16777216;
        akujVar4.D = i;
        amud amudVar = akujVar.E;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        builder.copyOnWrite();
        akuj akujVar5 = (akuj) builder.instance;
        amudVar.getClass();
        akujVar5.E = amudVar;
        akujVar5.c |= 33554432;
        akuj akujVar6 = (akuj) builder.build();
        vro vroVarAf = af(akujVar);
        String strAa = tzk.aa(akujVar);
        if (strAa == null || vroVarAf == null) {
            return;
        }
        ayqVar.c.put(strAa, akujVar6);
        ((agjo) ayqVar.a).g(strAa, vroVarAf, false);
        ax(akujVar6, vroVarAf, ajwoVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    @Override // defpackage.vmz, defpackage.vob
    public final void N(akuj akujVar, ajwo ajwoVar, boolean z) {
        boolean zL;
        amdd amddVar;
        akujVar.getClass();
        akuj akujVar2 = this.f;
        if (akujVar2 == null) {
            if (z) {
                k(new ulo(13));
            }
            zL = this.v.l(372, 45812899L, false);
            amddVar = this.g;
            if (zL) {
                A(akujVar, amddVar, z ? null : q());
            } else {
                A(akujVar, amddVar, null);
            }
            aw();
        } else {
            akui akuiVar = akujVar.g;
            if (akuiVar == null) {
                akuiVar = akui.a;
            }
            akui akuiVar2 = akujVar2.g;
            if (akuiVar2 == null) {
                akuiVar2 = akui.a;
            }
            if (akuiVar.equals(akuiVar2)) {
                akuh akuhVar = akujVar.h;
                if (akuhVar == null) {
                    akuhVar = akuh.a;
                }
                akuh akuhVar2 = akujVar2.h;
                if (akuhVar2 == null) {
                    akuhVar2 = akuh.a;
                }
                if (akuhVar.equals(akuhVar2)) {
                    apji apjiVar = akujVar.i;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    apji apjiVar2 = akujVar2.i;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    if (apjiVar.equals(apjiVar2)) {
                        super.A(akujVar, this.g, null);
                        this.an.x(Optional.ofNullable(akujVar));
                    } else {
                        if (z) {
                            k(new ulo(13));
                        }
                        zL = this.v.l(372, 45812899L, false);
                        amddVar = this.g;
                        if (zL) {
                            A(akujVar, amddVar, z ? null : q());
                        } else {
                            A(akujVar, amddVar, null);
                        }
                        aw();
                    }
                } else {
                    if (z) {
                        k(new ulo(13));
                    }
                    zL = this.v.l(372, 45812899L, false);
                    amddVar = this.g;
                    if (zL) {
                        A(akujVar, amddVar, z ? null : q());
                    } else {
                        A(akujVar, amddVar, null);
                    }
                    aw();
                }
            } else {
                if (z) {
                    k(new ulo(13));
                }
                zL = this.v.l(372, 45812899L, false);
                amddVar = this.g;
                if (zL) {
                    A(akujVar, amddVar, z ? null : q());
                } else {
                    A(akujVar, amddVar, null);
                }
                aw();
            }
        }
        aq(ajwoVar, akujVar);
        as();
        if (this.ab && this.ai.l(123, 45742230L, false)) {
            ak(akujVar);
        }
    }

    @Override // defpackage.vob
    public final vny T() {
        return this.k;
    }

    public final void U(ajmm ajmmVar) {
        ajzr ajzrVar = (ajmmVar.b == 304456058 ? (ajzq) ajmmVar.c : ajzq.a).b;
        if (ajzrVar == null) {
            ajzrVar = ajzr.a;
        }
        int iBc = a.bc(ajzrVar.b);
        if (iBc != 0 && iBc == 4) {
            ((vqg) this.z.c).v(true);
        }
        k(new rew(this, ajmmVar, 17, null));
    }

    @Override // defpackage.vob
    public final void V(adlz adlzVar) {
        this.S.add(adlzVar);
        k(new jap(adlzVar, 7));
    }

    public final void W() {
        LoadingFrameLayout loadingFrameLayout = this.h;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.g(2);
        }
    }

    public final void X(aksk akskVar) {
        akuj akujVar = this.f;
        if (akujVar != null) {
            apji apjiVar = akujVar.i;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aksl.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                return;
            }
        }
        int iAU = 0;
        if (this.ai.l(172, 45813375L, false) && akujVar != null && (iAU = a.aU(akujVar.j)) == 0) {
            iAU = 1;
        }
        aB(akskVar, iAU);
    }

    public final void Y() {
        LoadingFrameLayout loadingFrameLayout = this.h;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.c();
        }
    }

    public final void Z(int i) {
        int iAU;
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            int i2 = frameLayout.getChildCount() > 0 ? i : 0;
            if (i2 != this.W.getPaddingBottom()) {
                this.W.setPadding(0, 0, 0, i2);
            }
            if (this.i != null) {
                Optional optionalF = f();
                if (i2 == 0) {
                    optionalF.ifPresentOrElse(new tso(this, i, 2), new rir(this, i, 6));
                    return;
                }
                akuj akujVar = this.f;
                if (akujVar == null || (iAU = a.aU(akujVar.k)) == 0 || iAU != 2) {
                    i2 = 0;
                }
                if (true == optionalF.isPresent()) {
                    RecyclerView recyclerView = (RecyclerView) optionalF.get();
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), 0);
                }
                this.i.setPadding(0, 0, 0, i2);
            }
        }
    }

    @Override // defpackage.vnb
    public final LoadingFrameLayout a() {
        ap();
        return this.h;
    }

    @Override // defpackage.vob
    public final void aa() {
        boolean z;
        Optional optional = this.U;
        if (true == optional.isPresent()) {
            ((aeqt) optional.get()).e(aeqp.ENGAGEMENT_PANEL);
        }
        vnz vnzVar = this.Z;
        if (vnzVar != null) {
            vnzVar.a();
        }
        afw afwVar = new afw((afx) this.M);
        while (afwVar.hasNext()) {
            ((vox) afwVar.next()).b();
        }
        akuj akujVar = this.f;
        if (akujVar != null) {
            String strAa = tzk.aa(akujVar);
            z = strAa != null && this.ak.j(strAa);
            if ((akujVar.c & 131072) != 0) {
                vxe vxeVar = this.L;
                ajwo ajwoVar = akujVar.w;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.a(ajwoVar);
            }
            at(akujVar);
        } else {
            z = false;
        }
        aeei aeeiVar = this.r;
        if (aeeiVar != null) {
            aeeiVar.e();
            this.r = null;
        }
        this.z.d();
        aerj aerjVar = this.am;
        ((syn) aerjVar.g).e();
        Object obj = aerjVar.a;
        ((cf) obj).getWindow().setNavigationBarColor(((Context) obj).getColor(R.color.music_full_transparent));
        ((gze) aerjVar.b).a(true);
        ((sru) aerjVar.d).a();
        ((qr) aerjVar.e).f();
        ((jin) aerjVar.c).c();
        boolean z2 = this.v.l(339, 45782206L, false) && !z;
        boolean z3 = akujVar != null && akujVar.T;
        if (z2 || z3) {
            al();
        }
    }

    @Override // defpackage.vob
    public final void ab() {
        RecyclerView recyclerView;
        String strAa;
        this.R.c();
        this.ab = false;
        akuj akujVar = this.f;
        if (akujVar != null) {
            this.L.b(akujVar.v);
        }
        afw afwVar = new afw((afx) this.M);
        while (afwVar.hasNext()) {
            ((vox) afwVar.next()).d();
        }
        if (akujVar != null && !this.u.l(154, 45732657L, false) && (strAa = tzk.aa(akujVar)) != null) {
            vwt vwtVar = this.ak;
            if (vwtVar.j(strAa)) {
                vwtVar.i(strAa);
            }
        }
        this.Q.b();
        vps vpsVar = this.c;
        if (vpsVar.c && (recyclerView = vpsVar.a) != null) {
            vpsVar.c = false;
            recyclerView.aE(vpsVar);
        }
        this.z.d();
        this.ai.l(15, 45400573L, false);
        aeei aeeiVar = this.r;
        if (aeeiVar != null) {
            aeeiVar.e();
            this.r = null;
        }
    }

    @Override // defpackage.voa
    public final void ac(acjx acjxVar) {
        k(new usf(acjxVar, 20));
    }

    @Override // defpackage.vob
    public final void ad(ajwo ajwoVar) {
        apof apofVarAi;
        Optional optional = this.U;
        if (true == optional.isPresent()) {
            ((aeqt) optional.get()).c(aeqp.ENGAGEMENT_PANEL);
        }
        if (ay(ajwoVar) && (apofVarAi = ai(ajwoVar)) != null && (apofVarAi.b & 8) != 0) {
            apho aphoVar = apofVarAi.e;
            if (aphoVar == null) {
                aphoVar = apho.a;
            }
            acjx acjxVarAe = aawb.ae(aphoVar);
            if (acjxVarAe != null) {
                k(new rew(this, acjxVarAe, 16, null));
            }
        }
        this.R.d(ajwoVar);
        au();
        this.ac = ai(ajwoVar);
    }

    public final boolean ae() {
        akuj akujVar = this.f;
        if (akujVar == null) {
            return false;
        }
        akui akuiVar = akujVar.g;
        if (akuiVar == null) {
            akuiVar = akui.a;
        }
        apji apjiVar = (akuiVar.b == 138681548 ? (akuo) akuiVar.c : akuo.a).p;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akyv.b);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            akui akuiVar2 = akujVar.g;
            if (akuiVar2 == null) {
                akuiVar2 = akui.a;
            }
            apji apjiVar2 = (akuiVar2.b == 1342 ? (akun) akuiVar2.c : akun.a).c;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akyv.b);
            apjiVar2.c(aihlVarCheckIsLite2);
            if (!apjiVar2.j.n(aihlVarCheckIsLite2.d)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vob
    public final void ag(vnz vnzVar) {
        this.Z = vnzVar;
    }

    @Override // defpackage.vnb
    public final void b(vox voxVar) {
        this.M.add(voxVar);
    }

    @Override // defpackage.vob
    public final View c() {
        ap();
        return this.h;
    }

    @Override // defpackage.vob
    public final void d(ajwo ajwoVar) {
        ap();
        int i = 14;
        if (ay(ajwoVar)) {
            k(new ulo(i));
        }
        k(new ulo(16));
        aw();
        vny vnyVar = this.k;
        if (vnyVar != null) {
            vnyVar.l(this);
            vnyVar.q(this);
        }
        this.R.a();
        avmr avmrVar = this.T;
        abxv abxvVar = this.an;
        avmrVar.a(((avlr) abxvVar.a).af(new var(this, i)));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aghp, java.lang.Object] */
    @Override // defpackage.vob
    public final void e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        afw afwVar = new afw((afx) this.M);
        while (afwVar.hasNext()) {
            ((vox) afwVar.next()).c();
        }
        al();
        ((qr) this.am.e).f();
        akuj akujVar = this.f;
        if (akujVar != null) {
            if ((akujVar.c & 262144) != 0) {
                vxe vxeVar = this.L;
                ajwo ajwoVar = akujVar.x;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.a(ajwoVar);
            }
            at(akujVar);
        }
        ayq ayqVar = this.B;
        if (ayqVar != null) {
            ?? r2 = ayqVar.a;
            agjm agjmVar = new agjm((agjn) r2.values());
            while (agjmVar.hasNext()) {
                ((vro) agjmVar.next()).c();
            }
            r2.clear();
            ayqVar.c.clear();
            this.B = null;
        }
        this.R.b();
        this.T.dispose();
        FrameLayout frameLayout = this.W;
        if (frameLayout != null && (onAttachStateChangeListener = this.p) != null) {
            frameLayout.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        Object obj = this.o;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        aeei aeeiVar = this.r;
        if (aeeiVar != null) {
            aeeiVar.e();
            this.r = null;
        }
    }

    public final Optional f() {
        vro vroVar = this.m;
        return vroVar == null ? Optional.empty() : Optional.ofNullable((RecyclerView) vroVar.m().f());
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    public final void g(akui akuiVar, boolean z) {
        akrn akrnVar;
        if (akuiVar.b == 50631000) {
            this.k = (vny) this.K.io();
        }
        String strW = w();
        int i = akuiVar.b;
        if (i == 194605894) {
            apji apjiVar = (i == 194605894 ? (aizu) akuiVar.c : aizu.a).b;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                afip afipVar = this.al;
                xgn xgnVar = this.e;
                amdd amddVar = this.g;
                apji apjiVar2 = (akuiVar.b == 194605894 ? (aizu) akuiVar.c : aizu.a).b;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                this.k = afipVar.ad(xgnVar, amddVar, (akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)), strW);
            }
        }
        if (akuiVar.b == 153515154) {
            if (this.ai.l(149, 45766026L, false) && z) {
                vny vnyVar = this.k;
                if (vnyVar instanceof vos) {
                    vos vosVar = (vos) vnyVar;
                    akrn akrnVar2 = akuiVar.b == 153515154 ? (akrn) akuiVar.c : akrn.a;
                    akrnVar2.getClass();
                    if (!vosVar.b.d.equals(akrnVar2.d)) {
                        vosVar.a.p(new xgj(vosVar.b.d, (amud) null), null);
                    }
                    vosVar.b = akrnVar2;
                    vosVar.c = null;
                    if (this.ab) {
                        vosVar.g();
                    }
                } else {
                    afip afipVar2 = this.al;
                    xgn xgnVar2 = this.e;
                    amdd amddVar2 = this.g;
                    if (akuiVar.b == 153515154) {
                        akrnVar = (akrn) akuiVar.c;
                    } else {
                        akrnVar = akrn.a;
                    }
                    this.k = afipVar2.ad(xgnVar2, amddVar2, akrnVar, strW);
                }
            } else {
                afip afipVar3 = this.al;
                xgn xgnVar3 = this.e;
                amdd amddVar3 = this.g;
                if (akuiVar.b == 153515154) {
                    akrnVar = (akrn) akuiVar.c;
                } else {
                    akrnVar = akrn.a;
                }
                this.k = afipVar3.ad(xgnVar3, amddVar3, akrnVar, strW);
            }
        }
        int i2 = akuiVar.b;
        if (i2 == 1342) {
            afip afipVar4 = this.al;
            xgn xgnVar4 = this.e;
            amdd amddVar4 = this.g;
            apji apjiVar3 = (i2 == 1342 ? (akun) akuiVar.c : akun.a).b;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
            apjiVar3.c(aihlVarCheckIsLite3);
            Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite3.d);
            vos vosVarAd = afipVar4.ad(xgnVar4, amddVar4, (akrn) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2)), strW);
            this.k = vosVarAd;
            apji apjiVar4 = (akuiVar.b == 1342 ? (akun) akuiVar.c : akun.a).c;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            vosVarAd.m(apjiVar4);
        }
        int i3 = akuiVar.b;
        int iS = atqp.S(i3);
        vny vnyVar2 = this.k;
        boolean z2 = vnyVar2 == null || iS == 15;
        if (i3 == 138681548 || z2) {
            if (vnyVar2 instanceof vpk) {
                vpk vpkVar = (vpk) vnyVar2;
                vpkVar.A(i3 == 138681548 ? (akuo) akuiVar.c : akuo.a);
                vpkVar.z(strW);
            } else {
                vpk vpkVar2 = (vpk) this.J.io();
                vpkVar2.A(akuiVar.b == 138681548 ? (akuo) akuiVar.c : akuo.a);
                vpkVar2.j = this.e;
                vpkVar2.z(strW);
                this.k = vpkVar2;
            }
        }
    }

    final void h() {
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            int i = bac.a;
            bbn bbnVarA = azt.a(frameLayout);
            if (bbnVarA != null) {
                Z(bbnVarA.f(519).e);
            }
        }
    }

    @tcc
    void handleContentEvent(adtk adtkVar) {
        LoadingFrameLayout loadingFrameLayout = this.h;
        if (loadingFrameLayout != null && loadingFrameLayout.d == 1) {
            loadingFrameLayout.g(2);
        }
        aecp aecpVar = this.ah;
        if (aecpVar != null) {
            LoadingFrameLayout loadingFrameLayout2 = this.h;
            aecpVar.d(Boolean.valueOf(loadingFrameLayout2 != null && loadingFrameLayout2.d == 2));
        }
    }

    @tcc
    void handleErrorEvent(adtr adtrVar) {
        LoadingFrameLayout loadingFrameLayout = this.h;
        if (loadingFrameLayout == null || loadingFrameLayout.d != 1) {
            return;
        }
        loadingFrameLayout.b(adtrVar.a(), true);
    }

    @tcc
    void handleLoadingEvent(adts adtsVar) {
        akuj akujVar = this.f;
        if ((akujVar == null || !akujVar.U) && this.h != null && adtsVar.a()) {
            vro vroVar = this.m;
            if (vroVar == null || !vroVar.t()) {
                apho aphoVar = (apho) aawb.ag((acjx) adtsVar.b.f(), apho.class);
                if (aphoVar == null || (aphoVar.c & 8) == 0) {
                    this.h.c();
                } else {
                    this.h.g(2);
                }
            }
        }
    }

    @Override // defpackage.vmz, defpackage.vob
    public final boolean i() {
        vro vroVar = this.m;
        return vroVar != null && vroVar.s();
    }

    public final void k(Consumer consumer) {
        vro vroVar = this.m;
        if (vroVar != null) {
            consumer.r(vroVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // defpackage.vmz, defpackage.vob
    public final adxd q() {
        vnu vnuVar;
        acxm acxmVar;
        vro vroVar = this.m;
        adxd adxdVarG = vroVar != null ? vroVar.g() : null;
        if (!this.v.l(412, 45835819L, false)) {
            return adxdVarG;
        }
        vnx vnxVar = this.j;
        if (vnxVar != null) {
            vnw vnwVar = (vnw) vnxVar;
            if (!vnwVar.e.l(412, 45835819L, false) || (acxmVar = vnwVar.c) == null) {
                vnuVar = null;
            } else {
                vnuVar = new vnu(acxmVar);
                vnwVar.c = null;
            }
        } else {
            vnuVar = null;
        }
        if (adxdVarG == null && vnuVar == null) {
            return null;
        }
        return new vnq(adxdVarG, vnuVar);
    }

    @Override // defpackage.vmz, defpackage.vob
    public final Optional v() {
        return this.n;
    }

    @Override // defpackage.vmz, defpackage.vob
    public final void y() {
        vny vnyVar = this.k;
        if (vnyVar != null) {
            vnyVar.h();
        }
        as();
    }

    @Override // defpackage.vmz, defpackage.vob
    public final void z(akuj akujVar, ajwo ajwoVar) {
        vro vroVarAf;
        if (this.f == null || (vroVarAf = af(akujVar)) == null) {
            return;
        }
        ax(akujVar, vroVarAf, ajwoVar);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.offline.views.OfflineBadgeView;
import com.google.android.apps.youtube.music.player.indicator.RoundedPlayingIndicatorView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgs extends admr implements iyv, adlu {
    private final ImageView A;
    private final ImageView B;
    private final abvn C;
    private final adia D;
    private final adlw E;
    private final int F;
    private final admh G;
    private final View H;
    private final jgy I;
    private final avlh J;
    private final ggb K;
    private final avlh L;
    private aoun M;
    private boolean N;
    private boolean O;
    private xgn P;
    private avmn Q;
    private avmn R;
    private avmn S;
    private tvy T;
    private final jlh V;
    private final vxz W;
    private final heg X;
    private final ahgb Z;
    public final Context a;
    public final awkx b;
    public final View c;
    public final abvk d;
    public iwl e;
    public boolean g;
    public final awku h;
    public hyz j;
    public boolean k;
    public final SwipeLayout l;
    public final ycp m;
    private final admd n;
    private final izr o;
    private final aunn q;
    private final aunn s;
    private final View t;
    private final LinearLayout u;
    private final TextView v;
    private final TextView w;
    private final RoundedPlayingIndicatorView x;
    private final FixedAspectRatioFrameLayout y;
    private final FrameLayout z;
    private final qcb Y = new qcb(this);
    private final avmm p = new avmm();
    public hww f = hww.a;
    public int i = -1;
    private final List U = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [awmd, java.lang.Object] */
    public jgs(Context context, adhv adhvVar, abvk abvkVar, abvn abvnVar, izr izrVar, heg hegVar, admh admhVar, awku awkuVar, avlh avlhVar, avlh avlhVar2, awkx awkxVar, kwq kwqVar, ycp ycpVar, vxz vxzVar, ahgb ahgbVar, ahud ahudVar, jlh jlhVar, adxj adxjVar, aunn aunnVar, aunn aunnVar2) {
        this.a = context;
        this.d = abvkVar;
        this.C = abvnVar;
        jff jffVar = new jff(context);
        this.n = jffVar;
        this.l = jffVar.a;
        this.o = izrVar;
        this.X = hegVar;
        this.h = awkuVar;
        this.G = admhVar;
        this.L = avlhVar2;
        this.b = awkxVar;
        this.m = ycpVar;
        this.W = vxzVar;
        this.Z = ahgbVar;
        this.q = aunnVar;
        this.s = aunnVar2;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.playlist_panel_video_item, (ViewGroup) null);
        this.c = viewInflate;
        this.t = viewInflate.findViewById(R.id.content);
        this.w = (TextView) viewInflate.findViewById(R.id.byline);
        this.v = (TextView) viewInflate.findViewById(R.id.title);
        this.x = (RoundedPlayingIndicatorView) viewInflate.findViewById(R.id.now_playing_indicator);
        this.y = (FixedAspectRatioFrameLayout) viewInflate.findViewById(R.id.thumbnail_aspect_ratio_container);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.thumbnail_overlay);
        this.z = frameLayout;
        frameLayout.setBackground(new GradientDrawable(context.getResources().getConfiguration().getLayoutDirection() == 1 ? GradientDrawable.Orientation.TR_BL : GradientDrawable.Orientation.TL_BR, new int[]{0, context.getColor(R.color.ytm_color_overlay_bg_4)}));
        this.u = (LinearLayout) viewInflate.findViewById(R.id.subtitle_badges_container);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.thumbnail);
        this.D = adul.l(adhvVar, imageView);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.drag_handle_indicator);
        this.A = imageView2;
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.contextual_menu_anchor);
        this.B = imageView3;
        imageView2.setImageResource(adxjVar.b(arqz.gQ));
        imageView3.setImageResource(adxjVar.b(arqz.jA));
        this.J = avlhVar;
        this.V = jlhVar;
        this.F = context.getResources().getDimensionPixelSize(R.dimen.item_large_spacing);
        jffVar.c(viewInflate);
        vxe vxeVar = (vxe) ahudVar.b.io();
        vxeVar.getClass();
        this.E = new adlw(vxeVar, jffVar, this);
        this.P = xgn.l;
        this.H = viewInflate.findViewById(R.id.offline_badge_overlay);
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.offline_badge);
        OfflineBadgeView offlineBadgeView = (OfflineBadgeView) viewInflate.findViewById(R.id.offline_badge_over_thumbnail);
        cf cfVar = (cf) kwqVar.a.io();
        cfVar.getClass();
        hpy hpyVar = (hpy) kwqVar.c.io();
        hpyVar.getClass();
        hpd hpdVar = (hpd) kwqVar.d.io();
        hpdVar.getClass();
        avmb avmbVar = (avmb) kwqVar.b.io();
        avmbVar.getClass();
        appCompatImageView.getClass();
        this.I = new jgy(cfVar, hpyVar, hpdVar, avmbVar, offlineBadgeView, appCompatImageView, imageView);
        this.K = new jgp(this);
    }

    protected static final byte[] t(aoun aounVar) {
        return aounVar.t.G();
    }

    private final boolean u() {
        aunn aunnVar = this.s;
        if (((jnj) aunnVar.io()).t()) {
            return !this.f.b(hww.e, hww.c);
        }
        return ((jnj) aunnVar.io()).s();
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jff) this.n).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.D.a();
        if (this.N) {
            this.N = false;
            this.p.b();
        }
        this.E.b();
        this.I.b(admhVar);
        kro.X(this.u, admhVar);
        Object obj = this.R;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            iwl iwlVar = this.e;
            if (iwlVar != null) {
                this.K.b(m(iwlVar));
            }
        }
        kro.Z(this.t, 0, 0);
        Object obj2 = this.Q;
        if (obj2 != null) {
            awka.f((AtomicReference) obj2);
        }
        Object obj3 = this.S;
        if (obj3 != null) {
            awka.f((AtomicReference) obj3);
        }
        h();
        List list = this.U;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((adma) it.next()).b(this.G);
        }
        list.clear();
        tvy tvyVar = this.T;
        if (tvyVar != null) {
            SwipeLayout swipeLayout = this.l;
            tvyVar.c(swipeLayout);
            swipeLayout.v = null;
            swipeLayout.w = null;
            agke agkeVar = agpi.a;
            tsv.f(swipeLayout, agkeVar);
            tsv.g(swipeLayout, agkeVar);
            this.T = null;
        }
        this.o.h(((jff) this.n).a);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x024a  */
    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        ajwo ajwoVar;
        int i;
        anzw anzwVarA;
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        aqmh aqmhVar;
        byte b;
        avmn avmnVar;
        aoun aounVar = (aoun) obj;
        bac.p(a(), new jgr(this));
        avmn avmnVar2 = this.Q;
        if (avmnVar2 == null || avmnVar2.f()) {
            this.Q = this.L.H(new ibj(this, 12)).al(new iwb(this, 19), new jeh(4));
        }
        if (((jnj) this.s.io()).t() && ((avmnVar = this.S) == null || avmnVar.f())) {
            this.S = ((hfn) this.q.io()).y().al(new iwb(this, 20), new jeh(4));
        }
        adly adlyVarT = kro.T(this.t, adlyVar);
        TextView textView = this.v;
        textView.setTextAppearance(R.style.TextAppearance_YouTubeMusic_ListItemTitle);
        byte b2 = -1;
        int iB = adlyVarT.b("sectionControllerPosition", -1);
        int iB2 = adlyVarT.b("position", -1);
        if (iB2 >= 0 && iB >= 0) {
            this.i = iB2 - iB;
        }
        xgn xgnVar = adlyVar.b;
        this.P = xgnVar;
        adlw adlwVar = this.E;
        if ((aounVar.b & SemanticState.Hidden) != 0) {
            ajwoVar = aounVar.l;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        adlwVar.a(xgnVar, ajwoVar, adlyVar.e(), null);
        this.M = aounVar;
        int i2 = 1;
        this.O = (aounVar.b & SemanticState.Modal) != 0;
        LinearLayout linearLayout = this.u;
        if (linearLayout.getChildCount() == 0) {
            aiie<ajkc> aiieVar = aounVar.o;
            agjz agjzVar = new agjz(4);
            for (ajkc ajkcVar : aiieVar) {
                if (ajkcVar != null) {
                    if ((ajkcVar.b & 16777216) != 0) {
                        anpv anpvVar = ajkcVar.d;
                        if (anpvVar == null) {
                            anpvVar = anpv.b;
                        }
                        b = b2;
                        if (anpvVar.f.size() == 0 || new aihx(anpvVar.f, anpv.a).contains(anpu.MUSIC_INLINE_BADGE_DISPLAY_MODE_PLAYBACK_QUEUE)) {
                            aihh aihhVar = (aihh) apji.a.createBuilder();
                            aihl aihlVar = anpw.a;
                            anpv anpvVar2 = ajkcVar.d;
                            if (anpvVar2 == null) {
                                anpvVar2 = anpv.b;
                            }
                            aihhVar.e(aihlVar, anpvVar2);
                            agjzVar.h((apji) aihhVar.build());
                        }
                    } else {
                        b = b2;
                        if ((ajkcVar.b & 2) != 0) {
                            aihh aihhVar2 = (aihh) apji.a.createBuilder();
                            aihl aihlVar2 = ajkv.b;
                            ajkf ajkfVar = ajkcVar.c;
                            if (ajkfVar == null) {
                                ajkfVar = ajkf.a;
                            }
                            aihhVar2.e(aihlVar2, ajkfVar);
                            agjzVar.h((apji) aihhVar2.build());
                        }
                    }
                    b2 = b;
                }
            }
            i = 2;
            kro.W(agjzVar.g(), linearLayout, this.G, adlyVarT);
        } else {
            i = 2;
        }
        for (int i3 = 0; i3 < linearLayout.getChildCount(); i3++) {
            View childAt = linearLayout.getChildAt(i3);
            if (childAt instanceof iwt) {
                jkl.c(((iwt) childAt).getDrawable(), this.a.getColor(R.color.ytm_text_color_secondary_translucent));
            }
        }
        ajwo ajwoVar2 = aounVar.l;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
        ajwoVar2.c(aihlVarCheckIsLite);
        Object objK = ajwoVar2.j.k(aihlVarCheckIsLite.d);
        arii ariiVar = ((arij) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).s;
        if (ariiVar == null) {
            ariiVar = arii.a;
        }
        if ((ariiVar.b & 1) != 0) {
            ajwo ajwoVar3 = aounVar.l;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
            ajwoVar3.c(aihlVarCheckIsLite2);
            Object objK2 = ajwoVar3.j.k(aihlVarCheckIsLite2.d);
            arii ariiVar2 = ((arij) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).s;
            if (ariiVar2 == null) {
                ariiVar2 = arii.a;
            }
            arih arihVar = ariiVar2.c;
            if (arihVar == null) {
                arihVar = arih.a;
            }
            anzwVarA = anzw.a(arihVar.d);
            if (anzwVarA == null) {
                anzwVarA = anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
            }
        } else {
            anzwVarA = anzw.MUSIC_VIDEO_TYPE_ATV;
        }
        float f = 1.7777778f;
        float f2 = true != igs.a(anzwVarA) ? 1.7777778f : 1.0f;
        if (this.W.l(208, 45740538L, true)) {
            aqmh aqmhVar2 = aounVar.g;
            if (aqmhVar2 == null) {
                aqmhVar2 = aqmh.a;
            }
            if (aqmhVar2.c.size() <= 0) {
                f = f2;
            } else {
                aqmh aqmhVar3 = aounVar.g;
                if (aqmhVar3 == null) {
                    aqmhVar = aqmh.a;
                    aqmhVar3 = aqmh.a;
                } else {
                    aqmhVar = aqmhVar3;
                }
                aqmg aqmgVar = (aqmg) aqmhVar.c.get(aqmhVar3.c.size() - 1);
                int i4 = aqmgVar.e;
                if (i4 <= 0) {
                    f = f2;
                } else if (aqmgVar.d / i4 <= 1.3888888f) {
                    f = 1.0f;
                }
            }
        } else {
            f = f2;
        }
        this.y.a = f;
        iwl iwlVar = this.e;
        if (iwlVar != null) {
            this.K.d = m(iwlVar);
        }
        avmn avmnVar3 = this.R;
        if (avmnVar3 == null || avmnVar3.f()) {
            this.R = this.J.x(new hhw(this, 15)).al(new jgq(this, 1), new jeh(4));
        }
        if (this.O) {
            if ((aounVar.b & SemanticState.Modal) != 0) {
                alayVar3 = aounVar.m;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
            } else {
                alayVar3 = null;
            }
            textView.setText(ackj.k(null, alayVar3, null, false));
            this.w.setVisibility(8);
        } else {
            if ((aounVar.b & 1) != 0) {
                alayVar = aounVar.d;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            textView.setText(ackj.k(null, alayVar, null, false));
            if ((aounVar.b & 2) != 0) {
                alayVar2 = aounVar.e;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            Spanned spannedK = ackj.k(null, alayVar2, null, false);
            TextView textView2 = this.w;
            textView2.setText(spannedK);
            Optional optionalG = ixt.g(spannedK, this.a.getResources());
            if (optionalG.isPresent()) {
                alay alayVar4 = aounVar.e;
                if (alayVar4 == null) {
                    alayVar4 = alay.a;
                }
                textView2.setText(ackj.b(alayVar4, (String) optionalG.get()));
            }
            textView2.setVisibility(0);
        }
        q();
        adia adiaVar = this.D;
        aqmh aqmhVar4 = aounVar.g;
        if (aqmhVar4 == null) {
            aqmhVar4 = aqmh.a;
        }
        adiaVar.f(aqmhVar4, null);
        View view = this.c;
        view.setPaddingRelative(this.F, view.getPaddingTop(), 0, view.getPaddingBottom());
        p((izt) adlyVar.c("sharedToggleMenuItemMutations"));
        if (!this.N) {
            this.N = true;
            avmm avmmVar = this.p;
            qcb qcbVar = this.Y;
            abvn abvnVar = this.C;
            avmn[] avmnVarArr = new avmn[i];
            avmnVarArr[0] = ((avlh) abvnVar.r().n).i(new abwr(i2)).al(new jgq(qcbVar, 0), new jeh(5));
            avmnVarArr[1] = ((avlh) abvnVar.r().k).i(new abwr(i2)).al(new jgq(qcbVar, 2), new jeh(5));
            avmmVar.e(avmnVarArr);
        }
        this.n.e(adlyVar);
        this.I.hU(adlyVarT, aounVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return t((aoun) obj);
    }

    @Override // defpackage.iyv
    public final int f() {
        return 3;
    }

    @Override // defpackage.iyv
    public final int g() {
        return this.i;
    }

    @Override // defpackage.iyv
    public final void h() {
        om.b(a());
        if (this.M == null || !this.k) {
            this.c.setBackground(null);
        }
        if (this.g) {
            this.h.kk(Boolean.FALSE);
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    @Override // defpackage.adlu
    public final boolean hV(View view) {
        boolean z;
        aoun aounVar = this.M;
        if (aounVar == null) {
            z = false;
        } else {
            aoue aoueVar = aounVar.w;
            if (aoueVar == null) {
                aoueVar = aoue.a;
            }
            int iAS = a.aS(aoueVar.b);
            if (iAS == 0 || iAS != 2) {
                z = false;
            } else {
                z = true;
            }
        }
        return this.k || this.O || this.g || z;
    }

    @Override // defpackage.iyv
    public final void i(jas jasVar) {
        this.A.setOnTouchListener(new jfs(this, jasVar, 3));
    }

    @Override // defpackage.iyw
    public final void j(Canvas canvas, RecyclerView recyclerView, oh ohVar, float f, float f2, int i, boolean z) {
        int color = this.a.getColor(R.color.remix_player_section1_color);
        if (this.e != null) {
            if (u()) {
                color = n(this.e);
            } else {
                boolean z2 = this.k;
                iwl iwlVar = this.e;
                color = z2 ? m(iwlVar) : n(iwlVar);
            }
        }
        om.c(recyclerView, a(), 0.0f, f2, z);
        if (u()) {
            this.c.setBackgroundColor(f2 != 0.0f ? color | (-16777216) : 0);
        } else if (f2 != 0.0f) {
            this.c.setBackgroundColor(color | (-16777216));
        }
    }

    @Override // defpackage.iyw
    public final void k() {
        a();
    }

    @Override // defpackage.iyw
    public final void l() {
        a();
    }

    public final int m(iwl iwlVar) {
        if (u()) {
            return 0;
        }
        return jkl.a(iwlVar.f.a, 0.23d);
    }

    public final int n(iwl iwlVar) {
        return u() ? iwlVar.f.b : jkl.a(iwlVar.f.a, 0.23d);
    }

    public final void o(adly adlyVar, aoun aounVar, hyz hyzVar) {
        this.j = hyzVar;
        this.P = adlyVar.b;
        this.P.d(new xgj(t(aounVar)));
        hU(adlyVar, aounVar);
        tvy tvyVar = (tvy) adlx.b(adlyVar, tvy.class);
        this.T = tvyVar;
        if (tvyVar != null) {
            tvyVar.a(this.l);
        }
        SwipeLayout swipeLayout = this.l;
        swipeLayout.h();
        aihf aihfVarCreateBuilder = anxy.a.createBuilder();
        aihf aihfVarCreateBuilder2 = anxw.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        anxw anxwVar = (anxw) aihfVarCreateBuilder2.instance;
        anxwVar.c = 1;
        anxwVar.b |= 1;
        anxv anxvVar = anxv.MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_DESTRUCTIVE;
        aihfVarCreateBuilder2.copyOnWrite();
        anxw anxwVar2 = (anxw) aihfVarCreateBuilder2.instance;
        anxwVar2.d = anxvVar.e;
        anxwVar2.b |= 2;
        anxw anxwVar3 = (anxw) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        anxy anxyVar = (anxy) aihfVarCreateBuilder.instance;
        anxwVar3.getClass();
        anxyVar.c = anxwVar3;
        anxyVar.b |= 1;
        anxy anxyVar2 = (anxy) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder3 = anxx.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        anxx anxxVar = (anxx) aihfVarCreateBuilder3.instance;
        anxyVar2.getClass();
        anxxVar.c = anxyVar2;
        anxxVar.b |= 1;
        aihfVarCreateBuilder3.copyOnWrite();
        anxx anxxVar2 = (anxx) aihfVarCreateBuilder3.instance;
        anxyVar2.getClass();
        anxxVar2.d = anxyVar2;
        anxxVar2.b |= 2;
        aihfVarCreateBuilder3.copyOnWrite();
        anxx anxxVar3 = (anxx) aihfVarCreateBuilder3.instance;
        anxxVar3.e = 2;
        anxxVar3.b |= 4;
        this.U.addAll(ixt.ah(swipeLayout, this.Z, (anxx) aihfVarCreateBuilder3.build(), this.W, this.a, hyzVar, this.V));
    }

    public final void p(izt iztVar) {
        int iAU;
        anfy anfyVar;
        a().setEnabled(true);
        aoun aounVar = this.M;
        anfy anfyVar2 = null;
        if (aounVar == null || (iAU = a.aU(aounVar.x)) == 0 || iAU != 2) {
            tuk.l(this.B, false);
            ImageView imageView = this.A;
            tuk.l(imageView, true);
            imageView.setFocusable(true);
        } else {
            tuk.l(this.A, false);
            ImageView imageView2 = this.B;
            imageView2.setFocusable(true);
            tuk.l(imageView2, true);
            izr izrVar = this.o;
            SwipeLayout swipeLayout = ((jff) this.n).a;
            angb angbVar = this.M.p;
            if (angbVar == null) {
                angbVar = angb.a;
            }
            if (angbVar.b == 66439850) {
                angb angbVar2 = this.M.p;
                if (angbVar2 == null) {
                    angbVar2 = angb.a;
                }
                anfyVar = angbVar2.b == 66439850 ? (anfy) angbVar2.c : anfy.a;
            } else {
                anfyVar = null;
            }
            izrVar.m(swipeLayout, imageView2, anfyVar, this.M, this.P);
        }
        this.t.setAlpha(1.0f);
        if (iztVar != null) {
            this.o.b(((jff) this.n).a, iztVar);
        }
        aoun aounVar2 = this.M;
        if (aounVar2 != null) {
            izr izrVar2 = this.o;
            SwipeLayout swipeLayout2 = ((jff) this.n).a;
            angb angbVar3 = aounVar2.p;
            if (angbVar3 == null) {
                angbVar3 = angb.a;
            }
            if (angbVar3.b == 66439850) {
                angb angbVar4 = this.M.p;
                if (angbVar4 == null) {
                    angbVar4 = angb.a;
                }
                anfyVar2 = angbVar4.b == 66439850 ? (anfy) angbVar4.c : anfy.a;
            }
            izrVar2.d(swipeLayout2, anfyVar2, this.M, this.P);
        }
    }

    public final void q() {
        boolean z = false;
        if (this.k) {
            this.z.setVisibility(0);
            this.H.setVisibility(8);
            abgi abgiVar = (abgi) this.X.a;
            if (abgiVar.a == abgh.b && !abgiVar.b) {
                z = true;
            }
            r(z);
        } else {
            this.c.setBackground(null);
            this.z.setVisibility(8);
            this.H.setVisibility(0);
        }
        s(this.e);
    }

    public final void r(boolean z) {
        aoun aounVar = this.M;
        float f = 1.0f;
        if (aounVar != null) {
            aoup aoupVar = aounVar.y;
            if (aoupVar == null) {
                aoupVar = aoup.a;
            }
            if ((aoupVar.b & 1) != 0) {
                aoup aoupVar2 = this.M.y;
                if (aoupVar2 == null) {
                    aoupVar2 = aoup.a;
                }
                f = aoupVar2.c;
            }
        }
        this.x.a(z, f);
    }

    public final void s(iwl iwlVar) {
        if (iwlVar != null) {
            this.K.a(m(iwlVar), 450L);
        }
    }
}

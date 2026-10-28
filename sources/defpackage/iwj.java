package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.appchrome.insets.InsetAdjustingToolbar;
import com.google.android.apps.youtube.music.ui.avatarmenu.PrivacyTosFooter;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iwj extends iwk implements View.OnClickListener, xgm, rpq, gzh {
    public static final /* synthetic */ int A = 0;
    private static final ttb B = new ttb();
    private final avmm C = new avmm();
    private View D;
    private TextView E;
    private TextView F;
    private TextView G;
    private LinearLayout H;
    private boolean I;
    public View k;
    public ttm l;
    public vxe m;
    public xgn n;
    public aduv o;
    public adxj p;
    public String q;
    public zwb r;
    public iwf s;
    public tbt t;
    public avmb u;
    public rqa v;
    public rql w;
    public hfn x;
    public jnm y;
    public axfd z;

    private final ajwo p(xgj xgjVar) {
        return ixt.C(vxh.a("avatar_menu_activate_switch_account"), xgjVar, this.n);
    }

    private final void q(int i, int i2, ajwo ajwoVar, xgj xgjVar) {
        r(i, getContext().getResources().getString(i2), ajwoVar, xgjVar);
    }

    private final void r(int i, CharSequence charSequence, ajwo ajwoVar, xgj xgjVar) {
        if (this.H == null || getContext() == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.menu_entry, (ViewGroup) this.H, false);
        if (i != 0) {
            ((ImageView) viewInflate.findViewById(R.id.thumbnail)).setImageDrawable(new aduk(getContext(), i).a());
        }
        ((TextView) viewInflate.findViewById(R.id.title)).setText(charSequence);
        viewInflate.setOnClickListener(new iwi(this, this.u, ajwoVar, xgjVar));
        this.H.addView(viewInflate);
        this.n.l(xgjVar);
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.n;
    }

    @tcc
    public void handleSignInFlow(rqg rqgVar) {
        if (rqgVar.a == rqf.b) {
            super.iQ(false, false, false);
        }
    }

    @Override // defpackage.rpq
    public final void i(wnq wnqVar) {
        this.v.h(wnqVar, null, new rqb(this.l));
    }

    public final void j(ajnf ajnfVar) {
        ajwo ajwoVar;
        int iA;
        alay alayVar;
        int i = ajnfVar.b;
        if ((i & SemanticState.Multiline) != 0) {
            ajwoVar = ajnfVar.s;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else if ((i & SemanticState.Obscured) != 0) {
            ajwoVar = ajnfVar.r;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else if ((i & SemanticState.Modal) != 0) {
            ajwoVar = ajnfVar.q;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        int i2 = ajnfVar.e;
        if (i2 == 8) {
            aduv aduvVar = this.o;
            aliz alizVarA = aliz.a((i2 == 8 ? (alja) ajnfVar.f : alja.a).c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            iA = aduvVar.a(alizVarA);
        } else {
            iA = 0;
        }
        if ((ajnfVar.b & 64) != 0) {
            alayVar = ajnfVar.m;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        r(iA, ackj.k(null, alayVar, null, false), ajwoVar, new xgj(ajnfVar.y, (amud) null));
    }

    public final void k(ajwo ajwoVar, xgj xgjVar) {
        this.n.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar, null);
        ajwo ajwoVarC = ixt.C(ajwoVar, xgjVar, this.n);
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            if ("avatar_menu_activate_switch_account".equals(((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c)) {
                cf activity = getActivity();
                if (activity != null) {
                    this.w.c(activity, p(xgjVar), null);
                    return;
                }
                return;
            }
        }
        this.m.a(ajwoVarC);
        super.iQ(false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0215  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:205:0x0418  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r3v18, types: [aduv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zwb] */
    public final void l() {
        ajnf ajnfVar;
        ajnf ajnfVar2;
        Optional optionalEmpty;
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        byte[] bArrG;
        if (getContext() == null || this.H == null) {
            return;
        }
        this.I = this.y.C();
        this.H.removeAllViews();
        if (this.z.an() != null) {
            j(this.z.an());
        }
        q(this.o.a(aliz.OFFLINE_DOWNLOAD), R.string.offline_title, vxh.b("FEmusic_offline"), new xgj(xhb.b(309697)));
        if (this.r.u()) {
            q(this.o.a(aliz.WATCH_HISTORY), R.string.title_history_new, vxh.a("FEmusic_history"), new xgj(xhb.b(309699)));
        }
        axfd axfdVar = this.z;
        anki ankiVarAp = axfdVar.ap(axfdVar.b.e());
        if (ankiVarAp == null) {
            ajnfVar = null;
        } else {
            apji apjiVar = ankiVarAp.o;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = ankiVarAp.o;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                ajnfVar = null;
            }
        }
        if (ajnfVar != null) {
            j(ajnfVar);
        }
        axfd axfdVar2 = this.z;
        anki ankiVarAp2 = axfdVar2.ap(axfdVar2.b.e());
        if (ankiVarAp2 == null) {
            ajnfVar2 = null;
        } else {
            apji apjiVar3 = ankiVarAp2.p;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
            apjiVar3.c(aihlVarCheckIsLite3);
            if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                apji apjiVar4 = ankiVarAp2.p;
                if (apjiVar4 == null) {
                    apjiVar4 = apji.a;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
                apjiVar4.c(aihlVarCheckIsLite4);
                Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                ajnfVar2 = (ajnf) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
            } else {
                ajnfVar2 = null;
            }
        }
        if (ajnfVar2 != null) {
            j(ajnfVar2);
        }
        if (this.I) {
            CharSequence charSequenceAq = this.z.aq();
            if (!TextUtils.isEmpty(charSequenceAq)) {
                axfd axfdVar3 = this.z;
                anki ankiVarAp3 = axfdVar3.ap(axfdVar3.b.e());
                int iA = R.drawable.quantum_ic_video_youtube_vd_theme_24;
                if (ankiVarAp3 != null) {
                    ajng ajngVar = ankiVarAp3.e;
                    if (ajngVar == null) {
                        ajngVar = ajng.a;
                    }
                    ajnf ajnfVar3 = ajngVar.c;
                    if (ajnfVar3 == null) {
                        ajnfVar3 = ajnf.a;
                    }
                    if (ajnfVar3.e == 8) {
                        ?? r3 = axfdVar3.a;
                        ajng ajngVar2 = ankiVarAp3.e;
                        if (ajngVar2 == null) {
                            ajngVar2 = ajng.a;
                        }
                        ajnf ajnfVar4 = ajngVar2.c;
                        if (ajnfVar4 == null) {
                            ajnfVar4 = ajnf.a;
                        }
                        aliz alizVarA = aliz.a((ajnfVar4.e == 8 ? (alja) ajnfVar4.f : alja.a).c);
                        if (alizVarA == null) {
                            alizVarA = aliz.UNKNOWN;
                        }
                        iA = r3.a(alizVarA);
                    }
                }
                ajwo ajwoVarAo = this.z.ao();
                axfd axfdVar4 = this.z;
                anki ankiVarAp4 = axfdVar4.ap(axfdVar4.b.e());
                if (ankiVarAp4 != null) {
                    ajng ajngVar3 = ankiVarAp4.e;
                    if (ajngVar3 == null) {
                        ajngVar3 = ajng.a;
                    }
                    ajnf ajnfVar5 = ajngVar3.c;
                    if (ajnfVar5 == null) {
                        ajnfVar5 = ajnf.a;
                    }
                    bArrG = ajnfVar5.y.G();
                } else {
                    bArrG = vzh.b;
                }
                r(iA, charSequenceAq, ajwoVarAo, new xgj(bArrG));
            }
        }
        int i = true != this.r.u() ? R.string.title_sign_in : R.string.title_account_switcher;
        xgj xgjVar = new xgj(xhb.b(309701));
        q(this.o.a(aliz.SWITCH_ACCOUNTS), i, p(xgjVar), xgjVar);
        axfd axfdVar5 = this.z;
        anki ankiVarAp5 = axfdVar5.ap(axfdVar5.b.e());
        if (ankiVarAp5 == null) {
            optionalEmpty = Optional.empty();
        } else {
            apji apjiVar5 = ankiVarAp5.k;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajnp.a);
            apjiVar5.c(aihlVarCheckIsLite5);
            if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
                apji apjiVar6 = ankiVarAp5.k;
                if (apjiVar6 == null) {
                    apjiVar6 = apji.a;
                }
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ajnp.a);
                apjiVar6.c(aihlVarCheckIsLite6);
                Object objK3 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
                optionalEmpty = Optional.of((ajnf) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3)));
            } else {
                optionalEmpty = Optional.empty();
            }
        }
        imc imcVar = new imc(this, 11);
        if (true == optionalEmpty.isPresent()) {
            ((iwj) imcVar.a).j((ajnf) optionalEmpty.get());
        }
        ajwo ajwoVar = ajwo.a;
        aihh aihhVar = (aihh) ajwoVar.createBuilder();
        aihhVar.e(ajfd.a, ajfc.a);
        q(this.o.a(aliz.SETTINGS_MATERIAL), R.string.settings, (ajwo) aihhVar.build(), new xgj(xhb.b(309700)));
        aihh aihhVar2 = (aihh) ajwoVar.createBuilder();
        aihhVar2.e(ajfb.a, ajfa.a);
        q(this.o.a(aliz.HELP), R.string.guide_help_and_feedback, (ajwo) aihhVar2.build(), new xgj(xhb.b(309698)));
        axfd axfdVar6 = this.z;
        Optional optionalOfNullable = Optional.ofNullable(axfdVar6.ap(axfdVar6.b.e()));
        if (true == optionalOfNullable.isPresent()) {
            anki ankiVar = (anki) optionalOfNullable.get();
            apji apjiVar7 = ankiVar.l;
            if (apjiVar7 == null) {
                apjiVar7 = apji.a;
            }
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(ajnp.a);
            apjiVar7.c(aihlVarCheckIsLite7);
            optionalOfNullable = aext.n(apjiVar7.j.n(aihlVarCheckIsLite7.d), new gpa(ankiVar, 5));
        }
        imc imcVar2 = new imc(this, 12);
        if (true == optionalOfNullable.isPresent()) {
            ((iwj) imcVar2.a).j((ajnf) optionalOfNullable.get());
        }
        axfd axfdVar7 = this.z;
        Optional optionalOfNullable2 = Optional.ofNullable(axfdVar7.ap(axfdVar7.b.e()));
        if (true == optionalOfNullable2.isPresent()) {
            anki ankiVar2 = (anki) optionalOfNullable2.get();
            apji apjiVar8 = ankiVar2.q;
            if (apjiVar8 == null) {
                apjiVar8 = apji.a;
            }
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(ajnp.a);
            apjiVar8.c(aihlVarCheckIsLite8);
            optionalOfNullable2 = aext.n(apjiVar8.j.n(aihlVarCheckIsLite8.d), new gpa(ankiVar2, 4));
        }
        imc imcVar3 = new imc(this, 13);
        if (true == optionalOfNullable2.isPresent()) {
            ((iwj) imcVar3.a).j((ajnf) optionalOfNullable2.get());
        }
        axfd axfdVar8 = this.z;
        anki ankiVarAp6 = axfdVar8.ap(axfdVar8.b.e());
        if (ankiVarAp6 == null || (ankiVarAp6.b & 2) == 0) {
            alayVar = null;
        } else {
            alayVar = ankiVarAp6.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        }
        TextView textView = this.E;
        if (alayVar != null) {
            if (textView != null) {
                tuk.u(textView, ackj.k(null, alayVar, null, false));
            }
        } else if (textView != null) {
            tuk.l(textView, false);
        }
        axfd axfdVar9 = this.z;
        anki ankiVarAp7 = axfdVar9.ap(axfdVar9.b.e());
        if (ankiVarAp7 == null) {
            alayVar2 = null;
        } else {
            ankj ankjVar = ankiVarAp7.c;
            if (ankjVar == null) {
                ankjVar = ankj.a;
            }
            ajng ajngVar4 = (ankjVar.b == 104347096 ? (ankk) ankjVar.c : ankk.a).c;
            if (ajngVar4 == null) {
                ajngVar4 = ajng.a;
            }
            ajnf ajnfVar6 = ajngVar4.c;
            if (ajnfVar6 == null) {
                ajnfVar6 = ajnf.a;
            }
            if ((ajnfVar6.b & 64) != 0) {
                ankj ankjVar2 = ankiVarAp7.c;
                if (ankjVar2 == null) {
                    ankjVar2 = ankj.a;
                }
                ajng ajngVar5 = (ankjVar2.b == 104347096 ? (ankk) ankjVar2.c : ankk.a).c;
                if (ajngVar5 == null) {
                    ajngVar5 = ajng.a;
                }
                ajnf ajnfVar7 = ajngVar5.c;
                if (ajnfVar7 == null) {
                    ajnfVar7 = ajnf.a;
                }
                alayVar2 = ajnfVar7.m;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
        }
        TextView textView2 = this.F;
        if (textView2 != null) {
            tuk.u(textView2, ackj.k(null, alayVar2, null, false));
        }
        View view = this.D;
        if (view != null) {
            view.setVisibility(alayVar2 != null ? 0 : 8);
        }
        axfd axfdVar10 = this.z;
        anki ankiVarAp8 = axfdVar10.ap(axfdVar10.b.e());
        if (ankiVarAp8 == null) {
            alayVar3 = null;
        } else {
            ankj ankjVar3 = ankiVarAp8.c;
            if (ankjVar3 == null) {
                ankjVar3 = ankj.a;
            }
            if (((ankjVar3.b == 104347096 ? (ankk) ankjVar3.c : ankk.a).b & 2) != 0) {
                ankj ankjVar4 = ankiVarAp8.c;
                if (ankjVar4 == null) {
                    ankjVar4 = ankj.a;
                }
                alayVar3 = (ankjVar4.b == 104347096 ? (ankk) ankjVar4.c : ankk.a).d;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
            } else {
                alayVar3 = null;
            }
        }
        TextView textView3 = this.G;
        if (textView3 != null) {
            tuk.u(textView3, ackj.k(null, alayVar3, null, false));
        }
    }

    public final /* synthetic */ void m() {
        this.m.a(p(new xgj(xhb.b(309703))));
        super.iQ(false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zwb] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajwo ajwoVar;
        if (view == this.F) {
            axfd axfdVar = this.z;
            anki ankiVarAp = axfdVar.ap(axfdVar.b.e());
            if (ankiVarAp == null || (ankiVarAp.b & 1) == 0) {
                ajwoVar = null;
            } else {
                ankj ankjVar = ankiVarAp.c;
                if (ankjVar == null) {
                    ankjVar = ankj.a;
                }
                ajng ajngVar = (ankjVar.b == 104347096 ? (ankk) ankjVar.c : ankk.a).c;
                if (ajngVar == null) {
                    ajngVar = ajng.a;
                }
                ajnf ajnfVar = ajngVar.c;
                if (ajnfVar == null) {
                    ajnfVar = ajnf.a;
                }
                if ((ajnfVar.b & SemanticState.Obscured) != 0) {
                    ankj ankjVar2 = ankiVarAp.c;
                    if (ankjVar2 == null) {
                        ankjVar2 = ankj.a;
                    }
                    ajng ajngVar2 = (ankjVar2.b == 104347096 ? (ankk) ankjVar2.c : ankk.a).c;
                    if (ajngVar2 == null) {
                        ajngVar2 = ajng.a;
                    }
                    ajnf ajnfVar2 = ajngVar2.c;
                    if (ajnfVar2 == null) {
                        ajnfVar2 = ajnf.a;
                    }
                    ajwoVar = ajnfVar2.r;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                } else {
                    ajwoVar = null;
                }
            }
            if (ajwoVar != null) {
                this.m.c(ajwoVar, null);
            }
        }
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        iO(2, true != twm.v(getContext()) ? R.style.Theme_YouTubeMusic_FullscreenDialog_Solid : R.style.Theme_YouTubeMusic_Dialog_Solid);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x019f  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, zwb] */
    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        byte[] bArrG;
        this.n.b(xhb.a(11721), null, null);
        this.k = layoutInflater.inflate(R.layout.avatar_menu, viewGroup, false);
        int i = 2;
        if (Build.VERSION.SDK_INT >= 35 && !twm.v(getContext())) {
            this.C.c(this.x.M().ak(new iwb(this, i)));
        }
        InsetAdjustingToolbar insetAdjustingToolbar = (InsetAdjustingToolbar) this.k.findViewById(R.id.toolbar);
        insetAdjustingToolbar.q(this.p.b(arqz.oQ));
        insetAdjustingToolbar.C();
        insetAdjustingToolbar.F = false;
        insetAdjustingToolbar.G();
        insetAdjustingToolbar.s(this);
        View viewFindViewById = this.k.findViewById(R.id.guide_content);
        this.D = viewFindViewById.findViewById(R.id.unlimited_panel);
        this.E = (TextView) viewFindViewById.findViewById(R.id.unlimited_moniker);
        TextView textView = (TextView) viewFindViewById.findViewById(R.id.upgrade_unlimited_button);
        this.F = textView;
        textView.setOnClickListener(this);
        bac.p(this.F, B);
        this.G = (TextView) viewFindViewById.findViewById(R.id.upgrade_unlimited_subtitle);
        this.H = (LinearLayout) viewFindViewById.findViewById(R.id.guide_entries);
        insetAdjustingToolbar.setBackgroundColor(getContext().getColor(R.color.black_header_color));
        this.E.setBackgroundColor(getContext().getColor(R.color.black_header_color));
        View viewFindViewById2 = this.k.findViewById(R.id.account_header);
        ViewGroup viewGroup2 = (ViewGroup) this.k.findViewById(R.id.active_account_header_container);
        iwf iwfVar = this.s;
        xgn xgnVar = this.n;
        try {
            iwfVar.b = iwfVar.c.c();
            wqe wqeVar = iwfVar.b;
            airk airkVarA = wqeVar != null ? wqeVar.a() : null;
            if (airkVarA != null) {
                if ((airkVarA.b & 131072) != 0 && !airkVarA.n.E()) {
                    xgnVar.d(new xgj(airkVarA.n, (amud) null));
                }
                adly adlyVar = new adly();
                adlyVar.a(xgnVar);
                adlyVar.f("enable_account_header_gesture_logging", Boolean.TRUE);
                kro.Q(airkVarA, viewGroup2, iwfVar.d, adlyVar);
            }
        } catch (IOException e) {
            ((agrc) ((agrc) ((agrc) iwf.a.c().i(agso.a, "ActiveAcctHeaderCtlr")).j(e)).k("com/google/android/apps/youtube/music/ui/avatarmenu/ActiveAccountHeaderViewController", "init", ',', "ActiveAccountHeaderViewController.java")).t("Failed to load guide response");
        }
        viewFindViewById2.setVisibility(8);
        ((YouTubeTextView) this.k.findViewById(R.id.name)).setOnClickListener(new ivp(this, 3));
        PrivacyTosFooter privacyTosFooter = (PrivacyTosFooter) this.k.findViewById(R.id.privacy_tos_footer);
        l();
        View view = this.D;
        if (view != null && view.getVisibility() == 0) {
            xgn xgnVar2 = this.n;
            axfd axfdVar = this.z;
            anki ankiVarAp = axfdVar.ap(axfdVar.b.e());
            if (ankiVarAp == null) {
                bArrG = vzh.b;
            } else {
                ankj ankjVar = ankiVarAp.c;
                if (ankjVar == null) {
                    ankjVar = ankj.a;
                }
                if (ankjVar.b == 104347096) {
                    ankj ankjVar2 = ankiVarAp.c;
                    if (ankjVar2 == null) {
                        ankjVar2 = ankj.a;
                    }
                    bArrG = (ankjVar2.b == 104347096 ? (ankk) ankjVar2.c : ankk.a).e.G();
                } else {
                    bArrG = vzh.b;
                }
            }
            xgnVar2.l(new xgj(bArrG));
        }
        privacyTosFooter.a();
        privacyTosFooter.setVisibility(0);
        privacyTosFooter.findViewById(R.id.privacy_footer).setOnClickListener(new iks(2));
        privacyTosFooter.findViewById(R.id.tos_footer).setOnClickListener(new ivp(this, 4));
        this.F.setTypeface(ackm.ROBOTO_MEDIUM.c(getContext(), 0));
        this.F.setAllCaps(false);
        return this.k;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.C.b();
        this.t.l(this);
        super.onDestroyView();
    }

    @Override // defpackage.cc
    public final void onPause() {
        super.onPause();
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        this.y.y(this);
        this.t.f(this);
        Dialog dialog = this.f;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
            if (dialog.getWindow() != null) {
                Window window = dialog.getWindow();
                window.setWindowAnimations(R.style.SlideUpDownAnimation);
                window.setTitle(getResources().getString(R.string.account));
                window.setStatusBarColor(getContext().getColor(R.color.black_header_color));
            }
        }
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStop() {
        super.onStop();
        this.y.z(this);
    }

    @Override // defpackage.gzh
    public final void w(zwa zwaVar, jnm jnmVar) {
        if (jnmVar.C() != this.I) {
            l();
        }
    }

    @Override // defpackage.gzh
    public final void v(zwa zwaVar) {
    }
}

package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jjf extends jiz {
    private static final agrf j = agrf.h("com/google/android/apps/youtube/music/userengagement/MultiselectFormScreenFragment");
    public jjh c;
    public jjd d;
    public awmd e;
    public xgn f;
    public vxe g;
    final qr h = new jje(this);
    public yy i;
    private LoadingFrameLayout k;
    private elq l;

    @Override // defpackage.jiy
    public final void a() {
        ((LoadingFrameLayout) this.d.g.c()).h(3);
    }

    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [ackf, android.content.Context] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public final void d() {
        ajwo ajwoVar;
        xgj xgjVar;
        anrz anrzVar;
        int i;
        ?? r13;
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        ajwo ajwoVar2;
        ajwo ajwoVar3;
        ajwo ajwoVar4;
        ViewParent parent;
        alay alayVar4;
        try {
            hek hekVar = this.a;
            if (hekVar == null || this.b == null) {
                return;
            }
            if (hekVar instanceof heh) {
                heh hehVar = (heh) hekVar;
                ajwoVar = hehVar.f;
                xgjVar = new xgj(((wfy) hehVar.h).d());
            } else if (hekVar instanceof jjt) {
                xgjVar = new xgj(((jjt) hekVar).a.i, (amud) null);
                ajwoVar = null;
            } else {
                ajwoVar = null;
                xgjVar = null;
            }
            this.f.b(xhb.a(47355), ajwoVar, null);
            if (xgjVar != null) {
                this.f.d(xgjVar);
            }
            hek hekVar2 = this.a;
            if (hekVar2 instanceof heh) {
                alme almeVar = ((wfy) ((heh) hekVar2).h).a.f;
                if (almeVar == null) {
                    almeVar = alme.a;
                }
                anrzVar = almeVar.b == 209621365 ? (anrz) almeVar.c : anrz.a;
            } else {
                anrzVar = hekVar2 instanceof jjt ? ((jjt) hekVar2).a : null;
            }
            if (anrzVar != null) {
                jjh jjhVar = this.c;
                adly adlyVar = this.b;
                Resources resources = getResources();
                yy yyVar = jjhVar.e;
                ((LoadingFrameLayout) yyVar.c()).setAlpha(0.0f);
                ((LoadingFrameLayout) yyVar.c()).h(3);
                ViewGroup viewGroupC = yyVar.c();
                viewGroupC.animate().alpha(1.0f).setDuration(jjh.a.toMillis()).setListener(new jjg(viewGroupC));
                List list = jjhVar.d;
                list.clear();
                adlyVar.b.w(new xgj(anrzVar.i, (amud) null), null);
                FlexboxLayout flexboxLayout = (FlexboxLayout) yyVar.b(R.id.buttoncontainer);
                flexboxLayout.getClass();
                Iterator it = anrzVar.e.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    apji apjiVar = (apji) it.next();
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(ansa.b);
                    apjiVar.c(aihlVarCheckIsLite);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                    anry anryVar = (anry) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                    jkf jkfVar = new jkf(jjhVar.b);
                    jvn jvnVar = new jvn();
                    int dimension = (int) resources.getDimension(R.dimen.genre_margin);
                    jvnVar.setMargins(dimension, dimension, dimension, dimension);
                    jkfVar.setLayoutParams(jvnVar);
                    jkfVar.setPadding((int) resources.getDimension(R.dimen.genre_drawable_left), (int) resources.getDimension(R.dimen.genre_drawable_top), (int) resources.getDimension(R.dimen.genre_drawable_right), (int) resources.getDimension(R.dimen.genre_drawable_bottom));
                    int iGenerateViewId = View.generateViewId();
                    jkfVar.setId(iGenerateViewId);
                    list.add(Integer.valueOf(iGenerateViewId));
                    jjd jjdVar = jjhVar.c;
                    eqq eqqVar = new eqq(anryVar);
                    jjdVar.f.add(eqqVar);
                    jkfVar.setChecked(eqqVar.b);
                    jkfVar.b = eqqVar;
                    jkfVar.a = adlyVar;
                    alay alayVar5 = anryVar.c;
                    if (alayVar5 == null) {
                        alayVar5 = alay.a;
                    }
                    jkfVar.setText(ackj.k(null, alayVar5, null, false));
                    alay alayVar6 = anryVar.c;
                    if (alayVar6 == null) {
                        alayVar6 = alay.a;
                    }
                    jkfVar.setContentDescription(ackj.e(alayVar6));
                    flexboxLayout.addView(jkfVar);
                    adlyVar.b.w(new xgj(anryVar.g, (amud) null), null);
                }
                TextView textView = (TextView) yyVar.b(R.id.genre_header);
                textView.getClass();
                TextView textView2 = (TextView) yyVar.b(R.id.genre_subheader);
                textView2.getClass();
                TextView textView3 = (TextView) yyVar.b(R.id.genre_next_button);
                textView3.getClass();
                TextView textView4 = (TextView) yyVar.b(R.id.genre_ask_later_button);
                textView4.getClass();
                if ((anrzVar.b & 1) != 0) {
                    alayVar = anrzVar.c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    r13 = 0;
                } else {
                    r13 = 0;
                    alayVar = null;
                }
                textView.setText(ackj.k(r13, alayVar, r13, false));
                if ((anrzVar.b & 2) != 0) {
                    alayVar2 = anrzVar.d;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                } else {
                    alayVar2 = null;
                }
                textView2.setText(ackj.k(null, alayVar2, null, false));
                if ((anrzVar.b & 4) != 0) {
                    apji apjiVar2 = anrzVar.f;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    ajnf ajnfVar = (ajnf) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
                    textView3.setVisibility(0);
                    if ((ajnfVar.b & 64) != 0) {
                        alayVar4 = ajnfVar.m;
                        if (alayVar4 == null) {
                            alayVar4 = alay.a;
                        }
                    } else {
                        alayVar4 = null;
                    }
                    textView3.setText(ackj.k(null, alayVar4, null, false));
                    tuk.k(textView3, textView3.getBackground(), 0);
                    adlyVar.b.w(new xgj(ajnfVar.y, (amud) null), null);
                }
                if ((anrzVar.b & 8) == 0) {
                    ajwoVar2 = null;
                } else {
                    apji apjiVar3 = anrzVar.g;
                    if (apjiVar3 == null) {
                        apjiVar3 = apji.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajnp.a);
                    apjiVar3.c(aihlVarCheckIsLite3);
                    Object objK3 = apjiVar3.j.k(aihlVarCheckIsLite3.d);
                    ajnf ajnfVar2 = (ajnf) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3));
                    textView4.setVisibility(0);
                    if ((ajnfVar2.b & 64) != 0) {
                        alayVar3 = ajnfVar2.m;
                        if (alayVar3 == null) {
                            alayVar3 = alay.a;
                        }
                    } else {
                        alayVar3 = null;
                    }
                    textView4.setText(ackj.k(null, alayVar3, null, false));
                    tuk.k(textView4, textView4.getBackground(), 0);
                    ajwoVar2 = null;
                    adlyVar.b.w(new xgj(ajnfVar2.y, (amud) null), null);
                }
                ArrayList arrayList = new ArrayList();
                View viewB = yyVar.b(R.id.genre_header);
                viewB.getClass();
                arrayList.add(viewB);
                View viewB2 = yyVar.b(R.id.genre_subheader);
                viewB2.getClass();
                arrayList.add(viewB2);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    View viewB3 = yyVar.b(((Integer) it2.next()).intValue());
                    viewB3.getClass();
                    arrayList.add(viewB3);
                }
                View viewB4 = yyVar.b(R.id.genre_next_button);
                viewB4.getClass();
                arrayList.add(viewB4);
                View viewB5 = yyVar.b(R.id.genre_ask_later_button);
                viewB5.getClass();
                arrayList.add(viewB5);
                kro.L((View[]) arrayList.toArray(new View[0]));
                if (twb.c(jjhVar.b) && (parent = ((LoadingFrameLayout) yyVar.c()).getParent()) != null) {
                    parent.requestSendAccessibilityEvent(yyVar.c(), AccessibilityEvent.obtain(SemanticState.Modal));
                }
                jjd jjdVar2 = this.d;
                apji apjiVar4 = anrzVar.f;
                if (apjiVar4 == null) {
                    apjiVar4 = apji.a;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
                apjiVar4.c(aihlVarCheckIsLite4);
                Object objK4 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                ajnf ajnfVar3 = (ajnf) (objK4 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK4));
                if ((ajnfVar3.b & SemanticState.Multiline) != 0) {
                    ajwoVar3 = ajnfVar3.s;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                } else {
                    ajwoVar3 = ajwoVar2;
                }
                jjdVar2.e = ajwoVar3;
                if (jjdVar2.e == null) {
                    if ((ajnfVar3.b & SemanticState.Obscured) != 0) {
                        ajwoVar4 = ajnfVar3.r;
                        if (ajwoVar4 == null) {
                            ajwoVar4 = ajwo.a;
                        }
                    } else {
                        ajwoVar4 = ajwoVar2;
                    }
                    jjdVar2.e = ajwoVar4;
                }
                ViewGroup viewGroup = (ViewGroup) jjdVar2.g.b(R.id.root_view);
                viewGroup.getClass();
                jjdVar2.d = (TextView) viewGroup.findViewById(R.id.genre_next_button);
                TextView textView5 = (TextView) viewGroup.findViewById(R.id.genre_ask_later_button);
                jjdVar2.d.setOnClickListener(new jjc(jjdVar2, 1));
                apji apjiVar5 = anrzVar.g;
                if (apjiVar5 == null) {
                    apjiVar5 = apji.a;
                }
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajnp.a);
                apjiVar5.c(aihlVarCheckIsLite5);
                Object objK5 = apjiVar5.j.k(aihlVarCheckIsLite5.d);
                ajnf ajnfVar4 = (ajnf) (objK5 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK5));
                if ((ajnfVar4.b & SemanticState.Obscured) != 0) {
                    textView5.setOnClickListener(new jip(jjdVar2, ajnfVar4, 2));
                } else {
                    textView5.setOnClickListener(new jjc(jjdVar2, i));
                }
                if ((anrzVar.b & 32) != 0) {
                    vxe vxeVar = this.g;
                    ajwo ajwoVar5 = anrzVar.h;
                    if (ajwoVar5 == null) {
                        ajwoVar5 = ajwo.a;
                    }
                    vxeVar.a(ajwoVar5);
                }
            }
        } catch (jjk e) {
            ((agrc) ((agrc) ((agrc) j.b().i(agso.a, "MultiselectFormFragment")).j(e)).k("com/google/android/apps/youtube/music/userengagement/MultiselectFormScreenFragment", "presentLoaded", (char) 174, "MultiselectFormScreenFragment.java")).t("root view became invalid in MusicMultiselectFormRenderer.onCreateView");
        }
    }

    public final void e() {
        ((LoadingFrameLayout) f().a).h(3);
    }

    public final elq f() {
        elq elqVar = this.l;
        if (elqVar != null) {
            return elqVar;
        }
        ahno.O(this.k != null);
        elq elqVar2 = new elq(this.k);
        this.l = elqVar2;
        return elqVar2;
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.e.io();
        if (watchWhileLayout != null) {
            watchWhileLayout.B(false);
        }
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.genre_selection_fragment, viewGroup, false);
        this.k = loadingFrameLayout;
        loadingFrameLayout.setOnApplyWindowInsetsListener(new uic(1));
        this.i.a = this.k;
        xgn xgnVar = this.f;
        this.b = new adly();
        this.b.a(xgnVar);
        if (bundle != null) {
            this.a = (hek) bundle.getParcelable("OnboardingFragment_BrowseModel");
        }
        hek hekVar = this.a;
        if (hekVar == null || !hekVar.n()) {
            ((LoadingFrameLayout) f().a).h(2);
        } else {
            d();
        }
        return this.k;
    }

    @Override // defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        this.i.a = null;
        WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.e.io();
        if (watchWhileLayout != null) {
            watchWhileLayout.P(false);
        }
    }

    @Override // defpackage.cc
    public final void onPause() {
        this.h.f();
        super.onPause();
    }

    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        qv onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        bog viewLifecycleOwner = getViewLifecycleOwner();
        qr qrVar = this.h;
        onBackPressedDispatcher.c(viewLifecycleOwner, qrVar);
        hek hekVar = this.a;
        boolean z = false;
        if ((hekVar instanceof jjt) && ((jjt) hekVar).b.isPresent()) {
            z = true;
        }
        qrVar.g(z);
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        hek hekVar = this.a;
        if (hekVar instanceof heh) {
            bundle.putParcelable("OnboardingFragment_BrowseModel", (heh) hekVar);
        }
    }
}

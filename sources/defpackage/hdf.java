package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.search.ui.SearchToolbarView;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hdf implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public hdf(hre hreVar, int i) {
        this.$cid = i;
        this.a = hreVar;
    }

    /* JADX WARN: Type inference failed for: r8v61, types: [aunn, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numM;
        ScrollView scrollView;
        qw qwVar;
        qv onBackPressedDispatcher;
        int i = 1;
        ajnf ajnfVar = null;
        qw qwVar2 = null;
        EditText editText = null;
        switch (this.$cid) {
            case 0:
                hdj hdjVar = (hdj) this.a;
                ytf ytfVar = hdjVar.L;
                if (ytfVar != null && (numM = ((lqa) ytfVar.g).M()) != null && numM.intValue() < hdjVar.s.d.size()) {
                    apji apjiVar = (apji) hdjVar.s.d.get(numM.intValue());
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(anyj.a);
                    apjiVar.c(aihlVarCheckIsLite);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                    ajwo ajwoVar = ((anyi) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).g;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apma.a);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    ajwo ajwoVar2 = ((aplz) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).b;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aotf.b);
                    ajwoVar2.c(aihlVarCheckIsLite3);
                    if (ajwoVar2.j.n(aihlVarCheckIsLite3.d)) {
                        apji apjiVar2 = hdjVar.s.j;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajnp.a);
                        apjiVar2.c(aihlVarCheckIsLite4);
                        Object objK3 = apjiVar2.j.k(aihlVarCheckIsLite4.d);
                        hdjVar.r(((ajnf) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3))).y);
                        hdjVar.D.a(ajwoVar2);
                    }
                    break;
                }
                break;
            case 1:
                hdj hdjVar2 = (hdj) this.a;
                hdjVar2.r(hdjVar2.j());
                break;
            case 2:
                ((bp) this.a).iQ(false, false, false);
                break;
            case 3:
                Object obj = this.a;
                hre hreVar = (hre) obj;
                if (view != hreVar.d) {
                    if (view == hreVar.t) {
                        ajnfVar = hreVar.v;
                    } else if (view == hreVar.u) {
                        ajnfVar = hreVar.w;
                    }
                    ((aatv) obj).d(ajnfVar);
                    hreVar.s.dismiss();
                    break;
                } else {
                    Resources resources = hreVar.h.getResources();
                    boolean z = hreVar.f;
                    hreVar.f = !z;
                    LinearLayout linearLayout = hreVar.e;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(true != z ? 0 : 8);
                    }
                    ImageView imageView = hreVar.c;
                    if (imageView != null) {
                        imageView.setImageResource(true != hreVar.f ? R.drawable.yt_outline_chevron_down_black_24 : R.drawable.yt_outline_chevron_up_black_24);
                        hreVar.c.setContentDescription(hreVar.f ? resources.getString(R.string.accessibility_collapse_content) : resources.getString(R.string.accessibility_expand_content));
                    }
                    if (hreVar.f && (scrollView = hreVar.a) != null) {
                        scrollView.post(new hgx(this, 10));
                        break;
                    }
                }
                break;
            case 4:
                hvw hvwVar = (hvw) this.a;
                if (hvwVar.d != null) {
                    hvwVar.b.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(147448)), null);
                    hvwVar.a.a(hvwVar.d);
                }
                break;
            case 5:
                hye hyeVar = (hye) this.a;
                igk igkVar = hyeVar.o;
                igkVar.g(igkVar.c().plusMinutes(5L));
                hyeVar.q();
                break;
            case 6:
                ((hye) this.a).s();
                break;
            case 7:
                iix iixVar = (iix) this.a;
                if (iixVar.b()) {
                    iixVar.c.c(new haz(false, "DeepLink event canceled by user."));
                    fv fvVar = iixVar.g;
                    if (fvVar != null) {
                        fvVar.dismiss();
                    }
                }
                break;
            case 8:
                ((tbt) this.a).c(new iiy());
                break;
            case 9:
                Object obj2 = this.a;
                ijg ijgVar = (ijg) obj2;
                aosu aosuVar = ijgVar.e;
                if ((aosuVar.b & SemanticState.Focused) != 0) {
                    taf.i(ijgVar.d.a(aosuVar), ijgVar.c, new ijj(obj2, i), new hvn(obj2, 7), new gqd(8));
                }
                ijgVar.b.c(new iiy());
                break;
            case 10:
                ((ijr) this.a).requireActivity().getOnBackPressedDispatcher().d();
                break;
            case 11:
                Object obj3 = this.a;
                ((adtv) obj3).z();
                adww adwwVar = ((ikn) obj3).e;
                if (adwwVar != null) {
                    adwwVar.hP();
                }
                break;
            case 12:
                ((cc) this.a).requireActivity().getOnBackPressedDispatcher().d();
                break;
            case 13:
                EditText editText2 = ((ilc) this.a).b;
                if (editText2 == null) {
                    awrc.b("searchEditText");
                } else {
                    editText = editText2;
                }
                editText.setText("");
                break;
            case 14:
                ((imb) this.a).requireActivity().getOnBackPressedDispatcher().d();
                break;
            case 15:
                Object obj4 = this.a;
                if (!kro.M((cc) obj4)) {
                    ioc iocVar = (ioc) obj4;
                    SearchToolbarView searchToolbarView = iocVar.u;
                    if (searchToolbarView != null) {
                        searchToolbarView.b.setText("");
                        iocVar.u.e();
                    }
                    admu admuVar = iocVar.w;
                    if (admuVar != null) {
                        admuVar.clear();
                    }
                    iocVar.g();
                }
                break;
            case 16:
                Object obj5 = this.a;
                iog iogVar = (iog) obj5;
                iogVar.F.c(hdt.MUSIC_SEARCH_DOWNLOADS);
                hel helVar = iogVar.F;
                iogVar.G = helVar.b;
                iogVar.h(helVar, new IOException(((cc) obj5).getContext().getString(R.string.common_error_network)));
                break;
            case 17:
                ((iog) this.a).k("");
                break;
            case 18:
                iog iogVar2 = (iog) this.a;
                iogVar2.k(ahno.Z(iogVar2.C));
                break;
            case 19:
                Object obj6 = this.a;
                SearchToolbarView searchToolbarView2 = (SearchToolbarView) obj6;
                tuk.i(searchToolbarView2.b);
                if (searchToolbarView2.k().l(8, 45764180L, false) && searchToolbarView2.j && !searchToolbarView2.k().l(9, 45780438L, false)) {
                    searchToolbarView2.k = false;
                    searchToolbarView2.f();
                    break;
                } else {
                    while (true) {
                        if (obj6 != null) {
                            View view2 = (View) obj6;
                            Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                            qwVar = tag instanceof qw ? (qw) tag : null;
                            if (qwVar == null) {
                                Object objD = bcy.d(view2);
                                obj6 = objD instanceof View ? (View) objD : null;
                            }
                        } else {
                            qwVar = null;
                        }
                    }
                    if (qwVar == null) {
                        for (Object context = searchToolbarView2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                            if (context instanceof qw) {
                                qwVar2 = (qw) context;
                            }
                        }
                    } else {
                        qwVar2 = qwVar;
                    }
                    if (qwVar2 != null && (onBackPressedDispatcher = qwVar2.getOnBackPressedDispatcher()) != null) {
                        onBackPressedDispatcher.d();
                        break;
                    }
                }
                break;
            default:
                aack aackVar = (aack) this.a;
                ((rql) aackVar.b.io()).d((Activity) aackVar.e, null);
                break;
        }
    }

    public /* synthetic */ hdf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}

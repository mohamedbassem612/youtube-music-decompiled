package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.search.ui.SearchToolbarView;
import com.google.android.apps.youtube.music.survey.HatsContainer;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ivp implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ivp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ce A[PHI: r7
      0x02ce: PHI (r7v16 java.lang.String) = (r7v15 java.lang.String), (r7v17 java.lang.String) binds: [B:135:0x02cc, B:133:0x02ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String simCountryIso;
        String strD;
        RecyclerView recyclerView;
        oh ohVarJ;
        adwg adwgVar;
        ajwo ajwoVar;
        String str = null;
        numValueOf = null;
        Integer numValueOf = null;
        switch (this.$cid) {
            case 0:
                ((HatsContainer) this.a).b();
                break;
            case 1:
                ivn ivnVar = (ivn) this.a;
                ivnVar.k = null;
                ivnVar.f();
                break;
            case 2:
                ((HatsContainer) this.a).b();
                break;
            case 3:
                ((iwj) this.a).m();
                break;
            case 4:
                Context context = view.getContext();
                tyt tytVar = new tyt(Uri.parse(context.getResources().getString(R.string.uri_youtube_terms)));
                Context applicationContext = context.getApplicationContext();
                String str2 = ((iwj) this.a).q;
                if (str2 == null) {
                    str2 = "";
                }
                Set set = vzh.c;
                TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
                if (telephonyManager != null) {
                    simCountryIso = telephonyManager.getSimCountryIso();
                    if (!TextUtils.isEmpty(simCountryIso)) {
                        simCountryIso = typ.d(simCountryIso);
                        if (set.contains(simCountryIso)) {
                            str = simCountryIso;
                        }
                    }
                    tytVar.f("gl", str);
                    sxy.f(context, Uri.parse(tytVar.toString()));
                } else {
                    simCountryIso = null;
                }
                if (!TextUtils.isEmpty(simCountryIso) || TextUtils.isEmpty(str2)) {
                    strD = typ.d(Locale.getDefault().getCountry());
                    if (set.contains(strD)) {
                        str = strD;
                    }
                } else {
                    strD = typ.d(str2);
                    if (set.contains(strD)) {
                        str = strD;
                    } else {
                        strD = typ.d(Locale.getDefault().getCountry());
                        if (set.contains(strD)) {
                            str = strD;
                        }
                    }
                }
                tytVar.f("gl", str);
                sxy.f(context, Uri.parse(tytVar.toString()));
                break;
            case 5:
                advm advmVar = ((ixx) this.a).c;
                if (advmVar != null) {
                    advmVar.a();
                }
                break;
            case 6:
                ixy ixyVar = ((ixx) this.a).d;
                if (ixyVar != null) {
                    ixyVar.a();
                }
                break;
            case 7:
                sxy.f((Context) ((isi) this.a).a, Uri.parse("https://support.google.com/youtube/answer/7341336"));
                break;
            case 8:
                iyn iynVar = (iyn) this.a;
                if (!iynVar.c) {
                    iynVar.c = true;
                    iynVar.a.b(iynVar.d);
                    iynVar.b.clear();
                }
                break;
            case 9:
                jbf jbfVar = (jbf) this.a;
                View view2 = jbfVar.a;
                afwl.m(view2.getContext(), irf.a(view2.getContext(), gzn.PLAYBACK_SETTINGS_FRAGMENT, null, jbfVar.g));
                break;
            case 10:
                jbi jbiVar = (jbi) this.a;
                ioc iocVar = jbiVar.d;
                if (iocVar != null) {
                    String string = jbiVar.a.getText().toString();
                    View view3 = jbiVar.b;
                    if (!kro.M(iocVar) && (recyclerView = iocVar.A) != null && (ohVarJ = recyclerView.j(view3)) != null) {
                        iocVar.z.h = 2;
                        int iA = ohVarJ.a();
                        if (iA != -1 && (adwgVar = iocVar.t) != null) {
                            if (adwgVar.j.d(iA) instanceof alhu) {
                                ajwoVar = ((alhu) iocVar.t.j.d(iA)).g;
                                if (ajwoVar == null) {
                                    ajwoVar = ajwo.a;
                                }
                            } else if (iocVar.t.j.d(iA) instanceof apnx) {
                                ajwoVar = ((apnx) iocVar.t.j.d(iA)).d;
                                if (ajwoVar == null) {
                                    ajwoVar = ajwo.a;
                                }
                            } else if (iocVar.t.j.d(iA) instanceof anzi) {
                                ajwoVar = ((anzi) iocVar.t.j.d(iA)).i;
                                if (ajwoVar == null) {
                                    ajwoVar = ajwo.a;
                                }
                            } else {
                                ajwoVar = null;
                            }
                            if (iocVar.t != null) {
                                agjz agjzVar = new agjz(4);
                                for (int i = 0; i < iocVar.t.j.a(); i++) {
                                    if (hmy.X(iocVar.t.j.d(i))) {
                                        agjzVar.h(iocVar.t.j.d(i));
                                    }
                                }
                                agke agkeVarG = agjzVar.g();
                                for (int i2 = 0; i2 < ((agpi) agkeVarG).d; i2++) {
                                    if (agkeVarG.get(i2).equals(iocVar.t.j.d(iA))) {
                                        numValueOf = Integer.valueOf(i2);
                                    }
                                }
                            }
                            iocVar.h(string, numValueOf, ajwoVar);
                            break;
                        }
                    }
                }
                break;
            case 11:
                jbi jbiVar2 = (jbi) this.a;
                ioc iocVar2 = jbiVar2.d;
                if (iocVar2 != null) {
                    String string2 = jbiVar2.f(jbiVar2.c).toString();
                    if (!kro.M(iocVar2)) {
                        iocVar2.z.a(alxs.QUERY_BUILDER);
                        SearchToolbarView searchToolbarView = iocVar2.u;
                        if (searchToolbarView != null) {
                            searchToolbarView.b.setText(string2);
                            tuk.j(iocVar2.u.b);
                        }
                        iocVar2.g();
                    }
                }
                break;
            case 12:
                jdb jdbVar = (jdb) this.a;
                jig jigVar = jdbVar.b;
                jigVar.b();
                if (jigVar.d) {
                    jdbVar.c.setVisibility(0);
                }
                break;
            case 13:
                jdb jdbVar2 = (jdb) this.a;
                jdbVar2.b.c();
                jdbVar2.c.setVisibility(8);
                break;
            case 14:
                jdm jdmVar = (jdm) this.a;
                jdmVar.a.setHasTransientState(true);
                RecyclerView recyclerView2 = jdmVar.d;
                ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
                if (layoutParams != null && layoutParams.height <= 0) {
                    layoutParams.height = 1;
                }
                Animation animation = jdmVar.f;
                animation.setDuration((int) ((Math.abs(jdmVar.i - jdmVar.h) << 1) / recyclerView2.getContext().getResources().getDisplayMetrics().density));
                jcc jccVar = jdmVar.e;
                boolean z = jccVar.f;
                jccVar.f = !z;
                tuk.u(jccVar.d, !z ? jccVar.h : jccVar.g);
                ImageView imageView = jccVar.e;
                imageView.setImageResource(jccVar.f ? jccVar.j : jccVar.i);
                imageView.setContentDescription(jccVar.f ? jccVar.l : jccVar.k);
                jdmVar.g = jccVar.f;
                recyclerView2.startAnimation(animation);
                break;
            case 15:
                jdu jduVar = (jdu) this.a;
                jig jigVar2 = jduVar.x;
                jigVar2.b();
                if (jigVar2.d) {
                    jduVar.y.setVisibility(0);
                }
                break;
            case 16:
                jdu jduVar2 = (jdu) this.a;
                jduVar2.x.c();
                jduVar2.y.setVisibility(8);
                break;
            case 17:
                ((jem) this.a).f.performClick();
                break;
            case 18:
                ((jge) this.a).e();
                break;
            case 19:
                ((jge) this.a).f(2);
                break;
            default:
                jgx jgxVar = (jgx) this.a;
                adly adlyVar = jgxVar.b;
                if (adlyVar != null && adlyVar.j("hideKeyboardOnClick")) {
                    tuk.i(view);
                }
                jgxVar.a.onClick(view);
                break;
        }
    }

    public ivp(jdm jdmVar, int i) {
        this.$cid = i;
        this.a = jdmVar;
    }
}

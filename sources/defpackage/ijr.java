package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ijr extends ija {
    public xgn a;
    public wsg b;
    public jer c;
    public iwe d;
    public ijs e;
    public ggd f;
    public LoadingFrameLayout g;
    public ahek h;
    private admh i;
    private View j;
    private Toolbar k;
    private RecyclerView l;
    private admu m;

    public final void c(aovk aovkVar) {
        nh nhVar;
        xgj xgjVar = new xgj(aovkVar.d, (amud) null);
        this.a.d(xgjVar);
        Toolbar toolbar = this.k;
        if (toolbar != null) {
            alay alayVar = aovkVar.b;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            toolbar.v(alayVar.d);
        }
        admu admuVar = this.m;
        if (admuVar != null) {
            admuVar.clear();
            for (aovl aovlVar : aovkVar.c) {
                if ((aovlVar.b & 4) != 0) {
                    admu admuVar2 = this.m;
                    aovg aovgVar = aovlVar.c;
                    if (aovgVar == null) {
                        aovgVar = aovg.a;
                    }
                    admuVar2.add(aovgVar);
                    this.a.e(new xgj(xhb.b(99282)), xgjVar);
                }
            }
        }
        RecyclerView recyclerView = this.l;
        if (recyclerView != null && (nhVar = recyclerView.m) != null) {
            nhVar.jW();
        }
        LoadingFrameLayout loadingFrameLayout = this.g;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.h(3);
        }
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        ijs ijsVar;
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null && (ijsVar = (ijs) bundle.getParcelable("navigation_model")) != null) {
            this.e = ijsVar;
        }
        this.i = this.c.a;
    }

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
    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.e != null) {
            this.a.b(xhb.a(20445), this.e.f, null);
        }
        View view = this.j;
        if (view != null) {
            return view;
        }
        View viewInflate = layoutInflater.inflate(R.layout.playlist_settings_editor_fragment, viewGroup, false);
        this.j = viewInflate;
        Toolbar toolbar = (Toolbar) viewInflate.findViewById(R.id.toolbar);
        this.k = toolbar;
        toolbar.setBackgroundColor(getContext().getColor(R.color.black_header_color));
        this.f = new ggd(this.j.findViewById(R.id.toolbar_divider));
        this.g = (LoadingFrameLayout) this.j.findViewById(R.id.content_container);
        RecyclerView recyclerView = (RecyclerView) this.j.findViewById(R.id.content);
        this.l = recyclerView;
        recyclerView.ah(new LinearLayoutManager(recyclerView.getContext()));
        ahek ahekVar = this.h;
        admh admhVar = this.i;
        admhVar.getClass();
        admo admoVarD = ahekVar.d(admhVar);
        adly adlyVar = new adly();
        adlyVar.a(this.a);
        admu admuVar = new admu();
        this.m = admuVar;
        admoVarD.D(admuVar, adlyVar);
        this.l.ad(admoVarD);
        this.l.aC(new ijq(this));
        this.k.o(R.string.navigate_back);
        this.k.C();
        this.k.s(new hdf(this, 10));
        ijs ijsVar = this.e;
        if (ijsVar == null || ijsVar.f == null) {
            LoadingFrameLayout loadingFrameLayout = this.g;
            loadingFrameLayout.f(loadingFrameLayout.getContext().getString(R.string.music_error_generic), false, false, false);
        } else {
            LoadingFrameLayout loadingFrameLayout2 = this.g;
            if (loadingFrameLayout2 != null) {
                loadingFrameLayout2.h(2);
            }
            ijs ijsVar2 = this.e;
            if (ijsVar2 != null) {
                Object obj = ijsVar2.h;
                if (obj != null) {
                    alwq alwqVar = ((alwp) obj).c;
                    if (alwqVar == null) {
                        alwqVar = alwq.a;
                    }
                    c(alwqVar.b == 78398567 ? (aovk) alwqVar.c : aovk.a);
                } else {
                    wsg wsgVar = this.b;
                    wsd wsdVar = new wsd(wsgVar.b, wsgVar.c.e());
                    ajwo ajwoVar = this.e.f;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aoth.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                    wsdVar.a = wsd.j(((aoth) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c);
                    wsdVar.n(this.e.f.c);
                    this.b.g.d(wsdVar, new gtg(this, 4));
                }
            }
        }
        return this.j;
    }

    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        this.d.a(getContext().getColor(R.color.black_header_color));
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        bundle.putParcelable("navigation_model", this.e);
    }
}

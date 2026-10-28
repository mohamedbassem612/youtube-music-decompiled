package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gqi extends gon implements hlo {
    public awmd U;
    private View V;
    private dd W;

    @Override // defpackage.gnf
    public final String f() {
        return "music_android_liked";
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.default_outer_fragment, viewGroup, false);
        this.V = viewInflate;
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewInflate.findViewById(R.id.browse_content);
        this.W = getChildFragmentManager();
        this.P = this.O.s(loadingFrameLayout);
        j(loadingFrameLayout);
        this.G.a();
        ((WatchWhileLayout) this.U.io()).B(false);
        return this.V;
    }

    @Override // defpackage.cc
    public final void onDestroy() {
        this.G.j();
        ((WatchWhileLayout) this.U.io()).P(false);
        super.onDestroy();
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onDestroyView() {
        this.V = null;
        this.W = null;
        super.onDestroyView();
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onPause() {
        super.onPause();
        requireActivity().getWindow().getDecorView().setSystemUiVisibility(0);
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onResume() {
        super.onResume();
        requireActivity().getWindow().getDecorView().setSystemUiVisibility(4);
    }

    @Override // defpackage.gnf, defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        G();
        if (this.s.l(1) || this.s.g == hei.e) {
            R(false, 1);
        }
        o(this.s);
    }

    @Override // defpackage.gnf
    protected final void r(heh hehVar) {
        super.m(hehVar);
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.n(hehVar.f, hehVar.n);
        }
    }

    @Override // defpackage.gnf
    protected final void s(heh hehVar) {
        super.m(hehVar);
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.l();
            this.P.p();
        }
    }

    @Override // defpackage.gnf
    protected final void t(heh hehVar) {
        String strB;
        super.t(hehVar);
        if (this.W != null && (strB = hehVar.b()) != null) {
            alme almeVar = ((wfy) hehVar.h).a.f;
            if (almeVar == null) {
                almeVar = alme.a;
            }
            if (almeVar.b == 58173949) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("model", hehVar);
                got gotVar = new got();
                gotVar.setArguments(bundle);
                av avVar = new av(this.W);
                avVar.p();
                avVar.g(R.id.feed_fragment_container, gotVar, hdu.a(strB), 1);
                avVar.e();
            } else {
                wfy wfyVar = (wfy) hehVar.h;
                alme almeVar2 = wfyVar.a.f;
                if (almeVar2 == null) {
                    almeVar2 = alme.a;
                }
                if (almeVar2.b != 153515154) {
                    throw new IllegalStateException("Unexpected response contents: this fragment cannot handle this response.");
                }
                gop gopVarC = gop.c(wfyVar, hehVar.f);
                av avVar2 = new av(this.W);
                avVar2.p();
                avVar2.g(R.id.feed_fragment_container, gopVarC, hdu.a(strB), 1);
                avVar2.e();
            }
        }
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.m();
        }
    }

    @Override // defpackage.gnf
    protected final void u(heh hehVar) {
        isi isiVar = this.P;
        if (isiVar != null) {
            isiVar.p();
        }
    }

    @Override // defpackage.gnf
    protected final void w(heh hehVar) {
        String strH = h();
        if (strH != null) {
            Toolbar toolbar = this.B;
            if (toolbar != null) {
                toolbar.v(strH);
            }
            View view = this.V;
            if (view != null) {
                Q(view, strH);
            }
        }
    }

    @Override // defpackage.hlo
    public final /* synthetic */ void U() {
    }

    @Override // defpackage.hlo
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.hlo
    public final /* synthetic */ void W() {
    }
}

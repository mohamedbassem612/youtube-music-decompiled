package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gop extends goi implements adtm {
    public xgn a;
    public tbt b;
    public Handler c;
    public jer d;
    public acxn e;
    public hkl f;
    private ViewGroup g;
    private wfy h;
    private ajwo i;

    public static gop c(wfy wfyVar, ajwo ajwoVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("response_model", wfyVar);
        bundle.putByteArray("invoking_navigation", ajwoVar.toByteArray());
        gop gopVar = new gop();
        gopVar.setArguments(bundle);
        return gopVar;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle != null) {
            this.h = (wfy) bundle.getParcelable("response_model");
            this.i = vxg.b(bundle.getByteArray("invoking_navigation"));
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.elements_inner_fragment, viewGroup, false);
        this.g = (ViewGroup) viewInflate.findViewById(R.id.elements_component_holder);
        if (this.h != null) {
            this.a.D(xhb.a(fhz.r(this.i)), xgu.a, this.i);
            if (this.f.m()) {
                this.f.c(this.a);
            }
            this.a.d(new xgj(this.h.d()));
            wfy wfyVar = this.h;
            if (wfyVar != null && this.g != null) {
                alme almeVar = wfyVar.a.f;
                if (almeVar == null) {
                    almeVar = alme.a;
                }
                acxm acxmVarA = this.e.a(almeVar.b == 153515154 ? (akrn) almeVar.c : akrn.a);
                adly adlyVar = new adly();
                adlyVar.a(this.a);
                adlyVar.f("ElementPresenter#LAYOUT_PARAMS", new ViewGroup.LayoutParams(-1, -1));
                kro.Q(acxmVarA, this.g, this.d.a, adlyVar);
            }
            this.c.postAtFrontOfQueue(new gnc(this, 7));
        }
        return viewInflate;
    }

    @Override // defpackage.cc
    public final void onDestroyView() {
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            kro.X(viewGroup, this.d.a);
            this.g = null;
        }
        super.onDestroyView();
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        bundle.putParcelable("response_model", this.h);
        ajwo ajwoVar = this.i;
        if (ajwoVar != null) {
            bundle.putByteArray("invoking_navigation", ajwoVar.toByteArray());
        }
    }

    @Override // defpackage.adtm
    public final void p(toe toeVar, acjx acjxVar) {
    }
}

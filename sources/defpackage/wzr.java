package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wzr extends wzj {
    public advb a;
    private View b;

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.a.b(amnw.class);
        this.a.b(amqd.class);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        adma admaVarE;
        Object obj = ((wyb) getArguments().getParcelable("picker_panel")).a;
        if (obj != null && (admaVarE = adul.e((admh) this.a.io(), obj, viewGroup)) != null) {
            adly adlyVar = new adly();
            adlyVar.f("listenerKey", this);
            admaVarE.hU(adlyVar, obj);
            this.b = admaVarE.a();
        }
        return this.b;
    }
}

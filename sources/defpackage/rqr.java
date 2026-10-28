package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rqr extends rqj implements rqh {
    private boolean A;
    public ttm l;
    public wnw m;
    public tbt n;
    public xgn o;
    public adhv p;
    public rre q;
    public zwb r;
    public rlw s;
    public vxe t;
    public xeu u;
    public rqa v;
    public vxz w;
    public ci x;
    public qcb y;
    private rqq z;

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        this.A = false;
        super.iQ(true, false, false);
    }

    @Override // defpackage.rqh
    public final void k(rqg rqgVar) {
        this.n.c(rqgVar);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.A = bundle.getBoolean("inProgress", false);
        iO(1, 0);
        if (bundle.containsKey("endpoint")) {
            try {
                byte[] byteArray = bundle.getByteArray("endpoint");
                byteArray.getClass();
                this.k = (ajwo) aihn.parseFrom(ajwo.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik unused) {
            }
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        apzh apzhVar;
        ajwo ajwoVar;
        ajwo ajwoVar2 = this.k;
        if (ajwoVar2 == null) {
            apzhVar = null;
        } else {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
            ajwoVar2.c(aihlVarCheckIsLite);
            Object objK = ajwoVar2.j.k(aihlVarCheckIsLite.d);
            apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        }
        if (apzhVar == null || (apzhVar.b & 2) == 0) {
            ajwoVar = null;
        } else {
            ajwo ajwoVar3 = apzhVar.c;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            ajwoVar = ajwoVar3;
        }
        rqt rqtVar = new rqt(getActivity(), this.l, this.o, this.p, this.x, this.w);
        rqq rqqVar = new rqq(rqtVar, getActivity(), this.q, this.m, this.s, this.r, this.v, this.y, this, ajwoVar, this.t, this.A, this.u);
        this.z = rqqVar;
        rqtVar.i = rqqVar;
        this.o.b(xhb.a(14586), this.k, null);
        return rqtVar.d;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        this.z.b();
        Dialog dialog = this.f;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        super.onDestroyView();
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.z.a();
    }

    @Override // defpackage.cc
    public final void onPause() {
        this.n.l(this);
        super.onPause();
    }

    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        this.A = true;
        this.n.f(this);
        this.z.d();
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        bundle.putBoolean("inProgress", this.z.c);
        ajwo ajwoVar = this.k;
        if (ajwoVar != null) {
            bundle.putByteArray("endpoint", ajwoVar.toByteArray());
        }
    }
}

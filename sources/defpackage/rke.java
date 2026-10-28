package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rke extends rka implements AdapterView.OnItemClickListener {
    public zwi k;
    public vxe l;
    public zvv m;
    public ajwo n;

    @Override // defpackage.qnw
    protected final int i() {
        return 0;
    }

    @Override // defpackage.qnw
    protected final /* synthetic */ ListAdapter k() {
        qnv qnvVar = new qnv(getActivity());
        rkd rkdVar = new rkd(getActivity().getString(R.string.turn_off_incognito));
        rkdVar.f = getActivity().getDrawable(R.drawable.quantum_ic_incognito_circle_grey600_36);
        rkdVar.d(tzk.n(getActivity(), R.attr.ytTextPrimary).orElse(-16777216));
        qnvVar.add(rkdVar);
        return qnvVar;
    }

    @Override // defpackage.qnw
    protected final String l() {
        return null;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        apzh apzhVar;
        ajwo ajwoVar = this.n;
        if (ajwoVar == null) {
            apzhVar = null;
        } else {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        }
        if (apzhVar == null || (apzhVar.b & SemanticState.Focused) == 0) {
            return;
        }
        vxe vxeVar = this.l;
        ajwo ajwoVar2 = apzhVar.f;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        vxeVar.a(ajwoVar2);
    }

    @Override // defpackage.qnw, defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle == null || !bundle.containsKey("endpoint")) {
            return;
        }
        try {
            this.n = (ajwo) aihn.parseFrom(ajwo.a, bundle.getByteArray("endpoint"), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
        }
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.k.a();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        apzh apzhVar;
        ajwo ajwoVar = this.n;
        ajwo ajwoVar2 = null;
        if (ajwoVar == null) {
            apzhVar = null;
        } else {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        }
        if (apzhVar != null && (apzhVar.b & 2) != 0 && (ajwoVar2 = apzhVar.c) == null) {
            ajwoVar2 = ajwo.a;
        }
        this.k.b(this.m, ajwoVar2);
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        ajwo ajwoVar = this.n;
        if (ajwoVar != null) {
            bundle.putByteArray("endpoint", ajwoVar.toByteArray());
        }
    }

    @Override // defpackage.qnw, defpackage.bp, defpackage.cc
    public final void onStart() {
        View view = getView();
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
        super.onStart();
    }

    @Override // defpackage.qnw
    protected final AdapterView.OnItemClickListener j() {
        return this;
    }
}

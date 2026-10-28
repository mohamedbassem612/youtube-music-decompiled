package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sud extends bp {
    public static final String k = "sud";
    private Optional l = Optional.empty();
    private boolean m = true;

    @Override // defpackage.bp
    public final void gT(dd ddVar, String str) {
        if (isAdded()) {
            return;
        }
        super.gT(ddVar, str);
    }

    public final void i() {
        if (isAdded()) {
            super.iQ(true, false, false);
        }
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        fu fuVar = new fu(requireActivity());
        fq fqVar = fuVar.a;
        fqVar.r = null;
        fqVar.q = R.layout.loading_dialog;
        fv fvVarCreate = fuVar.create();
        fvVarCreate.setCanceledOnTouchOutside(false);
        fvVarCreate.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        if (this.l.isPresent() && this.m) {
            fvVarCreate.getOnBackPressedDispatcher().c(this, (qr) this.l.get());
        } else {
            fvVarCreate.setCancelable(this.m);
        }
        return fvVarCreate;
    }

    @Override // defpackage.bp
    public final void iR(boolean z) {
        super.iR(false);
        this.m = false;
    }

    @Deprecated
    public final void j(qr qrVar) {
        this.l = Optional.ofNullable(qrVar);
    }
}

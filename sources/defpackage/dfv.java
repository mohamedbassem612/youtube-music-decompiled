package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class dfv extends bp {
    public Dialog k;
    public did l;

    public dfv() {
        iR(true);
    }

    public final void i() {
        if (this.l == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.l = did.a(arguments.getBundle("selector"));
            }
            if (this.l == null) {
                this.l = did.a;
            }
        }
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        dfu dfuVarJ = j(getContext());
        this.k = dfuVarJ;
        i();
        dfuVarJ.i(this.l);
        return this.k;
    }

    public dfu j(Context context) {
        return new dfu(context);
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.k;
        if (dialog != null) {
            ((dfu) dialog).j();
        }
    }
}

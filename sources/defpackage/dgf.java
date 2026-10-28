package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class dgf extends bp {
    public Dialog k;
    public did l;

    public dgf() {
        iR(true);
    }

    public dge i(Context context) {
        return new dge(context, 0);
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        dge dgeVarI = i(getContext());
        this.k = dgeVarI;
        return dgeVarI;
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.k;
        if (dialog != null) {
            ((dge) dialog).s();
        }
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStop() {
        super.onStop();
        Dialog dialog = this.k;
        if (dialog != null) {
            ((dge) dialog).l(false);
        }
    }
}

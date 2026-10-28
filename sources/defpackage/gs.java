package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gs extends bp {
    @Override // defpackage.bp
    public Dialog iH(Bundle bundle) {
        return new gr(getContext(), this.b);
    }

    @Override // defpackage.bp
    public final void iS(Dialog dialog, int i) {
        if (!(dialog instanceof gr)) {
            super.iS(dialog, i);
            return;
        }
        gr grVar = (gr) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        grVar.e();
    }
}

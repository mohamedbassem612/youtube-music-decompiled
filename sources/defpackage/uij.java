package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uij extends uii {
    @Override // defpackage.uii, defpackage.aevy, defpackage.gs, defpackage.bp
    public final Dialog iH(Bundle bundle) {
        Dialog dialogIH = super.iH(bundle);
        if (dialogIH.getWindow() != null) {
            dialogIH.getWindow().getDecorView().setSystemUiVisibility(4357);
            dialogIH.getWindow().setFlags(8, 8);
        }
        return dialogIH;
    }

    @Override // defpackage.uii
    protected final void l() {
        iO(0, R.style.ReelsBottomSheetDialog_Immersive);
    }
}

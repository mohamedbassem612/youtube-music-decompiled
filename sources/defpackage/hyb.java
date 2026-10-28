package defpackage;

import android.app.Dialog;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class hyb extends adya {
    @Override // defpackage.adya, defpackage.qnw, defpackage.bp, defpackage.cc
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f;
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        dialog.getWindow().setBackgroundDrawableResource(R.color.ytm_theme_main_color_primary);
    }
}

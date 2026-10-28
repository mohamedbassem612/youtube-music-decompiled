package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hrd extends aatv {
    public hrd(Context context, AlertDialog.Builder builder, vxe vxeVar, adhv adhvVar) {
        super(context, builder, vxeVar, adhvVar);
    }

    @Override // defpackage.aatv
    public final int a() {
        return R.layout.music_upsell_dialog;
    }

    @Override // defpackage.aatv
    protected final void b(AlertDialog alertDialog) {
        this.s.setOnCancelListener(new gxt(this, 2));
    }
}

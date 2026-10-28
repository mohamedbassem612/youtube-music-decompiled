package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hre extends aatv {
    public ScrollView a;
    public TextView b;
    public ImageView c;
    public LinearLayout d;
    public LinearLayout e;
    public boolean f;
    public int g;

    public hre(Context context, AlertDialog.Builder builder, vxe vxeVar, adhv adhvVar) {
        super(context, builder, vxeVar, adhvVar);
    }

    @Override // defpackage.aatv
    protected final void b(AlertDialog alertDialog) {
        alertDialog.setOnCancelListener(new gxt(this, 3));
        alertDialog.setOnShowListener(new gxu(this, 2, null));
    }

    public final int c(View view) {
        if (view == null) {
            return 0;
        }
        if (view.getParent() == this.a) {
            return view.getTop();
        }
        return c((View) view.getParent()) + view.getTop();
    }
}

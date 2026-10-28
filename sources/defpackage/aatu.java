package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aatu {
    public final Context a;
    public final vxe b;
    public final AlertDialog c;
    public final TextView d;
    public final TextView e;
    public xgn f;
    public ajnf g;
    public ajnf h;
    private final View i;

    public aatu(Context context, AlertDialog.Builder builder, vxe vxeVar) {
        this.a = context;
        this.b = vxeVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.upsell_dialog, (ViewGroup) null);
        this.i = viewInflate;
        this.d = (TextView) viewInflate.findViewById(R.id.dialog_title);
        this.e = (TextView) viewInflate.findViewById(R.id.dialog_message);
        this.c = builder.setView(viewInflate).create();
    }
}

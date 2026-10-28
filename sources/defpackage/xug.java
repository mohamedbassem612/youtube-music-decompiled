package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xug extends dge {
    public final xru X;
    public final dii Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xug(Context context, int i, xru xruVar) {
        super(context, i);
        context.getClass();
        xruVar.getClass();
        this.X = xruVar;
        dij.b(context);
        this.Y = dij.j();
    }

    @Override // defpackage.dge, defpackage.fv, defpackage.gr, defpackage.qg, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Button button = (Button) findViewById(R.id.button1);
        if (button != null) {
            button.setOnClickListener(new xpr(this, 20));
        }
    }
}

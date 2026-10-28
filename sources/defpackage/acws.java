package defpackage;

import android.app.AlertDialog;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class acws extends AlertDialog.Builder {
    private final boolean a;
    private final boolean b;

    public acws(Context context, boolean z, boolean z2) {
        super(context);
        this.a = z;
        this.b = z2;
    }

    @Override // android.app.AlertDialog.Builder
    public final AlertDialog create() {
        AlertDialog alertDialogCreate = super.create();
        boolean z = this.a;
        if (z || this.b) {
            alertDialogCreate.create();
            if (z) {
                abfv.h(alertDialogCreate.getButton(-1));
                abfv.h(alertDialogCreate.getButton(-2));
                abfv.h(alertDialogCreate.getButton(-3));
            }
            if (this.b) {
                abfv.i(alertDialogCreate.getWindow(), alertDialogCreate.getContext());
            }
        }
        return alertDialogCreate;
    }

    @Override // android.app.AlertDialog.Builder
    public final AlertDialog show() {
        if (!this.a) {
            return super.show();
        }
        AlertDialog alertDialogCreate = create();
        alertDialogCreate.show();
        return alertDialogCreate;
    }
}

package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeao implements View.OnClickListener {
    private final aean a;
    private final xgj b;
    private final xgn c;

    public aeao(aean aeanVar, xgj xgjVar, xgn xgnVar) {
        this.a = aeanVar;
        this.b = xgjVar;
        this.c = xgnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aean aeanVar = this.a;
        if (aeanVar != null) {
            aeanVar.a();
            this.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, this.b, null);
        }
    }
}

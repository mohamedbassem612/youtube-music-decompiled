package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pf implements View.OnClickListener {
    final C0028if a;
    final /* synthetic */ ph b;

    public pf(ph phVar) {
        this.b = phVar;
        this.a = new C0028if(phVar.a.getContext(), phVar.c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ph phVar = this.b;
        Window.Callback callback = phVar.d;
        if (callback == null || !phVar.e) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}

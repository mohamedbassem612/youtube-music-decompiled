package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bo extends ch {
    final /* synthetic */ ch a;
    final /* synthetic */ bp b;

    public bo(bp bpVar, ch chVar) {
        this.b = bpVar;
        this.a = chVar;
    }

    @Override // defpackage.ch
    public final View a(int i) {
        ch chVar = this.a;
        if (chVar.b()) {
            return chVar.a(i);
        }
        Dialog dialog = this.b.f;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.ch
    public final boolean b() {
        return this.a.b() || this.b.j;
    }
}

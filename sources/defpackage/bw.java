package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bw extends ch {
    final /* synthetic */ cc a;

    public bw(cc ccVar) {
        this.a = ccVar;
    }

    @Override // defpackage.ch
    public final View a(int i) {
        cc ccVar = this.a;
        View view = ccVar.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(a.bV(ccVar, "Fragment ", " does not have a view"));
    }

    @Override // defpackage.ch
    public final boolean b() {
        return this.a.mView != null;
    }
}

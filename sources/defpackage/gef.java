package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gef implements vqt {
    final /* synthetic */ vxz a;
    final /* synthetic */ hfn b;
    private avmn c;

    public gef(hfn hfnVar, vxz vxzVar) {
        this.b = hfnVar;
        this.a = vxzVar;
    }

    @Override // defpackage.vqt
    public final void a(View view) {
        b(view);
        avmn avmnVar = this.c;
        if (avmnVar == null || avmnVar.f()) {
            this.c = this.b.M().al(new gkr(this, view, 1, null), new glg(1));
        }
    }

    public final void b(View view) {
        view.setPadding(view.getPaddingStart(), this.a.l(130, 45835942L, false) ? 0 : this.b.K(), view.getPaddingEnd(), this.b.L().f(527).e);
    }
}

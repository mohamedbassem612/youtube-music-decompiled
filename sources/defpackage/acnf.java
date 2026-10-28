package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acnf extends tud {
    final /* synthetic */ ViewTreeObserver a;
    final /* synthetic */ boolean b;
    final /* synthetic */ acng c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acnf(acng acngVar, String str, ViewTreeObserver viewTreeObserver, boolean z) {
        super(str);
        this.a = viewTreeObserver;
        this.b = z;
        this.c = acngVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver != null) {
            acng acngVar = this.c;
            vtl vtlVar = acngVar.k;
            if (vtlVar == null) {
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            } else {
                if (acngVar.l) {
                    int i = vtlVar.a;
                    acngVar.h(i);
                    acngVar.b(0);
                    acngVar.e(i);
                    return;
                }
                acngVar.i(vtlVar.b);
                acngVar.c(0);
                if (this.b) {
                    acngVar.b(0);
                }
            }
        }
    }
}

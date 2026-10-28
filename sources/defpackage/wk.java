package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class wk extends we {
    public final WeakReference a;

    public wk(wm wmVar) {
        this.a = new WeakReference(wmVar);
    }

    @Override // defpackage.we
    public final void h(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((wm) weakReference.get()).i || !((wm) weakReference.get()).h) {
            return;
        }
        ((wm) weakReference.get()).g(new ws(i, charSequence));
    }

    @Override // defpackage.we
    public final void i() {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((wm) weakReference.get()).h) {
            return;
        }
        ((wm) weakReference.get()).h(true);
    }

    @Override // defpackage.we
    public final void q(aami aamiVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((wm) weakReference.get()).h) {
            return;
        }
        int i = -1;
        if (aamiVar.a == -1) {
            Object obj = aamiVar.b;
            int i2 = ((wm) weakReference.get()).n;
            if ((i2 & 32767) != 0 && !wf.c(i2)) {
                i = 2;
            }
            aamiVar = new aami(obj, i, null);
        }
        ((wm) weakReference.get()).q(aamiVar);
    }
}

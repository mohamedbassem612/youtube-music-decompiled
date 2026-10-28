package defpackage;

import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bbt extends bbs {
    public bbt(Window window, zf zfVar) {
        super(window, zfVar);
    }

    @Override // defpackage.bbr, defpackage.bbm
    public final void c(boolean z) {
        this.a.setSystemBarsAppearance(true != z ? 0 : 16, 16);
    }

    @Override // defpackage.bbr, defpackage.bbm
    public final void d(boolean z) {
        this.a.setSystemBarsAppearance(true != z ? 0 : 8, 8);
    }

    @Override // defpackage.bbr, defpackage.bbm
    public final boolean e() {
        return (this.a.getSystemBarsAppearance() & 8) != 0;
    }
}

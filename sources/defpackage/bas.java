package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bas extends bat {
    private final WindowInsetsAnimation a;

    public bas(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.bat
    public final float g() {
        return this.a.getAlpha();
    }

    @Override // defpackage.bat
    public final float h() {
        return this.a.getInterpolatedFraction();
    }

    @Override // defpackage.bat
    public final int i() {
        return this.a.getTypeMask();
    }

    @Override // defpackage.bat
    public final long j() {
        return this.a.getDurationMillis();
    }

    @Override // defpackage.bat
    public final void k(float f) {
        this.a.setFraction(f);
    }
}

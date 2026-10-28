package defpackage;

import android.graphics.Canvas;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afdw extends afdx {
    @Override // defpackage.afbe
    protected final void m(Canvas canvas) {
        if (this.m.w.isEmpty()) {
            super.m(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.m.w);
        super.m(canvas);
        canvas.restore();
    }
}

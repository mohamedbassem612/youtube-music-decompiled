package defpackage;

import android.graphics.Canvas;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class owc extends ouj {
    public owc() {
        super(true, true);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void b(Canvas canvas) {
        boolean z = this.x;
        int i = this.s;
        int i2 = this.t;
        int i3 = this.u;
        int i4 = this.v;
        if (z) {
            oul oulVar = this.y;
            if (oulVar != null) {
                oulVar.t(i, i2, i3, i4);
                this.y.b(canvas);
            }
            ouv ouvVar = this.A;
            if (ouvVar != null) {
                ouvVar.t(i, i2, i3, i4);
                this.A.b(canvas);
            }
        }
        int i5 = this.s;
        int i6 = this.t;
        int i7 = this.u;
        int i8 = this.v;
        oum oumVar = this.z;
        if (oumVar != null) {
            oumVar.t(i5, i6, i7, i8);
            this.z.b(canvas);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void g(int i, int i2, int i3, int i4) {
    }
}

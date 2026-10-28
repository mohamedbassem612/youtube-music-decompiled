package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afbr extends afbs {
    public float a;
    public float b;

    @Override // defpackage.afbs
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.a, this.b);
        path.transform(matrix);
    }
}

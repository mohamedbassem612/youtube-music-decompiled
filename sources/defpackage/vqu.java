package defpackage;

import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class vqu extends Animation {
    private final Matrix a;

    public vqu(Matrix matrix) {
        this.a = matrix;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        transformation.getMatrix().set(this.a);
        super.applyTransformation(f, transformation);
    }
}

package defpackage;

import android.graphics.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aexk extends aeuc {
    final /* synthetic */ aexn a;

    public aexk(aexn aexnVar) {
        this.a = aexnVar;
    }

    @Override // defpackage.aeuc
    /* JADX INFO: renamed from: a */
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        this.a.y = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.aeuc, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}

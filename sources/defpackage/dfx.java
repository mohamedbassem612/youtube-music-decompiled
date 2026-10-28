package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dfx extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ View c;

    public dfx(int i, int i2, View view) {
        this.a = i;
        this.b = i2;
        this.c = view;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        View view = this.c;
        int i = this.a;
        dge.p(view, i - ((int) ((i - this.b) * f)));
    }
}

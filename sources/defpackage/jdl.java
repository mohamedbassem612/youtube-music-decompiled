package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jdl extends Animation {
    final /* synthetic */ jdm a;

    public jdl(jdm jdmVar) {
        this.a = jdmVar;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        int i;
        int i2;
        jdm jdmVar = this.a;
        if (jdmVar.g) {
            i = jdmVar.h;
            i2 = jdmVar.i;
        } else {
            i = jdmVar.i;
            i2 = jdmVar.h;
        }
        RecyclerView recyclerView = jdmVar.d;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            if (f != 1.0f) {
                i2 = ((int) ((i2 - i) * f)) + i;
            }
            layoutParams.height = i2;
        }
        recyclerView.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}

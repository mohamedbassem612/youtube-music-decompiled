package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jqe extends ggf {
    final /* synthetic */ jqf f;
    final /* synthetic */ View g;
    final /* synthetic */ jqh h;

    public jqe(jqf jqfVar, View view, jqh jqhVar) {
        this.f = jqfVar;
        this.g = view;
        this.h = jqhVar;
    }

    @Override // defpackage.ggf
    public final void d(GradientDrawable gradientDrawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.g.setBackground(gradientDrawable);
            return;
        }
        jqh jqhVar = this.h;
        if (jqhVar != null) {
            ggf ggfVar = this.f.b;
            int[] iArr = ggfVar.d;
            iArr.getClass();
            float[] fArr = ggfVar.e;
            fArr.getClass();
            jqhVar.a(iArr, fArr);
        }
    }
}

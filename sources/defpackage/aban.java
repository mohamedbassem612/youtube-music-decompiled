package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aban extends GLSurfaceView {
    final /* synthetic */ abao a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aban(abao abaoVar, Context context) {
        super(context);
        this.a = abaoVar;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.e = true;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        abao abaoVar = this.a;
        abaoVar.g();
        abaoVar.e = false;
        super.onDetachedFromWindow();
    }
}

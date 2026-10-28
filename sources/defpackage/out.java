package defpackage;

import android.graphics.Canvas;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class out extends oyk {
    public PaintUnit a;

    public out(NodeTreeProcessor nodeTreeProcessor, PaintUnit paintUnit) {
        super(nodeTreeProcessor);
        this.a = paintUnit;
        paintUnit.f(this);
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void S(int i) {
        this.A = i;
        ((ouj) this.a).r = i;
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final atoc V() {
        return null;
    }

    @Override // defpackage.oyk, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.b(canvas);
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void t(int i, int i2, int i3, int i4) {
        super.t(i, i2, i3, i4);
        this.a.t(0, 0, getWidth(), getHeight());
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void U() {
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }
}

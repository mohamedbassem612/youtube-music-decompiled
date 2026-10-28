package defpackage;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class owv extends ouu {
    public owv(NodeTreeProcessor nodeTreeProcessor, owy owyVar) {
        super(nodeTreeProcessor, owyVar);
    }

    @Override // defpackage.oyn, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void O(float f, int i, float f2, float f3) {
        ((owy) ((ouu) this).a).D(f, i, f2, f3);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        postInvalidate();
    }

    @Override // defpackage.oyn, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((owy) ((ouu) this).a).y(motionEvent, this) || super.onTouchEvent(motionEvent);
    }
}

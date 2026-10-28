package defpackage;

import android.view.View;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class oyf extends oyk {
    public final AtomicBoolean u;
    public View v;

    protected oyf(NodeTreeProcessor nodeTreeProcessor, View view) {
        super(nodeTreeProcessor);
        this.u = new AtomicBoolean(false);
        this.v = view;
    }

    public final void ak(View view) {
        View view2 = this.v;
        if (view2 != view) {
            if (view2 != null) {
                removeView(view2);
            }
            this.v = view;
            requestLayout();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final boolean isLayoutRequested() {
        AtomicBoolean atomicBoolean = this.u;
        return atomicBoolean != null && atomicBoolean.get();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        AtomicBoolean atomicBoolean = this.u;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        post(new ooz(this, 17));
    }
}

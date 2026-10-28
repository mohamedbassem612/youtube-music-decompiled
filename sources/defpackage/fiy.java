package defpackage;

import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fiy extends dub {
    public final WeakReference a;
    public final WeakReference b;

    public fiy(ComponentTree componentTree, duc ducVar) {
        this.a = new WeakReference(componentTree);
        this.b = new WeakReference(ducVar);
    }

    @Override // defpackage.dub, defpackage.dty
    public final void b(int i, float f, int i2) throws Throwable {
        ComponentTree componentTree = (ComponentTree) this.a.get();
        if (componentTree != null) {
            componentTree.p();
        }
    }
}

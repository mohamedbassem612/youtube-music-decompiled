package defpackage;

import android.view.MotionEvent;
import android.view.animation.Interpolator;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adef implements opj {
    public long a;

    @Override // defpackage.opj
    public final mep a() {
        return asal.d;
    }

    @Override // defpackage.opj
    public final /* bridge */ /* synthetic */ void b(met metVar, NodeViewInterface nodeViewInterface, ElementsServices elementsServices, oph ophVar) {
        if (Memory.peekByte(((asal) metVar).c + 9) != 0) {
            Interpolator interpolator = aedd.a;
            nodeViewInterface.r(new adee(this, new aedc(), nodeViewInterface, 0));
        }
    }

    public final MotionEvent c(long j, int i, nxg nxgVar) {
        return MotionEvent.obtain(this.a, j, i, nxgVar.a, nxgVar.b, 0);
    }
}

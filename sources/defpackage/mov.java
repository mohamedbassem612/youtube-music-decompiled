package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mov implements moq {
    public static final Rect a = new Rect(0, 0, 0, 0);
    frh b;
    private final WeakReference c;

    public mov(FlowLayoutManager flowLayoutManager) {
        this.c = new WeakReference(flowLayoutManager);
    }

    @Override // defpackage.mop
    public final int a(int i) {
        frh frhVar;
        FlowLayoutManager flowLayoutManager = (FlowLayoutManager) this.c.get();
        int iA = flowLayoutManager != null ? flowLayoutManager.a(flowLayoutManager) : -1;
        if (iA == -1 || (frhVar = this.b) == null) {
            return -1;
        }
        try {
            if (frhVar.n(i).j()) {
                return iA;
            }
            return -1;
        } catch (IndexOutOfBoundsException unused) {
            return -1;
        }
    }

    @Override // defpackage.mop
    public final boolean b(int i) {
        FlowLayoutManager flowLayoutManager = (FlowLayoutManager) this.c.get();
        return flowLayoutManager != null && i == flowLayoutManager.getItemCount() + (-1);
    }

    @Override // defpackage.mop
    public final boolean c(int i) {
        return i == 0;
    }
}

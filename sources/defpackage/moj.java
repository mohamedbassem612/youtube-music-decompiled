package defpackage;

import android.view.View;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class moj {
    public int a = -1;
    public int b = Integer.MIN_VALUE;
    public boolean c = false;
    public boolean d = false;
    public final /* synthetic */ FlowLayoutManager e;

    public moj(FlowLayoutManager flowLayoutManager) {
        this.e = flowLayoutManager;
    }

    public final void a() {
        boolean z = this.c;
        FlowLayoutManager flowLayoutManager = this.e;
        this.b = z ? flowLayoutManager.y.f() : flowLayoutManager.y.j();
    }

    public final void b(View view) {
        boolean z = this.c;
        FlowLayoutManager flowLayoutManager = this.e;
        if (z) {
            this.b = flowLayoutManager.y.a(view) + flowLayoutManager.y.o();
        } else {
            this.b = flowLayoutManager.y.d(view);
        }
        this.a = this.e.getPosition(view);
    }

    public final void c() {
        this.a = -1;
        this.b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
    }
}

package defpackage;

import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bda implements ayh {
    final /* synthetic */ NestedScrollView a;

    public bda(NestedScrollView nestedScrollView) {
        this.a = nestedScrollView;
    }

    @Override // defpackage.ayh
    public final float a() {
        return -this.a.gO();
    }

    @Override // defpackage.ayh
    public final void b() {
        this.a.a.abortAnimation();
    }

    @Override // defpackage.ayh
    public final boolean c(float f) {
        if (f == 0.0f) {
            return false;
        }
        b();
        this.a.j((int) f);
        return true;
    }
}

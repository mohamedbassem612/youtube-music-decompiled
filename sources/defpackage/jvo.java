package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jvo {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public jvo(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void a() {
        int iF;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (flexboxLayoutManager.t() || !flexboxLayoutManager.c) {
            iF = this.e ? flexboxLayoutManager.e.f() : flexboxLayoutManager.e.j();
        } else {
            iF = this.e ? flexboxLayoutManager.e.f() : flexboxLayoutManager.getWidth() - flexboxLayoutManager.e.j();
        }
        this.c = iF;
    }

    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        boolean z = false;
        this.f = false;
        this.g = false;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (!flexboxLayoutManager.t() ? !(flexboxLayoutManager.b != 0 || flexboxLayoutManager.a != 3) : !(flexboxLayoutManager.b != 0 || flexboxLayoutManager.a != 1)) {
            z = true;
        }
        this.e = z;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}

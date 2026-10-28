package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekh implements ekk {
    private final eka a;
    private final eka b;

    public ekh(eka ekaVar, eka ekaVar2) {
        this.a = ekaVar;
        this.b = ekaVar2;
    }

    @Override // defpackage.ekk
    public final eix a() {
        return new ejk(this.a.a(), this.b.a());
    }

    @Override // defpackage.ekk
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.ekk
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}

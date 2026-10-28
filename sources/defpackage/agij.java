package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agij extends agil {
    static final agil g(int i) {
        if (i < 0) {
            return agil.c;
        }
        return i > 0 ? agil.d : agil.b;
    }

    @Override // defpackage.agil
    public final int a() {
        return 0;
    }

    @Override // defpackage.agil
    public final agil b(int i, int i2) {
        return g(Integer.compare(i, i2));
    }

    @Override // defpackage.agil
    public final agil c(Comparable comparable, Comparable comparable2) {
        return g(comparable.compareTo(comparable2));
    }

    @Override // defpackage.agil
    public final agil d(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.agil
    public final agil e(boolean z, boolean z2) {
        return g(Boolean.compare(z, z2));
    }

    @Override // defpackage.agil
    public final agil f(boolean z, boolean z2) {
        return g(Boolean.compare(z2, z));
    }
}

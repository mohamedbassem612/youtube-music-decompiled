package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auwr implements auwq {
    private static final qmm a = new qmm(auwo.a, 5);

    @Override // defpackage.auwq
    public final double a(Context context) {
        return ((Double) a.a(2, "45742850", 2.0d).ip(context)).doubleValue();
    }

    @Override // defpackage.auwq
    public final long b(Context context) {
        return ((Long) a.b(1, "45742848", 3L).ip(context)).longValue();
    }

    @Override // defpackage.auwq
    public final long c(Context context) {
        return ((Long) a.b(3, "45742849", 100L).ip(context)).longValue();
    }

    @Override // defpackage.auwq
    public final long d(Context context) {
        return ((Long) a.b(4, "45742851", 60000L).ip(context)).longValue();
    }
}

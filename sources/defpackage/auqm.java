package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auqm implements auql {
    private static final qmc a;
    private static final qmc b;

    static {
        omm ommVar = auqd.b;
        a = ommVar.w("45729759", false);
        b = ommVar.w("45729445", false);
    }

    @Override // defpackage.auql
    public final boolean a(Context context) {
        return ((Boolean) a.ip(context)).booleanValue();
    }

    @Override // defpackage.auql
    public final boolean b(Context context) {
        return ((Boolean) b.ip(context)).booleanValue();
    }
}

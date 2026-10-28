package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jbr extends LinearLayoutManager {
    public jbr(Context context) {
        super(context, 0, false);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final boolean supportsPredictiveItemAnimations() {
        return true;
    }
}

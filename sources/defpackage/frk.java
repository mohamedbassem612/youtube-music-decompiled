package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class frk extends LinearLayoutManager {
    public frk(Context context, int i) {
        super(context, i, false);
        setStackFromEnd(false);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final nq generateDefaultLayoutParams() {
        return getOrientation() == 1 ? new nq(-1, -2) : new nq(-2, -1);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final boolean supportsPredictiveItemAnimations() {
        if (getOrientation() == 0) {
            return false;
        }
        return super.supportsPredictiveItemAnimations();
    }
}

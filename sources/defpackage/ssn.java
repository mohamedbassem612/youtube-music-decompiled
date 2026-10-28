package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ssn extends GridLayoutManager {
    public ssn(Context context) {
        super(context, 3);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final int getExtraLayoutSpace(oe oeVar) {
        return 1600;
    }
}

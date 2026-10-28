package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fel extends feg {
    private static final Handler b = new Handler(Looper.getMainLooper(), new iye(1));
    public final esq a;

    public fel(esq esqVar, int i, int i2) {
        super(i, i2);
        this.a = esqVar;
    }

    @Override // defpackage.fem
    public final void b(Object obj, fev fevVar) {
        fdx fdxVar = this.c;
        if (fdxVar == null || !fdxVar.l()) {
            return;
        }
        b.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.fem
    public final void gG(Drawable drawable) {
    }
}

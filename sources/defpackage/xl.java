package defpackage;

import androidx.car.app.IAppHost;
import androidx.car.app.ICarHost;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xl implements xs {
    private final /* synthetic */ int $cid;

    @Override // defpackage.xs
    public final void a(Object obj) {
        if (this.$cid != 0) {
            ((IAppHost) obj).invalidate();
        } else {
            ((ICarHost) obj).finish();
        }
    }
}

package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class koe {
    final /* synthetic */ BasePendingResult a;

    public koe(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        ThreadLocal threadLocal = BasePendingResult.e;
        BasePendingResult.k(this.a.g);
        super.finalize();
    }
}

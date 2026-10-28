package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kpg extends BasePendingResult {
    @Deprecated
    public kpg(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ kni a(Status status) {
        return status;
    }
}

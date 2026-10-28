package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kfj extends BasePendingResult {
    private khs a;
    public final boolean c;
    public final /* synthetic */ kfm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfj(kfm kfmVar, boolean z) {
        super((knc) null);
        this.d = kfmVar;
        this.c = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ kni a(Status status) {
        return new kfi(status, 0);
    }

    public abstract void b();

    final khs c() {
        if (this.a == null) {
            this.a = new kgh(this, 1);
        }
        return this.a;
    }
}

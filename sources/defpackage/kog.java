package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kog implements kne {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ khn b;

    public kog(khn khnVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        this.b = khnVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kne
    public final void a(Status status) {
        this.b.b.remove(this.a);
    }
}

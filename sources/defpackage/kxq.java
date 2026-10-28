package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class kxq extends kxp {
    public kxq(knc kncVar) {
        super(kncVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ kni a(Status status) {
        return status == null ? Status.c : status;
    }
}

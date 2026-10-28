package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lrv implements kni {
    public final lru a;
    private final Status b;

    public lrv(Status status, lru lruVar) {
        this.b = status;
        this.a = lruVar;
    }

    @Override // defpackage.kni
    public final Status a() {
        return this.b;
    }
}

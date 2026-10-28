package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kkb extends kjq {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicReference b = new AtomicReference();
    public final String c;
    public final kjo d;
    final /* synthetic */ kkc e;

    public kkb(kkc kkcVar, String str, kjo kjoVar) {
        this.e = kkcVar;
        this.c = str;
        this.d = kjoVar;
    }

    @Override // defpackage.kjq
    public final void b(Status status) {
        this.e.a(this.a, this.b, this.c, this.d);
    }
}

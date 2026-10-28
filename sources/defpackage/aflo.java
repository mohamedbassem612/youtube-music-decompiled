package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aflo implements aflp {
    private final egp a;

    public aflo(egp egpVar) {
        this.a = egpVar;
    }

    @Override // defpackage.aflp
    public final ListenableFuture a(String str) {
        return this.a.a();
    }

    @Override // defpackage.aflp
    public final ListenableFuture b(UUID uuid) {
        return this.a.b();
    }

    @Override // defpackage.aflp
    public final ListenableFuture c(String str, int i, List list) {
        return this.a.e();
    }

    @Override // defpackage.aflp
    public final ListenableFuture d(ayq ayqVar) {
        return this.a.c();
    }

    @Override // defpackage.aflp
    public final ListenableFuture e(String str, int i, ayq ayqVar) {
        return this.a.d();
    }

    @Override // defpackage.aflp
    public final /* synthetic */ ListenableFuture f(String str, int i, ayq ayqVar) {
        return aguu.aG(this, str, i, ayqVar);
    }

    @Override // defpackage.aflp
    public final ListenableFuture g(dov dovVar) {
        return this.a.f();
    }
}

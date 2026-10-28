package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ahdc implements ahcy {
    final /* synthetic */ ahdf a;
    final /* synthetic */ ahdm b;

    public ahdc(ahdm ahdmVar, ahdf ahdfVar) {
        this.a = ahdfVar;
        this.b = ahdmVar;
    }

    @Override // defpackage.ahcy
    public final /* bridge */ /* synthetic */ ListenableFuture a(Object obj) {
        return this.b.c.b.a(this.a, (Throwable) obj);
    }

    public final String toString() {
        return this.a.toString();
    }
}

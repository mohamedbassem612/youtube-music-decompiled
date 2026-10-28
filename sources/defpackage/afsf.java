package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afsf implements afne {
    private final awmd a;
    private final boolean b;

    public afsf(awmd awmdVar, boolean z) {
        this.a = awmdVar;
        this.b = z;
    }

    @Override // defpackage.afne
    public final ListenableFuture a() {
        return this.b ? ((afrm) this.a.io()).a() : aher.a;
    }
}

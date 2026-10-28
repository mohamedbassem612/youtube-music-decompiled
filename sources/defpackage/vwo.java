package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vwo implements vwj {
    private final vwn a;

    public vwo(vwn vwnVar) {
        this.a = vwnVar;
    }

    @Override // defpackage.vwj
    public final vwn a() {
        return this.a;
    }

    @Override // defpackage.vwj
    public final ListenableFuture b() {
        return new aher(this.a);
    }
}

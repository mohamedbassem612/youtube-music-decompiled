package defpackage;

import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adft implements adfw {
    public final /* synthetic */ Lock a;

    @Override // defpackage.adfw, java.lang.AutoCloseable
    public final void close() {
        this.a.unlock();
    }
}

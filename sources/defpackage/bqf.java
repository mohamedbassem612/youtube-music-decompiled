package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bqf extends ContentObserver {
    final /* synthetic */ bqg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqf(bqg bqgVar) {
        super(new Handler());
        this.a = bqgVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.n();
    }
}

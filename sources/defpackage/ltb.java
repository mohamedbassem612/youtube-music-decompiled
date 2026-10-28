package defpackage;

import android.database.ContentObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ltb extends ContentObserver {
    final /* synthetic */ ltd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltb(ltd ltdVar) {
        super(null);
        this.a = ltdVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.h = (byte) 1;
    }
}

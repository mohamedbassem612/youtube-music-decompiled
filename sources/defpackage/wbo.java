package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Snapshot;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wbo implements agfr {
    public volatile Snapshot a;

    public wbo(ByteStore byteStore) {
        this.a = byteStore.snapshot();
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        return this.a;
    }
}

package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afjv implements Closeable {
    public static final afjv a = new afjv(1);
    private final /* synthetic */ int $cid;

    public afjv(int i) {
        this.$cid = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.$cid == 0) {
            qpj.c();
            ahno.O(afjw.a > 0);
            afjw.a--;
        }
    }
}

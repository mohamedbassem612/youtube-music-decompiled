package defpackage;

import java.io.Closeable;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qky implements Closeable {
    public final Inflater a = new Inflater(true);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.end();
    }
}

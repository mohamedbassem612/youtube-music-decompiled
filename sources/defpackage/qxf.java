package defpackage;

import android.media.MediaExtractor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxf implements AutoCloseable {
    public final MediaExtractor a = new MediaExtractor();

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.release();
    }
}

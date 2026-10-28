package app.rive.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface CheckableAutoCloseable extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean getClosed();
}

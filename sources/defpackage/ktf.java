package defpackage;

import java.io.Closeable;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ktf extends Closeable {
    String a(Map map);

    void b(Map map);

    boolean c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}

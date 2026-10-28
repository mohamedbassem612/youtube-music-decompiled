package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qqa {
    public static final Long a = 10L;
    public static final Long b = 60000L;
    public final ConcurrentMap c;

    @Deprecated
    public qqa() {
        this(new ConcurrentHashMap());
    }

    public static agev a(FileChannel fileChannel) throws IOException {
        try {
            return agev.i(new qpz(fileChannel.lock(0L, Long.MAX_VALUE, false), 1));
        } catch (IOException e) {
            if (e.getMessage().contains("Resource deadlock would occur")) {
                return agdf.a;
            }
            throw e;
        }
    }

    public qqa(ConcurrentMap concurrentMap) {
        this.c = concurrentMap;
    }
}

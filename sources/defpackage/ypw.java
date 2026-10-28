package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ypw implements ypx {
    public static boolean c(Map map) throws ypv {
        if (map == null) {
            throw new ypv("Response headers missing");
        }
        List list = (List) map.get("Content-Type");
        if (list != null) {
            return ((String) list.get(0)).contains("application/vnd.yt-ump");
        }
        throw new ypv("Content-Type header missing");
    }

    @Override // defpackage.ypx
    public final void a(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.ypx
    public final void b(boolean z) {
        throw null;
    }
}

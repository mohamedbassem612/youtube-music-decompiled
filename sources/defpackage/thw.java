package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class thw {
    private final String a;

    protected thw(String str) {
        this.a = String.valueOf(str).concat(" gzip");
    }

    protected abstract boolean a(String str);

    public final void b(UrlRequest.Builder builder, Collection collection) {
        boolean z;
        Iterator it = collection.iterator();
        loop0: while (true) {
            z = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (a(str)) {
                    builder.addHeader(str, (String) entry.getValue());
                }
                if (!z || "User-Agent".equals(str)) {
                    z = false;
                }
            }
        }
        if (z) {
            builder.addHeader("User-Agent", this.a);
        }
    }
}

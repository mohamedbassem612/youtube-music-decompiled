package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ckn extends IOException {
    public final byi a;
    public final Uri b;
    public final Map c;
    public final long d;

    public ckn(byi byiVar, Uri uri, Map map, long j, Throwable th) {
        super(th);
        this.a = byiVar;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}

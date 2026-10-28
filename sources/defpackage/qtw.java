package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qtw {
    public Uri a;
    public int b;
    public int c;
    public long[] d;
    private boolean e;
    private final Map f = new LinkedHashMap();

    public final qty a() {
        Uri uri = this.a;
        boolean z = this.e;
        int i = this.b;
        int i2 = this.c;
        long[] jArr = this.d;
        Map map = this.f;
        return new qty(uri, z, i, i2, jArr, map.isEmpty() ? agpn.b : agkj.h(map));
    }

    public final void b() {
        this.e = true;
    }
}

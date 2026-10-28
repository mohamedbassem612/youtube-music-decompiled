package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xuz {
    public Uri a;
    public xvz b;
    public xvg c;
    public String d;
    public String e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private Map j;
    private byte k;

    public final xva a() {
        Map map;
        if (this.k == 15 && (map = this.j) != null) {
            return new xva(this.f, this.g, this.h, this.i, this.a, this.b, this.c, this.d, map, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.k & 1) == 0) {
            sb.append(" status");
        }
        if ((this.k & 2) == 0) {
            sb.append(" stopAllowed");
        }
        if ((this.k & 4) == 0) {
            sb.append(" inAppDial");
        }
        if ((this.k & 8) == 0) {
            sb.append(" castSupported");
        }
        if (this.j == null) {
            sb.append(" additionalData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Map map) {
        if (map == null) {
            throw new NullPointerException("Null additionalData");
        }
        this.j = map;
    }

    public final void c(boolean z) {
        this.i = z;
        this.k = (byte) (this.k | 8);
    }

    public final void d(boolean z) {
        this.h = z;
        this.k = (byte) (this.k | 4);
    }

    public final void e(int i) {
        this.f = i;
        this.k = (byte) (this.k | 1);
    }

    public final void f(boolean z) {
        this.g = z;
        this.k = (byte) (this.k | 2);
    }
}

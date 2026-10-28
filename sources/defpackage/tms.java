package defpackage;

import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tms {
    public String a;
    public Optional b;
    public ainp c;
    public int d;
    private agke e;
    private agkj f;
    private long g;
    private long h;
    private long i;
    private long j;
    private byte k;

    public tms(tmt tmtVar) {
        this.b = Optional.empty();
        this.e = tmtVar.b;
        this.f = tmtVar.c;
        this.a = tmtVar.d;
        this.g = tmtVar.e;
        this.h = tmtVar.f;
        this.i = tmtVar.g;
        this.j = tmtVar.h;
        this.b = tmtVar.i;
        this.c = tmtVar.j;
        this.d = tmtVar.k;
        this.k = (byte) 15;
    }

    public final tmt a() {
        if (this.k == 15 && this.e != null && this.f != null && this.d != 0) {
            return new tmt(this.e, this.f, this.a, this.g, this.h, this.i, this.j, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" pageScopedDeferredChunkKeys");
        }
        if (this.f == null) {
            sb.append(" responseHeaders");
        }
        if ((this.k & 1) == 0) {
            sb.append(" serverDate");
        }
        if ((this.k & 2) == 0) {
            sb.append(" lastModified");
        }
        if ((this.k & 4) == 0) {
            sb.append(" ttl");
        }
        if ((this.k & 8) == 0) {
            sb.append(" softTtl");
        }
        if (this.d == 0) {
            sb.append(" scope");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.h = j;
        this.k = (byte) (this.k | 2);
    }

    public final void c(List list) {
        this.e = agke.n(list);
    }

    public final void d(Map map) {
        this.f = agkj.h(map);
    }

    public final void e(long j) {
        this.g = j;
        this.k = (byte) (this.k | 1);
    }

    public final void f(long j) {
        this.j = j;
        this.k = (byte) (this.k | 8);
    }

    public final void g(long j) {
        this.i = j;
        this.k = (byte) (this.k | 4);
    }

    public tms() {
        this.b = Optional.empty();
    }
}

package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qgw {
    public axgh a;
    private String b;
    private qci c;
    private final agev d;
    private agev e;
    private agev f;
    private agev g;
    private boolean h;
    private byte i;

    public qgw() {
        agdf agdfVar = agdf.a;
        this.d = agdfVar;
        this.e = agdfVar;
        this.f = agdfVar;
        this.g = agdfVar;
    }

    public final qgx a() {
        String str;
        if (this.i == 3 && (str = this.b) != null) {
            return new qgx(str, this.c, this.a, this.d, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" eventName");
        }
        if ((this.i & 1) == 0) {
            sb.append(" enablePerfettoTraceCollection");
        }
        if ((this.i & 2) == 0) {
            sb.append(" triggerPerfettoFromBackground");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(qci qciVar) {
        String str = qciVar.a;
        if (str == null) {
            throw new NullPointerException("Null eventName");
        }
        this.b = str;
        this.c = qciVar;
    }

    public final void c(qci qciVar) {
        this.e = agev.i(qciVar);
    }

    public final void d(Duration duration) {
        this.g = agev.i(duration);
    }

    public final void e(Double d) {
        this.f = agev.i(d);
    }

    public final void f(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | 2);
    }

    public final void g() {
        this.i = (byte) (this.i | 1);
    }
}

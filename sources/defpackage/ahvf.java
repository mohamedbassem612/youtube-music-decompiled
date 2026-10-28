package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahvf {
    public boolean a;
    public boolean b;
    public byte c = 31;
    private boolean d;

    public ahvf(abfq abfqVar) {
        this.b = abfqVar.a;
        this.d = abfqVar.b;
        this.a = abfqVar.c;
    }

    public final ahvg a() {
        if (this.c == 7) {
            return new ahvg(this.a, this.b, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" enableCelLogsiteMetadata");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableSafeFormatArgs");
        }
        if ((this.c & 4) == 0) {
            sb.append(" includeSuppressedExceptions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }

    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void d(boolean z) {
        this.d = z;
        this.c = (byte) (this.c | 4);
    }

    public final abfq e() {
        if (this.c == 31) {
            return new abfq(this.b, this.d, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" isAccessibilityPlayerEnabled");
        }
        if ((this.c & 2) == 0) {
            sb.append(" rotateShortsFeedEnabled");
        }
        if ((this.c & 4) == 0) {
            sb.append(" isTestOnlyState");
        }
        if ((this.c & 8) == 0) {
            sb.append(" canHidePlayerControls");
        }
        if ((this.c & 16) == 0) {
            sb.append(" controlsHideDelayMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(boolean z) {
        this.d = z;
        this.c = (byte) (this.c | 4);
    }

    public final ojp g() {
        if (this.c == 7) {
            return new ojp(this.d, this.b, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" requiresDeviceIdle");
        }
        if ((this.c & 2) == 0) {
            sb.append(" requiresCharging");
        }
        if ((this.c & 4) == 0) {
            sb.append(" requiresBatteryNotLow");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 4);
    }

    public final void i(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void j(boolean z) {
        this.d = z;
        this.c = (byte) (this.c | 1);
    }
}

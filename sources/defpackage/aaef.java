package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaef {
    public boolean a;
    public byte b;

    public final void a(boolean z) {
        this.a = z;
        this.b = (byte) (this.b | 2);
    }

    public final sox b() {
        if (this.b == 1) {
            return new sox(this.a);
        }
        throw new IllegalStateException("Missing required properties: remotePlayback");
    }

    public final void c(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final sot d() {
        if (this.b == 1) {
            return new sot(this.a);
        }
        throw new IllegalStateException("Missing required properties: androidClickableInstreamEnabled");
    }

    public final void e(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }
}

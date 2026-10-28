package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xek {
    private long a;
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();
    private boolean d;
    private byte e;

    public final xel a() {
        if (this.e == 3) {
            return new xel(this.a, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" timestamp");
        }
        if ((this.e & 2) == 0) {
            sb.append(" isPageSystem");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(zwa zwaVar) {
        this.b = Optional.of(zwaVar);
    }

    public final void c(boolean z) {
        this.d = z;
        this.e = (byte) (this.e | 2);
    }

    public final void d(long j) {
        this.a = j;
        this.e = (byte) (this.e | 1);
    }

    public final void e(zvh zvhVar) {
        this.c = Optional.of(zvhVar);
    }
}

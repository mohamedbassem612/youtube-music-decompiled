package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xrh {
    public boolean a;
    public boolean b;
    public byte c;
    public Enum d;

    public final xri a() {
        Enum r0;
        if (this.c == 3 && (r0 = this.d) != null) {
            return new xri(this.a, (abjx) r0, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" isUnselectUserInitiated");
        }
        if (this.d == null) {
            sb.append(" queueTransferType");
        }
        if ((this.c & 2) == 0) {
            sb.append(" isDisconnectedBySelectingDefaultRoute");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void c(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }

    public final void d(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }
}

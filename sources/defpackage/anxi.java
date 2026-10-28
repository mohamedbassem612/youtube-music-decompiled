package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anxi implements weh {
    static final anxh a;
    public static final weq b;
    private final anxj c;

    static {
        anxh anxhVar = new anxh();
        a = anxhVar;
        b = anxhVar;
    }

    public anxi(anxj anxjVar) {
        this.c = anxjVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anxj anxjVar = this.c;
        if ((anxjVar.b & 2) != 0) {
            agkxVar.c(anxjVar.d);
        }
        return agkxVar.g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new anxg(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anxi) && this.c.equals(((anxi) obj).c);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicSmartDownloadTriggerEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

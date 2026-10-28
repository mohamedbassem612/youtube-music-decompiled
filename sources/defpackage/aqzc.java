package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqzc implements weh {
    static final aqzb a;
    public static final weq b;
    private final aqzd c;

    static {
        aqzb aqzbVar = new aqzb();
        a = aqzbVar;
        b = aqzbVar;
    }

    public aqzc(aqzd aqzdVar) {
        this.c = aqzdVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
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
        return new aqza(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aqzc) && this.c.equals(((aqzc) obj).c);
    }

    public aijp getLastUpdatedTimestamp() {
        aijp aijpVar = this.c.d;
        return aijpVar == null ? aijp.a : aijpVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "UpdatableVideoInvalidationSignalEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

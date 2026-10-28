package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apcq implements weh {
    static final apcp a;
    public static final weq b;
    public final apcn c;

    static {
        apcp apcpVar = new apcp();
        a = apcpVar;
        b = apcpVar;
    }

    public apcq(apcn apcnVar) {
        this.c = apcnVar;
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
        return new apco(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof apcq) && this.c.equals(((apcq) obj).c);
    }

    public Long getSnoozeExpirationTimestampSeconds() {
        return Long.valueOf(this.c.d);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "RadioStarStatusEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anyu implements weh {
    static final anyt a;
    public static final weq b;
    private final anzc c;

    static {
        anyt anytVar = new anyt();
        a = anytVar;
        b = anytVar;
    }

    public anyu(anzc anzcVar) {
        this.c = anzcVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anzc anzcVar = this.c;
        if ((anzcVar.b & 2) != 0) {
            agkxVar.c(anzcVar.d);
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
        return new anys(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anyu) && this.c.equals(((anyu) obj).c);
    }

    public String getDescription() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicTrackDetailEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

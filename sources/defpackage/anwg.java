package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anwg implements weh {
    static final anwf a;
    public static final weq b;
    private final anwh c;

    static {
        anwf anwfVar = new anwf();
        a = anwfVar;
        b = anwfVar;
    }

    public anwg(anwh anwhVar) {
        this.c = anwhVar;
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
        return new anwe(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anwg) && this.c.equals(((anwg) obj).c);
    }

    public String getSerializedShareEntity() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicShareEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

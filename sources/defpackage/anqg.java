package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anqg implements weh {
    static final anqf a;
    public static final weq b;
    private final anqh c;

    static {
        anqf anqfVar = new anqf();
        a = anqfVar;
        b = anqfVar;
    }

    public anqg(anqh anqhVar) {
        this.c = anqhVar;
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
        return new anqe(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anqg) && this.c.equals(((anqg) obj).c);
    }

    public String getAddToLibraryFeedbackToken() {
        return this.c.d;
    }

    public String getRemoveFromLibraryFeedbackToken() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicLibraryEditEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

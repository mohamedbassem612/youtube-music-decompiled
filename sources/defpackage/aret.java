package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aret implements weh {
    static final ares a;
    public static final weq b;
    public final areu c;

    static {
        ares aresVar = new ares();
        a = aresVar;
        b = aresVar;
    }

    public aret(areu areuVar) {
        this.c = areuVar;
    }

    public static arer e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = areu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        areu areuVar = (areu) aihfVarCreateBuilder.instance;
        areuVar.c |= 1;
        areuVar.d = str;
        return new arer(aihfVarCreateBuilder);
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aret) && this.c.equals(((aret) obj).c);
    }

    @Override // defpackage.weh
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final arer d() {
        return new arer(this.c.toBuilder());
    }

    public Long getLastPlaybackPositionSeconds() {
        return Long.valueOf(this.c.f);
    }

    public Long getLastUpdatedClientTimestampMs() {
        return Long.valueOf(this.c.g);
    }

    public String getVideoId() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "VideoPlaybackPositionEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

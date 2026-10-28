package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajxr implements weh {
    static final ajxq a;
    public static final weq b;
    private final ajxs c;

    static {
        ajxq ajxqVar = new ajxq();
        a = ajxqVar;
        b = ajxqVar;
    }

    public ajxr(ajxs ajxsVar) {
        this.c = ajxsVar;
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
    public final /* bridge */ /* synthetic */ tzk d() {
        return new ajxp(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajxr) && this.c.equals(((ajxr) obj).c);
    }

    public Boolean getIsTimestampButtonEnabled() {
        return Boolean.valueOf(this.c.g);
    }

    public Long getLatestTimestampMs() {
        return Long.valueOf(this.c.f);
    }

    public String getLatestTimestampText() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "CommentComposerTimestampEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

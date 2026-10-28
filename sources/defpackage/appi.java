package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class appi implements weh {
    static final apph a;
    public static final weq b;
    private final appj c;

    static {
        apph apphVar = new apph();
        a = apphVar;
        b = apphVar;
    }

    public appi(appj appjVar) {
        this.c = appjVar;
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
        return new appg(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof appi) && this.c.equals(((appi) obj).c);
    }

    public String getExternalVideoId() {
        return this.c.g;
    }

    public String getVideoMetadata() {
        return this.c.e;
    }

    public String getVideoThumbnailUrl() {
        return this.c.f;
    }

    public String getVideoTitle() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "SelectedVideoEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

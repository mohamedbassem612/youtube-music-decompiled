package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqdl implements weh {
    static final aqdk a;
    public static final weq b;
    private final aqdm c;

    static {
        aqdk aqdkVar = new aqdk();
        a = aqdkVar;
        b = aqdkVar;
    }

    public aqdl(aqdm aqdmVar) {
        this.c = aqdmVar;
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
        return new aqdj(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aqdl) && this.c.equals(((aqdl) obj).c);
    }

    public Boolean getIsDismissed() {
        return Boolean.valueOf(this.c.d);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "StoriesCreatorInfoPanelDismissalStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

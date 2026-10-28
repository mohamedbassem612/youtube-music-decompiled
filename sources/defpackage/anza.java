package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anza implements weh {
    static final anyz a;
    public static final weq b;
    private final anze c;

    static {
        anyz anyzVar = new anyz();
        a = anyzVar;
        b = anyzVar;
    }

    public anza(anze anzeVar) {
        this.c = anzeVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anze anzeVar = this.c;
        if ((anzeVar.b & 2) != 0) {
            agkxVar.c(anzeVar.d);
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
        return new anyy(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anza) && this.c.equals(((anza) obj).c);
    }

    public Boolean getAllowsLibraryEdit() {
        return Boolean.valueOf(this.c.g);
    }

    public Boolean getInLibrary() {
        return Boolean.valueOf(this.c.e);
    }

    public anod getLikeState() {
        anod anodVarA = anod.a(this.c.f);
        return anodVarA == null ? anod.MUSIC_ENTITY_LIKE_STATE_UNKNOWN : anodVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicTrackUserDetailEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

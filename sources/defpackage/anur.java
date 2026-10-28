package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anur implements weh {
    static final anuq a;
    public static final weq b;
    private final anux c;

    static {
        anuq anuqVar = new anuq();
        a = anuqVar;
        b = anuqVar;
    }

    public anur(anux anuxVar) {
        this.c = anuxVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anux anuxVar = this.c;
        if ((anuxVar.b & 2) != 0) {
            agkxVar.c(anuxVar.d);
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
        return new anup(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anur) && this.c.equals(((anur) obj).c);
    }

    public anod getLikeState() {
        anod anodVarA = anod.a(this.c.e);
        return anodVarA == null ? anod.MUSIC_ENTITY_LIKE_STATE_UNKNOWN : anodVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicPlaylistUserDetailEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

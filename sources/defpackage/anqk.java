package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anqk implements weh {
    static final anqj a;
    public static final weq b;
    private final anql c;

    static {
        anqj anqjVar = new anqj();
        a = anqjVar;
        b = anqjVar;
    }

    public anqk(anql anqlVar) {
        this.c = anqlVar;
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
        return new anqi(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anqk) && this.c.equals(((anqk) obj).c);
    }

    public anqm getViewMode() {
        anqm anqmVarA = anqm.a(this.c.d);
        return anqmVarA == null ? anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_UNSPECIFIED : anqmVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicLibraryItemViewModeEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}

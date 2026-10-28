package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum apyu implements aihr {
    SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_UNSPECIFIED(0),
    SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_TRACKS(1),
    SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_PLAYLISTS(2),
    SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_ALBUMS(3),
    SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_ARTISTS(4);

    private final int g;

    apyu(int i) {
        this.g = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}

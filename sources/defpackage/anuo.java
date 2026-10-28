package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anuo {
    public final anuv a;

    public anuo(anuv anuvVar) {
        this.a = anuvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof anuo) && this.a.equals(((anuo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicPlaylistEntryModel{" + String.valueOf(this.a) + '}';
    }
}

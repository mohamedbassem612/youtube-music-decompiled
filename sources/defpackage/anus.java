package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anus {
    public final anuy a;

    public anus(anuy anuyVar) {
        this.a = anuyVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof anus) && this.a.equals(((anus) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicPodcastShowAdditionalMetadataModel{" + String.valueOf(this.a) + '}';
    }
}

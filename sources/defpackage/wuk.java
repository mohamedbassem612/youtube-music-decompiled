package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wuk extends wul {
    private final wgi a;

    public wuk(wgi wgiVar) {
        if (wgiVar == null) {
            throw new NullPointerException("Null watchNextResponseModel");
        }
        this.a = wgiVar;
    }

    @Override // defpackage.wul
    public final wgi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wul) {
            return this.a.equals(((wul) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "UpdateWatchPlaylistPanelEvent{watchNextResponseModel=" + this.a.toString() + '}';
    }
}

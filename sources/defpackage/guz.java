package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class guz {
    public final ajwo a;

    public guz(ajwo ajwoVar) {
        ajwoVar.getClass();
        this.a = ajwoVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof guz) && awrc.c(this.a, ((guz) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MusicLibraryCommandEvent(navigationCommand=" + this.a + ')';
    }
}

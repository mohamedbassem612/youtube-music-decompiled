package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yfa {
    public final yez a;
    public final File b;

    public yfa(yez yezVar, File file) {
        if (yezVar == null) {
            throw new NullPointerException("Null cacheEntry");
        }
        this.a = yezVar;
        if (file == null) {
            throw new NullPointerException("Null mediaFile");
        }
        this.b = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yfa) {
            yfa yfaVar = (yfa) obj;
            if (this.a.equals(yfaVar.a) && this.b.equals(yfaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        File file = this.b;
        return "CacheEntryWithMediaFile{cacheEntry=" + this.a.toString() + ", mediaFile=" + file.toString() + '}';
    }

    public yfa() {
        throw null;
    }
}

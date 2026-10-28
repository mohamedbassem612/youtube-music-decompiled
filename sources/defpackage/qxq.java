package defpackage;

import j$.nio.file.Path;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxq {
    public final cab a;
    private final Path b;
    private final bxo c;

    public qxq(cab cabVar, Path path, bxo bxoVar) {
        this.a = cabVar;
        if (path == null) {
            throw new NullPointerException("Null cacheDirectory");
        }
        this.b = path;
        this.c = bxoVar;
    }

    public final void a() {
        this.a.l();
        File file = this.b.toFile();
        boolean zExists = file.exists();
        bxo bxoVar = this.c;
        if (zExists) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            long jH = cab.h(fileArrListFiles);
            if (jH != -1) {
                try {
                    bzq.b(bxoVar, jH);
                } catch (bxn unused) {
                    bvx.e("SimpleCache", a.bS(jH, "Failed to delete file metadata: "));
                }
                try {
                    String[] strArr = bzt.a;
                    bzt.b(bxoVar, Long.toHexString(jH));
                } catch (bxn unused2) {
                    bvx.e("SimpleCache", a.bS(jH, "Failed to delete file metadata: "));
                }
            }
            bwp.V(file);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qxq) {
            qxq qxqVar = (qxq) obj;
            if (this.a.equals(qxqVar.a) && this.b.equals(qxqVar.b) && this.c.equals(qxqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        bxo bxoVar = this.c;
        Path path = this.b;
        return "Cache{simpleCache=" + this.a.toString() + ", cacheDirectory=" + path.toString() + ", databaseProvider=" + bxoVar.toString() + '}';
    }

    public qxq() {
        throw null;
    }
}

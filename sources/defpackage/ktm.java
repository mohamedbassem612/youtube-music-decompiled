package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ktm {
    public final File a;
    public final File b;
    public final File c;

    public ktm(File file, File file2, File file3) {
        this.a = file;
        this.b = file2;
        this.c = file3;
    }

    public final File a() {
        File parentFile = this.a.getParentFile();
        aguu.ak(parentFile);
        return parentFile;
    }

    public final boolean b() {
        if (this.a.isFile()) {
            return this.b.isDirectory();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktm) {
            ktm ktmVar = (ktm) obj;
            if (this.a.equals(ktmVar.a) && this.b.equals(ktmVar.b) && this.c.equals(ktmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        File file = this.c;
        File file2 = this.b;
        return "DiskVmCacheEntry{vmApkFile=" + this.a.toString() + ", optDir=" + file2.toString() + ", touchFile=" + file.toString() + '}';
    }

    public ktm() {
        throw null;
    }
}

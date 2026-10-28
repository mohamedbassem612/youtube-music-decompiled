package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class m implements Iterator {
    public final h a;
    public final File[] b;
    public int c = 0;
    public final /* synthetic */ n d;

    public m(n nVar, Path path, h hVar) {
        this.d = nVar;
        File[] fileArrListFiles = path.toFile().listFiles();
        this.b = fileArrListFiles == null ? new File[0] : fileArrListFiles;
        this.a = hVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p next() {
        p pVar;
        do {
            int i = this.c;
            File[] fileArr = this.b;
            if (i >= fileArr.length) {
                return null;
            }
            this.c = i + 1;
            pVar = new p(this.d.c, fileArr[i].getPath(), this.d.b, "/");
            try {
            } catch (IOException e) {
                throw new DirectoryIteratorException(e);
            }
        } while (!this.a.mo839accept(pVar));
        return pVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.c--;
        return true;
    }
}

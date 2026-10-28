package j$.adapter;

import android.os.StrictMode;
import j$.desugar.sun.nio.fs.d;
import j$.nio.file.spi.c;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final c a;

    static {
        c aVar;
        if (a.b) {
            FileSystemProvider fileSystemProviderProvider = FileSystems.getDefault().provider();
            int i = j$.nio.file.spi.a.c;
            if (fileSystemProviderProvider == null) {
                aVar = null;
            } else {
                aVar = fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).a : new j$.nio.file.spi.a(fileSystemProviderProvider);
            }
        } else {
            if (a.c) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            aVar = d.a;
        }
        a = aVar;
        aVar.j(URI.create("file:///"));
    }
}

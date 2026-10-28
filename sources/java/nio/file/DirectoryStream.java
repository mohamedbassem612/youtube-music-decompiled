package java.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface DirectoryStream<T> extends Closeable, Iterable<T> {

    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public interface Filter<T> {
        /* JADX INFO: renamed from: accept */
        boolean mo839accept(T t) throws IOException;
    }

    Iterator<T> iterator();
}

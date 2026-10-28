package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface j {
    f0 creationTime();

    Object fileKey();

    boolean isDirectory();

    boolean isOther();

    boolean isRegularFile();

    boolean isSymbolicLink();

    f0 lastAccessTime();

    f0 lastModifiedTime();

    long size();
}

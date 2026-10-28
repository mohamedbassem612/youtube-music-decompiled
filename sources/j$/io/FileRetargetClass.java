package j$.io;

import j$.nio.file.FileSystems;
import j$.nio.file.Path;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class FileRetargetClass {
    public static Path toPath(File file) {
        return FileSystems.getDefault().getPath(file.getPath(), new String[0]);
    }
}

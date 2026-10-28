package j$.nio.channels;

import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class DesugarChannels {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (j$.adapter.a.a) {
            return fileChannel;
        }
        if (!(fileChannel instanceof j$.desugar.sun.nio.fs.e)) {
            return new j$.desugar.sun.nio.fs.e(fileChannel, false, false, null);
        }
        int i = j$.desugar.sun.nio.fs.e.e;
        return (j$.desugar.sun.nio.fs.e) fileChannel;
    }
}

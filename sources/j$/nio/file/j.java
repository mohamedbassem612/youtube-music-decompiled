package j$.nio.file;

import java.net.URI;
import java.security.AccessController;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j {
    public static final FileSystem a = ((j$.nio.file.spi.c) AccessController.doPrivileged(new i((byte) 0))).j(URI.create("file:///"));
}

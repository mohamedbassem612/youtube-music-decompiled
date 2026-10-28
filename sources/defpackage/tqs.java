package defpackage;

import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.StandardCopyOption;
import java.io.File;
import java.nio.file.AtomicMoveNotSupportedException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tqs {
    public static final boolean a(File file, File file2) {
        try {
            Files.move(FileRetargetClass.toPath(file), FileRetargetClass.toPath(file2), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (UnsupportedOperationException | AtomicMoveNotSupportedException unused) {
            return false;
        }
    }
}

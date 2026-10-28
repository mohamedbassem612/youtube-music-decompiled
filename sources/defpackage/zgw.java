package defpackage;

import j$.io.FileRetargetClass;
import j$.nio.file.CopyOption;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.StandardCopyOption;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zgw extends zgu {
    private static final Set c = ConcurrentHashMap.newKeySet();
    private File d;

    public zgw(File file) {
        super(file);
        this.d = new File(file.getPath() + ".tmp." + String.valueOf(UUID.randomUUID()));
    }

    @Override // defpackage.zgu
    public final OutputStream b() throws IOException {
        File[] fileArrListFiles;
        File file = this.a;
        if (!c.add(file.getCanonicalPath())) {
            IOException iOException = new IOException("AtomicFile is already being written to");
            zvp.b(zvn.b, zvm.g, "AtomicFile is already being written to", iOException);
            throw iOException;
        }
        try {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && (fileArrListFiles = parentFile.listFiles()) != null) {
                    String strConcat = String.valueOf(file.getName()).concat(".tmp");
                    for (File file2 : fileArrListFiles) {
                        if (file2.isFile() && file2.getName().startsWith(strConcat)) {
                            try {
                                Files.deleteIfExists(FileRetargetClass.toPath(file2));
                            } catch (IOException e) {
                                zvp.b(zvn.b, zvm.g, "Failed to delete orphaned file: ".concat(String.valueOf(file2.getAbsolutePath())), e);
                            }
                        }
                    }
                }
                this.d = new File(this.a.getPath() + ".tmp." + String.valueOf(UUID.randomUUID()));
                return new zgt(this.d);
            } catch (FileNotFoundException e2) {
                File parentFile2 = this.d.getParentFile();
                if (parentFile2 == null || !parentFile2.mkdirs()) {
                    throw new IOException("Couldn't create ".concat(String.valueOf(String.valueOf(this.d.getParentFile()))), e2);
                }
                try {
                    return new zgt(this.d);
                } catch (FileNotFoundException e3) {
                    throw new IOException("Couldn't create ".concat(String.valueOf(String.valueOf(this.d))), e3);
                }
            }
        } catch (IOException e4) {
            zvp.b(zvn.b, zvm.g, "Failed to start write to AtomicFile", e4);
            throw e4;
        }
    }

    @Override // defpackage.zgu
    public final void c() {
        Files.deleteIfExists(FileRetargetClass.toPath(this.a));
        Files.deleteIfExists(FileRetargetClass.toPath(this.b));
    }

    @Override // defpackage.zgu
    public final void d(OutputStream outputStream) throws IOException {
        try {
            outputStream.close();
            Files.move(FileRetargetClass.toPath(this.d), FileRetargetClass.toPath(this.a), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
        } catch (IOException e) {
            zvp.b(zvn.b, zvm.g, "Failed to end write to AtomicFile", e);
            throw e;
        }
    }

    @Override // defpackage.zgu
    public final void e() {
        c.remove(this.a.getCanonicalPath());
    }

    @Override // defpackage.zgu
    protected final void f() {
        File file = this.b;
        if (Files.exists(FileRetargetClass.toPath(file), new LinkOption[0])) {
            zvp.b(zvn.b, zvm.g, "Restoring cachedContent from backup file", new Exception());
            File file2 = this.a;
            Files.deleteIfExists(FileRetargetClass.toPath(file2));
            Files.move(FileRetargetClass.toPath(file), FileRetargetClass.toPath(file2), new CopyOption[0]);
        }
    }

    @Override // defpackage.zgu
    public final boolean g() {
        return Files.exists(FileRetargetClass.toPath(this.a), new LinkOption[0]) || Files.exists(FileRetargetClass.toPath(this.b), new LinkOption[0]);
    }
}

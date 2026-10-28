package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zgv extends zgu {
    public zgv(File file) {
        super(file);
    }

    @Override // defpackage.zgu
    public final InputStream a() {
        try {
            f();
        } catch (IOException e) {
            Log.e("AtomicFileImpl", "Failed to restore backup file: ".concat(this.b.toString()), e);
        }
        return new FileInputStream(this.a);
    }

    @Override // defpackage.zgu
    public final OutputStream b() throws IOException {
        File file = this.a;
        if (file.exists()) {
            File file2 = this.b;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                Log.w("AtomicFileImpl", a.cc(file2, file, "Couldn't rename file ", " to backup file "));
            }
        }
        try {
            return new zgt(this.a);
        } catch (FileNotFoundException e) {
            File file3 = this.a;
            File parentFile = file3.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create ".concat(this.a.toString()), e);
            }
            try {
                return new zgt(file3);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create ".concat(this.a.toString()), e2);
            }
        }
    }

    @Override // defpackage.zgu
    public final void c() throws IOException {
        StringBuilder sb = new StringBuilder();
        File file = this.a;
        if (file.exists() && !file.delete()) {
            sb.append("Failed to delete base file: ");
            sb.append(file);
            sb.append('.');
        }
        File file2 = this.b;
        if (file2.exists() && !file2.delete()) {
            sb.append("Failed to delete backup file: ");
            sb.append(file2);
            sb.append('.');
        }
        if (sb.length() > 0) {
            throw new IOException(sb.toString());
        }
    }

    @Override // defpackage.zgu
    public final void d(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.b.delete();
    }

    @Override // defpackage.zgu
    protected final void f() throws IOException {
        File file = this.b;
        if (file.exists()) {
            StringBuilder sb = new StringBuilder();
            File file2 = this.a;
            if (file2.exists() && !file2.delete()) {
                sb.append("Failed to delete base file: ");
                sb.append(file2);
                sb.append('.');
            }
            if (!file.renameTo(file2)) {
                sb.append("Failed to rename backup file: ");
                sb.append(file);
                sb.append(" to base file: ");
                sb.append(file2);
            }
            if (sb.length() > 0) {
                throw new IOException(sb.toString());
            }
        }
    }

    @Override // defpackage.zgu
    public final boolean g() {
        return this.a.exists() || this.b.exists();
    }
}

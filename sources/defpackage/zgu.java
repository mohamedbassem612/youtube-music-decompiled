package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zgu {
    protected final File a;
    protected final File b;

    protected zgu(File file) {
        this.a = file;
        this.b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public InputStream a() {
        f();
        return new FileInputStream(this.a);
    }

    public abstract OutputStream b();

    public abstract void c();

    public abstract void d(OutputStream outputStream);

    protected abstract void f();

    public abstract boolean g();

    public void e() {
    }
}

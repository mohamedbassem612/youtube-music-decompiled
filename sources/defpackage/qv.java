package defpackage;

import android.window.OnBackInvokedDispatcher;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qv {
    public final Object a;
    public final Object b;

    public qv(File file) {
        this.a = file;
        this.b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmi, java.lang.Object] */
    public final qt a() {
        return (qt) this.b.a();
    }

    public final djl b() {
        return a().a;
    }

    public final void c(bog bogVar, qr qrVar) {
        bogVar.getClass();
        qrVar.getClass();
        final boc lifecycle = bogVar.getLifecycle();
        if (lifecycle.a() != bob.a) {
            qq qqVarE = qrVar.e(new djo(qrVar, bogVar));
            qqVarE.d(false);
            a().a.c(qqVarE);
            final qu quVar = new qu(qqVarE, lifecycle);
            lifecycle.b(quVar);
            qrVar.c.add(new AutoCloseable() { // from class: qs
                @Override // java.lang.AutoCloseable
                public final void close() {
                    lifecycle.c(quVar);
                }
            });
        }
    }

    public final void d() {
        a().b();
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a().a.b(new dju(onBackInvokedDispatcher, 0), 1);
        a().a.b(new dju(onBackInvokedDispatcher, 1000000), 0);
    }

    public final InputStream f() {
        File file = (File) this.b;
        if (file.exists()) {
            File file2 = (File) this.a;
            file2.delete();
            file.renameTo(file2);
        }
        return new FileInputStream((File) this.a);
    }

    public final OutputStream g() throws IOException {
        Object obj = this.a;
        File file = (File) obj;
        if (file.exists()) {
            Object obj2 = this.b;
            File file2 = (File) obj2;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                bvx.e("AtomicFile", a.cc(obj2, obj, "Couldn't rename file ", " to backup file "));
            }
        }
        try {
            return new buz((File) obj);
        } catch (FileNotFoundException e) {
            Object obj3 = this.a;
            File parentFile = ((File) obj3).getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create ".concat(this.a.toString()), e);
            }
            try {
                return new buz((File) obj3);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create ".concat(this.a.toString()), e2);
            }
        }
    }

    public final void h() {
        ((File) this.a).delete();
        ((File) this.b).delete();
    }

    public final void i(OutputStream outputStream) throws IOException {
        outputStream.close();
        ((File) this.b).delete();
    }

    public final boolean j() {
        return ((File) this.a).exists() || ((File) this.b).exists();
    }

    public final void k(dov dovVar, bnz bnzVar) {
        ((axfd) this.a).aw(new dzn(this, dovVar, bnzVar, 3));
    }

    public final void l(dov dovVar, int i) {
        ((axfd) this.a).aw(new efv((eam) this.b, dovVar, false, i));
    }

    public qv(Runnable runnable) {
        this.a = runnable;
        this.b = new awmp(new py(this, 5));
    }

    public qv(String str, String str2, byte[] bArr) {
        this.b = str;
        this.a = str2;
    }

    public qv() {
        this((Runnable) null);
    }

    public qv(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public qv(String str, String str2) {
        str.getClass();
        this.b = str;
        this.a = str2;
    }

    public qv(eam eamVar, axfd axfdVar) {
        eamVar.getClass();
        axfdVar.getClass();
        this.b = eamVar;
        this.a = axfdVar;
    }
}

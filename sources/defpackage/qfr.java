package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qfr {
    public final File a;
    public int b = 0;
    public boolean c = false;
    private final String d;
    private File e;

    public qfr(File file, String str) {
        this.a = file;
        this.d = str;
    }

    public final int a() {
        if (c()) {
            return this.b;
        }
        return 0;
    }

    public final File b() {
        File file = this.e;
        if (file != null) {
            return file;
        }
        File file2 = new File(this.a, this.d.concat("_crash_counter_storage.pb"));
        this.e = file2;
        return file2;
    }

    public final boolean c() {
        if (this.c) {
            return true;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(b());
            try {
                this.b = ((qfu) aihn.parseFrom(qfu.a, fileInputStream, ExtensionRegistryLite.getGeneratedRegistry())).c;
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (FileNotFoundException unused) {
            this.b = 0;
        } catch (IOException e) {
            ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "maybeLoad", 'f', "CrashCounter.java")).t("failed to read counter from disk.");
            return false;
        }
        this.c = true;
        return true;
    }
}

package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qqr implements qpn {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, qqv] */
    @Override // defpackage.qpn
    public final /* bridge */ /* synthetic */ Object a(rrq rrqVar) throws IOException {
        if (this.a) {
            if (rrqVar.d()) {
                throw new qqf("Short circuit would skip transforms.");
            }
            return rrqVar.f.c((Uri) rrqVar.d);
        }
        qqc qqcVar = new qqc(new qqs().a(rrqVar));
        try {
            Closeable closeable = qqcVar.a;
            if (!(closeable instanceof qpw)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileC = ((qpw) closeable).c();
            qqcVar.close();
            return fileC;
        } catch (Throwable th) {
            try {
                qqcVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        this.a = true;
    }
}

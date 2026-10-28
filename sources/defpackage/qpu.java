package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qpu {
    public Object a = null;
    public Object b;

    public qpu(aga agaVar) {
        this.b = agaVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, qqe] */
    public final void a() throws IOException {
        if (this.b == null) {
            throw new qqf("Cannot sync underlying stream");
        }
        ((OutputStream) this.a).flush();
        this.b.a();
    }
}

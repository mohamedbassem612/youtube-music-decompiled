package defpackage;

import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avmv extends avmt {
    private final PrintWriter a;

    public avmv(PrintWriter printWriter) {
        this.a = printWriter;
    }

    @Override // defpackage.avmt
    public final void a(Object obj) {
        this.a.println(obj);
    }
}

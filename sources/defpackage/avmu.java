package defpackage;

import java.io.PrintStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avmu extends avmt {
    private final PrintStream a;

    public avmu(PrintStream printStream) {
        this.a = printStream;
    }

    @Override // defpackage.avmt
    public final void a(Object obj) {
        this.a.println(obj);
    }
}

package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bft implements bdt {
    public final File a;
    public final bgh b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public bft(File file, bgh bghVar) {
        this.a = file;
        this.b = bghVar;
    }

    @Override // defpackage.bdt
    public final void a() {
        this.c.set(true);
    }

    protected final void b() {
        if (this.c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }
}

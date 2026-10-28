package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpp implements dpg {
    public final Context a;
    public final String b;
    public final dpe c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    private final awmi g = new awmp(new py(this, 16));

    public dpp(Context context, String str, dpe dpeVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = dpeVar;
        this.d = z;
        this.e = z2;
    }

    private final dpo a() {
        return (dpo) this.g.a();
    }

    @Override // defpackage.dpg
    public final dpd b() {
        return a().b();
    }

    @Override // defpackage.dpg
    public final String c() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.b()) {
            a().close();
        }
    }

    @Override // defpackage.dpg
    public final void d(boolean z) {
        if (this.g.b()) {
            a().setWriteAheadLoggingEnabled(z);
        }
        this.f = z;
    }
}

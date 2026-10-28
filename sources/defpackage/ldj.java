package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldj {
    final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ ldl e;

    public ldj(ldl ldlVar, long j) {
        this.e = ldlVar;
        kro.i("health_monitor");
        if (j <= 0) {
            throw new IllegalArgumentException();
        }
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j;
    }

    public final long a() {
        return this.e.b().getLong(this.a, 0L);
    }

    public final void b() {
        ldl ldlVar = this.e;
        ldlVar.o();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = ldlVar.b().edit();
        editorEdit.remove(this.b);
        editorEdit.remove(this.c);
        editorEdit.putLong(this.a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}

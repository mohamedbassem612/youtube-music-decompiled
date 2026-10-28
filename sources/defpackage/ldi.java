package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldi {
    final /* synthetic */ ldl a;
    private final String b;
    private final long c;
    private boolean d;
    private long e;

    public ldi(ldl ldlVar, String str, long j) {
        this.a = ldlVar;
        kro.i(str);
        this.b = str;
        this.c = j;
    }

    public final long a() {
        if (!this.d) {
            this.d = true;
            ldl ldlVar = this.a;
            this.e = ldlVar.b().getLong(this.b, this.c);
        }
        return this.e;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.a.b().edit();
        editorEdit.putLong(this.b, j);
        editorEdit.apply();
        this.e = j;
    }
}

package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldg {
    final /* synthetic */ ldl a;
    private final String b;
    private final boolean c;
    private boolean d;
    private boolean e;

    public ldg(ldl ldlVar, String str, boolean z) {
        this.a = ldlVar;
        kro.i(str);
        this.b = str;
        this.c = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor editorEdit = this.a.b().edit();
        editorEdit.putBoolean(this.b, z);
        editorEdit.apply();
        this.e = z;
    }

    public final boolean b() {
        if (!this.d) {
            this.d = true;
            ldl ldlVar = this.a;
            this.e = ldlVar.b().getBoolean(this.b, this.c);
        }
        return this.e;
    }
}

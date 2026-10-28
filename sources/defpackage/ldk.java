package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldk {
    final /* synthetic */ ldl a;
    private final String b;
    private boolean c;
    private String d;

    public ldk(ldl ldlVar, String str) {
        this.a = ldlVar;
        kro.i(str);
        this.b = str;
    }

    public final String a() {
        if (!this.c) {
            this.c = true;
            ldl ldlVar = this.a;
            this.d = ldlVar.b().getString(this.b, null);
        }
        return this.d;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.a.b().edit();
        editorEdit.putString(this.b, str);
        editorEdit.apply();
        this.d = str;
    }
}

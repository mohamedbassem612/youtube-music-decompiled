package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tmg extends toe {
    public Intent a;

    public tmg(Intent intent) {
        this.a = intent;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a != null ? "User needs to (re)enter credentials." : super.getMessage();
    }

    public tmg() {
    }

    public tmg(tnm tnmVar) {
        super(tnmVar);
    }

    public tmg(String str) {
        super(str);
    }

    public tmg(String str, Exception exc) {
        super(str, exc);
    }
}

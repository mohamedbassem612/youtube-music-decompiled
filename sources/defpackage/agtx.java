package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agtx extends agsw {
    private final String a;

    protected agtx(String str) {
        this.a = str;
    }

    @Override // defpackage.agsw
    public String a() {
        return this.a;
    }

    @Override // defpackage.agsw
    public void b(RuntimeException runtimeException, agsu agsuVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}

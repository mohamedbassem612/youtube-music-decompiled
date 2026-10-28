package defpackage;

import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class trm {
    public final String a;
    public final int b;
    public final boolean c;
    public boolean d;
    public final int e;
    public final oml f;

    public trm(String str, int i, oml omlVar) {
        this.a = str;
        this.c = str.startsWith("@") && !str.equals("@UI");
        this.e = i;
        this.f = omlVar;
        this.d = false;
        this.b = str.equals("@UI") ? Process.myTid() : 0;
    }
}

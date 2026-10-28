package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kjx {
    public final Object a;
    public boolean b;
    public final Object c;
    public final Object d;

    public kjx() {
        this.a = new Object();
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
    }

    public static void a(String str, int i) {
        kjs.b().e(str, i);
    }

    public kjx(ffm ffmVar, fcr fcrVar) {
        this.a = new fdk(this);
        this.d = ffmVar;
        this.c = fcrVar;
    }
}

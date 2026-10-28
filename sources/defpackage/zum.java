package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class zum {
    public final ztr a;
    public final Deque b = new ArrayDeque();
    int c = -1;
    zul d;

    public zum(ztr ztrVar) {
        this.a = ztrVar;
    }

    final void a(int i) {
        int i2 = i - 1;
        zul zulVar = this.d;
        if (i2 == 0) {
            zulVar.b++;
        } else if (i2 != 1) {
            zulVar.d++;
        } else {
            zulVar.c++;
        }
    }
}

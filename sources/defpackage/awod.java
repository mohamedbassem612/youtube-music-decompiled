package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awod {
    public final awog a;
    public int b;
    public int c = -1;
    private int d;

    public awod(awog awogVar) {
        this.a = awogVar;
        this.d = awogVar.f;
        b();
    }

    public final void a() {
        if (this.a.f != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            awog awogVar = this.a;
            if (i >= awogVar.e || awogVar.d[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.a.e;
    }

    public final void remove() {
        a();
        if (this.c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        awog awogVar = this.a;
        awogVar.f();
        awogVar.g(this.c);
        this.c = -1;
        this.d = awogVar.f;
    }
}

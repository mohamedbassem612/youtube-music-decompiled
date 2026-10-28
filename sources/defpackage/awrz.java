package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awrz extends awns {
    public boolean a;
    private final int b;
    private int c;

    public awrz(int i, int i2) {
        this.b = i2;
        boolean z = i <= i2;
        this.a = z;
        this.c = true != z ? i2 : i;
    }

    @Override // defpackage.awns
    public final int a() {
        int i = this.c;
        if (i != this.b) {
            this.c = i + 1;
        } else {
            if (!this.a) {
                throw new NoSuchElementException();
            }
            this.a = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }
}

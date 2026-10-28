package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyn implements Iterator {
    final /* synthetic */ fyo a;
    private int b = 0;

    public fyn(fyo fyoVar) {
        this.a = fyoVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fyy next() {
        fyo fyoVar = this.a;
        int i = this.b;
        int iC = fyoVar.c();
        int i2 = this.b;
        if (i < iC) {
            this.b = i2 + 1;
            return fyoVar.e(i2);
        }
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }
}

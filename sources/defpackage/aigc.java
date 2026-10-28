package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aigc extends aigd {
    final /* synthetic */ aigj a;
    private int b = 0;
    private final int c;

    public aigc(aigj aigjVar) {
        this.a = aigjVar;
        this.c = aigjVar.d();
    }

    @Override // defpackage.aigf
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}

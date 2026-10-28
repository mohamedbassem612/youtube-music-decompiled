package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awnd extends awne implements RandomAccess {
    private final awne a;
    private final int b;
    private final int c;

    public awnd(awne awneVar, int i, int i2) {
        this.a = awneVar;
        this.b = i;
        atqp.g(i, i2, awneVar.a());
        this.c = i2 - i;
    }

    @Override // defpackage.awna
    public final int a() {
        return this.c;
    }

    @Override // defpackage.awne, java.util.List
    public final Object get(int i) {
        atqp.e(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.awne, java.util.List
    public final List subList(int i, int i2) {
        atqp.g(i, i2, this.c);
        int i3 = this.b;
        return new awnd(this.a, i + i3, i3 + i2);
    }
}

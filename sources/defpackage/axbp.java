package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axbp extends axbi {
    private final Iterable d;

    public axbp(Iterable iterable, awou awouVar, int i, int i2) {
        super(awouVar, i, i2);
        this.d = iterable;
    }

    @Override // defpackage.axbi
    public final Object a(awyp awypVar, awoq awoqVar) {
        axce axceVar = new axce(awypVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            awro.t(awypVar, null, 0, new adpb((awzc) it.next(), axceVar, (awoq) null, 9), 3);
        }
        return awmy.a;
    }

    @Override // defpackage.axbi
    protected final axbi b(awou awouVar, int i, int i2) {
        return new axbp(this.d, awouVar, i, i2);
    }

    @Override // defpackage.axbi
    public final awyr e(awut awutVar) {
        return awqx.A(awutVar, this.a, this.b, 1, 1, new bhg(this, (awoq) null, 2));
    }
}

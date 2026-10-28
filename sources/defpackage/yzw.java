package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yzw implements Callable {
    public final ywj a;
    public final long b;
    final /* synthetic */ yzx c;
    private final cno d;
    private final long e;

    public yzw(yzx yzxVar, cno cnoVar, long j, long j2, ywj ywjVar) {
        this.c = yzxVar;
        this.d = cnoVar;
        this.e = j;
        this.b = j2;
        this.a = ywjVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        yzv yzvVar;
        yzx yzxVar = this.c;
        boolean zC = yzxVar.c.c(this.e);
        yzv yzvVar2 = yzxVar.e;
        if (yzvVar2 != null) {
            if (yzvVar2.a == this.d) {
                zC |= yzvVar2.b(this.b);
            } else {
                if (yzvVar2.d == null) {
                    if (!yzxVar.b.av() || yzxVar.d.contains(yzxVar.e)) {
                        yzxVar.j(yzxVar.e);
                    } else {
                        yzxVar.a.execute(afwl.i(new ywt(this, 11)));
                    }
                    yzxVar.d.remove(yzxVar.e);
                } else {
                    yzvVar2.e = true;
                }
                zC = true;
                yzxVar.e = new yzv(this.d, yzxVar.b, this.a);
                yzxVar.e.b(this.b);
                yzv yzvVar3 = yzxVar.e;
                yzxVar.h(yzvVar3, yzvVar3.a);
                yzvVar = yzxVar.e;
                if (yzvVar != null) {
                    yzxVar.d.add(yzvVar);
                }
            }
        } else {
            yzxVar.e = new yzv(this.d, yzxVar.b, this.a);
            yzxVar.e.b(this.b);
            yzv yzvVar4 = yzxVar.e;
            yzxVar.h(yzvVar4, yzvVar4.a);
            yzvVar = yzxVar.e;
            if (yzvVar != null) {
                yzxVar.d.add(yzvVar);
            }
        }
        return Boolean.valueOf(zC);
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abqa implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ abqa(abqc abqcVar, avmn avmnVar, boolean z, int i) {
        this.$cid = i;
        this.b = abqcVar;
        this.c = avmnVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [avmn, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        if (this.$cid == 0) {
            abqc abqcVar = (abqc) this.b;
            Throwable th = (Throwable) obj;
            if (abqcVar.f.g.l(367, 45767469L, false)) {
                this.c.dispose();
            }
            abqcVar.d(this.a, th);
            return;
        }
        ahgb ahgbVar = (ahgb) this.c;
        mqf mqfVar = (mqf) ahgbVar.d;
        if (!mqfVar.c()) {
            ahgbVar.M();
            return;
        }
        boolean z = this.a;
        avbs avbsVar = (avbs) this.b;
        AtomicInteger atomicInteger = (AtomicInteger) avbsVar.d;
        mqfVar.b(atomicInteger.get(), z);
        if (atomicInteger.addAndGet(avbsVar.b) >= avbsVar.c) {
            atomicInteger.set(0);
            if (avbsVar.a) {
                return;
            }
            ahgbVar.M();
        }
    }

    public /* synthetic */ abqa(ahgb ahgbVar, avbs avbsVar, boolean z, int i) {
        this.$cid = i;
        this.c = ahgbVar;
        this.b = avbsVar;
        this.a = z;
    }
}

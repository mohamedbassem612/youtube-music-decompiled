package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dbg implements bvh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dbg(aae aaeVar, cni cniVar, int i) {
        this.$cid = i;
        this.b = aaeVar;
        this.a = cniVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.bvh
    public final void a(Object obj) {
        if (this.$cid != 0) {
            Object obj2 = this.a;
            aae aaeVar = (aae) this.b;
            ((cns) obj).gd(aaeVar.a, (cnm) aaeVar.b, (cni) obj2);
            return;
        }
        abnx abnxVar = (abnx) obj;
        obf obfVar = new obf(abnxVar.a, om.g(abnxVar.d, abnxVar.b), 1);
        dbh dbhVar = (dbh) this.a;
        dbhVar.a.add(obfVar);
        long j = abnxVar.c;
        if (j != -9223372036854775807L) {
            AtomicLong atomicLong = (AtomicLong) this.b;
            atomicLong.set(atomicLong.get() == -9223372036854775807L ? j : Math.max(atomicLong.get(), j));
        }
        long j2 = dbhVar.b;
        if (j2 == -9223372036854775807L || j >= j2) {
            dbhVar.h(obfVar);
        }
    }

    public /* synthetic */ dbg(dbh dbhVar, AtomicLong atomicLong, int i) {
        this.$cid = i;
        this.a = dbhVar;
        this.b = atomicLong;
    }
}

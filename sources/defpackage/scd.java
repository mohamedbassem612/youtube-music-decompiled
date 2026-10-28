package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class scd implements sgs {
    private final /* synthetic */ int $cid;
    final /* synthetic */ sko a;
    final /* synthetic */ smr b;
    final /* synthetic */ sce c;

    public scd(sce sceVar, sko skoVar, smr smrVar, int i) {
        this.$cid = i;
        this.a = skoVar;
        this.b = smrVar;
        this.c = sceVar;
    }

    @Override // defpackage.sgs
    public final void d(int i, int i2) {
        int i3 = this.$cid;
        sce sceVar = this.c;
        if (i3 != 0) {
            ((spy) sceVar.c.io()).f(i, i2);
            smr smrVar = this.b;
            sko skoVar = this.a;
            sceVar.e(smrVar, skoVar, skoVar.a, sce.a);
            return;
        }
        ((spy) sceVar.c.io()).f(i, i2);
        sko skoVar2 = this.a;
        Map map = sceVar.d;
        String str = skoVar2.a;
        if (map.containsKey(str)) {
            ((sgq) map.get(str)).T();
        } else {
            smr smrVar2 = this.b;
            if (smrVar2 == null || skoVar2 == null) {
                rmp.n(null, "No AdPodSkipTargetListener registered for skip click.");
            } else {
                rmp.m(smrVar2, skoVar2, "No AdPodSkipTargetListener registered for skip click.");
            }
        }
        sceVar.e(this.b, skoVar2, skoVar2.a, sce.a);
    }

    @Override // defpackage.sgs
    public final void e() {
        int i = this.$cid;
        sce sceVar = this.c;
        if (i != 0) {
            smr smrVar = this.b;
            sko skoVar = this.a;
            sceVar.e(smrVar, skoVar, skoVar.a, sce.b);
        } else {
            smr smrVar2 = this.b;
            sko skoVar2 = this.a;
            sceVar.e(smrVar2, skoVar2, skoVar2.a, sce.b);
        }
    }

    public scd(sce sceVar, smr smrVar, sko skoVar, int i) {
        this.$cid = i;
        this.b = smrVar;
        this.a = skoVar;
        this.c = sceVar;
    }
}

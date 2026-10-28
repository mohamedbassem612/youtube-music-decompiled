package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rrc implements afhx {
    private final /* synthetic */ int $cid;
    final /* synthetic */ ahex a;
    final /* synthetic */ rqu b;

    public rrc(ahex ahexVar, rqu rquVar, int i) {
        this.$cid = i;
        this.a = ahexVar;
        this.b = rquVar;
    }

    @Override // defpackage.afhx
    public final ListenableFuture a() {
        int i = this.$cid;
        if (i == 0) {
            ebs ebsVar = new ebs(this.b, 19);
            long j = afwl.a;
            return this.a.submit(new ahcz(afty.c(false), ebsVar, 1));
        }
        if (i != 1) {
            ebs ebsVar2 = new ebs(this.b, 20);
            long j2 = afwl.a;
            return this.a.submit(new ahcz(afty.c(false), ebsVar2, 1));
        }
        ebs ebsVar3 = new ebs(this.b, 18);
        long j3 = afwl.a;
        return this.a.submit(new ahcz(afty.c(false), ebsVar3, 1));
    }
}

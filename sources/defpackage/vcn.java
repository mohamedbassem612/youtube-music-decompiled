package defpackage;

import j$.time.Duration;
import j$.util.DesugarCollections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vcn implements axp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ vcn(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // defpackage.axp
    public final Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            vcr vcrVar = (vcr) obj;
            long j = vcp.a;
            vcrVar.getClass();
            aihf builder = vcrVar.toBuilder();
            builder.getClass();
            DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((vcr) builder.instance).b)).getClass();
            builder.ad(this.a);
            return yno.fq(builder);
        }
        if (i == 1) {
            Duration duration = iqn.a;
            aihf builder2 = ((ailu) obj).toBuilder();
            builder2.copyOnWrite();
            ailu ailuVar = (ailu) builder2.instance;
            ailuVar.b |= 16;
            ailuVar.f = this.a;
            return (ailu) builder2.build();
        }
        vcr vcrVar2 = (vcr) obj;
        long j2 = vcp.a;
        vcrVar2.getClass();
        aihf builder3 = vcrVar2.toBuilder();
        builder3.getClass();
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((vcr) builder3.instance).b)).getClass();
        builder3.ad(this.a);
        return yno.fq(builder3);
    }
}

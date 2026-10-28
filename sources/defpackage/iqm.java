package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iqm implements axp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ iqm(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    @Override // defpackage.axp
    public final Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            Duration duration = iqn.a;
            aihf builder = ((ailu) obj).toBuilder();
            builder.copyOnWrite();
            ailu ailuVar = (ailu) builder.instance;
            ailuVar.b |= 8;
            ailuVar.e = this.a;
            return (ailu) builder.build();
        }
        if (i == 1) {
            aihf builder2 = ((ailq) obj).toBuilder();
            builder2.copyOnWrite();
            ailq ailqVar = (ailq) builder2.instance;
            ailqVar.b |= 1;
            ailqVar.c = this.a;
            return (ailq) builder2.build();
        }
        if (i != 2) {
            aihf builder3 = ((aimb) obj).toBuilder();
            builder3.copyOnWrite();
            aimb aimbVar = (aimb) builder3.instance;
            aimbVar.b |= 2;
            aimbVar.d = this.a;
            return (aimb) builder3.build();
        }
        aihf builder4 = ((aimb) obj).toBuilder();
        builder4.copyOnWrite();
        aimb aimbVar2 = (aimb) builder4.instance;
        aimbVar2.b |= 1;
        aimbVar2.c = this.a;
        return (aimb) builder4.build();
    }
}

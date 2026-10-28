package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zjq implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ zjq(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                int i = zjr.L;
                aihf builder = ((atpl) obj).toBuilder();
                builder.copyOnWrite();
                atpl atplVar = (atpl) builder.instance;
                atplVar.b |= SemanticState.LiveRegion;
                atplVar.m = this.a;
                return (atpl) builder.build();
            case 1:
                return new ukw((auhs) obj, this.a);
            case 2:
                int i2 = zjr.L;
                aihf builder2 = ((atpl) obj).toBuilder();
                builder2.copyOnWrite();
                atpl atplVar2 = (atpl) builder2.instance;
                atplVar2.b |= SemanticState.ReadOnly;
                atplVar2.n = this.a;
                return (atpl) builder2.build();
            case 3:
                aihf builder3 = ((atpq) obj).toBuilder();
                builder3.copyOnWrite();
                atpq atpqVar = (atpq) builder3.instance;
                atpqVar.b |= 16;
                atpqVar.g = this.a;
                return (atpq) builder3.build();
            case 4:
                aihf builder4 = ((atpq) obj).toBuilder();
                builder4.copyOnWrite();
                atpq atpqVar2 = (atpq) builder4.instance;
                atpqVar2.b |= 64;
                atpqVar2.i = this.a;
                return (atpq) builder4.build();
            case 5:
                aihf builder5 = ((atpq) obj).toBuilder();
                builder5.copyOnWrite();
                atpq atpqVar3 = (atpq) builder5.instance;
                atpqVar3.b |= SemanticState.Hidden;
                atpqVar3.k = this.a;
                return (atpq) builder5.build();
            case 6:
                aihf builder6 = ((atpl) obj).toBuilder();
                builder6.copyOnWrite();
                atpl atplVar3 = (atpl) builder6.instance;
                atplVar3.b |= 65536;
                atplVar3.t = this.a;
                return (atpl) builder6.build();
            default:
                aihf builder7 = ((atpl) obj).toBuilder();
                builder7.copyOnWrite();
                atpl atplVar4 = (atpl) builder7.instance;
                atplVar4.b |= 131072;
                atplVar4.u = this.a;
                return (atpl) builder7.build();
        }
    }
}

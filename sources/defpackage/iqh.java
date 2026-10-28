package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iqh implements axp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ iqh(long j, int i) {
        this.$cid = i;
        this.a = j;
    }

    @Override // defpackage.axp
    public final Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aihf builder = ((ailq) obj).toBuilder();
            builder.copyOnWrite();
            ailq ailqVar = (ailq) builder.instance;
            ailqVar.b |= 16;
            ailqVar.e = this.a;
            return (ailq) builder.build();
        }
        if (i == 1) {
            aihf builder2 = ((ailq) obj).toBuilder();
            builder2.copyOnWrite();
            ailq ailqVar2 = (ailq) builder2.instance;
            ailqVar2.b |= 64;
            ailqVar2.g = this.a;
            return (ailq) builder2.build();
        }
        if (i == 2) {
            aihf builder3 = ((ailq) obj).toBuilder();
            builder3.copyOnWrite();
            ailq ailqVar3 = (ailq) builder3.instance;
            ailqVar3.b |= 32;
            ailqVar3.f = this.a;
            return (ailq) builder3.build();
        }
        if (i != 3) {
            aihf builder4 = ((ailq) obj).toBuilder();
            builder4.copyOnWrite();
            ailq ailqVar4 = (ailq) builder4.instance;
            ailqVar4.b |= SemanticState.Hidden;
            ailqVar4.i = this.a;
            return (ailq) builder4.build();
        }
        aihf builder5 = ((ailq) obj).toBuilder();
        builder5.copyOnWrite();
        ailq ailqVar5 = (ailq) builder5.instance;
        ailqVar5.b |= SemanticState.Focused;
        ailqVar5.h = this.a;
        return (ailq) builder5.build();
    }
}

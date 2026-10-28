package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iqi implements axp {
    private final /* synthetic */ int $cid;

    public /* synthetic */ iqi(int i) {
        this.$cid = i;
    }

    @Override // defpackage.axp
    public final Object a(Object obj) {
        switch (this.$cid) {
            case 0:
                aihf builder = ((ailq) obj).toBuilder();
                builder.copyOnWrite();
                ailq ailqVar = (ailq) builder.instance;
                ailqVar.b |= 2;
                ailqVar.d = true;
                return (ailq) builder.build();
            case 1:
                ailq ailqVar2 = (ailq) obj;
                aihf builder2 = ailqVar2.toBuilder();
                int i = ailqVar2.j + 1;
                builder2.copyOnWrite();
                ailq ailqVar3 = (ailq) builder2.instance;
                ailqVar3.b |= SemanticState.LiveRegion;
                ailqVar3.j = i;
                return (ailq) builder2.build();
            case 2:
                aihf builder3 = ((ails) obj).toBuilder();
                builder3.copyOnWrite();
                ails ailsVar = (ails) builder3.instance;
                ailsVar.b |= 2;
                ailsVar.d = true;
                return (ails) builder3.build();
            case 3:
                aihf builder4 = ((ails) obj).toBuilder();
                builder4.copyOnWrite();
                ails ailsVar2 = (ails) builder4.instance;
                ailsVar2.b |= 4;
                ailsVar2.e = true;
                return (ails) builder4.build();
            case 4:
                Duration duration = iqn.a;
                aihf builder5 = ((ailu) obj).toBuilder();
                builder5.copyOnWrite();
                ailu ailuVar = (ailu) builder5.instance;
                ailuVar.b |= 2;
                ailuVar.d = false;
                return (ailu) builder5.build();
            case 5:
                Duration duration2 = iqn.a;
                aihf builder6 = ((ailu) obj).toBuilder();
                builder6.copyOnWrite();
                ailu ailuVar2 = (ailu) builder6.instance;
                ailuVar2.b |= 1;
                ailuVar2.c = false;
                return (ailu) builder6.build();
            case 6:
                ailv ailvVar = (ailv) obj;
                aihf builder7 = ailvVar.toBuilder();
                int i2 = ailvVar.c + 1;
                builder7.copyOnWrite();
                ailv ailvVar2 = (ailv) builder7.instance;
                ailvVar2.b |= 1;
                ailvVar2.c = i2;
                return (ailv) builder7.build();
            case 7:
                int i3 = rou.e;
                return rov.a;
            case 8:
                aihf builder8 = ((upy) obj).toBuilder();
                builder8.copyOnWrite();
                upy upyVar = (upy) builder8.instance;
                upyVar.b |= 1;
                upyVar.c = true;
                return (upy) builder8.build();
            case 9:
                return uzd.a;
            default:
                aihf builder9 = ((arkk) obj).toBuilder();
                builder9.copyOnWrite();
                ((arkk) builder9.instance).a().clear();
                return (arkk) builder9.build();
        }
    }
}

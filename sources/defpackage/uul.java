package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uul extends utz {
    private final Optional a;
    private final Optional c;
    private final Optional d;
    private final Optional e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uul(long j, Optional optional, Optional optional2, Optional optional3) {
        super(j);
        Optional optionalEmpty = Optional.empty();
        this.a = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = optionalEmpty;
    }

    @Override // defpackage.utz
    public final augy e(augy augyVar) {
        jrr jrrVar = (jrr) augyVar.toBuilder();
        sda sdaVar = new sda(augyVar, jrrVar, 10, null);
        Optional optional = this.a;
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = sdaVar.b;
            Object obj3 = sdaVar.a;
            auhp auhpVar = (auhp) obj;
            aihf builder = auhpVar.toBuilder();
            if ((auhpVar.b & 1) == 0) {
                auhp auhpVar2 = ((augy) obj2).k;
                if (auhpVar2 == null) {
                    auhpVar2 = auhp.a;
                }
                float f = auhpVar2.c;
                builder.copyOnWrite();
                auhp auhpVar3 = (auhp) builder.instance;
                auhpVar3.b |= 1;
                auhpVar3.c = f;
            }
            if ((auhpVar.b & 2) == 0) {
                auhp auhpVar4 = ((augy) obj2).k;
                if (auhpVar4 == null) {
                    auhpVar4 = auhp.a;
                }
                float f2 = auhpVar4.d;
                builder.copyOnWrite();
                auhp auhpVar5 = (auhp) builder.instance;
                auhpVar5.b |= 2;
                auhpVar5.d = f2;
            }
            ((aihf) obj3).copyOnWrite();
            augy augyVar2 = (augy) ((jrr) obj3).instance;
            auhp auhpVar6 = (auhp) builder.build();
            auhpVar6.getClass();
            augyVar2.k = auhpVar6;
            augyVar2.b |= 64;
        }
        Optional optional2 = this.c;
        jrrVar.getClass();
        urh urhVar = new urh(jrrVar, 4);
        if (true == optional2.isPresent()) {
            Object obj4 = optional2.get();
            Object obj5 = urhVar.a;
            ((aihf) obj5).copyOnWrite();
            augy augyVar3 = (augy) ((jrr) obj5).instance;
            augyVar3.l = (auho) obj4;
            augyVar3.b |= SemanticState.Focused;
        }
        Optional optional3 = this.d;
        urh urhVar2 = new urh(jrrVar, 5);
        if (true == optional3.isPresent()) {
            Object obj6 = optional3.get();
            Object obj7 = urhVar2.a;
            double dDoubleValue = ((Double) obj6).doubleValue();
            ((aihf) obj7).copyOnWrite();
            augy augyVar4 = (augy) ((jrr) obj7).instance;
            augyVar4.b |= SemanticState.ReadOnly;
            augyVar4.o = dDoubleValue;
        }
        this.e.isPresent();
        return (augy) jrrVar.build();
    }
}

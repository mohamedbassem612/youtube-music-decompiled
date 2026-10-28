package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uur implements utv {
    private final /* synthetic */ int $cid;
    public final aihn a;
    private final long b;

    public uur(long j, aihn aihnVar, int i) {
        this.$cid = i;
        this.b = j;
        this.a = aihnVar;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return this.$cid != 0 ? yno.gq(this) : yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) {
        if (this.$cid == 0) {
            return usj.j(auhsVar, this.b, new uot(this, 10));
        }
        final uot uotVar = new uot(this, 9);
        final long j = this.b;
        agrf agrfVar = usj.a;
        return yno.gw(auhsVar, aufq.b, new Function() { // from class: usg
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo840andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aufq aufqVar = (aufq) obj;
                agrf agrfVar2 = usj.a;
                aihf builder = aufqVar.toBuilder();
                aufp aufpVar = aufp.a;
                aiip aiipVar = aufqVar.c;
                Long lValueOf = Long.valueOf(j);
                aufp aufpVar2 = (aufp) aiipVar.get(lValueOf);
                if (aufpVar2 != null) {
                    aufpVar = aufpVar2;
                }
                aufp aufpVar3 = (aufp) uotVar.apply(aufpVar);
                aufpVar3.getClass();
                builder.copyOnWrite();
                aufq aufqVar2 = (aufq) builder.instance;
                aiip aiipVar2 = aufqVar2.c;
                if (!aiipVar2.b) {
                    aufqVar2.c = aiipVar2.a();
                }
                aufqVar2.c.put(lValueOf, aufpVar3);
                return (aufq) builder.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.uub
    public final /* synthetic */ void c(urz urzVar) {
    }
}

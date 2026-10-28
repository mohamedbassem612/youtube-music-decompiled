package defpackage;

import io.grpc.Status;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avgt extends atxy {
    final avgs b;
    final avbt c;
    final /* synthetic */ avhb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avgt(avhb avhbVar, avgs avgsVar, avbt avbtVar) {
        super(null);
        this.d = avhbVar;
        this.b = avgsVar;
        avbtVar.getClass();
        this.c = avbtVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.atxy
    public final Status m(avbr avbrVar) {
        avhk avhkVar;
        Object obj;
        avhb avhbVar = this.d;
        avcj avcjVar = avhbVar.o;
        avcjVar.c();
        if (avhbVar.t != this.c) {
            return Status.OK;
        }
        avcf avcfVar = avbrVar.a;
        if (!avcfVar.d()) {
            u(avcfVar.a());
            return avcfVar.a();
        }
        Object objC = avcfVar.c();
        auys auysVar = avhbVar.I;
        auyo auyoVar = avbrVar.b;
        auysVar.b(1, "Resolved address: {0}, config={1}", objC, auyoVar);
        if (avhbVar.U != 2) {
            auysVar.b(2, "Address resolved: {0}", objC);
            avhbVar.U = 2;
        }
        avbp avbpVar = avbrVar.c;
        auzx auzxVar = (auzx) auyoVar.a(auzx.a);
        avhk avhkVar2 = (avbpVar == null || (obj = avbpVar.b) == null) ? null : (avhk) obj;
        Status status = avbpVar != null ? avbpVar.a : null;
        if (avhbVar.N) {
            if (avhkVar2 != null) {
                if (auzxVar != null) {
                    avhbVar.K.d(auzxVar);
                    if (avhkVar2.a() != null) {
                        auysVar.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    avhbVar.K.d(avhkVar2.a());
                }
            } else if (status == null) {
                avgy avgyVar = avhbVar.K;
                avhkVar2 = avhb.e;
                avgyVar.d(null);
            } else {
                if (!avhbVar.M) {
                    auysVar.a(2, "Fallback to error due to invalid first service config without default config");
                    Status status2 = avbpVar.a;
                    ahno.G(!status2.e(), "the error status must not be OK");
                    avcjVar.execute(new aves(this, status2, 9));
                    return status2;
                }
                avhkVar2 = avhbVar.L;
            }
            if (!avhkVar2.equals(avhbVar.L)) {
                auysVar.b(2, "Service config changed{0}", avhkVar2 == avhb.e ? " to empty" : "");
                avhbVar.L = avhkVar2;
                avhbVar.S.a = avhkVar2.a;
            }
            try {
                avhbVar.M = true;
            } catch (RuntimeException e) {
                avaa avaaVar = this.d.i;
                avhb.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", "[" + String.valueOf(avaaVar) + "] Unexpected exception from parsing service config", (Throwable) e);
            }
            avhkVar = avhkVar2;
        } else {
            if (avhkVar2 != null) {
                auysVar.a(2, "Service config from name resolver discarded by channel settings");
            }
            avhkVar = avhb.e;
            if (auzxVar != null) {
                auysVar.a(2, "Config selector from name resolver discarded by channel settings");
            }
            avhbVar.K.d(avhkVar.a());
        }
        auyo auyoVar2 = avbrVar.b;
        avgs avgsVar = this.b;
        if (avgsVar != this.d.v) {
            return Status.OK;
        }
        axle axleVar = new axle(auyoVar2);
        auyn auynVar = auzx.a;
        Object obj2 = axleVar.a;
        if (obj2 == null) {
            ((IdentityHashMap) axleVar.b).remove(auynVar);
        } else if (((auyo) obj2).b.containsKey(auynVar)) {
            axleVar.b(0).remove(auynVar);
        }
        Map map = avhkVar.c;
        if (map != null) {
            axleVar.c(avat.a, map);
            axleVar.a();
        }
        return avgsVar.a.a(new avap(avcfVar.c(), axleVar.a(), avhkVar.b));
    }

    public final void u(Status status) {
        Logger logger = avhb.a;
        Level level = Level.WARNING;
        avhb avhbVar = this.d;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{avhbVar.i, status});
        avgy avgyVar = avhbVar.K;
        if (avgyVar.a.get() == avhb.f) {
            avhb avhbVar2 = avgyVar.c;
            avgyVar.d(null);
        }
        if (avhbVar.U != 3) {
            avhbVar.I.b(3, "Failed to resolve name: {0}", status);
            avhbVar.U = 3;
        }
        avgs avgsVar = this.b;
        if (avgsVar == avhbVar.v) {
            avgsVar.a.b(status);
        }
    }
}

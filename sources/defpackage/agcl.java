package defpackage;

import com.google.android.libraries.blocks.runtime.ClientCreatorProxy;
import com.google.android.libraries.blocks.runtime.Instance;
import com.google.android.libraries.blocks.runtime.RuntimeKeyedSignal;
import com.google.android.libraries.blocks.runtime.RuntimeSignal;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.android.libraries.elements.interfaces.ExecutorThread;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agcl extends Instance {
    public final Object a;
    public final Object b;

    public agcl(awmd awmdVar, agev agevVar, agev agevVar2) {
        this.a = awmdVar;
        this.b = (agevVar.g() && ((Boolean) agevVar2.e(Boolean.FALSE)).booleanValue()) ? agev.i(((ExecutorRegistry) agevVar.c()).executorForExecutorThread(ExecutorThread.BACKGROUND).createTaskQueue()) : agdf.a;
    }

    public static asfv c(tfl tflVar) {
        ajuf ajufVarA = ajuf.a(tflVar.e);
        if (ajufVarA == null) {
            ajufVarA = ajuf.CONN_UNKNOWN;
        }
        int i = (!tflVar.c || tflVar.b) ? 2 : 3;
        aihf aihfVarCreateBuilder = asfv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asfv asfvVar = (asfv) aihfVarCreateBuilder.instance;
        asfvVar.c = ajufVarA.p;
        asfvVar.b |= 1;
        int i2 = tflVar.f;
        aihfVarCreateBuilder.copyOnWrite();
        asfv asfvVar2 = (asfv) aihfVarCreateBuilder.instance;
        asfvVar2.d = i2 - 1;
        asfvVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        asfv asfvVar3 = (asfv) aihfVarCreateBuilder.instance;
        asfvVar3.e = i - 1;
        asfvVar3.b |= 4;
        boolean z = tflVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        asfv asfvVar4 = (asfv) aihfVarCreateBuilder.instance;
        asfvVar4.b |= 8;
        asfvVar4.f = z;
        return (asfv) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static asdy d(akww akwwVar, long j) {
        aihf aihfVarCreateBuilder = asdy.a.createBuilder();
        aiip aiipVar = akwwVar.c;
        Long lValueOf = Long.valueOf(j);
        if (aiipVar.containsKey(lValueOf)) {
            akwx akwxVar = (akwx) akwwVar.c.get(lValueOf);
            if (akwxVar == null) {
                throw new IllegalArgumentException();
            }
            aihfVarCreateBuilder.copyOnWrite();
            asdy asdyVar = (asdy) aihfVarCreateBuilder.instance;
            asdyVar.c = akwxVar;
            asdyVar.b |= 1;
        }
        return (asdy) aihfVarCreateBuilder.build();
    }

    public static int e(hww hwwVar) {
        int iOrdinal = hwwVar.ordinal();
        if (iOrdinal == 0) {
            return 2;
        }
        if (iOrdinal == 1) {
            return 3;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 4 ? 1 : 5;
        }
        return 4;
    }

    public final aigv a(aifz aifzVar) {
        aifzVar.getClass();
        ((RuntimeSignal) this.a).b(aifzVar);
        aigv aigvVar = aigv.a;
        aigvVar.getClass();
        return aigvVar;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [awmi, java.lang.Object] */
    public final aigv b(asir asirVar) {
        asirVar.getClass();
        boolean z = asirVar.d;
        String str = asirVar.c;
        str.getClass();
        aihf aihfVarCreateBuilder = asip.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asip asipVar = (asip) aihfVarCreateBuilder.instance;
        asipVar.b |= 1;
        asipVar.c = str;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        aihf aihfVarCreateBuilder2 = aqps.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aqps aqpsVar = (aqps) aihfVarCreateBuilder2.instance;
        aqpsVar.b |= 1;
        aqpsVar.c = z;
        aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
        aihnVarBuild2.getClass();
        Object objA = this.a.a();
        objA.getClass();
        RuntimeKeyedSignal runtimeKeyedSignal = (RuntimeKeyedSignal) objA;
        ClientCreatorProxy clientCreatorProxy = runtimeKeyedSignal.b;
        clientCreatorProxy.nativeUpdateKeyedSignal(((asip) aihnVarBuild).toByteArray(), ((aqps) aihnVarBuild2).toByteArray(), clientCreatorProxy.a, runtimeKeyedSignal.a);
        aigv aigvVar = aigv.a;
        aigvVar.getClass();
        return aigvVar;
    }

    public agcl(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public agcl(may mayVar, byte[] bArr) {
        this.b = mayVar;
        this.a = new awmp(new acoo(this, 18));
    }

    public agcl(awmd awmdVar, zzf zzfVar, may mayVar) {
        this.b = awmdVar;
        aobm aobmVar = aobm.a;
        aihn.getParserForClass(aobm.class);
        RuntimeSignal runtimeSignal = new RuntimeSignal(-1726603167, mayVar.a);
        this.a = runtimeSignal;
        runtimeSignal.a(zzfVar.b);
    }

    public agcl(may mayVar, aunn aunnVar, aunn aunnVar2) {
        this.a = (agar) mayVar.b(new afzb(5), new hph(mayVar, aunnVar, 5));
        this.b = (agar) mayVar.b(new afzb(5), new hph(mayVar, aunnVar2, 6));
    }

    public agcl(aunn aunnVar, Object obj) {
        this.b = aunnVar;
        this.a = obj;
    }

    public agcl(may mayVar) {
        this.b = mayVar;
        aifz aifzVarA = aifz.a(false);
        aihn.getParserForClass(aifz.class);
        RuntimeSignal runtimeSignal = new RuntimeSignal(108255250, mayVar.a);
        runtimeSignal.b(aifzVarA);
        this.a = runtimeSignal;
    }
}

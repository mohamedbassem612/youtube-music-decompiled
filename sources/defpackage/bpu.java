package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpu implements bpl {
    private final qv[] a;

    public bpu(qv... qvVarArr) {
        qvVarArr.getClass();
        this.a = qvVarArr;
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi a(Class cls) {
        return bnz.h();
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [awqg, java.lang.Object] */
    @Override // defpackage.bpl
    public final bpi b(Class cls, bpt bptVar) {
        qv qvVar;
        int i = awrn.a;
        awqv awqvVar = new awqv(cls);
        qv[] qvVarArr = this.a;
        qv[] qvVarArr2 = (qv[]) Arrays.copyOf(qvVarArr, qvVarArr.length);
        qvVarArr2.getClass();
        int i2 = 0;
        while (true) {
            if (i2 >= qvVarArr2.length) {
                qvVar = null;
                break;
            }
            qvVar = qvVarArr2[i2];
            if (awrc.c(qvVar.a, awqvVar)) {
                break;
            }
            i2++;
        }
        Object objInvoke = qvVar != null ? qvVar.b.invoke(bptVar) : null;
        if (objInvoke != null) {
            return (bpi) objInvoke;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(String.valueOf(awqvVar.b())));
    }

    @Override // defpackage.bpl
    public final /* synthetic */ bpi c(awsd awsdVar, bpt bptVar) {
        return b(((awqv) awsdVar).b, bptVar);
    }
}

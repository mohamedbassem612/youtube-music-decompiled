package defpackage;

import internal.org.jni_zero.JniZero;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aih implements aif, aia {
    private final /* synthetic */ aia a;
    private final awou b;

    public aih(aia aiaVar, awou awouVar) {
        this.a = aiaVar;
        this.b = awouVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aif
    public final Object a(Function0 function0, awoq awoqVar) throws Throwable {
        aig aigVar;
        if (awoqVar instanceof aig) {
            aigVar = (aig) awoqVar;
            int i = aigVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aigVar.d = i - Integer.MIN_VALUE;
            } else {
                aigVar = new aig(this, awoqVar);
            }
        } else {
            aigVar = new aig(this, awoqVar);
        }
        Object obj = aigVar.b;
        awox awoxVar = awox.a;
        int i2 = aigVar.d;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                aigVar.a = function0;
                aigVar.d = 1;
                awud awudVar = new awud(JniZero.q(aigVar), 1);
                awudVar.w();
                function0 = function0;
                if (awudVar.j() == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = aigVar.a;
                atqp.j(obj);
                function0 = obj2;
            }
            throw new awmh();
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    @Override // defpackage.awut
    public final awou b() {
        return this.b;
    }

    @Override // defpackage.aia, defpackage.ais
    public final Object e() {
        return this.a.e();
    }

    @Override // defpackage.aia
    public final void f(Object obj) {
        this.a.f(obj);
    }
}

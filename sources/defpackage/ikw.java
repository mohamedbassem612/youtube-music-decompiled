package defpackage;

import app.rive.core.StateMachineHandle;
import internal.org.jni_zero.JniZero;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ikw implements awzd {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public ikw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Type inference failed for: r7v1, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v21, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [awzd, java.lang.Object] */
    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) throws Throwable {
        Object objEmit;
        egl eglVar;
        Object objEmit2;
        awmy awmyVar;
        switch (this.$cid) {
            case 0:
                if (((ild) obj).c.length() > 0 && (objEmit = this.a.emit(obj, awoqVar)) == awox.a) {
                    return objEmit;
                }
                return awmy.a;
            case 1:
                if (awoqVar instanceof egl) {
                    eglVar = (egl) awoqVar;
                    int i = eglVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        eglVar.b = i - Integer.MIN_VALUE;
                    } else {
                        eglVar = new egl(this, awoqVar);
                    }
                } else {
                    eglVar = new egl(this, awoqVar);
                }
                Object obj2 = eglVar.a;
                awox awoxVar = awox.a;
                int i2 = eglVar.b;
                if (i2 == 0) {
                    atqp.j(obj2);
                    ?? r7 = this.a;
                    if (obj instanceof eci) {
                        eglVar.c = null;
                        eglVar.d = null;
                        eglVar.e = null;
                        eglVar.f = null;
                        eglVar.b = 1;
                        if (r7.emit(obj, eglVar) == awoxVar) {
                            return awoxVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = eglVar.f;
                    Object obj4 = eglVar.e;
                    Object obj5 = eglVar.d;
                    Object obj6 = eglVar.c;
                    atqp.j(obj2);
                }
                return awmy.a;
            case 2:
                Object objEmit3 = this.a.emit(new ybq((String) obj), awoqVar);
                return objEmit3 != awox.a ? awmy.a : objEmit3;
            case 3:
                return (((Boolean) obj).booleanValue() && (objEmit2 = this.a.emit(obj, awoqVar)) == awox.a) ? objEmit2 : awmy.a;
            case 4:
                ((Boolean) obj).booleanValue();
                ?? r8 = this.a;
                awmyVar = awmy.a;
                Object objEmit4 = r8.emit(awmyVar, awoqVar);
                if (objEmit4 == awox.a) {
                    return objEmit4;
                }
                return awmyVar;
            case 5:
                ((StateMachineHandle) obj).m570unboximpl();
                ?? r9 = this.a;
                awmyVar = awmy.a;
                Object objEmit5 = r9.emit(awmyVar, awoqVar);
                if (objEmit5 == awox.a) {
                    return objEmit5;
                }
                return awmyVar;
            case 6:
                ((avgj) this.a).a.invoke(obj);
                return awmy.a;
            default:
                Object obj7 = this.a;
                axel axelVar = (axel) obj7;
                axelVar.c.kk(obj);
                AtomicLongFieldUpdater atomicLongFieldUpdater = awtq.a;
                awtq awtqVar = axelVar.f;
                long jDecrementAndGet = atomicLongFieldUpdater.decrementAndGet(awtqVar);
                awro awroVar = awtqVar.c;
                if (jDecrementAndGet > 0) {
                    awro.A(((awtt) obj7).a);
                    return awmy.a;
                }
                awud awudVar = new awud(JniZero.q(awoqVar), 1);
                awudVar.w();
                axelVar.g.c(awudVar);
                Object objJ = awudVar.j();
                if (objJ != awox.a) {
                    return awmy.a;
                }
                awoqVar.getClass();
                return objJ;
        }
    }
}

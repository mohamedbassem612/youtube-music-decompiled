package defpackage;

import internal.org.jni_zero.JniZero;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bga extends awpk implements awqg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Object d;
    final /* synthetic */ bft e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bga(bft bftVar, Object obj, awoq awoqVar) {
        super(1, awoqVar);
        this.e = bftVar;
        this.d = obj;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new bga(this.e, this.d, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((bga) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Exception {
        ?? r1;
        Throwable th;
        Object obj2;
        awox awoxVar = awox.a;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                r1 = this.a;
                try {
                    atqp.j(obj);
                    r1 = r1;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        JniZero.l(r1, th);
                        throw th3;
                    }
                }
            } else {
                atqp.j(obj);
                bft bftVar = this.e;
                FileOutputStream fileOutputStream = new FileOutputStream(bftVar.a);
                Object obj3 = this.d;
                try {
                    bgh bghVar = bftVar.b;
                    bgo bgoVar = new bgo(fileOutputStream);
                    this.a = fileOutputStream;
                    this.b = fileOutputStream;
                    this.c = 1;
                    if (bghVar.c(obj3, bgoVar) == awoxVar) {
                        return awoxVar;
                    }
                    obj2 = fileOutputStream;
                    r1 = obj2;
                } catch (Throwable th4) {
                    r1 = fileOutputStream;
                    th = th4;
                    throw th;
                }
            }
            ((FileOutputStream) obj2).getFD().sync();
            JniZero.l(r1, null);
            return awmy.a;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw acq.c(this.e.a.getParent(), e);
            }
            throw e;
        }
    }
}

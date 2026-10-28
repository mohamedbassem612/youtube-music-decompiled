package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vyw extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ zwa c;
    final /* synthetic */ abxv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyw(abxv abxvVar, zwa zwaVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = abxvVar;
        this.c = zwaVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new vyw(this.d, this.c, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((vyw) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4, types: [awmd, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        ?? r6;
        awox awoxVar = awox.a;
        if (this.b != 0) {
            r6 = this.a;
            try {
                atqp.j(obj);
                r6 = r6;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    JniZero.l(r6, th);
                    throw th3;
                }
            }
        } else {
            atqp.j(obj);
            abxv abxvVar = this.d;
            zwa zwaVar = this.c;
            if (getContext().get(afwr.a) == null) {
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            afun afunVarD = ((afvq) abxvVar.a).d("AccountConfigRestore", 69);
            try {
                ListenableFuture listenableFutureI = ((hed) abxvVar.d.io()).I(zwaVar);
                this.a = afunVarD;
                this.b = 1;
                obj = awrc.ad(listenableFutureI, this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
                r6 = afunVarD;
            } catch (Throwable th4) {
                th = th4;
                r6 = afunVarD;
                throw th;
            }
        }
        Optional optional = (Optional) obj;
        hkp hkpVar = new hkp(new bfu(15), 11);
        if (true == optional.isPresent()) {
            hkpVar.a.invoke(optional.get());
        }
        JniZero.l(r6, null);
        return awmy.a;
    }
}

package defpackage;

import internal.org.jni_zero.JniZero;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awta implements awsx {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public awta(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.awsx
    public final Iterator a() {
        int i = this.$cid;
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return new awtf(this.a);
        }
        awsy awsyVar = new awsy();
        awsyVar.a = JniZero.p(this.a, awsyVar, awsyVar);
        return awsyVar;
    }
}

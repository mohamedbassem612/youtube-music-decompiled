package defpackage;

import com.facebook.yoga.YogaNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwk {
    public long a;

    public fwk() {
        long jJni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        if (jJni_YGConfigNewJNI == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.a = jJni_YGConfigNewJNI;
    }

    protected final void finalize() throws Throwable {
        try {
            long j = this.a;
            if (j != 0) {
                this.a = 0L;
                YogaNative.jni_YGConfigFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}

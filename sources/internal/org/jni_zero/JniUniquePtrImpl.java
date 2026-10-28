package internal.org.jni_zero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class JniUniquePtrImpl implements JniPtrInner {
    private final long a;

    JniUniquePtrImpl(long j, long j2) {
        this.a = j;
    }

    @Override // internal.org.jni_zero.JniPtrInner
    public final long a() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Safe JNI Pointer violation: Attempted to access a JniUniquePtr after it was destroyed.");
    }
}

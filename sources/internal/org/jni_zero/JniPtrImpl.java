package internal.org.jni_zero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class JniPtrImpl implements JniPtrInner {
    private long a;

    JniPtrImpl(long j) {
        if (j == 0) {
            throw new IllegalArgumentException("JNI Zero internal error: if the pointer is 0, it should be converted to null");
        }
        this.a = j;
    }

    @Override // internal.org.jni_zero.JniPtrInner
    public final long a() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Safe JNI Pointer violation: Attempted to access a JniPtr after it was released.");
    }

    final void release() {
        this.a = 0L;
    }
}

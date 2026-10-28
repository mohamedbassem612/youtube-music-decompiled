package internal.org.jni_zero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class JniRawPtrImpl implements JniPtrInner {
    final long a;

    JniRawPtrImpl(long j) {
        this.a = j;
    }

    @Override // internal.org.jni_zero.JniPtrInner
    public final long a() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Safe JNI Pointer violation: Attempted to use a JniRawPtr after it has already been released.");
    }
}

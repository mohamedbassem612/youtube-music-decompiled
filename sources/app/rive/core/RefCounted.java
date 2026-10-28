package app.rive.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface RefCounted {

    /* JADX INFO: renamed from: app.rive.core.RefCounted$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void release$default(RefCounted refCounted, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: release");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            refCounted.release(str, str2);
        }
    }

    void acquire(String str);

    int getRefCount();

    boolean isDisposed();

    void release(String str, String str2);
}

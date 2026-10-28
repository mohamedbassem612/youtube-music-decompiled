package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agvq implements agvo {
    private static final int c(StackTraceElement[] stackTraceElementArr, Class cls, int i) {
        String name = cls.getName();
        boolean z = false;
        while (i < stackTraceElementArr.length) {
            if (stackTraceElementArr[i].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // defpackage.agvo
    public final StackTraceElement a(Class cls, int i) {
        aguu.f((i ^ (-1)) >>> 31, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iC = c(stackTrace, cls, i + 1);
        if (iC != -1) {
            return stackTrace[iC];
        }
        return null;
    }

    @Override // defpackage.agvo
    public final StackTraceElement[] b(Class cls, int i, int i2) {
        aguu.f(i == -1 || i > 0, "maxDepth must be > 0 or -1");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iC = c(stackTrace, cls, i2 + 1);
        if (iC == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - iC;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, iC, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}

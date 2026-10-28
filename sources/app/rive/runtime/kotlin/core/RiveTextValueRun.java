package app.rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class RiveTextValueRun extends NativeObject {
    public static final int $stable = 8;
    private final ReentrantLock fileLock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextValueRun(long j, ReentrantLock reentrantLock) {
        super(j);
        reentrantLock.getClass();
        this.fileLock = reentrantLock;
    }

    private final native void cppSetText(long j, String str);

    private final native String cppText(long j);

    public final String getText() {
        String strCppText;
        synchronized (this.fileLock) {
            strCppText = cppText(getCppPointer());
        }
        return strCppText;
    }

    public final void setText(String str) {
        str.getClass();
        synchronized (this.fileLock) {
            cppSetText(getCppPointer(), str);
        }
    }

    public String toString() {
        return "TextValueRun: " + getText() + '\n';
    }
}

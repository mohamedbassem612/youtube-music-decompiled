package app.rive.runtime.kotlin.core;

import defpackage.awqg;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelInstanceKt {
    private static final Object fileLockUpdateTieLock = new Object();

    private static final Object updateFileLockWithRetry(Function0 function0, ReentrantLock reentrantLock, awqg awqgVar, Function0 function1) {
        Object objInvoke;
        boolean z;
        do {
            ReentrantLock reentrantLock2 = (ReentrantLock) function0.invoke();
            objInvoke = null;
            if (reentrantLock2 == reentrantLock) {
                break;
            }
            z = true;
            if (reentrantLock2 == reentrantLock) {
                synchronized (reentrantLock2) {
                    if (function0.invoke() == reentrantLock2) {
                        awqgVar.invoke(reentrantLock);
                        objInvoke = function1.invoke();
                    } else {
                        z = false;
                    }
                }
            } else {
                int iIdentityHashCode = System.identityHashCode(reentrantLock2);
                int iIdentityHashCode2 = System.identityHashCode(reentrantLock);
                if (iIdentityHashCode < iIdentityHashCode2) {
                    synchronized (reentrantLock2) {
                        synchronized (reentrantLock) {
                            if (function0.invoke() == reentrantLock2) {
                                awqgVar.invoke(reentrantLock);
                                objInvoke = function1.invoke();
                            } else {
                                z = false;
                            }
                        }
                    }
                } else if (iIdentityHashCode > iIdentityHashCode2) {
                    synchronized (reentrantLock) {
                        synchronized (reentrantLock2) {
                            if (function0.invoke() == reentrantLock2) {
                                awqgVar.invoke(reentrantLock);
                                objInvoke = function1.invoke();
                            } else {
                                z = false;
                            }
                        }
                    }
                } else {
                    synchronized (fileLockUpdateTieLock) {
                        synchronized (reentrantLock2) {
                            synchronized (reentrantLock) {
                                if (function0.invoke() == reentrantLock2) {
                                    awqgVar.invoke(reentrantLock);
                                    objInvoke = function1.invoke();
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                }
            }
        } while (!z);
        return objInvoke;
    }

    private static final Object withCurrentFileLock(Function0 function0, Function0 function1) {
        while (true) {
            ReentrantLock reentrantLock = (ReentrantLock) function0.invoke();
            synchronized (reentrantLock) {
                if (function0.invoke() == reentrantLock) {
                    return function1.invoke();
                }
            }
        }
    }

    private static final void withFileLocksInOrder(ReentrantLock reentrantLock, ReentrantLock reentrantLock2, Function0 function0) {
        if (reentrantLock == reentrantLock2) {
            synchronized (reentrantLock) {
                function0.invoke();
            }
            return;
        }
        int iIdentityHashCode = System.identityHashCode(reentrantLock);
        int iIdentityHashCode2 = System.identityHashCode(reentrantLock2);
        if (iIdentityHashCode < iIdentityHashCode2) {
            synchronized (reentrantLock) {
                synchronized (reentrantLock2) {
                    function0.invoke();
                }
            }
        } else if (iIdentityHashCode > iIdentityHashCode2) {
            synchronized (reentrantLock2) {
                synchronized (reentrantLock) {
                    function0.invoke();
                }
            }
        } else {
            synchronized (fileLockUpdateTieLock) {
                synchronized (reentrantLock) {
                    synchronized (reentrantLock2) {
                        function0.invoke();
                    }
                }
            }
        }
    }
}

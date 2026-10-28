package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awyc {
    public static final awyj a = new awyj(-1, null, null, 0);
    public static final int b = awrc.Z("kotlinx.coroutines.bufferedChannel.segmentSize", 32, Alert.DURATION_SHOW_INDEFINITELY);
    public static final int c = awrc.Z("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, Alert.DURATION_SHOW_INDEFINITELY);
    public static final axdy d = new axdy("BUFFERED");
    public static final axdy e = new axdy("SHOULD_BUFFER");
    public static final axdy f = new axdy("S_RESUMING_BY_RCV");
    public static final axdy g = new axdy("RESUMING_BY_EB");
    public static final axdy h = new axdy("POISONED");
    public static final axdy i = new axdy("DONE_RCV");
    public static final axdy j = new axdy("INTERRUPTED_SEND");
    public static final axdy k = new axdy("INTERRUPTED_RCV");
    public static final axdy l = new axdy("CHANNEL_CLOSED");
    public static final axdy m = new axdy("SUSPEND");
    public static final axdy n = new axdy("SUSPEND_NO_WAITER");
    public static final axdy o = new axdy("FAILED");
    public static final axdy p = new axdy("NO_RECEIVE_RESULT");
    public static final axdy q = new axdy("CLOSE_HANDLER_CLOSED");
    public static final axdy r = new axdy("CLOSE_HANDLER_INVOKED");
    public static final axdy s = new axdy("NO_CLOSE_CAUSE");

    public static final long a(long j2, int i2) {
        return (((long) i2) << 60) + j2;
    }

    public static final boolean b(awuc awucVar, Object obj) {
        Object objI = awucVar.i(obj, null);
        if (objI == null) {
            return false;
        }
        awucVar.a(objI);
        return true;
    }
}

package defpackage;

import androidx.car.app.model.Alert;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agjv {
    static int f(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        return iHighestOneBit < 0 ? Alert.DURATION_SHOW_INDEFINITELY : iHighestOneBit;
    }

    public abstract void c(Object obj);

    public void e(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }
}

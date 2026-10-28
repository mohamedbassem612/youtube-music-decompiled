package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.Iterator$-EL, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Iterator$EL {
    public static void forEachRemaining(Iterator it, Consumer consumer) {
        if (it instanceof v) {
            ((v) it).forEachRemaining(consumer);
            return;
        }
        consumer.getClass();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}

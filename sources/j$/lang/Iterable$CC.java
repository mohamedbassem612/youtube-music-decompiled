package j$.lang;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.lang.Iterable$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Iterable$CC {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        consumer.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}

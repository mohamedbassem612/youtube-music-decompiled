package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class afnh implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ afnh(int i, List list, List list2, int i2) {
        this.$cid = i2;
        this.a = i;
        this.c = list;
        this.b = list2;
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.Closeable, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        if (this.$cid != 0) {
            int i = this.a;
            ArrayList arrayList = new ArrayList(i);
            abgb abgbVar = new abgb((List) arrayList);
            for (int i2 = 0; i2 < i; i2++) {
                ((adwp) this.c.get(i2)).e(this.b.get(i2), abgbVar);
            }
            awcy awcyVar = new awcy(arrayList);
            avnn avnnVar = atqp.l;
            return awcyVar;
        }
        int i3 = this.a;
        Object obj = this.c;
        ?? r9 = this.b;
        try {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((afnj) obj).j.entrySet()) {
                map.put(entry.getKey(), ((awmd) entry.getValue()).io());
            }
            for (Map.Entry entry2 : map.entrySet()) {
                afne afneVar = (afne) entry2.getValue();
                Object obj2 = ((aupo) ((afnj) obj).c).b;
                obj2.getClass();
                Iterable iterable = (Iterable) obj2;
                ArrayList arrayList2 = new ArrayList(atqq.N(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new afni((afmz) it.next(), 1));
                }
                agkz agkzVarN = agkz.n(arrayList2);
                agkzVarN.getClass();
                ((afnj) obj).l.h(new ojf(afneVar, 16), agkzVarN);
            }
            ((RandomAccessFile) r9).writeInt(i3);
            ((RandomAccessFile) r9).seek(0L);
            r9.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    r9.close();
                } catch (Throwable th3) {
                    avkz.d(th, th3);
                }
                throw th2;
            }
        }
    }

    public /* synthetic */ afnh(RandomAccessFile randomAccessFile, afnj afnjVar, int i, int i2) {
        this.$cid = i2;
        this.b = randomAccessFile;
        this.c = afnjVar;
        this.a = i;
    }
}

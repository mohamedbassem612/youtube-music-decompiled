package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeqc {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;

    public aeqc(aksa aksaVar, long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.b = atomicLong;
        this.d = aksaVar;
        this.a = j;
        this.c = Pattern.compile(".*" + aksaVar.b + ".*", 32);
        atomicLong.set(0L);
    }

    public final long a() {
        Object obj = this.b;
        Long lC = obj != null ? ((ywx) obj).c("Sequence-Number") : null;
        if (lC != null) {
            return lC.longValue();
        }
        return 0L;
    }

    public aeqc(int[] iArr, long[] jArr, int[] iArr2, long j) {
        this.b = iArr;
        this.c = jArr;
        this.d = iArr2;
        this.a = j;
    }

    public aeqc(acbg acbgVar) {
        this.b = acbgVar.c;
        this.d = acbgVar.a;
        this.c = acbgVar.d;
        Long l = acbgVar.b;
        this.a = l != null ? l.longValue() : 0L;
    }

    public aeqc(ListenableFuture listenableFuture, long j, String str, ListenableFuture listenableFuture2) {
        this.c = listenableFuture;
        this.a = j;
        this.d = str;
        this.b = listenableFuture2;
    }
}

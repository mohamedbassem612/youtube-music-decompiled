package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.time.Duration;
import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahtp implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ahtp(Context context, ScheduledExecutorService scheduledExecutorService, ahtf ahtfVar, ahnr ahnrVar, FirebaseMessaging firebaseMessaging, ahrw ahrwVar, int i) {
        this.$cid = i;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = ahtfVar;
        this.d = ahnrVar;
        this.e = firebaseMessaging;
        this.f = ahrwVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ahrw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.$cid == 0) {
            ?? r5 = this.b;
            Object obj = this.a;
            int i = ahtq.d;
            Context context = (Context) obj;
            return new ahtq((ahtf) this.c, ahto.b(context, r5), new jij((ahnr) this.d, (FirebaseMessaging) this.e, (ahrw) this.f), context, r5);
        }
        Object objI = a.i(this.f);
        Boolean bool = Boolean.TRUE;
        boolean zEquals = Objects.equals(objI, bool);
        ?? r2 = this.d;
        Object obj2 = this.a;
        if (zEquals || Objects.equals(a.i(this.e), bool)) {
            Object obj3 = this.b;
            r2.s();
            ((Duration) obj3).toMillis();
            int i2 = ((tnm) obj2).d;
        }
        if ((r2 instanceof zyn) && Objects.equals(a.i(this.c), bool)) {
            for (String str : r2.u((tnm) obj2)) {
            }
        }
        return null;
    }

    public /* synthetic */ ahtp(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, tns tnsVar, Duration duration, tnm tnmVar, ListenableFuture listenableFuture3, int i) {
        this.$cid = i;
        this.f = listenableFuture;
        this.e = listenableFuture2;
        this.d = tnsVar;
        this.b = duration;
        this.a = tnmVar;
        this.c = listenableFuture3;
    }
}

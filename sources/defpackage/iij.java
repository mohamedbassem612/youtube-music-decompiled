package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iij implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ListenableFuture a;
    public final /* synthetic */ ListenableFuture b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ iij(Object obj, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, Context context, int i, Bundle bundle, int i2, int i3) {
        this.$cid = i3;
        this.g = obj;
        this.a = listenableFuture;
        this.b = listenableFuture2;
        this.c = context;
        this.d = i;
        this.e = bundle;
        this.f = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.$cid;
        int i2 = this.f;
        if (i != 0) {
            Bundle bundle = this.e;
            int i3 = this.d;
            Context context = this.c;
            ListenableFuture listenableFuture = this.b;
            ((ihy) this.g).g(this.a, listenableFuture, context, i3, bundle, i2);
        } else {
            Bundle bundle2 = this.e;
            int i4 = this.d;
            Context context2 = this.c;
            ListenableFuture listenableFuture2 = this.b;
            ((iim) this.g).j(this.a, listenableFuture2, context2, i4, bundle2, i2);
        }
        return null;
    }
}

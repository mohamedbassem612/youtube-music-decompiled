package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qms {
    public final Context a;
    public final agfr b;
    public final agfr c;
    public final agfr d;
    public volatile int e = 0;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final Object g = new Object();
    public volatile ListenableFuture h = null;

    public qms(Context context, agfr agfrVar, agfr agfrVar2, agfr agfrVar3) {
        this.a = context;
        this.b = agfrVar;
        this.c = agfrVar2;
        this.d = agfrVar3;
    }
}

package defpackage;

import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uhy {
    public View a;
    private final ahey b;

    public uhy(ahey aheyVar) {
        ListenableFuture listenableFuture = aher.a;
        this.b = aheyVar;
        new CopyOnWriteArraySet();
    }

    public final synchronized void a() {
        ListenableFuture listenableFuture = aher.a;
        this.b.execute(afwl.i(new szq(this, 18)));
    }
}

package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rvp {
    public boolean a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public rvp(esw eswVar, esu esuVar) {
        this.d = eswVar;
        this.c = esuVar;
        this.b = esuVar.c ? null : new boolean[eswVar.d];
    }

    public final void a() {
        ((esw) this.d).j(this, false);
    }

    public final void b() {
        if (this.a) {
            return;
        }
        try {
            a();
        } catch (IOException unused) {
        }
    }

    public rvp(rvr rvrVar, ListenableFuture listenableFuture, rvq rvqVar) {
        this.d = rvrVar;
        this.b = listenableFuture;
        this.c = rvqVar;
    }
}

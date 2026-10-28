package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, d = {sjh.class, shs.class, sju.class, sjs.class})
@Deprecated
public final class rwa extends rvo {
    private final Executor a;
    private final Executor b;
    private final smr c;
    private final aehs d;

    public rwa(rvr rvrVar, Executor executor, Executor executor2, aehs aehsVar, smr smrVar) {
        super(rvrVar);
        this.a = executor;
        this.b = executor2;
        this.d = aehsVar;
        this.c = smrVar;
    }

    public final sko a(smr smrVar, skm skmVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, String str, String str2, sgn sgnVar) {
        ajwo ajwoVar;
        Map map;
        try {
            ajwoVar = (ajwo) listenableFuture3.get();
            try {
                if (true == Objects.equals(ajwoVar, ajwo.a)) {
                    ajwoVar = null;
                }
            } catch (InterruptedException | CancellationException | ExecutionException unused) {
            }
        } catch (InterruptedException | CancellationException | ExecutionException unused2) {
        }
        try {
            map = (Map) listenableFuture4.get();
        } catch (InterruptedException | CancellationException | ExecutionException unused3) {
            map = null;
        }
        try {
            ajlj ajljVar = (ajlj) listenableFuture2.get();
            if (ajljVar != null) {
                return this.d.p(smrVar, str, skmVar, ajljVar, ajwoVar, map, str2, sgnVar);
            }
            try {
                List list = (List) listenableFuture.get();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                return this.d.q(smrVar, str, skmVar, list, ajwoVar, map, str2, sgnVar);
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.rvo
    public final void b() {
        smr smrVar = this.c;
        ListenableFuture listenableFuture = (ListenableFuture) smrVar.d(shs.class);
        ListenableFuture listenableFuture2 = (ListenableFuture) smrVar.d(shv.class);
        hco hcoVar = new hco(this, listenableFuture, listenableFuture2, 9, (byte[]) null);
        if (listenableFuture2.isDone() || listenableFuture.isDone()) {
            this.i.b(hcoVar);
        } else {
            this.i.a(hcoVar, this.a, this.b, null);
        }
    }
}

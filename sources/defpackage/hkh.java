package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hkh implements avlo {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hkh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.avlo
    public final void a(final avyd avydVar) {
        int i = this.$cid;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.a;
                ((hkl) obj).d.execute(afwl.i(new ihq(obj, avydVar, 1)));
                return;
            }
            tzd tzdVar = new tzd(avydVar, 2);
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            long j = afwl.a;
            afwj afwjVar = new afwj(afty.c(false), tzdVar, 0);
            ?? r7 = this.a;
            r7.addListener(new ahei(r7, afwjVar), executorDirectExecutor);
            avnr.i(avydVar, new avnp(new tzf(r7, 0)));
            return;
        }
        Object obj2 = this.a;
        agke agkeVar = agpi.a;
        final hkl hklVar = (hkl) obj2;
        aapw aapwVar = hklVar.s;
        ListenableFuture listenableFutureC = aapwVar.c(aapwVar.d(agkeVar), hklVar.n);
        hyl hylVar = new hyl(avydVar, i2);
        twi twiVar = new twi() { // from class: hkg
            @Override // defpackage.twi
            public final void a(Object obj3) {
                avyd avydVar2 = avydVar;
                dov dovVar = (dov) obj3;
                if (dovVar == null) {
                    avydVar2.a();
                    return;
                }
                wqe wqeVar = (wqe) dovVar.a;
                alrc alrcVar = wqeVar.a;
                if ((alrcVar.b & SemanticState.Multiline) != 0) {
                    hkl hklVar2 = hklVar;
                    ajwo ajwoVar = alrcVar.g;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    hklVar2.k.a(ajwoVar);
                }
                avydVar2.c(new hkk(wqeVar, true));
            }
        };
        Executor executor = taf.a;
        boc lifecycle = hklVar.m.getLifecycle();
        bob bobVar = bob.b;
        taq.d();
        tac tacVar = new tac(bobVar, lifecycle, twiVar, hylVar);
        Executor executor2 = taf.a;
        long j2 = afwl.a;
        listenableFutureC.addListener(new ahei(listenableFutureC, new afwj(afty.c(false), tacVar, 0)), executor2);
    }
}

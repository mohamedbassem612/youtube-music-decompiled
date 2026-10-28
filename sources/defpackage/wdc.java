package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wdc implements wda, zwg {
    public final Context a;
    public final wjr b;
    private final zwb d;
    private final Executor e;
    private final hhb h;
    private zwa f = null;
    private wdf g = null;
    private final wcy c = new wcy();

    public wdc(Context context, hhb hhbVar, tbt tbtVar, zwb zwbVar, Executor executor, wjr wjrVar) {
        this.a = context;
        this.h = hhbVar;
        this.e = executor;
        this.b = wjrVar;
        this.d = zwbVar;
        tbtVar.f(this);
    }

    private final synchronized wdf c() {
        wdf wdfVar;
        d();
        wdfVar = this.g;
        wdfVar.getClass();
        return wdfVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [agfr, java.lang.Object] */
    private final synchronized void d() {
        zwa zwaVarE = this.d.e();
        zwa zwaVar = this.f;
        if (zwaVar == null || !zik.cq(zwaVarE, zwaVar)) {
            wdf wdfVar = this.g;
            if (wdfVar != null) {
                zwa zwaVar2 = this.f;
                if (zwaVar2 != null && zwaVar2.m()) {
                    Context context = this.a;
                    try {
                        web webVar = wdfVar.c;
                        try {
                            ((omj) webVar.f.io()).S(new wdu(webVar, context, 1)).get();
                        } catch (InterruptedException | ExecutionException e) {
                            if (e instanceof InterruptedException) {
                                Thread.currentThread().interrupt();
                            }
                            throw wcm.a(e, -1, 5, 5);
                        }
                    } catch (wcm e2) {
                        wdfVar.v(e2);
                    }
                }
                wdfVar.f = true;
                ConcurrentHashMap concurrentHashMap = wdfVar.a;
                Iterator it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    ((wex) it.next()).kn();
                }
                concurrentHashMap.clear();
                ConcurrentHashMap concurrentHashMap2 = wdfVar.b;
                Iterator it2 = concurrentHashMap2.values().iterator();
                while (it2.hasNext()) {
                    ((wex) it2.next()).kn();
                }
                concurrentHashMap2.clear();
            }
            this.f = zwaVarE;
            hhb hhbVar = this.h;
            zwaVarE.getClass();
            this.g = hhbVar.j(zwaVarE);
        }
    }

    @Override // defpackage.zwg
    public final void a(zwa zwaVar) {
        this.e.execute(afwl.i(new uqd(this, zwaVar, 16)));
    }

    @Override // defpackage.wco
    public final synchronized wcn b(zwa zwaVar) {
        wcn wcnVarC;
        wcnVarC = c();
        zwa zwaVar2 = this.f;
        zwaVar2.getClass();
        if (!zik.cq(zwaVar2, zwaVar)) {
            wcnVarC = this.c;
        }
        return wcnVarC;
    }

    @Override // defpackage.wel
    public final /* bridge */ /* synthetic */ wek e(zwa zwaVar) {
        throw null;
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        d();
    }
}

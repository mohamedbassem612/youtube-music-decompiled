package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hut implements wnf {
    public final Context a;
    private final wom b;
    private final aunn c;
    private final Executor d;
    private final xit e;
    private final vxz f;

    public hut(wom womVar, vxz vxzVar, aunn aunnVar, Context context, Executor executor, xit xitVar) {
        womVar.getClass();
        vxzVar.getClass();
        aunnVar.getClass();
        context.getClass();
        executor.getClass();
        xitVar.getClass();
        this.b = womVar;
        this.f = vxzVar;
        this.c = aunnVar;
        this.a = context;
        this.d = executor;
        this.e = xitVar;
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        wluVar.getClass();
        wneVar.getClass();
        String str = ((woo) wluVar).i;
        if (!TextUtils.equals(str, "MUSIC_HOME_CLIENT_AWARE_CONTINUATION_TOKEN_INSERT_DOWNLOADS_SHELF")) {
            throw new IllegalArgumentException("Unsupported offline home continuation: ".concat(String.valueOf(str)));
        }
        xir xirVarO = this.e.o(357);
        xirVarO.k();
        xirVarO.f(tau.BROWSE_REQUEST_SENT);
        if (this.f.l(26, 45737049L, false)) {
            taf.i(((gmj) this.c.io()).a(), this.d, new gtq(zzaVar, 20), new gsu(zzaVar, this, xirVarO, 18), null);
            return;
        }
        aihf aihfVarCreateBuilder = apoq.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihf aihfVarCreateBuilder2 = apok.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        acfz.be(aihfVarCreateBuilder2);
        aihf aihfVarCreateBuilder3 = apoj.a.createBuilder();
        aihfVarCreateBuilder3.getClass();
        aihf aihfVarCreateBuilder4 = ambj.a.createBuilder();
        aihfVarCreateBuilder4.getClass();
        afyd.y(aihfVarCreateBuilder4);
        aihf aihfVarCreateBuilder5 = apox.a.createBuilder();
        aihfVarCreateBuilder5.getClass();
        aihf aihfVarCreateBuilder6 = anto.a.createBuilder();
        aihfVarCreateBuilder6.getClass();
        aihfVarCreateBuilder6.copyOnWrite();
        anto antoVar = (anto) aihfVarCreateBuilder6.instance;
        antoVar.b |= 2;
        antoVar.d = 0;
        aihfVarCreateBuilder6.copyOnWrite();
        anto antoVar2 = (anto) aihfVarCreateBuilder6.instance;
        antoVar2.b |= 4;
        antoVar2.e = 10;
        aihfVarCreateBuilder6.copyOnWrite();
        anto antoVar3 = (anto) aihfVarCreateBuilder6.instance;
        antoVar3.c = 1;
        antoVar3.b |= 1;
        aihn aihnVarBuild = aihfVarCreateBuilder6.build();
        aihnVarBuild.getClass();
        aihfVarCreateBuilder5.copyOnWrite();
        apox apoxVar = (apox) aihfVarCreateBuilder5.instance;
        apoxVar.bT = (anto) aihnVarBuild;
        apoxVar.f |= 16384;
        aihfVarCreateBuilder4.bv(acfz.ba(aihfVarCreateBuilder5));
        aihf aihfVarCreateBuilder7 = ambd.a.createBuilder();
        aihfVarCreateBuilder7.getClass();
        afyd.A(aihfVarCreateBuilder7);
        afyd.x(afyd.z(aihfVarCreateBuilder7), aihfVarCreateBuilder4);
        acfz.bh(afyd.w(aihfVarCreateBuilder4), aihfVarCreateBuilder3);
        aihfVarCreateBuilder2.cg(acfz.bg(aihfVarCreateBuilder3));
        acfz.bc(acfz.bd(aihfVarCreateBuilder2), aihfVarCreateBuilder);
        hus husVar = new hus(acfz.bb(aihfVarCreateBuilder));
        xirVarO.f(tau.BROWSE_RESPONSE_RECEIVED);
        zzaVar.a(husVar);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final woo a(acjx acjxVar) {
        acjxVar.getClass();
        if (!TextUtils.equals(acjxVar.c(), "MUSIC_HOME_CLIENT_AWARE_CONTINUATION_TOKEN_INSERT_DOWNLOADS_SHELF")) {
            throw new IllegalArgumentException("Unsupported offline home continuation: ".concat(String.valueOf(acjxVar.c())));
        }
        woo wooVarA = this.b.a(acjxVar);
        wooVarA.r(acjxVar.c());
        wooVarA.m();
        return wooVarA;
    }
}

package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wuo extends wnn implements wnf {
    public final wum c;
    private final wup d;
    private final vyo e;
    private final agfr f;

    public wuo(abxv abxvVar, agev agevVar, awmd awmdVar, awmd awmdVar2, wup wupVar, wum wumVar, vyo vyoVar, tqj tqjVar) {
        wkw wkwVar;
        int i = tqr.a;
        int i2 = 4;
        if (tqjVar.k(1073828824)) {
            awmdVar2.getClass();
            wkwVar = new wkw(awmdVar2, i2);
        } else {
            awmdVar.getClass();
            wkwVar = new wkw(awmdVar, i2);
        }
        super(abxvVar, (tgg) agevVar.d(wkwVar));
        this.d = wupVar;
        this.c = wumVar;
        this.e = vyoVar;
        this.f = aguu.al(new wkw(tqjVar, 5));
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        this.c.k((wuq) wluVar, wneVar, zzaVar, h());
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    public final wgi g(wuq wuqVar) {
        wlt wltVarH = h();
        taq.c();
        zyz zyzVar = new zyz();
        wum wumVar = this.c;
        wumVar.e(wuqVar, zyzVar, wltVarH);
        MessageLite messageLite = (MessageLite) taf.b(zyzVar, new vxq(8));
        wumVar.l(messageLite);
        return (wgi) wumVar.h(messageLite);
    }

    public final wlt h() {
        ahfi ahfiVarC = wlt.c();
        int i = 5;
        ahfiVarC.a = new hyl(this.e, i);
        if (((Boolean) this.f.io()).booleanValue()) {
            ahfiVarC.i(new wix(i));
        }
        return ahfiVarC.g();
    }

    @Override // defpackage.wnf
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final wuq a(acjx acjxVar) {
        wuq wuqVarA = this.d.a(null);
        wuqVarA.q(acjxVar);
        return wuqVarA;
    }

    public final ListenableFuture j(wuq wuqVar, Executor executor) {
        wlt wltVarH = h();
        return this.c.g(wuqVar, wnn.a, executor, wltVarH);
    }
}

package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yer implements zin {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ vyo c;
    final /* synthetic */ Executor d;
    final /* synthetic */ awmd e;
    final /* synthetic */ ScheduledExecutorService f;
    final /* synthetic */ mbc g;
    final /* synthetic */ yqy h;
    final /* synthetic */ zjr i;
    final /* synthetic */ zeh j;
    final /* synthetic */ tgv k;
    final /* synthetic */ yup l;
    final /* synthetic */ zjx m;
    final /* synthetic */ ygn n;
    final /* synthetic */ ynu o;
    final /* synthetic */ zjx p;
    final /* synthetic */ tfq q;
    final /* synthetic */ abxv r;
    final /* synthetic */ wjr s;
    final /* synthetic */ hed t;
    final /* synthetic */ hed u;
    final /* synthetic */ wjr v;
    final /* synthetic */ hhb w;
    final /* synthetic */ zik x;

    public yer(Context context, String str, hed hedVar, vyo vyoVar, Executor executor, awmd awmdVar, ScheduledExecutorService scheduledExecutorService, mbc mbcVar, yqy yqyVar, tfq tfqVar, zjr zjrVar, zeh zehVar, tgv tgvVar, wjr wjrVar, wjr wjrVar2, hhb hhbVar, yup yupVar, zjx zjxVar, abxv abxvVar, hed hedVar2, ygn ygnVar, ynu ynuVar, zik zikVar, zjx zjxVar2) {
        this.a = context;
        this.b = str;
        this.u = hedVar;
        this.c = vyoVar;
        this.d = executor;
        this.e = awmdVar;
        this.f = scheduledExecutorService;
        this.g = mbcVar;
        this.h = yqyVar;
        this.q = tfqVar;
        this.i = zjrVar;
        this.j = zehVar;
        this.k = tgvVar;
        this.s = wjrVar;
        this.v = wjrVar2;
        this.w = hhbVar;
        this.l = yupVar;
        this.m = zjxVar;
        this.r = abxvVar;
        this.t = hedVar2;
        this.n = ygnVar;
        this.o = ynuVar;
        this.x = zikVar;
        this.p = zjxVar2;
    }

    @Override // defpackage.zin
    public final zio a(zim zimVar, int i) {
        yej yejVar = new yej();
        yejVar.a = this.a;
        yejVar.b = this.b;
        yejVar.w = this.u;
        yejVar.c = this.c;
        yejVar.d = this.d;
        yejVar.g = this.e;
        yejVar.j = this.f;
        yejVar.k = this.g;
        yejVar.l = this.h;
        yejVar.s = this.q;
        yejVar.r = i;
        yejVar.n = this.i;
        yejVar.o = this.j;
        yejVar.p = this.k;
        yejVar.u = this.s;
        yejVar.q = zimVar;
        yejVar.x = this.v;
        yejVar.y = this.w;
        int i2 = i - 1;
        if (i2 != 0 && i2 != 2) {
            yejVar.f = new bzg[]{this.p};
            return new yek(yejVar);
        }
        yejVar.e = new bzg[]{this.l.a};
        yejVar.f = new bzg[]{new yxw(zimVar.d, zimVar.j), this.m};
        yejVar.t = this.r;
        yejVar.v = this.t;
        if (i != 1) {
            yejVar.h = this.n;
            yejVar.i = this.o;
        }
        yejVar.z = this.x;
        yejVar.m = i == 3;
        return new yek(yejVar);
    }
}

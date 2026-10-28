package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gkw implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gkw(Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r6v6, types: [awmd, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            jan janVar = (jan) ((glb) this.b).e.io();
            int i2 = this.a;
            agke agkeVarQ = i2 == 1 ? agke.q(Uri.parse("https://youtubei.googleapis.com/generate_204")) : i2 == 2 ? agke.r(Uri.parse("https://youtubei.googleapis.com/generate_204"), Uri.parse("https://i.ytimg.com/generate_204")) : agpi.a;
            if (agkeVarQ.isEmpty()) {
                return;
            }
            aaok aaokVar = (aaok) janVar.b.io();
            int i3 = ((agpi) agkeVarQ).d;
            for (int i4 = 0; i4 < i3; i4++) {
                Uri uri = (Uri) agkeVarQ.get(i4);
                taq.c();
                ?? r5 = aaokVar.a;
                int i5 = tqr.a;
                if (r5.k(1073814456) || ((tfq) aaokVar.c.io()).h()) {
                    aaokVar.b.f().toEpochMilli();
                    zxu zxuVar = new zxu(aaokVar, uri.toString(), tnr.d, new xkj(3));
                    if (r5.k(72618)) {
                        zxuVar.B(tok.CONNECTION_PREWARMER);
                    }
                    zxuVar.f = false;
                    ((tgg) aaokVar.d.io()).b(zxuVar);
                }
            }
            return;
        }
        if (i == 1) {
            ((avr) this.b).a(this.a);
            return;
        }
        if (i == 2) {
            ((nh) this.b).jX(this.a);
            return;
        }
        aihf aihfVarCreateBuilder = aiqt.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aiqt aiqtVar = (aiqt) aihfVarCreateBuilder.instance;
        aiqtVar.c = 1;
        aiqtVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aiqt aiqtVar2 = (aiqt) aihfVarCreateBuilder.instance;
        aiqtVar2.d = this.a - 1;
        aiqtVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        aiqt aiqtVar3 = (aiqt) aihfVarCreateBuilder.instance;
        aiqtVar3.e = 2;
        aiqtVar3.b |= 4;
        aiqt aiqtVar4 = (aiqt) aihfVarCreateBuilder.build();
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aiqtVar4.getClass();
        alouVar.d = aiqtVar4;
        alouVar.c = 388;
        ((dov) ((syn) this.b).c).R((alou) alosVar.build());
    }
}

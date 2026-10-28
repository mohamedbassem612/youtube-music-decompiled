package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class spu implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public spu(Runnable runnable, ahey aheyVar, long j, TimeUnit timeUnit, int i) {
        this.$cid = i;
        this.b = runnable;
        this.c = aheyVar;
        this.a = j;
        this.d = timeUnit;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ahey, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            oml omlVar = ((spv) this.b).a;
            Object obj = this.d;
            omlVar.k((sko) this.c, this.a, (String) obj);
            return;
        }
        if (i == 1) {
            this.b.run();
            qnl.n(this.c.schedule(this, this.a, (TimeUnit) this.d));
            return;
        }
        Object obj2 = this.b;
        if (i == 2) {
            oml omlVar2 = ((spv) obj2).a;
            Object obj3 = this.d;
            omlVar2.k((sko) this.c, this.a, (String) obj3);
            return;
        }
        zcf zcfVar = (zcf) obj2;
        boolean z = zcfVar.P;
        Object obj4 = this.c;
        if (z) {
            ((ytp) ((yyv) obj4).C.io()).j();
        }
        long j = this.a;
        Object obj5 = this.d;
        ywn ywnVar = zcfVar.Z;
        StringBuilder sb = new StringBuilder("st.");
        sb.append(obj5);
        sb.append(";dur.");
        sb.append(j);
        yyv yyvVar = (yyv) obj4;
        if (!zcfVar.equals(yyvVar.h.m)) {
            ywnVar.w("spdi", sb.toString());
            return;
        }
        sb.append(";pos.");
        sb.append(yyvVar.e());
        sb.append(";buf_p.");
        sb.append(yyvVar.d());
        sb.append(";buf_d.");
        sb.append(Math.max(yyvVar.d() - yyvVar.e(), 0L));
        sb.append(";pwr.");
        sb.append(yyvVar.f.G() ? 1 : 0);
        sb.append(";sup.");
        sb.append(yyvVar.f.o());
        ywnVar.w("spdi", sb.toString());
    }

    public /* synthetic */ spu(spv spvVar, sko skoVar, long j, String str, int i) {
        this.$cid = i;
        this.b = spvVar;
        this.c = skoVar;
        this.a = j;
        this.d = str;
    }

    public /* synthetic */ spu(yyv yyvVar, zcf zcfVar, zgi zgiVar, long j, int i) {
        this.$cid = i;
        this.c = yyvVar;
        this.b = zcfVar;
        this.d = zgiVar;
        this.a = j;
    }
}

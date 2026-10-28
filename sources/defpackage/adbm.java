package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adbm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public adbm(aaok aaokVar, vca vcaVar, aepy aepyVar) {
        this.b = aaokVar;
        this.c = vcaVar;
        this.a = aepyVar;
    }

    public final boolean a() {
        return ((vxz) ((aaok) this.b).b).m(17, 45368201L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void b() {
        ?? r0 = this.c;
        if (r0 != 0) {
            r0.run();
            return;
        }
        ?? r1 = this.b;
        ((dsa) this.a).n();
        r1.run();
    }

    public adbm(acxx acxxVar, aczv aczvVar, acxd acxdVar) {
        this.a = aczvVar;
        this.c = acxdVar;
        this.b = acxxVar;
    }

    public /* synthetic */ adbm(Context context, awmd awmdVar, tsl tslVar) {
        this.b = context;
        this.a = awmdVar;
        this.c = tslVar;
    }

    public /* synthetic */ adbm(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ adbm(Runnable runnable, dsa dsaVar, Runnable runnable2) {
        this.c = runnable;
        this.a = dsaVar;
        this.b = runnable2;
    }
}

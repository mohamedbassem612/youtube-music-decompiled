package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahpr {
    static final /* synthetic */ awsj[] a = {new awrg(ahpr.class)};
    public final String b;
    public final ThreadLocal c;
    public final bec d;
    private final Context e;
    private final bha f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    public ahpr(Context context, String str) {
        bec becVar;
        context.getClass();
        this.e = context;
        this.b = str;
        this.c = new ThreadLocal();
        bgr bgrVar = new bgr(new rri(this, 12));
        rri rriVar = new rri(this, 13);
        awuq awuqVar = awvi.a;
        bha bhaVar = new bha(str, bgrVar, rriVar, awrc.K(axew.a.plus(new awxf(null))));
        this.f = bhaVar;
        int i = 0;
        a[0].getClass();
        bec becVar2 = bhaVar.f;
        if (becVar2 == null) {
            synchronized (bhaVar.e) {
                if (bhaVar.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    bgr bgrVar2 = bhaVar.b;
                    awqg awqgVar = bhaVar.c;
                    applicationContext.getClass();
                    ?? Invoke = awqgVar.invoke(applicationContext);
                    awut awutVar = bhaVar.d;
                    beb bebVar = new beb(new bfv(bhk.a, new py(new bgz(applicationContext, bhaVar, i), 9)), ((axcw) awutVar).a.get(awwd.d) == null ? ((axcw) awutVar).a.plus(new awwf(null)) : ((axcw) awutVar).a);
                    bebVar.a = bgrVar2;
                    bebVar.b(Invoke);
                    bhaVar.f = new bhh(new bhh(bebVar.a()));
                }
                becVar = bhaVar.f;
                becVar.getClass();
            }
            becVar2 = becVar;
        }
        this.d = becVar2;
    }

    public final void a(awqg awqgVar) {
    }
}

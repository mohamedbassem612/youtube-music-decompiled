package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adin implements tsz {
    public static final Object a = new Object();
    public static volatile erj b;
    public final Context c;
    public final Executor d;
    private final agfr e;
    private final awmd f;

    public adin(Context context, Executor executor, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        this.c = context.getApplicationContext();
        this.d = executor;
        this.e = aguu.al(new qlb(awmdVar2, awmdVar3, awmdVar, 5, null));
        this.f = awmdVar4;
    }

    public static void d(Context context) {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = erj.b(context);
                }
            }
        }
    }

    public final void a(Uri uri, sxu sxuVar, adhr adhrVar) {
        d(this.c);
        c(uri, sxuVar, adhrVar);
    }

    @Override // defpackage.tsz
    public final void b(Uri uri, sxu sxuVar) {
        throw null;
    }

    public final void c(Uri uri, sxu sxuVar, adhr adhrVar) {
        boolean z = true;
        if (!adhrVar.k && ((vxz) this.f.io()).l(85, 45459596L, false)) {
            z = false;
        }
        fec fecVar = new fec();
        if (z) {
            fecVar = (fec) fecVar.u();
        }
        sxuVar.getClass();
        Context context = this.c;
        if (context == null) {
            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        }
        esn esnVarF = erj.b(context).c.a(context).b().d((feb) this.e.io()).l(fecVar).f(uri);
        char[] cArr = ffs.a;
        if (a.x()) {
            esnVarF.q(new adil(sxuVar, uri));
        } else {
            this.d.execute(new adab(esnVarF, sxuVar, uri, 3));
        }
    }
}

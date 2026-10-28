package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eax extends bnz {
    private static final String g = dzf.a("WorkContinuationImpl");
    public final ebm a;
    public final String b;
    public final List c;
    public final List d;
    public boolean e;
    public final int f;
    private final List h;
    private dzk i;

    public eax(ebm ebmVar, String str, int i, List list) {
        super(null, null);
        this.a = ebmVar;
        this.b = str;
        this.f = i;
        this.c = list;
        this.d = new ArrayList(list.size());
        this.h = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == 1 && ((ees) ((ayq) list.get(i2)).c).u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strK = ((ayq) list.get(i2)).k();
            this.d.add(strK);
            this.h.add(strK);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final dzk j() {
        String str;
        if (this.e) {
            dzf.b();
            Log.w(g, "Already enqueued work ids (" + TextUtils.join(", ", this.d) + ')');
        } else {
            ebm ebmVar = this.a;
            azx azxVar = ebmVar.c.j;
            int i = this.f;
            if (i == 1) {
                str = "REPLACE";
            } else if (i != 2) {
                str = i != 3 ? "APPEND_OR_REPLACE" : "APPEND";
            } else {
                str = "KEEP";
            }
            this.i = bbl.f(azxVar, "EnqueueRunnable_".concat(str), ebmVar.k.a, new py(this, 18));
        }
        return this.i;
    }
}

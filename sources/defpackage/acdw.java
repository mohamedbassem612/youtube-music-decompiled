package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acdw {
    public final Context a;
    public final abmt b;
    public Uri c;
    private final Executor d;
    private final Executor e;
    private final awmd f;
    private final awmd g;
    private final awmd h;
    private final int i;
    private sxu j;
    private sxu k;

    public acdw(Context context, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, abmt abmtVar, Executor executor, Executor executor2) {
        this.a = context;
        this.f = awmdVar;
        this.g = awmdVar2;
        this.h = awmdVar3;
        this.b = abmtVar;
        this.d = executor;
        this.e = executor2;
        agrf agrfVar = twm.a;
        context.getClass();
        int i = context.getResources().getDisplayMetrics().heightPixels;
        context.getClass();
        this.i = Math.min(SemanticState.ReadOnly, Math.max(i, context.getResources().getDisplayMetrics().widthPixels));
    }

    public final sxu a() {
        if (this.k == null) {
            this.k = new sxx(this.e, new ablv(this, 3));
        }
        return this.k;
    }

    public final void b(Bitmap bitmap, Bitmap bitmap2) {
        taq.d();
        if (this.b.K()) {
            ((acdx) this.g.io()).h(bitmap, bitmap2);
        } else {
            ((acdq) this.f.io()).k(bitmap, bitmap2);
        }
    }

    public final void c(abuz abuzVar) {
        d(abuzVar, Optional.empty());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    public final void d(abuz abuzVar, Optional optional) {
        boolean z;
        int i = this.i;
        wgg wggVarI = abuzVar.i(i, (i * 9) / 16);
        Uri uriA = wggVarI == null ? null : wggVarI.a();
        vyo vyoVar = this.b.a;
        if (abmt.r(vyoVar).H) {
            z = true;
        } else {
            z = false;
            if (abmt.r(vyoVar).J && optional.isPresent() && !((Boolean) optional.get()).booleanValue()) {
                z = true;
            }
        }
        if (uriA == null || z) {
            b(null, null);
            return;
        }
        this.c = uriA;
        adhv adhvVar = (adhv) this.h.io();
        if (this.j == null) {
            this.j = new sxx(this.d, new ablv(this, 2));
        }
        sxu sxuVar = this.j;
        adhq adhqVarA = adhr.a();
        adhqVarA.b(true);
        adhvVar.l(uriA, sxuVar, adhqVarA.a());
    }
}

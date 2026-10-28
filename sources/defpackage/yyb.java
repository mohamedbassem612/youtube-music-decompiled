package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yyb {
    Runnable a;
    public final int b;
    private final yye c;
    private final Handler d;
    private boolean e;
    private final jui f;

    public yyb(yye yyeVar, Handler handler, jui juiVar) {
        this.c = yyeVar;
        this.d = handler;
        this.f = juiVar;
        this.b = yyeVar.d.eL();
        zhq zhqVar = zhq.ABR;
    }

    private final void e() {
        Runnable runnable = this.a;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.a = null;
        }
    }

    public final void a(ajvs ajvsVar) {
        jui juiVar = this.f;
        if (juiVar != null) {
            ((Handler) juiVar.b.io()).post(new jmi(juiVar, ajvsVar, 4));
        }
    }

    public final void b() {
        if (this.e) {
            d(this.b);
        }
    }

    public final void c(int i, ajvs ajvsVar) {
        if (i == 6) {
            if (this.b != 2) {
                zhq zhqVar = zhq.ABR;
                e();
                a(ajvsVar);
                return;
            }
            i = 6;
        }
        if (this.b == i) {
            this.e = false;
            if (this.a == null) {
                this.a = new yts(this, ajvsVar, 11);
                zjr zjrVar = this.c.d;
                if (zjrVar.A() <= 0) {
                    this.a.run();
                } else {
                    this.d.postDelayed(this.a, zjrVar.A());
                }
            }
        }
    }

    public final void d(int i) {
        if (this.b == i) {
            zhq zhqVar = zhq.ABR;
            this.e = true;
            e();
            jui juiVar = this.f;
            zkf.d(juiVar);
            ((Handler) juiVar.b.io()).post(new iqc(juiVar, 12));
        }
    }
}

package defpackage;

import android.R;
import android.content.res.Resources;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class tss {
    public final View a;
    public int b;
    public long c;
    public long d;
    private final afx e;
    private int f;
    private tuu g;

    public tss(View view, long j, tuu tuuVar) {
        view.getClass();
        this.a = view;
        this.e = new afx(0);
        g(tuuVar);
        this.d = j;
        this.c = j;
        this.f = 8;
        j(view.getVisibility() == 0, false);
    }

    private final void j(boolean z, boolean z2) {
        tuu tuuVar = this.g;
        View view = this.a;
        tuuVar.c(view);
        if (z2) {
            if ((z ? this.d : this.c) > 0) {
                int i = bac.a;
                if (view.isAttachedToWindow()) {
                    final int i2 = 0;
                    if (!z) {
                        long j = this.c;
                        view.setVisibility(0);
                        k(3);
                        this.g.a(view, j, new tut(this) { // from class: tti
                            public final /* synthetic */ tss a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.tut
                            public final void a() {
                                int i3 = i2;
                                tss tssVar = this.a;
                                if (i3 != 0) {
                                    tssVar.i();
                                } else {
                                    tssVar.e();
                                }
                            }
                        });
                        return;
                    }
                    long j2 = this.d;
                    view.setVisibility(0);
                    final int i3 = 1;
                    k(1);
                    this.g.b(view, j2, new tut(this) { // from class: tti
                        public final /* synthetic */ tss a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.tut
                        public final void a() {
                            int i4 = i3;
                            tss tssVar = this.a;
                            if (i4 != 0) {
                                tssVar.i();
                            } else {
                                tssVar.e();
                            }
                        }
                    });
                    return;
                }
            }
        }
        this.g.d();
        if (z) {
            i();
        } else {
            e();
        }
    }

    private final void k(int i) {
        if (i != this.b) {
            this.b = i;
            afx afxVar = new afx(this.e);
            for (int i2 = 0; i2 < afxVar.c; i2++) {
                ((tuv) afxVar.b(i2)).a(i, this);
            }
        }
    }

    public final boolean a() {
        int i = this.b;
        return i == 0 || i == 3;
    }

    public final boolean b() {
        int i = this.b;
        return i == 2 || i == 1;
    }

    public final boolean c() {
        int i = this.b;
        return i == 2 || i == 3;
    }

    public final void d(tuv tuvVar) {
        tuvVar.getClass();
        this.e.add(tuvVar);
    }

    public final void e() {
        this.a.setVisibility(this.f);
        k(0);
    }

    public final void f(tuv tuvVar) {
        this.e.remove(tuvVar);
    }

    public final void g(tuu tuuVar) {
        tuuVar.getClass();
        this.g = tuuVar;
    }

    public void h(boolean z, boolean z2) {
        if (z2 && z == b()) {
            return;
        }
        j(z, z2);
    }

    public final void i() {
        this.a.setVisibility(0);
        k(2);
    }

    public tss(View view, long j) {
        this(view, j, new tsu());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public tss(View view) {
        Resources resources = view.getResources();
        this(view, resources != null ? resources.getInteger(R.integer.config_mediumAnimTime) : 0);
    }
}

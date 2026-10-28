package defpackage;

import app.rive.semantics.SemanticState;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cwb implements cvi {
    private final int a;
    private final int b;
    private final String c;
    private int d;
    private int e;
    private cvk f;
    private cwj g;

    public cwb(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.f = cvkVar;
        cwj cwjVarS = cvkVar.s(SemanticState.ReadOnly, 4);
        this.g = cwjVarS;
        bsd bsdVar = new bsd();
        String str = this.c;
        bsdVar.a(str);
        bsdVar.e(str);
        cwjVarS.b(new bse(bsdVar));
        this.f.t();
        this.f.z(new cwc());
        this.e = 1;
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        int i = this.a;
        ahno.O((i == -1 || this.b == -1) ? false : true);
        int i2 = this.b;
        bwb bwbVar = new bwb(i2);
        ((cvb) cvjVar).n(bwbVar.b, 0, i2, false);
        return bwbVar.s() == i;
    }

    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) {
        int i = this.e;
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException();
            }
            return -1;
        }
        cwj cwjVar = this.g;
        cwjVar.getClass();
        int iA = cwjVar.a(cvjVar, SemanticState.ReadOnly, true);
        if (iA == -1) {
            this.e = 2;
            this.g.e(0L, 1, this.d, 0, null);
            this.d = 0;
        } else {
            this.d += iA;
        }
        return 0;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}

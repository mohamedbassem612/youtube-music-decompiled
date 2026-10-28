package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddq implements ddr {
    private final List a;
    private final cwj[] c;
    private boolean d;
    private int e;
    private int f;
    private final String b = "video/mp2t";
    private long g = -9223372036854775807L;

    public ddq(List list) {
        this.a = list;
        this.c = new cwj[list.size()];
    }

    private final boolean g(bwb bwbVar, int i) {
        if (bwbVar.d() == 0) {
            return false;
        }
        if (bwbVar.n() != i) {
            this.d = false;
        }
        this.e--;
        return this.d;
    }

    @Override // defpackage.ddr
    public final void a(bwb bwbVar) {
        if (this.d) {
            if (this.e != 2 || g(bwbVar, 32)) {
                if (this.e != 1 || g(bwbVar, 0)) {
                    int i = bwbVar.c;
                    int iD = bwbVar.d();
                    for (cwj cwjVar : this.c) {
                        bwbVar.P(i);
                        cwjVar.c(bwbVar, iD);
                    }
                    this.f += iD;
                }
            }
        }
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        int i = 0;
        while (true) {
            cwj[] cwjVarArr = this.c;
            if (i >= cwjVarArr.length) {
                return;
            }
            eol eolVar = (eol) this.a.get(i);
            devVar.c();
            cwj cwjVarS = cvkVar.s(devVar.a(), 3);
            bsd bsdVar = new bsd();
            bsdVar.a = devVar.b();
            bsdVar.a(this.b);
            bsdVar.e("application/dvbsubs");
            bsdVar.r = Collections.singletonList(eolVar.a);
            bsdVar.d = (String) eolVar.b;
            cwjVarS.b(new bse(bsdVar));
            cwjVarArr[i] = cwjVarS;
            i++;
        }
    }

    @Override // defpackage.ddr
    public final void d() {
        if (this.d) {
            ahno.O(this.g != -9223372036854775807L);
            for (cwj cwjVar : this.c) {
                cwjVar.e(this.g, 1, this.f, 0, null);
            }
            this.d = false;
        }
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        if ((i & 4) != 0) {
            this.d = true;
            this.g = j;
            this.f = 0;
            this.e = 2;
        }
    }

    @Override // defpackage.ddr
    public final void f() {
        this.d = false;
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void c() {
    }
}

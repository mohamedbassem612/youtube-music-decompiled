package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class zbb implements cwj {
    private cwj a = new cvf();
    public volatile IOException c;

    @Override // defpackage.cwj
    public final /* synthetic */ int a(brv brvVar, int i, boolean z) {
        return g(brvVar, i, z);
    }

    @Override // defpackage.cwj
    public final void b(bse bseVar) {
        this.a.b(bseVar);
    }

    @Override // defpackage.cwj
    public /* synthetic */ void c(bwb bwbVar, int i) {
        d(bwbVar, i, 0);
    }

    @Override // defpackage.cwj
    public final void d(bwb bwbVar, int i, int i2) {
        this.a.c(bwbVar, i);
    }

    @Override // defpackage.cwj
    public void e(long j, int i, int i2, int i3, cwi cwiVar) {
        this.a.e(j, i, i2, i3, cwiVar);
    }

    @Override // defpackage.cwj
    public final int g(brv brvVar, int i, boolean z) throws IOException {
        if (this.c == null) {
            return this.a.a(brvVar, i, z);
        }
        IOException iOException = this.c;
        this.c = null;
        throw iOException;
    }

    public final void h(cwj cwjVar) {
        this.a = cwjVar;
        this.c = null;
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void f() {
    }
}

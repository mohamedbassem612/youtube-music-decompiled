package defpackage;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class coe implements coo {
    public final int a;
    final /* synthetic */ cog b;
    private final boolean c;

    public coe(cog cogVar, int i, boolean z) {
        this.b = cogVar;
        this.a = i;
        this.c = z;
    }

    @Override // defpackage.coo
    public final int a() {
        return this.c ? 4 : 0;
    }

    @Override // defpackage.coo
    public final int b(ccu ccuVar, DecoderInputBuffer decoderInputBuffer, int i) {
        cog cogVar = this.b;
        cod codVar = cogVar.h;
        if (codVar.h()) {
            return -3;
        }
        int i2 = this.a;
        cogVar.v(i2);
        int iL = cogVar.k[i2].l(ccuVar, decoderInputBuffer, i, codVar.f());
        if (iL == -3) {
            cogVar.w(i2);
        }
        return iL;
    }

    @Override // defpackage.coo
    public final int c(long j) throws Throwable {
        cog cogVar = this.b;
        cod codVar = cogVar.h;
        if (codVar.h()) {
            return 0;
        }
        int i = this.a;
        cogVar.v(i);
        con conVar = cogVar.k[i];
        int iJ = conVar.j(j, codVar.f());
        conVar.A(iJ);
        if (iJ != 0) {
            return iJ;
        }
        cogVar.w(i);
        return 0;
    }

    @Override // defpackage.coo
    public final boolean f() {
        cog cogVar = this.b;
        cod codVar = cogVar.h;
        if (!codVar.h()) {
            if (cogVar.k[this.a].F(codVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.coo
    public final void gu() throws IOException {
        cog cogVar = this.b;
        cogVar.k[this.a].v();
        cogVar.x();
    }
}

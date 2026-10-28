package defpackage;

import app.rive.semantics.SemanticState;
import java.io.EOFException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvf implements cwj {
    private final byte[] a = new byte[SemanticState.Obscured];

    @Override // defpackage.cwj
    public final /* synthetic */ int a(brv brvVar, int i, boolean z) {
        return g(brvVar, i, z);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void c(bwb bwbVar, int i) {
        bwbVar.Q(i);
    }

    @Override // defpackage.cwj
    public final void d(bwb bwbVar, int i, int i2) {
        bwbVar.Q(i);
    }

    @Override // defpackage.cwj
    public final int g(brv brvVar, int i, boolean z) throws EOFException {
        int iA = brvVar.a(this.a, 0, Math.min(SemanticState.Obscured, i));
        if (iA != -1) {
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.cwj
    public final void b(bse bseVar) {
    }

    @Override // defpackage.cwj
    public final void e(long j, int i, int i2, int i3, cwi cwiVar) {
    }
}

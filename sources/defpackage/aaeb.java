package defpackage;

import java.io.IOException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaeb implements aafu {
    private final aadr a;
    private final aaea b;
    private final boolean c;

    public aaeb(aadr aadrVar, aaea aaeaVar, vxz vxzVar) {
        this.a = aadrVar;
        this.b = aaeaVar;
        this.c = vxzVar.l(142, 45632208L, false);
    }

    @Override // defpackage.aafu
    public final void a(String str, aamm aammVar) throws IOException {
        if (aammVar.i) {
            this.b.a(str, aammVar);
        }
    }

    @Override // defpackage.aafu
    public final void b(Set set, String str, boolean z) {
        if (z) {
            this.b.b(set, str, true);
        } else {
            this.a.b(set, str, false);
        }
    }

    @Override // defpackage.aafu
    public final boolean c(String str, int i) {
        return this.a.c(str, i) && this.b.c(str, i);
    }

    @Override // defpackage.aafu
    public final boolean d(aaml aamlVar) {
        return aamlVar.o ? this.b.d(aamlVar) : this.a.d(aamlVar);
    }

    @Override // defpackage.aafu
    public final boolean e(String str, int i, long j, boolean z) {
        return z ? this.b.e(str, i, j, true) : this.a.e(str, i, j, false);
    }

    @Override // defpackage.aafu
    public final boolean f(String str, int i, String str2) {
        return this.a.f(str, i, str2);
    }

    @Override // defpackage.aafu
    public final aamm g(String str, axmq axmqVar) {
        if (!this.c) {
            return this.a.g(str, null);
        }
        aamm aammVarG = this.b.g(str, null);
        return aammVarG != null ? aammVarG : this.a.g(str, null);
    }
}

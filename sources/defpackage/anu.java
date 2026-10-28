package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class anu extends anj implements ang, any, and {
    public boolean g;

    public int a(int i) {
        throw null;
    }

    public int b(int i) {
        throw null;
    }

    public int c(int i) {
        throw null;
    }

    public int d(int i) {
        throw null;
    }

    @Override // defpackage.ana
    public apj f() {
        throw null;
    }

    @Override // defpackage.anj
    protected void q(long j) {
        throw null;
    }

    @Override // defpackage.ang
    public final /* synthetic */ anf r(int i, int i2, Map map, awqg awqgVar) {
        return s(i, i2, map, awqgVar);
    }

    @Override // defpackage.ang
    public final anf s(int i, int i2, Map map, awqg awqgVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            amw.b(a.cj(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new ant(i, i2, map, 0);
    }

    @Override // defpackage.any
    public final void k() {
    }
}

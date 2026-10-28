package defpackage;

import app.rive.semantics.SemanticState;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acht {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public final void a(List list) {
        this.e = agke.n(list);
    }

    public final void b(final abcl abclVar) {
        float f = abclVar.e;
        if (f <= 0.0f) {
            f = abclVar.d;
        }
        final abcn abcnVar = new abcn(abclVar.i, abclVar.j, f, abclVar.f, abclVar.k, abclVar.l);
        int i = abclVar.a;
        this.g = new grj(SemanticState.ReadOnly, new abcm() { // from class: abci
            @Override // defpackage.abcm
            public final double a(int i2, double d) {
                abcn abcnVar2 = abcnVar;
                float f2 = (float) (((double) (i2 * 10000.0f)) / d);
                return (f2 < abcnVar2.c ? abcnVar2.a.a(f2) : abcnVar2.b.a(f2)) / abclVar.f;
            }
        });
    }

    public final byte[] c() {
        return (byte[]) ((grj) this.g).a;
    }
}

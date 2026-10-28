package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abac extends acfx {
    private final mbb a;
    private final Set b;
    private final asgf c;
    private final boolean k;

    public abac(asgf asgfVar, Set set, mbb mbbVar, boolean z) {
        super(asgfVar.b, asgfVar.c, 1, 1, null);
        this.c = asgfVar;
        this.a = mbbVar;
        this.b = set;
        this.k = z;
    }

    private final boolean p(asgh asghVar) {
        Set set = this.b;
        return set.isEmpty() || set.contains(asghVar);
    }

    @Override // defpackage.acfx
    public final void a(boolean z, boolean z2, boolean z3) {
        asgh asghVar = asgh.CUE_RANGE_EVENT_TYPE_ENTER;
        if (p(asghVar)) {
            try {
                mbb mbbVar = this.a;
                aihf aihfVarCreateBuilder = asgg.a.createBuilder();
                asgf asgfVar = this.c;
                aihfVarCreateBuilder.copyOnWrite();
                asgg asggVar = (asgg) aihfVarCreateBuilder.instance;
                asgfVar.getClass();
                asggVar.d = asgfVar;
                asggVar.b |= 2;
                aihfVarCreateBuilder.copyOnWrite();
                asgg asggVar2 = (asgg) aihfVarCreateBuilder.instance;
                asggVar2.c = asghVar.d;
                asggVar2.b |= 1;
                mbbVar.d((asgg) aihfVarCreateBuilder.build());
            } catch (RuntimeException e) {
                zvp.b(zvn.b, zvm.k, "Exception in writing to streamwriter - ".concat(String.valueOf(e.getClass().getName())), e);
            }
        }
    }

    @Override // defpackage.acfx
    public final boolean b() {
        return this.k;
    }

    @Override // defpackage.acfx
    public final void c(long j) {
        asgh asghVar = asgh.CUE_RANGE_EVENT_TYPE_EXIT;
        if (p(asghVar)) {
            try {
                mbb mbbVar = this.a;
                aihf aihfVarCreateBuilder = asgg.a.createBuilder();
                asgf asgfVar = this.c;
                aihfVarCreateBuilder.copyOnWrite();
                asgg asggVar = (asgg) aihfVarCreateBuilder.instance;
                asgfVar.getClass();
                asggVar.d = asgfVar;
                asggVar.b |= 2;
                aihfVarCreateBuilder.copyOnWrite();
                asgg asggVar2 = (asgg) aihfVarCreateBuilder.instance;
                asggVar2.c = asghVar.d;
                asggVar2.b |= 1;
                mbbVar.d((asgg) aihfVarCreateBuilder.build());
            } catch (RuntimeException e) {
                zvp.b(zvn.b, zvm.k, "Exception in writing to Streamwriter - ".concat(String.valueOf(e.getClass().getName())), e);
            }
        }
    }
}

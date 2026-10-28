package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yla extends ynp {
    public yla() {
        super((yno) null);
    }

    @Override // defpackage.ynp
    public final void a(xir xirVar) {
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amiw.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amiw amiwVar = (amiw) aihfVarCreateBuilder2.instance;
        amiwVar.b |= SemanticState.ReadOnly;
        amiwVar.j = true;
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amiw amiwVar2 = (amiw) aihfVarCreateBuilder2.build();
        amiwVar2.getClass();
        amiuVar.N = amiwVar2;
        amiuVar.d |= 8;
        xirVar.h((amiu) aihfVarCreateBuilder.build());
    }
}

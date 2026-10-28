package defpackage;

import app.rive.semantics.SemanticState;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aczs extends acyx {
    public aczs(Executor executor, acxn acxnVar) {
        super(executor, false, acxnVar);
    }

    @Override // defpackage.acyx
    protected final /* bridge */ /* synthetic */ akrn a(Object obj) {
        amgj amgjVar = (amgj) obj;
        if ((amgjVar.i & SemanticState.LiveRegion) == 0) {
            return null;
        }
        akrn akrnVar = amgjVar.dP;
        return akrnVar == null ? akrn.a : akrnVar;
    }
}

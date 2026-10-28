package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgh implements nrw {
    public static final agkj a = agkj.n(asqu.HAPTIC_TYPE_LIGHT_IMPACT, new mgg(1, 1), asqu.HAPTIC_TYPE_MEDIUM_IMPACT, new mgg(3, 3), asqu.HAPTIC_TYPE_HEAVY_IMPACT, new mgg(6, 6), asqu.HAPTIC_TYPE_SELECTION_CLICK, new mgg(4, 4), asqu.HAPTIC_TYPE_SUCCESS, new mgg(16, 16));
    private final nuc b;

    public mgh(nuc nucVar) {
        this.b = nucVar;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return asqt.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return a.r();
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        asqt asqtVar = (asqt) obj;
        if ((asqtVar.c & 1) == 0) {
            this.b.c(aslh.LOG_TYPE_MISSING_FIELD, nrvVar.i, "HapticCommand is missing a type.", new Object[0]);
            return avlb.e();
        }
        agkj agkjVar = a;
        asqu asquVarA = asqu.a(asqtVar.d);
        if (asquVarA == null) {
            asquVarA = asqu.HAPTIC_TYPE_UNKNOWN;
        }
        if (agkjVar.containsKey(asquVarA)) {
            asqu asquVarA2 = asqu.a(asqtVar.d);
            if (asquVarA2 == null) {
                asquVarA2 = asqu.HAPTIC_TYPE_UNKNOWN;
            }
            int i = ((mgg) agkjVar.get(asquVarA2)).b;
            return avlb.o(new lfa(nrvVar, asqtVar, 13, (byte[]) null)).v(avmh.a());
        }
        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
        aslh aslhVar = aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR;
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
        asncVar.d = aslhVar.I;
        asncVar.b |= 2;
        asqu asquVarA3 = asqu.a(asqtVar.d);
        if (asquVarA3 == null) {
            asquVarA3 = asqu.HAPTIC_TYPE_UNKNOWN;
        }
        String strName = asquVarA3.name();
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
        strName.getClass();
        asncVar2.b |= SemanticState.Modal;
        asncVar2.o = strName;
        this.b.d((asnc) aihfVarCreateBuilder.build(), nrvVar.i, "Haptic type is not available.", new Object[0]);
        return avlb.e();
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }
}

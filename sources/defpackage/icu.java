package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class icu {
    static final agkj a;
    private final abea b;

    static {
        agkh agkhVar = new agkh(4);
        agkhVar.e(amee.QUEUE_ACTION_TYPE_REMOVE, ameb.INTERACTION_LOGGING_GESTURE_TYPE_SWIPE);
        agkhVar.e(amee.QUEUE_ACTION_TYPE_MOVE, ameb.INTERACTION_LOGGING_GESTURE_TYPE_DRAG_DROP);
        agkhVar.e(amee.QUEUE_ACTION_TYPE_ADD, ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK);
        agkhVar.e(amee.QUEUE_ACTION_TYPE_LOOP_ALL, ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK);
        agkhVar.e(amee.QUEUE_ACTION_TYPE_LOOP_SINGLE, ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK);
        agkhVar.e(amee.QUEUE_ACTION_TYPE_SHUFFLE, ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK);
        a = agkhVar.d(true);
    }

    public icu(abea abeaVar) {
        this.b = abeaVar;
    }

    final void a(abke abkeVar, amee ameeVar) {
        Optional optionalEmpty;
        if (abkeVar != null) {
            if (abkeVar instanceof hzf) {
                aoun aounVar = ((hzf) abkeVar).a;
                optionalEmpty = Optional.ofNullable((aounVar.b & 2097152) != 0 ? aounVar.t.G() : null);
            } else {
                optionalEmpty = Optional.empty();
            }
            aihf aihfVarCreateBuilder = amdd.a.createBuilder();
            aihf aihfVarCreateBuilder2 = amdn.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            amdn amdnVar = (amdn) aihfVarCreateBuilder2.instance;
            amdnVar.c = ameeVar.h;
            amdnVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
            amdn amdnVar2 = (amdn) aihfVarCreateBuilder2.build();
            amdnVar2.getClass();
            amddVar.m = amdnVar2;
            amddVar.b |= 134217728;
            amdd amddVar2 = (amdd) aihfVarCreateBuilder.build();
            ameb amebVar = (ameb) a.get(ameeVar);
            if (!optionalEmpty.isPresent() || amebVar == null) {
                return;
            }
            this.b.a().o(amebVar, new xgj((byte[]) optionalEmpty.get()), amddVar2);
        }
    }
}

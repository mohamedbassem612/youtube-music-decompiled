package defpackage;

import app.rive.StateMachine;
import app.rive.core.StateMachineHandle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awzt implements awzd {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public awzt(awqk awqkVar, Object obj, int i) {
        this.$cid = i;
        this.a = awqkVar;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Type inference failed for: r6v1, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [awqk, java.lang.Object] */
    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) throws Throwable {
        awzs awzsVar;
        Object objEmit;
        awzv awzvVar;
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                return (StateMachineHandle.m567equalsimpl0(((StateMachineHandle) obj).m570unboximpl(), ((StateMachine) ((ahgb) this.a).a).m318getStateMachineHandlea86gHUU()) && (objEmit = this.b.emit(obj, awoqVar)) == awox.a) ? objEmit : awmy.a;
            }
            if (awoqVar instanceof awzv) {
                awzvVar = (awzv) awoqVar;
                int i2 = awzvVar.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    awzvVar.b = i2 - Integer.MIN_VALUE;
                } else {
                    awzvVar = new awzv(this, awoqVar);
                }
            } else {
                awzvVar = new awzv(this, awoqVar);
            }
            Object objInvoke = awzvVar.a;
            awox awoxVar = awox.a;
            int i3 = awzvVar.b;
            if (i3 == 0) {
                atqp.j(objInvoke);
                ?? r8 = this.a;
                awzvVar.c = obj;
                awzvVar.b = 1;
                objInvoke = r8.invoke(obj, awzvVar);
                if (objInvoke == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = awzvVar.c;
                atqp.j(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return awmy.a;
            }
            ((awrm) this.b).a = obj;
            throw new axbd(this);
        }
        if (awoqVar instanceof awzs) {
            awzsVar = (awzs) awoqVar;
            int i4 = awzsVar.b;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                awzsVar.b = i4 - Integer.MIN_VALUE;
            } else {
                awzsVar = new awzs(this, awoqVar);
            }
        } else {
            awzsVar = new awzs(this, awoqVar);
        }
        Object objInvoke2 = awzsVar.a;
        awox awoxVar2 = awox.a;
        int i5 = awzsVar.b;
        if (i5 != 0) {
            if (i5 == 1) {
                obj = awzsVar.d;
                atqp.j(objInvoke2);
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objInvoke2);
            }
            return awmy.a;
        }
        atqp.j(objInvoke2);
        ?? r9 = this.a;
        awzsVar.d = obj;
        awzsVar.b = 1;
        objInvoke2 = r9.invoke(obj, awzsVar);
        if (objInvoke2 == awoxVar2) {
            return awoxVar2;
        }
        if (!((Boolean) objInvoke2).booleanValue()) {
            throw new axbd(this);
        }
        ?? r6 = this.b;
        awzsVar.d = null;
        awzsVar.b = 2;
        if (r6.emit(obj, awzsVar) == awoxVar2) {
            return awoxVar2;
        }
        return awmy.a;
    }

    public awzt(awzd awzdVar, ahgb ahgbVar, int i) {
        this.$cid = i;
        this.b = awzdVar;
        this.a = ahgbVar;
    }
}

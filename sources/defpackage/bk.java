package defpackage;

import android.transition.Transition;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bk extends be {
    public final Object b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(ea eaVar, boolean z, boolean z2) {
        Object exitTransition;
        super(eaVar);
        eaVar.getClass();
        boolean z3 = false;
        if (eaVar.h == 2) {
            if (z) {
                exitTransition = eaVar.a.getReenterTransition();
                z3 = true;
            } else {
                exitTransition = eaVar.a.getEnterTransition();
            }
        } else if (z) {
            exitTransition = eaVar.a.getReturnTransition();
            z3 = true;
        } else {
            exitTransition = eaVar.a.getExitTransition();
        }
        this.b = exitTransition;
        this.c = eaVar.h == 2 ? z3 ? eaVar.a.getAllowReturnTransitionOverlap() : eaVar.a.getAllowEnterTransitionOverlap() : true;
        this.d = z2 ? z3 ? eaVar.a.getSharedElementReturnTransition() : eaVar.a.getSharedElementEnterTransition() : null;
    }

    private final dv d(Object obj) {
        if (obj == null) {
            return null;
        }
        dv dvVar = C0027do.a;
        dv dvVar2 = C0027do.a;
        if ((obj instanceof Transition) || ((dvVar2 = C0027do.b) != null && dvVar2.m(obj))) {
            return dvVar2;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }

    public final dv a() {
        Object obj = this.d;
        Object obj2 = this.b;
        dv dvVarD = d(obj2);
        dv dvVarD2 = d(obj);
        if (dvVarD == null || dvVarD2 == null || dvVarD == dvVarD2) {
            return dvVarD == null ? dvVarD2 : dvVarD;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.a + " returned Transition " + obj2 + " which uses a different Transition  type than its shared element transition " + obj);
    }

    public final boolean c() {
        return this.d != null;
    }
}

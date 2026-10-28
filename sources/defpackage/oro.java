package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oro extends GestureDetector implements otb {
    public static final /* synthetic */ int e = 0;
    final orp a;
    final ScaleGestureDetector b;
    final otd c;
    final long d;

    public oro(long j, orp orpVar, ScaleGestureDetector scaleGestureDetector, otd otdVar) {
        super(orpVar);
        this.d = j;
        this.a = orpVar;
        this.b = scaleGestureDetector;
        this.c = otdVar;
    }

    @Override // android.view.GestureDetector
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        long j = this.d;
        if (((j & 67108864) != 0 && motionEvent.getActionMasked() == 9) || ((j & 134217728) != 0 && motionEvent.getActionMasked() == 10)) {
            orp orpVar = this.a;
            int action = motionEvent.getAction();
            if (action != 9) {
                if (action == 10 && (orpVar.b & 134217728) != 0) {
                    orq orqVar = orpVar.d;
                    atcw atcwVar = orpVar.c;
                    if (atcwVar.t == null && (Memory.peekByte(atcwVar.c + 11) & 1) != 0) {
                        atcwVar.t = new mew(atcwVar.cp(true != atcy.a ? 108 : 208, atcm.a));
                    }
                    orqVar.d(atcwVar.t == null ? atcl.a : atcwVar.t, orpVar.b(motionEvent, 134217728L));
                    return true;
                }
            } else if ((orpVar.b & 67108864) != 0) {
                orq orqVar2 = orpVar.d;
                atcw atcwVar2 = orpVar.c;
                if (atcwVar2.s == null && (Memory.peekByte(atcwVar2.c + 10) & 128) != 0) {
                    atcwVar2.s = new mew(atcwVar2.cp(true != atcy.a ? 104 : 200, atcm.a));
                }
                orqVar2.d(atcwVar2.s == null ? atcl.a : atcwVar2.s, orpVar.b(motionEvent, 67108864L));
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Failed to calculate best type for var: r10v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v15 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v15 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v16 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v15 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oro.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

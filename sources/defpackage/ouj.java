package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ouj implements PaintUnit {
    public ouv A;
    private final boolean a;
    public PaintUnitOwner q;
    public int r = -1;
    public int s;
    public int t;
    public int u;
    public int v;
    protected boolean w;
    public final boolean x;
    public oul y;
    public oum z;

    protected ouj(boolean z, boolean z2) {
        this.x = z;
        this.a = z2;
    }

    /* JADX WARN: Failed to calculate best type for var: r2v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v20 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v20 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r2v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v21 ??, new type: long
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v20 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public void B(defpackage.mew r23) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouj.B(mew):void");
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public /* synthetic */ List C(mew mewVar) {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public void e(boolean z) {
        if (this.w != z) {
            this.w = z;
            ouv ouvVar = this.A;
            if (ouvVar != null) {
                ouvVar.e(z);
            }
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public void f(PaintUnitOwner paintUnitOwner) {
        this.q = paintUnitOwner;
        oul oulVar = this.y;
        if (oulVar != null) {
            oulVar.l = paintUnitOwner;
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public /* synthetic */ boolean ic() {
        return true;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public /* synthetic */ atoc m() {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public /* synthetic */ boolean o(float f) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final int p() {
        return this.r;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final Rect q() {
        return new Rect(this.s, this.t, this.u, this.v);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final PaintUnitOwner r() {
        return this.q;
    }

    public void s() {
        PaintUnitOwner paintUnitOwner = this.q;
        if (paintUnitOwner != null) {
            paintUnitOwner.G();
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void t(int i, int i2, int i3, int i4) {
        if (i == this.s && i2 == this.t && i3 == this.u && i4 == this.v) {
            return;
        }
        this.s = i;
        this.t = i2;
        this.u = i3;
        this.v = i4;
        ouv ouvVar = this.A;
        if (ouvVar != null) {
            ouvVar.t(i, i2, i3, i4);
        }
        c();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public void u(int[] iArr, float f, float f2) {
        oul oulVar = this.y;
        if (oulVar != null) {
            oulVar.u(iArr, f, f2);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public void v(agfr agfrVar, ovd ovdVar) {
        if (this.y == null) {
            oul oulVar = new oul();
            this.y = oulVar;
            PaintUnitOwner paintUnitOwner = this.q;
            if (paintUnitOwner != null) {
                oulVar.l = paintUnitOwner;
            }
        }
        this.y.v(agfrVar, ovdVar);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void w(int i) {
        this.r = i;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public /* synthetic */ boolean x(long j, long j2, View view) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public /* synthetic */ boolean y(MotionEvent motionEvent, View view) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public /* synthetic */ mew z(float f, float f2, int i) {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ void A() {
    }

    protected void c() {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit, java.io.Closeable, java.lang.AutoCloseable
    public /* synthetic */ void close() {
    }
}

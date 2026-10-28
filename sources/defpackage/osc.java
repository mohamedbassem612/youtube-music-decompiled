package defpackage;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class osc extends oyf implements opt {
    public static final /* synthetic */ int b = 0;
    public final orw a;

    public osc(NodeTreeProcessor nodeTreeProcessor, orw orwVar) {
        super(nodeTreeProcessor, orwVar);
        this.a = orwVar;
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void B(NodeTreeProcessor nodeTreeProcessor) {
        super.B(nodeTreeProcessor);
        orw orwVar = this.a;
        orwVar.h = false;
        orwVar.e.clear();
        orwVar.g = false;
        orwVar.d = nodeTreeProcessor.l();
    }

    @Override // defpackage.opt
    public final boolean D(int i, int i2) {
        return false;
    }

    @Override // defpackage.opt
    public final void I(asuy asuyVar) {
        if ((Memory.peekByte(asuyVar.c + 8) & 1) == 0 || yno.D(asuyVar.aT())) {
            return;
        }
        bac.p(this.a, new osa(asuyVar));
    }

    @Override // defpackage.opt
    public final void J(asut asutVar) {
        asuy asuyVarBc = asutVar.ba() ? asutVar.bc() : null;
        String strAW = asutVar.aW();
        boolean z = (asuyVarBc == null || (Memory.peekByte(asuyVarBc.c + 8) & 1) == 0 || yno.D(asuyVarBc.aT())) ? false : true;
        boolean z2 = (asuyVarBc == null || (Memory.peekByte(asuyVarBc.c + 9) & 1) == 0 || yno.D(asuyVarBc.aU())) ? false : true;
        boolean z3 = (strAW == null || yno.D(strAW)) ? false : true;
        if (z || z2 || z3) {
            bac.p(this.a, new osb(asuyVarBc, z, z2, z3, strAW));
        } else {
            this.a.setAccessibilityDelegate(null);
        }
    }

    @Override // defpackage.opt
    public final View f() {
        return this.a;
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.a.onCreateInputConnection(editorInfo);
    }

    @Override // defpackage.opt
    public final /* synthetic */ void K(asvc asvcVar, grj grjVar) {
    }
}

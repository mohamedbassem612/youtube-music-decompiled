package defpackage;

import android.graphics.Canvas;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ouu extends oyn {
    public PaintUnit a;

    public ouu(NodeTreeProcessor nodeTreeProcessor, PaintUnit paintUnit) {
        super(nodeTreeProcessor);
        this.a = paintUnit;
        paintUnit.f(this);
    }

    @Override // defpackage.oyn, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void B(NodeTreeProcessor nodeTreeProcessor) {
        super.B(nodeTreeProcessor);
        if (Memory.peekByte(FlagServices.b().c + 103) != 0) {
            this.a.f(this);
        }
    }

    public final void D(PaintUnit paintUnit) {
        PaintUnit paintUnit2 = this.a;
        if (paintUnit2 != null) {
            paintUnit2.f(null);
            if (Memory.peekByte(FlagServices.b().c + 103) != 0 && paintUnit2 != paintUnit) {
                I(paintUnit2);
            }
        }
        paintUnit.t(0, 0, getWidth(), getHeight());
        paintUnit.f(this);
        paintUnit.w(this.f);
        this.a = paintUnit;
    }

    @Override // defpackage.oyn, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void S(int i) {
        this.f = i;
        this.a.w(i);
    }

    @Override // defpackage.oyn, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void U() {
        this.a.A();
    }

    @Override // defpackage.oyn, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final atoc V() {
        return this.a.m();
    }

    @Override // defpackage.oyn
    public final PaintUnit f() {
        return this.a;
    }

    @Override // defpackage.oyn, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final PaintUnit ih(int i) {
        if (this.a.p() == i) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.oyn, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.b(canvas);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.a.g(i, i2, i3, i4);
    }

    @Override // defpackage.oyn, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void t(int i, int i2, int i3, int i4) {
        super.t(i, i2, i3, i4);
        this.a.t(0, 0, getWidth(), getHeight());
    }

    @Override // defpackage.oyn, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void y() {
        if (Memory.peekByte(FlagServices.b().c + 103) != 0) {
            this.a.f(null);
            I(this.a);
        }
        super.y();
    }
}

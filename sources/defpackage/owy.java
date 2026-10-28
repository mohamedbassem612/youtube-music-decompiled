package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.Choreographer;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import com.google.protos.youtube.elements.upb.TextTypeOuterClass$TextType;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class owy extends ouj implements Drawable.Callback {
    private ouy B;
    private float C;
    private float D;
    private int E;
    private int F;
    private oxe G;
    private int H;
    private GestureDetector I;
    private volatile RenderNode J;
    private TextTypeOuterClass$TextType K;
    private final owu L;
    private final owj M;
    private ImageSpan[] N;
    private oxw[] O;
    private oxv[] P;
    private final ElementsServices Q;
    private oul R;
    private boolean S;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public ClickableSpan g;
    Runnable h;
    View i;
    boolean j;
    public View k;
    public float l;
    public Layout m;
    public final float n;
    public atlh o;
    private Choreographer.FrameCallback p;

    public owy(owu owuVar, oxn oxnVar, boolean z, boolean z2, ElementsServices elementsServices) {
        super(z, z2);
        this.p = null;
        this.o = null;
        this.E = -1;
        this.G = null;
        this.H = 436207616;
        this.N = null;
        this.O = null;
        this.P = null;
        this.S = false;
        this.L = owuVar;
        this.M = oxnVar.a();
        this.n = elementsServices.a();
        this.Q = elementsServices;
    }

    private final Layout H(TextTypeOuterClass$TextType textTypeOuterClass$TextType) {
        atlh atlhVar = this.o;
        owu owuVar = this.L;
        return atlhVar == null ? owuVar.a(textTypeOuterClass$TextType, this.M, View.MeasureSpec.makeMeasureSpec(((this.u - this.s) - this.b) - this.d, 1073741824), View.MeasureSpec.makeMeasureSpec(((this.v - this.t) - this.c) - this.e, 1073741824), this.Q, this.w) : owuVar.b(textTypeOuterClass$TextType, this.M, View.MeasureSpec.makeMeasureSpec(((this.u - this.s) - this.b) - this.d, 1073741824), this.Q, this.w);
    }

    private final ClickableSpan I(MotionEvent motionEvent, int i) {
        oxv[] oxvVarArr;
        Layout layout = this.m;
        if (layout != null && (oxvVarArr = this.P) != null && oxvVarArr.length > 0 && i >= 0 && i < motionEvent.getPointerCount()) {
            Optional optionalJ = j(motionEvent.getX(i), motionEvent.getY(i));
            if (!optionalJ.isEmpty()) {
                int iIntValue = ((Integer) optionalJ.get()).intValue();
                CharSequence text = layout.getText();
                if (text instanceof Spanned) {
                    oxv[] oxvVarArr2 = (oxv[]) ((Spanned) text).getSpans(iIntValue, iIntValue, oxv.class);
                    if (oxvVarArr2.length > 0) {
                        return oxvVarArr2[0];
                    }
                }
            }
        }
        return null;
    }

    private final void J() {
        oxe oxeVar = this.G;
        if (oxeVar != null) {
            oxeVar.b();
        }
    }

    private final void K(Layout layout, Canvas canvas) {
        boolean z;
        Path path;
        ouy ouyVar = this.B;
        if (ouyVar != null && ouyVar.c > 0.0f) {
            layout.getPaint().setShadowLayer(ouyVar.c, ouyVar.d, ouyVar.e, ouyVar.f);
        }
        oxe oxeVar = this.G;
        boolean z2 = true;
        if (oxeVar != null && oxeVar.G()) {
            Paint paint = oxeVar.h;
            if (oxeVar.G()) {
                if (oxeVar.i) {
                    if (oxeVar.g == null) {
                        oxeVar.g = new Path();
                    }
                    Layout layout2 = oxeVar.d.m;
                    if (layout2 != null) {
                        layout2.getSelectionPath(oxeVar.e, oxeVar.f, oxeVar.g);
                        oxeVar.g.computeBounds(oxeVar.j, true);
                        oxeVar.i = false;
                    }
                }
                path = oxeVar.g;
            } else {
                path = null;
            }
            if (paint != null && path != null) {
                canvas.drawPath(path, paint);
            }
        }
        if (this.O != null) {
            if (this.S) {
                canvas.saveLayer(null, null);
                z = true;
            } else {
                z = false;
            }
            for (oxw oxwVar : this.O) {
                oxwVar.b(canvas);
            }
        } else {
            z = false;
        }
        int i = ((this.v - this.t) - this.c) - this.e;
        int i2 = ((this.u - this.s) - this.b) - this.d;
        if (layout.getHeight() > i || this.a || this.o != null) {
            if (z) {
                z2 = false;
            } else {
                canvas.save();
            }
            canvas.clipRect(0, 0, i2, i);
        } else {
            z2 = false;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                layout.draw(canvas);
            } catch (ClassCastException | IndexOutOfBoundsException | NullPointerException e) {
                this.Q.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "Crash in TextPaintUnit textLayout.draw()", e);
            }
        } else {
            layout.draw(canvas);
        }
        oxw[] oxwVarArr = this.O;
        if (oxwVarArr != null) {
            for (oxw oxwVar2 : oxwVarArr) {
                oxwVar2.a(canvas);
            }
        }
        if (z || z2) {
            canvas.restore();
        }
    }

    private final void L(Canvas canvas) {
        oul oulVar;
        aga agaVar = ElementsServices.a;
        if (Memory.peekByte(FlagServices.b().c + 81) == 0 || (oulVar = this.R) == null) {
            return;
        }
        oulVar.b(canvas);
    }

    private final void M(RenderNode renderNode, Layout layout, int i, int i2) {
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            int width = layout.getWidth();
            atlh atlhVar = this.o;
            if (atlhVar == null || (layout.getWidth() <= this.u - this.s && Memory.peekByte(atlhVar.c + 9) == 0)) {
                i3 = -1;
            } else {
                int i5 = width << 1;
                float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(atlhVar.c + (true != atlh.a ? 28L : 24L), false));
                int i6 = this.u - this.s;
                if (width > i6) {
                    float f = fIntBitsToFloat * this.n;
                    i4 = (int) (((double) f) + (f > 0.0f ? 0.5d : -0.5d));
                } else {
                    i4 = i6 - width;
                }
                i3 = i5 + i4;
            }
            renderNode.setPosition(0, 0, i3 != -1 ? i3 : i, i2);
            RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
            int i7 = i3 == -1 ? -1 : i3 - width;
            if (recordingCanvasBeginRecording != null) {
                try {
                    int i8 = this.u - this.s;
                    int i9 = this.v - this.t;
                    if (this.x) {
                        oul oulVar = this.y;
                        if (oulVar != null) {
                            oulVar.t(0, 0, i8, i9);
                            this.y.b(recordingCanvasBeginRecording);
                        }
                        ouv ouvVar = this.A;
                        if (ouvVar != null) {
                            ouvVar.t(0, 0, i8, i9);
                            this.A.b(recordingCanvasBeginRecording);
                        }
                    }
                    float f2 = this.b;
                    float f3 = this.c;
                    if (f2 == 0.0f && f3 == 0.0f) {
                        K(layout, recordingCanvasBeginRecording);
                        if (i7 >= 0) {
                            float f4 = (true == this.w ? -1 : 1) * i7;
                            recordingCanvasBeginRecording.translate(f4, 0.0f);
                            K(layout, recordingCanvasBeginRecording);
                            recordingCanvasBeginRecording.translate(-f4, 0.0f);
                        }
                    } else {
                        recordingCanvasBeginRecording.translate(f2, f3);
                        K(layout, recordingCanvasBeginRecording);
                        if (i7 >= 0) {
                            float f5 = (true == this.w ? -1 : 1) * i7;
                            recordingCanvasBeginRecording.translate(f5, 0.0f);
                            K(layout, recordingCanvasBeginRecording);
                            recordingCanvasBeginRecording.translate(-f5, 0.0f);
                        }
                        recordingCanvasBeginRecording.translate(-f2, -f3);
                    }
                    int i10 = this.u - this.s;
                    int i11 = this.v - this.t;
                    oum oumVar = this.z;
                    if (oumVar != null) {
                        oumVar.t(0, 0, i10, i11);
                        this.z.b(recordingCanvasBeginRecording);
                    }
                } finally {
                    renderNode.endRecording();
                }
            }
        }
    }

    private final void N() {
        Runnable runnable = this.h;
        if (runnable != null) {
            View view = this.i;
            if (view != null) {
                view.removeCallbacks(runnable);
                this.i = null;
            }
            this.h = null;
        }
    }

    private final void O(ClickableSpan clickableSpan) {
        Layout layout = this.m;
        if (layout == null || !(layout.getText() instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) layout.getText();
        h().D(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    private final boolean P(MotionEvent motionEvent, View view) {
        ClickableSpan clickableSpan = this.g;
        if (clickableSpan == null) {
            return false;
        }
        N();
        J();
        ClickableSpan clickableSpanI = I(motionEvent, motionEvent.findPointerIndex(this.E));
        if (!this.f && Objects.equals(clickableSpanI, clickableSpan)) {
            clickableSpan.onClick(view);
        }
        this.g = null;
        this.E = -1;
        this.f = false;
        return true;
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void B(mew mewVar) {
        super.B(mewVar);
        long j = mewVar.c;
        if ((Memory.peekByte(9 + j) & 32) == 0) {
            this.B = null;
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(j + 80, false));
        float f = this.n;
        float f2 = fIntBitsToFloat * f;
        double d = f2;
        int i = (int) (f2 > 0.0f ? d + 0.5d : d - 0.5d);
        long j2 = mewVar.c;
        int iPeekInt = Memory.peekInt(84 + j2, false);
        float fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(j2 + 88, false)) * f;
        double d2 = fIntBitsToFloat2;
        int i2 = (int) (fIntBitsToFloat2 > 0.0f ? d2 + 0.5d : d2 - 0.5d);
        float fIntBitsToFloat3 = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 92, false)) * f;
        double d3 = fIntBitsToFloat3;
        D(i, iPeekInt, i2, (int) (fIntBitsToFloat3 > 0.0f ? d3 + 0.5d : d3 - 0.5d));
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final List C(mew mewVar) {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Layout layout = this.m;
        if (layout != null && (layout.getText() instanceof Spanned) && this.P != null) {
            Spanned spanned = (Spanned) layout.getText();
            oxv[] oxvVarArr = this.P;
            int i = -1;
            int i2 = 0;
            for (int length = oxvVarArr.length; i2 < length; length = length) {
                oxv oxvVar = oxvVarArr[i2];
                i++;
                int spanStart = spanned.getSpanStart(oxvVar);
                int spanEnd = spanned.getSpanEnd(oxvVar);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    Path path = new Path();
                    layout.getSelectionPath(spanStart, spanEnd, path);
                    RectF rectF = new RectF();
                    path.computeBounds(rectF, true);
                    long j = mewVar.c;
                    rectF.offset(Memory.peekInt(j + 12, false), Memory.peekInt(j + 16, false));
                    rectF.offset(this.s + this.b, this.t + this.c);
                    mfc mfcVar = asut.e;
                    asup asupVar = new asup();
                    String string = oxvVar.a;
                    if (TextUtils.isEmpty(string)) {
                        string = spanned.subSequence(spanStart, spanEnd).toString();
                    }
                    string.getClass();
                    asupVar.aS();
                    mfc mfcVar2 = asup.f;
                    asupVar.bN(mfcVar2);
                    asupVar.bT(mfcVar2.b, string);
                    asupVar.k = null;
                    atoc atocVar = new atoc((char[]) null, (byte[]) null);
                    int i3 = (int) rectF.left;
                    atocVar.aW();
                    atocVar.bO(8, 1);
                    atocVar.bQ(12, i3);
                    int i4 = (int) rectF.top;
                    atocVar.aW();
                    atocVar.bO(8, 2);
                    atocVar.bQ(16, i4);
                    int i5 = (int) rectF.right;
                    atocVar.aW();
                    atocVar.bO(8, 4);
                    atocVar.bQ(20, i5);
                    int i6 = (int) rectF.bottom;
                    atocVar.aW();
                    atocVar.bO(8, 8);
                    atocVar.bQ(24, i6);
                    if (atocVar.d) {
                        atocVar.bG();
                        z = true;
                    } else {
                        z = true;
                        atocVar.d = true;
                    }
                    mew mewVar2 = new mew(atocVar.b, (byte[]) null);
                    if (mewVar2 != asupVar.t) {
                        asupVar.t = mewVar2;
                        asupVar.j = z;
                    }
                    String strValueOf = String.valueOf(i);
                    strValueOf.getClass();
                    asupVar.aS();
                    mfc mfcVar3 = asup.e;
                    asupVar.bN(mfcVar3);
                    asupVar.bT(mfcVar3.b, strValueOf);
                    asupVar.i = null;
                    String strValueOf2 = String.valueOf(this.r);
                    strValueOf2.getClass();
                    asupVar.aS();
                    mfc mfcVar4 = asup.g;
                    asupVar.bN(mfcVar4);
                    asupVar.bT(mfcVar4.b, strValueOf2);
                    asupVar.l = null;
                    mfc mfcVar5 = asuy.h;
                    asum asumVar = new asum();
                    int i7 = (int) oxvVar.b;
                    if (asumVar.d) {
                        asumVar.d = false;
                        asumVar.bG();
                    }
                    asumVar.bO(8, 64);
                    asumVar.bQ(20, i7);
                    if (asumVar.d) {
                        asumVar.bG();
                    } else {
                        asumVar.d = true;
                    }
                    asuy asuyVar = new asuy(asumVar.b);
                    AtomicReference atomicReference = asumVar.o;
                    if (atomicReference.get() != null) {
                        asuyVar.o.set((ArrayList) atomicReference.get());
                    }
                    if (asuyVar != asupVar.s) {
                        asupVar.s = asuyVar;
                        z2 = true;
                        asupVar.n = true;
                    } else {
                        z2 = true;
                    }
                    if (asupVar.d) {
                        asupVar.bG();
                    } else {
                        asupVar.d = z2;
                    }
                    asut asutVar = new asut(asupVar.b);
                    ArrayList arrayList2 = asupVar.m;
                    if (arrayList2 != null) {
                        asutVar.m = arrayList2;
                    }
                    asuv asuvVar = asupVar.o;
                    asux asuxVar = asupVar.p;
                    mew mewVar3 = asupVar.r;
                    asur asurVar = asupVar.q;
                    if (asupVar.t != null) {
                        asutVar.t = asupVar.t;
                        asutVar.j = asupVar.j;
                    }
                    if (asupVar.s != null) {
                        asutVar.s = asupVar.s;
                        asutVar.n = asupVar.n;
                    }
                    asutVar.bJ();
                    arrayList.add(asutVar);
                }
                i2++;
                oxvVarArr = oxvVarArr;
            }
        }
        return arrayList;
    }

    public final void D(float f, int i, float f2, float f3) {
        if (f <= 0.0f) {
            this.B = null;
            return;
        }
        ouy ouyVar = this.B;
        if (ouyVar == null) {
            ouyVar = new ouy();
            this.B = ouyVar;
        }
        ouyVar.c = f;
        ouyVar.f = i;
        ouyVar.d = f2;
        ouyVar.e = f3;
    }

    public final void E(Layout layout) {
        ImageSpan[] imageSpanArr = this.N;
        if (imageSpanArr != null) {
            for (ImageSpan imageSpan : imageSpanArr) {
                imageSpan.getDrawable().setCallback(this);
            }
        }
        oxw[] oxwVarArr = this.O;
        if (oxwVarArr != null) {
            for (oxw oxwVar : oxwVarArr) {
                oxwVar.d();
            }
        }
        this.S = false;
        this.m = layout;
        if (layout != null) {
            if (layout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) layout.getText();
                ImageSpan[] imageSpanArr2 = (ImageSpan[]) spanned.getSpans(0, spanned.length(), ImageSpan.class);
                this.N = imageSpanArr2;
                for (ImageSpan imageSpan2 : imageSpanArr2) {
                    imageSpan2.getDrawable().setCallback(this);
                }
                oxw[] oxwVarArr2 = (oxw[]) spanned.getSpans(0, spanned.length(), oxw.class);
                this.O = oxwVarArr2;
                for (oxw oxwVar2 : oxwVarArr2) {
                    oxwVar2.c(layout, spanned);
                    if (oxwVar2.e()) {
                        this.S = true;
                    }
                }
                this.P = (oxv[]) spanned.getSpans(0, spanned.length(), oxv.class);
            }
            s();
        }
    }

    public final void F(TextTypeOuterClass$TextType textTypeOuterClass$TextType, Layout layout) {
        int iPeekInt;
        if (layout != null) {
            E(layout);
        } else if (this.q == null) {
            this.K = textTypeOuterClass$TextType;
        } else {
            E(H(textTypeOuterClass$TextType));
        }
        if ((Memory.peekByte(textTypeOuterClass$TextType.c + 8) & 32) != 0) {
            iPeekInt = Memory.peekInt(textTypeOuterClass$TextType.c + (true != atnq.a ? 28L : 16L), false);
        } else {
            iPeekInt = 436207616;
        }
        this.H = iPeekInt;
        this.j = Memory.peekByte(textTypeOuterClass$TextType.c + 10) != 0;
        oxe oxeVar = this.G;
        if (oxeVar != null) {
            oxeVar.b();
            this.G.C(this.H);
        }
    }

    public final void G(owy owyVar) {
        Layout layout = owyVar.m;
        if (layout != null) {
            E(layout);
        } else {
            TextTypeOuterClass$TextType textTypeOuterClass$TextType = owyVar.K;
            if (textTypeOuterClass$TextType != null) {
                this.K = textTypeOuterClass$TextType;
            }
        }
        this.H = owyVar.H;
        this.j = owyVar.j;
        oxe oxeVar = this.G;
        if (oxeVar != null) {
            oxeVar.b();
            this.G.C(this.H);
        }
        this.a = owyVar.a;
        this.J = owyVar.J;
    }

    public final float a() {
        return this.b;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void b(Canvas canvas) {
        double d;
        int i;
        Layout layout;
        int i2;
        int i3;
        float f = this.l;
        if (f != 0.0f) {
            canvas.translate(f, 0.0f);
        }
        atlh atlhVar = this.o;
        if (atlhVar == null || (layout = this.m) == null) {
            d = -0.5d;
        } else {
            d = -0.5d;
            if ((layout.getWidth() > this.u - this.s || Memory.peekByte(atlhVar.c + 9) != 0) && this.p == null) {
                Layout layout2 = this.m;
                atlh atlhVar2 = this.o;
                if (this.Q.k() != null) {
                    int iPeekInt = Memory.peekInt(atlhVar2.c + 20, false);
                    if (iPeekInt == 0) {
                        i2 = 1;
                    } else if (iPeekInt == 1) {
                        i2 = 2;
                    } else if (iPeekInt != 2) {
                        i2 = iPeekInt != 3 ? 0 : 4;
                    } else {
                        i2 = 3;
                    }
                    if (i2 == 0) {
                        i2 = 1;
                    }
                    int i4 = i2 - 1;
                    boolean z = i4 == 2 || (i4 != 3 && layout2.getParagraphDirection(0) == -1);
                    int width = layout2.getWidth();
                    if (atlhVar2 == null) {
                        i3 = -1;
                    } else {
                        float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(atlhVar2.c + (true != atlh.a ? 28L : 24L), false));
                        int i5 = this.u - this.s;
                        if (width > i5) {
                            float f2 = fIntBitsToFloat * this.n;
                            double d2 = f2;
                            i3 = (int) (f2 > 0.0f ? d2 + 0.5d : d2 - 0.5d);
                        } else {
                            i3 = i5 - width;
                        }
                    }
                    Memory.peekInt(atlhVar2.c + 12, false);
                    this.p = new oww(this, atlhVar2, width + i3, z);
                    PaintUnitOwner paintUnitOwner = this.q;
                    if (paintUnitOwner != null) {
                        paintUnitOwner.k(this);
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated() && this.m != null) {
            n();
            RenderNode renderNode = this.J;
            if (renderNode != null && renderNode.hasDisplayList()) {
                if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
                    canvas.translate(this.s, this.t);
                    canvas.drawRenderNode(renderNode);
                    canvas.translate(-this.s, -this.t);
                }
                L(canvas);
                float f3 = this.l;
                if (f3 != 0.0f) {
                    canvas.translate(-f3, 0.0f);
                    return;
                }
                return;
            }
        }
        Layout layout3 = this.m;
        int i6 = this.s;
        int i7 = this.t;
        int i8 = this.u;
        int i9 = this.v;
        if (this.x) {
            oul oulVar = this.y;
            if (oulVar != null) {
                oulVar.t(i6, i7, i8, i9);
                this.y.b(canvas);
            }
            ouv ouvVar = this.A;
            if (ouvVar != null) {
                ouvVar.t(i6, i7, i8, i9);
                this.A.b(canvas);
            }
        }
        if (layout3 != null) {
            float f4 = this.s + this.b;
            float f5 = this.t + this.c;
            if (f4 == 0.0f && f5 == 0.0f) {
                K(layout3, canvas);
            } else {
                canvas.translate(f4, f5);
                K(layout3, canvas);
                canvas.translate(-f4, -f5);
            }
            atlh atlhVar3 = this.o;
            if (atlhVar3 != null && (layout3.getWidth() > this.u - this.s || Memory.peekByte(atlhVar3.c + 9) != 0)) {
                int width2 = layout3.getWidth();
                float fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(atlhVar3.c + (true != atlh.a ? 28L : 24L), false));
                int i10 = this.u - this.s;
                if (width2 > i10) {
                    float f6 = fIntBitsToFloat2 * this.n;
                    double d3 = f6;
                    i = (int) (f6 > 0.0f ? d3 + 0.5d : d3 + d);
                } else {
                    i = i10 - width2;
                }
                float f7 = ((true != this.w ? 1 : -1) * (width2 + i)) + this.s + this.b;
                float f8 = this.t + this.c;
                canvas.translate(f7, f8);
                K(layout3, canvas);
                canvas.translate(-f7, -f8);
            }
        }
        int i11 = this.s;
        int i12 = this.t;
        int i13 = this.u;
        int i14 = this.v;
        oum oumVar = this.z;
        if (oumVar != null) {
            oumVar.t(i11, i12, i13, i14);
            this.z.b(canvas);
        }
        L(canvas);
        float f9 = this.l;
        if (f9 != 0.0f) {
            canvas.translate(-f9, 0.0f);
        }
    }

    @Override // defpackage.ouj
    protected final void c() {
        oul oulVar = this.R;
        if (oulVar != null) {
            oulVar.t(this.s, this.t, this.u, this.v);
        }
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.p != null) {
            this.p = null;
        }
        if (this.h != null) {
            N();
        }
        oxe oxeVar = this.G;
        if (oxeVar != null) {
            oxeVar.b();
        }
        Set set = ((oxo) this.M).b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((fdx) it.next()).c();
        }
        set.clear();
        this.R = null;
    }

    public final float d() {
        return this.c;
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void f(PaintUnitOwner paintUnitOwner) {
        super.f(paintUnitOwner);
        oul oulVar = this.R;
        if (oulVar != null) {
            oulVar.l = paintUnitOwner;
        }
        TextTypeOuterClass$TextType textTypeOuterClass$TextType = this.K;
        if (textTypeOuterClass$TextType != null) {
            F(textTypeOuterClass$TextType, H(textTypeOuterClass$TextType));
            this.K = null;
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void g(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final oxe h() {
        if (this.G == null) {
            ElementsServices elementsServices = this.Q;
            oxe oxeVar = new oxe(this, elementsServices, elementsServices.z());
            this.G = oxeVar;
            oxeVar.C(this.H);
        }
        return this.G;
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final boolean i() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        s();
    }

    final Optional j(float f, float f2) {
        int i;
        Layout layout = this.m;
        if (layout == null) {
            return Optional.empty();
        }
        float f3 = f - this.b;
        float f4 = f2 - this.c;
        int i2 = (int) f3;
        if (i2 < 0 || (i = (int) f4) < 0) {
            return Optional.empty();
        }
        int lineForVertical = layout.getLineForVertical(i);
        float f5 = i2;
        return (f5 < layout.getLineLeft(lineForVertical) || f5 > layout.getLineRight(lineForVertical) || i < layout.getLineTop(lineForVertical) || i > layout.getLineBottom(lineForVertical)) ? Optional.empty() : Optional.of(Integer.valueOf(layout.getOffsetForHorizontal(lineForVertical, f5)));
    }

    public final CharSequence k() {
        Layout layout = this.m;
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    public final void n() {
        if (Build.VERSION.SDK_INT >= 29) {
            Layout layout = this.m;
            if (layout == null) {
                RenderNode renderNode = this.J;
                if (renderNode != null) {
                    synchronized (renderNode) {
                        renderNode.discardDisplayList();
                        this.J = null;
                    }
                    return;
                }
                return;
            }
            int i = this.u - this.s;
            int i2 = this.v - this.t;
            RenderNode renderNode2 = this.J;
            if (renderNode2 == null) {
                RenderNode renderNode3 = new RenderNode("TextPaintUnit");
                boolean z = true;
                if (!this.a && this.o == null) {
                    z = false;
                }
                renderNode3.setClipToBounds(z);
                M(renderNode3, layout, i, i2);
                this.J = renderNode3;
                return;
            }
            if (renderNode2.hasDisplayList()) {
                if (this.o != null) {
                    return;
                }
                if (renderNode2.getWidth() == i && renderNode2.getHeight() == i2) {
                    return;
                }
            }
            synchronized (renderNode2) {
                int i3 = this.u - this.s;
                int i4 = this.v - this.t;
                if (!renderNode2.hasDisplayList() || (this.o == null && (renderNode2.getWidth() != i3 || renderNode2.getHeight() != i4))) {
                    M(renderNode2, layout, i3, i4);
                }
            }
        }
    }

    @Override // defpackage.ouj
    public final void s() {
        RenderNode renderNode = this.J;
        if (Build.VERSION.SDK_INT >= 29 && renderNode != null) {
            synchronized (renderNode) {
                if (renderNode.hasDisplayList() && this.o == null) {
                    renderNode.discardDisplayList();
                }
            }
        }
        super.s();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        PaintUnitOwner paintUnitOwner = this.q;
        if (paintUnitOwner != null) {
            paintUnitOwner.il(drawable, runnable, j);
        }
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void u(int[] iArr, float f, float f2) {
        super.u(iArr, f, f2);
        oul oulVar = this.R;
        if (oulVar != null) {
            oulVar.u(iArr, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        PaintUnitOwner paintUnitOwner = this.q;
        if (paintUnitOwner != null) {
            paintUnitOwner.im(drawable, runnable);
        }
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void v(agfr agfrVar, ovd ovdVar) {
        aga agaVar = ElementsServices.a;
        if (Memory.peekByte(FlagServices.b().c + 81) == 0) {
            super.v(agfrVar, ovdVar);
            return;
        }
        oul oulVar = this.R;
        if (oulVar == null) {
            oul oulVar2 = new oul();
            this.R = oulVar2;
            oulVar2.t(this.s, this.t, this.u, this.v);
            oulVar = this.R;
            oulVar.k = this.r;
            PaintUnitOwner paintUnitOwner = this.q;
            if (paintUnitOwner != null) {
                oulVar.l = paintUnitOwner;
            }
        }
        oulVar.v(agfrVar, ovdVar);
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final boolean x(long j, long j2, View view) {
        oxv[] oxvVarArr = this.P;
        if (oxvVarArr != null && j < oxvVarArr.length) {
            oxv oxvVar = oxvVarArr[(int) j];
            if ((2 & j2) != 0) {
                oxvVar.onClick(view);
                return true;
            }
            if ((j2 & 4) != 0) {
                return oxvVar.a(view);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00be  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    /* JADX WARN: Code duplicated, block: B:57:0x012f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0133  */
    /* JADX WARN: Code duplicated, block: B:60:0x0137  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:64:0x014b  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:69:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX WARN: Code duplicated, block: B:74:0x018b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final boolean y(MotionEvent motionEvent, View view) {
        int actionMasked;
        Context context;
        int scaledTouchSlop;
        ClickableSpan clickableSpanI;
        ClickableSpan clickableSpan;
        owy owyVar;
        boolean zP;
        ClickableSpan clickableSpan2;
        int iFindPointerIndex;
        boolean z;
        this.k = view;
        if (this.j) {
            GestureDetector gestureDetector = this.I;
            if (gestureDetector == null) {
                GestureDetector gestureDetector2 = new GestureDetector(view.getContext(), new owx(this));
                this.I = gestureDetector2;
                gestureDetector = gestureDetector2;
            }
            gestureDetector.onTouchEvent(motionEvent);
            if (!h().c(motionEvent)) {
                oxe oxeVarH = h();
                int i = oxeVarH.A;
                if (i == 2 || i == 5) {
                    int actionMasked2 = motionEvent.getActionMasked();
                    if (actionMasked2 == 2) {
                        int i2 = oxeVarH.A;
                        if (i2 == 2) {
                            float x = motionEvent.getX();
                            owy owyVar2 = oxeVarH.d;
                            float fA = (x - owyVar2.s) - owyVar2.a();
                            int iR = oxeVarH.r(fA, (motionEvent.getY() - owyVar2.t) - owyVar2.d(), oxeVarH.u);
                            if (iR >= 0) {
                                oxeVarH.x(iR);
                                oxeVarH.E(view, fA, iR);
                            }
                        } else if (i2 == 5) {
                            float x2 = motionEvent.getX();
                            owy owyVar3 = oxeVarH.d;
                            float fA2 = (x2 - owyVar3.s) - owyVar3.a();
                            int iR2 = oxeVarH.r(fA2, (motionEvent.getY() - owyVar3.t) - owyVar3.d(), oxeVarH.u);
                            if (iR2 >= 0) {
                                oxeVarH.x(iR2);
                                oxeVarH.E(view, fA2, iR2);
                            }
                        }
                    } else if (actionMasked2 == 1 || actionMasked2 == 3) {
                        oxeVarH.A = 4;
                        oxeVarH.v();
                        oxeVarH.A(false);
                        oxeVarH.m = -1;
                        if (oxeVarH.a() != null) {
                            oxeVarH.D(oxeVarH.s(), oxeVarH.t());
                        }
                    } else {
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked != 0) {
                            if (actionMasked == 1) {
                                zP = P(motionEvent, view);
                            } else if (actionMasked != 3) {
                                if (actionMasked == 2) {
                                    clickableSpan2 = this.g;
                                    if (clickableSpan2 != null) {
                                        if (Math.abs(motionEvent.getX(iFindPointerIndex) - this.C) <= this.F) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                        if (z) {
                                            N();
                                        }
                                        if (Objects.equals(I(motionEvent, iFindPointerIndex), clickableSpan2)) {
                                            O(clickableSpan2);
                                        } else {
                                            J();
                                            if (z) {
                                                this.g = null;
                                                this.E = -1;
                                            }
                                        }
                                        owyVar = this;
                                        zP = true;
                                    }
                                } else {
                                    if (actionMasked != 6) {
                                        return false;
                                    }
                                    if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.E) {
                                        zP = P(motionEvent, view);
                                    }
                                }
                                owyVar = this;
                                zP = false;
                            } else {
                                if (this.g != null) {
                                    N();
                                    J();
                                    this.g = null;
                                    this.E = -1;
                                    this.f = false;
                                } else if (this.j) {
                                    J();
                                } else {
                                    owyVar = this;
                                    zP = false;
                                }
                                owyVar = this;
                                zP = true;
                            }
                            owyVar = this;
                        } else {
                            N();
                            this.f = false;
                            int actionIndex = motionEvent.getActionIndex();
                            this.C = motionEvent.getX(actionIndex);
                            this.D = motionEvent.getY(actionIndex);
                            this.E = motionEvent.getPointerId(actionIndex);
                            context = view.getContext();
                            if (context != null) {
                                scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                            } else {
                                scaledTouchSlop = 0;
                            }
                            this.F = scaledTouchSlop;
                            clickableSpanI = I(motionEvent, actionIndex);
                            this.g = clickableSpanI;
                            if (clickableSpanI == null) {
                                this.E = -1;
                                owyVar = this;
                                zP = false;
                            } else {
                                O(clickableSpanI);
                                clickableSpan = this.g;
                                if (clickableSpan instanceof oya) {
                                    owyVar = this;
                                    lez lezVar = new lez(owyVar, clickableSpan, view, 14, (int[]) null);
                                    owyVar.h = lezVar;
                                    view.postDelayed(lezVar, ViewConfiguration.getLongPressTimeout());
                                    owyVar.i = view;
                                } else {
                                    owyVar = this;
                                }
                                zP = true;
                            }
                        }
                        if (!owyVar.j) {
                            return false;
                        }
                    }
                } else {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0) {
                        if (actionMasked == 1) {
                            zP = P(motionEvent, view);
                        } else if (actionMasked != 3) {
                            if (actionMasked == 2) {
                                clickableSpan2 = this.g;
                                if (clickableSpan2 != null) {
                                    if (Math.abs(motionEvent.getX(iFindPointerIndex) - this.C) <= this.F) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        N();
                                    }
                                    if (Objects.equals(I(motionEvent, iFindPointerIndex), clickableSpan2)) {
                                        J();
                                        if (z) {
                                            this.g = null;
                                            this.E = -1;
                                        }
                                    } else {
                                        O(clickableSpan2);
                                    }
                                    owyVar = this;
                                    zP = true;
                                }
                            } else {
                                if (actionMasked != 6) {
                                    return false;
                                }
                                if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.E) {
                                    zP = P(motionEvent, view);
                                }
                            }
                            owyVar = this;
                            zP = false;
                        } else {
                            if (this.g != null) {
                                N();
                                J();
                                this.g = null;
                                this.E = -1;
                                this.f = false;
                            } else if (this.j) {
                                J();
                            } else {
                                owyVar = this;
                                zP = false;
                            }
                            owyVar = this;
                            zP = true;
                        }
                        owyVar = this;
                    } else {
                        N();
                        this.f = false;
                        int actionIndex2 = motionEvent.getActionIndex();
                        this.C = motionEvent.getX(actionIndex2);
                        this.D = motionEvent.getY(actionIndex2);
                        this.E = motionEvent.getPointerId(actionIndex2);
                        context = view.getContext();
                        if (context != null) {
                            scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                        } else {
                            scaledTouchSlop = 0;
                        }
                        this.F = scaledTouchSlop;
                        clickableSpanI = I(motionEvent, actionIndex2);
                        this.g = clickableSpanI;
                        if (clickableSpanI == null) {
                            this.E = -1;
                            owyVar = this;
                            zP = false;
                        } else {
                            O(clickableSpanI);
                            clickableSpan = this.g;
                            if (clickableSpan instanceof oya) {
                                owyVar = this;
                                lez lezVar2 = new lez(owyVar, clickableSpan, view, 14, (int[]) null);
                                owyVar.h = lezVar2;
                                view.postDelayed(lezVar2, ViewConfiguration.getLongPressTimeout());
                                owyVar.i = view;
                            } else {
                                owyVar = this;
                            }
                            zP = true;
                        }
                    }
                    if (!owyVar.j) {
                        return false;
                    }
                }
            }
        } else {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    zP = P(motionEvent, view);
                } else if (actionMasked != 3) {
                    if (actionMasked == 2) {
                        clickableSpan2 = this.g;
                        if (clickableSpan2 != null && (iFindPointerIndex = motionEvent.findPointerIndex(this.E)) != -1) {
                            if (Math.abs(motionEvent.getX(iFindPointerIndex) - this.C) <= this.F || Math.abs(motionEvent.getY(iFindPointerIndex) - this.D) > this.F) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                N();
                            }
                            if (Objects.equals(I(motionEvent, iFindPointerIndex), clickableSpan2)) {
                                J();
                                if (z) {
                                    this.g = null;
                                    this.E = -1;
                                }
                            } else {
                                O(clickableSpan2);
                            }
                            owyVar = this;
                            zP = true;
                        }
                    } else {
                        if (actionMasked != 6) {
                            return false;
                        }
                        if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.E) {
                            zP = P(motionEvent, view);
                        }
                    }
                    owyVar = this;
                    zP = false;
                } else {
                    if (this.g != null) {
                        N();
                        J();
                        this.g = null;
                        this.E = -1;
                        this.f = false;
                    } else if (this.j) {
                        J();
                    } else {
                        owyVar = this;
                        zP = false;
                    }
                    owyVar = this;
                    zP = true;
                }
                owyVar = this;
            } else {
                N();
                this.f = false;
                int actionIndex3 = motionEvent.getActionIndex();
                this.C = motionEvent.getX(actionIndex3);
                this.D = motionEvent.getY(actionIndex3);
                this.E = motionEvent.getPointerId(actionIndex3);
                context = view.getContext();
                if (context != null) {
                    scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                } else {
                    scaledTouchSlop = 0;
                }
                this.F = scaledTouchSlop;
                clickableSpanI = I(motionEvent, actionIndex3);
                this.g = clickableSpanI;
                if (clickableSpanI == null) {
                    this.E = -1;
                    owyVar = this;
                    zP = false;
                } else {
                    O(clickableSpanI);
                    clickableSpan = this.g;
                    if (clickableSpan instanceof oya) {
                        owyVar = this;
                        lez lezVar3 = new lez(owyVar, clickableSpan, view, 14, (int[]) null);
                        owyVar.h = lezVar3;
                        view.postDelayed(lezVar3, ViewConfiguration.getLongPressTimeout());
                        owyVar.i = view;
                    } else {
                        owyVar = this;
                    }
                    zP = true;
                }
            }
            if (!owyVar.j && !zP) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final mew z(float f, float f2, int i) {
        oxv[] oxvVarArr;
        mew mewVar;
        Layout layout = this.m;
        if (layout != null && (oxvVarArr = this.P) != null && oxvVarArr.length != 0) {
            Optional optionalJ = j(f, f2);
            if (!optionalJ.isEmpty()) {
                int iIntValue = ((Integer) optionalJ.get()).intValue();
                CharSequence text = layout.getText();
                if (text instanceof Spanned) {
                    for (oxv oxvVar : (oxv[]) ((Spanned) text).getSpans(iIntValue, iIntValue, oxv.class)) {
                        if (i == 3) {
                            mew mewVar2 = oxvVar.d;
                            if (mewVar2 != null) {
                                return mewVar2;
                            }
                        } else if (i == 1 && (mewVar = oxvVar.c) != null) {
                            return mewVar;
                        }
                    }
                }
            }
        }
        return null;
    }
}

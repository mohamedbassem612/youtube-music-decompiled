package defpackage;

import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import com.google.android.libraries.multiplatform.elements.paintunit.ShaderUniformReader;
import java.util.ArrayList;
import java.util.List;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ouv implements PaintUnit {
    private static Paint d;
    public PaintUnitOwner a;
    public boolean b;
    public oun c;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private float k;
    private int e = -1;
    private final List l = new ArrayList();

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ List C(mew mewVar) {
        return null;
    }

    public final void a() {
        d();
        PaintUnitOwner paintUnitOwner = this.a;
        if (paintUnitOwner != null) {
            paintUnitOwner.G();
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void b(Canvas canvas) {
        List list = this.l;
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                ovb ovbVar = (ovb) list.get(0);
                if (Build.VERSION.SDK_INT >= 33 && canvas.isHardwareAccelerated()) {
                    ovbVar.b(canvas);
                    return;
                } else {
                    ovbVar.h();
                    ovbVar.c(canvas);
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 28) {
                for (int i = 0; i < size; i++) {
                    ovb ovbVar2 = (ovb) list.get(i);
                    ovbVar2.h();
                    ovbVar2.c(canvas);
                }
                return;
            }
            boolean z = Build.VERSION.SDK_INT < 33 || !canvas.isHardwareAccelerated();
            boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
            Shader composeShader = null;
            for (int i2 = 0; i2 < size; i2++) {
                Shader shaderA = ((ovb) list.get(i2)).a(z, zIsHardwareAccelerated);
                if (shaderA != null) {
                    composeShader = composeShader == null ? shaderA : new ComposeShader(composeShader, shaderA, PorterDuff.Mode.SRC_OVER);
                }
            }
            if (composeShader != null) {
                if (d == null) {
                    Paint paint = new Paint();
                    d = paint;
                    paint.setStyle(Paint.Style.FILL);
                    d.setAntiAlias(true);
                }
                Paint paint2 = d;
                paint2.setShader(composeShader);
                ((ovb) list.get(0)).d(canvas, paint2);
            }
        }
    }

    public final void c(float f) {
        if (this.k != f) {
            this.k = f;
            a();
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            List list = this.l;
            if (i >= list.size()) {
                return;
            }
            ((ovb) list.get(i)).e(this.f, this.g, this.h, this.i, this.j, this.k, this.b, this.c);
            i++;
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void e(boolean z) {
        if (this.j != z) {
            this.j = z;
            d();
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void f(PaintUnitOwner paintUnitOwner) {
        this.a = paintUnitOwner;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a0 A[Catch: all -> 0x00e7, TryCatch #0 {all -> 0x00e7, blocks: (B:26:0x007e, B:28:0x0084, B:30:0x008a, B:32:0x0092, B:34:0x009a, B:35:0x00a0, B:37:0x00ab, B:38:0x00af, B:41:0x00b6, B:43:0x00be, B:45:0x00c6, B:46:0x00cc, B:48:0x00d7, B:49:0x00db), top: B:55:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[Catch: all -> 0x00e7, TryCatch #0 {all -> 0x00e7, blocks: (B:26:0x007e, B:28:0x0084, B:30:0x008a, B:32:0x0092, B:34:0x009a, B:35:0x00a0, B:37:0x00ab, B:38:0x00af, B:41:0x00b6, B:43:0x00be, B:45:0x00c6, B:46:0x00cc, B:48:0x00d7, B:49:0x00db), top: B:55:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00af A[Catch: all -> 0x00e7, TryCatch #0 {all -> 0x00e7, blocks: (B:26:0x007e, B:28:0x0084, B:30:0x008a, B:32:0x0092, B:34:0x009a, B:35:0x00a0, B:37:0x00ab, B:38:0x00af, B:41:0x00b6, B:43:0x00be, B:45:0x00c6, B:46:0x00cc, B:48:0x00d7, B:49:0x00db), top: B:55:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc A[Catch: all -> 0x00e7, TryCatch #0 {all -> 0x00e7, blocks: (B:26:0x007e, B:28:0x0084, B:30:0x008a, B:32:0x0092, B:34:0x009a, B:35:0x00a0, B:37:0x00ab, B:38:0x00af, B:41:0x00b6, B:43:0x00be, B:45:0x00c6, B:46:0x00cc, B:48:0x00d7, B:49:0x00db), top: B:55:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7 A[Catch: all -> 0x00e7, TryCatch #0 {all -> 0x00e7, blocks: (B:26:0x007e, B:28:0x0084, B:30:0x008a, B:32:0x0092, B:34:0x009a, B:35:0x00a0, B:37:0x00ab, B:38:0x00af, B:41:0x00b6, B:43:0x00be, B:45:0x00c6, B:46:0x00cc, B:48:0x00d7, B:49:0x00db), top: B:55:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00db A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #0 {all -> 0x00e7, blocks: (B:26:0x007e, B:28:0x0084, B:30:0x008a, B:32:0x0092, B:34:0x009a, B:35:0x00a0, B:37:0x00ab, B:38:0x00af, B:41:0x00b6, B:43:0x00be, B:45:0x00c6, B:46:0x00cc, B:48:0x00d7, B:49:0x00db), top: B:55:0x007e }] */
    public final boolean h(mew mewVar) {
        List list;
        ova ovaVar;
        ouz ouzVar;
        long j = mewVar.c;
        int iPeekInt = (Memory.peekByte(13 + j) & 4) != 0 ? Memory.peekInt(j + 152, false) : 0;
        int i = 0;
        for (int i2 = 0; i2 < iPeekInt; i2++) {
            ShaderUniformReader shaderUniformReader = new ShaderUniformReader(i2);
            try {
                if (!shaderUniformReader.e()) {
                    int iB = shaderUniformReader.b();
                    if (iB == 1) {
                        List list2 = this.l;
                        if (i < list2.size()) {
                            Object obj = list2.get(i);
                            if (obj instanceof ouz) {
                                ((ouz) obj).f(shaderUniformReader);
                            } else {
                                ouzVar = new ouz(shaderUniformReader);
                                if (i < list2.size()) {
                                    list2.set(i, ouzVar);
                                } else {
                                    list2.add(ouzVar);
                                }
                            }
                        } else {
                            ouzVar = new ouz(shaderUniformReader);
                            if (i < list2.size()) {
                                list2.set(i, ouzVar);
                            } else {
                                list2.add(ouzVar);
                            }
                        }
                    } else if (iB == 2) {
                        List list3 = this.l;
                        if (i < list3.size()) {
                            Object obj2 = list3.get(i);
                            if (obj2 instanceof ova) {
                                ((ova) obj2).f(shaderUniformReader);
                            } else {
                                ovaVar = new ova(shaderUniformReader);
                                if (i < list3.size()) {
                                    list3.set(i, ovaVar);
                                } else {
                                    list3.add(ovaVar);
                                }
                            }
                        } else {
                            ovaVar = new ova(shaderUniformReader);
                            if (i < list3.size()) {
                                list3.set(i, ovaVar);
                            } else {
                                list3.add(ovaVar);
                            }
                        }
                    }
                    i++;
                }
                shaderUniformReader.d();
            } catch (Throwable th) {
                shaderUniformReader.d();
                throw th;
            }
        }
        while (true) {
            list = this.l;
            if (list.size() <= i) {
                break;
            }
            list.remove(list.size() - 1);
        }
        if (list.isEmpty()) {
            return false;
        }
        long j2 = mewVar.c;
        if ((Memory.peekByte(11 + j2) & 32) == 0 || Memory.peekByte(20 + j2) != 0) {
            this.k = Float.intBitsToFloat(Memory.peekInt(j2 + 44, false));
            this.b = Memory.peekByte(mewVar.c + 19) != 0;
            this.c = null;
        } else {
            this.k = 0.0f;
            this.b = false;
            this.c = oun.g(mewVar);
        }
        d();
        return true;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean ic() {
        return true;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ atoc m() {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean o(float f) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final int p() {
        return this.e;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final Rect q() {
        return new Rect(this.f, this.g, this.h, this.i);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final PaintUnitOwner r() {
        return this.a;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void t(int i, int i2, int i3, int i4) {
        if (this.f == i && this.g == i2 && this.h == i3 && this.i == i4) {
            return;
        }
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        d();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void w(int i) {
        this.e = i;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean x(long j, long j2, View view) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final boolean y(MotionEvent motionEvent, View view) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ mew z(float f, float f2, int i) {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void A() {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void B(mew mewVar) {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void v(agfr agfrVar, ovd ovdVar) {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void u(int[] iArr, float f, float f2) {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void g(int i, int i2, int i3, int i4) {
    }
}

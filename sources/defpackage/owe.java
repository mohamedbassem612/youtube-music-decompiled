package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.libraries.multiplatform.elements.shape.ShapePathJni;
import java.nio.ByteBuffer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class owe extends ouj {
    public final Path a;
    public final Matrix b;
    public final Paint c;
    public float d;
    public boolean e;

    public owe(boolean z) {
        super(false, z);
        this.a = new Path();
        this.b = new Matrix();
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = 1.0f;
        this.e = false;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-13415322);
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void B(mew mewVar) {
        super.B(mewVar);
        long j = mewVar.c;
        int iPeekInt = -13415322;
        if ((Memory.peekByte(8 + j) & 1) != 0) {
            long j2 = j + 28;
            if (Memory.peekInt(j2, false) != 0) {
                iPeekInt = Memory.peekInt(j2, false);
            }
        }
        this.c.setColor(iPeekInt);
    }

    public final void a(float f) {
        if (f <= 0.0f) {
            f = 1.0f;
        }
        this.d = f;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void b(Canvas canvas) {
        if (this.e) {
            if (this.s == 0 && this.t == 0) {
                canvas.drawPath(this.a, this.c);
            } else {
                int iSave = canvas.save();
                canvas.translate(this.s, this.t);
                canvas.drawPath(this.a, this.c);
                canvas.restoreToCount(iSave);
            }
        }
        int i = this.s;
        int i2 = this.t;
        int i3 = this.u;
        int i4 = this.v;
        oum oumVar = this.z;
        if (oumVar != null) {
            oumVar.t(i, i2, i3, i4);
            this.z.b(canvas);
        }
    }

    public final void d(atmu atmuVar) {
        boolean zB;
        long j = atmuVar.c + 8;
        boolean zB2 = false;
        if ((Memory.peekByte(j) & 2) == 0) {
            if ((Memory.peekByte(j) & 1) != 0) {
                if (atmuVar.g == null) {
                    if ((Memory.peekByte(atmuVar.c + 8) & 1) != 0) {
                        atmuVar.g = atmuVar.cq(atmw.e.b);
                    } else {
                        atmuVar.g = "";
                    }
                }
                String str = atmuVar.g;
                if (str.isEmpty()) {
                    this.a.rewind();
                    this.e = false;
                } else {
                    byte[] bArrJniParseSvgPath = ShapePathJni.jniParseSvgPath(str);
                    Path path = this.a;
                    if (bArrJniParseSvgPath == null) {
                        path.rewind();
                    } else {
                        zB2 = nur.b(ByteBuffer.wrap(bArrJniParseSvgPath), path);
                    }
                    this.e = zB2;
                    zB = zB2;
                }
            } else {
                this.a.rewind();
                this.e = false;
            }
            s();
        }
        if (atmuVar.h == null) {
            if ((Memory.peekByte(atmuVar.c + 8) & 2) != 0) {
                atmuVar.h = atmuVar.cr(atmw.f.b);
            } else {
                atmuVar.h = ByteBuffer.allocate(0);
            }
        }
        zB = nur.b(atmuVar.h.asReadOnlyBuffer(), this.a);
        this.e = zB;
        if (zB) {
            float f = this.d;
            if (f != 1.0f) {
                Matrix matrix = this.b;
                matrix.setScale(f, f);
                this.a.transform(matrix);
            }
        }
        s();
    }

    public final void h(owe oweVar) {
        this.a.set(oweVar.a);
        this.e = oweVar.e;
        this.d = oweVar.d;
        this.c.setColor(oweVar.c.getColor());
        s();
    }

    public owe() {
        this(true);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void g(int i, int i2, int i3, int i4) {
    }
}

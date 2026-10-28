package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import com.google.android.libraries.jni.UnsafeMemory;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import j$.util.Objects;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class opy extends ouj implements Drawable.Callback {
    private int B;
    private int C;
    private int D;
    private int E;
    public final oui a;
    public final ElementsServices b;
    public ehm c;
    public aswo d;
    public ehu e;
    eho f;
    private final owu g;
    private Matrix h;
    private Matrix i;
    private boolean j;
    private float k;
    private int l;
    private oqc m;
    private eho n;
    private int o;
    private int p;

    public opy(oui ouiVar, boolean z, boolean z2, ElementsServices elementsServices, owu owuVar) {
        super(z, z2);
        this.E = 1;
        this.j = false;
        this.k = 0.0f;
        this.l = 0;
        this.D = 4;
        this.a = ouiVar;
        this.b = elementsServices;
        this.g = owuVar;
    }

    private final void D() {
        ehu ehuVar;
        if (this.f == null) {
            this.f = new opx(this, 1);
        }
        if (this.n == null) {
            this.n = new opx(this, 0);
        }
        eho ehoVar = this.f;
        if (ehoVar == null || this.n == null || (ehuVar = this.e) == null) {
            return;
        }
        ehuVar.d(ehoVar);
        ehuVar.c(this.n);
    }

    private final void E(ehm ehmVar) {
        if (ehmVar != null) {
            ehmVar.s(new opw());
        }
        ehm ehmVar2 = this.c;
        if (ehmVar2 == null || ehmVar2.equals(ehmVar)) {
            this.m = null;
        }
    }

    private final void F() {
        ehm ehmVar = this.c;
        if (ehmVar != null) {
            if (qpj.g()) {
                a(ehmVar);
            } else {
                qpj.e(new msh(this, ehmVar, 14, null));
            }
        }
    }

    private final void G() {
        ehm ehmVar = this.c;
        if (ehmVar != null) {
            float f = this.k;
            if (f != 0.0f) {
                ehmVar.v(f);
            } else {
                int i = this.l;
                if (i != 0) {
                    ehmVar.r(i);
                }
            }
            if (this.D == 2) {
                if (this.k == 0.0f && this.l == 0) {
                    this.c.n();
                } else {
                    this.c.q();
                }
            }
        }
    }

    private static boolean H(aswo aswoVar) {
        if (aswoVar == null || !aswoVar.aR()) {
            return false;
        }
        long j = aswoVar.aT().c;
        byte bPeekByte = Memory.peekByte(j + 16);
        byte bPeekByte2 = Memory.peekByte(j + 17);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 1) {
            long j2 = aswoVar.aT().c;
            byte bPeekByte3 = Memory.peekByte(16 + j2);
            byte bPeekByte4 = Memory.peekByte(j2 + 17);
            byte b2 = true != z ? bPeekByte4 : bPeekByte3;
            if (true == z) {
                bPeekByte3 = bPeekByte4;
            }
            if (((short) ((b2 << 8) | (bPeekByte3 & 255))) != 2 && !aswoVar.aT().aS()) {
                return false;
            }
        }
        return true;
    }

    public static aswt j(aswo aswoVar) {
        if (H(aswoVar)) {
            return aswoVar.aT();
        }
        if (aswoVar.e == null && (Memory.peekByte(aswoVar.c + 8) & 1) != 0) {
            aswoVar.e = new aswt(aswoVar.cp(true != aswq.a ? 16 : 48, asws.a));
        }
        if (aswoVar.e != null) {
            return aswoVar.e;
        }
        mfc mfcVar = aswt.e;
        return aswr.a;
    }

    public static ors k(atoc atocVar) {
        orr orrVarB = ors.b();
        orrVarB.g = atocVar.aT();
        return orrVarB.a();
    }

    public static atoc l(ehm ehmVar) {
        atds atdsVar = new atds(null, null);
        if (ehmVar != null) {
            boolean zA = ehmVar.A();
            atdsVar.aR();
            atdsVar.bO(8, 1);
            atdsVar.bK(9, zA);
            float fC = ehmVar.c();
            atdsVar.aR();
            atdsVar.bO(8, 2);
            atdsVar.bP(12, fC);
        }
        atoc atocVar = new atoc((byte[]) null);
        mep mepVar = aswi.d;
        if (atdsVar.d) {
            atdsVar.bG();
        } else {
            atdsVar.d = true;
        }
        atocVar.aS(mepVar, new aswi(atdsVar.b));
        return atocVar;
    }

    private final Matrix n() {
        Matrix matrix = this.h;
        if (matrix != null) {
            return matrix;
        }
        Matrix matrix2 = new Matrix();
        this.h = matrix2;
        return matrix2;
    }

    public final void a(ehm ehmVar) {
        ehmVar.setCallback(null);
        ehmVar.p();
        ehmVar.o();
        ehmVar.k();
        E(ehmVar);
        if (Memory.peekByte(FlagServices.b().c + 32) != 0) {
            ehmVar.C(null);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void b(Canvas canvas) {
        boolean z;
        boolean z2 = this.x;
        int i = this.s;
        int i2 = this.t;
        int i3 = this.u;
        int i4 = this.v;
        if (z2) {
            oul oulVar = this.y;
            if (oulVar != null) {
                oulVar.t(i, i2, i3, i4);
                this.y.b(canvas);
            }
            ouv ouvVar = this.A;
            if (ouvVar != null) {
                ouvVar.t(i, i2, i3, i4);
                this.A.b(canvas);
            }
        }
        ehm ehmVar = this.c;
        if (ehmVar != null && ehmVar.a != null) {
            int i5 = this.s;
            if (i5 == 0) {
                z = false;
                if (this.t != 0) {
                    i5 = 0;
                    canvas.translate(i5, this.t);
                    z = true;
                }
            } else {
                canvas.translate(i5, this.t);
                z = true;
            }
            if (this.j && this.w) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate(-(this.u - this.s), 0.0f);
            }
            if (this.i == null) {
                this.c.draw(canvas);
            } else {
                int saveCount = canvas.getSaveCount();
                canvas.save();
                canvas.clipRect(this.o, this.p, (this.u - this.s) - this.B, (this.v - this.t) - this.C);
                canvas.concat(this.i);
                this.c.draw(canvas);
                canvas.restoreToCount(saveCount);
            }
            if (this.j && this.w) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate(this.u - this.s, 0.0f);
            }
            if (z) {
                canvas.translate(-this.s, -this.t);
            }
        }
        int i6 = this.s;
        int i7 = this.t;
        int i8 = this.u;
        int i9 = this.v;
        oum oumVar = this.z;
        if (oumVar != null) {
            oumVar.t(i6, i7, i8, i9);
            this.z.b(canvas);
        }
    }

    @Override // defpackage.ouj
    public final void c() {
        h();
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ehu ehuVar = this.e;
        if (ehuVar != null) {
            eho ehoVar = this.f;
            if (ehoVar != null) {
                ehuVar.f(ehoVar);
            }
            eho ehoVar2 = this.n;
            if (ehoVar2 != null) {
                this.e.e(ehoVar2);
            }
            this.e = null;
        }
        F();
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:141:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:150:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:151:0x02df  */
    /* JADX WARN: Code duplicated, block: B:154:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:156:0x0306 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0308  */
    /* JADX WARN: Code duplicated, block: B:160:0x0319  */
    /* JADX WARN: Code duplicated, block: B:161:0x031b  */
    /* JADX WARN: Code duplicated, block: B:163:0x031e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0328  */
    /* JADX WARN: Code duplicated, block: B:168:0x032c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0340  */
    /* JADX WARN: Code duplicated, block: B:171:0x0344 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0346  */
    /* JADX WARN: Code duplicated, block: B:173:0x0349  */
    /* JADX WARN: Code duplicated, block: B:176:0x035b  */
    /* JADX WARN: Code duplicated, block: B:177:0x035d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0360  */
    /* JADX WARN: Code duplicated, block: B:182:0x0368 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x036a  */
    /* JADX WARN: Code duplicated, block: B:184:0x036d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0380  */
    /* JADX WARN: Code duplicated, block: B:189:0x0383  */
    /* JADX WARN: Code duplicated, block: B:192:0x0395  */
    /* JADX WARN: Code duplicated, block: B:194:0x039e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:198:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:199:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:201:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x03c2  */
    public final void d(aswo aswoVar, Context context) {
        atii atiiVar;
        aswb aswbVar;
        int iPeekInt;
        int iPeekInt2;
        byte bPeekByte;
        byte bPeekByte2;
        byte b;
        int i;
        byte bPeekByte3;
        byte bPeekByte4;
        byte b2;
        int i2;
        aswe asweVar;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        byte bPeekByte5;
        byte bPeekByte6;
        byte b3;
        byte bPeekByte7;
        byte bPeekByte8;
        byte b4;
        int i3;
        String string;
        if (aswoVar.aS() || aswoVar.aR()) {
            aswo aswoVar2 = this.d;
            if (aswoVar2 == null || !aswoVar.equals(aswoVar2)) {
                F();
                this.c = new ehm();
                Optional optionalY = this.b.y();
                if (Memory.peekByte(FlagServices.b().c + 31) == 0 || optionalY.isEmpty()) {
                    E(this.c);
                } else {
                    ehm ehmVar = this.c;
                    oqc oqcVar = new oqc((opz) optionalY.get(), this.a);
                    this.m = oqcVar;
                    ehmVar.s(new oqb(oqcVar));
                }
                if (Memory.peekByte(FlagServices.b().c + 32) != 0) {
                    this.c.C(new eol(context, this.g.a));
                }
                aswt aswtVarJ = j(aswoVar);
                byte bPeekByte9 = Memory.peekByte(aswoVar.c + 12);
                long j = aswtVarJ.c;
                long j2 = j + 16;
                byte bPeekByte10 = Memory.peekByte(j2);
                long j3 = j + 17;
                byte bPeekByte11 = Memory.peekByte(j3);
                boolean z = UnsafeMemory.a;
                byte b5 = true != z ? bPeekByte11 : bPeekByte10;
                if (true == z) {
                    bPeekByte10 = bPeekByte11;
                }
                if (((short) ((b5 << 8) | (bPeekByte10 & 255))) == 1) {
                    String strAR = aswtVarJ.aR();
                    if (Memory.peekByte(aswoVar.c + 12) != 0) {
                        string = null;
                    } else {
                        int i4 = agxm.b;
                        string = agxl.a.c(j(aswoVar).aR(), StandardCharsets.UTF_8).toString();
                    }
                    if (bPeekByte9 != 0) {
                        this.e = ehd.f(strAR, null);
                    } else {
                        this.e = ehd.f(strAR, string);
                    }
                    D();
                } else {
                    byte bPeekByte12 = Memory.peekByte(j2);
                    byte bPeekByte13 = Memory.peekByte(j3);
                    byte b6 = true != z ? bPeekByte13 : bPeekByte12;
                    if (true == z) {
                        bPeekByte12 = bPeekByte13;
                    }
                    if (((short) ((b6 << 8) | (bPeekByte12 & 255))) == 2) {
                        if (aswtVarJ.g == null) {
                            long j4 = aswtVarJ.c;
                            byte bPeekByte14 = Memory.peekByte(j4 + 16);
                            byte bPeekByte15 = Memory.peekByte(j4 + 17);
                            byte b7 = true != z ? bPeekByte15 : bPeekByte14;
                            if (true == z) {
                                bPeekByte14 = bPeekByte15;
                            }
                            if (((short) ((b7 << 8) | (bPeekByte14 & 255))) == 2) {
                                aswtVarJ.g = aswtVarJ.cq(aswt.e.b);
                            } else {
                                aswtVarJ.g = "";
                            }
                        }
                        String str = aswtVarJ.g;
                        if (bPeekByte9 != 0) {
                            this.e = ehd.j(context, str, null);
                        } else {
                            this.e = ehd.i(context, str);
                        }
                        D();
                    } else {
                        if (!aswtVarJ.aS()) {
                            this.a.a(aslh.LOG_TYPE_MISSING_FIELD, "No AnimatedVectorTypeSource provided for AnimatedVectorType.");
                            return;
                        }
                        if (aswtVarJ.h == null) {
                            long j5 = aswtVarJ.c;
                            byte bPeekByte16 = Memory.peekByte(j5 + 16);
                            byte bPeekByte17 = Memory.peekByte(j5 + 17);
                            byte b8 = true != z ? bPeekByte17 : bPeekByte16;
                            if (true == z) {
                                bPeekByte16 = bPeekByte17;
                            }
                            if (((short) ((b8 << 8) | (bPeekByte16 & 255))) == 3) {
                                aswtVarJ.h = new atii(aswtVarJ.cp(true != aswt.a ? 20 : 24, atih.a));
                            }
                        }
                        if (aswtVarJ.h == null) {
                            int i5 = atii.f;
                            atiiVar = atig.a;
                        } else {
                            atiiVar = aswtVarJ.h;
                        }
                        int iA = npy.a(context, "raw", atiiVar.aR());
                        if (bPeekByte9 != 0) {
                            this.e = ehd.h(context, iA, null);
                        } else {
                            this.e = ehd.g(context, iA);
                        }
                        D();
                    }
                }
                ehm ehmVar2 = this.c;
                ThreadLocal threadLocal = enm.a;
                float fIntBitsToFloat3 = 1.0f;
                ehmVar2.y(Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f));
                this.c.setCallback(this);
                this.c.h(new pr(this, 15, null));
                long j6 = aswoVar.c;
                boolean z2 = aswq.a;
                int iBc = a.bc(Memory.peekInt(j6 + (true != z2 ? 36L : 32L), false));
                if (iBc == 0) {
                    iBc = 1;
                }
                this.E = iBc;
                ehm ehmVar3 = this.c;
                if ((Memory.peekByte(aswoVar.c + 8) & 8) != 0) {
                    fIntBitsToFloat3 = Float.intBitsToFloat(Memory.peekInt(j6 + (true != z2 ? 24L : 20L), false));
                }
                ehmVar3.x(fIntBitsToFloat3);
                this.c.b.setRepeatCount(Memory.peekByte(aswoVar.c + 10) == 0 ? 0 : -1);
                this.j = Memory.peekByte(aswoVar.c + 11) != 0;
                orq orqVarL = this.b.l();
                if (aswoVar.g != null) {
                    if (aswoVar.g == null) {
                        if (true != z2) {
                            i = 64;
                        } else {
                            i = 36;
                        }
                        long j7 = aswoVar.c + ((long) i);
                        bPeekByte3 = Memory.peekByte(j7);
                        bPeekByte4 = Memory.peekByte(j7 + 1);
                        if (true != z) {
                            b2 = bPeekByte4;
                        } else {
                            b2 = bPeekByte3;
                        }
                        if (true == z) {
                            bPeekByte3 = bPeekByte4;
                        }
                        if (((short) ((b2 << 8) | (bPeekByte3 & 255))) == 9) {
                            if (true != z2) {
                                i2 = 68;
                            } else {
                                i2 = 104;
                            }
                            aswoVar.g = new aswb(aswoVar.cp(i2, aswa.a));
                        }
                    }
                    if (aswoVar.g == null) {
                        aswbVar = asvz.a;
                    } else {
                        aswbVar = aswoVar.g;
                    }
                    long j8 = aswbVar.c;
                    iPeekInt = Memory.peekInt(j8 + 12, false);
                    iPeekInt2 = Memory.peekInt(j8 + 16, false);
                    if (iPeekInt <= iPeekInt2) {
                        this.c.t(iPeekInt, iPeekInt2);
                        if (aswoVar.j != null) {
                            long j9 = aswoVar.c + ((long) (true == z2 ? 40 : 72));
                            bPeekByte = Memory.peekByte(j9);
                            bPeekByte2 = Memory.peekByte(j9 + 1);
                            if (true != z) {
                                b = bPeekByte2;
                            } else {
                                b = bPeekByte;
                            }
                            if (true == z) {
                                bPeekByte = bPeekByte2;
                            }
                            if (((short) ((b << 8) | (bPeekByte & 255))) == 11) {
                                if (iPeekInt != iPeekInt2) {
                                    this.c.g(new mib(new lez((Object) this, (Object) orqVarL, (Object) aswoVar, 7, (short[]) null)));
                                }
                            }
                        } else if (iPeekInt != iPeekInt2) {
                            this.c.g(new mib(new lez((Object) this, (Object) orqVarL, (Object) aswoVar, 7, (short[]) null)));
                        }
                    }
                } else {
                    long j10 = true != z2 ? 64 : 36;
                    long j11 = aswoVar.c + j10;
                    byte bPeekByte18 = Memory.peekByte(j11);
                    byte bPeekByte19 = Memory.peekByte(j11 + 1);
                    byte b9 = true != z ? bPeekByte19 : bPeekByte18;
                    if (true == z) {
                        bPeekByte18 = bPeekByte19;
                    }
                    if (((short) ((b9 << 8) | (bPeekByte18 & 255))) == 9) {
                        if (aswoVar.g == null) {
                            if (true != z2) {
                                i = 64;
                            } else {
                                i = 36;
                            }
                            long j12 = aswoVar.c + ((long) i);
                            bPeekByte3 = Memory.peekByte(j12);
                            bPeekByte4 = Memory.peekByte(j12 + 1);
                            if (true != z) {
                                b2 = bPeekByte4;
                            } else {
                                b2 = bPeekByte3;
                            }
                            if (true == z) {
                                bPeekByte3 = bPeekByte4;
                            }
                            if (((short) ((b2 << 8) | (bPeekByte3 & 255))) == 9) {
                                if (true != z2) {
                                    i2 = 68;
                                } else {
                                    i2 = 104;
                                }
                                aswoVar.g = new aswb(aswoVar.cp(i2, aswa.a));
                            }
                        }
                        if (aswoVar.g == null) {
                            aswbVar = asvz.a;
                        } else {
                            aswbVar = aswoVar.g;
                        }
                        long j13 = aswbVar.c;
                        iPeekInt = Memory.peekInt(j13 + 12, false);
                        iPeekInt2 = Memory.peekInt(j13 + 16, false);
                        if (iPeekInt <= iPeekInt2) {
                            this.c.t(iPeekInt, iPeekInt2);
                            if (aswoVar.j != null) {
                                long j14 = aswoVar.c + ((long) (true == z2 ? 40 : 72));
                                bPeekByte = Memory.peekByte(j14);
                                bPeekByte2 = Memory.peekByte(j14 + 1);
                                if (true != z) {
                                    b = bPeekByte2;
                                } else {
                                    b = bPeekByte;
                                }
                                if (true == z) {
                                    bPeekByte = bPeekByte2;
                                }
                                if (((short) ((b << 8) | (bPeekByte & 255))) == 11) {
                                    if (iPeekInt != iPeekInt2) {
                                        this.c.g(new mib(new lez((Object) this, (Object) orqVarL, (Object) aswoVar, 7, (short[]) null)));
                                    }
                                }
                            } else if (iPeekInt != iPeekInt2) {
                                this.c.g(new mib(new lez((Object) this, (Object) orqVarL, (Object) aswoVar, 7, (short[]) null)));
                            }
                        }
                    } else if (aswoVar.f == null) {
                        long j15 = aswoVar.c + j10;
                        byte bPeekByte20 = Memory.peekByte(j15);
                        byte bPeekByte21 = Memory.peekByte(j15 + 1);
                        byte b10 = true != z ? bPeekByte21 : bPeekByte20;
                        if (true == z) {
                            bPeekByte20 = bPeekByte21;
                        }
                        if (((short) ((b10 << 8) | (bPeekByte20 & 255))) == 8) {
                            if (aswoVar.f == null) {
                                long j16 = aswoVar.c + j10;
                                bPeekByte7 = Memory.peekByte(j16);
                                bPeekByte8 = Memory.peekByte(j16 + 1);
                                if (true != z) {
                                    b4 = bPeekByte8;
                                } else {
                                    b4 = bPeekByte7;
                                }
                                if (true == z) {
                                    bPeekByte7 = bPeekByte8;
                                }
                                if (((short) ((b4 << 8) | (bPeekByte7 & 255))) == 8) {
                                    if (true != z2) {
                                        i3 = 68;
                                    } else {
                                        i3 = 104;
                                    }
                                    aswoVar.f = new aswe(aswoVar.cp(i3, aswd.a));
                                }
                            }
                            if (aswoVar.f == null) {
                                asweVar = aswc.a;
                            } else {
                                asweVar = aswoVar.f;
                            }
                            fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(asweVar.c + 12, false));
                            fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(asweVar.c + 16, false));
                            if (fIntBitsToFloat <= fIntBitsToFloat2) {
                                this.c.u(fIntBitsToFloat, fIntBitsToFloat2);
                                if (aswoVar.i != null) {
                                    long j17 = aswoVar.c + ((long) (true == z2 ? 40 : 72));
                                    bPeekByte5 = Memory.peekByte(j17);
                                    bPeekByte6 = Memory.peekByte(j17 + 1);
                                    if (true != z) {
                                        b3 = bPeekByte6;
                                    } else {
                                        b3 = bPeekByte5;
                                    }
                                    if (true == z) {
                                        bPeekByte5 = bPeekByte6;
                                    }
                                    if (((short) ((b3 << 8) | (bPeekByte5 & 255))) == 10) {
                                        if (fIntBitsToFloat != fIntBitsToFloat2) {
                                            this.c.g(new mib(new lez((Object) this, (Object) orqVarL, (Object) aswoVar, 8, (short[]) null)));
                                        }
                                    }
                                } else if (fIntBitsToFloat != fIntBitsToFloat2) {
                                    this.c.g(new mib(new lez((Object) this, (Object) orqVarL, (Object) aswoVar, 8, (short[]) null)));
                                }
                            }
                        }
                    } else {
                        if (aswoVar.f == null) {
                            long j18 = aswoVar.c + j10;
                            bPeekByte7 = Memory.peekByte(j18);
                            bPeekByte8 = Memory.peekByte(j18 + 1);
                            if (true != z) {
                                b4 = bPeekByte8;
                            } else {
                                b4 = bPeekByte7;
                            }
                            if (true == z) {
                                bPeekByte7 = bPeekByte8;
                            }
                            if (((short) ((b4 << 8) | (bPeekByte7 & 255))) == 8) {
                                if (true != z2) {
                                    i3 = 68;
                                } else {
                                    i3 = 104;
                                }
                                aswoVar.f = new aswe(aswoVar.cp(i3, aswd.a));
                            }
                        }
                        if (aswoVar.f == null) {
                            asweVar = aswc.a;
                        } else {
                            asweVar = aswoVar.f;
                        }
                        fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(asweVar.c + 12, false));
                        fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(asweVar.c + 16, false));
                        if (fIntBitsToFloat <= fIntBitsToFloat2) {
                            this.c.u(fIntBitsToFloat, fIntBitsToFloat2);
                            if (aswoVar.i != null) {
                                long j19 = aswoVar.c + ((long) (true == z2 ? 40 : 72));
                                bPeekByte5 = Memory.peekByte(j19);
                                bPeekByte6 = Memory.peekByte(j19 + 1);
                                if (true != z) {
                                    b3 = bPeekByte6;
                                } else {
                                    b3 = bPeekByte5;
                                }
                                if (true == z) {
                                    bPeekByte5 = bPeekByte6;
                                }
                                if (((short) ((b3 << 8) | (bPeekByte5 & 255))) == 10) {
                                    if (fIntBitsToFloat != fIntBitsToFloat2) {
                                        this.c.g(new mib(new lez((Object) this, (Object) orqVarL, (Object) aswoVar, 8, (short[]) null)));
                                    }
                                }
                            } else if (fIntBitsToFloat != fIntBitsToFloat2) {
                                this.c.g(new mib(new lez((Object) this, (Object) orqVarL, (Object) aswoVar, 8, (short[]) null)));
                            }
                        }
                    }
                }
                this.k = Float.intBitsToFloat(Memory.peekInt(aswoVar.c + (true != z2 ? 20L : 16L), false));
                long j20 = aswoVar.c;
                this.l = Memory.peekInt(j20 + (true != z2 ? 28L : 24L), false);
                int iAV = a.aV(Memory.peekInt(j20 + (true != z2 ? 32L : 28L), false));
                this.D = iAV != 0 ? iAV : 1;
                this.d = aswoVar;
                if (this.q != null) {
                    G();
                    s();
                }
            }
        }
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void e(boolean z) {
        if (this.w != z) {
            super.e(z);
            PaintUnitOwner paintUnitOwner = this.q;
            if (paintUnitOwner != null) {
                paintUnitOwner.H();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof opy) {
            opy opyVar = (opy) obj;
            aswo aswoVar = this.d;
            if (aswoVar != null) {
                return aswoVar.equals(opyVar.d);
            }
            if (opyVar.d == null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void f(PaintUnitOwner paintUnitOwner) {
        super.f(paintUnitOwner);
        if (paintUnitOwner != null) {
            paintUnitOwner.k(this);
            if (this.c != null) {
                G();
                paintUnitOwner.G();
            }
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void g(int i, int i2, int i3, int i4) {
        this.o = i;
        this.p = i2;
        this.B = i3;
        this.C = i4;
        h();
    }

    public final void h() {
        int i;
        float f;
        float f2;
        ehm ehmVar = this.c;
        if (ehmVar == null || ehmVar.a == null) {
            return;
        }
        int intrinsicWidth = ehmVar.getIntrinsicWidth();
        int intrinsicHeight = this.c.getIntrinsicHeight();
        int i2 = ((this.u - this.s) - this.o) - this.B;
        int i3 = ((this.v - this.t) - this.p) - this.C;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || (i = this.E) == 2 || (i == 1 && H(this.d))) {
            this.c.setBounds(this.o, this.p, (this.u - this.s) - this.B, (this.v - this.t) - this.C);
            this.i = null;
            return;
        }
        this.c.setBounds(this.o, this.p, intrinsicWidth - this.B, intrinsicHeight - this.C);
        if (intrinsicWidth == i2 && intrinsicHeight == i3) {
            this.i = null;
            return;
        }
        int i4 = this.E;
        if (i4 == 5) {
            Matrix matrixN = n();
            this.i = matrixN;
            matrixN.setTranslate(Math.round((i2 - intrinsicWidth) * 0.5f), Math.round((i3 - intrinsicHeight) * 0.5f));
            return;
        }
        if (i4 != 4) {
            if (i4 == 3 || i4 == 1) {
                float f3 = intrinsicWidth;
                float f4 = i2;
                float f5 = intrinsicHeight;
                float f6 = i3;
                this.i = n();
                float fMin = (intrinsicWidth > i2 || intrinsicHeight > i3) ? Math.min(f4 / f3, f6 / f5) : 1.0f;
                float fRound = Math.round((f4 - (f3 * fMin)) * 0.5f);
                float fRound2 = Math.round((f6 - (f5 * fMin)) * 0.5f);
                this.i.setScale(fMin, fMin);
                this.i.postTranslate(fRound, fRound2);
                return;
            }
            return;
        }
        float f7 = intrinsicWidth;
        float f8 = i2;
        float f9 = intrinsicHeight;
        float f10 = i3;
        Matrix matrixN2 = n();
        this.i = matrixN2;
        int i5 = i2 * intrinsicHeight;
        float f11 = 0.0f;
        if (intrinsicWidth * i3 > i5) {
            float f12 = f10 / f9;
            float f13 = (f8 - (f7 * f12)) * 0.5f;
            f = f12;
            f2 = 0.0f;
            f11 = f13;
        } else {
            f = f8 / f7;
            f2 = (f10 - (f9 * f)) * 0.5f;
        }
        matrixN2.setScale(f, f);
        this.i.postTranslate(Math.round(f11), Math.round(f2));
    }

    public final int hashCode() {
        return Objects.hashCode(this.d);
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final boolean i() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        s();
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final atoc m() {
        return l(this.c);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        PaintUnitOwner paintUnitOwner = this.q;
        if (paintUnitOwner != null) {
            paintUnitOwner.il(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        PaintUnitOwner paintUnitOwner = this.q;
        if (paintUnitOwner != null) {
            paintUnitOwner.im(drawable, runnable);
        }
    }
}

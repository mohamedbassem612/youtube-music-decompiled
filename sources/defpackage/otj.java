package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.jni.UnsafeMemory;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class otj implements opd {
    private final oui a;

    public otj(oui ouiVar) {
        this.a = ouiVar;
    }

    private static final void e(Drawable drawable, atah atahVar) {
        PorterDuff.Mode mode;
        BlendMode blendMode;
        if (Build.VERSION.SDK_INT >= 29) {
            int iPeekInt = Memory.peekInt(atahVar.c + 12, false);
            switch (atahVar.aR() - 1) {
                case 1:
                    blendMode = BlendMode.DST_ATOP;
                    break;
                case 2:
                    blendMode = BlendMode.DST_IN;
                    break;
                case 3:
                    blendMode = BlendMode.DST_OUT;
                    break;
                case 4:
                    blendMode = BlendMode.DST_OVER;
                    break;
                case 5:
                    blendMode = BlendMode.SRC_ATOP;
                    break;
                case 6:
                default:
                    blendMode = BlendMode.SRC_IN;
                    break;
                case 7:
                    blendMode = BlendMode.SRC_OUT;
                    break;
                case 8:
                    blendMode = BlendMode.SRC_OVER;
                    break;
                case 9:
                    blendMode = BlendMode.PLUS;
                    break;
                case 10:
                    blendMode = BlendMode.DARKEN;
                    break;
                case 11:
                    blendMode = BlendMode.LIGHTEN;
                    break;
                case 12:
                    blendMode = BlendMode.MULTIPLY;
                    break;
                case 13:
                    blendMode = BlendMode.OVERLAY;
                    break;
                case 14:
                    blendMode = BlendMode.SCREEN;
                    break;
                case 15:
                    blendMode = BlendMode.XOR;
                    break;
                case 16:
                    blendMode = BlendMode.CLEAR;
                    break;
            }
            drawable.setColorFilter(new BlendModeColorFilter(iPeekInt, blendMode));
            return;
        }
        int iPeekInt2 = Memory.peekInt(atahVar.c + 12, false);
        switch (atahVar.aR() - 1) {
            case 1:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case 2:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case 3:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case 4:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 6:
            default:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 7:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case 8:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 9:
                mode = PorterDuff.Mode.ADD;
                break;
            case 10:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case 11:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            case 12:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 13:
                mode = PorterDuff.Mode.OVERLAY;
                break;
            case 14:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 15:
                mode = PorterDuff.Mode.XOR;
                break;
            case 16:
                mode = PorterDuff.Mode.CLEAR;
                break;
        }
        drawable.setColorFilter(iPeekInt2, mode);
    }

    @Override // defpackage.opd
    public final /* bridge */ /* synthetic */ Drawable b(met metVar, Drawable drawable, ImageView.ScaleType scaleType, ElementsServices elementsServices) {
        float fIntBitsToFloat;
        aszv aszvVar = (aszv) metVar;
        if (drawable instanceof BitmapDrawable) {
            return a(aszvVar, ((BitmapDrawable) drawable).getBitmap(), scaleType, elementsServices);
        }
        if (drawable instanceof VectorDrawable) {
            VectorDrawable vectorDrawable = (VectorDrawable) drawable;
            if (!aszvVar.aS()) {
                return drawable;
            }
            e(vectorDrawable, aszvVar.aW());
            return drawable;
        }
        if (!(drawable instanceof FrameSequenceDrawable)) {
            return drawable;
        }
        FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
        boolean z = aszx.a;
        long j = aszvVar.c + ((long) (true != z ? 44 : 24));
        long j2 = 1 + j;
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(j2);
        boolean z2 = UnsafeMemory.a;
        byte b = true != z2 ? bPeekByte2 : bPeekByte;
        if (true == z2) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 3) {
            return drawable;
        }
        byte bPeekByte3 = Memory.peekByte(j);
        byte bPeekByte4 = Memory.peekByte(j2);
        byte b2 = true != z2 ? bPeekByte4 : bPeekByte3;
        if (true == z2) {
            bPeekByte3 = bPeekByte4;
        }
        if (((short) ((b2 << 8) | (bPeekByte3 & 255))) == 3) {
            fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(aszvVar.c + (true != z ? 48L : 28L), false));
        } else {
            fIntBitsToFloat = 0.0f;
        }
        frameSequenceDrawable.setCornerRadius((int) (fIntBitsToFloat * elementsServices.a()));
        return drawable;
    }

    @Override // defpackage.opd
    public final mep c() {
        return aszv.d;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:178:0x033b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:247:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:248:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:251:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:252:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:257:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:259:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:260:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:262:0x050e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0529  */
    /* JADX WARN: Code duplicated, block: B:266:0x052b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x0118  */
    /* JADX WARN: Code duplicated, block: B:68:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x013f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Code duplicated, block: B:82:0x0165  */
    /* JADX WARN: Code duplicated, block: B:85:0x0179  */
    /* JADX WARN: Code duplicated, block: B:86:0x017b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0182  */
    /* JADX WARN: Code duplicated, block: B:92:0x018a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:98:0x019a  */
    @Override // defpackage.opd
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Drawable a(aszv aszvVar, Bitmap bitmap, ImageView.ScaleType scaleType, ElementsServices elementsServices) {
        byte bPeekByte;
        byte bPeekByte2;
        byte b;
        float fIntBitsToFloat;
        float fA;
        atnd atndVar;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        int i;
        int i2;
        long j11;
        boolean z;
        float[] fArr;
        PointF pointF;
        PointF pointF2;
        int i3;
        boolean z2;
        int i4;
        byte bPeekByte3;
        byte bPeekByte4;
        byte b2;
        boolean z3;
        float fIntBitsToFloat2;
        boolean z4;
        long j12;
        oti otiVar = new oti(bitmap, scaleType, this.a);
        boolean z5 = aszx.a;
        long j13 = aszvVar.c + ((long) (true != z5 ? 44 : 24));
        long j14 = j13 + 1;
        byte bPeekByte5 = Memory.peekByte(j13);
        byte bPeekByte6 = Memory.peekByte(j14);
        boolean z6 = UnsafeMemory.a;
        byte b3 = true != z6 ? bPeekByte6 : bPeekByte5;
        if (true == z6) {
            bPeekByte5 = bPeekByte6;
        }
        if (((short) ((b3 << 8) | (bPeekByte5 & 255))) != 4) {
            bPeekByte = Memory.peekByte(j13);
            bPeekByte2 = Memory.peekByte(j14);
            if (true != z6) {
                b = bPeekByte2;
            } else {
                b = bPeekByte;
            }
            if (true == z6) {
                bPeekByte = bPeekByte2;
            }
            if (((short) ((b << 8) | (bPeekByte & 255))) == 3) {
                long j15 = aszvVar.c;
                if (true != z5) {
                    j11 = 48;
                } else {
                    j11 = 28;
                }
                fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(j15 + j11, false));
            } else {
                fIntBitsToFloat = 0.0f;
            }
            fA = fIntBitsToFloat * elementsServices.a();
            if (fA < 0.5d) {
                otiVar.m = 1;
                otiVar.a();
            } else {
                if (aszvVar.g == null) {
                    if (true != z5) {
                        i2 = 28;
                    } else {
                        i2 = 48;
                    }
                    aszvVar.g = new atnd(aszvVar.cp(i2, atnc.a));
                }
                if (aszvVar.g == null) {
                    atndVar = atnb.a;
                } else {
                    atndVar = aszvVar.g;
                }
                j = atndVar.c + 8;
                if ((Memory.peekByte(j) & 1) != 0) {
                    j2 = atndVar.c;
                    j3 = 9 + j2;
                    if (Memory.peekByte(j3) != 0) {
                        j4 = j2 + 15;
                        j5 = j2 + 16;
                        j6 = j2 + 14;
                        j7 = j2 + 13;
                        if (Memory.peekByte(j7) != 0) {
                        }
                        j8 = 11 + j2;
                        j9 = j2 + 12;
                        j10 = j2 + 10;
                        if (Memory.peekByte(j3) != 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (Memory.peekByte(j10) != 0) {
                            i |= 2;
                        }
                        if (Memory.peekByte(j9) != 0) {
                            i |= 8;
                        }
                        if (Memory.peekByte(j8) != 0) {
                            i |= 4;
                        }
                        if (Memory.peekByte(j7) != 0) {
                            i |= 16;
                        }
                        if (Memory.peekByte(j6) != 0) {
                            i |= 32;
                        }
                        if (Memory.peekByte(j5) != 0) {
                            i |= SemanticState.Focused;
                        }
                        if (Memory.peekByte(j4) != 0) {
                            i |= 64;
                        }
                        otiVar.m = 4;
                        otiVar.h = fA;
                        otiVar.i = (short) i;
                        if (otiVar.j == null) {
                            otiVar.j = new float[8];
                        }
                        if (otiVar.k == null) {
                            otiVar.k = new Path();
                        }
                        otiVar.b();
                    } else {
                        j4 = j2 + 15;
                        j5 = j2 + 16;
                        j6 = j2 + 14;
                        j7 = j2 + 13;
                        if (Memory.peekByte(j7) != 0) {
                        }
                        j8 = 11 + j2;
                        j9 = j2 + 12;
                        j10 = j2 + 10;
                        if (Memory.peekByte(j3) != 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (Memory.peekByte(j10) != 0) {
                            i |= 2;
                        }
                        if (Memory.peekByte(j9) != 0) {
                            i |= 8;
                        }
                        if (Memory.peekByte(j8) != 0) {
                            i |= 4;
                        }
                        if (Memory.peekByte(j7) != 0) {
                            i |= 16;
                        }
                        if (Memory.peekByte(j6) != 0) {
                            i |= 32;
                        }
                        if (Memory.peekByte(j5) != 0) {
                            i |= SemanticState.Focused;
                        }
                        if (Memory.peekByte(j4) != 0) {
                            i |= 64;
                        }
                        otiVar.m = 4;
                        otiVar.h = fA;
                        otiVar.i = (short) i;
                        if (otiVar.j == null) {
                            otiVar.j = new float[8];
                        }
                        if (otiVar.k == null) {
                            otiVar.k = new Path();
                        }
                        otiVar.b();
                    }
                } else {
                    j2 = atndVar.c;
                    j3 = 9 + j2;
                    if (Memory.peekByte(j3) != 0) {
                        j4 = j2 + 15;
                        j5 = j2 + 16;
                        j6 = j2 + 14;
                        j7 = j2 + 13;
                        if (Memory.peekByte(j7) != 0) {
                        }
                        j8 = 11 + j2;
                        j9 = j2 + 12;
                        j10 = j2 + 10;
                        if (Memory.peekByte(j3) != 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (Memory.peekByte(j10) != 0) {
                            i |= 2;
                        }
                        if (Memory.peekByte(j9) != 0) {
                            i |= 8;
                        }
                        if (Memory.peekByte(j8) != 0) {
                            i |= 4;
                        }
                        if (Memory.peekByte(j7) != 0) {
                            i |= 16;
                        }
                        if (Memory.peekByte(j6) != 0) {
                            i |= 32;
                        }
                        if (Memory.peekByte(j5) != 0) {
                            i |= SemanticState.Focused;
                        }
                        if (Memory.peekByte(j4) != 0) {
                            i |= 64;
                        }
                        otiVar.m = 4;
                        otiVar.h = fA;
                        otiVar.i = (short) i;
                        if (otiVar.j == null) {
                            otiVar.j = new float[8];
                        }
                        if (otiVar.k == null) {
                            otiVar.k = new Path();
                        }
                        otiVar.b();
                    } else {
                        j4 = j2 + 15;
                        j5 = j2 + 16;
                        j6 = j2 + 14;
                        j7 = j2 + 13;
                        if (Memory.peekByte(j7) != 0) {
                        }
                        j8 = 11 + j2;
                        j9 = j2 + 12;
                        j10 = j2 + 10;
                        if (Memory.peekByte(j3) != 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (Memory.peekByte(j10) != 0) {
                            i |= 2;
                        }
                        if (Memory.peekByte(j9) != 0) {
                            i |= 8;
                        }
                        if (Memory.peekByte(j8) != 0) {
                            i |= 4;
                        }
                        if (Memory.peekByte(j7) != 0) {
                            i |= 16;
                        }
                        if (Memory.peekByte(j6) != 0) {
                            i |= 32;
                        }
                        if (Memory.peekByte(j5) != 0) {
                            i |= SemanticState.Focused;
                        }
                        if (Memory.peekByte(j4) != 0) {
                            i |= 64;
                        }
                        otiVar.m = 4;
                        otiVar.h = fA;
                        otiVar.i = (short) i;
                        if (otiVar.j == null) {
                            otiVar.j = new float[8];
                        }
                        if (otiVar.k == null) {
                            otiVar.k = new Path();
                        }
                        otiVar.b();
                    }
                }
            }
        } else if (Memory.peekByte(aszvVar.c + ((long) (true != z5 ? 48 : 28))) != 0) {
            otiVar.m = 2;
            otiVar.a();
        } else {
            bPeekByte = Memory.peekByte(j13);
            bPeekByte2 = Memory.peekByte(j14);
            if (true != z6) {
                b = bPeekByte2;
            } else {
                b = bPeekByte;
            }
            if (true == z6) {
                bPeekByte = bPeekByte2;
            }
            if (((short) ((b << 8) | (bPeekByte & 255))) == 3) {
                long j16 = aszvVar.c;
                if (true != z5) {
                    j11 = 48;
                } else {
                    j11 = 28;
                }
                fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(j16 + j11, false));
            } else {
                fIntBitsToFloat = 0.0f;
            }
            fA = fIntBitsToFloat * elementsServices.a();
            if (fA < 0.5d) {
                otiVar.m = 1;
                otiVar.a();
            } else {
                if (aszvVar.g == null && (Memory.peekByte(aszvVar.c + 8) & 16) != 0) {
                    if (true != z5) {
                        i2 = 28;
                    } else {
                        i2 = 48;
                    }
                    aszvVar.g = new atnd(aszvVar.cp(i2, atnc.a));
                }
                if (aszvVar.g == null) {
                    atndVar = atnb.a;
                } else {
                    atndVar = aszvVar.g;
                }
                j = atndVar.c + 8;
                if ((Memory.peekByte(j) & 1) != 0 && (Memory.peekByte(j) & 2) == 0 && (Memory.peekByte(j) & 4) == 0 && (Memory.peekByte(j) & 8) == 0 && (Memory.peekByte(j) & 16) == 0 && (Memory.peekByte(j) & 32) == 0 && (Memory.peekByte(j) & 64) == 0 && (Memory.peekByte(j) & 128) == 0) {
                    otiVar.m = 3;
                    otiVar.h = fA;
                    otiVar.a();
                } else {
                    j2 = atndVar.c;
                    j3 = 9 + j2;
                    if (Memory.peekByte(j3) != 0 || Memory.peekByte(j2 + 10) == 0 || Memory.peekByte(j2 + 12) == 0 || Memory.peekByte(j2 + 11) == 0) {
                        j4 = j2 + 15;
                        j5 = j2 + 16;
                        j6 = j2 + 14;
                        j7 = j2 + 13;
                        if (Memory.peekByte(j7) != 0 || Memory.peekByte(j6) == 0 || Memory.peekByte(j4) == 0 || Memory.peekByte(j5) == 0) {
                            j8 = 11 + j2;
                            j9 = j2 + 12;
                            j10 = j2 + 10;
                            if (Memory.peekByte(j3) != 0) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            if (Memory.peekByte(j10) != 0) {
                                i |= 2;
                            }
                            if (Memory.peekByte(j9) != 0) {
                                i |= 8;
                            }
                            if (Memory.peekByte(j8) != 0) {
                                i |= 4;
                            }
                            if (Memory.peekByte(j7) != 0) {
                                i |= 16;
                            }
                            if (Memory.peekByte(j6) != 0) {
                                i |= 32;
                            }
                            if (Memory.peekByte(j5) != 0) {
                                i |= SemanticState.Focused;
                            }
                            if (Memory.peekByte(j4) != 0) {
                                i |= 64;
                            }
                            otiVar.m = 4;
                            otiVar.h = fA;
                            otiVar.i = (short) i;
                            if (otiVar.j == null) {
                                otiVar.j = new float[8];
                            }
                            if (otiVar.k == null) {
                                otiVar.k = new Path();
                            }
                            otiVar.b();
                        } else {
                            otiVar.m = 3;
                            otiVar.h = fA;
                            otiVar.a();
                        }
                    } else {
                        otiVar.m = 3;
                        otiVar.h = fA;
                        otiVar.a();
                    }
                }
            }
        }
        if ((Memory.peekByte(aszvVar.c + 8) & 32) != 0) {
            int iPeekInt = Memory.peekInt(aszvVar.c + (true != z5 ? 32L : 20L), false);
            otiVar.c = iPeekInt;
            if (otiVar.a == null) {
                otiVar.a = new Paint();
                otiVar.a.setAntiAlias(true);
            }
            otiVar.a.setColor(iPeekInt);
            if (otiVar.e < 255) {
                otiVar.a.setAlpha((Color.alpha(iPeekInt) * otiVar.e) / 255);
            }
        }
        long j17 = aszvVar.c + 8;
        if ((Memory.peekByte(j17) & 1) != 0 && (Memory.peekByte(j17) & 2) != 0) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(Memory.peekInt(aszvVar.c + 12, false)) * elementsServices.a();
            int iPeekInt2 = Memory.peekInt(aszvVar.c + 16, false);
            otiVar.d = iPeekInt2;
            if (otiVar.b == null) {
                otiVar.b = new Paint();
                otiVar.b.setStyle(Paint.Style.STROKE);
                otiVar.b.setAntiAlias(true);
            }
            otiVar.b.setColor(iPeekInt2);
            if (otiVar.e < 255) {
                otiVar.b.setAlpha((Color.alpha(iPeekInt2) * otiVar.e) / 255);
            }
            otiVar.b.setStrokeWidth(fIntBitsToFloat3);
            otiVar.f = (int) (fIntBitsToFloat3 * 0.5f);
        }
        if (aszvVar.aR()) {
            float fIntBitsToFloat4 = Float.intBitsToFloat(Memory.peekInt(aszvVar.aU().c + 12, false)) * elementsServices.a();
            if (fIntBitsToFloat4 > 0.01d && Build.VERSION.SDK_INT >= 31) {
                if (otiVar.g == null) {
                    otiVar.g = new RenderNode("BorderImageProcessor");
                    otiVar.g.setRenderEffect(RenderEffect.createBlurEffect(fIntBitsToFloat4, fIntBitsToFloat4, Shader.TileMode.CLAMP));
                }
                if (otiVar.k == null) {
                    otiVar.k = new Path();
                }
                otiVar.a();
            }
        }
        if (aszvVar.aS()) {
            e(otiVar, aszvVar.aW());
        }
        if (aszvVar.aT()) {
            atad atadVarAV = aszvVar.aV();
            float fA2 = elementsServices.a();
            int iAR = atadVarAV.aR();
            if (iAR == 0) {
                otiVar.u.a(aslh.LOG_TYPE_MISSING_FIELD, "Linear Gradient colors is null and linear gradient cannot be applied");
                return otiVar;
            }
            if (iAR < 2) {
                otiVar.u.a(aslh.LOG_TYPE_INVALID_FIELD, "There should be minimum 2 colors to apply linear gradient");
                return otiVar;
            }
            if (atadVarAV.f != null) {
                z = true;
            } else {
                long j18 = atadVarAV.c + ((long) (true != atad.a ? 16 : 8));
                long j19 = j18 + 1;
                byte bPeekByte7 = Memory.peekByte(j18);
                byte bPeekByte8 = Memory.peekByte(j19);
                byte b4 = true != z6 ? bPeekByte8 : bPeekByte7;
                if (true == z6) {
                    bPeekByte7 = bPeekByte8;
                }
                if (((short) ((b4 << 8) | (bPeekByte7 & 255))) != 4) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                ataa ataaVarAU = atadVarAV.aU();
                boolean z7 = (ataaVarAU.e == null && (Memory.peekByte(ataaVarAU.c + 8) & 2) == 0) ? false : true;
                ataa ataaVarAU2 = atadVarAV.aU();
                if (z7 != ((ataaVarAU2.d == null && (Memory.peekByte(ataaVarAU2.c + 8) & 1) == 0) ? false : true)) {
                    otiVar.u.a(aslh.LOG_TYPE_MISSING_FIELD, "LinearGradient line should have both start and end values.");
                    return otiVar;
                }
            }
            atadVarAV.aT();
            int size = atadVarAV.e.size();
            int iAR2 = atadVarAV.aR();
            if (size > 0) {
                float[] fArr2 = new float[size];
                for (int i5 = 0; i5 < size; i5++) {
                    atadVarAV.aT();
                    fArr2[i5] = ((Float) atadVarAV.e.get(i5)).floatValue();
                }
                fArr = fArr2;
            } else {
                fArr = null;
            }
            int[] iArr = new int[iAR2];
            for (int i6 = 0; i6 < iAR2; i6++) {
                atadVarAV.aS();
                iArr[i6] = ((Integer) atadVarAV.d.get(i6)).intValue();
            }
            if (z) {
                ataa ataaVarAU3 = atadVarAV.aU();
                if (ataaVarAU3.d == null && (Memory.peekByte(ataaVarAU3.c + 8) & 1) != 0) {
                    ataaVarAU3.d = new atks(ataaVarAU3.cp(true != ataa.a ? 12 : 16, atkr.a));
                }
                atks atksVar = ataaVarAU3.d == null ? atkq.a : ataaVarAU3.d;
                if (ataaVarAU3.e == null && (Memory.peekByte(ataaVarAU3.c + 8) & 2) != 0) {
                    ataaVarAU3.e = new atks(ataaVarAU3.cp(true != ataa.a ? 16 : 24, atkr.a));
                }
                atks atksVar2 = ataaVarAU3.e == null ? atkq.a : ataaVarAU3.e;
                int iAS = a.aS(Memory.peekInt(ataaVarAU3.c + (true != ataa.a ? 20L : 12L), false));
                if (iAS == 0) {
                    iAS = 1;
                }
                if (iAS - 1 != 1) {
                    PointF pointF3 = new PointF(Float.intBitsToFloat(Memory.peekInt(atksVar.c + 12, false)), Float.intBitsToFloat(Memory.peekInt(atksVar.c + 16, false)));
                    pointF2 = new PointF(Float.intBitsToFloat(Memory.peekInt(atksVar2.c + 12, false)), Float.intBitsToFloat(Memory.peekInt(atksVar2.c + 16, false)));
                    pointF = pointF3;
                } else {
                    PointF pointF4 = new PointF(Float.intBitsToFloat(Memory.peekInt(atksVar.c + 12, false)) * fA2, Float.intBitsToFloat(Memory.peekInt(atksVar.c + 16, false)) * fA2);
                    pointF2 = new PointF(Float.intBitsToFloat(Memory.peekInt(atksVar2.c + 12, false)) * fA2, Float.intBitsToFloat(Memory.peekInt(atksVar2.c + 16, false)) * fA2);
                    pointF = pointF4;
                    i3 = 2;
                }
                z2 = atad.a;
                if (true != z2) {
                    i4 = 16;
                } else {
                    i4 = 8;
                }
                long j20 = atadVarAV.c + ((long) i4);
                bPeekByte3 = Memory.peekByte(j20);
                bPeekByte4 = Memory.peekByte(j20 + 1);
                if (true != z6) {
                    b2 = bPeekByte4;
                } else {
                    b2 = bPeekByte3;
                }
                if (true == z6) {
                    bPeekByte3 = bPeekByte4;
                }
                if (((short) ((b2 << 8) | (bPeekByte3 & 255))) == 3) {
                    long j21 = atadVarAV.c;
                    if (true != z2) {
                        j12 = 20;
                    } else {
                        j12 = 32;
                    }
                    z3 = false;
                    fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(j21 + j12, false));
                } else {
                    z3 = false;
                    fIntBitsToFloat2 = 0.0f;
                }
                otiVar.l = new otn(fIntBitsToFloat2, pointF, pointF2, iArr, fArr, i3, otiVar.u);
                otn otnVar = otiVar.l;
                RectF rectF = otiVar.p;
                if (otiVar.getLayoutDirection() == 1) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                otnVar.a(rectF, z4, otiVar.t);
            } else {
                pointF = null;
                pointF2 = null;
            }
            i3 = 1;
            z2 = atad.a;
            if (true != z2) {
                i4 = 16;
            } else {
                i4 = 8;
            }
            long j22 = atadVarAV.c + ((long) i4);
            bPeekByte3 = Memory.peekByte(j22);
            bPeekByte4 = Memory.peekByte(j22 + 1);
            if (true != z6) {
                b2 = bPeekByte4;
            } else {
                b2 = bPeekByte3;
            }
            if (true == z6) {
                bPeekByte3 = bPeekByte4;
            }
            if (((short) ((b2 << 8) | (bPeekByte3 & 255))) == 3) {
                long j23 = atadVarAV.c;
                if (true != z2) {
                    j12 = 20;
                } else {
                    j12 = 32;
                }
                z3 = false;
                fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(j23 + j12, false));
            } else {
                z3 = false;
                fIntBitsToFloat2 = 0.0f;
            }
            otiVar.l = new otn(fIntBitsToFloat2, pointF, pointF2, iArr, fArr, i3, otiVar.u);
            otn otnVar2 = otiVar.l;
            RectF rectF2 = otiVar.p;
            if (otiVar.getLayoutDirection() == 1) {
                z4 = true;
            } else {
                z4 = z3;
            }
            otnVar2.a(rectF2, z4, otiVar.t);
        }
        return otiVar;
    }
}

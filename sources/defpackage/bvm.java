package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.os.Build;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bvm {
    private final int a;
    private final bvk[] b;
    private final bvl[] c;
    private final Map d;
    private final Map e;

    public bvm(String str, String str2) throws bvn {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.a = iGlCreateProgram;
        bvo.f();
        l(iGlCreateProgram, 35633, str);
        l(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        bvo.g(iArr[0] == 1, "Unable to link shader program: \n".concat(String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram))));
        GLES20.glUseProgram(iGlCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.b = new bvk[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.a;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str3 = new String(bArr, 0, b(bArr));
            bvk bvkVar = new bvk(str3, GLES20.glGetAttribLocation(i2, str3));
            this.b[i] = bvkVar;
            this.d.put(bvkVar.a, bvkVar);
        }
        this.e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr4, 0);
        this.c = new bvl[iArr4[0]];
        for (int i4 = 0; i4 < iArr4[0]; i4++) {
            int i5 = this.a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i5, 35719, iArr5, 0);
            int[] iArr6 = new int[1];
            int i6 = iArr5[0];
            byte[] bArr2 = new byte[i6];
            GLES20.glGetActiveUniform(i5, i4, i6, new int[1], 0, new int[1], 0, iArr6, 0, bArr2, 0);
            String str4 = new String(bArr2, 0, b(bArr2));
            bvl bvlVar = new bvl(str4, GLES20.glGetUniformLocation(i5, str4), iArr6[0]);
            this.c[i4] = bvlVar;
            this.e.put(bvlVar.a, bvlVar);
        }
        bvo.f();
    }

    public static int b(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static void l(int i, int i2, String str) throws bvn {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        bvo.g(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        bvo.f();
    }

    public final int a(String str) throws bvn {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        bvo.f();
        return iGlGetAttribLocation;
    }

    public final int c(String str) {
        return GLES20.glGetUniformLocation(this.a, str);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Switch 'out' block B:30:0x00b9 for B:17:0x0045 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:30:0x00b9 for B:18:0x0048 already processed. Defaulting to fallback option. */
    public final void d() throws bvn {
        int i;
        int i2 = 0;
        while (true) {
            bvk[] bvkVarArr = this.b;
            if (i2 >= bvkVarArr.length) {
                break;
            }
            bvk bvkVar = bvkVarArr[i2];
            Buffer buffer = bvkVar.c;
            buffer.getClass();
            GLES20.glBindBuffer(34962, 0);
            int i3 = bvkVar.b;
            GLES20.glVertexAttribPointer(i3, bvkVar.d, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(i3);
            bvo.f();
            i2++;
        }
        for (bvl bvlVar : this.c) {
            int i4 = bvlVar.c;
            if (i4 == 5124) {
                GLES20.glUniform1iv(bvlVar.b, 1, bvlVar.e, 0);
                bvo.f();
            } else if (i4 == 5126) {
                GLES20.glUniform1fv(bvlVar.b, 1, bvlVar.d, 0);
                bvo.f();
            } else if (i4 != 35815 && i4 != 36198) {
                switch (i4) {
                    case 35664:
                        GLES20.glUniform2fv(bvlVar.b, 1, bvlVar.d, 0);
                        bvo.f();
                        continue;
                    case 35665:
                        GLES20.glUniform3fv(bvlVar.b, 1, bvlVar.d, 0);
                        bvo.f();
                        continue;
                    case 35666:
                        GLES20.glUniform4fv(bvlVar.b, 1, bvlVar.d, 0);
                        bvo.f();
                        continue;
                    case 35667:
                        GLES20.glUniform2iv(bvlVar.b, 1, bvlVar.e, 0);
                        bvo.f();
                        continue;
                    case 35668:
                        GLES20.glUniform3iv(bvlVar.b, 1, bvlVar.e, 0);
                        bvo.f();
                        continue;
                    case 35669:
                        GLES20.glUniform4iv(bvlVar.b, 1, bvlVar.e, 0);
                        bvo.f();
                        continue;
                    default:
                        switch (i4) {
                            case 35675:
                                GLES20.glUniformMatrix3fv(bvlVar.b, 1, false, bvlVar.d, 0);
                                bvo.f();
                                continue;
                            case 35676:
                                GLES20.glUniformMatrix4fv(bvlVar.b, 1, false, bvlVar.d, 0);
                                bvo.f();
                                continue;
                            default:
                                switch (i4) {
                                    case 35678:
                                    case 35679:
                                        if (bvlVar.f != 0) {
                                            throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                                        }
                                        GLES20.glActiveTexture(bvlVar.g + 33984);
                                        bvo.f();
                                        switch (i4) {
                                            case 35678:
                                                i = 3553;
                                                break;
                                            case 35679:
                                                i = 32879;
                                                break;
                                            case 35815:
                                            case 36198:
                                                i = 36197;
                                                break;
                                            default:
                                                throw new IllegalStateException(a.bR(i4, "Unexpected sampler type: "));
                                        }
                                        bvo.m(i, bvlVar.f);
                                        if (i4 == 35678) {
                                            int i5 = bvlVar.h;
                                            GLES20.glTexParameteri(3553, 10241, 9729);
                                            bvo.f();
                                        }
                                        GLES20.glUniform1i(bvlVar.b, bvlVar.g);
                                        bvo.f();
                                        break;
                                        break;
                                    default:
                                        throw new IllegalStateException(a.bR(i4, "Unexpected uniform type: "));
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (bvlVar.f != 0) {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
                GLES20.glActiveTexture(bvlVar.g + 33984);
                bvo.f();
                switch (i4) {
                    case 35678:
                        i = 3553;
                        break;
                    case 35679:
                        i = 32879;
                        break;
                    case 35815:
                    case 36198:
                        i = 36197;
                        break;
                    default:
                        throw new IllegalStateException(a.bR(i4, "Unexpected sampler type: "));
                }
                bvo.m(i, bvlVar.f);
                if (i4 == 35678) {
                    int i6 = bvlVar.h;
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    bvo.f();
                }
                GLES20.glUniform1i(bvlVar.b, bvlVar.g);
                bvo.f();
            }
        }
    }

    public final void e() throws bvn {
        if (Build.VERSION.SDK_INT != 28) {
            GLES20.glDeleteProgram(this.a);
            bvo.f();
        }
    }

    public final void f(String str, float[] fArr) {
        bvl bvlVar = (bvl) this.e.get(str);
        bvlVar.getClass();
        System.arraycopy(fArr, 0, bvlVar.d, 0, fArr.length);
    }

    public final void g(String str, int i) {
        bvl bvlVar = (bvl) this.e.get(str);
        bvlVar.getClass();
        bvlVar.e[0] = i;
    }

    public final void h(String str, int i, int i2) {
        bvl bvlVar = (bvl) this.e.get(str);
        bvlVar.getClass();
        bvlVar.f = i;
        bvlVar.g = i2;
    }

    public final void i() throws bvn {
        GLES20.glUseProgram(this.a);
        bvo.f();
    }

    public final void j(float[] fArr) {
        bvk bvkVar = (bvk) this.d.get("aFramePosition");
        bvkVar.getClass();
        bvkVar.c = bvo.d(fArr);
        bvkVar.d = 4;
    }

    public final void k(float f) {
        bvl bvlVar = (bvl) this.e.get("uOpacity");
        bvlVar.getClass();
        bvlVar.d[0] = f;
    }

    public bvm(Context context, String str, String str2) {
        this(bwp.Q(context, str), bwp.Q(context, str2));
    }
}

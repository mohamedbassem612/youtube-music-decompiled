package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zkw {
    protected final int a;
    public final int b;
    public final SurfaceTexture c;
    public final FloatBuffer d;
    public final int e;
    public final int f;
    public final int g;
    public final float[] h;
    private final float[] i;

    public zkw(SurfaceTexture surfaceTexture, int i) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.a = iGlCreateProgram;
        int iA = a(35633, "attribute vec4 vPosition;\nattribute vec4 vTexCoord;\nuniform mat4 texTransMat;\nvarying vec2 texCoordVar;\nvoid main() {\n   gl_Position = vPosition;\n   texCoordVar = (texTransMat * vTexCoord).xy;\n}\n");
        int iA2 = a(35632, "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nuniform samplerExternalOES texture;\nvarying vec2 texCoordVar;\nvoid main() {\n   gl_FragColor = texture2D(texture, texCoordVar);\n}\n");
        GLES20.glAttachShader(iGlCreateProgram, iA);
        GLES20.glAttachShader(iGlCreateProgram, iA2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            zhq zhqVar = zhq.MLPLAYER;
            String strConcat = "Failed to link program : ".concat(strValueOf);
            zhr.a(zhqVar, strConcat);
            throw new zkv(strConcat);
        }
        GLES20.glDeleteShader(iA);
        GLES20.glDeleteShader(iA2);
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.i = fArr;
        this.h = new float[16];
        this.b = i;
        this.c = surfaceTexture;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.d = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.e = b(iGlCreateProgram, "vPosition");
        this.f = b(iGlCreateProgram, "vTexCoord");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(iGlCreateProgram, "texTransMat");
        try {
            yno.ap("glGetUniformLocation");
        } catch (zlc e) {
            zhr.a(zhq.MLPLAYER, "glGetUniformLocation: ".concat(String.valueOf(e.getMessage())));
        }
        this.g = iGlGetUniformLocation;
    }

    protected static int a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateShader;
        }
        String strValueOf = String.valueOf(GLES20.glGetShaderInfoLog(iGlCreateShader));
        zhq zhqVar = zhq.MLPLAYER;
        String strConcat = "Failed to compile shader : ".concat(strValueOf);
        zhr.a(zhqVar, strConcat);
        throw new zkv(strConcat);
    }

    protected static final int b(int i, String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        try {
            yno.ap("glGetAttribLocation");
        } catch (zlc e) {
            zhr.a(zhq.MLPLAYER, "glGetAttribLocation: ".concat(String.valueOf(e.getMessage())));
        }
        return iGlGetAttribLocation;
    }
}

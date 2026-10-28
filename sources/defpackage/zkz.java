package defpackage;

import android.opengl.GLES20;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zkz implements zlf {
    static final String a = String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nprecision mediump int;\nuniform samplerExternalOES texture;\nuniform vec2 uTextureSize;\nuniform float kernel[%1$d];\nuniform int uKernelWidth;\nuniform int uKernelHeight;\nvarying vec2 texCoordVar;\n\nvoid main() {\n  vec2 vOnePixel = vec2(1.0, 1.0) / uTextureSize;\n  vec4 colorSum = vec4(0.0);\n  int maxIter = uKernelWidth * uKernelHeight;\n  vec2 startOffset = vec2(-float(uKernelWidth / 2) * vOnePixel.x, -float(uKernelHeight / 2) * vOnePixel.y);\n  vec2 currentOffset = startOffset;\n\n  int currentColumn = 0;\n\n  for (int i = 0; i < %1$d; i++) {\n    if (i >= maxIter) break;\n\n    colorSum += texture2D(texture, texCoordVar + currentOffset) * kernel[i];\n\n    currentColumn++;\n    currentOffset.x += vOnePixel.x;\n    if (currentColumn >= uKernelWidth) {\n      currentColumn = 0;\n      currentOffset.x = startOffset.x;\n      currentOffset.y += vOnePixel.y;\n    }\n  }\n\n  gl_FragColor = colorSum;\n  gl_FragColor.a = 1.0;\n}\n", 49);
    final String b;
    final String c;
    public final boolean d;
    public zky e;
    public int f = -1;
    public int g = -1;
    final float[] h = new float[16];
    private final boolean i;
    private float[] j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;

    public zkz(boolean z, boolean z2) {
        String str;
        this.i = z;
        this.d = z2;
        int i = 49;
        if (!z && !z2) {
            i = 9;
        }
        this.j = new float[i];
        if (z2) {
            this.b = "attribute vec4 vPosition;\nattribute vec4 vTexCoord;\nuniform mat4 texTransMat;\nvarying vec2 texCoordVar;\n\nvoid main() {\n  gl_Position = vPosition;\n  texCoordVar = (texTransMat * vTexCoord).xy;\n}\n";
            str = null;
        } else if (z) {
            this.b = "attribute vec4 vPosition;\nattribute vec4 vTexCoord;\nuniform mat4 texTransMat;\nvarying vec2 texCoordVar;\n\nvoid main() {\n  gl_Position = vPosition;\n  texCoordVar = (texTransMat * vTexCoord).xy;\n}\n";
            str = a;
        } else {
            this.b = "attribute vec4 vPosition;\nattribute vec4 vTexCoord;\nuniform mat4 texTransMat;\nuniform vec2 uTextureSize;\nvarying vec2 texCoordVar;\nvarying vec2 n1Coord;\nvarying vec2 n2Coord;\nvarying vec2 n3Coord;\nvarying vec2 n4Coord;\nvarying vec2 n5Coord;\nvarying vec2 n6Coord;\nvarying vec2 n7Coord;\nvarying vec2 n8Coord;\n\nvoid main() {\n  gl_Position = vPosition;\n  texCoordVar = (texTransMat * vTexCoord).xy;\n  vec2 onePixel = vec2(1.0, 1.0) / uTextureSize;\n  n1Coord = texCoordVar + vec2(-onePixel.x, -onePixel.y);\n  n2Coord = texCoordVar + vec2(0.0,     -onePixel.y);\n  n3Coord = texCoordVar + vec2(onePixel.x,  -onePixel.y);\n  n4Coord = texCoordVar + vec2(-onePixel.x, 0.0);\n  n5Coord = texCoordVar + vec2(onePixel.x,  0.0);\n  n6Coord = texCoordVar + vec2(-onePixel.x, onePixel.y);\n  n7Coord = texCoordVar + vec2(0.0,      onePixel.y);\n  n8Coord = texCoordVar + vec2(onePixel.x,   onePixel.y);\n}\n";
            str = "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nuniform samplerExternalOES texture;\nuniform float kernel[9];\nvarying vec2 texCoordVar;\nvarying vec2 n1Coord;\nvarying vec2 n2Coord;\nvarying vec2 n3Coord;\nvarying vec2 n4Coord;\nvarying vec2 n5Coord;\nvarying vec2 n6Coord;\nvarying vec2 n7Coord;\nvarying vec2 n8Coord;\n\nvoid main() {\n  vec4 center = texture2D(texture, texCoordVar);\n  vec4 n1 = texture2D(texture, n1Coord);\n  vec4 n2 = texture2D(texture, n2Coord);\n  vec4 n3 = texture2D(texture, n3Coord);\n  vec4 n4 = texture2D(texture, n4Coord);\n  vec4 n5 = texture2D(texture, n5Coord);\n  vec4 n6 = texture2D(texture, n6Coord);\n  vec4 n7 = texture2D(texture, n7Coord);\n  vec4 n8 = texture2D(texture, n8Coord);\n\n  gl_FragColor = n1*kernel[0] + n2*kernel[1] + n3*kernel[2] +\n                 n4*kernel[3] + center*kernel[4] + n5*kernel[5] +\n                 n6*kernel[6] + n7*kernel[7] + n8*kernel[8];\n  gl_FragColor.a = 1.0;\n}\n";
        }
        this.c = str;
    }

    @Override // defpackage.zlf
    public final void a(yxd yxdVar, int i) throws zlj {
        if (this.d) {
            if (yxdVar == null) {
                throw new zlj("Null shader input for convolution");
            }
            akfp akfpVarG = yxdVar.g();
            if (akfpVarG == null) {
                throw new zlj("Null convolution matrix for convolution");
            }
            int size = akfpVarG.d.size();
            int i2 = akfpVarG.b;
            int i3 = akfpVarG.c;
            if (i2 <= 0 || i3 <= 0 || (i2 & 1) == 0 || (i3 & 1) == 0) {
                throw new zlj("Matrix dimensions must be positive odd integers");
            }
            int i4 = i2 * i3;
            if (size != i4) {
                throw new zlj("Matrix dimensions assert expected volume (" + i4 + ") that differs from weight element totals (" + size + ')');
            }
            zky zkyVarE = e(i2, i3);
            GLES20.glUseProgram(zkyVarE.a);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glUniform2f(zkyVarE.e, this.s, this.t);
            GLES20.glUniformMatrix4fv(zkyVarE.d, 1, false, this.h, 0);
            if (this.j.length < size) {
                this.j = new float[size];
            }
            for (int i5 = 0; i5 < size; i5++) {
                this.j[i5] = akfpVarG.d.d(i5);
            }
            GLES20.glUniform1fv(zkyVarE.f, size, this.j, 0);
            int i6 = zkyVarE.b;
            GLES20.glEnableVertexAttribArray(i6);
            GLES20.glVertexAttribPointer(i6, yxdVar.c(), 5126, false, yxdVar.i(), yxdVar.k().position(0));
            int i7 = zkyVarE.c;
            GLES20.glEnableVertexAttribArray(i7);
            GLES20.glVertexAttribPointer(i7, yxdVar.b(), 5126, false, yxdVar.h(), yxdVar.j().position(0));
            GLES20.glDrawArrays(yxdVar.a(), 0, yxdVar.e().size() / yxdVar.b());
            GLES20.glDisableVertexAttribArray(i6);
            GLES20.glDisableVertexAttribArray(i7);
            yno.ao("onDrawFrame");
            return;
        }
        if (yxdVar == null) {
            throw new zlj("Null shader input for convolution");
        }
        akfp akfpVarG2 = yxdVar.g();
        if (akfpVarG2 == null) {
            throw new zlj("Null convolution matrix for convolution");
        }
        int size2 = akfpVarG2.d.size();
        boolean z = this.i;
        if (z) {
            int i8 = akfpVarG2.b;
            int i9 = akfpVarG2.c;
            if (i8 <= 0 || i9 <= 0 || (i8 & 1) == 0 || (i9 & 1) == 0) {
                throw new zlj("Matrix dimensions must be positive odd integers");
            }
            int i10 = i8 * i9;
            if (size2 != i10) {
                throw new zlj("Matrix dimensions assert expected volume (" + i10 + ") that differs from weight element totals (" + size2 + ')');
            }
            if (size2 > 49) {
                throw new zlj(a.bP(size2, "Convolution matrix weights count ", " exceeds maximum allowed size 49"));
            }
        } else if (size2 != 9) {
            throw new zlj("Convolution matrix size must be 9 for 3x3 convolution");
        }
        GLES20.glUseProgram(this.l);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glUniform2f(this.o, this.s, this.t);
        GLES20.glUniformMatrix4fv(this.n, 1, false, this.h, 0);
        if (z) {
            GLES20.glUniform1i(this.p, akfpVarG2.b);
            GLES20.glUniform1i(this.q, akfpVarG2.c);
        }
        for (int i11 = 0; i11 < size2; i11++) {
            this.j[i11] = akfpVarG2.d.d(i11);
        }
        GLES20.glUniform1fv(this.r, size2, this.j, 0);
        GLES20.glEnableVertexAttribArray(this.k);
        GLES20.glVertexAttribPointer(this.k, yxdVar.c(), 5126, false, yxdVar.i(), yxdVar.k().position(0));
        GLES20.glEnableVertexAttribArray(this.m);
        GLES20.glVertexAttribPointer(this.m, yxdVar.b(), 5126, false, yxdVar.h(), yxdVar.j().position(0));
        GLES20.glDrawArrays(yxdVar.a(), 0, yxdVar.e().size() / yxdVar.b());
        GLES20.glDisableVertexAttribArray(this.k);
        GLES20.glDisableVertexAttribArray(this.m);
        yno.ao("onDrawFrame");
    }

    @Override // defpackage.zlf
    public final void b(int i, int i2) throws zlj {
        this.s = i;
        this.t = i2;
        GLES20.glViewport(0, 0, i, i2);
        yno.ao("onSurfaceChanged");
    }

    @Override // defpackage.zlf
    public final void c() throws zlj {
        if (this.d || this.l != 0) {
            return;
        }
        String str = this.b;
        String str2 = this.c;
        int iAl = yno.al(35633, str);
        if (str2 == null) {
            throw new zlj("Fragment shader source is null");
        }
        int iAk = yno.ak(iAl, yno.al(35632, str2));
        this.l = iAk;
        this.k = yno.am(iAk, "vPosition");
        this.m = yno.am(this.l, "vTexCoord");
        this.n = yno.an(this.l, "texTransMat");
        this.o = yno.an(this.l, "uTextureSize");
        this.r = yno.an(this.l, "kernel");
        if (this.i) {
            this.p = yno.an(this.l, "uKernelWidth");
            this.q = yno.an(this.l, "uKernelHeight");
        }
    }

    @Override // defpackage.zlf
    public final float[] d() {
        return this.h;
    }

    final zky e(int i, int i2) throws zlj {
        zky zkyVar = this.e;
        if (zkyVar != null && this.f == i && this.g == i2) {
            return zkyVar;
        }
        if (zkyVar != null) {
            GLES20.glDeleteProgram(zkyVar.a);
            this.e = null;
        }
        int iAl = yno.al(35633, "attribute vec4 vPosition;\nattribute vec4 vTexCoord;\nuniform mat4 texTransMat;\nvarying vec2 texCoordVar;\n\nvoid main() {\n  gl_Position = vPosition;\n  texCoordVar = (texTransMat * vTexCoord).xy;\n}\n");
        if (i <= 0 || i2 <= 0 || (i & 1) == 0 || (i2 & 1) == 0) {
            throw new zlj("Kernel dimensions must be positive odd integers");
        }
        StringBuilder sb = new StringBuilder("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES texture;\nuniform vec2 uTextureSize;\nuniform float kernel[");
        sb.append(i * i2);
        sb.append("];\nvarying vec2 texCoordVar;\n\nvoid main() {\n  vec4 sum = vec4(0.0);\n  vec2 onePixel = vec2(1.0, 1.0) / uTextureSize;\n");
        int i3 = i >> 1;
        int i4 = i2 >> 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = 0;
            while (i7 < i) {
                sb.append("  sum += texture2D(texture, texCoordVar + vec2(");
                sb.append(i7 - i3);
                sb.append(".0, ");
                sb.append(i6 - i4);
                sb.append(".0) * onePixel) * kernel[");
                sb.append(i5);
                sb.append("];\n");
                i7++;
                i5++;
            }
        }
        sb.append("  gl_FragColor = sum;\n  gl_FragColor.a = 1.0;\n}\n");
        int iAk = yno.ak(iAl, yno.al(35632, sb.toString()));
        zky zkyVar2 = new zky(iAk, yno.am(iAk, "vPosition"), yno.am(iAk, "vTexCoord"), yno.an(iAk, "texTransMat"), yno.an(iAk, "uTextureSize"), yno.an(iAk, "kernel"));
        this.e = zkyVar2;
        this.f = i;
        this.g = i2;
        return zkyVar2;
    }
}

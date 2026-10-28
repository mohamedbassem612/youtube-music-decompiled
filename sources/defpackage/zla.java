package defpackage;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zla implements zlf {
    int a;
    final float[] b = new float[16];
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    @Override // defpackage.zlf
    public final void a(yxd yxdVar, int i) throws zlj {
        if (yxdVar == null) {
            throw new zlj("Null shader input for film grain");
        }
        GLES20.glUseProgram(this.a);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        int i2 = this.g;
        if (i2 != -1) {
            GLES20.glUniform1f(i2, zlk.a.b * 32.0f);
        }
        int i3 = this.h;
        if (i3 != -1) {
            int i4 = this.c;
            this.c = i4 + 1;
            GLES20.glUniform1f(i3, (i4 % 10000) / 1000.0f);
        }
        int i5 = this.i;
        if (i5 != -1) {
            GLES20.glUniform1i(i5, 1);
        }
        int i6 = this.j;
        if (i6 != -1) {
            GLES20.glUniform2i(i6, 0, 0);
        }
        GLES20.glUniformMatrix4fv(this.f, 1, false, this.b, 0);
        GLES20.glEnableVertexAttribArray(this.d);
        GLES20.glVertexAttribPointer(this.d, yxdVar.c(), 5126, false, yxdVar.i(), yxdVar.k());
        GLES20.glEnableVertexAttribArray(this.e);
        GLES20.glVertexAttribPointer(this.e, yxdVar.b(), 5126, false, yxdVar.h(), yxdVar.j());
        GLES20.glDrawArrays(yxdVar.a(), 0, yxdVar.f().size() / yxdVar.c());
        GLES20.glDisableVertexAttribArray(this.d);
        GLES20.glDisableVertexAttribArray(this.e);
        yno.ao("onDrawFrame");
    }

    @Override // defpackage.zlf
    public final void b(int i, int i2) throws zlj {
        GLES20.glViewport(0, 0, i, i2);
        yno.ao("onSurfaceChanged");
    }

    @Override // defpackage.zlf
    public final void c() throws zlj {
        this.a = yno.ak(yno.al(35633, "attribute vec4 vPosition;\nattribute vec4 vTexCoord;\nuniform mat4 texTransMat;\nvarying vec2 texCoordVar;\nvoid main() {\n  gl_Position = vPosition;\n  texCoordVar = (texTransMat * vTexCoord).xy;\n}\n"), yno.al(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES texture;\nvarying vec2 texCoordVar;\nuniform float u_Intensity;\nuniform float u_Time;\nuniform int u_apply_grain;\nuniform ivec2 u_noise_dampening_from_green;\nhighp float rand(highp vec2 co) {\n  return fract(sin(dot(co.xy, highp vec2(12.9898, 78.233))) * 43758.5453);\n}\n\nvoid main() {\n  vec4 color = texture2D(texture, texCoordVar);\n  if (u_apply_grain == 0) {\n     gl_FragColor = color;\n     return;\n  }\n\n  highp float noise = (rand(texCoordVar + vec2(u_Time, u_Time)) - 0.5) * (u_Intensity / 100.0);\n  if (u_noise_dampening_from_green.x == 1) {\n     noise = noise * clamp(color.g + 0.2, 0.0, 1.0);\n  }\n\n  gl_FragColor = vec4(color.rgb + vec2(noise, noise).xxy, color.a);\n}\n"));
        yno.ao("onSurfaceCreated: create program");
        this.d = yno.am(this.a, "vPosition");
        this.e = yno.am(this.a, "vTexCoord");
        this.f = yno.an(this.a, "texTransMat");
        this.g = yno.an(this.a, "u_Intensity");
        this.h = yno.an(this.a, "u_Time");
        this.i = yno.an(this.a, "u_apply_grain");
        this.j = yno.an(this.a, "u_noise_dampening_from_green");
        yno.ao("onSurfaceCreated");
    }

    @Override // defpackage.zlf
    public final float[] d() {
        return this.b;
    }
}

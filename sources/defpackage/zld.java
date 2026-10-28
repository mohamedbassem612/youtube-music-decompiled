package defpackage;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zld implements zlf {
    int a;
    final float[] b = new float[16];
    private int c;
    private int d;
    private int e;

    @Override // defpackage.zlf
    public final void a(yxd yxdVar, int i) throws zlj {
        if (yxdVar == null) {
            throw new zlj("Null shader input for invert color");
        }
        GLES20.glUseProgram(this.a);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniformMatrix4fv(this.e, 1, false, this.b, 0);
        GLES20.glEnableVertexAttribArray(this.c);
        GLES20.glVertexAttribPointer(this.c, yxdVar.c(), 5126, false, yxdVar.i(), yxdVar.k());
        GLES20.glEnableVertexAttribArray(this.d);
        GLES20.glVertexAttribPointer(this.d, yxdVar.b(), 5126, false, yxdVar.h(), yxdVar.j());
        GLES20.glDrawArrays(yxdVar.a(), 0, yxdVar.f().size() / yxdVar.c());
        GLES20.glDisableVertexAttribArray(this.c);
        GLES20.glDisableVertexAttribArray(this.d);
        yno.ao("onDrawFrame");
    }

    @Override // defpackage.zlf
    public final void b(int i, int i2) throws zlj {
        GLES20.glViewport(0, 0, i, i2);
        yno.ao("onSurfaceChanged");
    }

    @Override // defpackage.zlf
    public final void c() throws zlj {
        this.a = yno.ak(yno.al(35633, "attribute vec4 vPosition;\nattribute vec4 vTexCoord;\nuniform mat4 texTransMat;\nvarying vec2 texCoordVar;\nvoid main() {\n  gl_Position = vPosition;\n  texCoordVar = (texTransMat * vTexCoord).xy;\n}\n"), yno.al(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES texture;\nvarying vec2 texCoordVar;\n\nvoid main() {\n  vec4 color = texture2D(texture, texCoordVar);\n  gl_FragColor = vec4(1.0 - color.r, 1.0 - color.g, 1.0 - color.b, color.a);\n}\n"));
        yno.ao("onSurfaceCreated: create program");
        this.c = yno.am(this.a, "vPosition");
        this.d = yno.am(this.a, "vTexCoord");
        this.e = yno.an(this.a, "texTransMat");
        yno.ao("onSurfaceCreated");
    }

    @Override // defpackage.zlf
    public final float[] d() {
        return this.b;
    }
}

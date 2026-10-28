package defpackage;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class zli implements zlf {
    final String a = "attribute vec4 vPosition;\nattribute vec4 vTexCoord;\nuniform mat4 texTransMat;\nvarying vec2 texCoordVar;\nvoid main() {\n   gl_Position = vPosition;\n   texCoordVar = (texTransMat * vTexCoord).xy;\n}\n";
    final String b = "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nuniform samplerExternalOES texture;\nvarying vec2 texCoordVar;\nvoid main() {\n   gl_FragColor = texture2D(texture, texCoordVar);\n}\n";
    final float[] c = new float[16];
    private int d;
    private int e;
    private int f;
    private int g;

    @Override // defpackage.zlf
    public void a(yxd yxdVar, int i) throws zlj {
        if (yxdVar == null) {
            throw new zlj("null shader input for recomposition");
        }
        GLES20.glUseProgram(this.e);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniformMatrix4fv(this.g, 1, false, this.c, 0);
        GLES20.glEnableVertexAttribArray(this.d);
        GLES20.glVertexAttribPointer(this.d, yxdVar.c(), 5126, false, yxdVar.i(), yxdVar.k().position(0));
        GLES20.glEnableVertexAttribArray(this.f);
        GLES20.glVertexAttribPointer(this.f, yxdVar.b(), 5126, false, yxdVar.h(), yxdVar.j().position(0));
        GLES20.glDrawArrays(yxdVar.a(), 0, yxdVar.e().size() / yxdVar.b());
        GLES20.glDisableVertexAttribArray(this.d);
        GLES20.glDisableVertexAttribArray(this.f);
        yno.ao("onDrawFrame");
    }

    @Override // defpackage.zlf
    public final void b(int i, int i2) throws zlj {
        GLES20.glViewport(0, 0, i, i2);
        yno.ao("onSurfaceChanged");
    }

    @Override // defpackage.zlf
    public final void c() throws zlj {
        if (this.e == 0) {
            int iAk = yno.ak(yno.al(35633, this.a), yno.al(35632, this.b));
            this.e = iAk;
            this.d = yno.am(iAk, "vPosition");
            this.f = yno.am(this.e, "vTexCoord");
            this.g = yno.an(this.e, "texTransMat");
        }
    }

    @Override // defpackage.zlf
    public final float[] d() {
        return this.c;
    }
}

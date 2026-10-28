package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zkx implements zlf {
    static final float[] a = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    final FloatBuffer b;
    int c;
    final float[] d = new float[16];
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public zkx() {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(a).position(0);
    }

    @Override // defpackage.zlf
    public final void a(yxd yxdVar, int i) throws zlj {
        if (yxdVar == null) {
            throw new zlj("Null shader input for bicubic upscaling");
        }
        GLES20.glUseProgram(this.c);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform2f(this.h, this.i, this.j);
        GLES20.glUniformMatrix4fv(this.g, 1, false, this.d, 0);
        FloatBuffer floatBuffer = this.b;
        floatBuffer.position(0);
        GLES20.glEnableVertexAttribArray(this.e);
        GLES20.glVertexAttribPointer(this.e, yxdVar.c() + 1, 5126, false, 20, (Buffer) floatBuffer);
        floatBuffer.position(3);
        GLES20.glEnableVertexAttribArray(this.f);
        GLES20.glVertexAttribPointer(this.f, yxdVar.b(), 5126, false, 20, (Buffer) floatBuffer);
        GLES20.glDrawArrays(yxdVar.a(), 0, 20 / ((yxdVar.c() + 1) + yxdVar.b()));
        GLES20.glDisableVertexAttribArray(this.e);
        GLES20.glDisableVertexAttribArray(this.f);
        yno.ao("onDrawFrame");
    }

    @Override // defpackage.zlf
    public final void b(int i, int i2) throws zlj {
        this.i = i;
        this.j = i2;
        GLES20.glViewport(0, 0, i, i2);
        yno.ao("onSurfaceChanged");
    }

    @Override // defpackage.zlf
    public final void c() throws zlj {
        this.c = yno.ak(yno.al(35633, "attribute vec4 vPosition;\nattribute vec4 vTexCoord;\nuniform mat4 texTransMat;\nvarying vec2 texCoordVar;\nvoid main() {\n  gl_Position = vPosition;\n  texCoordVar = (texTransMat * vTexCoord).xy;\n}\n"), yno.al(35632, "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nuniform samplerExternalOES texture;\nvarying vec2 texCoordVar;\n\nuniform vec2 uTextureSize;\nfloat uBicubicParamB = 0.0; // Parameter for the cubic-B spline (see https://stackoverflow.com/a/32658863).\n\n/**\n * Calculate cubic filter weight for a BC spline when texel distance <= 1.0.\n * dis: distance from the sample coordinate.\n *\n * return: weight for the cubic function.\n */\nfloat cubicWeight1(float dis) {\n  float dis2 = dis * dis;\n  float dis3 = dis2 * abs(dis);\n  float paramC = 0.5;\n  return ((2.0 - 1.5 * uBicubicParamB - paramC) * dis3 +\n          (-3.0 + 2.0 * uBicubicParamB + paramC) * dis2 +\n          (1.0 - 0.33333 * uBicubicParamB));\n}\n\n/**\n * Calculate cubic filter weight for a BC spline when 1.0 <= texel distance\n * <= 2.0.\n * dis: distance from the sample coordinate.\n *\n * return: weight for the cubic function.\n */\nfloat cubicWeight2(float dis) {\n  dis = abs(dis);\n  float dis2 = dis * dis;\n  float dis3 = dis2 * dis;\n  float paramC = 0.5;\n  return ((-0.16667 * uBicubicParamB - paramC) * dis3 +\n          (uBicubicParamB + 5.0 * paramC) * dis2 +\n          (-2.0 * uBicubicParamB - 8.0 * paramC) * dis +\n          (1.33333 * uBicubicParamB + 4.0 * paramC));\n}\n\nvec4 cubic(float v) {\n  return vec4(cubicWeight2(-v - 1.0), cubicWeight1(-v), cubicWeight1(1.0 - v), cubicWeight2(2.0 - v));\n}\n\nvoid main() {\n  vec2 texCoords = texCoordVar;\n  vec2 invTexSize = 1.0 / uTextureSize;\n\n  texCoords = texCoords * uTextureSize - 0.5;\n\n  vec2 fxy = fract(texCoords);\n  texCoords -= fxy;\n\n  vec2 texel0 = (texCoords - 0.5);\n  vec2 texel3 = (texel0 + 3.);\n\n  // Map back to texture space.\n  texel0 = vec2(texel0.x * invTexSize.x,\n                texel0.y * invTexSize.y);\n  texel3 = vec2(texel3.x * invTexSize.x,\n                texel3.y * invTexSize.y);\n\n  vec4 xcubic = cubic(fxy.x);\n  vec4 ycubic = cubic(fxy.y);\n\n  vec2 c = texCoords.xy + vec2(+0.5, +0.5);\n  vec2 s = vec2(xcubic.y + xcubic.z, ycubic.y + ycubic.z);\n  vec2 offset = c + vec2(xcubic.z, ycubic.z) / s;\n\n  offset *= invTexSize;\n\n  gl_FragColor = texture2D(texture, vec2(texel0.x, texel0.y)) * xcubic.x * ycubic.x +\n         texture2D(texture, vec2(offset.x, texel0.y)) * s.x * ycubic.x +\n         texture2D(texture, vec2(texel3.x, texel0.y)) * xcubic.w * ycubic.x +\n\n         texture2D(texture, vec2(texel0.x, offset.y)) * xcubic.x * s.y +\n         texture2D(texture, vec2(offset.x, offset.y)) * s.x * s.y +\n         texture2D(texture, vec2(texel3.x, offset.y)) * xcubic.w * s.y +\n\n         texture2D(texture, vec2(texel0.x, texel3.y)) * xcubic.x * ycubic.w +\n         texture2D(texture, vec2(offset.x, texel3.y)) * s.x * ycubic.w +\n         texture2D(texture, vec2(texel3.x, texel3.y)) * xcubic.w * ycubic.w;\n  gl_FragColor.a = 1.0;\n}\n"));
        yno.ao("onSurfaceCreated: create program");
        this.e = yno.am(this.c, "vPosition");
        this.f = yno.am(this.c, "vTexCoord");
        this.g = yno.an(this.c, "texTransMat");
        this.h = yno.an(this.c, "uTextureSize");
        yno.ao("onSurfaceCreated");
    }

    @Override // defpackage.zlf
    public final float[] d() {
        return this.d;
    }
}

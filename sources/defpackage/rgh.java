package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLES30;
import com.google.android.libraries.video.mediaengine.textures.TonemapLutGenerator;
import j$.util.Optional;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgh {
    public final qua f;
    public boolean g;
    public int h;
    private final Context m;
    private final boolean n;
    public static final rbm i = new rbm("rgh");
    private static final agkj j = agkj.m(rgg.INTERNAL, "shaders/me_vertex_shader_es2.glsl", rgg.EXTERNAL, "shaders/me_vertex_shader_es2.glsl", rgg.EXTERNAL_HDR, "shaders/me_vertex_shader_es3.glsl", rgg.EXTERNAL_HDR_VIDINFRA, "shaders/me_vertex_shader_es3.glsl");
    private static final agkj k = agkj.m(rgg.INTERNAL, "shaders/me_fragment_shader_es2.glsl", rgg.EXTERNAL, "shaders/me_fragment_shader_external_es2.glsl", rgg.EXTERNAL_HDR, "shaders/me_fragment_shader_external_yuv_es3.glsl", rgg.EXTERNAL_HDR_VIDINFRA, "shaders/me_fragment_shader_external_hdr_es3.glsl");
    public static final float[] a = {1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
    public static final float[] b = {1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};
    public static final float[] c = {1.16438f, 1.16438f, 1.16438f, 0.0f, 0.0f, -0.18733f, 2.14177f, 0.0f, 1.67867f, -0.65042f, 0.0f, 0.0f, -0.91569f, 0.34746f, -1.14814f, 1.0f};
    public static final float[] d = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, -0.16456f, 1.8814f, 0.0f, 1.4746f, -0.57135f, 0.0f, 0.0f, -0.74019f, 0.36936f, -0.94439f, 1.0f};
    private final Map l = new EnumMap(rgg.class);
    public final TonemapLutGenerator e = new TonemapLutGenerator();

    public rgh(Context context, qua quaVar, boolean z) {
        this.m = context;
        this.f = quaVar;
        this.n = z;
    }

    public final bvm a(rgg rggVar) {
        Map map = this.l;
        if (map.containsKey(rggVar)) {
            return (bvm) this.l.get(rggVar);
        }
        try {
            bvm bvmVar = new bvm(this.m, (String) j.get(rggVar), (String) k.get(rggVar));
            map.put(rggVar, bvmVar);
            return bvmVar;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void b(int i2, float f, Matrix matrix, Matrix matrix2) throws bvn {
        bvm bvmVarA = a(rgg.INTERNAL);
        bvmVarA.i();
        if (this.f.E) {
            int iA = bvmVarA.a("aFramePosition");
            GLES20.glDisable(2929);
            GLES20.glDisable(2884);
            GLES20.glDisable(3089);
            GLES20.glBlendFunc(1, 771);
            GLES20.glBlendEquation(32774);
            GLES20.glEnable(3042);
            GLES20.glColorMask(true, true, true, true);
            GLES20.glCullFace(1029);
            GLES20.glPolygonOffset(0.0f, 0.0f);
            if (this.h >= 3) {
                GLES30.glBindSampler(0, 0);
                GLES30.glVertexAttribDivisor(iA, 0);
            }
        }
        bvmVarA.h("uTexSampler", i2, 0);
        bvmVarA.j(bvo.l());
        bvmVarA.k(f);
        bvmVarA.f("uTransformationMatrix", nra.q(matrix2));
        bvmVarA.f("uTexTransformationMatrix", nra.q(matrix));
        bvmVarA.d();
        GLES20.glDrawArrays(5, 0, 4);
        rgi.c("applyTransformAndDraw");
    }

    public final void c(rfs rfsVar) throws bvn {
        b(rfsVar.getTextureName(), rfsVar.b(), rfsVar.f(), rfsVar.g());
    }

    public final void d(rfl rflVar) {
        try {
            if (this.n) {
                a(rgg.INTERNAL);
            }
            this.g = rflVar.a;
            this.h = rflVar.b;
            GLES20.glBlendFunc(1, 771);
            GLES20.glEnable(3042);
        } catch (bvn e) {
            rbc rbcVar = new rbc(i, rbd.d);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("Failed to prepare the texture transformer.", new Object[0]);
            throw new IllegalStateException(e);
        }
    }

    public final void e() {
        for (Map.Entry entry : this.l.entrySet()) {
            try {
                ((bvm) entry.getValue()).e();
            } catch (bvn e) {
                rbc rbcVar = new rbc(i, rbd.c);
                rbcVar.a = e;
                rbcVar.c();
                rbcVar.a("Could not delete the transform gl program of type %s", ((rgg) entry.getKey()).e);
            }
        }
        this.l.clear();
        TonemapLutGenerator tonemapLutGenerator = this.e;
        Optional optional = tonemapLutGenerator.a;
        if (true == optional.isPresent()) {
            GLES30.glDeleteTextures(1, new int[]{((Integer) optional.get()).intValue()}, 0);
        }
        Optional optional2 = tonemapLutGenerator.b;
        if (true == optional2.isPresent()) {
            GLES30.glDeleteTextures(1, new int[]{((Integer) optional2.get()).intValue()}, 0);
        }
        tonemapLutGenerator.a = Optional.empty();
        tonemapLutGenerator.b = Optional.empty();
    }
}

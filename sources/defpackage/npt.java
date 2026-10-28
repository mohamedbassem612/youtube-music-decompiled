package defpackage;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.util.Log;
import android.view.View;
import j$.util.Objects;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npt {
    private RuntimeShader b = null;
    private WeakReference c = null;
    private nps d = null;
    public boolean a = false;
    private boolean e = false;
    private boolean f = false;
    private final float[] g = new float[2];

    private final void c(View view, String str) {
        try {
            view.setRenderEffect(null);
        } catch (LinkageError | RuntimeException e) {
            if (this.e) {
                return;
            }
            Log.w("FadeEffectApplier", str, e);
            this.e = true;
        }
    }

    public final void a(View view) {
        if (this.a) {
            WeakReference weakReference = this.c;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view == null) {
                view = view2;
            }
            if (view != null && Objects.equals(view, view2)) {
                c(view, "Failed to clear RenderEffect");
            } else if (view2 != null) {
                c(view2, "Failed to clear RenderEffect from previous view");
            }
        }
        this.c = null;
        this.a = false;
        this.d = null;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0137  */
    /* JADX WARN: Code duplicated, block: B:80:0x013d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(View view, boolean z, boolean z2, int i, int i2, int i3, float f, float f2) {
        nps npsVar;
        if (view == null || this.f || !npw.a()) {
            if (!this.a) {
                return false;
            }
            a(view);
            return false;
        }
        npw.b();
        WeakReference weakReference = this.c;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (!Objects.equals(view2, view)) {
            if (view2 != null && this.a) {
                c(view2, "Failed to clear RenderEffect from previous view");
            }
            this.a = false;
            this.d = null;
            this.c = new WeakReference(view);
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        float fMax2 = Math.max(0.0f, Math.min(1.0f, f2));
        Object[] objArr = i2 > 0 && fMax > 0.0f;
        Object[] objArr2 = i3 > 0 && fMax2 > 0.0f;
        if (i > 0) {
            if (objArr == false) {
                if (objArr2 == true) {
                    objArr2 = true;
                } else if (this.a) {
                    c(view, "Failed to clear RenderEffect");
                    this.d = null;
                    this.a = false;
                }
            }
            if (!this.a || (npsVar = this.d) == null || npsVar.a != z || npsVar.b != z2 || npsVar.c != i || npsVar.d != i2 || npsVar.e != i3 || Float.compare(npsVar.f, fMax) != 0 || Float.compare(npsVar.g, fMax2) != 0) {
                float f3 = objArr != false ? i2 : 0.0f;
                float f4 = objArr2 != false ? i3 : 0.0f;
                float f5 = i;
                float[] fArr = this.g;
                float fMax3 = Math.max(0.0f, f3);
                float fMax4 = Math.max(0.0f, f4);
                float f6 = fMax3 + fMax4;
                if (f6 > f5 && f5 > 0.0f) {
                    float f7 = f5 / f6;
                    fMax3 *= f7;
                    fMax4 = Math.max(0.0f, Math.min(fMax4 * f7, f5 - fMax3));
                }
                fArr[r2] = fMax3;
                fArr[1] = fMax4;
                try {
                    RuntimeShader runtimeShader = this.b;
                    if (runtimeShader == null) {
                        runtimeShader = new RuntimeShader("uniform shader image;\nuniform float startPx;\nuniform float endPx;\nuniform float startStrength;\nuniform float endStrength;\nuniform float size;\nuniform int isHorizontal;\nuniform int isRtl;\nhalf4 main(float2 fragCoord) {\n    half4 color = image.eval(fragCoord);\n    float pos = isHorizontal == 1 ? fragCoord.x : fragCoord.y;\n    float alpha = 1.0;\n    if (isHorizontal == 1 && isRtl == 1) {\n        if (endPx > 0.0 && pos < endPx) {\n            float factor = clamp(pos / endPx, 0.0, 1.0);\n            alpha *= mix(1.0 - endStrength, 1.0, factor);\n        }\n        if (startPx > 0.0 && pos > (size - startPx)) {\n            float factor = clamp((size - pos) / startPx, 0.0, 1.0);\n            alpha *= mix(1.0 - startStrength, 1.0, factor);\n        }\n    } else {\n        if (startPx > 0.0 && pos < startPx) {\n            float factor = clamp(pos / startPx, 0.0, 1.0);\n            alpha *= mix(1.0 - startStrength, 1.0, factor);\n        }\n        if (endPx > 0.0 && pos > (size - endPx)) {\n            float factor = clamp((size - pos) / endPx, 0.0, 1.0);\n            alpha *= mix(1.0 - endStrength, 1.0, factor);\n        }\n    }\n    return color * alpha;\n}\n");
                        this.b = runtimeShader;
                    }
                    runtimeShader.setFloatUniform("startPx", fMax3);
                    runtimeShader.setFloatUniform("endPx", fMax4);
                    runtimeShader.setFloatUniform("startStrength", fMax);
                    runtimeShader.setFloatUniform("endStrength", fMax2);
                    runtimeShader.setFloatUniform("size", f5);
                    runtimeShader.setIntUniform("isHorizontal", z ? 1 : 0);
                    runtimeShader.setIntUniform("isRtl", z2 ? 1 : 0);
                    view.setRenderEffect(RenderEffect.createRuntimeShaderEffect(runtimeShader, "image"));
                    this.a = true;
                    this.d = new nps(z, z2, i, i2, i3, fMax, fMax2);
                } catch (LinkageError | RuntimeException e) {
                    this.f = true;
                    if (!this.e) {
                        Log.w("FadeEffectApplier", "Failed to apply RenderEffect", e);
                        this.e = true;
                    }
                    return false;
                }
            }
        } else if (this.a) {
            c(view, "Failed to clear RenderEffect");
            this.d = null;
            this.a = false;
        }
        return true;
    }
}

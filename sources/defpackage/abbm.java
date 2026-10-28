package defpackage;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class abbm extends abbr {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/player/features/gl/ScreenFillingVideoSceneNode");
    private static final float[] e = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    protected final abcc a;
    protected abce b;
    private final abcb f;
    private float g;

    public abbm(abcc abccVar, abce abceVar) {
        abccVar.getClass();
        this.a = abccVar;
        this.b = abceVar;
        this.f = new abcb(e, 3);
    }

    @Override // defpackage.abbl
    public final void a() {
        this.f.b();
    }

    @Override // defpackage.abbl
    public final void b(ahgb ahgbVar) {
        abdd abddVarH = h();
        if (abddVarH.d == 0) {
            ((agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/player/features/gl/ScreenFillingVideoSceneNode", "draw", 69, "ScreenFillingVideoSceneNode.java")).t("Error drawing! Program not created.");
            return;
        }
        abcc abccVar = this.a;
        abccVar.f();
        abddVarH.h();
        ahgbVar.c();
        abddVarH.b.e(abccVar);
        float f = this.g;
        abce abceVar = this.b;
        abddVarH.c.b(f, abceVar.a, abceVar.b);
        int i = abddVarH.a;
        GLES20.glEnableVertexAttribArray(i);
        this.f.a(i);
        abddVarH.f();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(i);
    }

    @Override // defpackage.abbr, defpackage.abbl
    public final void d(grj grjVar) {
        if (this.b.a() && !this.b.b()) {
            this.g = (float) Math.random();
        }
        this.a.h();
    }

    @Override // defpackage.abbr
    public final void f(abce abceVar) {
        this.b = abceVar;
    }

    protected abstract abdd h();

    @Override // defpackage.abbr
    public final void g() {
    }
}

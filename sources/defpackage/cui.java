package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cui {
    public static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] b = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] c = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public erb j;
    private bvm k;

    public static boolean b(ekr ekrVar) {
        zs zsVar = (zs) ekrVar.d;
        if (zsVar.n() == 1 && zsVar.p().a == 0) {
            zs zsVar2 = (zs) ekrVar.c;
            if (zsVar2.n() == 1 && zsVar2.p().a == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            bvm bvmVar = new bvm("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.k = bvmVar;
            this.e = bvmVar.c("uMvpMatrix");
            this.f = this.k.c("uTexMatrix");
            this.g = this.k.a("aPosition");
            this.h = this.k.a("aTexCoords");
            this.i = this.k.c("uTexture");
        } catch (bvn e) {
            bvx.d("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}

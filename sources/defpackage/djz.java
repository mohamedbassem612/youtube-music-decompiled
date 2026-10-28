package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class djz {
    public static final djz a;
    public static final djz b;
    public static final djz c;
    public static final djz d;
    public static final djz e;
    public static final djz f;
    public final float[] g;
    public final float[] h;
    public final float[] i = {0.24f, 0.52f, 0.24f};
    public final boolean j = true;

    static {
        djz djzVar = new djz();
        a = djzVar;
        e(djzVar);
        h(djzVar);
        djz djzVar2 = new djz();
        b = djzVar2;
        g(djzVar2);
        h(djzVar2);
        djz djzVar3 = new djz();
        c = djzVar3;
        d(djzVar3);
        h(djzVar3);
        djz djzVar4 = new djz();
        d = djzVar4;
        e(djzVar4);
        f(djzVar4);
        djz djzVar5 = new djz();
        e = djzVar5;
        g(djzVar5);
        f(djzVar5);
        djz djzVar6 = new djz();
        f = djzVar6;
        d(djzVar6);
        f(djzVar6);
    }

    public djz() {
        float[] fArr = new float[3];
        this.g = fArr;
        float[] fArr2 = new float[3];
        this.h = fArr2;
        i(fArr);
        i(fArr2);
    }

    private static void d(djz djzVar) {
        float[] fArr = djzVar.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void e(djz djzVar) {
        float[] fArr = djzVar.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void f(djz djzVar) {
        float[] fArr = djzVar.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void g(djz djzVar) {
        float[] fArr = djzVar.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void h(djz djzVar) {
        float[] fArr = djzVar.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void i(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public final float a() {
        return this.i[1];
    }

    public final float b() {
        return this.i[2];
    }

    public final float c() {
        return this.i[0];
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afbi extends afba {
    public final float a = -1.0f;

    @Override // defpackage.afba
    public final void a(afbu afbuVar, float f, float f2) {
        float f3 = f2 * f;
        afbuVar.e(0.0f, f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        afbq afbqVar = new afbq(0.0f, 0.0f, f4, f4);
        afbqVar.e = 180.0f;
        afbqVar.f = 90.0f;
        afbuVar.g.add(afbqVar);
        afbuVar.b(new afbo(afbqVar), 180.0f, 270.0f);
        float f5 = f4 + 0.0f;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        afbuVar.c = ((-1.8369701E-16f) * f6) + f7;
        afbuVar.d = f7 + (f6 * (-1.0f));
    }
}

package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwr implements awxg {
    public static final ahx a = new ahx();
    public final ahno b;
    private final boolean c;
    private final aftj d;

    public afwr(ahno ahnoVar, boolean z, boolean z2) {
        this.b = ahnoVar;
        this.c = z2;
        this.d = new aftj(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [afvl] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v2, types: [afvl, java.lang.Object] */
    @Override // defpackage.awxg
    public final /* bridge */ /* synthetic */ Object a(awou awouVar) {
        awouVar.getClass();
        afvh afvhVar = (afvh) afty.d.get();
        aftj aftjVar = afvhVar.e;
        afvl afvlVar = afvhVar.c;
        afvl afvlVar2 = afvhVar.d;
        aftj aftjVar2 = this.d;
        if (afvlVar2 == null) {
            afvhVar.d = afvlVar != null ? afvlVar : aftjVar2.a;
        }
        afvhVar.e = aftjVar2;
        afty.q(afvhVar, aftjVar2.a, 1);
        return new jij(afvlVar, aftjVar, afvlVar2);
    }

    public final awou b(awos awosVar) {
        awosVar.getClass();
        afwr afwrVar = (afwr) awosVar.get(a);
        boolean z = afwrVar != null ? afwrVar.c : false;
        ahno ahnoVar = this.b;
        boolean z2 = true;
        if (!z && !afty.a) {
            z2 = false;
        }
        return new afwr(ahnoVar, z2, false);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [afvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [afvl, java.lang.Object] */
    @Override // defpackage.awxg
    public final /* bridge */ /* synthetic */ void c(awou awouVar, Object obj) {
        jij jijVar = (jij) obj;
        awouVar.getClass();
        jijVar.getClass();
        afvh afvhVar = (afvh) afty.d.get();
        afty.q(afvhVar, jijVar.a, 3);
        afvhVar.e = (aftj) jijVar.b;
        afvhVar.d = jijVar.c;
    }

    public final afwr d() {
        boolean z = true;
        if (!this.c && !afty.a) {
            z = false;
        }
        return new afwr(this.b, z, false);
    }

    @Override // defpackage.awou
    public final Object fold(Object obj, awqk awqkVar) {
        return JniZero.r(this, obj, awqkVar);
    }

    @Override // defpackage.awos, defpackage.awou
    public final awos get(awot awotVar) {
        return JniZero.s(this, awotVar);
    }

    @Override // defpackage.awos
    public final awot getKey() {
        return a;
    }

    @Override // defpackage.awou
    public final awou minusKey(awot awotVar) {
        return JniZero.t(this, awotVar);
    }

    @Override // defpackage.awou
    public final awou plus(awou awouVar) {
        return JniZero.u(this, awouVar);
    }
}

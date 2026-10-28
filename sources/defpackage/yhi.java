package defpackage;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yhi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yhi(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final void a() {
        vsk vskVar = (vsk) this.a;
        dd supportFragmentManager = vskVar.b.getSupportFragmentManager();
        if (vskVar.a(supportFragmentManager)) {
            av avVar = new av(supportFragmentManager);
            avVar.l((cc) this.b);
            avVar.e();
        }
    }

    public final void b() {
        vor vorVar = (vor) this.a;
        if (vorVar.b.a() == 0 || !Objects.equals(this.b, vorVar.k())) {
            return;
        }
        vorVar.t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vob] */
    public final void c(boolean z) {
        vor vorVar = (vor) this.b;
        vorVar.D(vorVar.H(this.a), z);
    }

    public final void d(Throwable th) {
        if (th == null) {
            th = new RuntimeException("Unknown error retrieving effect asset.");
        }
        Throwable th2 = th;
        Object obj = this.b;
        ((agrc) ((agrc) ((agrc) vae.a.b()).j(th2)).k("com/google/android/libraries/youtube/creation/effects/selection/EffectsProviderImpl", "handleAssetRetrievalError", (char) 1270, "EffectsProviderImpl.java")).w("%s", "Failed to retrieve effect asset.");
        zvp.b(zvn.b, zvm.M, "[ShortsCreation][Android][Effect] Failed to retrieve effect asset.", th2);
        ahno.ao(new ull(obj, 13), taf.a);
        synchronized (((vae) obj).l) {
            Map map = ((vae) obj).h;
            j$.util.Map.EL.forEach(map, new gpd(this, 7));
            map.clear();
        }
        ((vae) this.b).u();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, vxe] */
    public final void e() {
        ajwn ajwnVar = ((aleo) this.a).d;
        if (ajwnVar == null) {
            ajwnVar = ajwn.a;
        }
        nsh.f(((vax) this.b).a, ajwnVar);
    }

    public yhi(Object obj, Object obj2, byte[] bArr) {
        this.b = obj2;
        this.a = obj;
    }

    public yhi(Object obj, Object obj2, char[] cArr) {
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ yhi(vor vorVar, vob vobVar) {
        this.b = vorVar;
        this.a = vobVar;
    }
}

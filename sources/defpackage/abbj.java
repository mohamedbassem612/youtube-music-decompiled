package defpackage;

import j$.lang.Iterable$EL;
import java.util.Iterator;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abbj implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public abbj(abbk abbkVar, int i) {
        this.$cid = i;
        this.a = abbkVar;
    }

    /* JADX WARN: Type inference failed for: r5v44, types: [abqb, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                Object obj = this.a;
                if (((abbk) obj).d == null || egl10.eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
                    ((abbk) this.a).e = true;
                    return;
                }
                try {
                    ((abbk) obj).d.updateTexImage();
                    ((abbk) obj).d.getTransformMatrix(((abbk) obj).c);
                    ((abbk) obj).f = ((abbk) obj).d.getTimestamp() / 1000;
                    return;
                } catch (RuntimeException e) {
                    ((agrc) ((agrc) ((agrc) abbk.a.b()).j(e)).k("com/google/android/libraries/youtube/player/features/gl/RgbVideoTexture$UpdateTextureRunnable", "run", 159, "RgbVideoTexture.java")).s();
                    return;
                }
            case 1:
                abbd abbdVar = (abbd) this.a;
                if (abbdVar.f != null) {
                    boolean z = abbdVar.l;
                    abbu abbuVar = abbdVar.f;
                    boolean z2 = abbdVar.l;
                    abbp abbpVar = abbuVar.f;
                    abbuVar.i = true;
                }
                abap abapVar = abbdVar.d;
                if (abapVar != null) {
                    boolean z3 = abbdVar.l;
                    abapVar.j();
                    return;
                }
                return;
            case 2:
                ((abdi) this.a).m(abdy.c);
                return;
            case 3:
                ((abdi) this.a).m(abdy.d);
                return;
            case 4:
                ((abdl) this.a).G();
                return;
            case 5:
                ((abdl) this.a).E();
                return;
            case 6:
                ((abek) this.a).g(abdy.c);
                return;
            case 7:
                ((abek) this.a).g(abdy.d);
                return;
            case 8:
                ((abge) this.a).n();
                return;
            case 9:
                ((abgy) this.a).d();
                return;
            case 10:
                Object obj2 = this.a;
                synchronized (obj2) {
                    Iterator it = ((ablx) obj2).c.iterator();
                    while (it.hasNext()) {
                        ((ablw) it.next()).d();
                    }
                    break;
                }
                return;
            case 11:
                abvk abvkVar = ((abmc) this.a).c;
                if (abvkVar.X()) {
                    return;
                }
                abvkVar.A();
                return;
            case 12:
                this.a.c();
                return;
            case 13:
                abqc abqcVar = (abqc) this.a;
                if (abqcVar.g) {
                    return;
                }
                abqcVar.d.a(abqcVar.b);
                return;
            case 14:
                ((abqh) this.a).h();
                return;
            case 15:
                ((abqh) this.a).h();
                return;
            case 16:
                ((abrt) this.a).e();
                return;
            case 17:
                ((abty) this.a).c();
                return;
            case 18:
                abvk abvkVar2 = ((abvi) this.a).b;
                if (abvkVar2.r.k()) {
                    return;
                }
                abvkVar2.aq(true, 18);
                return;
            case 19:
                Object obj3 = this.a;
                gpd gpdVar = new gpd(obj3, 14);
                abvs abvsVar = (abvs) obj3;
                Map map = abvsVar.g;
                j$.util.Map.EL.forEach(map, gpdVar);
                map.clear();
                abvsVar.i = abvs.a;
                abvsVar.j = new abul(0, null);
                abvsVar.m = abuk.a;
                abvsVar.k = 0;
                abvsVar.l = false;
                abvsVar.d.f();
                return;
            default:
                Iterable$EL.forEach(((abvs) this.a).c, new aavj(2));
                return;
        }
    }

    public /* synthetic */ abbj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}

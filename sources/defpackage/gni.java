package defpackage;

import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gni {
    public static final agke a = agke.r("FEmusic_home", "FEmusic_trending");
    public static final agke b = agke.r("SPunlimited", "SPmanage_red");
    public final dd c;
    public final jki d;
    public final hvo e;
    public final HashMap f;
    public final hke g;
    public final vxz h;
    public final vxz i;
    public final isi j;
    public final kro k;

    public gni(dd ddVar, jki jkiVar, hke hkeVar, isi isiVar, hvo hvoVar, vxz vxzVar, vxz vxzVar2, kro kroVar) {
        ddVar.getClass();
        this.c = ddVar;
        jkiVar.getClass();
        this.d = jkiVar;
        hkeVar.getClass();
        this.g = hkeVar;
        this.j = isiVar;
        this.e = hvoVar;
        vxzVar.getClass();
        this.h = vxzVar;
        vxzVar2.getClass();
        this.i = vxzVar2;
        this.k = kroVar;
        this.f = new HashMap();
    }

    public final Optional a(String str) {
        gnf gnfVar = (gnf) this.c.g(str);
        if (gnfVar == null) {
            HashMap map = this.f;
            WeakReference weakReference = (WeakReference) map.get(str);
            if (weakReference != null && (gnfVar = (gnf) weakReference.get()) == null) {
                map.remove(str);
            }
        }
        return Optional.ofNullable(gnfVar);
    }
}

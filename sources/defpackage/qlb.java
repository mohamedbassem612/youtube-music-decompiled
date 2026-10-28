package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qlb implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qlb(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, mbc] */
    @Override // defpackage.agfr
    public final Object io() {
        int i = this.$cid;
        if (i == 0) {
            int i2 = agxm.b;
            int i3 = agxw.a;
            agxv agxvVar = new agxv();
            agxvVar.h(((String) this.b).getBytes());
            agxvVar.a.put((byte) 0);
            agxvVar.d();
            agxvVar.h(((String) this.c).getBytes());
            return ((agyg) ((ayq) this.a).c).j(agxvVar.o().e());
        }
        if (i == 1) {
            return ((mkm) this.b).b.h((View) this.a, (adfx) this.c);
        }
        if (i == 2) {
            boolean z = ((SharedPreferences) this.b.io()).getBoolean("DebugCsiGelLogging", false);
            return new xio(z, this.a);
        }
        if (i != 3) {
            if (i == 4) {
                int iAS = a.aS(((zhl) this.c).aa().h);
                return (iAS == 0 || iAS == 1) ? this.a : this.b;
            }
            ?? r0 = this.a;
            if (((ajbm) r0.io()).c && ((szb) this.b.io()).b(((ajbm) r0.io()).d, szc.f)) {
                return new adim((aerv) this.c.io());
            }
            return null;
        }
        gdi gdiVar = (gdi) this.c.io();
        String str = (String) this.b.io();
        xke xkeVar = (xke) this.a;
        String str2 = (String) xkeVar.c.io();
        String str3 = (String) xkeVar.d.io();
        zrv zrvVar = (zrv) xkeVar.e.io();
        int i4 = typ.a;
        if (ahno.aa(str2)) {
            throw new IllegalArgumentException("packageName cannot be null or empty.");
        }
        if (ahno.aa(str3)) {
            throw new IllegalArgumentException("version cannot be null or empty.");
        }
        zrvVar.getClass();
        gde gdeVar = new gde();
        gdeVar.a = "youtube_".concat(String.valueOf(zrvVar.u));
        gdeVar.f = str2;
        gdeVar.g = str3;
        gdeVar.b = str;
        gdeVar.e = gdiVar;
        gdeVar.c = 1;
        gdeVar.h = (Executor) xkeVar.k.io();
        kro.aT(gdeVar);
        kro kroVar = new kro();
        if (kro.a == null) {
            kro.aT(new gde());
        }
        kro.a.h = kroVar;
        return kro.aU();
    }

    public /* synthetic */ qlb(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ qlb(xke xkeVar, awmd awmdVar, agfr agfrVar, int i) {
        this.$cid = i;
        this.a = xkeVar;
        this.c = awmdVar;
        this.b = agfrVar;
    }

    public /* synthetic */ qlb(zjr zjrVar, zfm zfmVar, zfk zfkVar, int i) {
        this.$cid = i;
        this.c = zjrVar;
        this.b = zfmVar;
        this.a = zfkVar;
    }
}

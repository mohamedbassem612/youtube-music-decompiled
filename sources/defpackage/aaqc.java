package defpackage;

import android.util.Base64;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$LicenseResponse;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaqc extends wnn {
    public final zwb c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaqc(wlp wlpVar, abxv abxvVar, zwb zwbVar, awmd awmdVar, awmd awmdVar2, vyo vyoVar, vxz vxzVar, tqj tqjVar) {
        super(abxvVar, tqjVar.k(1073828827) ? (tgg) awmdVar2.io() : (tgg) awmdVar.io());
        int i = tqr.a;
        this.c = zwbVar;
        this.g = vxzVar;
        this.d = f(altv.a, wlpVar, new wql(14), new wre(9));
        this.e = f(alts.a, wlpVar, new wql(15), new wre(10));
        this.f = vyoVar;
    }

    public static String c(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final altv a(aaqb aaqbVar) {
        return (altv) ((wnh) this.d).c(aaqbVar);
    }

    public final aaqb b() {
        return new aaqb(this.b, this.c.e(), ((vxz) this.g).l(34, 45402343L, false));
    }

    public aaqc(zwb zwbVar, abuz abuzVar, abxv abxvVar, wlp wlpVar, tgg tggVar, txp txpVar, zjr zjrVar) {
        super(abxvVar, tggVar);
        zkf.d(zwbVar);
        this.c = zwbVar;
        zkf.d(abuzVar);
        this.e = abuzVar;
        this.g = txpVar;
        this.d = zjrVar;
        this.f = new dov(f(InnertubeDrmService$LicenseResponse.getDefaultInstance(), wlpVar, new wql(10), new wre(7)), (byte[]) null);
    }
}

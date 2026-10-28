package defpackage;

import android.content.Context;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lmf extends kmz implements llx {
    public static final /* synthetic */ int a = 0;
    private static final khn b;
    private static final kro c;
    private static final kro d;

    static {
        kro kroVar = new kro();
        d = kroVar;
        lme lmeVar = new lme();
        c = lmeVar;
        b = new khn("PoTokens.API", lmeVar, kroVar);
    }

    public lmf(Context context) {
        super(context, null, b, kms.f, kmy.a);
    }

    @Override // defpackage.llx
    public final lpa a(final int i, final byte[] bArr) {
        kpj kpjVar = new kpj();
        kpjVar.b = new klq[]{llv.a};
        kpjVar.a = new kpe() { // from class: lmd
            @Override // defpackage.kpe
            public final void a(Object obj, Object obj2) {
                lmg lmgVar = (lmg) obj;
                int i2 = lmf.a;
                llr llrVar = new llr((kjc) obj2, 2);
                lmc lmcVar = (lmc) lmgVar.C();
                Context context = lmgVar.p;
                ksy ksyVar = kxz.b;
                kmv kmvVarAr = ksy.ar();
                Parcel parcelC = lmcVar.c();
                ClassLoader classLoader = gdc.a;
                parcelC.writeStrongBinder(llrVar);
                parcelC.writeInt(i);
                parcelC.writeByteArray(bArr);
                gdc.c(parcelC, kmvVarAr);
                lmcVar.e(3, parcelC);
            }
        };
        kpjVar.c = 35802;
        return super.A(0, kpjVar.a());
    }
}

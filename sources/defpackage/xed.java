package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xed extends zta implements zvl {
    public final Context a;
    public boolean b;
    public int c;
    public boolean d;
    private final xfg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xed(ztf ztfVar, xet xetVar, xfg xfgVar, Context context, vyo vyoVar) {
        super(ztfVar, xetVar);
        ztfVar.getClass();
        xetVar.getClass();
        xfgVar.getClass();
        context.getClass();
        vyoVar.getClass();
        this.g = xfgVar;
        this.a = context;
        this.b = true;
        this.c = 1;
        vyoVar.c(new ugm(new uhd(18), 15)).ag(new xbo(new hho(this, 11, (boolean[][]) null), 7), new xbo(xec.a, 8));
    }

    private final xeb c(Object obj) {
        zup zupVar;
        int i = alot.CLIENT_ERROR.jH;
        xfg xfgVar = this.g;
        if ((xfgVar.c & (1 << (i & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i)) == null) {
            zupVar = xfgVar.f;
        }
        zupVar.getClass();
        return new xeb(obj, zupVar, this);
    }

    @Override // defpackage.zvl
    public final void a(zvk zvkVar) {
        c(zvkVar).d();
    }

    @Override // defpackage.zvl
    public final void b(ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError) {
        clientErrorOuterClass$ClientError.getClass();
        c(clientErrorOuterClass$ClientError).d();
    }
}

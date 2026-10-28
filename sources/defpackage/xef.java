package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$LogMessage;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xef implements zvl {
    public final Context a;
    public final awmd b;
    public volatile boolean c = true;
    public volatile int d = 1;
    private final awmd e;
    private final Executor f;
    private final vxz g;

    public xef(awmd awmdVar, vyo vyoVar, Context context, Executor executor, awmd awmdVar2, vxz vxzVar) {
        this.b = awmdVar;
        this.a = context;
        this.f = executor;
        this.e = awmdVar2;
        this.g = vxzVar;
        vyoVar.c(new xee(0)).af(new jbq(this, executor, 9));
    }

    private final boolean c(double d) {
        if (this.c) {
            return d >= 1.0d || ThreadLocalRandom.current().nextDouble() <= d;
        }
        return false;
    }

    @Override // defpackage.zvl
    public final void a(zvk zvkVar) {
        if (c(zvkVar.a)) {
            this.f.execute(afwl.i(new vwh(this, zvkVar, ((xej) this.e.io()).a(), 6, (short[]) null)));
        }
    }

    @Override // defpackage.zvl
    public final void b(ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError) {
        if (this.c) {
            if (this.g.k(45779978L, false)) {
                ClientErrorOuterClass$LogMessage defaultInstance = clientErrorOuterClass$ClientError.e;
                if (defaultInstance == null) {
                    defaultInstance = ClientErrorOuterClass$LogMessage.getDefaultInstance();
                }
                if ((defaultInstance.b & 32) != 0) {
                    ClientErrorOuterClass$LogMessage defaultInstance2 = clientErrorOuterClass$ClientError.e;
                    if (defaultInstance2 == null) {
                        defaultInstance2 = ClientErrorOuterClass$LogMessage.getDefaultInstance();
                    }
                    if (!c(defaultInstance2.g)) {
                        return;
                    }
                }
            }
            this.f.execute(afwl.i(new vwh(this, clientErrorOuterClass$ClientError, ((xej) this.e.io()).a(), 7, (short[]) null)));
        }
    }
}

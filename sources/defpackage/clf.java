package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class clf implements cli {
    private final Context a;

    public clf(Context context) {
        this.a = context;
    }

    @Override // defpackage.cli
    public final clk b(gmj gmjVar) {
        Context context;
        if (Build.VERSION.SDK_INT < 31 && ((context = this.a) == null || Build.VERSION.SDK_INT < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new cmb().b(gmjVar);
        }
        int iB = bsy.b(((bse) gmjVar.a).q);
        bvx.h("Creating an asynchronous MediaCodec adapter for track type ".concat(bwp.P(iB)));
        cky ckyVar = new cky(iB);
        ckyVar.a = true;
        return ckyVar.b(gmjVar);
    }
}

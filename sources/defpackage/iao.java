package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iao {
    public final aaqj a;
    public final ScheduledExecutorService b;
    public final int c;
    public final axfd d;
    public final kyr e;
    public final ahgb f;
    private final Context g;
    private final hpd h;
    private final tfq i;

    public iao(Context context, hpd hpdVar, axfd axfdVar, tfq tfqVar, ahgb ahgbVar, ScheduledExecutorService scheduledExecutorService, aaqj aaqjVar, kyr kyrVar, Optional optional) {
        this.g = context;
        this.h = hpdVar;
        this.d = axfdVar;
        this.i = tfqVar;
        this.f = ahgbVar;
        this.b = scheduledExecutorService;
        this.a = aaqjVar;
        this.e = kyrVar;
        this.c = ((Integer) optional.orElse(3)).intValue();
    }

    public static final abnl d(abnl abnlVar, aalx aalxVar, int i) {
        String strU = !TextUtils.isEmpty(abnlVar.u()) ? abnlVar.u() : "PPSV";
        String strB = aalxVar.b();
        byte[] bArrQ = abnlVar.Q();
        ajwo ajwoVar = abnlVar.b;
        ajwo ajwoVarA = iaq.a(strU, strB, i, ajwoVar != null ? (aohs) hna.j(ajwoVar).orElse(null) : null, aigj.v(bArrQ));
        abnk abnkVar = new abnk();
        abnkVar.a = ajwoVarA;
        return abnkVar.a();
    }

    public final ListenableFuture a(abnl abnlVar, boolean z) {
        return ahno.as(this.h.g(abnlVar.w()), new iak(this, abnlVar, z, 0), this.b);
    }

    public final ListenableFuture b(abnl abnlVar, boolean z) {
        return ahno.aq(new ial(this, abnlVar, z, 0), this.b);
    }

    public final boolean c(boolean z) {
        return z && this.i.i() && !txz.g(this.g);
    }
}

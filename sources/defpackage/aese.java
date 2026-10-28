package defpackage;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aese {
    public final long a;
    public final boolean b;
    public final aesa c;
    public final Handler d;
    public final aery e;
    public final awmd f;
    public final Thread g = new aesd(this);

    public aese(Context context, aetb aetbVar, aery aeryVar, aesa aesaVar, vxz vxzVar, awmd awmdVar) {
        this.c = aesaVar;
        this.e = aeryVar;
        this.d = new Handler(context.getMainLooper());
        this.f = awmdVar;
        aqim aqimVar = aetbVar.io().k;
        this.a = (aqimVar == null ? aqim.a : aqimVar).b;
        this.b = vxzVar.l(106, 45428407L, false);
    }
}

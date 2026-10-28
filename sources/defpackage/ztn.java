package defpackage;

import android.content.Context;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ztn {
    public final awmd a;
    public final awmd b;
    public final awmd c;
    public final awmd d;
    public final tqj e;
    public final awmd f;
    public final Context g;
    private final boolean h;

    public ztn(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, tqj tqjVar, Context context, Optional optional) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.f = awmdVar5;
        this.e = tqjVar;
        this.g = context;
        this.h = ((Boolean) optional.orElse(Boolean.FALSE)).booleanValue();
    }

    public final boolean a() {
        int i = tqr.a;
        int iA = this.e.a(1074135289);
        if (this.h && iA == 0) {
            return true;
        }
        return (iA == 0 || iA == 1) ? false : true;
    }
}

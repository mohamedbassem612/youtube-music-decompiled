package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vyt implements zry {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/config/ProtoDataStoreApiaryEnvironment");
    public final awmd b;
    public final awmd c;
    public final Context d;
    public final awmd e;
    public final mbc f;
    public long g = 0;

    public vyt(Context context, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, mbc mbcVar) {
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = context;
        this.e = awmdVar3;
        this.f = mbcVar;
    }

    @Override // defpackage.zry
    public final ListenableFuture a() {
        return ((zzg) this.c.io()).a();
    }

    @Override // defpackage.zry
    public final ListenableFuture b() {
        return ((zzg) this.c.io()).b();
    }

    @Override // defpackage.zry
    public final ListenableFuture c() {
        return ((zzg) this.c.io()).c();
    }
}

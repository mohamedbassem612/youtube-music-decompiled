package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zkr extends zks implements SurfaceHolder.Callback, zlm {
    public zkr(Context context, zjr zjrVar, Executor executor) {
        super(context, zjrVar, executor);
        this.e.setSecure(true);
    }

    @Override // defpackage.zks, defpackage.zlm
    public final zlo B() {
        return zlo.SECURE_SURFACE;
    }

    @Override // defpackage.zks, defpackage.zkl, defpackage.zki
    public final void h(Bitmap bitmap, sxu sxuVar) {
        sxuVar.iT(bitmap, null);
    }
}

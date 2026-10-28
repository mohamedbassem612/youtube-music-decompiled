package androidx.car.app;

import defpackage.bf;
import defpackage.bob;
import defpackage.boc;
import defpackage.xr;
import defpackage.xz;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    final /* synthetic */ xr this$0;
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ boc val$lifecycle;
    final /* synthetic */ xz val$listener;

    CarContext$1(xr xrVar, boc bocVar, Executor executor, xz xzVar) {
        this.this$0 = xrVar;
        this.val$lifecycle = bocVar;
        this.val$executor = executor;
        this.val$listener = xzVar;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (this.val$lifecycle.a().a(bob.c)) {
            this.val$executor.execute(new bf((Object) this.val$listener, (Object) Arrays.asList(strArr), (Object) Arrays.asList(strArr2), 2, (byte[]) null));
        }
    }
}

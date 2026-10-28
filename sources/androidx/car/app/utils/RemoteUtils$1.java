package androidx.car.app.utils;

import androidx.car.app.IOnDoneCallback;
import defpackage.aek;
import defpackage.xy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class RemoteUtils$1 extends IOnDoneCallback.Stub {
    final /* synthetic */ xy val$callback;

    public RemoteUtils$1(xy xyVar) {
        this.val$callback = xyVar;
    }

    @Override // androidx.car.app.IOnDoneCallback
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IOnDoneCallback
    public void onFailure(aek aekVar) {
        this.val$callback.a();
    }

    @Override // androidx.car.app.IOnDoneCallback
    public void onSuccess(aek aekVar) {
        this.val$callback.b();
    }
}

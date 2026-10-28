package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.research.xeno.effect.RemoteAssetManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atvw implements RemoteAssetManager.FetchCallback {
    final /* synthetic */ RemoteAssetManager.FetchCallback a;

    public atvw(RemoteAssetManager.FetchCallback fetchCallback) {
        this.a = fetchCallback;
    }

    @Override // com.google.research.xeno.effect.RemoteAssetManager.FetchCallback
    public final void onCompletion(String str, String str2) {
        new Handler(Looper.getMainLooper()).post(new atvv(this.a, str, str2, 0));
    }
}

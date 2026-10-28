package defpackage;

import android.util.Log;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aev implements aey {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ IOnDoneCallback a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aev(IOnDoneCallback iOnDoneCallback, Object obj, String str, int i) {
        this.$cid = i;
        this.a = iOnDoneCallback;
        this.c = obj;
        this.b = str;
    }

    @Override // defpackage.aey
    public final Object a() {
        aek aekVar;
        if (this.$cid != 0) {
            Object obj = this.c;
            IOnDoneCallback iOnDoneCallback = this.a;
            if (obj == null) {
                aekVar = null;
            } else {
                try {
                    aekVar = new aek(obj);
                } catch (aeq e) {
                    aag.f(iOnDoneCallback, (String) this.b, e);
                }
            }
            iOnDoneCallback.onSuccess(aekVar);
        } else {
            try {
                this.a.onFailure(new aek(new FailureResponse((Throwable) this.b)));
            } catch (aeq e2) {
                Log.e("CarApp.Dispatch", "Serialization failure in ".concat(String.valueOf(this.c)), e2);
            }
        }
        return null;
    }

    public /* synthetic */ aev(IOnDoneCallback iOnDoneCallback, Throwable th, String str, int i) {
        this.$cid = i;
        this.a = iOnDoneCallback;
        this.b = th;
        this.c = str;
    }
}

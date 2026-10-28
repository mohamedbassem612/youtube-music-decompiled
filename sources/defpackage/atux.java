package defpackage;

import android.util.Log;
import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.MultiEffectProcessorBase;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class atux implements Callbacks$StatusCallback {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ atvq b;

    public /* synthetic */ atux(atvq atvqVar, long j, int i) {
        this.$cid = i;
        this.b = atvqVar;
        this.a = j;
    }

    @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
    public final void onCompletion(boolean z, String str) {
        int i = this.$cid;
        if (i == 0) {
            if (z) {
                return;
            }
            Iterator it = ((MultiEffectProcessorBase) this.b).k.iterator();
            while (it.hasNext()) {
                ((atus) it.next()).m(this.a, str);
            }
            Log.e(MultiEffectProcessorBase.f, "Error sending video processor frame packet: ".concat(String.valueOf(str)));
            return;
        }
        if (i == 1) {
            if (z) {
                return;
            }
            Iterator it2 = ((MultiEffectProcessorBase) this.b).k.iterator();
            while (it2.hasNext()) {
                ((atus) it2.next()).m(this.a, str);
            }
            Log.e(MultiEffectProcessorBase.f, "Error sending video processor frame packet: ".concat(String.valueOf(str)));
            return;
        }
        if (i != 2) {
            if (z) {
                return;
            }
            Iterator it3 = ((atvp) this.b).k.iterator();
            while (it3.hasNext()) {
                ((atus) it3.next()).m(this.a, str);
            }
            Log.e(atvp.b, "Error sending video processor frame packet: ".concat(String.valueOf(str)));
            return;
        }
        if (z) {
            return;
        }
        Iterator it4 = ((atvp) this.b).k.iterator();
        while (it4.hasNext()) {
            ((atus) it4.next()).m(this.a, str);
        }
        Log.e(atvp.b, "Error sending video processor frame packet: ".concat(String.valueOf(str)));
    }
}

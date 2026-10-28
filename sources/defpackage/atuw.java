package defpackage;

import android.util.ArrayMap;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.MultiEffectProcessorBase;
import com.google.research.xeno.effect.NativeCallbacks$StateChangeRequestCallback;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class atuw implements NativeCallbacks$StateChangeRequestCallback {
    public final /* synthetic */ atva a;

    public /* synthetic */ atuw(atva atvaVar) {
        this.a = atvaVar;
    }

    @Override // com.google.research.xeno.effect.NativeCallbacks$StateChangeRequestCallback
    public final void onCompletion(String str, long[] jArr, long[] jArr2, String str2, long[] jArr3, String[] strArr) {
        String str3 = MultiEffectProcessorBase.f;
        atva atvaVar = this.a;
        if (atvaVar != null) {
            axoz axozVar = null;
            if (str == null) {
                ahub ahubVar = Effect.d;
                int i = atvu.a;
                ArrayList arrayList = new ArrayList();
                if (jArr != null) {
                    for (long j : jArr) {
                        arrayList.add(ahubVar.t(j));
                    }
                }
                agke.n(arrayList);
                HashSet hashSet = new HashSet();
                if (jArr2 != null) {
                    for (long j2 : jArr2) {
                        hashSet.add(ahubVar.t(j2));
                    }
                }
                agkz.n(hashSet);
                ArrayMap arrayMap = new ArrayMap();
                if (jArr3 != null) {
                    for (int i2 = 0; i2 < jArr3.length; i2++) {
                        arrayMap.put((Effect) ahubVar.t(jArr3[i2]), strArr[i2]);
                    }
                }
                axozVar = new axoz(str2, agkj.h(arrayMap), null);
            }
            atvaVar.a(str, axozVar);
        }
    }
}

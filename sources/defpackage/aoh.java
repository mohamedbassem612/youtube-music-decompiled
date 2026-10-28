package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aoh implements Function0 {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aoh(int i) {
        this.$cid = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.$cid) {
            case 0:
                if (a.x()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    awuq awuqVar = awvi.a;
                    choreographer = (Choreographer) awqx.l(axds.a, new pbo(null, 1, null));
                }
                aok aokVar = new aok(choreographer, aao.c(Looper.getMainLooper()));
                return aokVar.plus(aokVar.i);
            case 1:
                ahm ahmVar = aki.a;
                return null;
            case 2:
                ahm ahmVar2 = aoo.a;
                return null;
            case 3:
                ahm ahmVar3 = aoq.a;
                return Boolean.FALSE;
            case 4:
                ahm ahmVar4 = aoq.a;
                return Boolean.TRUE;
            case 5:
                ahm ahmVar5 = aoq.a;
                throw new IllegalStateException("CompositionLocal LocalOwner not present");
            case 6:
                int i = bpq.a;
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 7:
                int i2 = doy.a;
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 8:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 9:
                ecp ecpVar = ecp.a;
                return awmy.a;
            case 10:
                return agrf.h("com/google/android/apps/youtube/music/shell/navigation/SearchNavigationPreparer");
            case 11:
                ahfi ahfiVar = new ahfi();
                ahfiVar.c("aag-pool-%d");
                return Executors.newFixedThreadPool(4, ahfi.a(ahfiVar));
            case 12:
                return new mao(new mal(0));
            case 13:
            case 14:
                return awmy.a;
            case 15:
                awmi awmiVar = vyp.a;
                axae[] axaeVarArr = new axae[SemanticState.Focused];
                for (int i3 = 0; i3 < 128; i3++) {
                    axaeVarArr[i3] = axal.d(0, 1, 2);
                }
                return axaeVarArr;
            case 16:
                return awmy.a;
            case 17:
                return Float.valueOf(0.0f);
            case 18:
                return new adrn();
            case 19:
                Logger logger = afmd.a;
                return agrf.h("com/google/apps/tiktok/coroutines/TikTokExceptionHandlerKt");
            default:
                ahva ahvaVar = ahva.a;
                return (ahvc) awrc.f(Optional.empty());
        }
    }
}

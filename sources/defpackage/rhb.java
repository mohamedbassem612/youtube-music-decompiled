package defpackage;

import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.FilterProcessorBase;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class rhb extends atvp implements rhu {
    @Override // defpackage.rhu
    public final agke a() {
        Effect effect = ((FilterProcessorBase) this).a;
        return effect == null ? agpi.a : agke.q(effect);
    }

    @Override // defpackage.rhu
    public final void d(agke agkeVar, final Callbacks$StatusCallback callbacks$StatusCallback) {
        final Effect effect = (Effect) ((Optional) Collection.EL.stream(agkeVar).collect(agol.a)).orElse(null);
        atqo.b(Arrays.asList(this, effect), new atvf() { // from class: atti
            @Override // defpackage.atvf
            public final void a(long[] jArr) {
                int i = 0;
                long j = jArr[0];
                Callbacks$StatusCallback callbacks$StatusCallback2 = callbacks$StatusCallback;
                if (j == 0) {
                    callbacks$StatusCallback2.onCompletion(false, "Processor has been released");
                    return;
                }
                Effect effect2 = effect;
                FilterProcessorBase.nativeSetEffect(j, jArr[1], new attj(this, effect2, callbacks$StatusCallback2, i));
            }
        });
    }
}

package defpackage;

import com.google.research.xeno.effect.Control;
import com.google.research.xeno.effect.Effect;
import j$.util.Optional;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qzn extends qvk implements qzh {
    public static final /* synthetic */ int b = 0;

    public qzn(Effect effect, UUID uuid) {
        super(effect, uuid);
    }

    @Override // defpackage.qzh
    public final void b(rfs rfsVar) {
        Optional optionalOfNullable = Optional.ofNullable((Control) this.a.b.get(f("playback_position")));
        jfn jfnVar = new jfn(rfsVar, 17);
        if (true == optionalOfNullable.isPresent()) {
            Object obj = optionalOfNullable.get();
            Object obj2 = jfnVar.a;
            Control.DoubleSetting doubleSetting = ((Control) obj).f;
            double dE = ((rfs) obj2).e();
            long j = doubleSetting.b;
            Control.nativeGetDoubleValue(j);
            Control.nativeSetDoubleValue(j, dE / 1000000.0d);
            Iterator it = doubleSetting.a.iterator();
            while (it.hasNext()) {
                ((atst) it.next()).a();
            }
        }
    }
}

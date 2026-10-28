package defpackage;

import com.google.research.xeno.effect.Control;
import com.google.research.xeno.effect.Effect;
import j$.util.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rad extends qvk implements qzh {
    public int b;

    public rad(Effect effect) {
        super(effect);
        Optional optionalOfNullable = Optional.ofNullable((Control) effect.b.get("sequence_id"));
        this.b = ((Integer) (true == optionalOfNullable.isPresent() ? Optional.ofNullable(Integer.valueOf(((Control) optionalOfNullable.get()).c.a())) : optionalOfNullable).orElse(0)).intValue();
    }

    @Override // defpackage.qzh
    public final synchronized void b(rfs rfsVar) {
        Optional optionalOfNullable = Optional.ofNullable((Control) this.a.b.get("sequence_id"));
        jfn jfnVar = new jfn(this, 18);
        if (true == optionalOfNullable.isPresent()) {
            Object obj = optionalOfNullable.get();
            Object obj2 = jfnVar.a;
            Control.IntSetting intSetting = ((Control) obj).c;
            int i = ((rad) obj2).b;
            intSetting.a();
            Control.nativeSetIntValue(intSetting.b, i);
            Iterator it = intSetting.a.iterator();
            while (it.hasNext()) {
                ((atst) it.next()).c();
            }
        }
    }

    @Override // defpackage.qvk
    public final synchronized void j() {
        this.b++;
    }
}

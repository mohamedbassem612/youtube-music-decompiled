package defpackage;

import android.util.Size;
import com.google.research.xeno.effect.Control;
import j$.util.Optional;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qzm extends qvi {
    public static final /* synthetic */ int i = 0;
    public final boolean b;
    public final Size h;
    private final qua j;

    public qzm(UUID uuid, qwx qwxVar, Size size, boolean z, qua quaVar) {
        super(uuid, qwxVar);
        this.h = size;
        this.b = z;
        this.j = quaVar;
    }

    @Override // defpackage.qvc
    public final void d(qvk qvkVar) {
        if (this.j.F) {
            return;
        }
        jrr jrrVar = (jrr) atqs.a.createBuilder();
        long jA = ahbt.a(this.e);
        jrrVar.copyOnWrite();
        atqs atqsVar = (atqs) jrrVar.instance;
        atqsVar.d = 4;
        atqsVar.e = Long.valueOf(jA);
        atqs atqsVar2 = (atqs) jrrVar.build();
        aihh aihhVar = (aihh) atwa.a.createBuilder();
        aihhVar.e(atqs.b, atqsVar2);
        atwa atwaVar = (atwa) aihhVar.build();
        Optional optionalOfNullable = Optional.ofNullable((Control) qvkVar.a.b.get(f("gl_skottie_renderer_calculator_runtime_options")));
        jfn jfnVar = new jfn(atwaVar, 16);
        if (true == optionalOfNullable.isPresent()) {
            ((Control) optionalOfNullable.get()).d.a((atwa) jfnVar.a);
        }
    }
}

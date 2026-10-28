package defpackage;

import com.google.research.xeno.effect.Effect;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class usq implements Consumer {
    private final aufd a;
    private final aqi b;
    private final qvm c;

    public usq(aufd aufdVar, aqi aqiVar, qvm qvmVar) {
        this.a = aufdVar;
        this.b = aqiVar;
        this.c = qvmVar;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* synthetic */ void r(Object obj) {
        uzj uzjVar = (uzj) obj;
        Effect effect = uzjVar.a;
        aqi aqiVar = this.b;
        if (effect == null) {
            aqiVar.d(new RuntimeException("Unable to restore effect from draft."));
        } else {
            aufd aufdVar = this.a;
            aqiVar.b(Optional.of(new usr(aufdVar, yno.gs(effect, aufdVar, uzjVar.b, this.c))));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

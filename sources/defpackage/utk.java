package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utk implements uth {
    private final Context a;

    public utk(Context context) {
        this.a = context;
    }

    @Override // defpackage.uth
    public final boolean a(usd usdVar, auhs auhsVar) {
        int i = auhsVar.b;
        if ((i & 1) == 0 || (i & 2) == 0) {
            return true;
        }
        Optional optionalOf = Optional.of(new utq(usdVar.a(), ((Float) usj.q(auhsVar, arfu.VOLUME_TYPE_ORIGINAL).orElse(Float.valueOf(1.0f))).floatValue(), Optional.empty()));
        Context context = this.a;
        Uri uri = Uri.parse(auhsVar.c);
        aigu aiguVar = auhsVar.h;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        Duration durationAw = ahng.aw(aiguVar);
        long jA = usdVar.a();
        Duration duration = Duration.ZERO;
        Duration duration2 = Duration.ZERO;
        jrr jrrVarS = usj.s(durationAw, duration, jA);
        aihf aihfVarCreateBuilder = auhc.a.createBuilder();
        aihf aihfVarCreateBuilder2 = auhl.a.createBuilder();
        String string = uri.toString();
        aihfVarCreateBuilder2.copyOnWrite();
        auhl auhlVar = (auhl) aihfVarCreateBuilder2.instance;
        string.getClass();
        auhlVar.b |= 1;
        auhlVar.c = string;
        auhl auhlVar2 = (auhl) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        auhc auhcVar = (auhc) aihfVarCreateBuilder.instance;
        auhlVar2.getClass();
        auhcVar.d = auhlVar2;
        auhcVar.c = 1;
        aigu aiguVarAu = ahng.au(duration2);
        aihfVarCreateBuilder.copyOnWrite();
        auhc auhcVar2 = (auhc) aihfVarCreateBuilder.instance;
        aiguVarAu.getClass();
        auhcVar2.e = aiguVarAu;
        auhcVar2.b |= 1;
        auhc auhcVar3 = (auhc) aihfVarCreateBuilder.build();
        jrrVarS.copyOnWrite();
        augy augyVar = (augy) jrrVarS.instance;
        augy augyVar2 = augy.a;
        auhcVar3.getClass();
        augyVar.d = auhcVar3;
        augyVar.c = 108;
        return usdVar.l(utr.d(context, (augy) jrrVarS.build(), optionalOf, true, false));
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class umq implements utu {
    private final Context a;
    private final umn b;
    private final zvl c;

    public umq(Context context, umn umnVar, zvl zvlVar) {
        this.a = context;
        this.b = umnVar;
        this.c = zvlVar;
    }

    @Override // defpackage.utu
    public final /* synthetic */ utv a(auhs auhsVar) {
        throw null;
    }

    @Override // defpackage.utu
    public final utv b(auhs auhsVar) {
        Duration durationV;
        aufa aufaVarGm;
        auhsVar.getClass();
        ArrayList arrayList = new ArrayList();
        umn umnVar = this.b;
        if ((umnVar.b & 2) != 0) {
            auey aueyVar = umnVar.c;
            if (aueyVar == null) {
                aueyVar = auey.a;
            }
            aueyVar.getClass();
            String str = umnVar.d;
            str.getClass();
            Uri uri = Uri.parse(str);
            uri.getClass();
            arrayList.add(new uuv(aueyVar, qwo.b(uri, this.a)));
        }
        if ((umnVar.b & 4) != 0) {
            aigu aiguVar = umnVar.e;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aiguVar.getClass();
            durationV = aext.v(aiguVar);
        } else {
            durationV = null;
        }
        if (durationV != null && a.y(durationV) && (aufaVarGm = yno.gm(auhsVar)) != null) {
            auey aueyVar2 = aufaVarGm.c == 102 ? (auey) aufaVarGm.d : auey.a;
            auey aueyVar3 = umnVar.c;
            if (aueyVar3 == null) {
                aueyVar3 = auey.a;
            }
            if (awrc.c(aueyVar2, aueyVar3)) {
                arrayList.add(new uvf(aufaVarGm.e, durationV));
                aigu aiguVar2 = aufaVarGm.h;
                if (aiguVar2 == null) {
                    aiguVar2 = aigu.a;
                }
                aiguVar2.getClass();
                Duration durationV2 = aext.v(aiguVar2);
                aigu aiguVar3 = aufaVarGm.f;
                if (aiguVar3 == null) {
                    aiguVar3 = aigu.a;
                }
                aiguVar3.getClass();
                Duration durationV3 = aext.v(aiguVar3);
                aigu aiguVar4 = aufaVarGm.g;
                if (aiguVar4 == null) {
                    aiguVar4 = aigu.a;
                }
                aiguVar4.getClass();
                Duration durationV4 = aext.v(aiguVar4);
                Duration durationMinus = durationV.minus(durationV2);
                durationMinus.getClass();
                if (durationV4.compareTo(durationMinus) > 0) {
                    if (durationMinus.isNegative()) {
                        auey aueyVar4 = umnVar.c;
                        if (aueyVar4 == null) {
                            aueyVar4 = auey.a;
                        }
                        String str2 = String.format("Source start time beyond source duration. Video ID: %s, Source start: %s, Duration: %s, Updated source duration: %s", Arrays.copyOf(new Object[]{aueyVar4.c, durationV2, durationV4, durationV}, 4));
                        str2.getClass();
                        IllegalStateException illegalStateException = new IllegalStateException(str2);
                        zvl zvlVar = this.c;
                        zvj zvjVarA = zvk.a();
                        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                        zvjVarA.j = 40;
                        zvjVarA.d("unexpected source duration");
                        zvjVarA.f(illegalStateException);
                        zvlVar.a(zvjVarA.a());
                        long j = aufaVarGm.e;
                        Duration duration = Duration.ZERO;
                        duration.getClass();
                        arrayList.add(new uuh(j, duration));
                        arrayList.add(new uuk(aufaVarGm.e, durationV3, durationV3.plus((Duration) atqq.h(durationV, durationV4))));
                    } else {
                        arrayList.add(new uuk(aufaVarGm.e, durationV3, durationV3.plus(durationMinus)));
                    }
                }
            }
        }
        return new utt(arrayList);
    }
}

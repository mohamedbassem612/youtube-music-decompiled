package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utf implements uth {
    private final boolean a;

    public utf(boolean z) {
        this.a = z;
    }

    private static final boolean b(usd usdVar, auhs auhsVar, arfu arfuVar) {
        aiie aiieVar = auhsVar.e;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : aiieVar) {
            if (yno.gp(auhsVar, ((aufa) obj).e) == arfuVar) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new uvk((aufa) it.next()));
        }
        return usdVar.i(new utt(arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    @Override // defpackage.uth
    public final boolean a(usd usdVar, auhs auhsVar) {
        boolean z;
        boolean z2;
        usdVar.getClass();
        auhsVar.getClass();
        if (this.a) {
            if (b(usdVar, auhsVar, arfu.VOLUME_TYPE_VOICEOVER)) {
                aiie aiieVar = auhsVar.f;
                aiieVar.getClass();
                aihl aihlVar = augp.b;
                aihlVar.getClass();
                if (usdVar.i(new ute((augp) yno.gh(aiieVar, aihlVar)))) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (b(usdVar, auhsVar, arfu.VOLUME_TYPE_TEXT_TO_SPEECH)) {
            aiie aiieVar2 = auhsVar.f;
            aiieVar2.getClass();
            aihl aihlVar2 = augl.b;
            aihlVar2.getClass();
            if (usdVar.i(new utd((augl) yno.gh(aiieVar2, aihlVar2)))) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        aufa aufaVarGm = yno.gm(auhsVar);
        boolean zH = aufaVarGm == null ? true : usdVar.h(new uup(aufaVarGm, 0));
        boolean zB = b(usdVar, auhsVar, arfu.VOLUME_TYPE_VISUAL_REMIX);
        aiie aiieVar3 = auhsVar.k;
        aiieVar3.getClass();
        return z && z2 && zH && zB && usdVar.i(new uuo(aiieVar3));
    }
}

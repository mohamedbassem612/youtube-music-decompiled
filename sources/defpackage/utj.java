package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utj implements uth {
    private final Context a;
    private final zf b;

    public utj(Context context, zf zfVar) {
        this.a = context;
        this.b = zfVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [awmd, java.lang.Object] */
    @Override // defpackage.uth
    public final boolean a(usd usdVar, auhs auhsVar) {
        int i;
        aiie<aufw> aiieVar = ((aufx) yno.gx(auhsVar, aufx.b)).c;
        int i2 = auhsVar.b;
        if ((i2 & 1) != 0 && (i2 & 2) != 0 && aiieVar.isEmpty()) {
            Context context = (Context) this.b.a.io();
            context.getClass();
            return new utk(context).a(usdVar, auhsVar);
        }
        auge augeVar = (auge) yno.gh(auhsVar.f, auge.b);
        boolean z = true;
        boolean z2 = augeVar == null || usdVar.i(new uuu(augeVar, 1));
        agjz agjzVar = new agjz(4);
        boolean z3 = false;
        for (aufw aufwVar : aiieVar) {
            Optional optionalN = usj.n(auhsVar, aufwVar.c);
            if (optionalN.isEmpty()) {
                z3 = z;
            } else {
                augy augyVar = (augy) optionalN.get();
                Optional optionalM = (aufwVar.b & 2) != 0 ? usj.m(auhsVar, aufwVar.d) : Optional.empty();
                if (z == optionalM.isPresent()) {
                    aufa aufaVar = (aufa) optionalM.get();
                    long j = aufaVar.e;
                    float f = aufaVar.i;
                    String str = (aufaVar.c == 100 ? (aufb) aufaVar.d : aufb.a).c;
                    aigu aiguVar = aufaVar.h;
                    if (aiguVar == null) {
                        aiguVar = aigu.a;
                    }
                    optionalM = Optional.ofNullable(new utq(j, f, Optional.of(new uto(str, aiguVar))));
                }
                boolean z4 = z;
                agjzVar.h(utr.d(this.a, augyVar, optionalM, z4 != (auhsVar.b & 1) ? false : z4, aufwVar.e));
                z = z4;
            }
        }
        boolean z5 = z;
        boolean zI = usdVar.i(new utt(agjzVar.g()));
        boolean zI2 = usdVar.i(new uvh((aufv) yno.gh(auhsVar.f, aufv.b)));
        agjz agjzVar2 = new agjz(4);
        for (aufj aufjVar : auhsVar.m) {
            aufd aufdVar = aufjVar.e;
            if (aufdVar == null) {
                aufdVar = aufd.a;
            }
            agjzVar2.h(new uuq(aufdVar, Long.valueOf(aufjVar.c), Long.valueOf(aufjVar.d), this.a));
        }
        Stream stream = Collection.EL.stream(agjzVar2.g());
        usdVar.getClass();
        boolean zAllMatch = stream.allMatch(new uso(usdVar, 5));
        agke agkeVarF = usj.f(auhsVar);
        int size = agkeVarF.size();
        boolean zI3 = z5;
        int i3 = 0;
        while (i3 < size) {
            Iterator it = yno.gn(auhsVar, ((augy) agkeVarF.get(i3)).e).keySet().iterator();
            while (true) {
                i = i3 + 1;
                if (it.hasNext()) {
                    Optional optionalN2 = usj.n(auhsVar, ((Long) it.next()).longValue());
                    try {
                        if (optionalN2.isPresent()) {
                            zI3 &= usdVar.i(new utl((augy) optionalN2.get(), new usz()).a(usdVar.c()));
                        }
                    } catch (utw unused) {
                        zI3 = false;
                    }
                }
            }
            i3 = i;
        }
        boolean zI4 = (auhsVar.b & 16) != 0 ? usdVar.i(new uum(auhsVar.l)) : z5;
        if (zI && !z3 && z2 && zI2 && zAllMatch && zI3 && zI4) {
            return z5;
        }
        return false;
    }
}

package defpackage;

import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hlg implements Comparator {
    public final boolean a;
    private final int b;
    private final vxz c;

    public hlg(int i, boolean z, vxz vxzVar) {
        this.b = i;
        this.a = z;
        this.c = vxzVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00a3, please report this as an issue */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    private final long a(hcg hcgVar, Optional optional) {
        Long lValueOf;
        ArrayList arrayList = new ArrayList();
        int i = this.b;
        if (hmy.m(1, i)) {
            arrayList.add(Long.valueOf(hpd.b(hcgVar.d)));
        }
        int i2 = 2;
        if (hmy.m(2, i)) {
            gtr gtrVar = new gtr(this, arrayList, i2);
            if (true == optional.isPresent()) {
                Object obj = optional.get();
                Object obj2 = gtrVar.a;
                ?? r1 = gtrVar.b;
                weh wehVar = (weh) obj;
                if (((hlg) obj2).a) {
                    Optional optionalQ = hpb.q(wehVar);
                    if (true == optionalQ.isPresent()) {
                        optionalQ.get();
                        optionalQ = Optional.ofNullable(-1L);
                    }
                    lValueOf = (Long) optionalQ.orElse(Long.valueOf(hpb.b(wehVar)));
                } else {
                    lValueOf = Long.valueOf(hpb.b(wehVar));
                }
                r1.add(lValueOf);
            }
            if (this.c.m(51, 45784400L)) {
                Optional optional2 = hcgVar.a;
                if (optional2.isPresent() && (optional2.get() instanceof anuk) && optional.isPresent()) {
                    String str = hcgVar.f;
                    if (str.equals("LM") || str.startsWith("PL")) {
                        agke agkeVar = hcgVar.d;
                        int i3 = hpd.b;
                        arrayList.add(Long.valueOf(agkeVar != null ? ((Long) Collection.EL.stream(agkeVar).map(new hpa(3)).max(Comparator$CC.naturalOrder()).orElse(0L)).longValue() : 0L));
                    }
                } else {
                    agke agkeVar2 = hcgVar.d;
                    int i4 = hpd.b;
                    arrayList.add(Long.valueOf(agkeVar2 != null ? ((Long) Collection.EL.stream(agkeVar2).map(new hpa(3)).max(Comparator$CC.naturalOrder()).orElse(0L)).longValue() : 0L));
                }
            } else {
                agke agkeVar3 = hcgVar.d;
                int i5 = hpd.b;
                arrayList.add(Long.valueOf(agkeVar3 != null ? ((Long) Collection.EL.stream(agkeVar3).map(new hpa(3)).max(Comparator$CC.naturalOrder()).orElse(0L)).longValue() : 0L));
            }
        }
        return ((Long) Collections.max(arrayList)).longValue();
    }

    private final long b(hcg hcgVar) {
        String str = hcgVar.f;
        if (str.equals("PPSE") || str.equals("PPSV")) {
            return a(hcgVar, hcgVar.b);
        }
        Optional optional = hcgVar.b;
        if (!optional.isEmpty()) {
            Optional optional2 = hcgVar.a;
            if (!optional2.isEmpty()) {
                if (optional2.get() instanceof anyx) {
                    return hmy.l((anyo) optional.get(), this.b).longValue();
                }
                if ((optional2.get() instanceof anuk) || (optional2.get() instanceof anjx)) {
                    return a(hcgVar, optional);
                }
                throw new IllegalArgumentException("Unsupported entity type ".concat(String.valueOf(hcgVar.getClass().getName())));
            }
        }
        return -1L;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        hcg hcgVar = (hcg) obj;
        hcg hcgVar2 = (hcg) obj2;
        hcgVar.getClass();
        hcgVar2.getClass();
        return Long.compare(b(hcgVar2), b(hcgVar));
    }
}

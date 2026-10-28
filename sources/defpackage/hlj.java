package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hlj implements Comparator {
    private final mbc a;

    public hlj(mbc mbcVar) {
        this.a = mbcVar;
    }

    private final long a(hcg hcgVar) {
        Optional optional = hcgVar.b;
        optional.getClass();
        weh wehVar = (weh) awrc.f(optional);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(hpd.b(hcgVar.d));
        instantOfEpochMilli.getClass();
        if (wehVar != null) {
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(hpb.b(wehVar));
            instantOfEpochMilli2.getClass();
            instantOfEpochMilli = (Instant) atqq.g(instantOfEpochMilli2, instantOfEpochMilli);
        }
        return Math.min(Duration.between(instantOfEpochMilli, this.a.f()).toDays(), 30L);
    }

    private static final long b(hcg hcgVar) {
        double d;
        int size = hcgVar.c.size();
        if (size < 10) {
            double d2 = size;
            d = d2 + d2;
        } else {
            d = (((double) (size - 10)) * 0.5d) + 20.0d;
        }
        return (long) Math.min(d, 30.0d);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        hcg hcgVar = (hcg) obj;
        hcg hcgVar2 = (hcg) obj2;
        hcgVar.getClass();
        hcgVar2.getClass();
        return atqq.f(Long.valueOf(b(hcgVar) - a(hcgVar)), Long.valueOf(b(hcgVar2) - a(hcgVar2)));
    }
}

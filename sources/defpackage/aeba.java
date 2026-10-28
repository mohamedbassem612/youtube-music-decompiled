package defpackage;

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeba {
    static final long a;
    public static final /* synthetic */ int b = 0;
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/rendering/ui/frequencycap/FrequencyCapController");
    private final mbc d;
    private final aunn e;
    private final zwb f;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        a = 86400000L;
    }

    public aeba(mbc mbcVar, aunn aunnVar, zwb zwbVar) {
        this.d = mbcVar;
        this.e = aunnVar;
        this.f = zwbVar;
    }

    public final void a(final List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        final String strI = this.f.e().i();
        final long epochMilli = this.d.f().toEpochMilli();
        taf.j(((tpq) this.e.io()).b(new agek() { // from class: aeaz
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                long j;
                atpw atpwVar = (atpw) obj;
                int i = aeba.b;
                jrr jrrVar = atpwVar == null ? (jrr) atpw.a.createBuilder() : (jrr) atpwVar.toBuilder();
                Iterator it = list.iterator();
                while (true) {
                    j = epochMilli;
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = strI;
                    String strValueOf = String.valueOf(((ajub) it.next()).b);
                    atpx atpxVar = atpx.a;
                    Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((atpw) jrrVar.instance).c);
                    String strConcat = str.concat(strValueOf);
                    if (mapUnmodifiableMap.containsKey(strConcat)) {
                        atpxVar = (atpx) mapUnmodifiableMap.get(strConcat);
                    }
                    jrq jrqVar = (jrq) atpxVar.toBuilder();
                    jrqVar.h(j);
                    jrrVar.a(strConcat, (atpx) jrqVar.build());
                }
                atpw atpwVar2 = (atpw) jrrVar.build();
                jrr jrrVar2 = (jrr) atpw.a.createBuilder();
                boolean z = atpwVar2.d;
                jrrVar2.copyOnWrite();
                atpw atpwVar3 = (atpw) jrrVar2.instance;
                atpwVar3.b |= 1;
                atpwVar3.d = z;
                long j2 = atpwVar2.e;
                jrrVar2.copyOnWrite();
                atpw atpwVar4 = (atpw) jrrVar2.instance;
                atpwVar4.b |= 2;
                atpwVar4.e = j2;
                if (atpwVar2 == null || atpwVar2.c.size() == 0) {
                    return (atpw) jrrVar2.build();
                }
                long j3 = j - aeba.a;
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(atpwVar2.c).entrySet()) {
                    jrq jrqVar2 = (jrq) atpx.a.createBuilder();
                    Iterator it2 = ((atpx) entry.getValue()).b.iterator();
                    while (it2.hasNext()) {
                        long jLongValue = ((Long) it2.next()).longValue();
                        if (jLongValue >= j3) {
                            jrqVar2.h(jLongValue);
                        }
                    }
                    if (((atpx) jrqVar2.instance).b.size() > 0) {
                        jrrVar2.a((String) entry.getKey(), (atpx) jrqVar2.build());
                    }
                }
                return (atpw) jrrVar2.build();
            }
        }), new abwu(13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        String strI = this.f.e().i();
        long epochMilli = this.d.f().toEpochMilli();
        atpw atpwVar = (atpw) taf.e(((tpq) this.e.io()).a(), 2000L, TimeUnit.MILLISECONDS, atpw.a);
        if (atpwVar.d) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajub ajubVar = (ajub) it.next();
            String strConcat = strI.concat(String.valueOf(ajubVar.b));
            atpx atpxVar = atpx.a;
            atpx atpxVar2 = (atpx) atpwVar.c.get(strConcat);
            if (atpxVar2 != null) {
                atpxVar = atpxVar2;
            }
            long j = atpwVar.e;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (j < 0) {
                j = ajubVar.d;
            }
            long jMax = Math.max(epochMilli - timeUnit.toMillis(j), epochMilli - a);
            Iterator it2 = atpxVar.b.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (((Long) it2.next()).longValue() > jMax) {
                    i++;
                }
            }
            if (i >= ajubVar.c) {
                return false;
            }
        }
        return true;
    }
}

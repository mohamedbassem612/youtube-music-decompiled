package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ifa {
    private static final agrf c = agrf.h("com/google/android/apps/youtube/music/player/sequence/MusicSequencerWrapper");
    public final Set a;
    public final abur b;
    private final abvk d;

    public ifa(abvn abvnVar) {
        abvnVar.getClass();
        this.b = abvnVar.aa();
        this.d = abvnVar.o();
        this.a = new LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    public final void a(List list, abuk abukVar, abuc abucVar, boolean z, boolean z2) {
        list.getClass();
        list.size();
        abul abulVar = abucVar.a;
        if (z && !z2) {
            abur aburVar = this.b;
            abul abulVarB = aburVar.b.b();
            agke agkeVar = aburVar.a;
            agkeVar.getClass();
            abun abunVarF = aasc.f(abulVarB, agkeVar);
            abun abunVarF2 = aasc.f(abulVar.b(), list);
            if (!(abunVarF instanceof abvz) || !(abunVarF2 instanceof abvz) || !abnn.i(((abvz) abunVarF).a(), ((abvz) abunVarF2).a())) {
                abvk abvkVar = this.d;
                if (abvkVar.ad()) {
                    abvkVar.p();
                }
            }
        }
        if (z) {
            abulVar.getClass();
            if (aasc.f(abulVar, list) == null) {
                ((agrc) c.c().k("com/google/android/apps/youtube/music/player/sequence/MusicSequencerWrapper", "setSequence", 50, "MusicSequencerWrapper.kt")).A("setSequence: index=%s, size=%d", abulVar, list.size());
            } else {
                this.b.c(list, abukVar, abucVar);
            }
        } else {
            this.b.c(list, abukVar, abucVar);
        }
        if (!z || list.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((abtv) it.next()).k();
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acgo {
    public final acdm a;
    public final Map b;
    public final Executor c;
    public final abmt d;
    public final boolean e;
    public volatile ahhp f;
    private final avmm g;
    private final aglz h;

    public acgo(acdm acdmVar, Map map, Executor executor, abmt abmtVar, avlh avlhVar) {
        avmm avmmVar = new avmm();
        this.g = avmmVar;
        this.h = new aghn(null);
        this.a = acdmVar;
        this.b = map;
        this.c = executor;
        this.d = abmtVar;
        this.e = abmtVar.m.l(288, 45858189L, false);
        if (abmtVar.g.l(284, 45729414L, false)) {
            avmmVar.c(avlhVar.ak(new aceb(this, 16)));
        }
    }

    public final void a(akje akjeVar, acfx acfxVar, long j, boolean z) {
        acgl acglVar = (acgl) this.b.get(akjd.a(akjeVar.b));
        if (acglVar != null) {
            acglVar.b(akjeVar, acfxVar, j, z);
        }
    }

    public final void b(List list) {
        long j;
        boolean z;
        acfw acfwVarH = this.a.h();
        if (acfwVarH == null) {
            zvp.a(zvn.a, zvm.k, "Error registering Server driven CueRanges, trying to add CueRanges without an available VideoPlayback");
            return;
        }
        acga acgaVarG = acfwVarH.g();
        if (acgaVarG == null) {
            zvp.a(zvn.a, zvm.k, "Error registering Server driven CueRanges, trying to add CueRanges without an available CueRangeRegistrar");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            akjg akjgVar = (akjg) it.next();
            akjh akjhVarA = akjh.a(akjgVar.c);
            if (akjhVarA == null) {
                akjhVarA = akjh.PLAYER_CUE_RANGE_SET_IDENTIFIER_UNKNOWN;
            }
            akjh akjhVar = akjhVarA;
            if (akjhVar == akjh.PLAYER_CUE_RANGE_SET_IDENTIFIER_UNKNOWN) {
                zvp.a(zvn.a, zvm.k, "Error registering Server driven CueRanges, trying to add CueRanges with an UNKNOWN PlayerCueRangeSetIdentifier.");
            } else if (akjhVar != akjh.PLAYER_CUE_RANGE_SET_IDENTIFIER_AUTO_SPEED) {
                aglz aglzVar = this.h;
                if (aglzVar.t(akjhVar)) {
                    acgaVarG.o(aglzVar.g(akjhVar));
                }
                if (!akjgVar.d.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (akjf akjfVar : akjgVar.d) {
                        arew arewVar = akjfVar.d;
                        if (arewVar == null) {
                            arewVar = arew.a;
                        }
                        boolean z2 = true;
                        if ((arewVar.b & 2) != 0) {
                            j = arewVar.d;
                            z = true;
                        } else {
                            long jB = arewVar.c;
                            if (jB < 0) {
                                jB += acfwVarH.b();
                            }
                            z2 = false;
                            j = jB;
                            z = true;
                        }
                        aigu aiguVar = akjfVar.e;
                        if (aiguVar == null) {
                            aiguVar = aigu.a;
                        }
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(new acgn(this, j, aikw.b(aiguVar) + j, z2, akjfVar.g, akjfVar.h, (akjfVar.b & 1) != 0 ? akjfVar.c : "innertube_cue_range", akjfVar.f));
                        arrayList = arrayList2;
                        acfwVarH = acfwVarH;
                    }
                    acfw acfwVar = acfwVarH;
                    ArrayList arrayList3 = arrayList;
                    if (!arrayList3.isEmpty()) {
                        ((agge) aglzVar).c(akjhVar).addAll(arrayList3);
                    }
                    String str = "id." + akjhVar.t + ".c." + arrayList3.size();
                    ahhp ahhpVar = this.f;
                    if (ahhpVar != null) {
                        ahhpVar.b("crreg", str, false);
                    }
                    acgaVarG.h(arrayList3);
                    acfwVarH = acfwVar;
                }
            }
        }
    }
}

package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeji {
    private final String a;
    private final String b;
    private final int c;
    private final int d;
    private final List e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final Set j;
    private final int k;

    public aeji(String str, String str2, int i, int i2, List list, int i3, int i4, int i5, boolean z, int i6, Set set) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = list;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = z;
        this.k = i6;
        this.j = set;
    }

    public static aejh a() {
        aejh aejhVar = new aejh();
        aejhVar.b(-1);
        aejhVar.g(-1);
        aejhVar.c = (short) (aejhVar.c | 4);
        aejhVar.d(-1);
        aejhVar.f(-1);
        aejhVar.i(0);
        aejhVar.h();
        aejhVar.k(1);
        aejhVar.e(agpr.a);
        aejhVar.j(false);
        aejhVar.c = (short) (aejhVar.c | 768);
        return aejhVar;
    }

    private static final alxt c(aejg aejgVar, int i) {
        aihf aihfVarCreateBuilder = alxt.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alxt alxtVar = (alxt) aihfVarCreateBuilder.instance;
        alxtVar.b |= 1;
        if (i < 0) {
            i = -1;
        }
        alxtVar.c = i;
        aihfVarCreateBuilder.copyOnWrite();
        alxt alxtVar2 = (alxt) aihfVarCreateBuilder.instance;
        alxtVar2.b |= 2;
        alxtVar2.d = aejgVar.a;
        List listQ = ahng.Q(aejgVar.b);
        aihfVarCreateBuilder.copyOnWrite();
        alxt alxtVar3 = (alxt) aihfVarCreateBuilder.instance;
        aihv aihvVar = alxtVar3.e;
        if (!aihvVar.c()) {
            alxtVar3.e = aihn.mutableCopy(aihvVar);
        }
        aifs.addAll(listQ, alxtVar3.e);
        int i2 = aejgVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        alxt alxtVar4 = (alxt) aihfVarCreateBuilder.instance;
        alxtVar4.f = 1;
        alxtVar4.b |= 8;
        agev agevVar = aejgVar.c;
        return (alxt) aihfVarCreateBuilder.build();
    }

    public final alxu b() {
        String str = this.a;
        typ.f(str);
        aihf aihfVarCreateBuilder = alxu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alxu alxuVar = (alxu) aihfVarCreateBuilder.instance;
        str.getClass();
        alxuVar.b |= 4;
        alxuVar.e = str;
        String str2 = this.b;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alxu alxuVar2 = (alxu) aihfVarCreateBuilder.instance;
            alxuVar2.b |= 64;
            alxuVar2.h = str2;
        }
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            int i = this.c;
            if (i >= 0) {
                alxt alxtVarC = c((aejg) list.get(i), i);
                aihfVarCreateBuilder.copyOnWrite();
                alxu alxuVar3 = (alxu) aihfVarCreateBuilder.instance;
                alxtVarC.getClass();
                alxuVar3.i = alxtVarC;
                alxuVar3.b |= SemanticState.Hidden;
            }
            int i2 = this.d;
            if (i2 >= 0) {
                for (int i3 = 0; i3 <= i2; i3++) {
                    alxt alxtVarC2 = c((aejg) list.get(i3), i3);
                    aihfVarCreateBuilder.copyOnWrite();
                    alxu alxuVar4 = (alxu) aihfVarCreateBuilder.instance;
                    alxtVarC2.getClass();
                    aiie aiieVar = alxuVar4.j;
                    if (!aiieVar.c()) {
                        alxuVar4.j = aihn.mutableCopy(aiieVar);
                    }
                    alxuVar4.j.add(alxtVarC2);
                }
            }
        }
        int i4 = this.f;
        if (i4 >= 0) {
            aihfVarCreateBuilder.copyOnWrite();
            alxu alxuVar5 = (alxu) aihfVarCreateBuilder.instance;
            alxuVar5.b |= 16384;
            alxuVar5.n = i4;
        }
        int i5 = this.g;
        if (i5 >= 0) {
            aihfVarCreateBuilder.copyOnWrite();
            alxu alxuVar6 = (alxu) aihfVarCreateBuilder.instance;
            alxuVar6.b |= 32768;
            alxuVar6.o = i5;
        }
        int i6 = this.h;
        aihfVarCreateBuilder.copyOnWrite();
        alxu alxuVar7 = (alxu) aihfVarCreateBuilder.instance;
        alxuVar7.b |= SemanticState.Multiline;
        alxuVar7.m = i6;
        boolean z = this.i;
        aihfVarCreateBuilder.copyOnWrite();
        alxu alxuVar8 = (alxu) aihfVarCreateBuilder.instance;
        alxuVar8.b |= SemanticState.LiveRegion;
        alxuVar8.k = z;
        aihfVarCreateBuilder.copyOnWrite();
        alxu alxuVar9 = (alxu) aihfVarCreateBuilder.instance;
        alxuVar9.b |= SemanticState.ReadOnly;
        alxuVar9.l = 0;
        aihfVarCreateBuilder.copyOnWrite();
        alxu alxuVar10 = (alxu) aihfVarCreateBuilder.instance;
        alxuVar10.c = 4;
        alxuVar10.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        alxu alxuVar11 = (alxu) aihfVarCreateBuilder.instance;
        alxuVar11.d = 1;
        alxuVar11.b |= 2;
        int i7 = this.k;
        aihfVarCreateBuilder.copyOnWrite();
        alxu alxuVar12 = (alxu) aihfVarCreateBuilder.instance;
        if (i7 == 0) {
            throw null;
        }
        alxuVar12.f = i7 - 1;
        alxuVar12.b |= 16;
        Set set = this.j;
        aihfVarCreateBuilder.copyOnWrite();
        alxu alxuVar13 = (alxu) aihfVarCreateBuilder.instance;
        aihv aihvVar = alxuVar13.g;
        if (!aihvVar.c()) {
            alxuVar13.g = aihn.mutableCopy(aihvVar);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            alxuVar13.g.h(((alxs) it.next()).l);
        }
        aihfVarCreateBuilder.copyOnWrite();
        alxu alxuVar14 = (alxu) aihfVarCreateBuilder.instance;
        alxuVar14.b |= 262144;
        alxuVar14.p = 0;
        aihfVarCreateBuilder.copyOnWrite();
        alxu alxuVar15 = (alxu) aihfVarCreateBuilder.instance;
        alxuVar15.b |= 524288;
        alxuVar15.q = 0;
        return (alxu) aihfVarCreateBuilder.build();
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeji) {
            aeji aejiVar = (aeji) obj;
            if (this.a.equals(aejiVar.a) && ((str = this.b) != null ? str.equals(aejiVar.b) : aejiVar.b == null) && this.c == aejiVar.c && this.d == aejiVar.d && ((list = this.e) != null ? list.equals(aejiVar.e) : aejiVar.e == null) && this.f == aejiVar.f && this.g == aejiVar.g && this.h == aejiVar.h && this.i == aejiVar.i) {
                int i = this.k;
                int i2 = aejiVar.k;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.j.equals(aejiVar.j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = ((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * (-721379959)) ^ this.d) * 1000003;
        List list = this.e;
        int iHashCode3 = (((((((iHashCode2 ^ (list != null ? list.hashCode() : 0)) * 583896283) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003;
        int i = true != this.i ? 1237 : 1231;
        int i2 = this.k;
        a.by(i2);
        return (((((iHashCode3 ^ i) * (-721379959)) ^ i2) * 1000003) ^ this.j.hashCode()) * 1525764945;
    }

    public final String toString() {
        int i = this.k;
        return "SearchboxStatsWrapper{clientName=" + this.a + ", originalQuery=" + this.b + ", assistedQueryIndex=" + this.c + ", assistedQueryRenderer=null, lastVisibleSuggestionIndex=" + this.d + ", suggestions=" + String.valueOf(this.e) + ", rendererSuggestions=null, experimentTriggered=0, firstEditTimeMillis=" + this.f + ", lastEditTimeMillis=" + this.g + ", sessionDurationMillis=" + this.h + ", zeroPrefixSuggestionsEnabled=" + this.i + ", numZeroPrefixSuggestionsShown=0, searchMethod=" + (i != 0 ? Integer.toString(i - 1) : "null") + ", inputMethods=" + String.valueOf(this.j) + ", maxRoundTripTimeMsec=0, totalRoundTripTimeMsec=0, compressedRoundTripHistogram=null, sessionId=null}";
    }

    public aeji() {
        throw null;
    }
}

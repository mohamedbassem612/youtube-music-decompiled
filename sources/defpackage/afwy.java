package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwy extends AtomicInteger {
    public static final afwu a;
    public final afwy b;
    public final String c;
    public volatile afwv currentMetadata;
    public final String d;
    public final String e;
    public final long f;
    public final afuy g;
    public int h;
    public boolean i;
    public volatile long j;
    int k;
    private final int l;
    private afwy m;

    static {
        afwu afwxVar;
        try {
            afwxVar = new afww();
        } catch (Error | RuntimeException unused) {
            afwxVar = new afwx();
        }
        a = afwxVar;
    }

    public afwy(afwy afwyVar, String str, int i, long j, afuy afuyVar) {
        this.k = 2;
        this.i = false;
        this.j = 0L;
        this.b = afwyVar.h < 0 ? afwyVar.b : afwyVar;
        this.c = str;
        this.h = -1;
        this.d = "B";
        this.e = "a";
        this.l = i;
        this.f = j;
        this.g = afuyVar;
    }

    private static boolean g(long j) {
        ahno.O(j != 0);
        return (j & 4611686018427387904L) != 0;
    }

    private final void h(aihf aihfVar, Map map, Map map2) {
        String str = this.d;
        str.isEmpty();
        String str2 = this.e;
        str2.isEmpty();
        int i = this.l;
        if (i == 0 || map.isEmpty() || map2.isEmpty()) {
            return;
        }
        if (map.containsKey(str)) {
            int iIntValue = ((Integer) map.get(str)).intValue();
            aihfVar.copyOnWrite();
            afus afusVar = (afus) aihfVar.instance;
            afus afusVar2 = afus.a;
            afusVar.b |= SemanticState.Modal;
            afusVar.k = iIntValue;
        }
        if (map2.containsKey(str2)) {
            int iIntValue2 = ((Integer) map2.get(str2)).intValue();
            aihfVar.copyOnWrite();
            afus afusVar3 = (afus) aihfVar.instance;
            afus afusVar4 = afus.a;
            afusVar3.b |= SemanticState.Obscured;
            afusVar3.l = iIntValue2;
        }
        aihfVar.copyOnWrite();
        afus afusVar5 = (afus) aihfVar.instance;
        afus afusVar6 = afus.a;
        afusVar5.b |= SemanticState.Multiline;
        afusVar5.m = i;
    }

    public final int a() {
        afwy afwyVar = this.b;
        if (afwyVar == null) {
            return -1;
        }
        return afwyVar.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final afuy b() {
        Object objA = a.a(this);
        if (objA == null) {
            return afux.a;
        }
        afuw afuwVarC = afux.a.c();
        while (objA != null) {
            afwv afwvVar = (afwv) objA;
            afuwVarC.a((aguu) afwvVar.c, afwvVar.a);
            objA = afwvVar.b;
        }
        return ((afuy) afuwVarC).f();
    }

    final void c(int i, afwy afwyVar) {
        this.h = i;
        this.m = afwyVar;
    }

    public final boolean d() {
        return this.j != 0;
    }

    public final afwy[] e(int i) {
        afwy[] afwyVarArr = new afwy[(this.h + 1) - i];
        while (this != null) {
            int i2 = this.h;
            if (i2 < i) {
                break;
            }
            afwyVarArr[i2 - i] = this;
            this = this.m;
        }
        return afwyVarArr;
    }

    public final afus f(int i, Map map, Map map2) {
        if (this.k == 4) {
            aihf aihfVarCreateBuilder = afus.a.createBuilder();
            h(aihfVarCreateBuilder, map, map2);
            String str = this.c;
            aihfVarCreateBuilder.copyOnWrite();
            afus afusVar = (afus) aihfVarCreateBuilder.instance;
            str.getClass();
            afusVar.b |= 1;
            afusVar.c = str;
            int i2 = this.h;
            aihfVarCreateBuilder.copyOnWrite();
            afus afusVar2 = (afus) aihfVarCreateBuilder.instance;
            afusVar2.b |= 2;
            afusVar2.d = i2;
            aihfVarCreateBuilder.copyOnWrite();
            afus afusVar3 = (afus) aihfVarCreateBuilder.instance;
            afusVar3.b |= 4;
            afusVar3.e = i;
            int i3 = this.k;
            aihfVarCreateBuilder.copyOnWrite();
            afus afusVar4 = (afus) aihfVarCreateBuilder.instance;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            afusVar4.i = i4;
            afusVar4.b |= SemanticState.LiveRegion;
            boolean zG = g(this.j);
            aihfVarCreateBuilder.copyOnWrite();
            afus afusVar5 = (afus) aihfVarCreateBuilder.instance;
            afusVar5.b |= SemanticState.Hidden;
            afusVar5.h = zG;
            long j = this.f / 1000000;
            aihfVarCreateBuilder.copyOnWrite();
            afus afusVar6 = (afus) aihfVarCreateBuilder.instance;
            afusVar6.b |= 8;
            afusVar6.f = j;
            return (afus) aihfVarCreateBuilder.build();
        }
        aihf aihfVarCreateBuilder2 = afus.a.createBuilder();
        String str2 = this.c;
        aihfVarCreateBuilder2.copyOnWrite();
        afus afusVar7 = (afus) aihfVarCreateBuilder2.instance;
        str2.getClass();
        afusVar7.b |= 1;
        afusVar7.c = str2;
        int i5 = this.h;
        aihfVarCreateBuilder2.copyOnWrite();
        afus afusVar8 = (afus) aihfVarCreateBuilder2.instance;
        afusVar8.b |= 2;
        afusVar8.d = i5;
        aihfVarCreateBuilder2.copyOnWrite();
        afus afusVar9 = (afus) aihfVarCreateBuilder2.instance;
        afusVar9.b |= 4;
        afusVar9.e = i;
        int i6 = this.k;
        aihfVarCreateBuilder2.copyOnWrite();
        afus afusVar10 = (afus) aihfVarCreateBuilder2.instance;
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        afusVar10.i = i7;
        afusVar10.b |= SemanticState.LiveRegion;
        boolean z = this.i;
        aihfVarCreateBuilder2.copyOnWrite();
        afus afusVar11 = (afus) aihfVarCreateBuilder2.instance;
        afusVar11.b |= SemanticState.ReadOnly;
        afusVar11.j = z;
        long j2 = this.f / 1000000;
        aihfVarCreateBuilder2.copyOnWrite();
        afus afusVar12 = (afus) aihfVarCreateBuilder2.instance;
        afusVar12.b |= 8;
        afusVar12.f = j2;
        long j3 = this.j;
        if (j3 != 0) {
            aihfVarCreateBuilder2.copyOnWrite();
            afus afusVar13 = (afus) aihfVarCreateBuilder2.instance;
            afusVar13.b |= 32;
            afusVar13.g = (4611686018427387903L & j3) / 1000000;
            boolean zG2 = g(j3);
            aihfVarCreateBuilder2.copyOnWrite();
            afus afusVar14 = (afus) aihfVarCreateBuilder2.instance;
            afusVar14.b |= SemanticState.Hidden;
            afusVar14.h = zG2;
        }
        h(aihfVarCreateBuilder2, map, map2);
        return (afus) aihfVarCreateBuilder2.build();
    }

    public afwy(String str, int i, afuy afuyVar, int i2) {
        this.k = 2;
        this.i = false;
        this.j = 0L;
        this.b = null;
        this.c = str;
        this.h = 0;
        this.d = "B";
        this.e = "a";
        this.l = i;
        this.f = 0L;
        this.g = afuyVar;
        this.j = i2 != 2 ? Long.MIN_VALUE : 0L;
    }
}

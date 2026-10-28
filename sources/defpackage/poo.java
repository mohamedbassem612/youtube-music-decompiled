package defpackage;

import app.rive.semantics.SemanticState;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class poo {
    private int A;
    private int B;
    private int C;
    public aifh a;
    public int b = 268435455;
    private String c;
    private aidu d;
    private long e;
    private long f;
    private long g;
    private String h;
    private aifv i;
    private long j;
    private aigj k;
    private String l;
    private Set m;
    private aies n;
    private long o;
    private String p;
    private aidq q;
    private List r;
    private String s;
    private long t;
    private long u;
    private List v;
    private aids w;
    private Set x;
    private Set y;
    private int z;

    public poo(pot potVar) {
        this.c = potVar.a;
        this.C = potVar.B;
        this.d = potVar.b;
        this.z = potVar.y;
        this.A = potVar.z;
        this.e = potVar.c;
        this.f = potVar.d;
        this.g = potVar.e;
        this.h = potVar.f;
        this.i = potVar.g;
        this.j = potVar.h;
        this.B = potVar.A;
        this.k = potVar.i;
        this.l = potVar.j;
        this.m = potVar.k;
        this.n = potVar.l;
        this.o = potVar.m;
        this.p = potVar.n;
        this.q = potVar.o;
        this.r = potVar.p;
        this.s = potVar.q;
        this.t = potVar.r;
        this.u = potVar.s;
        this.a = potVar.t;
        this.v = potVar.u;
        this.w = potVar.v;
        this.x = potVar.w;
        this.y = potVar.x;
    }

    public final void A(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupId");
        }
        this.s = str;
        this.b |= 1048576;
    }

    public final void B(int i) {
        if (i == 0) {
            throw new NullPointerException("Null readState");
        }
        this.C = i;
        this.b |= 2;
    }

    public final pot a() {
        aigj aigjVar;
        aidq aidqVar;
        int i = ~this.b;
        if ((i & 1) != 0) {
            throw new IllegalStateException("Missing required properties: id");
        }
        String str = this.c;
        int i2 = this.C;
        aidu aiduVar = this.d;
        int i3 = this.z;
        int i4 = this.A;
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        String str2 = this.h;
        aifv aifvVar = this.i;
        int i5 = i2;
        long j4 = this.j;
        int i6 = this.B;
        aigj aigjVar2 = this.k;
        int i7 = i6;
        String str3 = this.l;
        Set set = this.m;
        aies aiesVar = this.n;
        long j5 = this.o;
        String str4 = this.p;
        aidq aidqVar2 = this.q;
        List list = this.r;
        String str5 = this.s;
        long j6 = this.t;
        long j7 = this.u;
        aifh aifhVar = this.a;
        List list2 = this.v;
        aids aidsVar = this.w;
        Set set2 = this.x;
        Set set3 = this.y;
        Set set4 = set2;
        if ((i & 2) != 0) {
            i5 = aiep.a;
        }
        if ((i & 4) != 0) {
            aiduVar = aidu.DELETION_STATUS_UNKNOWN;
        }
        if ((i & 8) != 0) {
            i3 = 1;
        }
        if ((i & 16) != 0) {
            i4 = 1;
        }
        if ((i & 32) != 0) {
            j = 0;
        }
        if ((i & 64) != 0) {
            j2 = 0;
        }
        Set set5 = set3;
        if ((i & SemanticState.Focused) != 0) {
            j3 = 0;
        }
        if ((i & SemanticState.Hidden) != 0) {
            str2 = null;
        }
        if ((i & SemanticState.LiveRegion) != 0) {
            aifvVar = null;
        }
        if ((i & SemanticState.ReadOnly) != 0) {
            j4 = 0;
        }
        if ((i & SemanticState.Modal) != 0) {
            i7 = 1;
        }
        if ((i & SemanticState.Obscured) != 0) {
            aigjVar = aigj.d;
            aigjVar.getClass();
        } else {
            aigjVar = aigjVar2;
        }
        aigj aigjVar3 = aigjVar;
        if ((i & SemanticState.Multiline) != 0) {
            str3 = null;
        }
        if ((i & 16384) != 0) {
            set = awnq.a;
        }
        aies aiesVar2 = (32768 & i) != 0 ? aies.a : aiesVar;
        long j8 = (65536 & i) != 0 ? 0L : j5;
        String str6 = (131072 & i) != 0 ? null : str4;
        if ((262144 & i) != 0) {
            aidq aidqVar3 = aidq.a;
            aidqVar3.getClass();
            aidqVar = aidqVar3;
        } else {
            aidqVar = aidqVar2;
        }
        if ((524288 & i) != 0) {
            list = awno.a;
        }
        String str7 = (1048576 & i) != 0 ? "chime_default_group" : str5;
        long j9 = (2097152 & i) != 0 ? 0L : j6;
        long j10 = (4194304 & i) != 0 ? 0L : j7;
        aifh aifhVar2 = (8388608 & i) != 0 ? null : aifhVar;
        if ((16777216 & i) != 0) {
            list2 = awno.a;
        }
        List list3 = list2;
        if ((33554432 & i) != 0) {
            aids aidsVar2 = aids.a;
            aidsVar2.getClass();
            aidsVar = aidsVar2;
        }
        if ((67108864 & i) != 0) {
            set4 = awnq.a;
        }
        if ((i & 134217728) != 0) {
            set5 = awnq.a;
        }
        long j11 = j;
        int i8 = i4;
        return new pot(str, i5, aiduVar, i3, i8, j11, j2, j3, str2, aifvVar, j4, i7, aigjVar3, str3, set, aiesVar2, j8, str6, aidqVar, list, str7, j9, j10, aifhVar2, list3, aidsVar, set4, set5);
    }

    public final void b(List list) {
        this.v = list;
        this.b |= 16777216;
    }

    public final void c(aidq aidqVar) {
        if (aidqVar == null) {
            throw new NullPointerException("Null androidSdkMessage");
        }
        this.q = aidqVar;
        this.b |= 262144;
    }

    public final void d(Set set) {
        this.x = set;
        this.b |= 67108864;
    }

    public final void e(aids aidsVar) {
        this.w = aidsVar;
        this.b |= 33554432;
    }

    public final void f(long j) {
        this.g = j;
        this.b |= SemanticState.Focused;
    }

    public final void g(aidu aiduVar) {
        if (aiduVar == null) {
            throw new NullPointerException("Null deletionStatus");
        }
        this.d = aiduVar;
        this.b |= 4;
    }

    public final void h(long j) {
        this.u = j;
        this.b |= 4194304;
    }

    public final void i(long j) {
        this.t = j;
        this.b |= 2097152;
    }

    public final void j(Set set) {
        this.m = set;
        this.b |= 16384;
    }

    public final void k(Set set) {
        this.y = set;
        this.b |= 134217728;
    }

    public final void l(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.c = str;
        this.b |= 1;
    }

    public final void m(long j) {
        this.j = j;
        this.b |= SemanticState.ReadOnly;
    }

    public final void n(long j) {
        this.f = j;
        this.b |= 64;
    }

    public final void o(long j) {
        this.e = j;
        this.b |= 32;
    }

    public final void p(List list) {
        this.r = list;
        this.b |= 524288;
    }

    public final void q(String str) {
        this.p = str;
        this.b |= 131072;
    }

    public final void r(aigj aigjVar) {
        if (aigjVar == null) {
            throw new NullPointerException("Null opaqueBackendData");
        }
        this.k = aigjVar;
        this.b |= SemanticState.Obscured;
    }

    public final void s(aifv aifvVar) {
        this.i = aifvVar;
        this.b |= SemanticState.LiveRegion;
    }

    public final void t(String str) {
        this.h = str;
        this.b |= SemanticState.Hidden;
    }

    public final void u(aies aiesVar) {
        this.n = aiesVar;
        this.b |= 32768;
    }

    public final void v(long j) {
        this.o = j;
        this.b |= 65536;
    }

    public final void w(String str) {
        this.l = str;
        this.b |= SemanticState.Multiline;
    }

    public final void x(int i) {
        if (i == 0) {
            throw new NullPointerException("Null countBehavior");
        }
        this.z = i;
        this.b |= 8;
    }

    public final void y(int i) {
        if (i == 0) {
            throw new NullPointerException("Null storageMode");
        }
        this.B = i;
        this.b |= SemanticState.Modal;
    }

    public final void z(int i) {
        if (i == 0) {
            throw new NullPointerException("Null systemTrayBehavior");
        }
        this.A = i;
        this.b |= 16;
    }
}

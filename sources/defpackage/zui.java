package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zui {
    static final int[] a = {1, 2, 3, 4, 5, 7, 10, 15, 20, 50, 100};
    static final int[] b = {0, SemanticState.ReadOnly, SemanticState.Modal, SemanticState.Obscured, SemanticState.Multiline, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608};
    static final int[] c = {0, 1, 2, 5, 10, 30, 60, 120, 300, 600, 1800, 3600, 7200, 18000, 36000, 86400, 172800, 432000, 864000};
    static final int[] d = {0, 1, 2, 3, 4, 5, 10, 15, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100};
    public final int e;
    public final aihf f = akkq.a.createBuilder();

    public zui(int i) {
        this.e = i;
    }

    static int a(int i, int[] iArr) {
        int i2 = 0;
        while (true) {
            int length = iArr.length;
            if (i2 >= length) {
                return length;
            }
            if (i <= iArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    public final void b(int i) {
        aihf aihfVar = this.f;
        long j = ((akkq) aihfVar.instance).af + ((long) i);
        aihfVar.copyOnWrite();
        akkq akkqVar = (akkq) aihfVar.instance;
        akkqVar.d |= 262144;
        akkqVar.af = j;
    }

    public final void c(long j) {
        aihf aihfVar = this.f;
        long j2 = ((akkq) aihfVar.instance).i + j;
        aihfVar.copyOnWrite();
        akkq akkqVar = (akkq) aihfVar.instance;
        akkqVar.c |= 4;
        akkqVar.i = j2;
    }

    public final void d() {
        aihf aihfVar = this.f;
        long j = ((akkq) aihfVar.instance).at + 1;
        aihfVar.copyOnWrite();
        akkq akkqVar = (akkq) aihfVar.instance;
        akkqVar.e |= 1;
        akkqVar.at = j;
    }

    public final void e() {
        aihf aihfVar = this.f;
        long j = ((akkq) aihfVar.instance).am + 1;
        aihfVar.copyOnWrite();
        akkq akkqVar = (akkq) aihfVar.instance;
        akkqVar.d |= 33554432;
        akkqVar.am = j;
    }

    public final void f() {
        aihf aihfVar = this.f;
        long j = ((akkq) aihfVar.instance).ae + 1;
        aihfVar.copyOnWrite();
        akkq akkqVar = (akkq) aihfVar.instance;
        akkqVar.d |= 131072;
        akkqVar.ae = j;
    }
}

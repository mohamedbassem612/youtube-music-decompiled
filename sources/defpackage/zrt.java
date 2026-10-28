package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zrt implements zsa {
    static final int a;
    private final akkl b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        a = 1440;
    }

    public zrt(akkl akklVar) {
        this.b = akklVar;
    }

    @Override // defpackage.zsa
    public final int a() {
        int i;
        akkl akklVar = this.b;
        if (akklVar == null || (i = akklVar.d) <= 0) {
            return 100;
        }
        return i;
    }

    @Override // defpackage.zsa
    public final int b() {
        akkl akklVar = this.b;
        if (akklVar == null) {
            return 720;
        }
        return akklVar.c;
    }

    @Override // defpackage.zsa
    public final int c() {
        akkl akklVar = this.b;
        if (akklVar != null && (akklVar.b & 4) != 0) {
            akkm akkmVar = akklVar.e;
            if (akkmVar == null) {
                akkmVar = akkm.a;
            }
            if (akkmVar.b >= 0) {
                akkm akkmVar2 = akklVar.e;
                if (akkmVar2 == null) {
                    akkmVar2 = akkm.a;
                }
                return akkmVar2.b;
            }
        }
        return 0;
    }

    @Override // defpackage.zsa
    public final int d() {
        akkl akklVar = this.b;
        if (akklVar != null && (akklVar.b & 4) != 0) {
            akkm akkmVar = akklVar.e;
            if (akkmVar == null) {
                akkmVar = akkm.a;
            }
            if (akkmVar.c > 0) {
                akkm akkmVar2 = akklVar.e;
                if (akkmVar2 == null) {
                    akkmVar2 = akkm.a;
                }
                return akkmVar2.c;
            }
        }
        return a;
    }

    @Override // defpackage.zsa
    public final /* synthetic */ boolean e() {
        return false;
    }
}

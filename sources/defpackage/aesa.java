package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aesa {
    public final Context a;
    public final mbc b;
    public final aerz c;
    public final xeu d;
    public final int e;
    public final boolean f;
    public final tqj g;
    public ajeb h;
    private final aery i;

    public aesa(Context context, mbc mbcVar, aerz aerzVar, xeu xeuVar, aery aeryVar, aetb aetbVar, tqj tqjVar) {
        this.a = context;
        this.b = mbcVar;
        this.c = aerzVar;
        this.d = xeuVar;
        this.i = aeryVar;
        this.g = tqjVar;
        aqim aqimVar = aetbVar.io().k;
        aqimVar = aqimVar == null ? aqim.a : aqimVar;
        this.e = aqimVar.c;
        this.f = aqimVar.d;
    }

    final void a() {
        this.h = null;
        File file = (File) this.c.b;
        if (file.delete() || !file.exists()) {
            return;
        }
        zvp.a(zvn.b, zvm.B, "Unable to delete journal file");
    }

    public final void b(aihf aihfVar, long j) {
        long j2 = ((ajeb) aihfVar.instance).d;
        aihfVar.copyOnWrite();
        ajeb ajebVar = (ajeb) aihfVar.instance;
        ajebVar.b |= 2;
        ajebVar.d = (int) (j2 + j);
        aery aeryVar = this.i;
        if (aeryVar.c()) {
            int i = aerx.a;
            long j3 = ((long) ((ajeb) aihfVar.instance).g) + j;
            aihfVar.copyOnWrite();
            ajeb ajebVar2 = (ajeb) aihfVar.instance;
            ajebVar2.b |= 16;
            ajebVar2.g = (int) j3;
        }
        if (aeryVar.b()) {
            int i2 = aerx.a;
            long j4 = ((long) ((ajeb) aihfVar.instance).h) + j;
            aihfVar.copyOnWrite();
            ajeb ajebVar3 = (ajeb) aihfVar.instance;
            ajebVar3.b |= 32;
            ajebVar3.h = (int) j4;
        }
    }
}

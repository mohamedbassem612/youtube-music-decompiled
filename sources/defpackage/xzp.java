package defpackage;

import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xzp implements Supplier {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    public xzp(String str, int i, int i2, boolean z, boolean z2) {
        this.a = str;
        this.d = i;
        this.e = i2;
        this.b = z;
        this.c = z2;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        aihf aihfVarCreateBuilder = amxx.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amxx amxxVar = (amxx) aihfVarCreateBuilder.instance;
        amxxVar.b |= 1;
        amxxVar.c = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        amxx amxxVar2 = (amxx) aihfVarCreateBuilder.instance;
        int i = this.d;
        if (i == 0) {
            throw null;
        }
        amxxVar2.d = i - 1;
        amxxVar2.b |= 2;
        int i2 = this.e;
        if (i2 != 1) {
            aihfVarCreateBuilder.copyOnWrite();
            amxx amxxVar3 = (amxx) aihfVarCreateBuilder.instance;
            amxxVar3.e = i2 - 1;
            amxxVar3.b |= 4;
        }
        boolean z = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        amxx amxxVar4 = (amxx) aihfVarCreateBuilder.instance;
        amxxVar4.b |= 8;
        amxxVar4.f = z;
        boolean z2 = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        amxx amxxVar5 = (amxx) aihfVarCreateBuilder.instance;
        amxxVar5.b |= 16;
        amxxVar5.g = z2;
        return aihfVarCreateBuilder;
    }
}

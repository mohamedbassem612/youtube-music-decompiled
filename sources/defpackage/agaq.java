package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agaq extends InstanceProxy {
    public final aazz a;

    public agaq(aazz aazzVar) {
        this.a = aazzVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '485924853'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        if (i == -204353590) {
            RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new afzk(6));
            aazz aazzVar = this.a;
            mdu.b(aazzVar.b.P().H(new aalc(12)), runtimeStreamWriter);
            return;
        }
        if (i == -951072355) {
            RuntimeStreamWriter runtimeStreamWriter2 = new RuntimeStreamWriter(j, new afzk(7));
            aazz aazzVar2 = this.a;
            mdu.b(aazzVar2.b.P().H(new aalc(10)), runtimeStreamWriter2);
            return;
        }
        if (i == 2058110810) {
            RuntimeStreamWriter runtimeStreamWriter3 = new RuntimeStreamWriter(j, new afzk(8));
            aazz aazzVar3 = this.a;
            mdu.b(aazzVar3.b.aq().H(new aalc(9)), runtimeStreamWriter3);
            return;
        }
        if (i == 1489122403) {
            RuntimeStreamWriter runtimeStreamWriter4 = new RuntimeStreamWriter(j, new afzk(9));
            aazz aazzVar4 = this.a;
            if (aazzVar4.d == null) {
                acip acipVar = aazzVar4.b;
                aazzVar4.d = avlh.f(acipVar.D(), acipVar.L(), new vnc(aazzVar4, 3));
            }
            mdu.b(aazzVar4.d, runtimeStreamWriter4);
            return;
        }
        if (i == -1468256301) {
            RuntimeStreamWriter runtimeStreamWriter5 = new RuntimeStreamWriter(j, new afzk(10));
            aazz aazzVar5 = this.a;
            acip acipVar2 = aazzVar5.b;
            mdu.b(avlh.I(acipVar2.E(), acipVar2.D()).aB(avoi.a).H(new aalc(6)), runtimeStreamWriter5);
            return;
        }
        if (i == -816333766) {
            RuntimeStreamWriter runtimeStreamWriter6 = new RuntimeStreamWriter(j, new afzk(11));
            aazz aazzVar6 = this.a;
            wjf wjfVarF = aazzVar6.b.f();
            if (wjfVarF == null) {
                runtimeStreamWriter6.close();
                return;
            } else if (wjfVarF.V()) {
                mdu.b(aazzVar6.c.p().H(new aalc(7)), runtimeStreamWriter6);
                return;
            } else {
                runtimeStreamWriter6.close();
                return;
            }
        }
        if (i == 2130004901) {
            RuntimeStreamWriter runtimeStreamWriter7 = new RuntimeStreamWriter(j, new afzk(12));
            aazz aazzVar7 = this.a;
            mdu.b(aazzVar7.b.aj().H(new aalc(8)), runtimeStreamWriter7);
            return;
        }
        if (i != -1530919319) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '485924853'."));
        }
        RuntimeStreamWriter runtimeStreamWriter8 = new RuntimeStreamWriter(j, new afzk(13));
        aazz aazzVar8 = this.a;
        avlh avlhVarH = aazzVar8.b.an().H(new aalc(11));
        long jD = aazzVar8.a.g.d(22, 45639148L);
        if (jD > 0) {
            avlhVarH = avlhVarH.aA(jD, TimeUnit.MILLISECONDS);
        }
        mdu.b(avlhVarH, runtimeStreamWriter8);
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -204353590 || i == -951072355 || i == 2058110810 || i == 1489122403 || i == -1468256301 || i == -816333766 || i == 2130004901 || i == -1530919319;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '485924853'."));
    }
}

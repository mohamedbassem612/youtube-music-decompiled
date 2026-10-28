package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class agaa extends InstanceProxy {
    public final agcv a;

    public agaa(agcv agcvVar) {
        this.a = agcvVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '803493379'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '803493379'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 2141331342 || i == -253945413 || i == -460115156;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        avmn avmnVar;
        if (i != 2141331342) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '803493379'."));
        }
        asfb asfbVar = (asfb) aihn.parseFrom(asfb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agcv agcvVar = this.a;
        asfbVar.getClass();
        hoo hooVar = (hoo) agcvVar;
        hooVar.l = asfbVar;
        avmn avmnVar2 = hooVar.j;
        if (avmnVar2 == null || avmnVar2.f()) {
            hpy hpyVar = hooVar.b;
            hooVar.j = avlr.L(agke.r(hpyVar.f(anjx.class), hpyVar.f(anuk.class))).ag(new hib(new ank(agcvVar, 20), 16), new hib(new hhn(5), 17));
        }
        if (hooVar.q.l(49, 45782327L, false) && ((avmnVar = hooVar.k) == null || avmnVar.f())) {
            avlr avlrVarK = hooVar.f.b.K(new hbn(new hhn(4), 13));
            int i2 = 1;
            avlr avlrVarO = avlr.o(new tuf(agcvVar, i2));
            List listAL = atqq.aL(new Class[]{anjx.class, anuk.class, anyx.class});
            ArrayList arrayList = new ArrayList(atqq.N(listAL, 10));
            Iterator it = listAL.iterator();
            while (it.hasNext()) {
                arrayList.add(hooVar.b.f((Class) it.next()));
            }
            hooVar.k = avlr.N(avlrVarK, avlrVarO, avlr.L(arrayList).K(new hbn(new hhn(6), 14))).af(new hib(new hol(agcvVar, i2), 18));
        }
        hooVar.a();
        hooVar.c();
        aihf aihfVarCreateBuilder = aigv.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return ((aigv) aihnVarBuild).toByteArray();
    }
}

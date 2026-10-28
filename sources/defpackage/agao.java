package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agao extends InstanceProxy {
    public final aazy a;

    public agao(aazy aazyVar) {
        this.a = aazyVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '378759481'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '378759481'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == -1965322619 || i == -222614826 || i == -1764962356 || i == -966226737 || i == 659148632 || i == -1127349984;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        if (i == -1965322619) {
            aazy aazyVar = this.a;
            aihf aihfVarCreateBuilder = asgw.a.createBuilder();
            aihf aihfVarCreateBuilder2 = asgv.a.createBuilder();
            String strH = aazyVar.d.h();
            aihfVarCreateBuilder2.copyOnWrite();
            asgv asgvVar = (asgv) aihfVarCreateBuilder2.instance;
            strH.getClass();
            asgvVar.b |= 1;
            asgvVar.c = strH;
            asgv asgvVar2 = (asgv) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            asgw asgwVar = (asgw) aihfVarCreateBuilder.instance;
            asgvVar2.getClass();
            asgwVar.c = asgvVar2;
            asgwVar.b |= 1;
            return ((asgw) aihfVarCreateBuilder.build()).toByteArray();
        }
        if (i == -222614826) {
            int iIntValue = ((Integer) new avrj(this.a.a.aq().H(new aalc(5)), 0).iterator().next()).intValue();
            aihf aihfVarCreateBuilder3 = asgr.a.createBuilder();
            int iL = aajg.l(iIntValue);
            aihfVarCreateBuilder3.copyOnWrite();
            asgr asgrVar = (asgr) aihfVarCreateBuilder3.instance;
            asgrVar.c = iL - 1;
            asgrVar.b |= 1;
            return ((asgr) aihfVarCreateBuilder3.build()).toByteArray();
        }
        if (i == -1764962356) {
            return this.a.b.toByteArray();
        }
        if (i == -966226737) {
            aazy aazyVar2 = this.a;
            aihf aihfVarCreateBuilder4 = asgq.a.createBuilder();
            aihf aihfVarCreateBuilder5 = asgi.a.createBuilder();
            String strH2 = aazyVar2.c.h();
            aihfVarCreateBuilder5.copyOnWrite();
            asgi asgiVar = (asgi) aihfVarCreateBuilder5.instance;
            strH2.getClass();
            asgiVar.b |= 1;
            asgiVar.c = strH2;
            asgi asgiVar2 = (asgi) aihfVarCreateBuilder5.build();
            aihfVarCreateBuilder4.copyOnWrite();
            asgq asgqVar = (asgq) aihfVarCreateBuilder4.instance;
            asgiVar2.getClass();
            asgqVar.c = asgiVar2;
            asgqVar.b |= 1;
            return ((asgq) aihfVarCreateBuilder4.build()).toByteArray();
        }
        if (i != 659148632) {
            if (i != -1127349984) {
                throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '378759481'."));
            }
            aazy aazyVar3 = this.a;
            aihf aihfVarCreateBuilder6 = asgl.a.createBuilder();
            acip acipVar = aazyVar3.a;
            long j = acipVar.w().f;
            aihfVarCreateBuilder6.copyOnWrite();
            asgl asglVar = (asgl) aihfVarCreateBuilder6.instance;
            asglVar.b |= 1;
            asglVar.c = j;
            long j2 = acipVar.w().g;
            if (j2 != -1) {
                aihfVarCreateBuilder6.copyOnWrite();
                asgl asglVar2 = (asgl) aihfVarCreateBuilder6.instance;
                asglVar2.b |= 2;
                asglVar2.d = j2;
            }
            return ((asgl) aihfVarCreateBuilder6.build()).toByteArray();
        }
        aazy aazyVar4 = this.a;
        aihf aihfVarCreateBuilder7 = asgp.a.createBuilder();
        acag acagVar = aazyVar4.e;
        List listE = acagVar.e();
        if (listE != null) {
            Stream map = Collection.EL.stream(listE).filter(new aaep(7)).map(new aalr(10));
            aihfVarCreateBuilder7.getClass();
            map.forEach(new aaer(aihfVarCreateBuilder7, 10));
        }
        List listD = acagVar.d();
        Stream map2 = Collection.EL.stream(listD).filter(new aaep(8)).sorted(new rit(13)).map(new aalr(10));
        aihfVarCreateBuilder7.getClass();
        map2.forEach(new aaer(aihfVarCreateBuilder7, 11));
        Collection.EL.stream(listD).filter(Predicate$CC.not(new aaep(8))).map(new aalr(10)).forEach(new aaer(aihfVarCreateBuilder7, 12));
        acca accaVar = acagVar.n;
        if (accaVar != null) {
            ajoj ajojVarA = aazy.a(accaVar);
            aihfVarCreateBuilder7.copyOnWrite();
            asgp asgpVar = (asgp) aihfVarCreateBuilder7.instance;
            ajojVarA.getClass();
            asgpVar.f = ajojVarA;
            asgpVar.b |= 1;
        }
        return ((asgp) aihfVarCreateBuilder7.build()).toByteArray();
    }
}

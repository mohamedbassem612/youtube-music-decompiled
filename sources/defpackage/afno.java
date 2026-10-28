package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afno implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ afno(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v3, types: [afne, java.lang.Object] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        int i = this.$cid;
        int i2 = 1;
        if (i == 0) {
            ?? r0 = this.b;
            Object objIo = ((awmd) r0.getValue()).io();
            objIo.getClass();
            Object obj = this.a;
            afnp afnpVar = (afnp) obj;
            Object obj2 = ((aupo) afnpVar.f).b;
            afne afneVar = (afne) objIo;
            obj2.getClass();
            Iterable iterable = (Iterable) obj2;
            ArrayList arrayList = new ArrayList(atqq.N(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(new afni((afmz) it.next(), 2));
            }
            return afnpVar.l.h(new afno(afneVar, obj, i2), aguu.V(arrayList));
        }
        if (i == 1) {
            ahey aheyVar = ((afnp) this.b).c;
            ?? r8 = this.a;
            return ahcs.e(ahng.u(r8.a(), 180L, TimeUnit.SECONDS, aheyVar), afwl.a(new aeni(11)), MoreExecutors.directExecutor());
        }
        if (i != 2) {
            Object obj3 = this.a;
            if (i == 3) {
                return ((afsi) this.b).c.c(((WorkerParameters) obj3).a);
            }
            afsn afsnVar = (afsn) obj3;
            ahng.v(afsnVar.b);
            return afsnVar.a.b((Duration) ahng.v(this.b));
        }
        ((afsa) this.b).b.b();
        afrg afrgVar = (afrg) this.a;
        boolean z = afrgVar.b;
        ahno.P(z, "Synclet binding must be enabled to have a Synclet");
        ahno.P(z, "Synclet binding must be enabled to have a SyncletProvider");
        awmd awmdVar = afrgVar.c;
        awmdVar.getClass();
        afrf afrfVar = (afrf) awmdVar.io();
        afrfVar.getClass();
        return afrfVar.b();
    }

    public /* synthetic */ afno(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}

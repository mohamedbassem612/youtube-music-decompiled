package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kai implements kpe {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kai(kan kanVar, String str, String str2, int i) {
        this.$cid = i;
        this.c = kanVar;
        this.b = str;
        this.a = str2;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.kpe
    public final void a(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            khc khcVar = (khc) obj;
            ((kan) this.b).t();
            if (this.c != null) {
                String str = this.a;
                khi khiVar = (khi) khcVar.C();
                Context context = khcVar.p;
                khiVar.h(str, ksy.ap());
            }
            ((kjc) obj2).x(null);
            return;
        }
        if (i == 1) {
            khc khcVar2 = (khc) obj;
            kan kanVar = (kan) this.c;
            kanVar.n();
            khi khiVar2 = (khi) khcVar2.C();
            Context context2 = khcVar2.p;
            kmv kmvVarAp = ksy.ap();
            Parcel parcelC = khiVar2.c();
            parcelC.writeString(this.a);
            gdc.c(parcelC, this.b);
            gdc.c(parcelC, kmvVarAp);
            khiVar2.f(13, parcelC);
            kanVar.v((kjc) obj2);
            return;
        }
        if (i != 2) {
            khc khcVar3 = (khc) obj;
            ((kan) this.b).t();
            Context context3 = khcVar3.p;
            kmv kmvVarAp2 = ksy.ap();
            khi khiVar3 = (khi) khcVar3.C();
            String str2 = this.a;
            khiVar3.h(str2, kmvVarAp2);
            if (this.c != null) {
                khi khiVar4 = (khi) khcVar3.C();
                Parcel parcelC2 = khiVar4.c();
                parcelC2.writeString(str2);
                gdc.c(parcelC2, kmvVarAp2);
                khiVar4.f(11, parcelC2);
            }
            ((kjc) obj2).x(null);
            return;
        }
        Object obj3 = this.c;
        kan kanVar2 = (kan) obj3;
        khc khcVar4 = (khc) obj;
        long jIncrementAndGet = kanVar2.e.incrementAndGet();
        kanVar2.n();
        String str3 = this.a;
        Object obj4 = this.b;
        try {
            ((kan) obj3).o.put(Long.valueOf(jIncrementAndGet), obj2);
            Context context4 = khcVar4.p;
            kmv kmvVarAp3 = ksy.ap();
            khi khiVar5 = (khi) khcVar4.C();
            Parcel parcelC3 = khiVar5.c();
            parcelC3.writeString((String) obj4);
            parcelC3.writeString(str3);
            parcelC3.writeLong(jIncrementAndGet);
            gdc.c(parcelC3, kmvVarAp3);
            khiVar5.f(9, parcelC3);
        } catch (RemoteException e) {
            kanVar2.o.remove(Long.valueOf(jIncrementAndGet));
            ((kjc) obj2).w(e);
        }
    }

    public /* synthetic */ kai(kan kanVar, String str, jzx jzxVar, int i) {
        this.$cid = i;
        this.b = kanVar;
        this.a = str;
        this.c = jzxVar;
    }

    public /* synthetic */ kai(kan kanVar, String str, kap kapVar, int i) {
        this.$cid = i;
        this.c = kanVar;
        this.a = str;
        this.b = kapVar;
    }

    public /* synthetic */ kai(kan kanVar, jzx jzxVar, String str, int i) {
        this.$cid = i;
        this.b = kanVar;
        this.c = jzxVar;
        this.a = str;
    }
}

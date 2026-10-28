package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class olv implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ oiq a;
    public final /* synthetic */ oin b;
    public final /* synthetic */ oiz c;
    public final /* synthetic */ oiw d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ String g;
    public final /* synthetic */ oir h;
    public final /* synthetic */ int i;
    public final /* synthetic */ List j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ omn m;

    public /* synthetic */ olv(omn omnVar, ListenableFuture listenableFuture, oiq oiqVar, oin oinVar, oiz oizVar, oiw oiwVar, int i, long j, String str, oir oirVar, int i2, List list, aifv aifvVar, int i3) {
        this.$cid = i3;
        this.m = omnVar;
        this.k = listenableFuture;
        this.a = oiqVar;
        this.b = oinVar;
        this.c = oizVar;
        this.d = oiwVar;
        this.e = i;
        this.f = j;
        this.g = str;
        this.h = oirVar;
        this.i = i2;
        this.j = list;
        this.l = aifvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, oii] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, oii] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        oiq oiqVar;
        if (this.$cid != 0) {
            ojb ojbVar = (ojb) obj;
            oiv oivVarA = oiv.a(ojbVar.d);
            if (oivVarA == null) {
                oivVarA = oiv.NONE;
            }
            if (oivVarA == oiv.DOWNLOAD_COMPLETE) {
                return aher.a;
            }
            oiz oizVar = this.c;
            aihf builder = ojbVar.toBuilder();
            int iAS = a.aS(oizVar.f);
            int i = iAS == 0 ? 1 : iAS;
            Object obj2 = this.k;
            List list = this.j;
            int i2 = this.i;
            oir oirVar = this.h;
            String str = this.g;
            long j = this.f;
            int i3 = this.e;
            oiw oiwVar = this.d;
            oiq oiqVar2 = this.a;
            oin oinVar = this.b;
            Object obj3 = this.l;
            omn omnVar = this.m;
            ListenableFuture listenableFutureJ = omnVar.j(i, (String) obj3, oinVar.g);
            ooi ooiVarD = ooi.d(listenableFutureJ);
            okx okxVar = new okx(omnVar, builder, oizVar, 13, (int[]) null);
            ?? r5 = omnVar.b;
            return ooiVarD.f(okxVar, r5).f(new olv(omnVar, listenableFutureJ, oiqVar2, oinVar, oizVar, oiwVar, i3, j, str, oirVar, i2, list, (aifv) obj2, 0), r5);
        }
        Uri uri = (Uri) ahng.v(this.k);
        omn omnVar2 = this.m;
        agev agevVar = (agev) omnVar2.c;
        boolean zG = agevVar.g();
        oin oinVar2 = this.b;
        oiz oizVar2 = this.c;
        oiw oiwVar2 = this.d;
        int i4 = this.e;
        long j2 = this.f;
        String str2 = this.g;
        oir oirVar2 = this.h;
        int i5 = this.i;
        List list2 = this.j;
        Object obj4 = this.l;
        if (!zG || (oiqVar = this.a) == null) {
            ?? r12 = omnVar2.d;
            Object obj5 = omnVar2.a;
            int iAS2 = a.aS(oizVar2.f);
            omt omtVar = new omt(r12, (ayq) obj5, oinVar2, iAS2 == 0 ? 1 : iAS2, (ong) omnVar2.i, oiwVar2, i4, j2, str2, omnVar2.h, omnVar2.b);
            omnVar2.h(oiwVar2, uri);
            return ((aesp) omnVar2.j).m(oizVar2.e, oiwVar2, i4, j2, str2, uri, oinVar2.d, oinVar2.e, oirVar2, omtVar, i5, list2, (aifv) obj4);
        }
        Object obj6 = omnVar2.g;
        ?? r13 = omnVar2.d;
        Object obj7 = omnVar2.a;
        Object obj8 = omnVar2.f;
        int iAS3 = a.aS(oizVar2.f);
        if (iAS3 == 0) {
            iAS3 = 1;
        }
        qnl qnlVar = (qnl) obj8;
        ayq ayqVar = (ayq) obj7;
        Context context = (Context) obj6;
        oms omsVar = new oms(context, r13, ayqVar, qnlVar, oinVar2, iAS3, (ojt) agevVar.c(), oiqVar, (ong) omnVar2.i, oiwVar2, i4, j2, str2, (agev) omnVar2.e, omnVar2.h, omnVar2.b);
        omnVar2.h(oiwVar2, uri);
        return ((aesp) omnVar2.j).m(oizVar2.e, oiwVar2, i4, j2, str2, uri, oiqVar.c, oiqVar.d, oirVar2, omsVar, i5, list2, (aifv) obj4);
    }

    public /* synthetic */ olv(omn omnVar, oiz oizVar, String str, oin oinVar, oiq oiqVar, oiw oiwVar, int i, long j, String str2, oir oirVar, int i2, List list, aifv aifvVar, int i3) {
        this.$cid = i3;
        this.m = omnVar;
        this.c = oizVar;
        this.l = str;
        this.b = oinVar;
        this.a = oiqVar;
        this.d = oiwVar;
        this.e = i;
        this.f = j;
        this.g = str2;
        this.h = oirVar;
        this.i = i2;
        this.j = list;
        this.k = aifvVar;
    }
}

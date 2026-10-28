package defpackage;

import android.os.Bundle;
import app.rive.semantics.SemanticState;
import com.google.android.gms.cast.CastDevice;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wko implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ wko(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, xzc] */
    /* JADX WARN: Type inference failed for: r10v20, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v58, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v60, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v64, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [byw, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        String str;
        int i2 = 9;
        boolean z = true;
        int i3 = 4;
        int i4 = 10;
        switch (this.$cid) {
            case 0:
                return this.a.io();
            case 1:
                Object obj = this.a;
                obj.getClass();
                return Long.valueOf(((wbx) obj).b());
            case 2:
                return new vnm(((xmw) ((xms) this.a).a.io()).l, i4);
            case 3:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    try {
                        ahng.v((ListenableFuture) it.next());
                    } catch (Throwable th) {
                        dov.Z(th);
                    }
                }
                return 0;
            case 4:
                ?? r10 = this.a;
                int size = r10.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ahng.v((ListenableFuture) r10.get(i5));
                }
                return 0;
            case 5:
                Object obj2 = this.a;
                xdb xdbVar = (xdb) obj2;
                return xdbVar.d.L(xdbVar.e).ak(new xbo(obj2, i3));
            case 6:
                int i6 = xkp.a;
                return this.a;
            case 7:
                return this.a.t();
            case 8:
                return Optional.ofNullable(CastDevice.c((Bundle) this.a));
            case 9:
                return agke.n(dij.i());
            case 10:
                return (Map) Collection.EL.stream(this.a).collect(aghu.a(new xjh(11), new xjh(12)));
            case 11:
                return (agkj) Collection.EL.stream(this.a).map(new xjh(8)).filter(new xdn(i4)).collect(aghu.a(new xjh(i2), new xjh(i4)));
            case 12:
                Object obj3 = this.a;
                yow yowVar = (yow) obj3;
                byi byiVar = yowVar.c;
                if (yowVar.d == null) {
                    yowVar.d = yowVar.b.io();
                }
                yowVar.d.l();
                for (Map.Entry entry : yowVar.e.entrySet()) {
                    yowVar.d.m((String) entry.getKey(), (String) entry.getValue());
                }
                try {
                    try {
                        byi byiVarB = byiVar.b(0L, 4096L);
                        ((yow) obj3).d.b(byiVarB);
                        byte[] bArr = new byte[SemanticState.Obscured];
                        int i7 = 0;
                        i = 0;
                        while (true) {
                            try {
                                int iA = ((yow) obj3).d.a(bArr, i7, ((int) byiVarB.i) - i7);
                                if (iA <= 0) {
                                    str = "none";
                                    aua.d(yowVar.d);
                                    yowVar.f.l("fbprb", "err." + str + '.' + i);
                                    return Boolean.valueOf(z);
                                }
                                i7 += iA;
                                i += iA;
                            } catch (Exception e) {
                                e = e;
                                str = yno.d(e) ? "timeout" : e instanceof IOException ? "io" : "unknown";
                                aua.d(yowVar.d);
                                z = false;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        i = 0;
                    }
                } catch (Throwable th2) {
                    aua.d(yowVar.d);
                    throw th2;
                }
                break;
            case 13:
                Object obj4 = this.a;
                yzx yzxVar = (yzx) obj4;
                yzv yzvVar = yzxVar.e;
                if (yzvVar == null) {
                    return Boolean.FALSE;
                }
                yzv yzvVar2 = yzxVar.c;
                if (yzvVar2.d == null) {
                    if (!yzxVar.f || yzxVar.d.contains(yzvVar2)) {
                        ((cms) obj4).j(yzxVar.c);
                    } else {
                        yzxVar.a.execute(afwl.i(new ywt(obj4, 10)));
                    }
                    yzxVar.d.remove(yzxVar.c);
                } else {
                    yzvVar2.e = true;
                }
                yzxVar.c = yzvVar;
                yzxVar.e = null;
                yzxVar.c.b(yzxVar.b.v());
                return Boolean.TRUE;
            case 14:
                Object obj5 = this.a;
                yzx yzxVar2 = (yzx) obj5;
                yzv yzvVar3 = yzxVar2.e;
                if (yzvVar3 == null) {
                    return Boolean.FALSE;
                }
                yzxVar2.c.c(-1L);
                if (yzvVar3.d == null) {
                    if (!yzxVar2.f || yzxVar2.d.contains(yzvVar3)) {
                        ((cms) obj5).j(yzvVar3);
                    } else {
                        yzxVar2.a.execute(afwl.i(new ywt(obj5, 9)));
                    }
                    yzxVar2.d.remove(yzvVar3);
                } else {
                    yzvVar3.e = true;
                }
                yzxVar2.e = null;
                return Boolean.TRUE;
            case 15:
                return (asft) ((aihf) this.a).build();
            case 16:
                agjz agjzVar = new agjz(4);
                Collection.EL.stream(this.a).forEach(new aaer(agjzVar, 2));
                return agjzVar.g();
            case 17:
                agjz agjzVar2 = new agjz(4);
                Collection.EL.stream(this.a).forEach(new aaer(agjzVar2, i3));
                return agjzVar2.g();
            case 18:
                return this.a;
            case 19:
                return ((aaof) this.a).e();
            default:
                return Optional.ofNullable(this.a.io());
        }
    }
}

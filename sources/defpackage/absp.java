package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class absp implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ absp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v26, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [absr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v34, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v35, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v42, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v43, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v44, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v45, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((abss) this.a).f = ((Boolean) obj).booleanValue();
                break;
            case 1:
                this.a.b(4);
                break;
            case 2:
                wgi wgiVar = ((aazm) obj).b;
                if (wgiVar != null) {
                    ((abtn) this.a).g(wgiVar.c);
                }
                break;
            case 3:
                abnl abnlVarN = ((aazq) obj).b.n();
                abtn abtnVar = (abtn) this.a;
                abnl abnlVar = abtnVar.b;
                if (abnlVar != null && abnlVarN != null && abnn.i(abnlVar, abnlVarN)) {
                    abtu abtuVar = abtu.a;
                }
                abtnVar.e();
                break;
            case 4:
                ((abvb) this.a).b((aazq) obj);
                break;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (!zBooleanValue) {
                    abvb abvbVar = (abvb) obj2;
                    if (!abvbVar.c) {
                        ((aczl) abvbVar.a.io()).n();
                    }
                } else {
                    abvb abvbVar2 = (abvb) obj2;
                    abvbVar2.c = false;
                    aczl aczlVar = (aczl) abvbVar2.a.io();
                    aczlVar.g.schedule(new vlj(aczlVar, 19), ((vxz) aczlVar.d).c(5, 45424356L, 0L), TimeUnit.MILLISECONDS);
                }
                break;
            case 6:
                ((aboi) this.a).e((aazj) obj);
                break;
            case 7:
                ((abvp) this.a).a.b();
                break;
            case 8:
                String str = abwx.a;
                this.a.invoke(obj);
                break;
            case 9:
                aayt aaytVar = (aayt) obj;
                aaytVar.getClass();
                abnv abnvVar = aaytVar.a;
                Object obj3 = this.a;
                int iOrdinal = abnvVar.ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal == 7) {
                        ((abwx) obj3).d();
                    }
                    break;
                } else {
                    wjf wjfVarA = aaytVar.a();
                    boolean z = wjfVarA != null && wjfVarA.V();
                    abwx abwxVar = (abwx) obj3;
                    abwxVar.e = z;
                    if (z && abwxVar.f.b > 1.0f) {
                        abwxVar.c();
                        break;
                    }
                }
                break;
            case 10:
                String str2 = abwx.a;
                this.a.invoke(obj);
                break;
            case 11:
                String str3 = abwx.a;
                this.a.invoke(obj);
                break;
            case 12:
                String str4 = abwx.a;
                this.a.invoke(obj);
                break;
            case 13:
                String str5 = abwx.a;
                this.a.invoke(obj);
                break;
            case 14:
                String str6 = abwx.a;
                this.a.invoke(obj);
                break;
            case 15:
                String str7 = abwx.a;
                this.a.invoke(obj);
                break;
            case 16:
                aayt aaytVar2 = (aayt) obj;
                if (aaytVar2.a.equals(abnv.b)) {
                    Object obj4 = this.a;
                    wjf wjfVarA2 = aaytVar2.a();
                    boolean z2 = (wjfVarA2 != null && wjfVarA2.f().E().k) || ((abxr) obj4).c.bm();
                    abxr abxrVar = (abxr) obj4;
                    abxrVar.b.s(z2 && ((Boolean) abxrVar.a.orElse(Boolean.TRUE)).booleanValue());
                }
                break;
            case 17:
                this.a.invoke(obj);
                break;
            case 18:
                this.a.invoke(obj);
                break;
            case 19:
                this.a.invoke(obj);
                break;
            default:
                this.a.invoke(obj);
                break;
        }
    }
}

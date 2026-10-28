package defpackage;

import android.media.AudioDeviceInfo;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cfv implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cfv(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [cjv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [cjv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [cvz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [cfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [cfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [cfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [cfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [cfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v34, types: [bvh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v44, types: [cty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v47, types: [cty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v50, types: [cty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v53, types: [cty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v56, types: [cty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v59, types: [cty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [cfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [cfx, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        cfj cfjVar;
        switch (this.$cid) {
            case 0:
                ((cay) this.b).a();
                int i = bwp.a;
                ((boy) this.a).a.v();
                break;
            case 1:
                int i2 = bwp.a;
                ((boy) this.a).a.b((caw) this.b);
                break;
            case 2:
                int i3 = bwp.a;
                ((boy) this.b).a.z((cri) this.a);
                break;
            case 3:
                int i4 = bwp.a;
                ((boy) this.b).a.A((cri) this.a);
                break;
            case 4:
                int i5 = bwp.a;
                ((boy) this.b).a.u();
                break;
            case 5:
                int i6 = bwp.a;
                ((boy) this.b).a.g((Exception) this.a);
                break;
            case 6:
                int i7 = bwp.a;
                ((boy) this.b).a.d((String) this.a);
                break;
            case 7:
                cgk cgkVar = (cgk) this.a;
                if (cgkVar.c != null && (cfjVar = ((cgq) cgkVar.d.a).b) != null) {
                    cfjVar.c((AudioDeviceInfo) this.b);
                    break;
                }
                break;
            case 8:
                Object obj = this.a;
                cjr cjrVar = (cjr) obj;
                cjs cjsVar = cjrVar.c;
                if (cjsVar.e != 0 && !cjrVar.b) {
                    Object obj2 = this.b;
                    Looper looper = cjsVar.h;
                    looper.getClass();
                    cjrVar.a = cjsVar.g(looper, cjrVar.d, (bse) obj2, false);
                    cjsVar.c.add(obj);
                    break;
                }
                break;
            case 9:
                ?? r0 = this.a;
                aae aaeVar = (aae) this.b;
                r0.ge(aaeVar.a, (cnm) aaeVar.b);
                break;
            case 10:
                ?? r1 = this.a;
                aae aaeVar2 = (aae) this.b;
                r1.e(aaeVar2.a, (cnm) aaeVar2.b);
                break;
            case 11:
                this.b.a(this.a);
                break;
            case 12:
                ((cog) this.b).A(this.a);
                break;
            case 13:
                if (((csf) this.b).f) {
                    this.a.run();
                }
                break;
            case 14:
                qcb qcbVar = ((csf) ((cse) this.a).a).h;
                qcbVar.getClass();
                crw crwVar = (crw) qcbVar.a;
                ahno.O(crwVar.c);
                crz crzVar = (crz) this.b;
                agke agkeVar = crzVar.e;
                int size = agkeVar.size();
                for (int i8 = 0; i8 < size; i8++) {
                    crx crxVar = (crx) agkeVar.get(i8);
                    if (crwVar.f(crxVar.a)) {
                        crwVar.f(crxVar.b);
                    }
                }
                crwVar.b = crzVar.d;
                crwVar.j.H(crwVar.b);
                break;
            case 15:
                int i9 = bwp.a;
                ((pj) this.b).b.p((String) this.a);
                break;
            case 16:
                int i10 = bwp.a;
                ((pj) this.a).b.t((btz) this.b);
                break;
            case 17:
                int i11 = bwp.a;
                ((pj) this.b).b.m((Exception) this.a);
                break;
            case 18:
                int i12 = bwp.a;
                ((pj) this.a).b.r((cay) this.b);
                break;
            case 19:
                cay cayVar = (cay) this.b;
                cayVar.a();
                int i13 = bwp.a;
                ((pj) this.a).b.q(cayVar);
                break;
            default:
                int i14 = bwp.a;
                ((pj) this.a).b.n((caw) this.b);
                break;
        }
    }

    public /* synthetic */ cfv(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}

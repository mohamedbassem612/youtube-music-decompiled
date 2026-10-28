package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eck implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eck(String str, int i) {
        this.$cid = i;
        this.a = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [awwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [bog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [awyp, java.lang.Object] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) throws Exception {
        Object objValueOf = null;
        switch (this.$cid) {
            case 0:
                this.a.p(null);
                this.b.j((bou) obj);
                return awmy.a;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                bof bofVar = (bof) entry.getKey();
                ahto ahtoVar = (ahto) entry.getValue();
                while (true) {
                    boh bohVar = (boh) this.b;
                    if (((bob) ahtoVar.c).compareTo(bohVar.d) < 0 && !bohVar.b && bohVar.e.f(bofVar)) {
                        List list = bohVar.c;
                        list.add(ahtoVar.c);
                        bnz bnzVar = boa.Companion;
                        boa boaVarB = bnz.b((bob) ahtoVar.c);
                        if (boaVarB == null) {
                            Object obj2 = ahtoVar.c;
                            Objects.toString(obj2);
                            throw new IllegalStateException("no event up from ".concat(String.valueOf(obj2)));
                        }
                        ahtoVar.i(this.a, boaVarB);
                        atqq.aF(list);
                    }
                }
                return awmy.a;
            case 2:
                return eol.a((String) this.a, (String) this.b, (dpt) obj);
            case 3:
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                ((eec) this.b).a.d(dptVar, this.a);
                return awmy.a;
            case 4:
                dpt dptVar2 = (dpt) obj;
                dptVar2.getClass();
                dpb dpbVarA = dptVar2.a((String) this.a);
                try {
                    dpbVarA.i(1, (String) this.b);
                    if (dpbVarA.l() && !dpbVarA.k(0)) {
                        objValueOf = Long.valueOf(dpbVarA.b(0));
                    }
                } finally {
                    dpbVarA.close();
                }
                break;
            case 5:
                dpt dptVar3 = (dpt) obj;
                dptVar3.getClass();
                ((eej) this.b).a.d(dptVar3, this.a);
                return awmy.a;
            case 6:
                return eol.b((String) this.a, (String) this.b, (dpt) obj);
            case 7:
                dpt dptVar4 = (dpt) obj;
                dptVar4.getClass();
                ((een) this.b).a.d(dptVar4, this.a);
                return awmy.a;
            case 8:
                return eol.b((String) this.a, (String) this.b, (dpt) obj);
            case 9:
                return eol.b((String) this.a, (String) this.b, (dpt) obj);
            case 10:
                dpt dptVar5 = (dpt) obj;
                dptVar5.getClass();
                dpb dpbVarA2 = dptVar5.a((String) this.a);
                try {
                    dpbVarA2.i(1, (String) this.b);
                    ArrayList arrayList = new ArrayList();
                    while (dpbVarA2.l()) {
                        arrayList.add(new eeq(dpbVarA2.d(0), dms.m((int) dpbVarA2.b(1))));
                    }
                    dpbVarA2.close();
                    return arrayList;
                } catch (Throwable th) {
                    dpbVarA2.close();
                    throw th;
                }
            case 11:
                return eol.a((String) this.a, (String) this.b, (dpt) obj);
            case 12:
                dpt dptVar6 = (dpt) obj;
                dptVar6.getClass();
                ((efe) this.b).b.d(dptVar6, this.a);
                return awmy.a;
            case 13:
                dpt dptVar7 = (dpt) obj;
                dptVar7.getClass();
                dpb dpbVarA3 = dptVar7.a((String) this.a);
                try {
                    dpbVarA3.i(1, (String) this.b);
                    ArrayList arrayList2 = new ArrayList();
                    while (dpbVarA3.l()) {
                        byte[] bArrM = dpbVarA3.m(0);
                        dyp dypVar = dyp.a;
                        arrayList2.add(azx.g(bArrM));
                    }
                    dpbVarA3.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    dpbVarA3.close();
                    throw th2;
                }
            case 14:
                return Integer.valueOf(eol.c((String) this.a, (String) this.b, (dpt) obj));
            case 15:
                return Integer.valueOf(eol.c((String) this.a, (String) this.b, (dpt) obj));
            case 16:
                dpt dptVar8 = (dpt) obj;
                dptVar8.getClass();
                dpb dpbVarA4 = dptVar8.a((String) this.a);
                try {
                    dpbVarA4.i(1, (String) this.b);
                    if (dpbVarA4.l()) {
                        Integer numValueOf = dpbVarA4.k(0) ? null : Integer.valueOf((int) dpbVarA4.b(0));
                        if (numValueOf != null) {
                            objValueOf = dms.m(numValueOf.intValue());
                        }
                    }
                } finally {
                    dpbVarA4.close();
                }
                break;
            case 17:
                dpt dptVar9 = (dpt) obj;
                dptVar9.getClass();
                ((efe) this.b).a.d(dptVar9, this.a);
                return awmy.a;
            case 18:
                return eol.b((String) this.a, (String) this.b, (dpt) obj);
            case 19:
                return eol.a((String) this.a, (String) this.b, (dpt) obj);
            default:
                dpt dptVar10 = (dpt) obj;
                dptVar10.getClass();
                ((efh) this.b).b.d(dptVar10, this.a);
                return awmy.a;
        }
        return objValueOf;
    }

    public /* synthetic */ eck(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ eck(awwd awwdVar, awyp awypVar, int i) {
        this.$cid = i;
        this.a = awwdVar;
        this.b = awypVar;
    }

    public /* synthetic */ eck(String str, int i, byte[] bArr) {
        this.$cid = i;
        this.a = "SELECT long_value FROM Preference where `key`=?";
        this.b = str;
    }

    public /* synthetic */ eck(String str, int i, char[] cArr) {
        this.$cid = i;
        this.a = "DELETE FROM SystemIdInfo where work_spec_id=?";
        this.b = str;
    }

    public /* synthetic */ eck(String str, int i, float[] fArr) {
        this.$cid = i;
        this.a = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        this.b = str;
    }

    public /* synthetic */ eck(String str, int i, int[] iArr) {
        this.$cid = i;
        this.a = "DELETE FROM workspec WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ eck(String str, int i, short[] sArr) {
        this.$cid = i;
        this.a = "DELETE from WorkProgress where work_spec_id=?";
        this.b = str;
    }

    public /* synthetic */ eck(String str, int i, boolean[] zArr) {
        this.$cid = i;
        this.a = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        this.b = str;
    }

    public /* synthetic */ eck(String str, int i, byte[][] bArr) {
        this.$cid = i;
        this.a = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        this.b = str;
    }

    public /* synthetic */ eck(String str, int i, char[][] cArr) {
        this.$cid = i;
        this.a = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ eck(String str, int i, float[][] fArr) {
        this.$cid = i;
        this.a = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";
        this.b = str;
    }

    public /* synthetic */ eck(String str, int i, int[][] iArr) {
        this.$cid = i;
        this.a = "SELECT state FROM workspec WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ eck(String str, int i, short[][] sArr) {
        this.$cid = i;
        this.a = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ eck(String str, int i, boolean[][] zArr) {
        this.$cid = i;
        this.a = "DELETE FROM worktag WHERE work_spec_id=?";
        this.b = str;
    }
}

package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class web {
    public final boolean a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    /* JADX WARN: Code duplicated, block: B:112:0x0280  */
    /* JADX WARN: Code duplicated, block: B:137:0x032f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0243  */
    public web(qlc qlcVar, qnb qnbVar) {
        agkj agkjVarD;
        char c;
        long j;
        long jCharAt;
        agqr agqrVar;
        this.a = true;
        this.b = qlcVar.b.b.isEmpty() && qkv.a.equals(qlcVar.c);
        this.g = qlcVar.c();
        this.f = qlcVar.c.c;
        qlcVar.b();
        qlcVar.a();
        Map mapUnmodifiableMap = qlcVar.c.f.size() == 0 ? null : DesugarCollections.unmodifiableMap(qlcVar.c.f);
        this.d = mapUnmodifiableMap != null ? agkz.n(mapUnmodifiableMap.keySet()) : agpr.a;
        qla qlaVar = qlcVar.b;
        qkv qkvVar = qlcVar.c;
        char c2 = 3;
        if (qkvVar.f.size() > 0) {
            Collection<qks> collectionValues = DesugarCollections.unmodifiableMap(qkvVar.f).values();
            if (collectionValues == null) {
                agkjVarD = agpn.b;
            } else {
                agkh agkhVar = new agkh(4);
                for (qks qksVar : collectionValues) {
                    int i = qksVar.c;
                    int iP = qnl.p(i);
                    if (iP == 0) {
                        throw null;
                    }
                    int i2 = iP - 1;
                    if (i2 == 0) {
                        agkhVar.e(qksVar.e, Long.valueOf(i == 1 ? ((Long) qksVar.d).longValue() : 0L));
                    } else if (i2 == 1) {
                        agkhVar.e(qksVar.e, Boolean.valueOf(i == 2 ? ((Boolean) qksVar.d).booleanValue() : false));
                    } else if (i2 == 2) {
                        agkhVar.e(qksVar.e, Double.valueOf(i == 3 ? ((Double) qksVar.d).doubleValue() : 0.0d));
                    } else if (i2 == 3) {
                        agkhVar.e(qksVar.e, i == 4 ? (String) qksVar.d : "");
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("Could not serialize Flag for override: ".concat(String.valueOf(qksVar.e)));
                        }
                        agkhVar.e(qksVar.e, (i == 5 ? (aigj) qksVar.d : aigj.d).G());
                    }
                }
                agkjVarD = agkhVar.d(false);
            }
            if (!agkjVarD.isEmpty()) {
                HashMap map = new HashMap(agkjVarD);
                agli agliVar = new agli(agpb.a);
                agqr it = qlaVar.b.iterator();
                while (it.hasNext()) {
                    qkz qkzVar = (qkz) it.next();
                    Object objRemove = map.remove(qkzVar.b());
                    if (objRemove == null) {
                        agliVar.n(qkzVar);
                    } else if (objRemove instanceof String) {
                        agliVar.n(new qkz(qkzVar.a, qkzVar.b, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        agliVar.n(new qkz(qkzVar.a, qkzVar.b, 5, 0L, objRemove));
                    } else {
                        if (objRemove instanceof Boolean) {
                            agqrVar = it;
                            agliVar.n(new qkz(qkzVar.a, qkzVar.b, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                        } else {
                            agqrVar = it;
                            if (objRemove instanceof Long) {
                                agliVar.n(new qkz(qkzVar.a, qkzVar.b, 2, ((Long) objRemove).longValue(), null));
                            } else {
                                if (!(objRemove instanceof Double)) {
                                    throw new IllegalStateException("Cannot serialize override for existing flag " + qkzVar.b() + ": " + objRemove.toString());
                                }
                                agliVar.n(new qkz(qkzVar.a, qkzVar.b, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                            }
                        }
                        it = agqrVar;
                    }
                }
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    int length = str.length();
                    if (length > 19) {
                        c = c2;
                        j = 0;
                        jCharAt = j;
                        break;
                    }
                    if (length != 0) {
                        jCharAt = str.charAt(0) - '0';
                        if (jCharAt < 1) {
                            c = c2;
                            j = 0;
                        } else if (jCharAt <= 9) {
                            int i3 = 1;
                            while (true) {
                                if (i3 >= length) {
                                    c = c2;
                                    j = 0;
                                    if (jCharAt < 0 || jCharAt > 2305843009213693951L) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                c = c2;
                                int iCharAt = str.charAt(i3) - '0';
                                j = 0;
                                if (((iCharAt >>> 31) | (iCharAt > 9 ? 1 : 0)) == 0) {
                                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                    i3++;
                                    c2 = c;
                                }
                            }
                        } else {
                            c = c2;
                            jCharAt = 0;
                            j = 0;
                        }
                        jCharAt = j;
                        break;
                    } else {
                        c = c2;
                        jCharAt = 0;
                        j = 0;
                    }
                    String str2 = jCharAt == j ? str : null;
                    if (obj instanceof String) {
                        agliVar.n(new qkz(jCharAt, str2, 4, 0L, obj));
                    } else if (obj instanceof byte[]) {
                        agliVar.n(new qkz(jCharAt, str2, 5, 0L, obj));
                    } else if (obj instanceof Boolean) {
                        agliVar.n(new qkz(jCharAt, str2, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                    } else if (obj instanceof Long) {
                        agliVar.n(new qkz(jCharAt, str2, 2, ((Long) obj).longValue(), null));
                    } else {
                        if (!(obj instanceof Double)) {
                            throw new IllegalStateException("Cannot serialize override " + str + ": " + String.valueOf(obj));
                        }
                        agliVar.n(new qkz(jCharAt, str2, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                    }
                    c2 = c;
                }
                qlaVar = new qla(agliVar.g());
            }
        }
        int size = qlaVar.b.size() + 3;
        aguu.ag(size, "expectedSize");
        agkh agkhVar2 = new agkh(size);
        agqr it2 = qlaVar.b.iterator();
        while (it2.hasNext()) {
            qkz qkzVar2 = (qkz) it2.next();
            agkhVar2.e(qkzVar2.b(), qkzVar2.a());
        }
        agkhVar2.e("__phenotype_server_token", qlcVar.b());
        agkhVar2.e("__phenotype_snapshot_token", qlcVar.c());
        agkhVar2.e("__phenotype_configuration_version", Long.valueOf(qlcVar.a()));
        this.c = agkhVar2.d(false);
        this.e = qnbVar;
    }

    public static wej b(Cursor cursor) throws wcm {
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("metadata"));
            if (blob == null) {
                return wej.a;
            }
            return new wej((akvf) aihn.parseFrom(akvf.a, blob, ExtensionRegistryLite.getGeneratedRegistry()));
        } catch (Exception e) {
            throw wcm.a(e, cursor.getInt(cursor.getColumnIndex("data_type")), 3, 6);
        }
    }

    public static final aijp e(Cursor cursor) {
        try {
            long j = cursor.getLong(cursor.getColumnIndex("batch_update_timestamp"));
            return aikz.c(j / 1000000000, (int) (j % 1000000000));
        } catch (Exception unused) {
            return wez.a;
        }
    }

    public static final Optional f(Cursor cursor, String str, wdy wdyVar) throws wcm {
        if (cursor == null) {
            throw wcm.a(new SQLiteException("get got null cursor for key ".concat(String.valueOf(str))), -1, 3, 5);
        }
        if (!cursor.isBeforeFirst()) {
            throw new IllegalStateException();
        }
        if (cursor.getCount() <= 1) {
            return !cursor.moveToNext() ? Optional.empty() : Optional.ofNullable(wdyVar.a(cursor));
        }
        throw wcm.a(new SQLiteException("get expected at most 1 entity w/ key ".concat(String.valueOf(str))), -1, 3, 5);
    }

    public static omr l(String str, wea weaVar) {
        omr omrVarN = n(weaVar);
        omrVarN.i(" WHERE ");
        omrVarN.i("key");
        omrVarN.i("=?");
        omrVarN.k(str);
        return omrVarN;
    }

    public static final Stream m(omr omrVar, omr omrVar2, wdy wdyVar) throws wcm {
        try {
            Cursor cursorN = omrVar.n(omrVar2);
            try {
                Stream.Builder builder = Stream.CC.builder();
                while (cursorN.moveToNext()) {
                    builder.add(wdyVar.a(cursorN));
                }
                Stream streamBuild = builder.build();
                if (cursorN != null) {
                    cursorN.close();
                }
                return streamBuild;
            } catch (Throwable th) {
                if (cursorN != null) {
                    try {
                        cursorN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw wcm.a(e, -1, 3, 5);
        }
    }

    private static omr n(wea weaVar) {
        omr omrVar = new omr();
        omrVar.i("SELECT ");
        weaVar.a(omrVar);
        omrVar.i(" FROM ");
        omrVar.i("entity_table");
        return omrVar;
    }

    private final void o(omr omrVar, wea weaVar) {
        if (this.b) {
            if (weaVar == wea.b || weaVar == wea.e) {
                omrVar.i(" AND LENGTH(entity) <= ?");
                omrVar.j(1992294L);
            }
        }
    }

    public final weh a(Cursor cursor) throws wcm {
        try {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("key"));
            return ((wjr) this.c).a(string, cursor.getBlob(cursor.getColumnIndexOrThrow("entity")));
        } catch (Exception e) {
            throw wcm.a(e, cursor.getInt(cursor.getColumnIndex("data_type")), 3, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [agfr, java.lang.Object] */
    public final ListenableFuture c(int i, final Function function) {
        omr omrVarJ = this.a ? j(i, wea.b) : j(i, wea.e);
        ?? r0 = this.f;
        final omr omrVarP = omrVarJ.p();
        return ((omj) r0.io()).S(new qsx() { // from class: wdq
            @Override // defpackage.qsx
            public final Object a(omr omrVar) {
                return (agkz) web.m(omrVar, omrVarP, new wdx(this.a, 1)).map(function).collect(aghu.b);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [agfr, java.lang.Object] */
    public final ListenableFuture d(String str) {
        return TextUtils.isEmpty(str) ? ahng.n(wff.a) : ((omj) this.f.io()).Z(l(str, wea.e).p()).c(new wdt(this, str, 0), MoreExecutors.directExecutor()).g();
    }

    public final boolean g() {
        return ((qnb) this.e).b == 3;
    }

    public final boolean h() {
        return ((qnb) this.e).a;
    }

    final wff i(omr omrVar, String str) throws wcm {
        if (TextUtils.isEmpty(str)) {
            return wff.a;
        }
        try {
            Cursor cursorN = omrVar.n(l(str, wea.e).p());
            try {
                wff wffVar = (wff) f(cursorN, str, new wdx(this, 0)).orElse(wff.a);
                if (cursorN == null) {
                    return wffVar;
                }
                cursorN.close();
                return wffVar;
            } catch (Throwable th) {
                if (cursorN != null) {
                    try {
                        cursorN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw wcm.a(e, -1, 3, 5);
        }
    }

    public final omr j(int i, wea weaVar) {
        omr omrVarN = n(weaVar);
        omrVarN.i(" WHERE ");
        omrVarN.i("data_type");
        omrVarN.i("=?");
        omrVarN.j(Long.valueOf(i));
        o(omrVarN, weaVar);
        return omrVarN;
    }

    public final omr k(Iterable iterable, wea weaVar) {
        omr omrVarN = n(weaVar);
        Iterator it = iterable.iterator();
        omrVarN.i(" WHERE ");
        omrVarN.i("key");
        omrVarN.i(" IN (?");
        omrVarN.k((String) it.next());
        while (it.hasNext()) {
            omrVarN.i(",?");
            omrVarN.k((String) it.next());
        }
        omrVarN.i(")");
        o(omrVarN, weaVar);
        return omrVarN;
    }

    public web(qnd qndVar, qnb qnbVar) {
        aigj aigjVar;
        String str;
        this.a = false;
        this.b = qnd.a.equals(qndVar);
        this.g = qndVar.c;
        this.f = qndVar.d;
        String str2 = qndVar.e;
        long j = qndVar.f;
        this.d = agpr.a;
        agkh agkhVarF = agkj.f(qndVar.g.size() + 3);
        for (qne qneVar : qndVar.g) {
            int i = qneVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                agkhVarF.e(qneVar.e, Long.valueOf(i == 2 ? ((Long) qneVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                agkhVarF.e(qneVar.e, Boolean.valueOf(i == 3 ? ((Boolean) qneVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                agkhVarF.e(qneVar.e, Double.valueOf(i == 4 ? ((Double) qneVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                String str3 = qneVar.e;
                if (i == 5) {
                    str = (String) qneVar.d;
                } else {
                    str = "";
                }
                agkhVarF.e(str3, str);
            } else if (i3 == 4) {
                String str4 = qneVar.e;
                if (i == 6) {
                    aigjVar = (aigj) qneVar.d;
                } else {
                    aigjVar = aigj.d;
                }
                agkhVarF.e(str4, aigjVar.G());
            }
        }
        agkhVarF.e("__phenotype_server_token", qndVar.e);
        agkhVarF.e("__phenotype_snapshot_token", qndVar.c);
        agkhVarF.e("__phenotype_configuration_version", Long.valueOf(qndVar.f));
        this.c = agkhVarF.d(false);
        this.e = qnbVar;
    }

    public web(wjr wjrVar, awmd awmdVar, zwa zwaVar, wjr wjrVar2, vxz vxzVar) {
        this.d = zwaVar;
        this.e = wjrVar;
        this.c = wjrVar2;
        this.a = vxzVar.l(51, 45721123L, false);
        this.b = vxzVar.l(72, 45753486L, false);
        this.f = aguu.al(new tpc(this, 18));
        this.g = aguu.al(new jxq(this, awmdVar, 13));
    }
}

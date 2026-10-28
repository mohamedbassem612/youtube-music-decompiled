package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ygl {
    public static final Comparator a = Comparator$CC.comparingLong(new ygh(3));
    public static final Comparator b = Comparator$CC.comparingLong(new ygh(4));
    public final String c;
    private final mbc h;
    private final zjr i;
    private final yfz j;
    public boolean d = false;
    public final Map f = new ConcurrentHashMap();
    public final AtomicLong e = new AtomicLong();
    public final Map g = new ConcurrentHashMap();

    public ygl(String str, yfz yfzVar, mbc mbcVar, zjr zjrVar) {
        this.c = str;
        this.j = yfzVar;
        this.h = mbcVar;
        this.i = zjrVar;
    }

    public static ygl o(String str, yfz yfzVar, mbc mbcVar, zjr zjrVar) {
        ygl yglVar = new ygl(str, yfzVar, mbcVar, zjrVar);
        yglVar.d = true;
        return yglVar;
    }

    private final synchronized void p(ygk ygkVar) {
        zjr zjrVar = this.i;
        j$.util.Map.EL.putIfAbsent(this.f, ygkVar, new ygj(zjrVar.aT(), zjrVar.aS()));
        if (zjrVar.aT()) {
            j$.util.Map.EL.putIfAbsent(this.g, zik.co(ygkVar.a, ygkVar.b), ygkVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    private static final void q(yez yezVar) {
        zkf.c(((yezVar.f > 0L ? 1 : (yezVar.f == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        zkf.c(yezVar.g > 0);
        int i = yezVar.b;
        if ((i & 4) != 0 || (i & 8) != 0 || (i & 2) != 0) {
            zkf.c(yezVar.c > 0);
            zkf.c(((yezVar.d > 0L ? 1 : (yezVar.d == 0L ? 0 : -1)) ^ (-1)) >>> 31);
            zkf.c(yezVar.e > 0);
        }
        int i2 = yezVar.b;
        if ((i2 & 64) == 0 && (i2 & SemanticState.Focused) == 0) {
            return;
        }
        zkf.c(((yezVar.h > 0L ? 1 : (yezVar.h == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        if (yezVar.f != 0) {
            zkf.c(yezVar.i > 0);
        }
    }

    final long a() {
        return Collection.EL.stream(this.f.values()).mapToLong(new ygh(0)).sum();
    }

    public final long b() {
        return this.e.get();
    }

    final yez c(ygk ygkVar, long j) {
        yez yezVar = yez.a;
        aihf aihfVarCreateBuilder = yezVar.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        yez yezVar2 = (yez) aihfVarCreateBuilder.instance;
        yezVar2.b |= 16;
        yezVar2.f = j;
        aihfVarCreateBuilder.copyOnWrite();
        yez yezVar3 = (yez) aihfVarCreateBuilder.instance;
        yezVar3.b |= 32;
        yezVar3.g = -1L;
        yez yezVar4 = (yez) aihfVarCreateBuilder.build();
        ygj ygjVar = (ygj) this.f.get(ygkVar);
        if (ygjVar == null) {
            return yezVar4;
        }
        TreeSet treeSet = ygjVar.b;
        yez yezVar5 = (yez) treeSet.floor(yezVar4);
        if (yezVar5 != null && yezVar5.f + yezVar5.g > j) {
            return yezVar5;
        }
        yez yezVar6 = (yez) treeSet.ceiling(yezVar4);
        if (yezVar6 == null) {
            return yezVar4;
        }
        long j2 = yezVar6.f - j;
        aihf aihfVarCreateBuilder2 = yezVar.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        yez yezVar7 = (yez) aihfVarCreateBuilder2.instance;
        yezVar7.b |= 16;
        yezVar7.f = j;
        aihfVarCreateBuilder2.copyOnWrite();
        yez yezVar8 = (yez) aihfVarCreateBuilder2.instance;
        yezVar8.b |= 32;
        yezVar8.g = j2;
        return (yez) aihfVarCreateBuilder2.build();
    }

    public final synchronized yfx d(long j) {
        this.e.set(j);
        return e();
    }

    final yfx e() {
        aihf aihfVarCreateBuilder = yfx.a.createBuilder();
        long j = this.e.get();
        aihfVarCreateBuilder.copyOnWrite();
        yfx yfxVar = (yfx) aihfVarCreateBuilder.instance;
        yfxVar.b |= 2;
        yfxVar.d = j;
        aihfVarCreateBuilder.copyOnWrite();
        yfx yfxVar2 = (yfx) aihfVarCreateBuilder.instance;
        String str = this.c;
        str.getClass();
        yfxVar2.b |= 1;
        yfxVar2.c = str;
        for (Map.Entry entry : this.f.entrySet()) {
            ygk ygkVar = (ygk) entry.getKey();
            aihf aihfVarCreateBuilder2 = yfv.a.createBuilder();
            int i = ygkVar.a;
            aihfVarCreateBuilder2.copyOnWrite();
            yfv yfvVar = (yfv) aihfVarCreateBuilder2.instance;
            yfvVar.b |= 1;
            yfvVar.c = i;
            long j2 = ygkVar.c;
            aihfVarCreateBuilder2.copyOnWrite();
            yfv yfvVar2 = (yfv) aihfVarCreateBuilder2.instance;
            yfvVar2.b |= 4;
            yfvVar2.e = j2;
            String str2 = ygkVar.b;
            if (!TextUtils.isEmpty(str2)) {
                aihfVarCreateBuilder2.copyOnWrite();
                yfv yfvVar3 = (yfv) aihfVarCreateBuilder2.instance;
                yfvVar3.b |= 2;
                yfvVar3.d = str2;
            }
            for (yez yezVar : ((ygj) entry.getValue()).b) {
                aihfVarCreateBuilder2.copyOnWrite();
                yfv yfvVar4 = (yfv) aihfVarCreateBuilder2.instance;
                yezVar.getClass();
                aiie aiieVar = yfvVar4.f;
                if (!aiieVar.c()) {
                    yfvVar4.f = aihn.mutableCopy(aiieVar);
                }
                yfvVar4.f.add(yezVar);
            }
            if (!TextUtils.isEmpty(((ygj) entry.getValue()).f)) {
                String str3 = ((ygj) entry.getValue()).f;
                aihfVarCreateBuilder2.copyOnWrite();
                yfv yfvVar5 = (yfv) aihfVarCreateBuilder2.instance;
                str3.getClass();
                yfvVar5.b |= 16;
                yfvVar5.g = str3;
            }
            FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata = ((ygj) entry.getValue()).g;
            if (formatInitializationMetadataOuterClass$FormatInitializationMetadata != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                yfv yfvVar6 = (yfv) aihfVarCreateBuilder2.instance;
                yfvVar6.h = formatInitializationMetadataOuterClass$FormatInitializationMetadata;
                yfvVar6.b |= 32;
            }
            yfv yfvVar7 = (yfv) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            yfx yfxVar3 = (yfx) aihfVarCreateBuilder.instance;
            yfvVar7.getClass();
            aiie aiieVar2 = yfxVar3.e;
            if (!aiieVar2.c()) {
                yfxVar3.e = aihn.mutableCopy(aiieVar2);
            }
            yfxVar3.e.add(yfvVar7);
        }
        return (yfx) aihfVarCreateBuilder.build();
    }

    final NavigableSet f(ygk ygkVar) {
        ygj ygjVar = (ygj) this.f.get(ygkVar);
        if (ygjVar == null) {
            return new TreeSet(this.i.aS() ? a : Comparator$CC.comparing(new xjh(17)));
        }
        return new TreeSet((SortedSet) ygjVar.b);
    }

    final Set g() {
        return this.f.keySet();
    }

    final synchronized void h(ygk ygkVar, String str, yez yezVar) {
        this.e.set(this.h.f().toEpochMilli());
        q(yezVar);
        p(ygkVar);
        ygj ygjVar = (ygj) this.f.get(ygkVar);
        TreeSet treeSet = ygjVar.b;
        yez yezVar2 = (yez) treeSet.floor(yezVar);
        if (yezVar2 != null) {
            long j = yezVar2.f;
            long j2 = yezVar.f;
            if (j == j2) {
                zkf.c(j2 == j);
                treeSet.remove(yezVar2);
                ygjVar.a -= yezVar2.g;
                if ((yezVar2.b & 4) != 0) {
                    TreeSet treeSet2 = ygjVar.c;
                    yez yezVar3 = (yez) treeSet2.floor(yezVar2);
                    if (yezVar3.d == yezVar2.d) {
                        treeSet2.remove(yezVar3);
                        if (ygjVar.e) {
                            zik.bA(ygjVar.d, ygj.b(yezVar3));
                        }
                    }
                }
                ygjVar.a(yezVar, str);
                return;
            }
        }
        ygjVar.a(yezVar, str);
    }

    public final synchronized void i(ygk ygkVar, yez yezVar, String str) {
        p(ygkVar);
        ((ygj) this.f.get(ygkVar)).a(yezVar, str);
    }

    public final void j() {
        yfx yfxVarE;
        synchronized (this) {
            yfxVarE = e();
        }
        n(yfxVarE);
    }

    final synchronized void k(ygk ygkVar, yez yezVar) {
        this.e.set(this.h.f().toEpochMilli());
        q(yezVar);
        p(ygkVar);
        ygj ygjVar = (ygj) this.f.get(ygkVar);
        TreeSet treeSet = ygjVar.b;
        yez yezVar2 = (yez) treeSet.floor(yezVar);
        if (yezVar2 != null && yezVar2.f == yezVar.f && yezVar2.g == yezVar.g) {
            treeSet.remove(yezVar2);
            ygjVar.a -= yezVar2.g;
            if ((yezVar2.b & 4) != 0) {
                TreeSet treeSet2 = ygjVar.c;
                yez yezVar3 = (yez) treeSet2.floor(yezVar2);
                if (yezVar3 != null) {
                    if (yezVar3.d == yezVar2.d) {
                        treeSet2.remove(yezVar);
                    }
                    if (ygjVar.e) {
                        zik.bA(ygjVar.d, ygj.b(yezVar));
                    }
                }
            }
        }
    }

    final synchronized void l(FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata) {
        FormatIdOuterClass$FormatId defaultInstance = formatInitializationMetadataOuterClass$FormatInitializationMetadata.d;
        if (defaultInstance == null) {
            defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
        }
        m(ygk.a(defaultInstance), formatInitializationMetadataOuterClass$FormatInitializationMetadata);
    }

    public final synchronized void m(ygk ygkVar, FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata) {
        if (!formatInitializationMetadataOuterClass$FormatInitializationMetadata.c.isEmpty()) {
            p(ygkVar);
            ygj ygjVar = (ygj) this.f.get(ygkVar);
            if (ygjVar != null) {
                ygjVar.g = formatInitializationMetadataOuterClass$FormatInitializationMetadata;
            }
        }
    }

    public final void n(yfx yfxVar) {
        this.j.g(yfxVar);
    }
}

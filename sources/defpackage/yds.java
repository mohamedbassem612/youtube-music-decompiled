package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yds {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/user/MdxProfileStorage");
    public final awmd b;
    public final mbc c;
    public final int[] d;
    public final int[] e;
    public long f;
    public final Map g = new HashMap();
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final Map i = new HashMap();
    public final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
    public final ConcurrentSkipListSet k = new ConcurrentSkipListSet(new asx(5));

    public yds(awmd awmdVar, mbc mbcVar) {
        int[] iArr = new int[28];
        this.d = iArr;
        int[] iArr2 = new int[28];
        this.e = iArr2;
        this.b = awmdVar;
        this.c = mbcVar;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f = 0L;
    }

    public static void e(String str, int[] iArr) {
        List listH = agfm.d(",").h(str);
        if (listH.size() != 28) {
            agrx agrxVar = agso.a;
            listH.size();
        }
        for (int i = 0; i < Math.min(listH.size(), 28); i++) {
            if (!TextUtils.isEmpty((CharSequence) listH.get(i))) {
                iArr[i] = Integer.parseInt((String) listH.get(i));
            }
        }
    }

    public static void i(List list, int[] iArr) {
        if (list.size() != 28) {
            agrx agrxVar = agso.a;
            list.size();
        }
        for (int i = 0; i < Math.min(list.size(), 28); i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
    }

    public final long a() {
        return ((atpi) ((tpq) this.b.io()).c()).c;
    }

    public final agke b() {
        return (agke) Collection.EL.stream(this.k).limit(100L).collect(aghu.a);
    }

    public final ListenableFuture c(Optional optional, final int[] iArr, final int[] iArr2, final int i, final Optional optional2) {
        if (this.f != 0) {
            System.arraycopy(iArr, 0, this.d, 0, 28);
            System.arraycopy(iArr2, 0, this.e, 0, 28);
        }
        if (optional.isPresent()) {
            String str = (String) optional.get();
            this.h.readLock().lock();
            try {
                Map map = this.g;
                long j = map.containsKey(str) ? ((atpf) map.get(str)).d : 0L;
                ReentrantReadWriteLock reentrantReadWriteLock = this.h;
                reentrantReadWriteLock.readLock().unlock();
                aihf aihfVarCreateBuilder = atpf.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                atpf atpfVar = (atpf) aihfVarCreateBuilder.instance;
                atpfVar.b |= 1;
                atpfVar.c = str;
                long epochMilli = this.c.f().toEpochMilli();
                aihfVarCreateBuilder.copyOnWrite();
                atpf atpfVar2 = (atpf) aihfVarCreateBuilder.instance;
                atpfVar2.b |= 4;
                atpfVar2.e = epochMilli;
                aihfVarCreateBuilder.copyOnWrite();
                atpf atpfVar3 = (atpf) aihfVarCreateBuilder.instance;
                atpfVar3.b |= 2;
                atpfVar3.d = j + 1;
                atpf atpfVar4 = (atpf) aihfVarCreateBuilder.build();
                reentrantReadWriteLock.writeLock().lock();
                try {
                    this.g.put(str, atpfVar4);
                    this.h.writeLock().unlock();
                    k(str);
                } catch (Throwable th) {
                    this.h.writeLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                this.h.readLock().unlock();
                throw th2;
            }
        }
        ListenableFuture listenableFutureB = ((tpq) this.b.io()).b(new agek() { // from class: ydp
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                aihf builder = ((atpi) obj).toBuilder();
                Optional optional3 = optional2;
                if (optional3.isPresent()) {
                    long jLongValue = ((Long) optional3.get()).longValue();
                    builder.copyOnWrite();
                    atpi atpiVar = (atpi) builder.instance;
                    atpiVar.b |= 2;
                    atpiVar.d = jLongValue;
                }
                int i2 = i;
                yds ydsVar = this.a;
                if (i2 == 2) {
                    long epochMilli2 = ydsVar.c.f().toEpochMilli();
                    builder.copyOnWrite();
                    atpi atpiVar2 = (atpi) builder.instance;
                    atpiVar2.b |= 1;
                    atpiVar2.c = epochMilli2;
                }
                ydsVar.h.readLock().lock();
                try {
                    Map map2 = ydsVar.g;
                    if (!map2.isEmpty()) {
                        builder.copyOnWrite();
                        ((atpi) builder.instance).h = atpi.emptyProtobufList();
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(map2.values());
                        Collections.sort(arrayList, Comparator$EL.reversed(Comparator$CC.comparingLong(new cpt(12))));
                        List listSubList = arrayList.subList(0, Math.min(100, arrayList.size()));
                        builder.copyOnWrite();
                        atpi atpiVar3 = (atpi) builder.instance;
                        aiie aiieVar = atpiVar3.h;
                        if (!aiieVar.c()) {
                            atpiVar3.h = aihn.mutableCopy(aiieVar);
                        }
                        aifs.addAll(listSubList, atpiVar3.h);
                    }
                    ydsVar.h.readLock().unlock();
                    ydsVar.j.readLock().lock();
                    try {
                        if (!ydsVar.i.isEmpty()) {
                            builder.copyOnWrite();
                            ((atpi) builder.instance).i = atpi.emptyProtobufList();
                            List listM = ydsVar.m();
                            builder.copyOnWrite();
                            atpi atpiVar4 = (atpi) builder.instance;
                            aiie aiieVar2 = atpiVar4.i;
                            if (!aiieVar2.c()) {
                                atpiVar4.i = aihn.mutableCopy(aiieVar2);
                            }
                            aifs.addAll(listM, atpiVar4.i);
                        }
                        ydsVar.j.readLock().unlock();
                        if (((atpi) builder.instance).j.size() > 0) {
                            ydsVar.g(DesugarCollections.unmodifiableList(((atpi) builder.instance).j));
                        }
                        builder.copyOnWrite();
                        ((atpi) builder.instance).j = atpi.emptyProtobufList();
                        agke agkeVarB = ydsVar.b();
                        builder.copyOnWrite();
                        atpi atpiVar5 = (atpi) builder.instance;
                        aiie aiieVar3 = atpiVar5.j;
                        if (!aiieVar3.c()) {
                            atpiVar5.j = aihn.mutableCopy(aiieVar3);
                        }
                        aifs.addAll(agkeVarB, atpiVar5.j);
                        long j2 = ydsVar.f;
                        if (j2 != 0) {
                            int[] iArr3 = iArr2;
                            int[] iArr4 = iArr;
                            builder.copyOnWrite();
                            atpi atpiVar6 = (atpi) builder.instance;
                            atpiVar6.b |= 4;
                            atpiVar6.g = j2;
                            builder.copyOnWrite();
                            ((atpi) builder.instance).e = atpi.emptyIntList();
                            builder.cK(ahng.Q(iArr4));
                            builder.copyOnWrite();
                            ((atpi) builder.instance).f = atpi.emptyIntList();
                            builder.cJ(ahng.Q(iArr3));
                        }
                        return (atpi) builder.build();
                    } catch (Throwable th3) {
                        ydsVar.j.readLock().unlock();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    ydsVar.h.readLock().unlock();
                    throw th4;
                }
            }
        });
        ahno.at(listenableFutureB, new ydr(), MoreExecutors.directExecutor());
        return listenableFutureB;
    }

    final Map d() {
        j();
        HashMap map = new HashMap();
        long epochMilli = this.c.f().toEpochMilli() - 5184000000L;
        new HashSet();
        this.h.readLock().lock();
        try {
            Set<String> setKeySet = this.g.keySet();
            ReentrantReadWriteLock reentrantReadWriteLock = this.h;
            reentrantReadWriteLock.readLock().unlock();
            for (String str : setKeySet) {
                reentrantReadWriteLock.readLock().lock();
                try {
                    atpf atpfVar = (atpf) this.g.get(str);
                    reentrantReadWriteLock.readLock().unlock();
                    if (atpfVar != null && (atpfVar.b & 1) != 0 && atpfVar.d >= 1 && atpfVar.e > epochMilli) {
                        map.put(str, atpfVar);
                    }
                } catch (Throwable th) {
                    this.h.readLock().unlock();
                    throw th;
                }
            }
            return map;
        } catch (Throwable th2) {
            this.h.readLock().unlock();
            throw th2;
        }
    }

    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atpf atpfVar = (atpf) it.next();
            ReentrantReadWriteLock reentrantReadWriteLock = this.h;
            reentrantReadWriteLock.writeLock().lock();
            try {
                String str = atpfVar.c;
                aihf aihfVarCreateBuilder = atpf.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                atpf atpfVar2 = (atpf) aihfVarCreateBuilder.instance;
                str.getClass();
                atpfVar2.b |= 1;
                atpfVar2.c = str;
                Map map = this.g;
                if (map.containsKey(str)) {
                    atpf atpfVar3 = (atpf) map.get(str);
                    long jMax = Math.max(atpfVar3.e, atpfVar.e);
                    long jMax2 = Math.max(atpfVar3.d, atpfVar.d);
                    aihfVarCreateBuilder.copyOnWrite();
                    atpf atpfVar4 = (atpf) aihfVarCreateBuilder.instance;
                    atpfVar4.b |= 4;
                    atpfVar4.e = jMax;
                    aihfVarCreateBuilder.copyOnWrite();
                    atpf atpfVar5 = (atpf) aihfVarCreateBuilder.instance;
                    atpfVar5.b |= 2;
                    atpfVar5.d = jMax2;
                } else {
                    long j = atpfVar.d;
                    aihfVarCreateBuilder.copyOnWrite();
                    atpf atpfVar6 = (atpf) aihfVarCreateBuilder.instance;
                    atpfVar6.b |= 2;
                    atpfVar6.d = j;
                    long j2 = atpfVar.e;
                    aihfVarCreateBuilder.copyOnWrite();
                    atpf atpfVar7 = (atpf) aihfVarCreateBuilder.instance;
                    atpfVar7.b |= 4;
                    atpfVar7.e = j2;
                }
                map.put(str, (atpf) aihfVarCreateBuilder.build());
                k(str);
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                this.h.writeLock().unlock();
                throw th;
            }
        }
    }

    public final void g(List list) {
        this.k.addAll(list);
    }

    public final void j() {
        this.h.readLock().lock();
        try {
            boolean zIsEmpty = this.g.isEmpty();
            this.h.readLock().unlock();
            if (zIsEmpty) {
                atpi atpiVar = (atpi) ((tpq) this.b.io()).c();
                if (atpiVar.h.size() > 0) {
                    f(atpiVar.h);
                }
            }
        } catch (Throwable th) {
            this.h.readLock().unlock();
            throw th;
        }
    }

    public final void k(String str) {
        atpf atpfVar;
        this.h.readLock().lock();
        try {
            atpf atpfVar2 = (atpf) this.g.get(str);
            ReentrantReadWriteLock reentrantReadWriteLock = this.h;
            reentrantReadWriteLock.readLock().unlock();
            if (atpfVar2 != null) {
                HashSet hashSet = new HashSet();
                reentrantReadWriteLock.readLock().lock();
                try {
                    Map map = this.g;
                    for (String str2 : map.keySet()) {
                        if (!str.isEmpty() && !str2.isEmpty() && str.length() < str2.length() && str2.endsWith(str) && (atpfVar = (atpf) map.get(str2)) != null) {
                            aihf builder = atpfVar2.toBuilder();
                            long j = atpfVar2.d + atpfVar.d;
                            builder.copyOnWrite();
                            atpf atpfVar3 = (atpf) builder.instance;
                            atpfVar3.b |= 2;
                            atpfVar3.d = j;
                            long jMax = Math.max(atpfVar2.e, atpfVar.e);
                            builder.copyOnWrite();
                            atpf atpfVar4 = (atpf) builder.instance;
                            atpfVar4.b |= 4;
                            atpfVar4.e = jMax;
                            atpfVar2 = (atpf) builder.build();
                            hashSet.add(str2);
                        }
                    }
                    ReentrantReadWriteLock reentrantReadWriteLock2 = this.h;
                    reentrantReadWriteLock2.readLock().unlock();
                    reentrantReadWriteLock2.writeLock().lock();
                    try {
                        Map map2 = this.g;
                        map2.keySet().removeAll(hashSet);
                        map2.put(str, atpfVar2);
                    } finally {
                        this.h.writeLock().unlock();
                    }
                } catch (Throwable th) {
                    this.h.readLock().unlock();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            this.h.readLock().unlock();
            throw th2;
        }
    }

    public final boolean l() {
        long epochMilli = this.c.f().toEpochMilli();
        long j = this.f;
        long j2 = epochMilli - j;
        if (j2 < 86400000) {
            return false;
        }
        int i = (int) (j2 / 86400000);
        this.f = j + (((long) i) * 86400000);
        int iMin = Math.min(i, 28);
        int i2 = 27;
        while (true) {
            int[] iArr = this.d;
            if (i2 < iMin) {
                Arrays.fill(iArr, 0, iMin, 0);
                Arrays.fill(this.e, 0, iMin, 0);
                return true;
            }
            int i3 = i2 - iMin;
            iArr[i2] = iArr[i3];
            int[] iArr2 = this.e;
            iArr2[i2] = iArr2[i3];
            i2--;
        }
    }

    public final List m() {
        new ArrayList();
        this.j.readLock().lock();
        try {
            return (List) Collection.EL.stream(this.i.values()).sorted(Comparator$EL.reversed(Comparator$CC.comparingLong(new ygh(1)))).limit(100L).collect(Collectors.toCollection(new idl(8)));
        } finally {
            this.j.readLock().unlock();
        }
    }
}

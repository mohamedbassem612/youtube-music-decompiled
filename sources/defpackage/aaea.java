package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaea implements aafu {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/client/EntitiesBasedStreamStore");
    public final wcn b;
    private final Executor c;

    public aaea(wcn wcnVar, Executor executor) {
        this.b = wcnVar;
        this.c = executor;
    }

    public static String h(String str) {
        return wfs.g(198, str);
    }

    private final ListenableFuture i(String str) {
        return tzk.e(this.b.g(h(str)).g(aohq.class));
    }

    private static String j(String str) {
        return wfs.g(120, str);
    }

    @Override // defpackage.aafu
    public final void a(String str, aamm aammVar) throws IOException {
        try {
            wcn wcnVar = this.b;
            Optional optional = (Optional) tzk.e(wcnVar.g(j(str)).g(aqph.class)).get();
            if (optional.isEmpty()) {
                return;
            }
            String strH = h(aammVar.f());
            if (((aqph) optional.get()).i().contains(strH)) {
                return;
            }
            wer werVarE = wcnVar.e();
            aqpf aqpfVarD = ((aqph) optional.get()).d();
            aqpfVarD.ao(strH);
            werVarE.m(aqpfVarD);
            werVarE.b().G();
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("Couldn't link entities", e);
        }
    }

    @Override // defpackage.aafu
    public final void b(Set set, String str, boolean z) {
        wcn wcnVar = this.b;
        aqph aqphVar = (aqph) wcnVar.g(j(str)).g(aqph.class).E();
        if (aqphVar != null) {
            ArrayList<String> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String strH = wfs.h(aqphVar.b());
            HashSet hashSet = new HashSet();
            for (String str2 : aqphVar.i()) {
                String strH2 = wfs.h(str2);
                if (!strH2.equals(strH)) {
                    if (set.contains(strH2)) {
                        hashSet.add(strH2);
                    } else {
                        arrayList.add(str2);
                    }
                }
            }
            arrayList2.addAll((Collection) j$.util.Collection.EL.stream(set).filter(new xdo(hashSet, 19)).map(new aaeq(1)).collect(Collectors.toSet()));
            aqpf aqpfVarD = aqphVar.d();
            LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList((String[]) arrayList.toArray(new String[arrayList.size()])));
            aihh aihhVar = aqpfVarD.a;
            List<String> listUnmodifiableList = DesugarCollections.unmodifiableList(((aqpi) aihhVar.instance).i);
            aihhVar.copyOnWrite();
            ((aqpi) aihhVar.instance).i = aqpi.emptyProtobufList();
            for (String str3 : listUnmodifiableList) {
                if (!linkedHashSet.contains(str3)) {
                    aihhVar.s(str3);
                }
            }
            aihhVar.copyOnWrite();
            aqpi aqpiVar = (aqpi) aihhVar.instance;
            aqpiVar.d();
            aifs.addAll(arrayList2, aqpiVar.i);
            wer werVarE = wcnVar.e();
            werVarE.e(aqpfVarD.I(wcnVar));
            String strB = aqphVar.b();
            ArrayList arrayList3 = new ArrayList();
            for (String str4 : arrayList) {
                if (((Set) j$.util.Collection.EL.stream((agkz) wcnVar.a(str4).E()).filter(new xdo(strB, 18)).collect(Collectors.toSet())).isEmpty()) {
                    arrayList3.add(str4);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                werVarE.a((String) it.next());
            }
            werVarE.b().G();
        }
    }

    @Override // defpackage.aafu
    public final boolean c(String str, int i) {
        try {
            return ((Boolean) ahcs.e(i(str), new gvw(this, i, 3), this.c).get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }

    @Override // defpackage.aafu
    public final boolean d(aaml aamlVar) {
        try {
            return ((Boolean) ahcs.e(i(aamlVar.g()), new aaat(this, aamlVar, 4, null), this.c).get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }

    @Override // defpackage.aafu
    public final boolean e(String str, int i, long j, boolean z) {
        try {
            return ((Boolean) ahcs.e(i(str), new aadz(this, i, j, 0), this.c).get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }

    @Override // defpackage.aafu
    public final boolean f(String str, int i, String str2) {
        return false;
    }

    @Override // defpackage.aafu
    public final aamm g(String str, axmq axmqVar) {
        try {
            return (aamm) ((Optional) ahcs.e(i(str), new aagw(str, 1), this.c).get()).orElse(null);
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}

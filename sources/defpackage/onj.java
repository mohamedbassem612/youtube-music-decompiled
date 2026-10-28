package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class onj implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ onj(Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.b;
            onp onpVar = (onp) obj;
            return ooi.d(onpVar.a.c()).f(new hsx(obj, this.a, 6), onpVar.f);
        }
        if (i != 1) {
            return ((afkb) this.b).b(this.a);
        }
        final syn synVar = (syn) this.b;
        ?? r1 = synVar.b;
        final int i2 = this.a;
        return ahno.as(r1.c(), new ahcy() { // from class: omz
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
            /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.concurrent.Executor] */
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj2) {
                ListenableFuture listenableFutureAr;
                ArrayList arrayList = new ArrayList();
                for (omh omhVar : (List) obj2) {
                    oiw oiwVar = omhVar.a;
                    oip oipVar = omhVar.b;
                    aihf aihfVarCreateBuilder = ahai.a.createBuilder();
                    String str = oiwVar.c;
                    aihfVarCreateBuilder.copyOnWrite();
                    ahai ahaiVar = (ahai) aihfVarCreateBuilder.instance;
                    str.getClass();
                    ahaiVar.b |= 1;
                    ahaiVar.c = str;
                    String str2 = oiwVar.d;
                    aihfVarCreateBuilder.copyOnWrite();
                    ahai ahaiVar2 = (ahai) aihfVarCreateBuilder.instance;
                    str2.getClass();
                    ahaiVar2.b |= 4;
                    ahaiVar2.e = str2;
                    int i3 = oipVar.f;
                    aihfVarCreateBuilder.copyOnWrite();
                    ahai ahaiVar3 = (ahai) aihfVarCreateBuilder.instance;
                    ahaiVar3.b |= 2;
                    ahaiVar3.d = i3;
                    int size = oipVar.o.size();
                    aihfVarCreateBuilder.copyOnWrite();
                    ahai ahaiVar4 = (ahai) aihfVarCreateBuilder.instance;
                    ahaiVar4.b |= 8;
                    ahaiVar4.f = size;
                    Iterator it = oipVar.o.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        if (nsp.h((oin) it.next())) {
                            i4++;
                        }
                    }
                    int i5 = i2;
                    aihfVarCreateBuilder.copyOnWrite();
                    ahai ahaiVar5 = (ahai) aihfVarCreateBuilder.instance;
                    ahaiVar5.b |= 16;
                    ahaiVar5.g = i4;
                    boolean z = !oiwVar.e.isEmpty();
                    aihfVarCreateBuilder.copyOnWrite();
                    ahai ahaiVar6 = (ahai) aihfVarCreateBuilder.instance;
                    ahaiVar6.b |= 32;
                    ahaiVar6.h = z;
                    long j = oipVar.s;
                    aihfVarCreateBuilder.copyOnWrite();
                    ahai ahaiVar7 = (ahai) aihfVarCreateBuilder.instance;
                    ahaiVar7.b |= 64;
                    ahaiVar7.i = j;
                    String str3 = oipVar.t;
                    aihfVarCreateBuilder.copyOnWrite();
                    ahai ahaiVar8 = (ahai) aihfVarCreateBuilder.instance;
                    str3.getClass();
                    ahaiVar8.b |= SemanticState.Focused;
                    ahaiVar8.j = str3;
                    ahai ahaiVar9 = (ahai) aihfVarCreateBuilder.build();
                    aihf aihfVarCreateBuilder2 = ahap.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahap ahapVar = (ahap) aihfVarCreateBuilder2.instance;
                    ahapVar.b |= 8;
                    ahapVar.f = i5;
                    oio oioVar = oipVar.c;
                    if (oioVar == null) {
                        oioVar = oio.a;
                    }
                    if ((oioVar.b & 2) != 0) {
                        oio oioVar2 = oipVar.c;
                        if (oioVar2 == null) {
                            oioVar2 = oio.a;
                        }
                        long j2 = oioVar2.d / 1000;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahap ahapVar2 = (ahap) aihfVarCreateBuilder2.instance;
                        ahapVar2.b |= 2;
                        ahapVar2.d = j2;
                    } else {
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahap ahapVar3 = (ahap) aihfVarCreateBuilder2.instance;
                        ahapVar3.b |= 2;
                        ahapVar3.d = -1L;
                    }
                    syn synVar2 = synVar;
                    if (oiwVar.f) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahap ahapVar4 = (ahap) aihfVarCreateBuilder2.instance;
                        ahapVar4.c = 1;
                        ahapVar4.b |= 1;
                        oio oioVar3 = oipVar.c;
                        if (((oioVar3 == null ? oio.a : oioVar3).b & 4) != 0) {
                            if (oioVar3 == null) {
                                oioVar3 = oio.a;
                            }
                            long j3 = oioVar3.e / 1000;
                            aihfVarCreateBuilder2.copyOnWrite();
                            ahap ahapVar5 = (ahap) aihfVarCreateBuilder2.instance;
                            ahapVar5.b |= 4;
                            ahapVar5.e = j3;
                        } else {
                            aihfVarCreateBuilder2.copyOnWrite();
                            ahap ahapVar6 = (ahap) aihfVarCreateBuilder2.instance;
                            ahapVar6.b |= 4;
                            ahapVar6.e = -1L;
                        }
                        listenableFutureAr = ahng.n((ahap) aihfVarCreateBuilder2.build());
                    } else {
                        aihfVarCreateBuilder2.copyOnWrite();
                        ahap ahapVar7 = (ahap) aihfVarCreateBuilder2.instance;
                        ahapVar7.b |= 4;
                        ahapVar7.e = -1L;
                        listenableFutureAr = ahno.ar(((xgg) synVar2.d).j(oipVar), new olj(aihfVarCreateBuilder2, 20), synVar2.a);
                    }
                    arrayList.add(ahno.ar(listenableFutureAr, new olj(ahaiVar9, 19), synVar2.a));
                }
                return ahng.k(arrayList);
            }
        }, synVar.a);
    }
}

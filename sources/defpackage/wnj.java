package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wnj implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wnj(omn omnVar, List list, Set set, int i) {
        this.$cid = i;
        this.c = omnVar;
        this.b = list;
        this.a = set;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, wni] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        if (this.$cid == 0) {
            MessageLite messageLite = (MessageLite) obj;
            wnl wnlVar = (wnl) this.a;
            wnlVar.l(messageLite);
            Object objH = wnlVar.h(messageLite);
            this.b.b(objH);
            wnlVar.m((wlu) this.c, objH);
            return objH;
        }
        ?? r0 = this.b;
        r0.addAll((List) obj);
        Iterator it = r0.iterator();
        while (true) {
            ?? r1 = this.a;
            if (!it.hasNext()) {
                return r1;
            }
            oip oipVar = (oip) it.next();
            for (oin oinVar : oipVar.o) {
                Object obj2 = this.c;
                int iAS = a.aS(oipVar.j);
                if (iAS == 0) {
                    iAS = 1;
                }
                omn omnVar = (omn) obj2;
                Object obj3 = omnVar.g;
                Object obj4 = omnVar.c;
                aihf aihfVarCreateBuilder = oiz.a.createBuilder();
                String strE = nsp.e(oinVar);
                int iOrdinal = qnl.bT((Context) obj3, (qnl) obj4).ordinal();
                if (iOrdinal == 0) {
                    String str = oinVar.d;
                    aihfVarCreateBuilder.copyOnWrite();
                    oiz oizVar = (oiz) aihfVarCreateBuilder.instance;
                    str.getClass();
                    oizVar.b |= 1;
                    oizVar.c = str;
                    long j = oinVar.e;
                    aihfVarCreateBuilder.copyOnWrite();
                    oiz oizVar2 = (oiz) aihfVarCreateBuilder.instance;
                    oizVar2.b |= 2;
                    oizVar2.d = j;
                    aihfVarCreateBuilder.copyOnWrite();
                    oiz oizVar3 = (oiz) aihfVarCreateBuilder.instance;
                    strE.getClass();
                    oizVar3.b |= 4;
                    oizVar3.e = strE;
                    aihfVarCreateBuilder.copyOnWrite();
                    oiz oizVar4 = (oiz) aihfVarCreateBuilder.instance;
                    oizVar4.f = iAS - 1;
                    oizVar4.b |= 8;
                } else if (iOrdinal == 1) {
                    String str2 = oinVar.d;
                    aihfVarCreateBuilder.copyOnWrite();
                    oiz oizVar5 = (oiz) aihfVarCreateBuilder.instance;
                    str2.getClass();
                    oizVar5.b |= 1;
                    oizVar5.c = str2;
                    long j2 = oinVar.e;
                    aihfVarCreateBuilder.copyOnWrite();
                    oiz oizVar6 = (oiz) aihfVarCreateBuilder.instance;
                    oizVar6.b |= 2;
                    oizVar6.d = j2;
                    aihfVarCreateBuilder.copyOnWrite();
                    oiz oizVar7 = (oiz) aihfVarCreateBuilder.instance;
                    strE.getClass();
                    oizVar7.b |= 4;
                    oizVar7.e = strE;
                    aihfVarCreateBuilder.copyOnWrite();
                    oiz oizVar8 = (oiz) aihfVarCreateBuilder.instance;
                    oizVar8.f = iAS - 1;
                    oizVar8.b |= 8;
                    if ((oinVar.b & 32) != 0) {
                        atyn atynVar = oinVar.h;
                        if (atynVar == null) {
                            atynVar = atyn.a;
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        oiz oizVar9 = (oiz) aihfVarCreateBuilder.instance;
                        atynVar.getClass();
                        oizVar9.g = atynVar;
                        oizVar9.b |= 16;
                    }
                } else if (iOrdinal == 2) {
                    aihfVarCreateBuilder.copyOnWrite();
                    oiz oizVar10 = (oiz) aihfVarCreateBuilder.instance;
                    strE.getClass();
                    oizVar10.b |= 4;
                    oizVar10.e = strE;
                    aihfVarCreateBuilder.copyOnWrite();
                    oiz oizVar11 = (oiz) aihfVarCreateBuilder.instance;
                    oizVar11.f = iAS - 1;
                    oizVar11.b |= 8;
                }
                r1.add((oiz) aihfVarCreateBuilder.build());
            }
        }
    }

    public /* synthetic */ wnj(wnl wnlVar, wni wniVar, wlu wluVar, int i) {
        this.$cid = i;
        this.a = wnlVar;
        this.b = wniVar;
        this.c = wluVar;
    }
}

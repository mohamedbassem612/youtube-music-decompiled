package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xrb implements xrc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xrb(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, xrc] */
    @Override // defpackage.xrc
    public final void a() {
        int iH;
        ArrayList arrayList;
        if (this.$cid != 0) {
            ((xqe) this.a).b((dii) this.b);
            return;
        }
        jnm jnmVar = (jnm) ((xrd) this.a).a.get();
        Object obj = jnmVar.a;
        agke agkeVar = agpi.a;
        if (((vxz) obj).l(29, 45667717L, false)) {
            abjw abjwVarN = ((abjp) jnmVar.d.io()).c.N();
            agke agkeVar2 = abjwVarN.a;
            agkeVar2.size();
            arrayList = new ArrayList(agkeVar2);
            iH = jnmVar.h(arrayList, agkeVar, abjwVarN.b, false);
        } else {
            ?? r1 = jnmVar.d;
            tbk tbkVarD = ((abjp) r1.io()).d(0);
            ArrayList arrayList2 = new ArrayList(tbkVarD.subList(0, tbkVarD.size()));
            iH = jnmVar.h(arrayList2, agkeVar, ((abjp) r1.io()).a(), false);
            arrayList = arrayList2;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ?? r0 = jnmVar.d;
        if (zIsEmpty) {
            ((abjp) r0.io()).r();
        } else {
            ((abjp) r0.io()).u(arrayList, agkeVar, iH, new xxw());
        }
        ?? r7 = this.b;
        arrayList.size();
        r7.a();
    }
}

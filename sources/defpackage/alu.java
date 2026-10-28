package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alu {
    public static final aga a;

    static {
        float[] fArr = alq.a;
        amb ambVar = alq.e;
        int i = ambVar.c;
        alr alrVar = new alr(ambVar);
        amb ambVar2 = alq.e;
        int i2 = ambVar2.c;
        alo aloVar = alq.k;
        int i3 = i2 | (aloVar.c << 6);
        alt altVar = new alt(ambVar2, aloVar);
        alo aloVar2 = alq.k;
        int i4 = aloVar2.c;
        amb ambVar3 = alq.e;
        int i5 = i4 | (ambVar3.c << 6);
        alt altVar2 = new alt(aloVar2, ambVar3);
        int i6 = agb.a;
        aga agaVar = new aga(6);
        agaVar.h(i | (i << 6), alrVar);
        agaVar.h(i3, altVar);
        agaVar.h(i5, altVar2);
        a = agaVar;
    }
}

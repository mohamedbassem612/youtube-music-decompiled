package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adi {
    public static final adi a = new adi(new adh());
    public static final adi b;
    public static final adi c;
    public static final adi d;
    public static final adi e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final adf k;

    static {
        adh adhVar = new adh();
        adhVar.d = 0;
        adhVar.e = false;
        adhVar.c = 1;
        adhVar.a = true;
        adhVar.b = false;
        b = new adi(adhVar);
        adh adhVar2 = new adh();
        adhVar2.d = 2;
        adhVar2.e = true;
        adhVar2.c = 2;
        adhVar2.b = true;
        adhVar2.a = false;
        c = new adi(adhVar2);
        adh adhVar3 = new adh();
        adhVar3.d = 0;
        adhVar3.e = true;
        adhVar3.c = 2;
        adhVar3.b = true;
        adhVar3.a = true;
        adi adiVar = new adi(adhVar3);
        d = adiVar;
        adh adhVar4 = new adh(adiVar);
        adhVar4.b = true;
        e = new adi(adhVar4);
    }

    public adi(adh adhVar) {
        this.j = adhVar.a;
        this.f = adhVar.c;
        this.g = adhVar.d;
        this.i = adhVar.b;
        this.h = adhVar.e;
        this.k = adhVar.f;
    }
}

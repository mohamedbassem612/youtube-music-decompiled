package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aihk implements Comparable {
    final aihs a;
    public final int b;
    public final aika c;
    public final boolean d;
    public final boolean e;

    public aihk(aihs aihsVar, int i, aika aikaVar, boolean z, boolean z2) {
        this.a = aihsVar;
        this.b = i;
        this.c = aikaVar;
        this.d = z;
        this.e = z2;
    }

    public static final void b(Object obj, Object obj2) {
        ((aihf) obj).mergeFrom((aihn) obj2);
    }

    public final aikb a() {
        return this.c.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((aihk) obj).b;
    }
}
